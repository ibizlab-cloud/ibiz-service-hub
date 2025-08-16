package net.ibizsys.model.ba;



/**
 *
 */
public interface IPSBDTable extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取数据表类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BDTableType}
	 * @return
	 */
	int getBDTableType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取继承类型值
	 * @return
	 */
	java.lang.String getInheritTypeValue();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
}