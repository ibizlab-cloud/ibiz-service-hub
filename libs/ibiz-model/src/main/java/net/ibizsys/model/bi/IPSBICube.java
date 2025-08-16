package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBICube extends net.ibizsys.model.bi.IPSSysBISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CODENAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取立方体选项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BICUBEOPTION}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BICubeOption}
	 * @return
	 */
	int getCubeOption();
	
	
	/**
	 * 获取立方体标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BICUBETAG}
	 * @return
	 */
	java.lang.String getCubeTag();
	
	
	/**
	 * 获取立方体标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BICUBETAG2}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEDATASETID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSUNIRESID}
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