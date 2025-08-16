package net.ibizsys.model.control.editor;



/**
 * 数据选择编辑器模型对象接口
 * <P>
 * 扩展父接口类型[PICKER,MOBPICKER,PICKEREX_LINK,PICKEREX_NOAC,PICKEREX_TRIGGER,PICKEREX_LINKONLY,PICKEREX_NOBUTTON,PICKEREX_NOAC_LINK,PICKEREX_DROPDOWNVIEW,PICKEREX_TRIGGER_LINK,MOBPICKER_DROPDOWNVIEW,PICKEREX_DROPDOWNVIEW_LINK]
 *
 */
public interface IPSPicker extends net.ibizsys.model.control.editor.IPSPickerEditor
		,net.ibizsys.model.control.editor.IPSValueItemEditor
		,net.ibizsys.model.control.editor.IPSAutoComplete{

	
	
	/**
	 * 获取下拉视图高度[DROPDOWNVIEWHEIGHT]
	 * @return
	 */
	java.lang.Integer getDropDownViewHeight();
	
	
	/**
	 * 获取下拉视图宽度[DROPDOWNVIEWWIDTH]
	 * @return
	 */
	java.lang.Integer getDropDownViewWidth();
	
	
	/**
	 * 获取数据链接视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppView();


	/**
	 * 获取数据链接视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust();
	
	
	/**
	 * 获取是否下拉选择视图
	 * @return
	 */
	boolean isDropDownView();
	
	
	/**
	 * 获取是否支持链接视图
	 * @return
	 */
	boolean isEnableLinkView();
	
	
	/**
	 * 获取是否支持选择视图
	 * @return
	 */
	boolean isEnablePickupView();
	
	
	/**
	 * 获取是否单项选择
	 * @return
	 */
	boolean isSingleSelect();
}