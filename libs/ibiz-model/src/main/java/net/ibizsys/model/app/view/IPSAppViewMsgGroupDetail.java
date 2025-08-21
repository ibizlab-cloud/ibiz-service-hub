package net.ibizsys.model.app.view;



/**
 * 应用视图消息组成员模型对象接口
 *
 */
public interface IPSAppViewMsgGroupDetail extends net.ibizsys.model.view.IPSViewMsgGroupDetail{

	
	
	/**
	 * 获取应用视图消息
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsg();


	/**
	 * 获取应用视图消息，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsgMust();
	
	
	/**
	 * 获取显示位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgPos}
	 * @return
	 */
	java.lang.String getPosition();
}