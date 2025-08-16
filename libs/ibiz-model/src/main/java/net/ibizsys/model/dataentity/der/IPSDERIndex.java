package net.ibizsys.model.dataentity.der;



/**
 * 实体索引关系模型对象接口
 * <P>
 * 扩展父接口类型[DERINDEX]
 *
 */
public interface IPSDERIndex extends net.ibizsys.model.dataentity.der.IPSDERBase{

	
	
	/**
	 * 获取关系属性映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> getPSDERIndexDEFieldMaps();
	
	/**
	 * 获取关系属性映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap getPSDERIndexDEFieldMap(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系属性映射集合
	 * @param list 关系属性映射集合
	 */
	void setPSDERIndexDEFieldMaps(java.util.List<net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap> list);
	
	
	/**
	 * 获取索引类型识别值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDERDTO#FIELD_INDEXVALUE}
	 * @return
	 */
	java.lang.String getTypeValue();
	
	
	/**
	 * 获取是否继承模式
	 * @return
	 */
	boolean isInherit();
	
	
	/**
	 * 获取是否虚拟模式
	 * @return
	 */
	boolean isVirtual();
}