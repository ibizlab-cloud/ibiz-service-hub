package net.ibizsys.central.cloud.core.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 机构人员上下文对象
 * @author lionlau
 *
 */
public interface IEmployeeContext extends IUserContext{

	public final static String SESSION_SYSTEMID = "srfsystemid";
	public final static String SESSION_DCSYSTEMID = "srfdcsystemid";
	
	
	/**
	 * 获取当前组织身份
	 * @return
	 */
	Employee getEmployee();
	
	
	/**
	 * 获取当前中心动态模型
	 * @return
	 */
	MetaDynaModel getMetaDynaModel();
	
	
	
	/**
	 * 获取访问系统标识
	 * @return
	 */
	String getSystemid();
	
	
	
	/**
	 * 获取租户系统标识
	 * @return
	 */
	String getDcsystemid();
	
	
	/**
	 * 获取全局用户标记
	 * @return
	 */
	String getUaausername();
	
	
	/**
	 * 获取全局用户标识
	 * @return
	 */
	String getUaauserid();
	
	
	/**
	 * 获取授权集合
	 * @return
	 */
    Collection<? extends GrantedAuthority> getAuthorities();
    
    
    
    /**
     * 获取机构用户的实时交互的MqttTopic
     * @return
     */
    String getMqtttopic();
    
    
    
    /**
     * 获取全局会话标识
     * @return
     */
    String getGlobalsessionid();
}
