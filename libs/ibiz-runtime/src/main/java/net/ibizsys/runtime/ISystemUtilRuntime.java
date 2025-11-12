package net.ibizsys.runtime;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import groovy.lang.GroovyClassLoader;
import groovy.text.Template;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.plugin.IRuntimeObjectFactory;
import net.ibizsys.runtime.plugin.ModelRTScriptBase;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.script.IScriptEntity;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 系统功能运行时接口
 * @author lionlau
 *
 */
public interface ISystemUtilRuntime {

	/**
	 * 日志级别，调试
	 */
	final static int LOGLEVEL_TRACE = 5000;
	
	/**
	 * 日志级别，调试
	 */
	final static int LOGLEVEL_DEBUG = 10000;
	
	/**
	 * 日志级别，信息
	 */
	final static int LOGLEVEL_INFO = 20000;
	
	/**
	 * 日志级别，警告
	 */
	final static int LOGLEVEL_WARN = 30000;
	
	/**
	 * 日志级别，错误
	 */
	final static int LOGLEVEL_ERROR = 40000;
	
	/**
	 * 日志级别，致命
	 */
	final static int LOGLEVEL_FATAL = 50000;
	
	/**
	 * 脚本引擎，JavaScript
	 */
	final static String SCRIPTENGINE_JAVASCRIPT = "JavaScript";
	
	
	/**
	 * 脚本引擎，Groovy
	 */
	final static String SCRIPTENGINE_GROOVY = "Groovy";
	
	
	/**
	 * 脚本代码宏，Groovy
	 */
	final static String SCRIPTMACRO_GROOVY = "/*Groovy*/";
	
	/**
	 * 脚本代码宏，Groovy
	 */
	final static String SCRIPTMACRO_GROOVY2 = "//Groovy";
	
	/**
	 * 脚本代码宏，JavaScript
	 */
	final static String SCRIPTMACRO_JAVASCRIPT = "/*JavaScript*/";
	
	
	/**
	 * 脚本代码宏，JavaScript
	 */
	final static String SCRIPTMACRO_JAVASCRIPT2 = "//JavaScript";
	
	/**
	 * 转化实际值
	 * @param nDataType
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	Object convertValue(int nDataType, String strValue) throws Exception;
	
	
	/**
	 * 转化实际值
	 * @param nDataType
	 * @param value
	 * @return
	 * @throws Exception
	 */
	Object convertValue(int nDataType, Object value) throws Exception;
	
	
	/**
	 * 转化实际列表值
	 * @param nDataType
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	List convertListValue(int nDataType, String strValue) throws Exception;
	
	
	/**
	 * 转化实际列表值
	 * @param nDataType
	 * @param value
	 * @return
	 * @throws Exception
	 */
	List convertListValue(int nDataType, Object value) throws Exception;
	
	
	
	/**
	 * 测试值条件
	 * @param objSrcValue
	 * @param strOp
	 * @param objDstValue
	 * @param nValueDataType
	 * @return
	 */
	boolean testValueCond(Object objSrcValue, String strOp, Object objDstValue, int nValueDataType);
	
	
	
	/**
	 * 对比值
	 * @param objSrcValue
	 * @param objDstValue
	 * @param nValueDataType
	 * @return
	 */
	long compareValue(Object objSrcValue, Object objDstValue, int nValueDataType);
	

