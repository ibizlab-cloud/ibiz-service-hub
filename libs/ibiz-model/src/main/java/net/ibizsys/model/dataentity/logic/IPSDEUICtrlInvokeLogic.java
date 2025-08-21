package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑调用部件方法节点模型对象接口
 * <P>
 * 扩展父接口类型[VIEWCTRLINVOKE]
 *
 */
public interface IPSDEUICtrlInvokeLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取调用部件
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeCtrl();


	/**
	 * 获取调用部件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeCtrlMust();
	
	
	/**
	 * 获取调用方法
	 * @return
	 */
	java.lang.String getInvokeMethod();
	
	
	/**
	 * 获取调用参数
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeParam();


	/**
	 * 获取调用参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeParamMust();
}