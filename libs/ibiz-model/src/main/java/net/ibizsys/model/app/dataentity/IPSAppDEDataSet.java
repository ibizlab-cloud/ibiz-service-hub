package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据集模型对象接口
 *
 */
public interface IPSAppDEDataSet extends net.ibizsys.model.app.dataentity.IPSAppDEMethod{

	
	
	/**
	 * 获取上下文数据条件
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getADPSDEDQConditions();
	
	/**
	 * 获取上下文数据条件的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQCondition getADPSDEDQCondition(Object objKey, boolean bTryMode);
	
	/**
	 * 设置上下文数据条件
	 * @param list 上下文数据条件
	 */
	void setADPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list);
	
	
	/**
	 * 获取执行之后代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AFTERCODE}
	 * @return
	 */
	java.lang.String getAfterCode();
	
	
	/**
	 * 获取执行之前代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BEFORECODE}
	 * @return
	 */
	java.lang.String getBeforeCode();
	
	
	/**
	 * 获取数据集标识
	 * @return
	 */
	java.lang.String getDataSetName();
	
	
	/**
	 * 获取数据集标记
	 * @return
	 */
	java.lang.String getDataSetTag();
	
	
	/**
	 * 获取结果集类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetType}
	 * @return
	 */
	java.lang.String getDataSetType();
	
	
	/**
	 * 获取应用代码表
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取实体处理逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic();


	/**
	 * 获取实体处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust();
	
	
	/**
	 * 获取本地过滤条件
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> getPSDEDQGroupConditions();
	
	/**
	 * 获取本地过滤条件的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupCondition(Object objKey, boolean bTryMode);
	
	/**
	 * 设置本地过滤条件
	 * @param list 本地过滤条件
	 */
	void setPSDEDQGroupConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> list);
	
	
	/**
	 * 获取实体数据集合
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取预定义类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataSetPredefinedType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否自定义代码
	 * @return
	 */
	boolean isCustomCode();
}