package net.ibizsys.central.plugin.extension.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.extension.addin.IPSDEModelSyncTool;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.SystemRuntimeException;

public abstract class PSDEModelSyncToolBase extends SysPSDEModelUtilRTAddinBase implements IPSDEModelSyncTool {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSDEModelSyncToolBase.class);
	
	@Override
	public void sync(IPSModelObject iPSModelObject, Object param) {
		this.sync((IPSDataEntity)iPSModelObject, param);
	}
	
	@Override
	public void sync(IPSDataEntity iPSDataEntity, Object param) {
		try {
			this.onSync(iPSDataEntity, param);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysPSDEModelUtilRuntime(), String.format("插件[%1$s]同步实体模型发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}
	
	protected abstract void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable;
}
