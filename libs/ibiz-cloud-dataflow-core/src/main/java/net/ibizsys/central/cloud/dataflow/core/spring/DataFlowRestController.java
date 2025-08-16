package net.ibizsys.central.cloud.dataflow.core.spring;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.dataflow.core.IDataFlowUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class DataFlowRestController {

	private static final Log log = LogFactory.getLog(DataFlowRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudDataFlow服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-dataflow");
	}

	@Autowired(required=false)
	private ICloudDataFlowUtilRuntime iCloudDataFlowUtilRuntime = null;

	protected ICloudDataFlowUtilRuntime getCloudDataFlowUtilRuntime() {
		if (this.iCloudDataFlowUtilRuntime == null) {
			try {
				this.iCloudDataFlowUtilRuntime = iServiceHub.getCloudUtilRuntime(IDataFlowUtilSystemRuntime.class, ICloudDataFlowUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务AI功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定CloudDataFlow流功能模块"), ex);
			}
		}
		return this.iCloudDataFlowUtilRuntime;
	}

	
	/**
	 * 启动数据流作业
	 * @param type
	 * @param id
	 * @param params
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = { "/dataflow/{type}/{id}"})
	public PortalAsyncAction start(@PathVariable("type") String type, @PathVariable("id") String id, @RequestBody(required=false) Map params) {
		return this.getCloudDataFlowUtilRuntime().start(type, id, params);
	}
	
	

}
