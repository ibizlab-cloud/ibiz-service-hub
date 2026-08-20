package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDBIndexBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取索引类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBIndexType}
	 * @return
	 */
	String getIndexType();
	
	
	/**
	 * 获取是否允许反向检索
	 * @return
	 */
	boolean isAllowReverse();
}