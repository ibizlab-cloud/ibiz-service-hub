package net.ibizsys.model.control.form;



/**
 * 实体属性预定义表单项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEFUIModeDTO}运行时对象
 *
 */
public interface IPSDEFFormItem extends net.ibizsys.model.dataentity.defield.IPSDEFUIItem{

	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	int getEditorHeight();
	
	
	/**
	 * 获取编辑器宽度
	 * @return
	 */
	int getEditorWidth();
}