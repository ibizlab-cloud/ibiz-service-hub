package net.ibizsys.central.cloud.core.dataentity.service;

import java.util.Map;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 代理实体运行时
 * @author lionlau
 *
 */
public interface IProxyDERuntime<FIELD_ENUM extends IProxyDEFieldEnum, ACTION_ENUM extends IProxyDEActionEnum, DATASET_ENUM extends IProxyDEDataSetEnum> {

	public final static String FIELD_ID = "ID";
	public final static String FIELD_NAME = "NAME";
	
	
	IPSDEField getIdPSDEField() throws Exception;
	
	
	IPSDEField getNamePSDEField(boolean tryMode) throws Exception;
	
	
	default IPSDEField getNamePSDEField() throws Exception{
		return getNamePSDEField(false);
	}
	
	
	/**
	 * 获取实际运行时对象
	 * @return
	 */
	IDataEntityRuntime getReal();
	
	
	/**
	 * 获取代理实体属性枚举对象
	 * @return
	 */
	Class<? extends FIELD_ENUM> getProxyDEFieldEnum();
	
	
	
	/**
	 * 获取指定名称属性
	 * @param iProxyDEFieldEnum
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEField getPSDEField(FIELD_ENUM iProxyDEFieldEnum, boolean tryMode) throws Exception;
	
	default IPSDEField getPSDEField(FIELD_ENUM iProxyDEFieldEnum) throws Exception{
		return getPSDEField(iProxyDEFieldEnum, false);
	}
	
	/**
	 * 获取指定名称属性
	 * @param name
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEField getPSDEField(String name, boolean tryMode) throws Exception;
	
	
	String getFieldEnumItem(FIELD_ENUM iProxyDEFieldEnum, Object value, boolean tryMode) throws Exception;
	
	Object getFieldEnumValue(FIELD_ENUM iProxyDEFieldEnum, Object value, boolean tryMode) throws Exception;
	
	/**
	 * 获取代理实体行为枚举对象
	 * @return
	 */
	Class<? extends ACTION_ENUM> getProxyDEActionEnum();
	
	/**
	 * 获取指定名称行为
	 * @param name
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEAction getPSDEAction(String name, boolean tryMode) throws Exception;
	
	
	/**
	 * 获取指定名称行为
	 * @param iProxyDEActionEnum
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEAction getPSDEAction(ACTION_ENUM iProxyDEActionEnum, boolean tryMode) throws Exception;
	
	
	default IPSDEAction getPSDEAction(ACTION_ENUM iProxyDEActionEnum) throws Exception{
		return getPSDEAction(iProxyDEActionEnum, false);
	}
	
	
	/**
	 * 获取代理实体数据集枚举对象
	 * @return
	 */
	Class<? extends DATASET_ENUM> getProxyDEDataSetEnum();
	
	/**
	 * 获取指定名称数据集
	 * @param name
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEDataSet getPSDEDataSet(String name, boolean tryMode) throws Exception;
	
	
	/**
	 * 获取指定名称数据集
	 * @param iProxyDEDataSetEnum
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IPSDEDataSet getPSDEDataSet(DATASET_ENUM iProxyDEDataSetEnum, boolean tryMode) throws Exception;
	
	
	default IPSDEDataSet getPSDEDataSet(DATASET_ENUM iProxyDEDataSetEnum) throws Exception{
		return getPSDEDataSet(iProxyDEDataSetEnum, false);
	}
	
	
	IEntityDTO  getEntityDTO(Map<String, Object> item) throws Throwable;
	
	
	void fillEntityDTO(IEntityDTO iEntityDTO, Map<String, Object> item) throws Throwable;
	
	
	Map<String, Object> getDataItem(IEntityDTO iEntityDTO) throws Throwable;
	
	
	
	Object getFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object defaultValue)throws Throwable;
	
	
	default Object getFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum)throws Throwable{
		return getFieldValue(iEntityDTO, iProxyDEFieldEnum, null);
	}
	
	boolean containsFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum)throws Throwable;
	
	
	boolean setFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object value)throws Throwable;
	
	boolean resetFieldValue(IEntityDTO iEntityDTO, FIELD_ENUM iProxyDEFieldEnum, Object value)throws Throwable;
}
