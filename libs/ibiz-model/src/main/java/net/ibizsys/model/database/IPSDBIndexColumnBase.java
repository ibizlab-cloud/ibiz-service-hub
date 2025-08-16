package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDBIndexColumnBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取索引长度
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 获取排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getSortDir();
	
	
	/**
	 * 获取是否索引数据附加
	 * @return
	 */
	boolean isIncludeMode();
}