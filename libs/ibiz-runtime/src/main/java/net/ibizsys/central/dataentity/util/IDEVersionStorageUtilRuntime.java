package net.ibizsys.central.dataentity.util;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体版本存储功能组件运行时对象
 * @author lionlau
 *
 */
public interface IDEVersionStorageUtilRuntime extends IDEUtilRuntime {

	/**
	 * 行为扩展参数：指定版本
	 */
	public final String ACTION_ARG_VERSIONID = "SRFVERSIONID";
	
	
	/**
	 * 行为扩展参数：指定版本
	 */
	public final String DATASET_ARG_VERSIONID = "SRFVERSIONID";
	

	
	
	/**
	 * 预定义属性：数据，长文本。存储数据的序列化值
	 */
	public final static String PREDEFINEDFIELD_DATA = "DATA";
	
	
	
	/**
	 * 预定义属性：提交消息
	 */
	public final static String PREDEFINEDFIELD_MESSAGE = "MESSAGE";
	
	
	/**
	 * 预定义属性：所有者类型
	 */
	public final static String PREDEFINEDFIELD_OWNER_TYPE = "OWNER_TYPE";
	
	/**
	 * 预定义属性：所有者标识
	 */
	public final static String PREDEFINEDFIELD_OWNER_ID = "OWNER_ID";
	
	/**
	 * 预定义属性：过滤项
	 */
	public final static String PREDEFINEDFIELD_FILTER = "FILTER";
	
	/**
	 * 获取版本数据实体运行时
	 * @return
	 */
	IDataEntityRuntime getVersionDataEntityRuntime();
	
	
	
	/**
	 * 是否支持指定行为
	 * @param strActionName
	 * @param iPSDEAction
	 * @param args
	 * @return
	 */
	boolean isEnableAction(String strActionName, IPSDEAction iPSDEAction, Object[] args);
	
	
	
	
	
	/**
	 * 执行行为
	 * @param iPSDEAction
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable;
	
	
	
	/**
	 * 是否支持指定数据集
	 * @param strDataSetName
	 * @param iPSDEDataSet
	 * @param args
	 * @return
	 */
	boolean isEnableDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args);
	
	
	
	/**
	 * 获取结果集合
	 * @param iPSDEDataSet
	 * @param args
	 * @param actionData
	 * @return
	 * @throws Throwable
	 */
	Page fetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable;
	
	
	/**
	 * 获取指定版本数据
	 * @param key 主键
	 * @param objVersionId
	 * @return
	 * @throws Throwable
	 */
	IEntityBase get(Object key, Object objVersionId) throws Throwable;
	
	
	
	
	
	/**
	 * 提交传入父数据及关系的相关数据
	 * @param parentData
	 * @param iPSDERBase
	 * @param versionId
	 */
	void commit(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId);
	
	
	/**
	 * 恢复传入父数据及关系的相关数据
	 * @param parentData
	 * @param iPSDERBase
	 * @param versionId
	 */
	void restore(IEntityBase parentData, IPSDERBase iPSDERBase, Object versionId);
}
