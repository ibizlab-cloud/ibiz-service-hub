package net.ibizsys.model.control.dashboard;



/**
 * 系统预置门户部件模型对象接口
 *
 */
public interface IPSDBSysPortletPart extends net.ibizsys.model.control.dashboard.IPSDBPortletPart{

	
	
	/**
	 * 获取刷新间隔（ms）
	 * @return
	 */
	long getTimer();
}