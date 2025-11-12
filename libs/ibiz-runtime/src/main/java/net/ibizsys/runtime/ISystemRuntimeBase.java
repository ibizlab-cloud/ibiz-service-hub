package net.ibizsys.runtime;

import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

/**
 * 系统运行时基对象接口
 * @author lionlau
 *
 */
public interface ISystemRuntimeBase extends IModelRuntime{

	/**
	 * 获取系统模型对象
	 * @return
	 */
	IPSSystem getPSSystem();
	

	/**
	 * 获取系统模型服务对象
	 * @return
	 */
	IPSSystemService getPSSystemService();
	
	
	/**
	 * 从系统全局获取指定键的值
	 * @param strKey
	 * @return
	 */
	Object getGlobalParam(String strKey);
	
	
	
	/**
	 * 设置运行时参数
	 * @param strKey
	 * @param objValue
	 */
	void setGlobalParam(String strKey, Object objValue);
	
	

	
	/**
	 * 获取指定标识的系统逻辑对象
	 * @param strName
	 * @return
	 */
	IPSSysLogic getPSSysLogic(String strName);
	
	
	
	
	/**
	 * 获取系统值规则运行时对象
	 * @param iPSSysValueRule
	 * @return
	 */
	ISysValueRuleRuntime getSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule);
	
	
	
	/**
	 * 获取系统值序列运行时对象
	 * @param iPSSysSequence
	 * @return
	 */
	ISysSequenceRuntime getSysSequenceRuntime(IPSSysSequence iPSSysSequence);
	
	
	/**
	 * 获取系统值转换器运行时对象
	 * @param iPSSysTranslator
	 * @return
	 */
	ISysTranslatorRuntime getSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator);
	
	
	
	
	/**
	 * 获取系统代码表运行时对象
	 * @param iPSCodeList
	 * @return
	 */
	ICodeListRuntime getCodeListRuntime(IPSCodeList iPSCodeList);
	
	
	
	/**
	 * 获取系统数据同步代理运行时对象
	 * @param iPSSysDataSyncAgent
	 * @return
	 */
	ISysDataSyncAgentRuntime getSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent);
	
	
	
	
	/**
	 * 获取输入的系统数据代理运行时对象集合
	 * @return
	 */
	java.util.Collection<ISysDataSyncAgentRuntime> getInSysDataSyncAgentRuntimes();
	
	
	
	
	
	/**
	 * 获取系统通知代理运行时对象接口
	 * @return
	 */
	ISysNotifyAgentRuntime getSysNotifyAgentRuntime();
	
	

	/**
	 * 获取系统消息队列运行时对象
	 * @param iPSSysMsgQueue
	 * @return
	 */
	ISysMsgQueueRuntime getSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue);
	
	
	/**
	 * 获取系统默认的消息队列
	 * @return
	 */
	ISysMsgQueueRuntime getDefaultSysMsgQueueRuntime();
	
	
	/**
	 * 获取系统消息模板运行时对象
	 * @param iPSSysMsgTempl
	 * @return
	 */
	ISysMsgTemplRuntime getSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl);
	
	
	
	
	/**
	 * 获取系统消息目标运行时对象
	 * @param iPSSysMsgTarget
	 * @return
	 */
	ISysMsgTargetRuntime getSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget);
	
	
	
	/**
	 * 获取系统逻辑运行时对象
	 * @param iPSSysLogic
	 * @return
	 */
	ISysLogicRuntime getSysLogicRuntime(IPSSysLogic iPSSysLogic);
	
	
	/**
	 * 获取指定标识的工作流角色对象
	 * @param strName
	 * @return
	 */
	IPSWFRole getPSWFRole(String strName);
	
	
	
	/**
	 * 获取工作流角色运行时对象
	 * @param iPSWFRole
	 * @return
	 */
	IWFRoleRuntime getWFRoleRuntime(IPSWFRole iPSWFRole);

	
	/**
	 * 获取系统异步处理队列集合
	 * @return
	 */
	java.util.Collection<ISysDTSQueueRuntime> getSysDTSQueueRuntimes();
	
	
	/**
	 * 获取系统异步处理队列运行时对象
	 * @param iPSSysDTSQueue
	 * @return
	 */
	ISysDTSQueueRuntime getSysDTSQueueRuntime(IPSSysDTSQueue iPSSysDTSQueue);
	
	
	
	/**
	 * 获取模型引擎版本
	 * @return
	 */
	int getPSModelEngineVer();
	
	
	
	/**
	 * 获取开发系统标识
	 * @return
	 */
	String getPSDevSlnSysId();
	
	
	/**
	 * 获取指定关系模型对象
	 * @param strPSDERId
	 * @param tryMode
	 * @return
	 */
	IPSDERBase getPSDER(String strPSDERId, boolean tryMode);

}
