package net.ibizsys.central.plugin.solr.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import net.ibizsys.central.ba.ISysBDSchemeRuntimeContext;
import net.ibizsys.runtime.util.DataTypeUtils;

public class SolrClientFactory implements PooledObjectFactory<HttpSolrClient> {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SolrClientFactory.class);
	public final static String PARAM_CONNECTIONTIMEOUT = "connectiontimeout";
	public final static String PARAM_SOCKETTIMEOUT = "socketimeout";
	
	private ISysBDSchemeRuntimeContext iSysBDSchemeRuntimeContext = null;
	
	private int nConnectionTimeout = 10000;
	private int nSocketTimeout = 60000;
	
	
	private Map<String, Object> params = new HashMap<String, Object>();
	
	public SolrClientFactory(ISysBDSchemeRuntimeContext iSysBDSchemeRuntimeContext, Map<String, Object> params ) throws Exception{
		this.iSysBDSchemeRuntimeContext = iSysBDSchemeRuntimeContext;
		if(params != null) {
			this.params.putAll(params);
		}
		this.nConnectionTimeout = DataTypeUtils.getIntegerValue(this.params.get(PARAM_CONNECTIONTIMEOUT), this.nConnectionTimeout);
		this.nSocketTimeout = DataTypeUtils.getIntegerValue(this.params.get(PARAM_SOCKETTIMEOUT), this.nSocketTimeout);
	}
	
	
	@Override
	public PooledObject<HttpSolrClient> makeObject() throws Exception {
		
		HttpSolrClient.Builder builder = new HttpSolrClient.Builder(iSysBDSchemeRuntimeContext.getSysBDSchemeRuntime().getServiceUrl())
				.withConnectionTimeout(this.nConnectionTimeout)
				.withSocketTimeout(this.nSocketTimeout);
		
		return new DefaultPooledObject<HttpSolrClient>(builder.build());
	}

	@Override
	public void destroyObject(PooledObject<HttpSolrClient> p) throws Exception {
		try {
			p.getObject().close();
		}
		catch (Exception ex) {
			log.error(ex);
		}
		
	}

	@Override
	public boolean validateObject(PooledObject<HttpSolrClient> p) {
		return p.getObject() != null;
	}

	@Override
	public void activateObject(PooledObject<HttpSolrClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passivateObject(PooledObject<HttpSolrClient> p) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
