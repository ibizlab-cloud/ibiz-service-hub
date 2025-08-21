package net.ibizsys.model.wf;



/**
 * 工作流启动处理节点模型对象接口
 * <P>
 * 扩展父接口类型[START]
 *
 */
public interface IPSWFStartProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取操作表单标记
	 * @return
	 */
	java.lang.String getFormCodeName();
	
	
	/**
	 * 获取移动端操作表单标记
	 * @return
	 */
	java.lang.String getMobFormCodeName();
	
	
	/**
	 * 获取移动端启动视图代码标识
	 * @return
	 */
	java.lang.String getMobStartViewCodeName();
	
	
	/**
	 * 获取移动端启动视图名称
	 * @return
	 */
	java.lang.String getMobStartViewName();
	
	
	/**
	 * 获取启动视图代码标识
	 * @return
	 */
	java.lang.String getStartViewCodeName();
	
	
	/**
	 * 获取启动视图名称
	 * @return
	 */
	java.lang.String getStartViewName();
}