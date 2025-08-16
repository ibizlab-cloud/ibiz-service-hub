package net.ibizsys.central.plugin.extension.system;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.system.IExtensionSystemModuleUtilRuntime;
import net.ibizsys.central.cloud.core.system.SystemModuleUtilRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.plugin.extension.dataentity.ExtensionDataEntityRuntime;
import net.ibizsys.central.plugin.extension.dataentity.PSModelDataEntityRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;

public class ExtensionSystemModuleUtilRuntimeBase extends SystemModuleUtilRuntimeBase implements IExtensionSystemModuleUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExtensionSystemModuleUtilRuntimeBase.class);
	
	@Override
	public IDataEntityRuntime createDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		String strTag = iPSDataEntity.getDETag();
		if(!StringUtils.hasLength(strTag)) {
			strTag = iPSDataEntity.getName();
		}
		
		//根据前缀建立运行时
		if(strTag.indexOf(DETAG_PREFIX_EXTENSION) == 0) {
			return new ExtensionDataEntityRuntime();
		}
		if(strTag.indexOf(DETAG_PREFIX_PSMODEL) == 0) {
			return new PSModelDataEntityRuntime();
		}
		
		
 		return super.createDataEntityRuntime(iPSDataEntity);
	}
	
	
}
