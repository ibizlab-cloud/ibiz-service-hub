package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSBDTableDE extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取大数据表实体类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEBDTableType}
	 * @return
	 */
	int getBDTableDEType();
	
	
	/**
	 * 获取行键值格式化
	 * @return
	 */
	java.lang.String getRowKeyFormat();
	
	
	/**
	 * 获取行键值参数
	 * @return
	 */
	java.lang.String getRowKeyParams();
}