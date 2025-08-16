package net.ibizsys.central.cloud.core.cloudutil;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;

/**
 * Cloud门户功能运行时对象接口
 * @author lionlau
 *
 */
public interface ICloudPortalUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 配置参数：MQTT IP 地址
	 */
	public final static String PARAM_MQTTIP = "mqttip";

	/**
	 * 配置参数：MQTT 端口
	 */
	public final static String PARAM_MQTTPORT = "mqttport";
	
	/**
	 * 配置参数：MQTT WebSocket端口
	 */
	public final static String PARAM_MQTTWSPORT = "mqttwsport";
	
	
	/**
	 * 配置参数：打开数据过期
	 */
	public final static String PARAM_OPENDATATIMEOUT = "opendatatimeout";
	
	
	/**
	 * 配置参数：通知代理对象参数集合，指定系统应用集成代理
	 */
	public final static String PARAM_INFORMAGENT = "INFORMAGENT";
	
	

	
	/**
	 * 打开数据操作：查看
	 */
	final public static String OPENDATAACTION_VIEW = "VIEW";
	
	/**
	 * 打开数据操作：编辑
	 */
	final public static String OPENDATAACTION_EDIT = "EDIT";
	
	
	/**
	 * 打开数据操作：已经执行更新操作
	 */
	final public static String OPENDATAACTION_UPDATE = "UPDATE";
	
	
	/**
	 * 打开数据操作：已经执行关闭操作
	 */
	final public static String OPENDATAACTION_CLOSE = "CLOSE";
	
	
	
	/**
	 * 门户通知代理代码标识
	 */
	public final static String PORTALINFORMAGENT_CODENAME = "PortalInformAgent";
	
	
	/**
	 * 通知机构人员模式：部署系统
	 */
	public final static String NOTIFYEMPLOYEESMODE_SYSTEM = "SYSTEM";
	
	/**
	 * 通知机构人员模式：机构系统
	 */
	public final static String NOTIFYEMPLOYEESMODE_DCSYSTEM = "DCSYSTEM";
	
	
	/**
	 * 向应用门户登记打开数据操作
	 * @param entity
	 * @param key
	 * @param action
	 * @param params
	 * @return
	 */
	List<PortalMessage> markOpenData(String entity, String key, String action, Map params);
	
	
	
	/**
	 * 建立异步作业
	 * @param params
	 * @return
	 */
	PortalAsyncAction createAsyncAction(Map params);
	
	
	
	/**
	 * 执行异步作业
	 * @param strId
	 * @param params
	 * @return
	 */
	PortalAsyncAction executeAsyncAction(String strId, Map params);
	
	/**
	 * 标记异步作业执行错误
	 * @param strId
	 * @param params
	 * @return
	 */
	PortalAsyncAction errorAsyncAction(String strId, Map params);
	
	
	/**
	 * 标记异步作业执行完成
	 * @param strId
	 * @param params
	 * @return
	 */
	PortalAsyncAction finishAsyncAction(String strId, Map params);
	
	
	/**
	 * 获取异步作业执行
	 * @param strId
	 * @return
	 */
	PortalAsyncAction getAsyncAction(String strId);
	
	
	/**
	 * 查询正在执行的异步作业集合（最新50条）
	 * @param params
	 * @return
	 */
	List<PortalAsyncAction> selectExecutingAsyncActions(Map params);
	
	
	/**
	 * 查询已完成的异步作业集合（最新50条）
	 * @param params
	 * @return
	 */
	List<PortalAsyncAction> selectFinishedAsyncActions(Map params);
	
	
	/**
	 * 查询错误的异步作业集合（最新50条）
	 * @param params
	 * @return
	 */
	List<PortalAsyncAction> selectErrorAsyncActions(Map params);
	
	
	
	/**
	 * 查询全部的异步作业集合（最新50条）
	 * @param params
	 * @return
	 */
	List<PortalAsyncAction> selectAllAsyncActions(Map params);
	
	
	
	/**
	 * 向门户注册 Employee
	 * @param employee
	 */
	void registerEmployee(Employee employee);
	
	
	/**
	 * 向门户通知 Employee
	 * @param employeeId
	 * @param systemId
	 * @param portalMessage
	 */
	void notifyEmployee(String employeeId, String dcsystemId, PortalMessage portalMessage);
	
	
	
	
	/**
	 * 通过系统标识向门户通知 Employee 集合
	 * @param systemId
	 * @param portalMessage
	 */
	void notifyEmployeesBySystem(String systemId, PortalMessage portalMessage);
	
	
	/**
	 * 通过机构系统标识向门户通知 Employee 集合
	 * @param systemId
	 * @param portalMessage
	 */
	void notifyEmployeesByDCSystem(String systemId, PortalMessage portalMessage);
	
	
	/**
	 * 通过模式及参数项门户通知 Employee 集合
	 * @param mode
	 * @param id
	 * @param portalMessage
	 */
	void notifyEmployees(String mode, String id, PortalMessage portalMessage);
	
	
	/**
	 * 协同
	 * @param entity
	 * @param key
	 * @param action
	 * @param params
	 */
	void collaborate(String entity, String key, String action, Map params);
}
