package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性类型模型基础对象接口
 *
 */
public interface IPSDEFieldType extends net.ibizsys.model.IPSObject{

	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	Integer getEditorHeight();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	String getEditorType();
	
	
	/**
	 * 获取编辑器宽度
	 * @return
	 */
	Integer getEditorWidth();
	
	
	/**
	 * 获取表格列对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	String getGridColumnAlign();
	
	
	/**
	 * 获取最大值（字符串）
	 * @return
	 */
	String getMaxValueString();
	
	
	/**
	 * 获取最小字符串长度
	 * @return
	 */
	int getMinStringLength();
	
	
	/**
	 * 获取最小值（字符串）
	 * @return
	 */
	String getMinValueString();
	
	
	/**
	 * 获取搜索编辑器高度
	 * @return
	 */
	Integer getSearchEditorHeight();
	
	
	/**
	 * 获取搜索编辑器类型
	 * @return
	 */
	String getSearchEditorType();
	
	
	/**
	 * 获取搜索编辑器宽度
	 * @return
	 */
	Integer getSearchEditorWidth();
	
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	int getStringLength();
}