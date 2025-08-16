package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIDataType extends net.ibizsys.model.eai.IPSSysEAISchemeObject
		,net.ibizsys.model.eai.IPSEAIDataType{

	
	
	/**
	 * 获取集成数据类型项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> getAllPSSysEAIDataTypeItems();
	
	/**
	 * 获取集成数据类型项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIDataTypeItem getPSSysEAIDataTypeItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成数据类型项集合
	 * @param list 集成数据类型项集合
	 */
	void setPSSysEAIDataTypeItems(java.util.List<net.ibizsys.model.eai.IPSSysEAIDataTypeItem> list);
}