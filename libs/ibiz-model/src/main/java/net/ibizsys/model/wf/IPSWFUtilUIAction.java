package net.ibizsys.model.wf;



/**
 * 工作流辅助操作界面行为模型对象接口
 *
 */
public interface IPSWFUtilUIAction extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取界面行为标识
	 * @return
	 */
	String getPSDEUIActionId();
	
	
	/**
	 * 获取工作流标识
	 * @return
	 */
	String getPSWorkflowId();
	
	
	/**
	 * 获取功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFUtilUIActionType}
	 * @return
	 */
	String getUtilType();
}