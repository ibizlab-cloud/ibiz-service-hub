package net.ibizsys.central.plugin.groovy.service;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.addin.ISystemRTAddin;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.service.SysRestServiceAPIRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.service.PSSysServiceAPIImpl;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.LogLevels;

public abstract class GroovySysRestServiceAPIRuntimeBase extends SysRestServiceAPIRuntimeBase implements ISystemRTAddin {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GroovySysRestServiceAPIRuntimeBase.class);
	
	private boolean bInstalled = false;
	
	private boolean bInitFromSystemRTAddin = false;
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, String strId, Object data) throws Exception {
		this.bInitFromSystemRTAddin = true;
		//设置运行时模型上下文
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		
		Map<String, Object> params = null;
		if(data instanceof Map) {
			params = (Map)data;
		}
		else {
			params = new HashMap<String, Object>();
		}
		
		IPSSysServiceAPI iPSSysServiceAPI = this.createPSSysServiceAPI(strId, params);
		this.init(iSystemRuntimeContext, iPSSysServiceAPI);
	}
	
	protected final boolean isInitFromSystemRTAddin() {
		return this.bInitFromSystemRTAddin;
	}
	
	protected IPSSysServiceAPI createPSSysServiceAPI(String strId, Map<String, Object> params) throws Exception {
		ObjectNode psSysServiceAPINode = JsonUtils.createObjectNode();
		psSysServiceAPINode.put(PSSysServiceAPIImpl.ATTR_GETID, strId);
		ISysServiceAPIRuntime defaultSysServiceAPIRuntime = this.getSystemRuntime().getDefaultSysServiceAPIRuntime(true);
		String strName = null;
		String strCodeName = null;
		String strServiceCodeName = null;
		if(defaultSysServiceAPIRuntime != null) {
			strName = DataTypeUtils.asString(params.get("name"), defaultSysServiceAPIRuntime.getName());
			strCodeName  = DataTypeUtils.asString(params.get("codename"), defaultSysServiceAPIRuntime.getPSSysServiceAPI().getCodeName());
			strServiceCodeName  = DataTypeUtils.asString(params.get("servicecodename"), defaultSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName());
		}
		else {
			strName = DataTypeUtils.asString(params.get("name"), "扩展服务接口");
			strCodeName  = DataTypeUtils.asString(params.get("codename"), "serviceapi");
			strServiceCodeName  = DataTypeUtils.asString(params.get("servicecodename"), "serviceapi");
		}

		
		psSysServiceAPINode.put(PSSysServiceAPIImpl.ATTR_GETNAME, strName);
		psSysServiceAPINode.put(PSSysServiceAPIImpl.ATTR_GETCODENAME, strCodeName);
		psSysServiceAPINode.put(PSSysServiceAPIImpl.ATTR_GETSERVICECODENAME, strServiceCodeName);
		
		
		this.fillPSSysServiceAPINode(psSysServiceAPINode, strId, params);
		
		return this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(IPSSysServiceAPI.class, psSysServiceAPINode);
	}
	
	protected void fillPSSysServiceAPINode(ObjectNode psSysServiceAPINode, String strId, Map<String, Object> params) throws Exception {
		
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	
	@Override
	public synchronized void install() throws Exception {
		if (!this.bInstalled) {
			if(this.isInitFromSystemRTAddin()) {
				this.registerMapping(ServiceHub.getInstance().getSysServiceAPIRequestMappingAdapter());
			}
			this.onInstall();

			this.bInstalled = true;
		}
	}

	protected void onInstall() throws Exception {

		
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public void uninstall() {
		try {
			onUninstall();
			if(this.isInitFromSystemRTAddin()) {
				this.unregisterMapping(ServiceHub.getInstance().getSysServiceAPIRequestMappingAdapter());
			}
		} catch (Throwable ex) {
			log.error(String.format("卸载服务接口[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载服务接口[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}

	protected void onUninstall() throws Throwable {
		
	}
	
}
