package net.ibizsys.central.cloud.task.core.spring.controller;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudTaskUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.task.core.ITaskUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class TaskRestController {

	private static final Log log = LogFactory.getLog(TaskRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud任务服务已经启动"));
		iServiceHub.registerNamingService(ICloudUtilRuntime.CLOUDSERVICEURL_TASK);
		if(this.iCloudTaskUtilRuntime == null) {
			//通过服务网关需要注册任务功能组件
			iServiceHub.requireCloudUtilRuntime(ITaskUtilSystemRuntime.class, ICloudTaskUtilRuntime.class);
		}
	}


	@Autowired(required=false)
	private ICloudTaskUtilRuntime iCloudTaskUtilRuntime = null;

	protected ICloudTaskUtilRuntime getCloudTaskUtilRuntime() {
		if (this.iCloudTaskUtilRuntime == null) {
			try {
				this.iCloudTaskUtilRuntime = iServiceHub.getCloudUtilRuntime(ITaskUtilSystemRuntime.class, ICloudTaskUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud任务功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud任务功能模块"), ex);
			}
		}
		return this.iCloudTaskUtilRuntime;
	}

	
	//@ApiOperation(value = "执行", tags = {"任务信息"}, notes = "执行")
    @RequestMapping(method = RequestMethod.POST, value = "/job/{id}/execute")
    public ResponseEntity<Object> executeTask(@PathVariable("id") String id, @RequestBody Map params) {

//        JobsInfo jobsinfo = new JobsInfo();
//        jobsinfo.setId(id);
//        if(params.containsKey("params")) {
//            jobsinfo.setParam(params.getString("params"));
//        }
//        jobsinfo = jobsinfoService.execute(jobsinfo);
//        if (jobsinfo.get("response") == null)
//            return ResponseEntity.status(HttpStatus.OK).body(null);
//        else {
//            return ResponseEntity.status(HttpStatus.OK).body((JobsResponse) jobsinfo.get("response"));
//        }
        
    	Object objRet = this.getCloudTaskUtilRuntime().executeTask(id, params);
    	
    	return ResponseEntity.status(HttpStatus.OK).body(objRet);
    	
    }


   // @ApiOperation(value = "开始", tags = {"任务信息"}, notes = "开始")
    @RequestMapping(method = RequestMethod.GET, value = "/job/{id}/start")
    public ResponseEntity<Boolean> startTask(@PathVariable("id") String id) {
//        JobsInfo jobsinfo = new JobsInfo();
//        jobsinfo.setId(id);
//        jobsinfoService.start(jobsinfo);
    	this.getCloudTaskUtilRuntime().startTask(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

 //   @ApiOperation(value = "停止", tags = {"任务信息"}, notes = "停止")
    @RequestMapping(method = RequestMethod.GET, value = "/job/{id}/stop")
    public ResponseEntity<Boolean> stopTask(@PathVariable("id") String id) {
//        JobsInfo jobsinfo = new JobsInfo();
//        jobsinfo.setId(id);
//        jobsinfoService.stop(jobsinfo);
    	this.getCloudTaskUtilRuntime().stopTask(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    
}
