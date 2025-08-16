package net.ibizsys.central.cloud.devops.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.System;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;


public abstract class DevOpsDynaModelAPIBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsDynaModelAPI{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsDynaModelAPIBase.class);
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
	}
	
	
	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}
	
	
	@Override
	public Object invoke(System system, IPSSystemService iPSSystemService, String strPModelName, String strPKey, String strPSModelName, String strMethodName, String strKey, Object param) {
		try {
			return this.onInvoke(system, iPSSystemService, strPModelName, strPKey, strPSModelName, strMethodName, strKey, param);
		}
		catch(Throwable ex) {
			log.error(String.format("模型API[%1$s]调用发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("模型API[%1$s]调用发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDevOpsUtilRuntime(), String.format("模型API[%1$s]调用发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	protected Object onInvoke(System system, IPSSystemService iPSSystemService, String strPModelName, String strPKey, String strModelName, String strMethodName, String strKey, Object param) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
	/**
	 * 获取平台开发系统标识
	 * @param dcSystem
	 * @param iPSSystemService
	 * @return
	 */
	protected String getPSDevSlnSysId(DCSystem dcSystem, IPSSystemService iPSSystemService) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getSystem(dcSystem.getSystemId()).getRealPSDevSlnSysId();
	}
}
