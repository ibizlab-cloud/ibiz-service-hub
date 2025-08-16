package net.ibizsys.model.control.editor;



/**
 * 下拉列表框编辑器模型对象接口
 * <P>
 * 扩展父接口类型[DROPDOWNLIST,MOBDROPDOWNLIST,DROPDOWNLIST_100]
 *
 */
public interface IPSDropDownList extends net.ibizsys.model.control.editor.IPSCodeListEditor{

	
	
	/**
	 * 获取是否单项选择模式
	 * @return
	 */
	boolean isSingleSelect();
}