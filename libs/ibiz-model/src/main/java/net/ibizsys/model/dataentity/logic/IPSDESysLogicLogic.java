package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用系统预置逻辑节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSLOGIC]
 *
 */
public interface IPSDESysLogicLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
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
	 * 获取逻辑调用参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * @return
	 */
	java.lang.String getLogicParam();
	
	
	/**
	 * 获取逻辑调用参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getLogicParam2();
	
	
	/**
	 * 获取系统逻辑对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSDELOGICNODEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysLogic getPSSysLogic();


	/**
	 * 获取系统逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysLogic getPSSysLogicMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_RETPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
}