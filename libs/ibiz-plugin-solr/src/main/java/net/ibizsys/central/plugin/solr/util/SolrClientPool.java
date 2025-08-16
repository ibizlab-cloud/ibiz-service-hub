package net.ibizsys.central.plugin.solr.util;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class SolrClientPool extends GenericObjectPool<HttpSolrClient>{

	public SolrClientPool(PooledObjectFactory<HttpSolrClient> factory) {
		super(factory);
	}

	public SolrClientPool(PooledObjectFactory<HttpSolrClient> factory, GenericObjectPoolConfig<HttpSolrClient> config, AbandonedConfig abandonedConfig) {
		super(factory, config, abandonedConfig);
	}

	public SolrClientPool(PooledObjectFactory<HttpSolrClient> factory, GenericObjectPoolConfig<HttpSolrClient> config) {
		super(factory, config);
	}
	
	

}
