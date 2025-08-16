package net.ibizsys.runtime;

import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityEventListener;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.system.ISystemModuleUtilRuntime;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.runtime.util.script.ISystemRTScriptContext;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 系统模型对象接口
 * @author lionlau
 *
 */
public interface ISystemRuntime extends ISystemRuntimeBase,ISystemUtilRuntime{

	/**
	 * 系统事件：系统已经加载
	 */
	public final static String SYSTEMEVENT_LOAD = "LOAD";
	

	/**
	 * 实体事件侦听器前缀
	 */
	public final static String ADDIN_DATAENTITYEVENTLISTENER_PREFIX = "DATAENTITYEVENTLISTENER:";
	
	
	/**
	 * 实体行为逻辑附加前缀
	 */
	public final static String ADDIN_DEACTIONLOGIC_PREFIX = "DEACTIONLOGIC:";
	
	
	/**
	 * 模型运行时提供器前缀
	 */
	public final static String ADDIN_MODELRUNTIMEPROVIDER_PREFIX = "MODELRUNTIMEPROVIDER:";
	
	
	/**
	 * 获取系统是否已经启动
	 * @return
	 */
	boolean isLoaded();
	
	
	/**
	 * 获取加载时间
	 * @return
	 */
	java.util.Date getLoadedDate();
	
	/**
	 * 获取系统运行时设置
	 * @return
	 */
	ISystemRuntimeSetting getSystemRuntimeSetting();
	
	/**
	 * 注册实体对象
	 * @param iDataEntity
	 * @throws Exception
	 */
	void registerDataEntityRuntime(IDataEntityRuntime iDataEntity);
	
	
	
	/**
	 * 获取指定实体运行时对象
	 * @param strIdOrName
	 * @return
	 * @throws Exception
	 */
	IDataEntityRuntime getDataEntityRuntime(String strIdOrName);
	
	
	/**
	 * 获取指定实体运行时对象
	 * @param strIdOrName
	 * @param bTryMode 
	 * @return
	 * @throws Exception
	 */
	IDataEntityRuntime getDataEntityRuntime(String strIdOrName, boolean bTryMode);
	
	
	/**
	 * 获取动态实例运行时对象
	 * @param strDynaInstId
	 * @return
	 * @throws Exception
	 */
	IDynaInstRuntime getDynaInstRuntime(String strDynaInstId);
	
	
	
	/**
	 * 刷新动态实例
	 * @param strDynaInstId
	 * @throws Exception
	 */
	void refreshDynaInst(String strDynaInstId);
	
	
	
	
	
	/**
	 * 获取系统运行时脚本上下文对象
	 * @return
	 */
	ISystemRTScriptContext getSystemRTScriptContext();
	
	
	
	/**
	 * 获取指定标记的系统功能运行时对象
	 * @param strTag
	 * @return
	 */
	ISysUtilRuntime getSysUtilRuntime(String strTag) ;
	
	
	
	/**
	 * 获取指定类型系统功能运行时对象
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	<T> T getSysUtilRuntime(Class<T> cls, boolean bTryMode) ;
	
	
	
	
	/**
	 * 获取指定标记的系统功能运行时对象
	 * @param strTag
	 * @param bTryMode 
	 * @return
	 */
	ISysUtilRuntime getSysUtilRuntime(String strTag, boolean bTryMode) ;
	
	
	
	/**
	 * 获取指定标记的系统值函数运行时对象
	 * @param strTag
	 * @return
	 */
	ISysValueFuncRuntime getSysValueFuncRuntime(String strTag) ;
	
	
	
	/**
	 * 获取系统后台插件运行时对象
	 * @param strTag
	 * @return
	 */
	ISysSFPluginRuntime getSysSFPluginRuntime(String strTag);
	
	
	/**
	 * 获取系统后台插件运行时对象
	 * @param strTag
	 * @param bTryMode 尝试模式
	 * @return
	 */
	ISysSFPluginRuntime getSysSFPluginRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 重新加载系统后台插件运行时对象
	 * @param iPSSysSFPlugin
	 * @return
	 */
	ISysSFPluginRuntime reloadSysSFPluginRuntime(IPSSysSFPlugin iPSSysSFPlugin);
	
	
	
