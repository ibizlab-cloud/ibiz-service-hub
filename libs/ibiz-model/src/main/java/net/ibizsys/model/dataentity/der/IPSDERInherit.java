package net.ibizsys.model.dataentity.der;



/**
 * 实体继承关系模型对象接口
 * <P>
 * 扩展父接口类型[DERINHERIT]
 *
 */
public interface IPSDERInherit extends net.ibizsys.model.dataentity.der.IPSDERBase
		,net.ibizsys.model.dataentity.der.IPSDERIndex{

	
	
	/**
	 * 获取继承处理模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DERInheritMode}
	 * @return
	 */
	int getInheritMode();
	
	
	/**
	 * 获取是否逻辑继承模式，从{@link #getInheritMode}计算
	 * @return
	 */
	boolean isLogicInherit();
	
	
	/**
	 * 获取是否一致存储，判断主从实体的数据表是否一致
	 * @return
	 */
	boolean isSameStorage();
	
	
	/**
	 * 获取是否单继承关系，恒为true
	 * @return
	 */
	boolean isSingleInherit();
	
	
	/**
	 * 获取是否存储继承模式，从{@link #getInheritMode}计算
	 * @return
	 */
	boolean isStorageInherit();
}