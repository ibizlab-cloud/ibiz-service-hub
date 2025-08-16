package net.ibizsys.central.util.groovy;

import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.eai.ISysEAIAgentRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.script.IScriptList;
import net.ibizsys.central.util.script.IScriptPage;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IWebContext;

public interface ISystemRTGroovyContext extends net.ibizsys.runtime.util.groovy.ISystemRTGroovyContext{

	/**
	 * 当前系统运行时对象
	 */
	final static String MODELTYPE_SYS = "sys";
	
	/**
	 * 系统功能组件
	 */
	final static String MODELTYPE_UTIL = "util";
	
	final static String MODELTYPE_WEBCLIENT = "webclient";
	
	final static String MODELTYPE_DATAENTITY = "dataentity";
	
	final static String MODELTYPE_SUBSYSAPI = "subsysapi";
	
	final static String MODELTYPE_API = "api";
	
	final static String MODELTYPE_LOGIC = "logic";
	
	final static String MODELTYPE_PLUGIN = "plugin";
	
	final static String MODELTYPE_CODELIST = "codelist";
	
	final static String MODELTYPE_SEQUENCE = "sequence";
	
	final static String MODELTYPE_TRANSLATOR = "translator";
	
	final static String MODELTYPE_EAIAGENT = "eaiagent";
	
	final static String MODELTYPE_DATASYNCAGENT = "datasyncagent";
	
	final static String MODELTYPE_DBSCHEMA = "dbschema";
	
	final static String MODELTYPE_DBSCHEME = "dbscheme";
	
	final static String MODELTYPE_RESOURCE = "resource";
	
	/**
	 * 后台运行时插件
	 */
	final static String MODELTYPE_SFPLUGIN = "sfplugin";
	
	/**
	 * 模型类型：实体服务对象
	 */
	final static String MODELTYPE_DESERVICE = "deservice";
	
	
	final static String MODELTYPE_BDSCHEMA = "bdschema";
	
	final static String MODELTYPE_BDSCHEME = "bdscheme";
	
	final static String MODELTYPE_BISCHEMA = "bischema";
	
	final static String MODELTYPE_BISCHEME = "bischeme";
	
	final static String MODELTYPE_SEARCHSCHEMA = "searchschema";
	
	final static String MODELTYPE_SEARCHSCHEME = "searchscheme";
	
	/**
	 * 运行参数
	 */
	final static String MODELTYPE_PARAM = "param";
	
	/**
	 * 运行配置
	 */
	final static String MODELTYPE_CONFIG = "config";
	
	
	/**
	 * 获取默认Web客户端对象
	 * @return
	 */
	IWebClient webclient();
	
	
	/**
	 * 获取外部服务接口客户端对象
	 * @param tag
	 * @return
	 */
	IWebClient webclient(String tag);
	
	
	
	
	/**
	 * 获取系统功能组件运行时对象
	 * @param tag
	 * @return
	 */
	ISysUtilRuntime util(String tag);
	
	
	
	/**
	 * 获取实体运行时对象
	 * @param tag
	 * @return
	 */
	IDataEntityRuntime dataentity(String tag);
	
	
	/**
	 * 获取实体服务对象
	 * @param tag
	 * @return
	 */
	IDEService deservice(String tag);
	
	/**
	 * 获取外部服务接口
	 * @param tag
	 * @return
	 */
	ISubSysServiceAPIRuntime subsysapi(String tag);
	
	
	/**
	 * 获取常规数据对象
	 * @return
	 */
	IEntity entity();
	
	
	/**
	 * 获取实体数据对象
	 * @param tag
	 * @return
	 */
	IEntityDTO entity(String tag);
	
	
	/**
	 * 获取实体查询过滤对象
	 * @param tag
	 * @return
	 */
	ISearchContextDTO filter(String tag);
	
	
	
	/**
	 * 获取系统预置逻辑运行时对象
	 * @param tag
	 * @return
	 */
	ISysLogicRuntime logic(String tag);
	
	
	/**
	 * 获取系统代码表运行时对象
	 * @param tag
	 * @return
	 */
	ICodeListRuntime codelist(String tag);
	
	
	
	/**
	 * 获取系统值序列运行时对象
	 * @param tag
	 * @return
	 */
	ISysSequenceRuntime sequence(String tag);
	
	
	/**
	 * 获取系统值转换器运行时对象
	 * @param tag
	 * @return
	 */
	ISysTranslatorRuntime translator(String tag);
	
	
	
