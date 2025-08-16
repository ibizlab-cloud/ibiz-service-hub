package net.ibizsys.model.control.form;



/**
 * 实体表单按钮列表成员模型对象接口
 * <P>
 * 扩展父接口类型[BUTTONLIST]
 *
 */
public interface IPSDEFormButtonList extends net.ibizsys.model.control.form.IPSDEFormDetail{

	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_UPDATEDVT}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getActionGroupExtractMode();
	
	
	/**
	 * 获取按钮列表类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_CONTENTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonListType}
	 * @return
	 */
	java.lang.String getButtonListType();
	
	
	/**
	 * 获取表单按钮集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> getPSDEFormButtons();
	
	/**
	 * 获取表单按钮集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEFormButton getPSDEFormButton(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表单按钮集合
	 * @param list 表单按钮集合
	 */
	void setPSDEFormButtons(java.util.List<net.ibizsys.model.control.form.IPSDEFormButton> list);
	
	
	/**
	 * 获取界面行为组对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSDEUAGROUPID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
}