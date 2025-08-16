package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SimpleEntity;

/**
 * 系统工作流回调后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysWFCallbackBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysWFCallbackBackendTaskRuntimeBase.class);
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
		JsonNode jsonNode = JsonUtils.MAPPER.readTree(strParam);
		ObjectNode packageNode = (ObjectNode)jsonNode;
		
		String strAction = null;
		if(packageNode.has("action")) {
			strAction = packageNode.get("action").asText();
		}
		
		String strDEName = null;
		if(packageNode.has("dEName")) {
			strDEName = packageNode.get("dEName").asText();
		}
		else
			if(packageNode.has("dename")) {
				strDEName = packageNode.get("dename").asText();
			}
		
		JsonNode data = null;
		String strData = null;
		if(packageNode.has("data")) {
			data  = packageNode.get("data");
			if(data.isTextual()) {
				strData = data.asText();
				data = null;
			}
			else {
				strData = data.toString();
			}
		}
		
		String strActionType = null;
		if(packageNode.has("actiontype")) {
			strActionType = packageNode.get("actiontype").textValue();
		}
		
		return this.onExecute(strDynaInstId, strActionType, strAction, strDEName, strData, data, strParam, joinPoint);
		
	}
	
	
	protected Object onExecute(String strDynaInstId, String strActionType, String strAction, String strDEName, String strData, JsonNode data, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		if(!StringUtils.hasLength(strAction)
				|| !StringUtils.hasLength(strDEName)
				|| !StringUtils.hasLength(strData)) {
			log.error(String.format("工作流回调传入参数无效，%1$s",strParam));
			if(joinPoint != null) {
				return joinPoint.proceed();
			}
			return null;
		}
		
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDEName);
		
		IEntityBase iEntityBase = null;
		if(data != null) {
			ObjectNode dataNode = null;
			if(data instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode)data;
				if(arrayNode.size()>0) {
					dataNode = (ObjectNode)arrayNode.get(0);
				}	
			}
			else
				if(data instanceof ObjectNode) {
					dataNode = (ObjectNode)data;
				}
			if(dataNode != null) {
				iEntityBase = iDataEntityRuntime.createEntity();
				IEntity iEntity = null;
				if(iEntityBase instanceof IEntity) {
					iEntity = (IEntity)iEntityBase;
				}
				SimpleEntity simpleEntity = JsonUtils.MAPPER.readValue(dataNode.toString(), SimpleEntity.class);
				if(simpleEntity.any()!=null) {
					for(java.util.Map.Entry<String, Object> entry : simpleEntity.any().entrySet()) {
						IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(entry.getKey());
						if(iPSDEField!=null) {
							iDataEntityRuntime.setFieldValue(iEntityBase, iPSDEField, entry.getValue());
						}
						else {
							if(iEntity!=null) {
								iEntity.set(entry.getKey(), entry.getValue());
							}
							else {
								log.error(String.format("无法设置实体[%1$s]属性[%2$s]值", iDataEntityRuntime.getName(), entry.getKey()));
							}
						}
					}
				}
			}
		}
		else {
			if(strData.indexOf("[") == 0) {
				IEntityBase[] arr = iDataEntityRuntime.deserializeEntities(strData);
				if(arr != null && arr.length > 0) {
					iEntityBase = arr[0];
				}
			}
			else
				if(strData.indexOf("{") == 0) {
					iEntityBase = iDataEntityRuntime.deserializeEntity(strData);
				}
		}
		
		//判断是否有主键
		Object objKey = iDataEntityRuntime.getKeyFieldValue(iEntityBase);
		if(ObjectUtils.isEmpty(objKey)) {
			//尝试获取键值
			if(iEntityBase instanceof IEntity) {
				objKey = ((IEntity)iEntityBase).get(Entity.KEY);
				if(!ObjectUtils.isEmpty(objKey)) {
					iDataEntityRuntime.setFieldValue(iEntityBase, iDataEntityRuntime.getKeyPSDEField(), objKey);
				}
			}
		}
		
		//iDataEntityRuntime.executeAction(strAction, null, new Object[] {iEntityBase});
		this.onExecuteAction(iDataEntityRuntime, strAction, new Object[] {iEntityBase}, strData, data);
		if(joinPoint != null) {
			return joinPoint.proceed();
		}
		return null;
	}
	
	protected Object onExecuteAction(IDataEntityRuntime iDataEntityRuntime, String strAction, Object[] args, String strData, JsonNode data) throws Throwable {
		return iDataEntityRuntime.executeAction(strAction, null, args);
	}
	
}
