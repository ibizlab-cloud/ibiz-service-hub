package net.ibizsys.central.plugin.es.util;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.elasticsearch.client.RestClient;

public class ESClientPool extends GenericObjectPool<RestClient>{

	public ESClientPool(PooledObjectFactory<RestClient> factory) {
		super(factory);
	}

	public ESClientPool(PooledObjectFactory<RestClient> factory, GenericObjectPoolConfig<RestClient> config, AbandonedConfig abandonedConfig) {
		super(factory, config, abandonedConfig);
	}

	public ESClientPool(PooledObjectFactory<RestClient> factory, GenericObjectPoolConfig<RestClient> config) {
		super(factory, config);
	}
	
	

}
