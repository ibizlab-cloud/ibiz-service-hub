package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSSysDynaModelAttr extends net.ibizsys.model.dynamodel.IPSDynaModelAttr
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取标准值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_STDDATATYPE}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取属性值
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaModelAttrValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否属性为数组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ARRAYFLAG}
	 * @return
	 */
	boolean isArray();
}