package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudWFClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.error.BadRequestAlertException;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFInstanceDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFInstanceServiceImpl;
import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Priority;
import java.util.LinkedHashSet;
import java.util.Set;

@Priority(100)
@Service
public class WFInstanceServiceImplEx extends WFInstanceServiceImpl {

    private ICloudWFClient iCloudWFClient = null;

    protected ICloudWFClient getCloudWFClient() {
        if (this.iCloudWFClient == null) {
            ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
            this.iCloudWFClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_WF, ICloudWFClient.class);
        }
        return this.iCloudWFClient;
    }


    @Override
    protected void onJump(WFInstanceDTO dto) throws Throwable {
        String strWFInstanceId = dto.getId();
        Set<String> wfUsers = new LinkedHashSet();
        Object wfuser = dto.get("wfusers");
        if (ObjectUtils.isEmpty(wfuser)) {
            throw new BadRequestAlertException("未传入流程步骤用户", "", "");
        }
        ArrayNode arrayNodes = JsonUtils.toArrayNode(wfuser);
        if (arrayNodes.isArray()) {
            for (JsonNode node : arrayNodes) {
                if(node.has("userid")){
                    JsonNode userid = node.get("userid");
                    wfUsers.add(userid.asText());
                }else {
                    JsonNode srfKey = node.get("srfkey");
                    wfUsers.add(srfKey.asText());
                }
            }
        }
        String strUserIds = String.join(",", wfUsers);
        WFInstance wfInstance = new WFInstance();
        WFInstanceDTO wfInstanceDTO = EBSXSystemRuntime.getInstance().getWFInstanceService().get(strWFInstanceId);
        wfInstanceDTO.copyTo(wfInstance, true);
        wfInstance.set("taskdefinitionkey", dto.get("taskdefinitionkey"));
        wfInstance.set("wfusers", strUserIds);
        wfInstance.setProcessDefinitionKey(wfInstanceDTO.getProcessDefinitionKey());
        getCloudWFClient().jumpWFInstance(strWFInstanceId, wfInstance);
    }

    @Override
    protected void onCancel(WFInstanceDTO dto) throws Throwable {
        WFInstance instance = new WFInstance();
        String strWFInstanceId = dto.getId();
        instance.setId(strWFInstanceId);
        getCloudWFClient().cancelWFInstance(strWFInstanceId, instance);
    }
}

