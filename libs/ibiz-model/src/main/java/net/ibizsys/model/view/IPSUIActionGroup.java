package net.ibizsys.model.view;



/**
 * 界面行为组模型基础对象接口
 *
 */
public interface IPSUIActionGroup extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取组标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UAGTAG}
	 * @return
	 */
	java.lang.String getGroupTag();
	
	
	/**
	 * 获取组标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UAGTAG2}
	 * @return
	 */
	java.lang.String getGroupTag2();
	
	
	/**
	 * 获取组标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UAGTAG3}
	 * @return
	 */
	java.lang.String getGroupTag3();
	
	
	/**
	 * 获取组标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_UAGTAG4}
	 * @return
	 */
	java.lang.String getGroupTag4();
	
	
	/**
	 * 获取组成员对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> getPSUIActionGroupDetails();
	
	/**
	 * 获取组成员对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.view.IPSUIActionGroupDetail getPSUIActionGroupDetail(Object objKey, boolean bTryMode);
	
	/**
	 * 设置组成员对象集合
	 * @param list 组成员对象集合
	 */
	void setPSUIActionGroupDetails(java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list);
}