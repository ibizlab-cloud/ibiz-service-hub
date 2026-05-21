package net.ibizsys.central.cloud.core.dataentity.defield;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.defield.DEFGroupRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class AIInfoDEFGroupRuntimeBase extends DEFGroupRuntimeBase implements IAIInfoDEFGroupRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIInfoDEFGroupRuntimeBase.class);
	
	@Override
	public String getAIInfo(IEntityDTO iEntityDTO, Object[] args) {
		try {
			return this.onGetAIInfo(iEntityDTO, args);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("获取数据AI信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String onGetAIInfo(IEntityDTO iEntityDTO, Object[] args) {
		if(ObjectUtils.isEmpty(this.getPSDEFGroup().getPSDEFGroupDetails())) {
			if(this.getDataEntityRuntime().getMajorPSDEField() != null) {
				return iEntityDTO.getString(this.getDataEntityRuntime().getMajorPSDEField().getLowerCaseName(), null);
			}
			return null;
		}
		List<IPSDEFGroupDetail> psDEFGroupDetails = this.getPSDEFGroup().getPSDEFGroupDetails();
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		for(IPSDEFGroupDetail iPSDEFGroupDetail : psDEFGroupDetails) {
			String text = this.getFieldInfo(iPSDEFGroupDetail, iEntityDTO, bFirst, args);
			if(ObjectUtils.isEmpty(text)) {
				continue;
			}
			sb.append(text);
			if(bFirst) {
				bFirst = false;
			}
		}
		return sb.toString();
	}
	
	protected String getFieldInfo(IPSDEFGroupDetail iPSDEFGroupDetail, IEntityDTO iEntityDTO, boolean bFirst, Object[] args) {
		String text = getFieldValue(iPSDEFGroupDetail, iEntityDTO, args);
		if(ObjectUtils.isEmpty(text)) {
			return null;
		}
		
		IPSCodeList iPSCodeList = iPSDEFGroupDetail.getPSCodeList();
		if(iPSCodeList != null) {
			ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);
			IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(text, true);
			if(iPSCodeItem != null) {
				text = String.format("%1$s`%2$s`", iPSCodeItem.getText(), text);
			}
			else {
				text = String.format("`%1$s`无法识别的枚举值(%2$s)", iPSCodeList.getName(), text);
			}
		}
		
		String strLogicName = iPSDEFGroupDetail.getLogicName();
		if(!StringUtils.hasLength(strLogicName)) {
			strLogicName = iPSDEFGroupDetail.getPSDEFieldMust().getLogicName();
		}
		
		text = String.format("%1$s：%2$s", strLogicName, text);
		if(!bFirst) {
			text = "，" + text;
		}
		return text;
	}
	
	protected String getFieldValue(IPSDEFGroupDetail iPSDEFGroupDetail, IEntityDTO iEntityDTO, Object[] args) {
		Object value = iEntityDTO.get(iPSDEFGroupDetail.getPSDEFieldMust().getLowerCaseName());
		if(ObjectUtils.isEmpty(value)) {
			return null;
		}
		
		String text = String.valueOf(value);
		IPSCodeList iPSCodeList = iPSDEFGroupDetail.getPSCodeList();
		if(iPSCodeList != null) {
			ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);
			IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItem(text, true);
			if(iPSCodeItem != null) {
				text = String.format("%1$s`%2$s`", iPSCodeItem.getText(), text);
			}
			else {
				text = String.format("`%1$s`无法识别的枚举值(%2$s)", iPSCodeList.getName(), text);
			}
		}
		return text;
	}
	
	

}
