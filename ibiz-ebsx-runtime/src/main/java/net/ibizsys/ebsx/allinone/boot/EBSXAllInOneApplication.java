package net.ibizsys.ebsx.allinone.boot;

import net.ibizsys.central.cloud.core.HubSystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.*;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan({"net.ibizsys.central.cloud.core.spring"
        , "net.ibizsys.central.cloud.workflow.core.spring"
        , "net.ibizsys.central.cloud.oss.core.spring"
        , "net.ibizsys.central.cloud.conf.core.spring"
        , "net.ibizsys.central.cloud.saas.core.spring"
        , "net.ibizsys.central.cloud.devops.core.spring"
        , "net.ibizsys.central.cloud.log.core.spring"
        , "net.ibizsys.central.cloud.task.core.spring"
        , "net.ibizsys.central.cloud.notify.core.spring"
        , "net.ibizsys.central.cloud.open.core.spring"
        , "net.ibizsys.central.cloud.ou.core.spring"
        , "net.ibizsys.central.cloud.saas.ebsx.spring.controller"
        , "net.ibizsys.central.plugin.liquibase.spring"
        , "net.ibizsys.central.cloud.report.core.spring"
        , "net.ibizsys.central.cloud.portal.core.spring"
        , "net.ibizsys.central.cloud.uaa.rabbitmq.spring"
        , "net.ibizsys.central.cloud.ai.core.spring"
        , "net.ibizsys.central.cloud.kb.core.spring"
        , "net.ibizsys.central.cloud.dataflow.core.spring"
        , "net.ibizsys.central.cloud.workflow.flowable.spring"})
public class EBSXAllInOneApplication {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("net.ibizsys.central.cloud.core.HubSystemRuntime");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

		//替换
        HubSystemRuntime.registerSysUtilType(ICloudAuthUtilRuntime.class, "USER:CLOUD_AUTH", "net.ibizsys.central.cloud.uaa.core.cloudutil.RTCloudAuthUtilRuntime", 50);
        HubSystemRuntime.registerSysUtilType(ICloudUAAUtilRuntime.class, "USER:CLOUD_JWTUAA", "net.ibizsys.central.cloud.uaa.core.cloudutil.RTJWTCloudUAAUtilRuntime", 50);
        HubSystemRuntime.registerSysUtilType(ICloudSaaSUtilRuntime.class, "USER:CLOUD_EBSXSAAS", "net.ibizsys.central.cloud.saas.rt.cloudutil.RTCloudSaaSUtilRuntime",50);
        HubSystemRuntime.registerSysUtilType(ICloudOpenUtilRuntime.class, "USER:CLOUD_OPEN", "net.ibizsys.central.cloud.open.rt.cloudutil.RTCloudOpenUtilRuntime", 50);
        HubSystemRuntime.registerSysUtilType(ICloudDevOpsUtilRuntime.class, "USER:CLOUD_DEVOPS", "net.ibizsys.central.cloud.devops.ebsx.cloudutil.RTCloudDevOpsUtilRuntime", 50);

        HubSystemRuntime.registerSysUtilType(ISysUtilRuntime.class, "USER:CLOUDLOG", "net.ibizsys.central.cloud.core.sysutil.EBSXCloudLogUtilRuntime",50);
        SpringApplication.run(EBSXAllInOneApplication.class, args);
    }

}
