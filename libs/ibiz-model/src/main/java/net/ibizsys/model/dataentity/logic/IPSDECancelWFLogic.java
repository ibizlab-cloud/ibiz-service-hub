package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑取消流程节点模型对象接口
 * <P>
 * 扩展父接口类型[CANCELWF]
 *
 */
public interface IPSDECancelWFLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSWFDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSWORKFLOWID}
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
}