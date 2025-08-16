package net.ibizsys.central.dataentity.util;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体版本控制功能组件运行时对象
 * @author lionlau
 *
 */
public interface IDEVersionControlUtilRuntime extends IDEUtilRuntime {

//	/**
//	 * 版本标识分隔项
//	 */
//	public final static String SEPARATOR_VERSIONID = "__SRFVERSIONID__"; 
	
	
	/**
	 * 功能参数：自动提交
	 */
	public final static String PARAM_AUTOCOMMIT = "autocommit";
	
	
	/**
	 * 行为扩展参数：指定版本
	 */
	public final String ACTION_ARG_VERSIONID = "SRFVERSIONID";
	
	
	/**
	 * 行为扩展参数：指定版本
	 */
	public final String DATASET_ARG_VERSIONID = "SRFVERSIONID";
	
	
	
	
	/**
	 * 预定义属性：名称，文本。存储版本的名称
	 */
	public final static String PREDEFINEDFIELD_NAME = "NAME";
	
	
//	/**
//	 * 预定义属性：版本，整数行。存储数据的变化版本，从1开始
//	 */
//	public final static String PREDEFINEDFIELD_VERSION = "VERSION";
	
	
	/**
	 * 预定义属性：数据，长文本。存储数据的序列化值
	 */
	public final static String PREDEFINEDFIELD_DATA = "DATA";
	
	
	/**
	 * 预定义属性：手动建立，是否（1：0）。存储版本是否为手动建立
	 */
	public final static String PREDEFINEDFIELD_MANUAL = "MANUAL";
	
	/**
	 * 预定义属性：当前版本，是否（1：0）。存储版本是否为当前版本
	 */
	public final static String PREDEFINEDFIELD_CURRENT = "CURRENT";
	
	/**
	 * 预定义属性：支持恢复，是否（1：0）。存储版本是否为支持恢复
	 */
	public final static String PREDEFINEDFIELD_RESTORABLE = "RESTORABLE";
	
	/**
	 * 预定义属性：提交消息
	 */
	public final static String PREDEFINEDFIELD_MESSAGE = "MESSAGE";
	
	
	/**
	 * 是否签入版本
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	boolean isCommit(String strActionName, IPSDEAction iPSDEAction);
	
	
	/**
	 * 准备版本提交
	 * @param iEntityBase
	 * @param strActionName
	 * @param iPSDEAction
	 * @return
	 */
	Object prepare(IEntityBase iEntityBase, String strActionName, IPSDEAction iPSDEAction);
	
	
	/**
	 * 准备版本提交（手动）
	 * @param iEntityBase
	 * @param versionData
	 * @return
	 */
	Object prepare(IEntityBase iEntityBase, Object versionData);
	

	/**
	 * 提交建立新版本
	 * @param iEntityBase
	 * @param versionData
	 * @return
	 */
	Object commit(IEntityBase iEntityBase, Object versionData);
	
	

	/**
	 * 提交建立新版本
	 * @param iEntityBase
	 * @param versionData
	 * @param bManual 手动签入
	 * @return
	 */
	Object commit(IEntityBase iEntityBase, Object versionData, boolean bManual);
	
	
	
	/**
	 * 提交修复新版本
	 * @param iEntityBase
	 * @param versionData
	 * @param bManual 手动签入
	 * @return
	 */
	Object fixCommit(IEntityBase iEntityBase, Object versionData, boolean bManual);
	
	
	/**
	 *恢复指定版本数据
	 * @param iEntityBase 当前版本数据
	 * @param restoreVersionId 恢复的版本数据
	 * @param versionData
	 * @return
	 */
	Object restore(IEntityBase iEntityBase, Object restoreVersionId, Object versionData);
	
	
	/**
	 * 获取版本实体运行时
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
	 * 获取指定版本数据
	 * @param objVersionId
	 * @return
	 * @throws Throwable
	 */
	IEntityBase get(Object objVersionId) throws Throwable;
	
	
	
	
	
	/**
	 * 判断指定数据的版本标识是否为当前版本
	 * @param key
	 * @param strVersionId
	 * @return
	 */
	boolean isCurrentVersionId(Object key, Object strVersionId);
}
