package net.ibizsys.model.wf;



/**
 * 工作流嵌入流程处理模型对象基础接口
 *
 */
public interface IPSWFEmbedWFProcessBase extends net.ibizsys.model.wf.IPSWFProcess{

	
	
	/**
	 * 获取多实例模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_MULTIINSTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFProcMultiInstMode}
	 * @return
	 */
	java.lang.String getMultiInstMode();
	
	
	/**
	 * 获取嵌套流程集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> getPSWFProcessSubWFs();
	
	/**
	 * 获取嵌套流程集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFProcessSubWF getPSWFProcessSubWF(Object objKey, boolean bTryMode);
	
	/**
	 * 设置嵌套流程集合
	 * @param list 嵌套流程集合
	 */
	void setPSWFProcessSubWFs(java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> list);
}