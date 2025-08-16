package net.ibizsys.model.control.drctrl;



/**
 * 实体数据关系部件模型对象接口
 *
 */
public interface IPSDEDRCtrl extends net.ibizsys.model.control.drctrl.IPSDRCtrl{

	
	
	/**
	 * 获取实体数据关系标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DRTAG}
	 * @return
	 */
	java.lang.String getDataRelationTag();
	
	
	/**
	 * 获取编辑项标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMCAPPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEditItemCapPSLanguageRes();


	/**
	 * 获取编辑项标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEditItemCapPSLanguageResMust();
	
	
	/**
	 * 获取编辑项标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMCAPTION}
	 * @return
	 */
	java.lang.String getEditItemCaption();
	
	
	/**
	 * 获取编辑项图标
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMPSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getEditItemPSSysImage();


	/**
	 * 获取编辑项图标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getEditItemPSSysImageMust();
	
	
	/**
	 * 获取表单视图对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_FORMPSDEVIEWBASEID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFormPSAppView();


	/**
	 * 获取表单视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFormPSAppViewMust();
	
	
	/**
	 * 获取关系项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> getPSDEDRCtrlItems();
	
	/**
	 * 获取关系项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem getPSDEDRCtrlItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系项集合
	 * @param list 关系项集合
	 */
	void setPSDEDRCtrlItems(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> list);
	
	
	/**
	 * 获取全局唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取是否支持自定义关系项
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否隐藏编辑项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataRelationDTO#FIELD_HIDEEDITITEM}
	 * @return
	 */
	boolean isHideEditItem();
}