	/**
	 * 获取系统后台插件运行时对象集合
	 * @return
	 */
	java.util.Collection<ISysSFPluginRuntime> getSysSFPluginRuntimes();
	
	
	/**
	 * 获取部署系统标识
	 * @return
	 */
	String getDeploySystemId();
	
	
	
	
	/**
	 * 获取代码表运行时
	 * @param strTag
	 * @return
	 */
	ICodeListRuntime getCodeListRuntime(String strTag);
	
	
	/**
	 * 获取代码表运行时
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ICodeListRuntime getCodeListRuntime(String strTag, boolean bTryMode);
	
	
	

	/**
	 * 获取系统文件存储功能运行时对象
	 * @return
	 */
	ISysFileUtilRuntime getSysFileUtilRuntime();
	
	
	/**
	 * 获取系统文件存储功能运行时对象
	 * @param bTryMode 尝试获取
	 * @return
	 */
	ISysFileUtilRuntime getSysFileUtilRuntime(boolean bTryMode);
	
	
	/**
	 * 触发系统事件
	 * @param event
	 * @param params
	 */
	void fireSystemEvent(String event, Object[] params);
	
	/**
	 * 增加配置侦听器对象
	 * @param listener
	 */
    void registerSystemEventListener(ISystemEventListener listener);
    
	/**
	 * 增加配置侦听器对象
	 * @param listener
	 * @param events
	 */
    void registerSystemEventListener(ISystemEventListener listener, String[] events);
    
    
    /**
     * 移除配置侦听器对象
     * @param listener
     */
    void unregisterSystemEventListener(ISystemEventListener listener);
	

    /**
	 * 获取系统运行时Groovy上下文对象
	 * @return
	 */
	ISystemRTGroovyContext getSystemRTGroovyContext();
	
	
	
	
	/**
	 * 获取系统预置逻辑运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysLogicRuntime getSysLogicRuntime(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取系统值转换器运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysTranslatorRuntime getSysTranslatorRuntime(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取系统值序列运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysSequenceRuntime getSysSequenceRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取系统数据同步代理运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysDataSyncAgentRuntime getSysDataSyncAgentRuntime(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取系统消息模板运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysMsgTemplRuntime getSysMsgTemplRuntime(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取系统消息目标运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysMsgTargetRuntime getSysMsgTargetRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取系统消息队列运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysMsgQueueRuntime getSysMsgQueueRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 增加配置侦听器对象
	 * @param dataEntityTags 实体标记集合
	 * @param listener
	 */
    void registerDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener);
    
	/**
	 * 增加配置侦听器对象
	 * @param dataEntityTags 实体标记集合
	 * @param listener
	 * @param events
	 */
    void registerDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener, String[] events);
    
    
    /**
         * 移除配置侦听器对象
     * @param dataEntityTags 实体标记集合
     * @param listener
     */
    void unregisterDataEntityEventListener(String[] dataEntityTags, IDataEntityEventListener listener);
    
    
    
    /**
     * 获取系统模块功能运行时对象
     * @param strTag
     * @param bTryMode
     * @return
     */
    ISystemModuleUtilRuntime getSystemModuleUtilRuntime(String strTag, boolean bTryMode);
    
    
    /**
	 * 获取系统值规则运行时对象
	 * @param strTag
     * @param bTryMode
	 * @return
	 */
	ISysValueRuleRuntime getSysValueRuleRuntime(String strTag, boolean bTryMode);
	
	
	/**
	 * 获取工作流角色运行时对象
	 * @param strTag
     * @param bTryMode
	 * @return
	 */
	IWFRoleRuntime getWFRoleRuntime(String strTag, boolean bTryMode);
}
