package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;


public abstract class DevOpsPSModelToolBase extends CloudDevOpsUtilRTAddinBase implements IDevOpsPSModelTool{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DevOpsPSModelToolBase.class);
	
	
	
	
	@Override
	protected void onInit() throws Exception {
	
		super.onInit();
	}
	
	
	@Override
	protected boolean isPrepareConfigEntity() {
		return true;
	}
	
	
	
	
	@Override
	public void syncPSModels(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params){
		try {
			if(params == null) {
				throw new Exception("未传入同步参数");
			}
			this.onSyncPSModels(dcSystem, iPSSystemService, params);
		}
		catch(Throwable ex) {
			log.error(String.format("模型工具[%1$s]同步模型发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("模型工具[%1$s]同步模型发生异常，%2$s", this.getName(), ex.getMessage()), null);
			if(ex instanceof ISystemRuntimeException) {
				throw (RuntimeException)ex;
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudDevOpsUtilRuntime(), String.format("模型工具[%1$s]同步模型发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected void onSyncPSModels(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params) throws Throwable{
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
