package net.ibizsys.runtime.system;

import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.model.res.IPSSysDataSyncAgent;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.ISysMsgTemplRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.res.ISysLogicRuntime;
import net.ibizsys.runtime.res.ISysSequenceRuntime;
import net.ibizsys.runtime.res.ISysTranslatorRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.res.ISysValueFuncRuntime;
import net.ibizsys.runtime.res.ISysValueRuleRuntime;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

public interface ISystemModuleUtilRuntime extends IModelRuntime {

	/**
	 * 建立系统值规则运行时对象
	 * @param iPSSysValueRule
	 * @return
	 */
	default ISysValueRuleRuntime createSysValueRuleRuntime(IPSSysValueRule iPSSysValueRule) {
		return null;
	}
	
	
	/**
	 * 建立系统值序列运行时对象
	 * @param iPSSysSequence
	 * @return
	 */
	default ISysSequenceRuntime createSysSequenceRuntime(IPSSysSequence iPSSysSequence){
		return null;
	}
	
	
	
	/**
	 * 建立系统值转换器运行时对象
	 * @param iPSSysTranslator
	 * @return
	 */
	default ISysTranslatorRuntime createSysTranslatorRuntime(IPSSysTranslator iPSSysTranslator){
		return null;
	}
	
	
	
	/**
	 * 建立系统功能运行时对象
	 * @param iPSSysUtil
	 * @return
	 */
	default ISysUtilRuntime createSysUtilRuntime(IPSSysUtil iPSSysUtil){
		return null;
	}
	
	
	/**
	 * 建立系统代码表运行时对象
	 * @param iPSCodeList
	 * @return
	 */
	default ICodeListRuntime createCodeListRuntime(IPSCodeList iPSCodeList){
		return null;
	}
	
	
	/**
	 * 建立系统数据同步代理运行时对象
	 * @param iPSSysDataSyncAgent
	 * @return
	 */
	default ISysDataSyncAgentRuntime createSysDataSyncAgentRuntime(IPSSysDataSyncAgent iPSSysDataSyncAgent) {
		return null;
	}
	
		
	
	/**
	 * 建立系统消息队列运行时对象
	 * @param iPSSysMsgQueue
	 * @return
	 */
	default ISysMsgQueueRuntime createSysMsgQueueRuntime(IPSSysMsgQueue iPSSysMsgQueue){
		return null;
	}
	
	
	
	/**
	 * 建立系统消息模板运行时对象
	 * @param iPSSysMsgTempl
	 * @return
	 */
	default ISysMsgTemplRuntime createSysMsgTemplRuntime(IPSSysMsgTempl iPSSysMsgTempl){
		return null;
	}
	
	
	/**
	 * 建立系统消息目标运行时对象
	 * @param iPSSysMsgTarget
	 * @return
	 */
	default ISysMsgTargetRuntime createSysMsgTargetRuntime(IPSSysMsgTarget iPSSysMsgTarget){
		return null;
	}
	
	
	/**
	 * 建立系统值函数运行时对象
	 * @param iPSSysValueFunc
	 * @return
	 */
	default ISysValueFuncRuntime createSysValueFuncRuntime(IPSSysDBValueFunc iPSSysDBValueFunc){
		return null;
	}
	
	
	/**
	 * 建立系统逻辑运行时对象
	 * @param iPSSysLogic
	 * @return
	 */
	default ISysLogicRuntime createSysLogicRuntime(IPSSysLogic iPSSysLogic){
		return null;
	}
	
	
	/**
	 * 建立工作流角色运行时对象
	 * @param iPSWFRole
	 * @return
	 */
	default IWFRoleRuntime createWFRoleRuntime(IPSWFRole iPSWFRole){
		return null;
	}
	
}
