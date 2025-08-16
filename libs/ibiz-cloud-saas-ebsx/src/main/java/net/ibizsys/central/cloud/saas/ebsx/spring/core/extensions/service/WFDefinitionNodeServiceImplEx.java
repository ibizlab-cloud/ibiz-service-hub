package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.collect.Lists;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudWFClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.dto.WFDefinitionNodeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.workflow.service.impl.WFDefinitionNodeServiceImpl;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Priority;
import java.util.*;

@Priority(100)
@Service
public class WFDefinitionNodeServiceImplEx extends WFDefinitionNodeServiceImpl {
    private ICloudWFClient iCloudWFClient = null;

    protected ICloudWFClient getCloudWFClient() {
        if (this.iCloudWFClient == null) {
            ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
            this.iCloudWFClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_WF, ICloudWFClient.class);
        }
        return this.iCloudWFClient;
    }

    @Override
    public Page<WFDefinitionNodeDTO> fetchQueryByInstId(ISearchContextDTO dto) throws Exception {
        List<WFDefinitionNodeDTO> processNodes = new ArrayList<>();
        String wfInstanceId = (String) dto.get("srfparentkey");
        if (ObjectUtils.isEmpty(wfInstanceId)) {
            throw new SystemRuntimeException(this.getSystemRuntime(), String.format("未能获取到流程实例标识"));
        }
        List<WFDefinitionNode> definitionNodes = getCloudWFClient().getWFDefinitionNodes(wfInstanceId);
        for (int i=0;i<definitionNodes.size();i++){
            WFDefinitionNodeDTO nodeDTO = new WFDefinitionNodeDTO();
            nodeDTO.reload(definitionNodes.get(i),false);
            if (nodeDTO.getUserTaskName().contains("-历史版本v")){
                continue;
            }
            processNodes.add(nodeDTO);
        }
        return new PageImpl<>(processNodes, dto.getPageable(), processNodes.size());
    }
}
