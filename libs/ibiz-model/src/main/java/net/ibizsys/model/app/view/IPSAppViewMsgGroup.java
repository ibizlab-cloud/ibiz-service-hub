package net.ibizsys.model.app.view;



/**
 * 应用视图消息组模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO}运行时对象
 *
 */
public interface IPSAppViewMsgGroup extends net.ibizsys.model.view.IPSViewMsgGroup
		,net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取内部消息区样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO#FIELD_BODYMSGSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgShowMode}
	 * @return
	 */
	java.lang.String getBodyStyle();
	
	
	/**
	 * 获取尾部消息区样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO#FIELD_BOTTOMMSGSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgShowMode}
	 * @return
	 */
	java.lang.String getBottomStyle();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取消息组成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> getPSAppViewMsgGroupDetails();
	
	/**
	 * 获取消息组成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail getPSAppViewMsgGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置消息组成员集合
	 * @param list 消息组成员集合
	 */
	void setPSAppViewMsgGroupDetails(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroupDetail> list);
	
	
	/**
	 * 获取头部消息区样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSViewMsgGroupDTO#FIELD_TOPMSGSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgShowMode}
	 * @return
	 */
	java.lang.String getTopStyle();
}