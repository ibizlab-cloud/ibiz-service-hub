package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.IHubSysDevOpsUtilRuntime;
import net.ibizsys.runtime.res.SysSFPluginRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;

public abstract class HubSysDevOpsUtilRuntimeBase extends SysDevOpsUtilRuntimeBase implements IHubSysDevOpsUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(HubSysDevOpsUtilRuntimeBase.class);
	
	@Override
	public Object executeAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) {
		return this.executeAction("执行操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteAction(iSystemRuntime, strAction, objBody, strKey, objTag);
			}
		}, null);
	}
	
	
	
	@Override
	protected Object onExecuteAction(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		if(DEVOPSACTION_RELOADSYSTEM.equalsIgnoreCase(strAction)) {
			return this.onReloadSystem(iSystemRuntime, strAction, objBody, strKey, objTag);
		}
		
		if(DEVOPSACTION_APPLYHOTCODE.equalsIgnoreCase(strAction)) {
			return this.onApplyHotCode(iSystemRuntime, strAction, objBody, strKey, objTag);
		}
		
		return super.onExecuteAction(iSystemRuntime, strAction, objBody, strKey, objTag);
	}
	
	protected Object onReloadSystem(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		ServiceHub.getInstance().reloadSystemRuntime(iSystemRuntime.getDeploySystemId());
		return null;
	}
	
	
	protected Object onApplyHotCode(ISystemRuntime iSystemRuntime, String strAction, Object objBody, String strKey, Object objTag) throws Throwable {
		
		Map params = null;
		if(objBody instanceof Map) {
			params = (Map)objBody;
		}
		
		if(ObjectUtils.isEmpty(params)) {
			throw new Exception("未传入热代码参数");
		}
		
//		Entity entity = new Entity(params);
//		String strPSSysSFPluginId = DataTypeUtils.asString(entity.get(PSSysSFPluginImpl.ATTR_GETID), null);
//		String strHotCode = DataTypeUtils.asString(entity.get(PSSysSFPluginImpl.ATTR_GETTEMPLCODE), null);
		
		String strPSSysSFPluginId = DataTypeUtils.asString(params.get("id"), null);
		String strHotCode = DataTypeUtils.asString(params.get("templcode"), null);
		
		if(!StringUtils.hasLength(strPSSysSFPluginId) || !StringUtils.hasLength(strHotCode)) {
			throw new Exception("未传入热代码参数");
		}
		
		SysSFPluginRuntime.registerHotCode(iSystemRuntime.getDeploySystemId(), strPSSysSFPluginId, strHotCode);
		ServiceHub.getInstance().reloadSystemRuntime(iSystemRuntime.getDeploySystemId());
		return null;
	}
}
