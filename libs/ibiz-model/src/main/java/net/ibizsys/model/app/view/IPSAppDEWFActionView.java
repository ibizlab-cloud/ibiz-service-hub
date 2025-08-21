package net.ibizsys.model.app.view;



/**
 * 应用实体工作流操作视图模型对象接口
 * <P>
 * 扩展父接口类型[DEWFACTIONVIEW]
 *
 */
public interface IPSAppDEWFActionView extends net.ibizsys.model.app.view.IPSAppDEWFView{

	
	
	/**
	 * 获取绑定流程步骤值
	 * @return
	 */
	java.lang.String getWFStepValue();
	
	
	/**
	 * 获取工作流辅助功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFUtilUIActionType}
	 * @return
	 */
	java.lang.String getWFUtilType();
}