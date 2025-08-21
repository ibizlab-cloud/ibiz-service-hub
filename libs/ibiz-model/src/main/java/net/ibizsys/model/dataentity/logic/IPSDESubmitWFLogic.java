package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑提交流程操作节点模型对象接口
 * <P>
 * 扩展父接口类型[SUBMITWF]
 *
 */
public interface IPSDESubmitWFLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取目标实体对象，调用{@link #getPSDEWF}.getPSDataEntity()
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
	
	
	/**
	 * 获取可选逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getOptPSDELogicParam();


	/**
	 * 获取可选逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getOptPSDELogicParamMust();
	
	
	/**
	 * 获取应用工作流对象
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWF();


	/**
	 * 获取应用工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust();
	
	
	/**
	 * 获取实体工作流对象
	 * @return
	 */
	net.ibizsys.model.dataentity.wf.IPSDEWF getPSDEWF();


	/**
	 * 获取实体工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.wf.IPSDEWF getPSDEWFMust();
	
	
	/**
	 * 获取工作流对象
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
	
	
	/**
	 * 获取工作流操作
	 * @return
	 */
	java.lang.String getWFAction();
}