package net.ibizsys.central.cloud.core.service;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;

/**
 * 系统服务接口文档适配器接口
 * @author lionlau
 *
 */
public interface ISysServiceAPIDocAdapter {

	/**
	 * 属性：描述信息
	 */
	public final static String FIELD_DESCRIPTION = "description";
	
	
	/**
	 * 属性：名称
	 */
	public final static String FIELD_NAME = "name";
	
	
	/**
	 * 属性：引用
	 */
	public final static String FIELD_REF = "$ref";
	
	
	/**
	 * 属性：内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 * 属性：Json对象
	 */
	public final static String FIELD_JSONSCHEMA = "schema";
	
	
	/**
	 * 属性：Json对象 集合
	 */
	public final static String FIELD_JSONSCHEMAS = "schemas";
	
	
	/**
	 * 属性：复用组件集合
	 */
	public final static String FIELD_SCHEMA_COMPONENTS = "components";
	
	
	/**
	 * 属性：对所提供的API有效的路径和操作集合
	 */
	public final static String FIELD_SCHEMA_PATHS = "paths";
	
	/**
	 * 属性：路径标记集合
	 */
	public final static String FIELD_SCHEMA_TAGS = "tags";
	
	
	/**
	 * 属性：提供API相关的元数据
	 */
	public final static String FIELD_SCHEMA_INFO = "info";
	
	
	/**
	 * 属性：可选的简要总结字符串，用来描述此路径内包含的所有操作
	 */
	public final static String FIELD_PATH_SUMMARY = "summary";
	
	/**
	 * 属性：路径标记集合
	 */
	public final static String FIELD_PATH_TAGS = "tags";
	
	/**
	 * 属性：定义适用于此路径的 GET 操作
	 */
	public final static String FIELD_PATH_GET = "get";
	
	
	/**
	 * 属性：定义适用于此路径的 PUT 操作
	 */
	public final static String FIELD_PATH_PUT = "put";
	
	/**
	 * 属性：定义适用于此路径的 POST 操作
	 */
	public final static String FIELD_PATH_POST = "post";
	
	
	/**
	 * 属性：定义适用于此路径的 DELETE 操作
	 */
	public final static String FIELD_PATH_DELETE = "delete";
	
	
	/**
	 * 属性：定义适用于此路径的 OPTIONS 操作
	 */
	public final static String FIELD_PATH_OPTIONS = "options";
	
	
	/**
	 * 属性：定义适用于此路径的 HEADER 操作
	 */
	public final static String FIELD_PATH_HEADER = "header";
	
	/**
	 * 属性：定义适用于此路径的 PATCH 操作
	 */
	public final static String FIELD_PATH_PATCH = "patch";
	
	
	/**
	 * 属性：定义适用于此路径的 TRACE 操作
	 */
	public final static String FIELD_PATH_TRACE = "trace";
	
	
	
	/**
	 * 属性：接口路径的参数集合
	 */
	public final static String FIELD_PATH_PARAMETERS = "parameters";
	
	/**
	 * 属性：接口路径的唯一操作标识
	 */
	public final static String FIELD_PATH_OPERATIONID = "operationId";
	
	
	/**
	 * 属性：接口路径的请求内容
	 */
	public final static String FIELD_PATH_REQUESTBODY = "requestBody";
	
	/**
	 * 属性：接口路径的反馈内容
	 */
	public final static String FIELD_PATH_RESPONSES = "responses";
	
	
	/**
	 * 属性：参数是否必须
	 */
	public final static String FIELD_PARAMETER_REQUIRED = "required";
	
	
	/**
	 * 属性：Json类型
	 */
	public final static String FIELD_PARAMETER_SCHEMA = "schema";
	
	
	/**
	 * 属性：输入方式
	 */
	public final static String FIELD_PARAMETER_IN = "in";
	
	
	
	/**
	 * 属性，JsonSchema类型引用
	 */
	public final static String FIELD_JSONSCHEMA_REF = "$ref";
	

	/**
	 * 属性，JsonSchema属性类型
	 */
	public final static String FIELD_JSONSCHEMA_TYPE = "type";
	
	
	/**
	 * 属性：JsonSchema属性集合
	 */
	public final static String FIELD_JSONSCHEMA_PROPERTIES = "properties";
	
	
	/**
	 * 属性，JsonSchema项集合
	 */
	public final static String FIELD_JSONSCHEMA_ITEMS = "items";
	
	
	/**
	 * 属性类型：空值
	 */
	public final static String TYPE_JSONSCHEMA_NULL = "null";
	
	
	/**
	 * 属性类型：布尔值
	 */
	public final static String TYPE_JSONSCHEMA_BOOLEAN = "boolean";
	
	
	/**
	 * 属性类型：对象
	 */
	public final static String TYPE_JSONSCHEMA_OBJECT = "object";
	
	/**
	 * 属性类型：数组
	 */
	public final static String TYPE_JSONSCHEMA_ARRAY = "array";
	
	
	/**
	 * 属性类型：数值
	 */
	public final static String TYPE_JSONSCHEMA_NUMBER = "number";
	
	/**
	 * 属性类型：整形
	 */
	public final static String TYPE_JSONSCHEMA_INTEGER = "integer";
	
	/**
	 * 属性类型：字符串
	 */
	public final static String TYPE_JSONSCHEMA_STRING = "string";
	
	
	/**
	 * 属性类型：未知
	 */
	public final static String TYPE_JSONSCHEMA_UNKNOWN = "unknown";
	
	
	
	/**
	 * 注册服务映射
	 * @param iDEServiceAPIRuntime
	 * @param iDEServiceAPIRSRuntime
	 * @param iPSDEServiceAPIMethod
	 * @param paths 路径
	 */
	void registerMapping(IDEServiceAPIRuntime iDEServiceAPIRuntime, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, IPSDEServiceAPIMethod iPSDEServiceAPIMethod, String... paths);
	

	/**
	 * 注册服务映射
	 * @param iSysServiceAPIRuntime
	 * @param uris
	 * @param methods
	 * @param iPSDataEntity
	 * @param iPSDEAction
	 */
	void registerMapping(net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, IPSDataEntity iPSDataEntity, IPSDEAction iPSDEAction);
	

	/**
	 * 注册服务映射
	 * @param iSysServiceAPIRuntime
	 * @param uris
	 * @param methods
	 * @param iPSDataEntity
	 * @param iPSDEDataSet
	 */
	void registerMapping(net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, IPSDataEntity iPSDataEntity, IPSDEDataSet iPSDEDataSet);
	
	

	/**
	 * 注册服务映射
	 * @param iSysServiceAPIRuntime
	 * @param uris
	 * @param methods
	 * @param handler
	 * @param action
	 */
	void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, Object handler, Method action);
	
	
	
	
	/**
	 * 注销服务映射
	 * @param iSysServiceAPIRuntime
	 */
	void unregisterMapping(net.ibizsys.central.service.ISysServiceAPIRuntime iSysServiceAPIRuntime);
	
	
	/**
	 * 输出文档
	 * @param request
	 * @param response
	 * @return
	 */
	boolean outputOpenAPIDoc(HttpServletRequest request, HttpServletResponse response);
	
}
