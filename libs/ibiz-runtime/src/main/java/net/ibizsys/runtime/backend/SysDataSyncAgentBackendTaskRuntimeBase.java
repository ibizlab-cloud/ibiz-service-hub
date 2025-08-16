package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.DataSyncIn;

/**
 * 系统数据同步代理后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysDataSyncAgentBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDataSyncAgentBackendTaskRuntimeBase.class);
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
		JsonNode jsonNode = JsonUtils.MAPPER.readTree(strParam);
		ObjectNode packageNode = (ObjectNode)jsonNode;
		
		String strAgent = null;
		if(packageNode.has("agent")) {
			strAgent = packageNode.get("agent").asText();
		}
		
		if(!StringUtils.hasLength(strAgent)) {
			if(joinPoint != null) {
				return joinPoint.proceed();
			}
			return null;
		}
		
		java.util.Collection<ISysDataSyncAgentRuntime> inSysDataSyncAgentRuntimeList = null;
		if(StringUtils.hasLength(strDynaInstId)) {
			IDynaInstRuntime iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynaInstId);
			inSysDataSyncAgentRuntimeList = iDynaInstRuntime.getInSysDataSyncAgentRuntimes();
		}
		else {
			inSysDataSyncAgentRuntimeList = this.getSystemRuntime().getInSysDataSyncAgentRuntimes();
		}
		
		if(ObjectUtils.isEmpty(inSysDataSyncAgentRuntimeList)) {
			if(joinPoint != null) {
				return joinPoint.proceed();
			}
			return null;
		}
		
		String strData = null;
		if(packageNode.has("data")) {
			strData = packageNode.get("data").asText();
		}
		DataSyncIn[] dataSyncIns = null;
		if(StringUtils.hasLength(strData)) {
			if(strData.indexOf("[") == 0) {
				dataSyncIns = JsonUtils.MAPPER.readValue(strData, DataSyncIn[].class);
			}
			else
				if(strData.indexOf("{") == 0) {
					dataSyncIns = new DataSyncIn[] { JsonUtils.MAPPER.readValue(strData, DataSyncIn.class) };
				}
		}
		
		
		if(dataSyncIns == null) {
			if(joinPoint != null) {
				return joinPoint.proceed();
			}
			return null;
		}
		
		for(ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime : inSysDataSyncAgentRuntimeList) {
			iSysDataSyncAgentRuntime.recv(dataSyncIns);
		}
		
		if(joinPoint != null) {
			return joinPoint.proceed();
		}
		return null;
	}

	
}
