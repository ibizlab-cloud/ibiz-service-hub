package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFDefinitionNode;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;

/**
 * Cloud体系工作流功能客户端对象接口
 * @author lionlau
 *
 */
public interface ICloudWFClient {

    @RequestMapping(method = RequestMethod.POST, value = {"/wfcore/deploydynabpmns"})
    Collection<WFDefinition> createWFDefinitions(@RequestBody List<Map<String, Object>> bpmnfiles);


    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/register")
    WFInstance registerWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey, @RequestBody WFInstance instance);

    @RequestMapping(method = RequestMethod.DELETE, value = "/wfcore/{system}-{entity}/{businessKey}/unregister")
    void unregisterWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey);

    @RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/wfinstance")
    WFInstance getWFInstanceByBusinessKey(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey);

    @RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/dataaccessmode")
    int getWFInstanceAccessMode(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey);


    @RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/editfields")
    WFEditableFields getWFInstanceEditableFields(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey);


    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/process-instances")
    WFInstance startWFInstance(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey, @RequestBody WFInstance instance);

    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-app-{appname}/{entity}/{businessKey}/tasks/{taskId}")
    WFInstance submitWFTaskWay(@PathVariable("system") String system, @PathVariable("appname") String appname, @PathVariable("entity") String entity, @PathVariable("businessKey") Object businessKey, @PathVariable("businessKey") String taskId, @RequestBody WFTaskWay taskWay);

    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/jump")
    void jumpWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey,  @PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance);

    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/cancel")
    void cancelWFInstance(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance);

    //获取流程步骤
    @RequestMapping(method = RequestMethod.GET, value = "/wfcore/{system}-{entity}/{businessKey}/process-instances/{processInstanceId}/definitionnodes")
    List<WFDefinitionNode> getWFDefinitionNodes(@PathVariable("system") String system, @PathVariable("entity") String entity, @PathVariable("businessKey") String businessKey, @PathVariable("processInstanceId") String processInstanceId);

    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/undefined-undefined/undefined/process-instances/{processInstanceId}/jump")
    void jumpWFInstance(@PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance);

    @RequestMapping(method = RequestMethod.POST, value = "/wfcore/undefined-undefined/undefined/process-instances/{processInstanceId}/cancel")
    void cancelWFInstance(@PathVariable("processInstanceId") String processInstanceId, @RequestBody WFInstance instance);

    //获取流程步骤
    @RequestMapping(method = RequestMethod.GET, value = "/wfcore/undefined-undefined/undefined/process-instances/{processInstanceId}/definitionnodes")
    List<WFDefinitionNode> getWFDefinitionNodes( @PathVariable("processInstanceId") String processInstanceId);
}
