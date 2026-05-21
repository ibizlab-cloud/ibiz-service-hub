package net.ibizsys.central.plugin.es.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import net.ibizsys.central.plugin.es.ba.IESBDSchemeRuntimeBase;

public class ESClientFactory implements PooledObjectFactory<RestClient> {

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
	public PooledObject<RestClient> makeObject() throws Exception {
		
		String strServiceUrl = iESBDSchemeRuntimeBase.getServiceUrl();
		RestClient restClient = RestClient.builder(HttpHost.create(strServiceUrl)).build();
		return new DefaultPooledObject<RestClient>(restClient);
	}

	@Override
	public void destroyObject(PooledObject<RestClient> p) throws Exception {
		try {
			p.getObject().close();
		}
		catch (Exception ex) {
			log.error(ex);
		}
		
	}

	@Override
	public boolean validateObject(PooledObject<RestClient> p) {
		return p.getObject() != null;
	}

	@Override
	public void activateObject(PooledObject<RestClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passivateObject(PooledObject<RestClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
