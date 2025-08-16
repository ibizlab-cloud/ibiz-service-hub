package net.ibizsys.model.util.transpiler.extend.app.dataentity;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSAppDataEntity;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSAppDataEntityListTranspilerEx extends net.ibizsys.model.util.transpiler.app.dataentity.PSAppDataEntityListTranspiler{
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		
		IPSAppDataEntity iPSAppDataEntity = (IPSAppDataEntity)iPSModelObject;
		
		PSAppDataEntity psAppDataEntity = (PSAppDataEntity)domain;
		if(!StringUtils.hasLength(psAppDataEntity.getPSSysServiceAPIId())) {
			if(StringUtils.hasLength(iPSAppDataEntity.getSysAPITag())) {
				List<IPSSysServiceAPI> psSysServiceAPIList = iPSModelTranspileContext.getPSSystemService().getPSSystem().getAllPSSysServiceAPIs();
				if(!ObjectUtils.isEmpty(psSysServiceAPIList)) {
					IPSSysServiceAPI iPSSysServiceAPI = null;
					for(IPSSysServiceAPI item : psSysServiceAPIList) {
						if(iPSAppDataEntity.getSysAPITag().equalsIgnoreCase(item.getCodeName())) {
							iPSSysServiceAPI = item;
							break;
						}
					}
					if(iPSSysServiceAPI!=null) {
						psAppDataEntity.setPSSysServiceAPIId(iPSModelTranspileContext.getPSModelUniqueTag(iPSSysServiceAPI));
						psAppDataEntity.setPSSysServiceAPIName(iPSSysServiceAPI.getName());
						
						if(!StringUtils.hasLength(psAppDataEntity.getPSDEServiceAPIId())) {
							if(StringUtils.hasLength(iPSAppDataEntity.getDEAPITag())) {
								if(!ObjectUtils.isEmpty(iPSSysServiceAPI.getPSDEServiceAPIs())) {
									for(IPSDEServiceAPI iPSDEServiceAPI : iPSSysServiceAPI.getPSDEServiceAPIs()) {
										if(iPSAppDataEntity.getDEAPITag().equalsIgnoreCase(iPSDEServiceAPI.getName())) {
											psAppDataEntity.setPSDEServiceAPIId(iPSModelTranspileContext.getPSModelUniqueTag(iPSDEServiceAPI));
											psAppDataEntity.setPSDEServiceAPIName(iPSDEServiceAPI.getName());
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	@Override
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		
		super.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
	}
	
	@Override
	protected String[] getModelFolders() {
		return new String[] {"PSSYSAPPS", "PSAPPDATAENTITIES"};
	}
	
	
}