package net.ibizsys.model.control.tree;



/**
 * 实体树表格属性列模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeColDTO}运行时对象
 *
 */
public interface IPSDETreeDEFColumn extends net.ibizsys.model.control.tree.IPSDETreeColumn{

	
	
	/**
	 * 获取默认值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeColDTO#FIELD_DEFAULTVALUE}
	 * @return
	 */
	java.lang.String getDefaultValue();
}