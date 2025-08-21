package net.ibizsys.model.control.form;



/**
 * 实体表单关系界面部件成员模型对象接口
 * <P>
 * 扩展父接口类型[DRUIPART]
 *
 */
public interface IPSDEFormDRUIPart extends net.ibizsys.model.control.form.IPSDEFormDetail
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取实体关系项标记
	 * @return
	 */
	java.lang.String getDRItemTag();
	
	
	/**
	 * 获取自定义遮罩信息
	 * @return
	 */
	java.lang.String getMaskInfo();
	
	
	/**
	 * 获取遮罩模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.FormDRUIPartMaskMode}
	 * @return
	 */
	int getMaskMode();
	
	
	/**
	 * 获取遮罩信息语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMaskPSLanguageRes();


	/**
	 * 获取遮罩信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getMaskPSLanguageResMust();
	
	
	/**
	 * 获取嵌入视图，计算关系界面项{@link net.ibizsys.centralstudio.dto.PSDEFormDetailDTO#FIELD_PSDEDRITEMID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取嵌入视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
	
	
	/**
	 * 获取调用表单项更新
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate();


	/**
	 * 获取调用表单项更新，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust();
	
	
	/**
	 * 获取界面参数项名称
	 * @return
	 */
	java.lang.String getParamItem();
	
	
	/**
	 * 获取父数据对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO();
	
	
	/**
	 * 获取界面刷新触发表单项
	 * @return
	 */
	java.lang.String getRefreshItems();
	
	
	/**
	 * 获取是否需要进行保存
	 * @return
	 */
	boolean isNeedSave();
	
	
	/**
	 * 获取是否附加刷新项只赋值不刷新
	 * @return
	 */
	boolean isRefreshItemsSetParamOnly();
}