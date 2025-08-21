package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBICube extends net.ibizsys.model.bi.IPSBISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取立方体选项
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BICubeOption}
	 * @return
	 */
	int getCubeOption();
	
	
	/**
	 * 获取立方体标记
	 * @return
	 */
	java.lang.String getCubeTag();
	
	
	/**
	 * 获取立方体标记2
	 * @return
	 */
	java.lang.String getCubeTag2();
	
	
	/**
	 * 获取键值存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField();


	/**
	 * 获取键值存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust();
	
	
	/**
	 * 获取数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取权限统一资源对象
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取权限统一资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取类型存储属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEField();


	/**
	 * 获取类型存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTypePSDEFieldMust();
}