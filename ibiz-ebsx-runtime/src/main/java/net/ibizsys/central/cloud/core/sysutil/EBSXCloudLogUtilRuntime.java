package net.ibizsys.central.cloud.core.sysutil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.log.core.ILogUtilSystemRuntime;
import net.ibizsys.central.plugin.cloud.sysutil.SysCloudLogUtilRuntime;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemLogListener;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.runtime.util.domain.Log;

/**
 * 系统日志侦听器组件运行时对象
 * @author lionlau
 *
 */
public class EBSXCloudLogUtilRuntime extends SysCloudLogUtilRuntime implements ISysCloudLogUtilRuntime, ISystemLogListener {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudLogUtilRuntime.class);
	
	private ConcurrentLinkedQueue<Log> logList = new ConcurrentLinkedQueue<Log>();


	private ICloudLogUtilRuntime iCloudLogUtilRuntime = null;

	protected ICloudLogUtilRuntime getCloudLogUtilRuntime() {
		if (this.iCloudLogUtilRuntime == null) {
			try {
				this.iCloudLogUtilRuntime = ServiceHub.getInstance().getCloudUtilRuntime(ILogUtilSystemRuntime.class, ICloudLogUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud日志功能模块"), ex);
				throw new SystemGatewayException(ServiceHub.getInstance(), String.format("未指定Cloud日志功能模块"), ex);
			}
		}
		return this.iCloudLogUtilRuntime;
	}


	protected void onLogTimer() {
		List<Log> list = new ArrayList<Log>();
		int nCount = 100;
		while(nCount>0) {
			nCount --;
			Log log = logList.poll();
			if(log == null) {
				break;
			}
			list.add(log);
		}
		if(list.size() == 0) {
			return;
		}

		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			if (lastEmployeeContext == null) {
				EmployeeContext.setCurrent(getDefaultEmployeeContext());
			}
			getCloudLogUtilRuntime().log(list);
		} catch (Throwable ex) {
			log.error(String.format("Cloud日志[%1$s]日志发生异常，%2$s", getName(), ex.getMessage()), ex);
		} finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}

	}


	protected IEmployeeContext getDefaultEmployeeContext() {
		Employee employee = new Employee();
		employee.setUserId("SYSTEM");
		employee.setUserName("日志采集");
		employee.setPersonName("日志采集");

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, this.getSystemRuntime().getDeploySystemId());
		return iEmployeeContext;
	}

	
	protected void onLog(Log log) {
		logList.add(log);
	}


}
