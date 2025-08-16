package net.ibizsys.central.plugin.es.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import net.ibizsys.central.plugin.es.ba.IESBDSchemeRuntimeBase;

public class ESClientFactory implements PooledObjectFactory<RestHighLevelClient> {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ESClientFactory.class);
	
	private IESBDSchemeRuntimeBase iESBDSchemeRuntimeBase = null;
	
	
	private Map<String, Object> params = new HashMap<String, Object>();
	
	public ESClientFactory(IESBDSchemeRuntimeBase iESBDSchemeRuntimeBase, Map<String, Object> params) throws Exception{
		this.iESBDSchemeRuntimeBase = iESBDSchemeRuntimeBase;
		if(params != null) {
			this.params.putAll(params);
		}
	}
	
	
	@Override
	public PooledObject<RestHighLevelClient> makeObject() throws Exception {
		
		String strServiceUrl = iESBDSchemeRuntimeBase.getServiceUrl();
		
		RestHighLevelClient restHighLevelClient = new RestHighLevelClient(  RestClient.builder(
				HttpHost.create(strServiceUrl)
        ));
		
		return new DefaultPooledObject<RestHighLevelClient>(restHighLevelClient);
	}

	@Override
	public void destroyObject(PooledObject<RestHighLevelClient> p) throws Exception {
		try {
			p.getObject().close();
		}
		catch (Exception ex) {
			log.error(ex);
		}
		
	}

	@Override
	public boolean validateObject(PooledObject<RestHighLevelClient> p) {
		return p.getObject() != null;
	}

	@Override
	public void activateObject(PooledObject<RestHighLevelClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passivateObject(PooledObject<RestHighLevelClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
