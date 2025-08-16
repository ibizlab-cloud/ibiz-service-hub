package net.ibizsys.central.plugin.es.util;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.elasticsearch.client.RestHighLevelClient;

public class ESClientPool extends GenericObjectPool<RestHighLevelClient>{

	public ESClientPool(PooledObjectFactory<RestHighLevelClient> factory) {
		super(factory);
	}

	public ESClientPool(PooledObjectFactory<RestHighLevelClient> factory, GenericObjectPoolConfig<RestHighLevelClient> config, AbandonedConfig abandonedConfig) {
		super(factory, config, abandonedConfig);
	}

	public ESClientPool(PooledObjectFactory<RestHighLevelClient> factory, GenericObjectPoolConfig<RestHighLevelClient> config) {
		super(factory, config);
	}
	
	

}
