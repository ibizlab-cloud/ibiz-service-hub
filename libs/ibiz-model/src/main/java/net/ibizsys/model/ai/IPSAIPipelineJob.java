package net.ibizsys.model.ai;



/**
 * AI工厂生产线作业对象接口
 *
 */
public interface IPSAIPipelineJob extends net.ibizsys.model.ai.IPSAIPipelineObject{

	
	
	/**
	 * 获取步骤代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getStepPSCodeList();


	/**
	 * 获取步骤代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getStepPSCodeListMust();
}