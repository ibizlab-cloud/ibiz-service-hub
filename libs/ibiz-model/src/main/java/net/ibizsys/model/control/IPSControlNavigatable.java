package net.ibizsys.model.control;



/**
 * 支持导航界面部件模型对象接口
 *
 */
public interface IPSControlNavigatable extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSNavigatable{

	
	
	/**
	 * 获取导航视图高度
	 * @return
	 */
	double getNavViewHeight();
	
	
	/**
	 * 获取导航视图最大高度
	 * @return
	 */
	double getNavViewMaxHeight();
	
	
	/**
	 * 获取导航视图最大宽度
	 * @return
	 */
	double getNavViewMaxWidth();
	
	
	/**
	 * 获取导航视图最小高度
	 * @return
	 */
	double getNavViewMinHeight();
	
	
	/**
	 * 获取导航视图最小宽度
	 * @return
	 */
	double getNavViewMinWidth();
	
	
	/**
	 * 获取导航视图位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NavViewPos}
	 * @return
	 */
	java.lang.String getNavViewPos();
	
	
	/**
	 * 获取导航视图显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NavViewShowMode}
	 * @return
	 */
	int getNavViewShowMode();
	
	
	/**
	 * 获取导航视图宽度
	 * @return
	 */
	double getNavViewWidth();
}