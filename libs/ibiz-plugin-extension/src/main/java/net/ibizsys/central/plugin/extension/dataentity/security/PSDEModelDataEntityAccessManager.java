package net.ibizsys.central.plugin.extension.dataentity.security;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 实体相关模型访问管理对象
 * @author lionlau
 *
 */
public class PSDEModelDataEntityAccessManager extends PSModelDataEntityAccessManager {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PSDEModelDataEntityAccessManager.class);
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {

		String strPSDEId = null;
		if(!ObjectUtils.isEmpty(objKey)) {
			strPSDEId = PSModelUtils.getParentId((String)objKey);
		}
		else if(inputEntityDTO != null){
			strPSDEId = inputEntityDTO.getString(getPSDEIdField(), null);
		}
		
		if(StringUtils.hasLength(strPSDEId)) {
			
			String strRealAccessAction = strAccessAction;
			if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
				strRealAccessAction = DATAACCESSACTION_MANAGE;
			}	
			
			if(strPSDEId.indexOf("@") != -1) {
				String[] parts = strPSDEId.split("[@]");
				IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(parts[1], false);
				IDataEntityRuntime parentDataEntityRuntime = null;
				String strParentKey = null;
				String strData = parts[0];
				String[] data = strData.replace("__", "@").split("[@]");
				if(data.length == 3 && "FIELD".equals(data[0])) {
					//指定属性
					IPSDEField iPSDEField = realDataEntityRuntime.getPSDEField(data[1], false);
					if(iPSDEField instanceof IPSPickupDEField) {
						parentDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(((IPSPickupDEField)iPSDEField).getPSDERMust().getMajorPSDataEntityMust().getId(), false);
						strParentKey = data[2];
					}
					else {
						//未来考虑是否增强非拾取属性
					}
				}
				
				strRealAccessAction = String.format("%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName());
				if(StringUtils.hasLength(strParentKey)) {
					if(parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(strParentKey, null, strRealAccessAction)) {
						return true;
					}
				}
				else {
					if(realDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(strData, null, strRealAccessAction)) {
						return true;
					}
				}
			}
			else {
				IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strPSDEId, false);
				String strResCode = String.format("EXTENSION__%1$s__%2$s_%3$s", realDataEntityRuntime.getFullUniqueTag().replace(".", "_"), strRealAccessAction, this.getDataEntityRuntime().getName()).toUpperCase();
				if(this.getSystemAccessManager().testSysUniRes(iUserContext, strResCode)) {
					return true;
				}
			}
		}
		
		return super.onTestDataAccessAction(iUserContext, objKey, inputEntityDTO, strAccessAction);
	}
	
	@Override
	protected boolean onTestDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime2, String strParentKey2, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
		
		String strPSDEId = null;
		if(parentDataEntityRuntime2 != null && PSModels.PSDATAENTITY.equals(parentDataEntityRuntime2.getName())) {
			strPSDEId = strParentKey2;
		}
		else 
			if(iSearchContextDTO != null) {
				strPSDEId = (String) iSearchContextDTO.get(String.format("n_%1$s_eq", this.getPSDEIdField()));
			}
		
		if(StringUtils.hasLength(strPSDEId)) {
			
			String strRealAccessAction = strAccessAction;
			if(!strRealAccessAction.equalsIgnoreCase(DataAccessActions.READ)) {
				strRealAccessAction = DATAACCESSACTION_MANAGE;
			}	
			
			if(strPSDEId.indexOf("@") != -1) {
				String[] parts = strPSDEId.split("[@]");
				IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(parts[1], false);
				IDataEntityRuntime parentDataEntityRuntime = null;
				String strParentKey = null;
				String strData = parts[0];
				String[] data = strData.replace("__", "@").split("[@]");
				if(data.length == 3 && "FIELD".equals(data[0])) {
					//指定属性
					IPSDEField iPSDEField = realDataEntityRuntime.getPSDEField(data[1], false);
					if(iPSDEField instanceof IPSPickupDEField) {
						parentDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(((IPSPickupDEField)iPSDEField).getPSDERMust().getMajorPSDataEntityMust().getId(), false);
						strParentKey = data[2];
					}
					else {
						//未来考虑是否增强非拾取属性
					}
				}
				
				strRealAccessAction = String.format("%1$s_%2$s", strRealAccessAction, this.getDataEntityRuntime().getName());
				if(StringUtils.hasLength(strParentKey)) {
					if(parentDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(strParentKey, null, strRealAccessAction)) {
						return true;
					}
				}
				else {
					if(realDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(strData, null, strRealAccessAction)) {
						return true;
					}
				}
			}
			else {
				IDataEntityRuntime realDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strPSDEId, false);
				String strResCode = String.format("EXTENSION__%1$s__%2$s_%3$s", realDataEntityRuntime.getFullUniqueTag().replace(".", "_"), strRealAccessAction, this.getDataEntityRuntime().getName()).toUpperCase();
				if(this.getSystemAccessManager().testSysUniRes(iUserContext, strResCode)) {
					return true;
				}
			}
		}
		
		return super.onTestDataAccessAction(iUserContext, parentDataEntityRuntime2, strParentKey2, iSearchContextDTO,	strAccessAction);
	}
	
	protected String getPSDEIdField() {
		return "psdeid";
	}
}
