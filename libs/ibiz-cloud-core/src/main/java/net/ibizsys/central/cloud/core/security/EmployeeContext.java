package net.ibizsys.central.cloud.core.security;

import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.servlet.IServiceHubFilter;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.error.UnauthorizedException;
import net.ibizsys.central.security.UserContextRuntime;
import net.ibizsys.runtime.security.UserContext;

/**
 * 机构人员上下文对象实现
 * 
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class EmployeeContext extends UserContextRuntime implements IEmployeeContext{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EmployeeContext.class);
	
	private Employee employee = null;

	private MetaDynaModel dcDynaModel = null;

	private String systemid = null;

	private String dcsystemid = null;

	private String uaausername = null;

	private String uaauserid = null;
	
	private String mqtttopic = null;
	
	private String globalsessionid = null;
	
	private Map<String, Object> sessionParams = new HashMap<String, Object>();

	private Collection<? extends GrantedAuthority> authorities = null;

	private static ThreadLocal<Boolean> currentDisabled = new ThreadLocal<Boolean>();
	
	public EmployeeContext(Employee employee, MetaDynaModel dcDynaModel, String systemid) {
		this(employee, dcDynaModel, systemid, null);
	}
	
	public EmployeeContext(Employee employee, MetaDynaModel dcDynaModel, String systemid, Collection<? extends GrantedAuthority> authorities) {
		this(employee, dcDynaModel, systemid, authorities, null);
	}

	public EmployeeContext(Employee employee, MetaDynaModel dcDynaModel, String systemid, Collection<? extends GrantedAuthority> authorities, Map<String, Object> session) {

		Assert.notNull(employee, "传入机构人员对象无效");

		this.setEmployee(employee);
		this.setMetaDynaModel(dcDynaModel);
		this.setSystemid(systemid);
		this.setAuthorities(authorities);

		this.setSuperuser(this.getEmployee().getSuperUser() != null && this.getEmployee().getSuperUser() == 1);
		if(this.isSuperuser()) {
			this.setSystemadmin(true);
		}

		this.setDcsystemid(this.getEmployee().getDCSystemId());

		this.setTenant(this.getEmployee().getSrfdcid());
		this.setUserid(this.getEmployee().getUserId());
		this.setUsername(this.getEmployee().getPersonName());
		this.setUsercode(this.getEmployee().getUserCode());

		this.setUaauserid(this.getEmployee().getUAAUserId());
		this.setUaausername(this.getEmployee().getUAAUserName());

		// this.setPersonid(this.getEmployee().getUserId());
		// this.setPersonname(this.getEmployee().getUserName());
		this.setOrgid(this.getEmployee().getOrgId());
		this.setOrgname(this.getEmployee().getOrgName());
		this.setOrgcode(this.getEmployee().getOrgCode());
		this.setDeptid(this.getEmployee().getMDeptId());
		this.setDeptname(this.getEmployee().getMDeptName());
		this.setDeptcode(this.getEmployee().getMDeptCode());
		this.setPorg(this.getEmployee().getPOrgIds());
		this.setPdept(this.getEmployee().getPDeptIds());
		this.setSorg(this.getEmployee().getSOrgIds());
		this.setSdept(this.getEmployee().getSDeptIds());
		this.setMqtttopic(this.getEmployee().getMqttTopic());
		this.setGlobalsessionid(this.getEmployee().getGlobalSessionId());

		this.getSessionParams().put("srfpersonid", this.getUserid());
		this.getSessionParams().put("srfpersonname", this.getUsername());
		this.getSessionParams().put("srfdcid", this.getTenant());

		this.getSessionParams().put("srfsystemid", this.getSystemid());
		this.getSessionParams().put("srfdcsystemid", this.getDcsystemid());
		this.getSessionParams().put("srforgsectorid", this.getDeptid());
		this.getSessionParams().put("srforgsectorcode", this.getDeptcode());
		this.getSessionParams().put("srforgsectorname", this.getDeptname());
		this.getSessionParams().put("srforgid", this.getOrgid());
		this.getSessionParams().put("srforgcode", this.getOrgcode());
		this.getSessionParams().put("srforgname", this.getOrgname());
		this.getSessionParams().put("srfuserid", this.getUserid());
		this.getSessionParams().put("srfusername", this.getUsername());

		this.getSessionParams().put("srfporg", this.getPorg());
		this.getSessionParams().put("srfsorg", this.getSorg());
		this.getSessionParams().put("srfpdept", this.getPdept());
		this.getSessionParams().put("srfsdept", this.getSdept());

		this.getSessionParams().put("srfusercode", this.getUsercode());
		this.getSessionParams().put("srfuaauserid", this.getUaauserid());

		if(!ObjectUtils.isEmpty(session)) {
			this.getSessionParams().putAll(session);
		}
		
		//设置请求上下文
		
		
		if (this.getMetaDynaModel() != null) {

		}

	}

	@Override
	public Employee getEmployee() {
		return this.employee;
	}

	protected void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public MetaDynaModel getMetaDynaModel() {
		return this.dcDynaModel;
	}

	protected void setMetaDynaModel(MetaDynaModel dcDynaModel) {
		this.dcDynaModel = dcDynaModel;
	}

	@Override
	public Map<String, Object> getSessionParams() {
		return this.sessionParams;
	}

	@Override
	public String getSystemid() {
		return this.systemid;
	}

	protected void setSystemid(String systemid) {
		this.systemid = systemid;
	}

	@Override
	public String getDcsystemid() {
		return this.dcsystemid;
	}

	protected void setDcsystemid(String dcsystemid) {
		this.dcsystemid = dcsystemid;
	}

	@Override
	public String getUaausername() {
		return uaausername;
	}

	protected void setUaausername(String uaausername) {
		this.uaausername = uaausername;
	}

	@Override
	public String getUaauserid() {
		return uaauserid;
	}

	protected void setUaauserid(String uaauserid) {
		this.uaauserid = uaauserid;
	}
	
	@Override
	public String getMqtttopic() {
		return this.mqtttopic;
	}
	
	protected void setMqtttopic(String mqtttopic) {
		this.mqtttopic = mqtttopic;
	}
	
	@Override
	public String getGlobalsessionid() {
		return this.globalsessionid;
	}
	
	protected void setGlobalsessionid(String globalsessionid) {
		this.globalsessionid = globalsessionid;
	}
	
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	protected void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	/**
	 * 是否临时禁用身份
	 * @return
	 */
	public static boolean isCurrentDisabled() {
		if(currentDisabled.get() == null) {
			return false;
		}
		return currentDisabled.get();
	}
	
	public static void setCurrentDisabled(boolean bDisabled) {
		currentDisabled.set(bDisabled);
	}
	
	public static IEmployeeContext getCurrent() {
		
		if(isCurrentDisabled()) {
			return null;
		}
		
		if (UserContext.getCurrent() instanceof IEmployeeContext) {
			return (IEmployeeContext)UserContext.getCurrent();
		}

		if (SecurityContextHolder.getContext() != null && SecurityContextHolder.getContext().getAuthentication() != null) {
			
			Object credentials = SecurityContextHolder.getContext().getAuthentication().getDetails();
			if (credentials instanceof IEmployeeContext) {
				return (IEmployeeContext) credentials;
			}
			
			credentials = SecurityContextHolder.getContext().getAuthentication().getCredentials();
			if (credentials instanceof IEmployeeContext) {
				return (IEmployeeContext) credentials;
			}
		}

		if (AuthenticationUser.getCurrent() != null) {
			IEmployeeContext iEmployeeContext = AuthenticationUser.getCurrent().getEmployeeContext();
			if(iEmployeeContext != null) { 
				return iEmployeeContext;
			}
		}
		
		if(ServiceHub.getInstance() instanceof IServiceHubFilter) {
			try {
				if(((IServiceHubFilter)ServiceHub.getInstance()).redoFilter()) {
					return (IEmployeeContext) UserContext.getCurrent();
				}
			} catch (Exception ex) {
				log.error(String.format("重做过滤操作发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		return null;
	}

	public static IEmployeeContext getCurrentMust() {
		IEmployeeContext iEmployeeContext = getCurrent();
		if (iEmployeeContext == null) {
			throw new UnauthorizedException("当前机构用户上下文无效");
		}

		return iEmployeeContext;
	}

	public static void setCurrent(IEmployeeContext iEmployeeContext) {
		UserContext.setCurrent(iEmployeeContext);
	}


	public static void fillEmployee(Employee dcEmployee, HttpServletRequest httpServletRequest) {

		String strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_DCID);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setSrfdcid(strValue);
		}

		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_DCSYSTEMID);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setDCSystemId(strValue);
		}

		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_ORGID);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setOrgId(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_ORGCODE);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setOrgCode(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_DEPTID);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setMDeptId(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_DEPTCODE);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setMDeptCode(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_PORGIDS);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setPOrgIds(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_SORGIDS);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setSOrgIds(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_PDEPTIDS);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setPDeptIds(strValue);
		}
		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_SDEPTIDS);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setSDeptIds(strValue);
		}

		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_USERID);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setUserId(strValue);
		}

		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_USERCODE);
		if (StringUtils.hasLength(strValue)) {
			dcEmployee.setUserCode(strValue);
		}

		strValue = httpServletRequest.getHeader(ISysUAAUtilRuntime.HEADER_USERNAME);
		if (StringUtils.hasLength(strValue)) {
			try {
				dcEmployee.setPersonName(URLDecoder.decode(strValue, "UTF-8"));
			} catch (Exception ex) {
				log.error(ex);
				dcEmployee.setPersonName(strValue);
			}
		}
	}

	public boolean testSysUniRes(String strUniResCode) {
		if(isSuperuser())
			return true;
		if(ObjectUtils.isEmpty(authorities))
			return false;
		if(authorities.stream().filter(grantedAuthority -> grantedAuthority.getAuthority().equalsIgnoreCase(strUniResCode)).count()>0)
			return true;
		return super.testSysUniRes(strUniResCode);
	}
}
