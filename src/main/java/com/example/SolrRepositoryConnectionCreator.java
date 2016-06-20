package com.example;





import com.example.SolrServiceInfo;
import com.example.SolrRepository;


import org.springframework.cloud.service.AbstractServiceConnectorCreator;
import org.springframework.cloud.service.ServiceConnectorConfig;

public class SolrRepositoryConnectionCreator extends AbstractServiceConnectorCreator<SolrRepository, SolrServiceInfo> {
    @Override
    public SolrRepository create(SolrServiceInfo serviceInfo, ServiceConnectorConfig serviceConnectorConfig) {
     return new SolrRepository(serviceInfo.getSolrEndpoint());
    }
}