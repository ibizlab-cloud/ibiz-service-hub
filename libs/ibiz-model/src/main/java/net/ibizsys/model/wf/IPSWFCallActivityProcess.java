package net.ibizsys.model.wf;



/**
 *
 */
public interface IPSWFCallActivityProcess extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取多实例模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcMultiInstMode}
	 * @return
	 */
	java.lang.String getMultiInstMode();
	
	
	/**
	 * 获取调用目标流程
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getTargetPSWF();


	/**
	 * 获取调用目标流程，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getTargetPSWFMust();
}