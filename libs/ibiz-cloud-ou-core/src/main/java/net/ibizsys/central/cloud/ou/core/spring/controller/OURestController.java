package net.ibizsys.central.cloud.ou.core.spring.controller;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOUUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.ou.core.IOUUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class OURestController {

		
	private static final Log log = LogFactory.getLog(OURestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudOU服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_OU);
		if(this.iCloudOUUtilRuntime == null) {
			//通过服务网关需要注册OU功能组件
			iServiceHub.requireCloudUtilRuntime(IOUUtilSystemRuntime.class, ICloudOUUtilRuntime.class);
		}
	}
	

	@Autowired(required = false)
	private ICloudOUUtilRuntime iCloudOUUtilRuntime = null;

	protected ICloudOUUtilRuntime getCloudOUUtilRuntime() {
		if (this.iCloudOUUtilRuntime == null) {
			try {
				this.iCloudOUUtilRuntime = iServiceHub.getCloudUtilRuntime(IOUUtilSystemRuntime.class, ICloudOUUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定CloudOU功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定CloudOU功能模块"), ex);
			}
		}
		return this.iCloudOUUtilRuntime;
	}

	
}
