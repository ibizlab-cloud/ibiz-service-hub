package net.ibizsys.model.testing;



/**
 * 系统测试数据模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO}运行时对象
 *
 */
public interface IPSSysTestData extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取测试数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO#FIELD_DATA}
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取实例数量
	 * @return
	 */
	int getInstCount();
	
	
	/**
	 * 获取相关实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取相关实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取测试数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestDataItem> getPSSysTestDataItems();
	
	/**
	 * 获取测试数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestDataItem getPSSysTestDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试数据项集合
	 * @param list 测试数据项集合
	 */
	void setPSSysTestDataItems(java.util.List<net.ibizsys.model.testing.IPSSysTestDataItem> list);
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestDataDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取测试数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestDataType}
	 * @return
	 */
	java.lang.String getTestDataType();
	
	
	/**
	 * 获取是否基本模式
	 * @return
	 */
	boolean isBaseMode();
}