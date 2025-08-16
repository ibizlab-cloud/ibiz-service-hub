package net.ibizsys.central.plugin.extension.dataentity.security;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 实体智能报表模型访问管理对象
 * @author lionlau
 *
 */
public class PSBIModelDataEntityAccessManager extends PSModelDataEntityAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSBIModelDataEntityAccessManager.class);
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {

		String strPSSysBISchemeId = null;
		if(!ObjectUtils.isEmpty(objKey)) {
			strPSSysBISchemeId = PSModelUtils.getParentId((String)objKey);
		}
		else if(inputEntityDTO != null){
			strPSSysBISchemeId = inputEntityDTO.getString(this.getPSSysBISchemeIdField(), null);
		}
		
		if(StringUtils.hasLength(strPSSysBISchemeId)) {
			
			String strRealAccessAction = strAccessAction;
			if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
				strRealAccessAction = DATAACCESSACTION_MANAGE;
			}	
			
			if(strPSSysBISchemeId.indexOf("@") != -1) {
				String[] parts = strPSSysBISchemeId.split("[@]");
				String strData = parts[0];
				String[] data = strData.replace("__", "@").split("[@]");
				if(data.length == 3 && "DATAENTITY".equals(data[0])) {
					//指定属性
					IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(data[1], false);
					strRealAccessAction = String.format("%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName());
					if(realDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(data[2], null, strRealAccessAction)) {
						return true;
					}
				}
			}
		}
		
		return super.onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction);
	}
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime2, String strParentKey2, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
		
		String strPSSysBISchemeId = null;
		if(parentDataEntityRuntime2 != null && PSModels.PSSYSBISCHEME.equals(parentDataEntityRuntime2.getName())) {
			strPSSysBISchemeId = strParentKey2;
		}
		else 
			if(iSearchContextDTO != null) {
				strPSSysBISchemeId = (String) iSearchContextDTO.get(String.format("n_%1$s_eq", this.getPSSysBISchemeIdField()));
			}
		
		if(StringUtils.hasLength(strPSSysBISchemeId)) {
			
			String strRealAccessAction = strAccessAction;
			if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
				strRealAccessAction = DATAACCESSACTION_MANAGE;
			}	
			
			if(strPSSysBISchemeId.indexOf("@") != -1) {
				String[] parts = strPSSysBISchemeId.split("[@]");
				String strData = parts[0];
				String[] data = strData.replace("__", "@").split("[@]");
				if(data.length == 3 && "DATAENTITY".equals(data[0])) {
					//指定属性
					IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(data[1], false);
					strRealAccessAction = String.format("%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName());
					if(realDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(data[2], null, strRealAccessAction)) {
						return true;
					}
				}
			}
		}
		
		return super.onTestDataAccessAction(iUserContext, parentDataEntityRuntime2, strParentKey2, iSearchContextDTO,	strAccessAction);
	}
	
	protected String getPSSysBISchemeIdField() {
		return "pssysbischemeid";
	}
}