	/**
	 * 建立系统值规则运行时对象
	 * @param iPSSysValueRule
	 * @return
	 */
	ISysValueRuleRuntime createSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule);
	
	
	/**
	 * 建立系统值序列运行时对象
	 * @param iPSSysSequence
	 * @return
	 */
	ISysSequenceRuntime createSysSequenceRuntime(IPSSysSequence iPSSysSequence);
	
	
	
	/**
	 * 建立系统值转换器运行时对象
	 * @param iPSSysTranslator
	 * @return
	 */
	ISysTranslatorRuntime createSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator);
	
	
	
	/**
	 * 建立系统功能运行时对象
	 * @param iPSSysUtil
	 * @return
	 */
	ISysUtilRuntime createSysUtilRuntime(IPSSysUtil iPSSysUtil);
	
	
	/**
	 * 建立系统代码表运行时对象
	 * @param iPSCodeList
	 * @return
	 */
	ICodeListRuntime createCodeListRuntime(IPSCodeList iPSCodeList);
	
	
	/**
	 * 建立系统数据同步代理运行时对象
	 * @param iPSSysDataSyncAgent
	 * @return
	 */
	ISysDataSyncAgentRuntime createSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent);
	
	
	
	/**
	 * 建立系统通知代理运行时对象
	 * @return
	 */
	ISysNotifyAgentRuntime createSysNotifyAgentRuntime();
	
	
	
	/**
	 * 建立系统消息队列运行时对象
	 * @param iPSSysMsgQueue
	 * @return
	 */
	ISysMsgQueueRuntime createSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue);
	
	
	
	/**
	 * 建立系统消息模板运行时对象
	 * @param iPSSysMsgTempl
	 * @return
	 */
	ISysMsgTemplRuntime createSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl);
	
	
	/**
	 * 建立系统消息目标运行时对象
	 * @param iPSSysMsgTarget
	 * @return
	 */
	ISysMsgTargetRuntime createSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget);
	
	
	/**
	 * 建立系统值函数运行时对象
	 * @param iPSSysValueFunc
	 * @return
	 */
	ISysValueFuncRuntime createSysValueFuncRuntime(IPSSysDBValueFunc iPSSysDBValueFunc);
	
	
	/**
	 * 建立系统逻辑运行时对象
	 * @param iPSSysLogic
	 * @return
	 */
	ISysLogicRuntime createSysLogicRuntime(IPSSysLogic iPSSysLogic);
	
	
	/**
	 * 建立工作流角色运行时对象
	 * @param iPSWFRole
	 * @return
	 */
	IWFRoleRuntime createWFRoleRuntime(IPSWFRole iPSWFRole);
	
	
	/**
	 * 日志信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	void log(int nLogLevel,String strCat,String strInfo,Object objData);
	
	
	/**
	 * 日志常规信息
	 * @param cat
	 * @param strInfo
	 */
	void info(Object cat,String strInfo);
	
	/**
	 * 日志警告信息
	 * @param cat
	 * @param strInfo
	 */
	void warn(Object cat,String strInfo);
	
	/**
	 * 日志错误信息
	 * @param cat
	 * @param strInfo
	 */
	void error(Object cat,String strInfo);
	
	/**
	 * 日志系统审计信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param strPersonId
	 * @param strAddress
	 * @param objData
	 */
	void logAudit(int nLogLevel,String strCat,String strInfo,String strPersonId, String strAddress, Object objData);
	
	
	/**
	 * 日志系统事件信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	void logEvent(int nLogLevel,String strCat,String strInfo,Object objData);
	
	

	/**
	 *  日志系统信息优化信息
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param strDEName
	 * @param strAction
	 * @param nTime
	 * @param objData
	 */
	void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData);
	
	
	/**
	 * 	安装基础数据
	 * @param 安装模式
	 */
	void installBaseDatas(String strMode);
	
	
	/**
	 * 	安装示例数据
	 * @param 安装模式
	 */
	void installSampleDatas(String strMode);
	
	
	/**
	 * 	安装测试数据
	 * @param 安装模式
	 */
	void installTestDatas(String strMode);
	
	
	
	/**
	 * 执行Sql
	 * @param strDSLink 数据链路
	 * @param strSql
	 * @param param
	 * @return 返回受影响的记录数
	 * @throws Exception
	 */
	int executeSql(String strDSLink,String strSql,Object param)throws Exception;
	
	
	
	/**
	 * 查询Sql返回结果集
	 * @param strDSLink 数据链路
	 * @param strSql
	 * @param param
	 * @return 返回结果集
	 * @throws Exception
	 */
	java.sql.ResultSet executeSqlQuery(String strDSLink,String strSql,Object param)throws Exception;
	
	
	
	
	/**
	 * 测试当前用户是否具备指定统一资源标识
	 * @param strUniResCode
	 * @return
	 */
	boolean testUniRes(String strUniResCode);
	
	
	
	
	/**
	 * 获取当前系统的报表存放目录
	 * @return
	 */
	String getReportFolder();
	
	
	/**
	 * 获取当前系统的字体存放目录
	 * @return
	 */
	String getFontFolder();
	
	
	/**
	 * 获取当前系统的临时文件存放目录
	 * @return
	 */
	String getTempFolder();
	

	/**
	 * 获取当前系统的文件存放目录
	 * @return
	 */
	String getFileFolder();
	
	
	/**
	 * 线程运行
	 * @param runnable
	 */
	void threadRun(java.lang.Runnable runnable);
	
	
	/**
	 * 线程运行
	 * @param runnable
	 * @param nTime 预期运行时间（毫秒），-1 为立刻执行
	 */
	void threadRun(java.lang.Runnable runnable, long nTime);
	
	
	/**
	 * 线程运行
	 * @param runnable
	 * @param nTime 预期运行时间（毫秒），-1 为立刻执行
	 * @param strTaskName 任务名称
	 */
	void threadRun(java.lang.Runnable runnable, long nTime, String strTaskName);
	
	
	/**
	 * 取消线程运行
	 * @param strTaskName
	 */
	void threadCancel(String strTaskName);
	
	
	/**
	 * 线程运行，需要全部完成
	 * @param actions
	 * @param bIgnoreException //忽略异常
	 * @return
	 * @throws Throwable
	 */
	Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException) throws Throwable;
	
	
	/**
	 * 线程运行，需要全部完成
	 * @param actions
	 * @param bIgnoreException
	 * @param env
	 * @return
	 * @throws Throwable
	 */
	Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException, Object env) throws Throwable;
	
	/**
	 * 异步运行作业
	 * @param iAction
	 * @param args
	 * @param actionTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncExecute(IAction iAction, Object[] args, Object actionTag) throws Throwable;
	
	
	/**
	 * 服务端异步运行作业
	 * @param iAction
	 * @param args
	 * @param actionTag
	 * @param nTimeout
	 * @return
	 * @throws Throwable
	 */
	Object sseExecute(IAction iAction, Object[] args, Object actionTag, long nTimeout) throws Throwable;
	
	/**
	 * 执行用户上下文行为
	 * @param iAction
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeUserContextAction(IAction iAction, Object[] args) throws Throwable;
	
	
	/**
	 * 执行用户上下文行为（如果当前用户上下文无效，使用传入上下文）
	 * @param iAction
	 * @param args
	 * @param iUserContext
	 * @return
	 * @throws Throwable
	 */
	Object executeUserContextActionIf(IAction iAction, Object[] args) throws Throwable;
	
	
	/**
	 * 执行用户上下文行为
	 * @param iAction
	 * @param args
	 * @param iUserContext
	 * @return
	 * @throws Throwable
	 */
	Object executeUserContextAction(IAction iAction, Object[] args, IUserContext iUserContext) throws Throwable;
	
	
	/**
	 * 执行用户上下文行为（如果当前用户上下文无效，使用传入上下文）
	 * @param iAction
	 * @param args
	 * @param iUserContext
	 * @return
	 * @throws Throwable
	 */
	Object executeUserContextActionIf(IAction iAction, Object[] args, IUserContext iUserContext) throws Throwable;
	
	
	/**
	 * 建立系统后台插件运行时对象
	 * @param iPSSysSFPlugin
	 * @return
	 */
	ISysSFPluginRuntime createSysSFPluginRuntime(IPSSysSFPlugin iPSSysSFPlugin);
	
	
	
	/**
	 * 建立系统异步处理队列运行时对象
	 * @param iPSSysDTSQueue
	 * @return
	 */
	ISysDTSQueueRuntime createSysDTSQueueRuntime(IPSSysDTSQueue iPSSysDTSQueue);
	
	
	
	/**
	 * 获取运行时插件对象
	 * @param iPSSysSFPlugin
	 * @param cls
	 * @param bNewInstance
	 * @return
	 */
	<T> T getRuntimeObject(IPSSysSFPlugin iPSSysSFPlugin, Class<T> cls, boolean bNewInstance);
	
	
	/**
	 * 获取运行时插件对象
	 * @param cls
	 * @param strType
	 * @return
	 */
	<T> T getRuntimeObject(Class<T> cls, String strType);
	
	
	
	/**
	 * 获取运行时插件对象
	 * @param strPluginTag
	 * @param cls
	 * @param bNewInstance
	 * @param bTryMode
	 * @return
	 */
	<T> T getRuntimeObject(String strPluginTag, Class<T> cls, boolean bNewInstance, boolean bTryMode);
	
	/**
	 * 获取指定插件集合
	 * @param cls
	 * @return
	 */
	<T> Map<String, T> getRuntimeObjects(Class<T> cls);
	
	
	/**
	 * 获取指定插件集合（指定类型前缀）
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getRuntimeObjects(Class<T> cls, String strTypePrefix);
	
	
	
	/**
	 * 获取系统的运行时对象工厂
	 * @return
	 */
	IRuntimeObjectFactory getRuntimeObjectFactory();
	
	/**
	 * 建立数据对象
	 * @return
	 */
	IEntity createEntity();
	
	
	/**
	 * 建立数据对象
	 * @param source 数据源
	 * @return
	 */
	IEntity createEntity(Object source);
	
	/**
	 * 建立数据对象
	 * @param source 数据源
	 * @param bLowerCaseFieldName 将属性名称转换至小写
	 * @return
	 */
	IEntity createEntity(Object source, boolean bLowerCaseFieldName);
	
	
	/**
	 * 建立脚本调用数据对象
	 * @param iEntity
	 * @return
	 */
	IScriptEntity createScriptEntity(IEntity iEntity);
	
	

	
	/**
	 * 将序列化对象到数据
	 * @param iEntityBase
	 * @return
	 */
	Object serialize(Object obj); 
	
	
	/**
	 * 将数据反序列化到对象
	 * @param objData
	 * @param cls 类型
	 * @return
	 */
	<T> T deserialize(Object objData, Class<T> cls);
	
	
	/**
	 * 将数据反序列化到对象
	 * @param objData
	 * @param type
	 * @return
	 */
	<T> T deserialize(Object objData, TypeReference<T> type);
	
	

	/**
	 * 建立默认的用户上下文对象
	 * @return
	 */
	IUserContext createDefaultUserContext();
	
	
	/**
	 * 建立匿名用户上下文对象
	 * @return
	 */
	IUserContext createAnonymousUserContext();
	
	/**
	 * 获取传入脚本代码使用的引擎
	 * @param strScriptCode
	 * @return
	 */
	String getScriptEngine(String strScriptCode);
	
	
	/**
	 * 获取默认脚本引擎
	 * @return
	 */
	String getDefaultScriptEngine();
	

	/**
	 * 自动装配对象
	 * @param object
	 */
	void autowareObject(Object object);
	
	
	
	/**
	 * 建立运行时对象，并进行自动装配
	 * @param cls 类型
	 * @param strObjectName
	 * @return
	 */
	<T> T createObject(Class<T> cls, String strObjectName);
	
	

	/**
	 * 建立运行时对象，并进行自动装配
	 * @param cls 类型
	 * @param objectCls
	 * @return
	 */
	<T> T createObject(Class<T> cls, Class<?> objectCls);
	
	
	/**
	 * 建立模型运行时脚本对象
	 * @param owner
	 * @param strScriptCode
	 * @return
	 */
	IModelRTScript createModelRTScript(Object owner, String strScriptCode);
	
	
	/**
	 * 建立模型运行时脚本对象
	 * @param owner
	 * @param strScriptCode
	 * @param cls
	 * @return
	 */
	<T> T createModelRTScript(Object owner, String strScriptCode, Class<? extends ModelRTScriptBase> cls);
	
	
	
	/**
	 * 写入Json字符串
	 * @param value
	 * @param strJsonFormat
	 * @return
	 * @throws Exception
	 */
	String writeValue(int nStdDataType, Object value, String strJsonFormat) throws Exception;
	
	
	
	/**
	 * 读取Json字符串
	 * @param nStdDataType
	 * @param strValue
	 * @param strJsonFormat
	 * @return
	 * @throws Exception
	 */
	Object readValue(int nStdDataType, String strValue, String strJsonFormat) throws Exception;
	
	
	
	/**
	 * 获取指定属性的值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	Object getFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	/**
	 * 设置指定属性的值
	 * @param objEntity
	 * @param strFieldName
	 * @param objValue
	 */
	void setFieldValue(IEntityBase iEntityBase, String strFieldName, Object objValue);
	
	
	
	/**
	 * 判断是否包括指定属性值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	boolean containsFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	/**
	 * 重置指定属性值
	 * @param objEntity
	 * @param strFieldName
	 * @return
	 */
	void resetFieldValue(IEntityBase iEntityBase, String strFieldName);
	
	
	
	/**
	 * 获取Groovy动态类加载对象
	 * @return
	 */
	GroovyClassLoader getGroovyClassLoader();
	
	/**
	 * 注册模型运行时可关闭对象
	 * @param iModelRuntimeShutdownable
	 */
	void registerModelRuntimeShutdownable(IModelRuntimeShutdownable iModelRuntimeShutdownable);
	
	
	
	/**
	 * 注销模型运行时可关闭对象
	 * @param iModelRuntimeShutdownable
	 */
	void unregisterModelRuntimeShutdownable(IModelRuntimeShutdownable iModelRuntimeShutdownable);
	
	
	
	
	/**
	 * 获取系统运行时插件
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix);
	
	
	
	
	/**
	 * 获取Groovy模板
	 * @param strContent
	 * @return
	 */
	Template getGroovyTemplate(String strContent) throws Exception;
}
