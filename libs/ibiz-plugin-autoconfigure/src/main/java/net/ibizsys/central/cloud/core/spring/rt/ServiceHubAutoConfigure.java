package net.ibizsys.central.cloud.core.spring.rt;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.domain.*;
import net.ibizsys.central.plugin.extension.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.sysutil.SysExtensionUtilRuntimeBase;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ZipUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Map;


@Component("ServiceHub")
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "auto")
public class ServiceHubAutoConfigure extends ServiceHub {

    private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceHubAutoConfigure.class);

    @Override
    protected void onInstall() throws Exception {
        super.onInstall();
    }

    @Override
    protected ISystemRuntime registerDeploySystem(DeploySystem deploySystem) throws Exception {
        if (!DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(deploySystem.getDeploySystemId())
                && DataTypeUtils.getBooleanValue(deploySystem.getExtension(), false)) {
            try {
                prepareV2DeploySystem(deploySystem);
            }
            catch (Exception ex) {
                log.warn(String.format("自动初始化[%1$s]系统扩展环境失败，%2$s",deploySystem.getDeploySystemId(),ex));
            }
        }


        return super.registerDeploySystem(deploySystem);
    }


    protected void prepareV2DeploySystem(DeploySystem deploySystem) throws Exception {

        String httpUrlToRepo = DataTypeUtils.getStringValue(deploySystem.getSettings().get("repo"), null);;
        if(!StringUtils.hasLength(httpUrlToRepo))
            return;

        String productMarketServiceUrl = "";
        ISysExtensionUtilRuntime sysExtensionUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysExtensionUtilRuntime.class, false);
        if (sysExtensionUtilRuntime instanceof SysExtensionUtilRuntimeBase)
            productMarketServiceUrl = ((SysExtensionUtilRuntimeBase) sysExtensionUtilRuntime).getProductMarketServiceUrl();

        if(!StringUtils.hasLength(productMarketServiceUrl))
            return;

        String defaultBranch = DataTypeUtils.getStringValue(deploySystem.getSettings().get("branch"), null);
        V2DeploySystem v2DeploySystem = null;
        try{
            v2DeploySystem = getCloudExtensionClient().getDeploySystem(deploySystem.getDeploySystemId());
        }catch (Exception ex) {}

        if(v2DeploySystem == null) {
            log.debug(String.format("开始自动初始化[%1$s]系统扩展环境",deploySystem.getDeploySystemId()));
            String strSystemId = deploySystem.getDeploySystemId();
            V2System v2System = null;
            try {
                v2System = this.getCloudExtensionClient().getSystem(strSystemId);
            }catch (Exception ex) {}
            if (v2System==null) {
                v2System = new V2System();
                if(StringUtils.hasLength(strSystemId)) {
                    v2System.setId(strSystemId);
                }
                v2System.setName(deploySystem.getDeploySystemId());

                v2System.setMarketUrl(productMarketServiceUrl);
                v2System.setProductId(DataTypeUtils.getStringValue(deploySystem.getSettings().get("product"), strSystemId));
                v2System.setProductGroupId(DataTypeUtils.getStringValue(deploySystem.getSettings().get("group"), "/EE/OFFICE"));
                v2System.setType(V2SystemType.CORE.value);
                v2System.setHttpUrlToRepo(httpUrlToRepo);
                if(httpUrlToRepo!=null && httpUrlToRepo.toLowerCase().endsWith(".zip")) {
                    log.info("zip模式下分支置空！");
                    defaultBranch = null;
                }
                v2System.setDefaultBranch(defaultBranch);

                v2System = this.getCloudExtensionClient().createSystem(v2System);

                V2SystemExtensionSuite extensionSuite = new V2SystemExtensionSuite();
                extensionSuite.setId(String.format("%1$s-extension", strSystemId));
                extensionSuite.setName("默认扩展");
                extensionSuite.set("system_id",strSystemId);
                extensionSuite = this.getCloudExtensionClient().createSystemExtension(extensionSuite);

                V2DeploySystem v2Deploy = new V2DeploySystem();
                v2Deploy.setId(strSystemId);
                v2Deploy.setName(v2System.getName());
                v2Deploy.setSystemId(strSystemId);
                v2Deploy.setSystemExtensionId(extensionSuite.getId());
                v2Deploy = this.getCloudExtensionClient().createDeploySystem(v2Deploy);
                v2DeploySystem = getCloudExtensionClient().getDeploySystem(deploySystem.getDeploySystemId());

                log.debug(String.format("自动初始化[%1$s]系统扩展环境成功完成",deploySystem.getDeploySystemId()));
            }
        }
        else {
            log.debug(String.format("校验[%1$s]系统扩展环境http-repo是否发生部署设置变化",deploySystem.getDeploySystemId()));

            String v2reop = v2DeploySystem.getHttpUrlToRepo();
            String v2branch = v2DeploySystem.getDefaultBranch();
            if(!DataTypeUtils.getStringValue(v2reop,"").equalsIgnoreCase(DataTypeUtils.getStringValue(httpUrlToRepo,""))
                    || !DataTypeUtils.getStringValue(v2branch,"").equalsIgnoreCase(DataTypeUtils.getStringValue(defaultBranch,"")))
            {
                V2System v2System = null;
                try {
                    v2System = this.getCloudExtensionClient().getSystem(v2DeploySystem.getSystemId());
                }catch (Exception ex) {}

                v2System.setHttpUrlToRepo(httpUrlToRepo);
                if(httpUrlToRepo!=null && httpUrlToRepo.toLowerCase().endsWith(".zip")) {
                    log.info("zip模式下分支置空！");
                    defaultBranch = null;
                }
                v2System.setDefaultBranch(defaultBranch);
                log.info(String.format("[%1$s]系统扩展环境http-repo/branch发生部署设置变化，更新扩展配置信息",deploySystem.getDeploySystemId()));
                this.getCloudExtensionClient().updateSystem(v2System.getId(),v2System);
            }


        }

        // auto模式下，如果未设置debugModelPath则默认取system的git路径
        if (ObjectUtils.isEmpty(deploySystem.getDebugModelPath()) &&
                v2DeploySystem != null && StringUtils.hasLength(v2DeploySystem.getHttpUrlToRepo())
                && v2DeploySystem.getHttpUrlToRepo().toLowerCase().endsWith(".git")
                && this.getMonitorDebugModelPathsTimer() != -1 && !this.isEnableDebug()
                && this.getServiceHubSetting().isEnableReloadSystem()) {
            String debugModelPath = v2DeploySystem.getHttpUrlToRepo();
            String v2branch = v2DeploySystem.getDefaultBranch();
            if(StringUtils.hasLength(v2branch) && debugModelPath.indexOf("#") == -1)
                debugModelPath = debugModelPath+"#"+v2branch;

            deploySystem.setDebugModelPath(debugModelPath);

        }
    }


    @Override
    protected void invokeCloudDevOpsPubCode(V2DeploySystem v2DeploySystem) throws Exception{
        ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
        ICloudDevOpsClient iCloudDevOpsClient = iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS).getProxyClient(ICloudDevOpsClient.class);
        iCloudDevOpsClient.invokeDevCallback(v2DeploySystem.getId(), "PUBCODE", "token", false);
        log.info(String.format("向cloud部署系统[%1$s]完成",v2DeploySystem.getId()));
    }

}
