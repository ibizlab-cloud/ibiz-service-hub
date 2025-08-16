package net.ibizsys.central.cloud.core.service.util;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.service.ISysServiceAPIDocAdapter;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.action.DEActionModes;

public class SysServiceAPIDocUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysServiceAPIDocUtils.class);
	
	public static void registerR8DEMethodMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, ISysServiceAPIDocAdapter iSysServiceAPIDocAdapter) {
		
		List<IPSDataEntity> psDataEntityList = iSysServiceAPIRuntime.getSystemRuntime().getPSSystem().getAllPSDataEntities();
		if(ObjectUtils.isEmpty(psDataEntityList)) {
			return;
		}
		
		String baseUrl = String.format("/%1$s/%2$s",  iSysServiceAPIRuntime.getSystemRuntime().getServiceId(), iSysServiceAPIRuntime.getPSSysServiceAPI().getServiceCodeName()).toLowerCase();
		
		for(IPSDataEntity iPSDataEntity : psDataEntityList) {
			//忽略外部模型组实体注册
			if(iPSDataEntity.getPSSystemModuleMust().getPSSysModelGroup() != null) {
				continue;
			}
			
			List<IPSDEAction> psDEActionList = iPSDataEntity.getAllPSDEActions();
			if(!ObjectUtils.isEmpty(psDEActionList)) {
				for(IPSDEAction iPSDEAction : psDEActionList) {
					String codeName = iPSDEAction.getCodeName();
					String codeNameFormat = iSysServiceAPIRuntime.getSystemRuntime().getSystemRuntimeSetting().getDEActionCodeNameFormat();
					if (StringUtils.hasLength(codeNameFormat)) {
						codeName = String.format(codeNameFormat, codeName);
					}
					String uri = String.format("%1$s/%2$s/%3$s", baseUrl, iPSDataEntity.getName(), codeName).toLowerCase();
					if(DEActionModes.READ.equals(iPSDEAction.getActionMode())
							|| DEActionModes.DELETE.equals(iPSDEAction.getActionMode())) {
						uri += "/{key}";
					}
					
					iSysServiceAPIDocAdapter.registerMapping(iSysServiceAPIRuntime, new String[] {uri}, new RequestMethod[] {RequestMethod.POST}, iPSDataEntity, iPSDEAction);
				}
			}
			
			List<IPSDEDataSet> psDEDataSetList = iPSDataEntity.getAllPSDEDataSets();
			if(!ObjectUtils.isEmpty(psDEDataSetList)) {
				for(IPSDEDataSet iPSDEDataSet : psDEDataSetList) {
					String codeName = iPSDEDataSet.getCodeName();
					String codeNameFormat = iSysServiceAPIRuntime.getSystemRuntime().getSystemRuntimeSetting().getDEDataSetCodeNameFormat();
					if (StringUtils.hasLength(codeNameFormat)) {
						codeName = String.format(codeNameFormat, codeName);
					}
					String uri = String.format("%1$s/%2$s/%3$s", baseUrl, iPSDataEntity.getName(), codeName).toLowerCase();
					iSysServiceAPIDocAdapter.registerMapping(iSysServiceAPIRuntime, new String[] {uri}, new RequestMethod[] {RequestMethod.POST}, iPSDataEntity, iPSDEDataSet);
				}
			}
		}
		
	}

}
