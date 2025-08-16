package net.ibizsys.central.cloud.uaa.rabbitmq.spring.controller;

import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.uaa.core.IUAAUtilSystemRuntime;
import net.ibizsys.central.cloud.uaa.rabbitmq.util.domain.ResourceCheck;
import net.ibizsys.central.cloud.uaa.rabbitmq.util.domain.TopicCheck;
import net.ibizsys.central.cloud.uaa.rabbitmq.util.domain.VirtualHostCheck;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;

@RestController()
@RequestMapping("")
public class AuthRestController {

	private static final Log log = LogFactory.getLog(AuthRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	private ICloudUAAUtilRuntime iCloudUAAUtilRuntime = null;
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	private ICloudPortalClient iCloudPortalClient = null;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudRabbitMQ认证服务已经启动"));
		iServiceHub.registerIgnoreAuthPattern("/uaa/rabbitmq/**");

		if (this.iCloudUAAUtilRuntime == null) {
			iServiceHub.requireCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class);
		}
	}

	protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
		if (this.iCloudUAAUtilRuntime == null) {
			try {
				this.iCloudUAAUtilRuntime = iServiceHub.getCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.error(String.format("获取Cloud体系UAA功能模块发生异常，$1%s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系UAA功能模块"), ex);
			}
		}
		return this.iCloudUAAUtilRuntime;
	}
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if (this.iSysCacheUtilRuntime == null) {
			try {
				this.iSysCacheUtilRuntime = iServiceHub.getSysUtilRuntime(null, ISysCacheUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.error(String.format("获取系统缓存功能组件发生异常，$1%s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定系统缓存功能组件"), ex);
			}
		}
		return this.iSysCacheUtilRuntime;
	}
	
	protected ICloudPortalClient getCloudPortalClient(){
		if(this.iCloudPortalClient == null) {
			try {
				ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = iServiceHub.getSysUtilRuntime(null, ISysCloudClientUtilRuntime.class, false);
				this.iCloudPortalClient = iSysCloudClientUtilRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICEURL_PORTAL, ICloudPortalClient.class, true);
			} catch (Throwable ex) {
				log.error(String.format("获取Cloud门户客户端发生异常，$1%s", ex.getMessage()), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud门户客户端"), ex);
			}
		}
		return this.iCloudPortalClient;
	}
	

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, value = { "/uaa/rabbitmq/user" })
	public String user(@RequestParam("username") String username, @RequestParam("password") String password) {

		// 进行
		if(!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
			return "deny";
		}
		
		try {
			if(!this.getCloudUAAUtilRuntime().validateToken(password)) {
				throw new Exception("Token已失效");
			}
			//this.getCloudUAAUtilRuntime().validateToken(token, iAuthenticationUser)
			String strUserName = this.getCloudUAAUtilRuntime().getUsernameFromToken(password);
			String strCacheCat = CloudCacheTagUtils.getAuthenticationUserCat(strUserName, password);
			Map<String, String> map = this.getSysCacheUtilRuntime().getAll(strCacheCat);
			if(!ObjectUtils.isEmpty(map)) {
				for(java.util.Map.Entry<String, String> entry : map.entrySet()) {
					
					if(!StringUtils.hasLength(entry.getKey())) {
						continue;
					}
					
					if(entry.getKey().indexOf(CloudCacheTagUtils.EMPLOYEETAG_PREFIX) != 0) {
						continue;
					}
					
					Employee employee = this.getSysCacheUtilRuntime().getSystemRuntime().deserialize(entry.getValue(), Employee.class);
					if(employee == null || !StringUtils.hasLength(employee.getMqttTopic())) {
						continue;
					}
					
					if(username.equals(employee.getMqttTopic())) {
						
						try {
							Date date = this.getCloudUAAUtilRuntime().getExpirationDateFromToken(password);
							//向Portal登记
							Employee emp = new Employee();
							emp.setUserId(employee.getUserId());
							emp.setUAAUserId(employee.getUAAUserId());
							emp.setDCSystemId(employee.getDCSystemId());
							emp.setMqttTopic(employee.getMqttTopic());
							emp.setMqttExpiration(date.getTime());
							
							this.getCloudPortalClient().registerEmployee(emp);
						}
						catch (Throwable ex) {
							log.error(String.format("向CloudPortal登记人员MQTT链路发生异常，%1$s", ex.getMessage()), ex);
						}
						return "allow";
					}
				}
			}
		}
		catch (Throwable ex) {
			log.error(String.format("校验用户[%1$s][%2$s]发生异常，%3$s", username, password, ex.getMessage()), ex);
			return "deny";
		}

		log.warn(String.format("校验用户[%1$s][%2$s]失败", username, password));
		return "deny";

		// private final Map<String, User> users = new HashMap<String, User>()
		// {{
		// put("guest", new User("guest", "guest", asList("administrator",
		// "management")));
		// put("springy", new User("springy", "springy", asList("administrator",
		// "management")));
		// }};

		// User user = users.get(username);
		// if (user != null && user.getPassword().equals(password)) {
		// LOGGER.info("Successfully authenticated user {}", username);
		// return "allow " + collectionToDelimitedString(user.getTags(), " ");
		// } else {
		// LOGGER.info("Failed to authenticate user {}", username);
		// return "deny";
		// }
		//return "allow management";
	}

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, value = "/uaa/rabbitmq/vhost")
	public String vhost(VirtualHostCheck check) {
		log.debug(String.format("Checking vhost access with %1$s", check));
		return "allow";
	}

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, value = "/uaa/rabbitmq/resource")
	public String resource(ResourceCheck check) {
		log.debug(String.format("Checking resource access with %1$s", check));
		return "allow";
	}

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, value = "/uaa/rabbitmq/topic")
	public String topic(TopicCheck check) {
		
		boolean result = check.getUsername().replace("/", ".").equals(check.getRouting_key());
		
		//boolean result = check.getRouting_key().startsWith("a");
		log.debug(String.format("Checking topic access with %1$s, result: %2$s", check, result));

		return result ? "allow" : "deny";
	}
}
