package net.ibizsys.central.cloud.devops.ebsx.cloudutil;

import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RTCloudDevOpsUtilRuntime extends EBSXCloudDevOpsUtilRuntime{


    private String DEVSYSTEMACTION_PUBCODE_V2 = "PUBCODE_V2";

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTCloudDevOpsUtilRuntime.class);

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    private ICloudExtensionClient iCloudExtensionClient = null;

    protected ICloudExtensionClient getCloudExtensionClient() throws Exception {
        if (this.iCloudExtensionClient == null) {
            ISysCloudClientUtilRuntime iSysCloudClientRuntime = (ISysCloudClientUtilRuntime)ServiceHub.getInstance().getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
            this.iCloudExtensionClient = (ICloudExtensionClient)iSysCloudClientRuntime.getServiceClient("EXTENSION", ICloudExtensionClient.class, true);
        }

        return this.iCloudExtensionClient;
    }

    @Override
    protected Object onExecuteDevSystemAction(String strSystemId, String strAction, Map<String, Object> params) throws Throwable {

        if(DEVSYSTEMACTION_PUBCODE_V2.equals(strAction)) {
            log.debug(String.format("开发系统回调操作[%1$s][%2$s]", strSystemId, strAction));
            if (!this.isDevMode()) {
                log.warn(String.format("未设置开发模式，忽略远程指令"));
                return null;
            }

            if (!StringUtils.hasLength(strSystemId) || strSystemId.length() > ICloudSaaSUtilRuntime.MAXSERVICEIDLENGTH) {
                log.warn(String.format("系统标识[%1$s]无效", strSystemId));
                return null;
            }

            updateVersion(String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, strSystemId));

            V2DeploySystem v2DeploySystem = null;
            try{
                v2DeploySystem = getCloudExtensionClient().getDeploySystem(strSystemId);
                if (v2DeploySystem != null && StringUtils.hasLength(v2DeploySystem.getSystemExtensionId())) {
                    updateVersion(String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_SYSTEMEXTENSION_PREFIX, v2DeploySystem.getSystemExtensionId()));
                }
            }catch (Exception ex) {

            }

            return null;

        }
        else if(strAction != null && strAction.endsWith("V2")) {
            strAction = strAction.substring(0,strAction.length()-3);
        }

        return super.onExecuteDevSystemAction(strSystemId, strAction, params);
    }

    private void updateVersion(String strConfigId) {
        Yaml yaml = new Yaml();
        IServiceHub serviceHub = ServiceHub.getInstance();
        String strConfig = serviceHub.getConfig(strConfigId);
        Map config = (!StringUtils.hasLength(strConfig)) ? new HashMap() : yaml.loadAs(strConfig, Map.class);
        config.put("ver", formatter.format(new Date()));
        serviceHub.publishConfig(strConfigId, config);
    }


}
