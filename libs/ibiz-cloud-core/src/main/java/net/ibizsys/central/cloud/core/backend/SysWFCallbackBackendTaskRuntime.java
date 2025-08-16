package net.ibizsys.central.cloud.core.backend;

import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.wf.IWFRoleRuntime;

public class SysWFCallbackBackendTaskRuntime extends net.ibizsys.central.backend.SysWFCallbackBackendTaskRuntime {

    @Override
    protected Object onExecute(String strDynaInstId, String strActionType, String strAction, String strDEName, String strData, JsonNode data, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
        if (StringUtils.hasLength(strActionType) && strActionType.equalsIgnoreCase(ICloudWFUtilRuntime.CALLBACKTYPE_WFUSER)) {
            if(!StringUtils.hasLength(strAction))
                throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定流程角色"));
            IPSWFRole iPSWFRole = this.getSystemRuntime().getPSWFRole(strAction);
            if (iPSWFRole == null) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("无效的流程角色[%s]", strAction));
            }
            IWFRoleRuntime iWFRoleRuntime = this.getSystemRuntime().getWFRoleRuntime(iPSWFRole);
//            IR8WFRoleRuntime ir8WFRoleRuntime = (IR8WFRoleRuntime) iWFRoleRuntime;
//
//            EntityDTO activeData = null;
//            if (data != null) {
//                activeData = new EntityDTO();
//                Map<String, Object> dataMap = MAPPER.convertValue(data, new TypeReference<Map<String, Object>>() {
//                });
//                for (String key : dataMap.keySet()) {
//                    activeData.set(key, dataMap.get(key));
//                }
//            }
//            return ir8WFRoleRuntime.getEmps(activeData);
            throw new SystemRuntimeException(this.getSystemRuntime(), this, "没有实现");
        }else if(StringUtils.hasLength(strActionType) && strActionType.equalsIgnoreCase(ICloudWFUtilRuntime.CALLBACKTYPE_DATASET)) {
           IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime(strDEName);
//            if(data.has("businessKey")){
//                ObjectNode node = (ObjectNode) data;
//                node.put(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase(),data.get("businessKey").asText());
//            }

            Map<String, Object> dataMap = JsonUtils.MAPPER.convertValue(data, new TypeReference<Map<String, Object>>() {});
            ISearchContextDTO searchContext = iDataEntityRuntime.createSearchContext(dataMap);
            searchContext.all().count(false);
            Page<?> page=  (Page<?>)iDataEntityRuntime.fetchDataSet(strAction, null, new Object[]{searchContext});
            return page.getContent();
        }
        else {
//            IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDEName);
//            if(data.has("businessKey")){
//                ObjectNode node = (ObjectNode) data;
//                node.put(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase(),data.get("businessKey").asText());
//            }
            return super.onExecute(strDynaInstId, strActionType, strAction, strDEName, strData, data, strParam, joinPoint);
        }
    }
}
