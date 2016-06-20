package com.example;


	import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
	public class SolrServiceInfoCreator extends CloudFoundryServiceInfoCreator<SolrServiceInfo> {

	    public static final String MySolrID = "MySolrInstance";

	    public SolrServiceInfoCreator() {
	        super(new Tags(), MySolrID, "simple","shared");
	    }

	    @Override
	    public SolrServiceInfo createServiceInfo(Map<String, Object> serviceData) {
	        String id = (String) serviceData.get("name");
	        System.out.println("ID IS >>>" +id);

	        Map<String, Object> credentials = getCredentials(serviceData);
	        String uri = getUriFromCredentials(credentials);
	        System.out.println("Credentials are >>>" +credentials.toString());

	        return new SolrServiceInfo(id, uri);
	    }
	}