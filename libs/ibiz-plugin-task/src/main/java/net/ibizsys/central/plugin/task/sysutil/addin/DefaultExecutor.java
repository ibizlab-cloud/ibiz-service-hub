package net.ibizsys.central.plugin.task.sysutil.addin;

import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.DEMethodUtils;
import net.ibizsys.central.plugin.task.addin.IScheduler;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class DefaultExecutor extends ExecutorBase {

	/**
	 * 执行器子类型：实体处理逻辑
	 */
	public final static String SUBTYPE_PSDELOGIC = "PSDELOGIC";
	
	
	/**
	 * 执行器子类型：实体行为
	 */
	public final static String SUBTYPE_PSDEACTION = "PSDEACTION";
	
	
	/**
	 * 执行器子类型：系统功能
	 */
	public final static String SUBTYPE_PSSYSUTIL = "PSSYSUTIL";


	@Override
	protected Object onExecute(Map<String, Object> schedule, Map<String, Object> taskType, Object objData)	throws Throwable {
		String strSubType = DataTypeUtils.asString(taskType.get(TASKTYPEPARAM_EXECUTOR_SUBTYPE));
		String strExecutorTag = DataTypeUtils.asString(taskType.get(TASKTYPEPARAM_EXECUTOR_TAG));
		String strPayload = DataTypeUtils.asString(schedule.get(IScheduler.SCHEDULEPARAM_PAYLOAD));
		if(ObjectUtils.isEmpty(strSubType)) {
			throw new Exception("未指定执行器子类型");
		}
		
		if(SUBTYPE_PSDELOGIC.equals(strSubType)) {
			if(ObjectUtils.isEmpty(strExecutorTag)) {
				throw new Exception("未指定执行器标记");
			}
			
			String strDataEntityId = PSModelUtils.getParentId(strExecutorTag);
			String strLogicId = PSModelUtils.getSimpleId(strExecutorTag);
			IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(strDataEntityId);
			 
			return iDataEntityRuntime.executeLogic(strLogicId, new Object[] { strPayload});
		}
		
		if(SUBTYPE_PSDEACTION.equals(strSubType)) {
			if(ObjectUtils.isEmpty(strExecutorTag)) {
				throw new Exception("未指定执行器标记");
			}
			
			String strDataEntityId = PSModelUtils.getParentId(strExecutorTag);
			String strActionId = PSModelUtils.getSimpleId(strExecutorTag);
			IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(strDataEntityId);
			IPSDEAction iPSDEAction = iDataEntityRuntime.getPSDEAction(strActionId);
			if(iPSDEAction == null) {
				throw new Exception(String.format("实体[%1$s]指定行为[%2$s]", iDataEntityRuntime.getName(), strActionId));
			}
				
			Object[] args = DEMethodUtils.getActionArgs(iDataEntityRuntime, iPSDEAction, JsonUtils.asMap(strPayload), null);
			return iDataEntityRuntime.executeAction(iPSDEAction.getName(), iPSDEAction, args);
		}
		
		if(SUBTYPE_PSSYSUTIL.equals(strSubType)) {
			if(ObjectUtils.isEmpty(strExecutorTag)) {
				throw new Exception("未指定执行器标记");
			}
			
			String strSysUtilId = PSModelUtils.getParentId(strExecutorTag);
			String strActionId = PSModelUtils.getSimpleId(strExecutorTag);
			ISysUtilRuntime iSysUtilRuntime = (ISysUtilRuntime) this.getSystemRuntime().getSysUtilRuntime(strSysUtilId, false);
			
			return iSysUtilRuntime.executeAction(strActionId, new Object[] {strPayload});
		}
		
		
		throw new Exception(String.format("未支持的执行器子类型[%1$s]", strSubType));
	}
	
	

}
