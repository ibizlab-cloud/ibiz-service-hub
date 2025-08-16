package net.ibizsys.model.ai;



/**
 *
 */
public interface IPSAIPipelineJob extends net.ibizsys.model.ai.IPSAIPipelineObject{

	
	
	/**
	 * 获取步骤代码表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_STEPPSCODELISTID}
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getStepPSCodeList();


	/**
	 * 获取步骤代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getStepPSCodeListMust();
}