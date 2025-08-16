package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.res.ISysNotifyAgentRuntime;

/**
 * 系统实体通知后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysDENotifyBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDENotifyBackendTaskRuntimeBase.class);
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
		ISysNotifyAgentRuntime iSysNotifyAgentRuntime = null;
		if(StringUtils.hasLength(strDynaInstId)) {
			IDynaInstRuntime iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynaInstId);
			iSysNotifyAgentRuntime = iDynaInstRuntime.getSysNotifyAgentRuntime();
		}
		else {
			iSysNotifyAgentRuntime = this.getSystemRuntime().getSysNotifyAgentRuntime();
		}
		
		if(iSysNotifyAgentRuntime != null) {
			iSysNotifyAgentRuntime.send();
		}
		
		if(joinPoint != null) {
			return joinPoint.proceed();
		}
		return null;
	}
	
}
