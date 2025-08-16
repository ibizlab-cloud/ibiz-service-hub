package net.ibizsys.central.plugin.version.dataentity.action;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase;
import net.ibizsys.central.dataentity.util.IDEVersionControlUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;

public abstract class VersionDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(VersionDEActionRuntimeBase.class);
	
	private IPSDEField messagePSDEField = null;
	private IPSDEField namePSDEField = null;

	@Override
	protected void onInit() throws Exception {
		if(this.getMessagePSDEField(true) == null) {
			this.setMessagePSDEField(this.getDataEntityRuntime().getPSDEFieldByTag(IDEVersionControlUtilRuntime.PREDEFINEDFIELD_MESSAGE, true));
		}
		if(this.getNamePSDEField(true) == null) {
			this.setNamePSDEField(this.getDataEntityRuntime().getPSDEFieldByTag(IDEVersionControlUtilRuntime.PREDEFINEDFIELD_NAME, true));
			if(this.getNamePSDEField(true) == null) {
				this.setNamePSDEField(this.getDataEntityRuntime().getMajorPSDEField());
			}
		}
		super.onInit();
	}
	
	protected IPSDEField getMessagePSDEField(boolean bTryMode) throws Exception {
		if(this.messagePSDEField != null || bTryMode) {
			return this.messagePSDEField;
		}
		throw new Exception(String.format("消息存储属性无效"));
	}
	
	protected void setMessagePSDEField(IPSDEField messagePSDEField) {
		this.messagePSDEField = messagePSDEField;
	}
	

	protected IPSDEField getNamePSDEField(boolean bTryMode) throws Exception {
		if(this.namePSDEField != null || bTryMode) {
			return this.namePSDEField;
		}
		throw new Exception(String.format("版本名称存储属性无效"));
	}
	
	protected void setNamePSDEField(IPSDEField namePSDEField) {
		this.namePSDEField = namePSDEField;
	}
	
	
	protected IPSDERBase getVersionPSDERBase(IEntityDTO iEntityDTO, boolean bTryMode) throws Exception {
		java.util.List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			IPSDEField parentTypePSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, true);
			IPSDEField parentIdPSDEField = this.getDataEntityRuntime().getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTID, true);
			
			Object parentType = null;
			Object parentId = null;
			if(parentTypePSDEField != null) {
				parentType = this.getDataEntityRuntime().getFieldValue(iEntityDTO, parentTypePSDEField);
			}
			
			if(parentIdPSDEField != null) {
				parentId = this.getDataEntityRuntime().getFieldValue(iEntityDTO, parentIdPSDEField);
			}
			
			
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId(), false);
					if(majorDataEntityRuntime.isEnableVersionControl() && majorDataEntityRuntime.getDEVersionControlUtilRuntime().getVersionDataEntityRuntime().getId().equals(this.getDataEntityRuntime().getId())) {
						Object value = this.getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDER1N.getPSPickupDEFieldMust());
						if(!ObjectUtils.isEmpty(value)) {
							return iPSDER1N;
						}
					}
					continue;
				}
				
				if(ObjectUtils.isEmpty(parentType) || ObjectUtils.isEmpty(parentId)) {
					continue;
				}
				
				if(iPSDERBase instanceof IPSDERCustom) {
					IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERCustom.getMajorPSDataEntityMust().getId(), false);
					if(majorDataEntityRuntime.isEnableVersionControl() && majorDataEntityRuntime.getDEVersionControlUtilRuntime().getVersionDataEntityRuntime().getId().equals(this.getDataEntityRuntime().getId())) {
						if(majorDataEntityRuntime.getName().equals(parentType)) {
							return iPSDERCustom;
						}
					}
					continue;
				}
			}
		}
		if(bTryMode) {
			return null;
		}
		
		throw new Exception("无法获取传入数据版本控制关系");
	}
	
}
