package net.ibizsys.central.dataentity.logic.util;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.logic.DELogicPrepareParamValueTypes;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.ModelRuntimeBase;

public class DEFCaseWhenLogicNodeRuntime extends ModelRuntimeBase implements IDEFCaseWhenLogicNodeRuntime{

	private IPSDELogicLink iPSDELogicLink = null;
	private String strValueType = null;
	private String strValue = null;
	
	
	public void init(IPSDELogicLink iPSDELogicLink) throws Exception{
		Assert.notNull(iPSDELogicLink, "传入实体逻辑连接模型无效");
		this.setPSDELogicLink(iPSDELogicLink);
		this.onInit();
	}
	
	@Override
	public IPSDELogicLink getPSDELogicLink() {
		return this.iPSDELogicLink;
	}
	
	protected void setPSDELogicLink(IPSDELogicLink iPSDELogicLink) {
		this.iPSDELogicLink = iPSDELogicLink;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDELogicLink();
	}
	
	
	@Override
	protected void onInit() throws Exception {

		if(this.getPSDELogicLink().getDstPSDELogicNodeMust().getPSDELogicNodeParams() == null
				|| this.getPSDELogicLink().getDstPSDELogicNodeMust().getPSDELogicNodeParams().size() != 1) {
			throw new ModelException(this.getPSDELogicLink().getDstPSDELogicNodeMust(), String.format("处理逻辑节点[%1$s]参数集合数量必须为1", this.getPSDELogicLink().getDstPSDELogicNode().getName()));
		}

		IPSDELogicNodeParam iPSDELogicNodeParam = this.getPSDELogicLink().getDstPSDELogicNodeMust().getPSDELogicNodeParams().get(0);
		String strSrcValueType = iPSDELogicNodeParam.getSrcValueType();
		if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(strSrcValueType)
				|| DELogicPrepareParamValueTypes.SRCVALUE.equals(strSrcValueType)
				|| DELogicPrepareParamValueTypes.SRCVALUE.equals(strSrcValueType)) {
			strValueType = strSrcValueType;
			if(DELogicPrepareParamValueTypes.SRCDLPARAM.equals(strSrcValueType)) {
				strValue = iPSDELogicNodeParam.getSrcFieldName();
				
			}
			else		
				if(DELogicPrepareParamValueTypes.SRCVALUE.equals(strSrcValueType)) {	
					strValue = iPSDELogicNodeParam.getSrcValue();
				}
				else
					if(DELogicPrepareParamValueTypes.NULLVALUE.equals(strSrcValueType)) {	
						
					}
		}
		
		if(!StringUtils.hasLength(this.getValueType())) {
			throw new ModelException(iPSDELogicNodeParam, String.format("无法识别的源值类型[%1$s]", strSrcValueType));
		}
		
		super.onInit();
	}
	
	/**
	 * 获取值类型
	 * @return
	 */
	@Override
	public String getValueType() {
		return strValueType;
	}
	
	
	/**
	 * 获取结果值
	 * @return
	 */
	@Override
	public Object getValue() {
		return this.strValue;
	}
	
	@Override
	public IPSDELogicLinkGroupCond getPSDELogicLinkGroupCond() {
		return this.getPSDELogicLink().getPSDELogicLinkGroupCond();
	}
	
}
