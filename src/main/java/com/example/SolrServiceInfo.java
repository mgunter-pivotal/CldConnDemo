package com.example;

import org.springframework.cloud.service.BaseServiceInfo;


public class SolrServiceInfo extends BaseServiceInfo {
    public SolrServiceInfo(String id, String solrEndpoint) {
        super(id);
        this.SolrEndpoint = solrEndpoint;
    }
    
   private String SolrEndpoint;

   @ServiceProperty
public String getSolrEndpoint() {
	return SolrEndpoint;
}


}
