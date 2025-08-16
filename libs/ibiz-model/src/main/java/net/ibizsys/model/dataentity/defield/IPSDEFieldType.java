package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性类型模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO}运行时对象
 *
 */
public interface IPSDEFieldType extends net.ibizsys.model.IPSObject{

	
	
	/**
	 * 获取编辑器高度
	 * @return
	 */
	java.lang.Integer getEditorHeight();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	java.lang.String getEditorType();
	
	
	/**
	 * 获取编辑器宽度
	 * @return
	 */
	java.lang.Integer getEditorWidth();
	
	
	/**
	 * 获取表格列对齐
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO#FIELD_GRIDCOLALIGN}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridColAlign}
	 * @return
	 */
	java.lang.String getGridColumnAlign();
	
	
	/**
	 * 获取最大值（字符串）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO#FIELD_MAXVALUE}
	 * @return
	 */
	java.lang.String getMaxValueString();
	
	
	/**
	 * 获取最小字符串长度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO#FIELD_MINSTRLENGTH}
	 * @return
	 */
	int getMinStringLength();
	
	
	/**
	 * 获取最小值（字符串）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO#FIELD_MINVALUE}
	 * @return
	 */
	java.lang.String getMinValueString();
	
	
	/**
	 * 获取搜索编辑器高度
	 * @return
	 */
	java.lang.Integer getSearchEditorHeight();
	
	
	/**
	 * 获取搜索编辑器类型
	 * @return
	 */
	java.lang.String getSearchEditorType();
	
	
	/**
	 * 获取搜索编辑器宽度
	 * @return
	 */
	java.lang.Integer getSearchEditorWidth();
	
	
	/**
	 * 获取字符串长度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysDEFTypeDTO#FIELD_STRLENGTH}
	 * @return
	 */
	int getStringLength();
}