	/**
	 * 获取系统数据同步代理运行时对象
	 * @param tag
	 * @return
	 */
	ISysDataSyncAgentRuntime datasyncagent(String tag);
	
	
	/**
	 * 获取系统应用集成代理运行时对象
	 * @param tag
	 * @return
	 */
	ISysEAIAgentRuntime eaiagent(String tag);
	
	
	
	
	/**
	 * 获取系统数据库体系
	 * @param tag
	 * @return
	 */
	ISysDBSchemeRuntime dbschema(String tag);
	
	
	/**
	 * 获取系统数据库体系
	 * @param tag
	 * @return
	 */
	ISysDBSchemeRuntime dbscheme(String tag);
	
	
	/**
	 * 获取系统大数据库体系
	 * @param tag
	 * @return
	 */
	ISysBDSchemeRuntime bdschema(String tag);
	
	
	/**
	 * 获取系统大数据库体系
	 * @param tag
	 * @return
	 */
	ISysBDSchemeRuntime bdscheme(String tag);
	
	
	/**
	 * 获取系统智能报表体系
	 * @param tag
	 * @return
	 */
	ISysBISchemeRuntime bischema(String tag);
	
	
	/**
	 * 获取系统智能报表体系
	 * @param tag
	 * @return
	 */
	ISysBISchemeRuntime bischeme(String tag);
	
	
	
	/**
	 * 获取系统全文检索体系
	 * @param tag
	 * @return
	 */
	ISysSearchSchemeRuntime searchschema(String tag);
	
	
	/**
	 * 获取系统全文检索体系
	 * @param tag
	 * @return
	 */
	ISysSearchSchemeRuntime searchscheme(String tag);
	
	
	/**
	 * 获取系统资源运行时对象
	 * @param tag
	 * @return
	 */
	ISysResourceRuntime resource(String tag);
	
	
	/**
	 * 获取系统后台插件运行时对象
	 * @param tag
	 * @return
	 */
	ISysSFPluginRuntime sfplugin(String tag);
	
	
	/**
	 * 获取系统插件对象（单例）
	 * @param tag
	 * @return
	 */
	Object plugin(String tag);
	
//	/**
//	 * 获取系统插件对象（单例）
//	 * @param tag
//	 * @param newInstance 是否新建实例
//	 * @return
//	 */
//	Object plugin(String tag, boolean newInstance);
//	
	
	
	/**
	 * 建立系统插件对象
	 * @param tag
	 * @return
	 */
	Object create(String tag);
	
	

	/**
	 * 获取系统配置
	 * @param strKey
	 * @param defValue
	 * @return
	 */
	Object config(String strKey, Object defValue);
	
	
	/**
	 * 获取系统参数配置
	 * @param strKey
	 * @param defValue
	 * @return
	 */
	Object param(String strKey, Object defValue);
	
	
	/**
	 * 获取系统配置
	 * @param strKey
	 * @return
	 */
	Object config(String strKey);
	
	
	/**
	 * 获取系统参数配置
	 * @param strKey
	 * @return
	 */
	Object param(String strKey);
	
	
	
	/**
	 * 获取当前用户上下文
	 * @return
	 */
	IUserContext user();
	
	
	
	/**
	 * 获取导航上下文对象
	 * @return
	 */
	IAppContext context();
	
	
	/**
	 * 获取Web请求上下文对象
	 * @return
	 */
	IWebContext request();
	
	
	/**
	 * 获取Web请求上下文对象
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IWebContext request(boolean bTryMode);
	
	
	/**
	 * 获取当前操作会话
	 * @return
	 */
	ActionSession session();
	
	
	/**
	 * 获取当前操作会话
	 * @param bTryMode 尝试模式
	 * @return
	 */
	ActionSession session(boolean bTryMode);
	
	
//	/**
//	 * 输出系统运行调试信息
//	 * @param sender 发送者
//	 * @param strInfo 一般信息
//	 */
//	void debug(Object... infos);
	
	/**
	 * 输出系统运行一般信息
	 * @param info 一般信息
	 */
	void info(String info);
	
	
	
	/**
	 * 输出系统运行警告信息
	 * @param infos 警告信息
	 */
	void warn(String info);
	
	
	
	/**
	 * 输出系统运行错误信息
	 * @param infos 错误信息
	 */
	void error(String info);
	
	
	
	
	/**
	 * 输出随机数
	 * @param nMax
	 * @return
	 */
	int random(int nMax);
	
	
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @return
	 */
	IScriptList list();
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @param obj 
	 * @return
	 */
	IScriptList list(Object obj);
	
	/**
	 * 获取通用列表的脚本调用对象
	 * @param obj 
	 * @param data 序列化数据
	 * @return
	 */
	IScriptList list(Object obj, Object data);
	
	
	/**
	 * 获取通用分页结果的脚本调用对象
	 * @return
	 */
	IScriptPage page();
	
	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj 
	 * @return
	 */
	IScriptPage page(Object obj);
	

	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj 
	 * @param data 序列化数据
	 * @return
	 */
	IScriptPage page(Object obj, Object data);

	/**
	 * 获取通用分页结果的脚本调用对象
	 * @param obj
	 * @param data 序列化数据
	 * @param pageNo 页码
	 * @param size 每页行数
	 * @return
	 */
	IScriptPage page(Object obj, Object data, int pageNo, int size);
}
