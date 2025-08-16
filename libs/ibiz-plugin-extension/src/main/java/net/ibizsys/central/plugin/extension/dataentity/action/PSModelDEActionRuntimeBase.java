package net.ibizsys.central.plugin.extension.dataentity.action;


import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.plugin.extension.dataentity.IPSModelDataEntityRuntime;
import net.ibizsys.central.plugin.extension.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.psmodel.core.util.IPSModel;

public abstract class PSModelDEActionRuntimeBase extends ExtensionDEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSModelDEActionRuntimeBase.class);
	
	
	@Override
	public IPSModelDataEntityRuntime getDataEntityRuntime() {
		return (IPSModelDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	protected Object onExecute(Object[] args) throws Throwable {
		if (args != null && args.length > 0) {
			Object arg = args[0];
			Object key = null;
			Object param = null;
			if(arg instanceof IEntityDTO) {
				IPSModel iPSModel = this.getDataEntityRuntime().toPSModel((IEntityDTO)arg);
				param = iPSModel.any();
			}
			else {
				key = arg;
			}
			
			Object ret = null;
			ISysExtensionUtilRuntime iSysExtensionUtilRuntime = (ISysExtensionUtilRuntime)this.getSysExtensionUtilRuntime();
			if(iSysExtensionUtilRuntime instanceof IHubSysExtensionUtilRuntime && !(iSysExtensionUtilRuntime instanceof ISysUtilContainerOnly)) {
				ret = ((IHubSysExtensionUtilRuntime)iSysExtensionUtilRuntime).invokeDynaModelAPI(this.getSystemRuntime(), null, null, this.getDataEntityRuntime().getPSModelTag(), this.getPSDEAction().getCodeName(), (String)key, param, true);
			}
			else {
				ret = iSysExtensionUtilRuntime.invokeDynaModelAPI(null, null, this.getDataEntityRuntime().getPSModelTag(), this.getPSDEAction().getCodeName(), (String)key, param, true);
			}
			
			if(ret instanceof IPSModel) {
				IEntityDTO retEntityDTO = this.getDataEntityRuntime().fromPSModel((IPSModel)ret);
				if(arg instanceof IEntityDTO && this.getPSDEAction().getPSDEActionInputMust().isOutput()) {
					IEntityDTO inputEntityDTO = (IEntityDTO)arg;
					inputEntityDTO.resetAll();
					retEntityDTO.copyTo(inputEntityDTO, true);
					return inputEntityDTO;
				}
				return retEntityDTO;
			}
			return ret;
		}
		
		return super.onExecute(args);
	}

}
