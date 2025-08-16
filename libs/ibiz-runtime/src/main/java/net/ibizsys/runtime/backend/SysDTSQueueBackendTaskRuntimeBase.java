package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;

/**
 * 系统异步处理队列后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysDTSQueueBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDTSQueueBackendTaskRuntimeBase.class);
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
		java.util.Collection<ISysDTSQueueRuntime> sysDTSQueueRuntimeList = null;
		if(StringUtils.hasLength(strDynaInstId)) {
			IDynaInstRuntime iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynaInstId);
			sysDTSQueueRuntimeList = iDynaInstRuntime.getSysDTSQueueRuntimes();
		}
		else {
			sysDTSQueueRuntimeList = this.getSystemRuntime().getSysDTSQueueRuntimes();
		}
		
		if(ObjectUtils.isEmpty(sysDTSQueueRuntimeList)) {
			if(joinPoint != null) {
				return joinPoint.proceed();
			}
			return null;
		}
		
		//进行超时处理
		for(ISysDTSQueueRuntime iSysDTSQueueRuntime : sysDTSQueueRuntimeList) {
			iSysDTSQueueRuntime.timeout();
		}
		
		return null;
	}
	
}
