package net.ibizsys.central.cloud.log.core.spring.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.central.cloud.log.core.ILogUtilSystemRuntime;

@RestController()
@RequestMapping("")
public class LogRestController {

	private static final Log log = LogFactory.getLog(LogRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("Cloud日志服务已经启动"));
		iServiceHub.registerNamingService("ibizcloud-log");
		if(this.iCloudLogUtilRuntime == null) {
			//通过服务网关需要注册日志功能组件
			iServiceHub.requireCloudUtilRuntime(ILogUtilSystemRuntime.class, ICloudLogUtilRuntime.class);
		}
	}


	@Autowired(required=false)
	private ICloudLogUtilRuntime iCloudLogUtilRuntime = null;

	protected ICloudLogUtilRuntime getCloudLogUtilRuntime() {
		if (this.iCloudLogUtilRuntime == null) {
			try {
				this.iCloudLogUtilRuntime = iServiceHub.getCloudUtilRuntime(ILogUtilSystemRuntime.class, ICloudLogUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud日志功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud日志功能模块"), ex);
			}
		}
		return this.iCloudLogUtilRuntime;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/sysaudit")
    public ResponseEntity<Boolean> audit(@RequestBody SysAudit audit, HttpServletRequest request) throws Exception {
		
//		String strPersonid = request.getHeader("personid");
//        String strDeployId = request.getHeader("srfdeploysystemid");
//        String strDCId = request.getHeader("srfdcid");
//        String strSystemId = request.getHeader("srffromsystemid");
//        String strDCSystemid = request.getHeader("srffromdcsystemid");
        SysAudit sysAudit = new SysAudit();
        //sysAudit.setSrfdcid(strDCId);
        //sysAudit.setDCSystemId(strDCSystemid);
        if (StringUtils.hasLength(audit.getInfo()))
            sysAudit.setSysAuditName(audit.getInfo().length() > 150 ? audit.getInfo().substring(0, 150) + "..." : audit.getInfo());
        sysAudit.setCat(audit.getCat());
        sysAudit.setLogLevel(audit.getLogLevel());
        //sysAudit.setOPPersonId(strPersonid);
        sysAudit.setAddress(audit.getAddress());
        sysAudit.setInfo(audit.getInfo());
        
        getCloudLogUtilRuntime().logAudit(sysAudit);
        
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
	
	

    @RequestMapping(method = RequestMethod.POST, value = "/sysevent")
    public ResponseEntity<Boolean> event(@RequestBody SysEvent event, HttpServletRequest request) throws Exception {
//        String strPersonid = request.getHeader("personid");
//        String strDeployId = request.getHeader("srfdeploysystemid");
//        String strDCId = request.getHeader("srfdcid");
//        String strSystemId = request.getHeader("srffromsystemid");
//        String strDCSystemid = request.getHeader("srffromdcsystemid");
        SysEvent sysEvent = new SysEvent();
        //sysEvent.setSrfdcid(strDCId);
        //sysEvent.setDCSystemId(strDCSystemid);
        sysEvent.setCat(event.getCat());
        sysEvent.setLogLevel(event.getLogLevel());
        if (StringUtils.hasLength(event.getInfo()))
            sysEvent.setSysEventName(event.getInfo().length() > 150 ? event.getInfo().substring(0, 150) + "..." : event.getInfo());
        //sysEvent.setOPPersonId(strPersonid);
        sysEvent.setInfo(event.getInfo());
        getCloudLogUtilRuntime().logEvent(sysEvent);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/syslog")
    public ResponseEntity<Boolean> info(@RequestBody SysLog log, HttpServletRequest request) throws Exception {
//        String strPersonid = request.getHeader("personid");
//        String strDeployId = request.getHeader("srfdeploysystemid");
//        String strDCId = request.getHeader("srfdcid");
//        String strSystemId = request.getHeader("srffromsystemid");
//        String strDCSystemid = request.getHeader("srffromdcsystemid");
        SysLog sysLog = new SysLog();
        //sysLog.setSrfdcid(strDCId);
        //sysLog.setDCSystemId(strDCSystemid);
        sysLog.setCat(log.getCat());
        sysLog.setLogLevel(log.getLogLevel());
        if (StringUtils.hasLength(log.getInfo()))
            sysLog.setSysLogName(log.getInfo().length() > 150 ? log.getInfo().substring(0, 150) + "..." : log.getInfo());
        //sysLog.setOPPersonId(strPersonid);
               
        sysLog.setInfo(log.getInfo());
        getCloudLogUtilRuntime().log(sysLog);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/syspo")
    public ResponseEntity<Boolean> po(@RequestBody SysPO po, HttpServletRequest request) throws Exception {
//        String strPersonid = request.getHeader("personid");
//        String strDeployId = request.getHeader("srfdeploysystemid");
//        String strDCId = request.getHeader("srfdcid");
//        String strSystemId = request.getHeader("srffromsystemid");
//        String strDCSystemid = request.getHeader("srffromdcsystemid");
        SysPO sysPO = new SysPO();
       // sysPO.setSrfdcid(strDCId);
      //  sysPO.setDCSystemId(strDCSystemid);
        if (StringUtils.hasLength(po.getInfo()))
            sysPO.setSysPOName(po.getInfo().length() > 150 ? po.getInfo().substring(0, 150) + "..." : po.getInfo());
        sysPO.setCat(po.getCat());
        sysPO.setLogLevel(po.getLogLevel());
        sysPO.setDE(po.getDE());
        sysPO.setAction(po.getAction());
        sysPO.setTime(po.getTime());
        sysPO.setInfo(po.getInfo());
        getCloudLogUtilRuntime().logPO(sysPO);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/log")
    public ResponseEntity<Boolean> logs(@RequestBody List<net.ibizsys.runtime.util.domain.Log> list) throws Exception {
    	getCloudLogUtilRuntime().log(list);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    
    
    @RequestMapping(method = RequestMethod.POST, value = "/console")
    public ResponseEntity<Boolean> sendConsoleMessages(@RequestBody List<net.ibizsys.runtime.util.domain.Log> list) throws Exception {
    	getCloudLogUtilRuntime().sendConsoleMessages(list);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
