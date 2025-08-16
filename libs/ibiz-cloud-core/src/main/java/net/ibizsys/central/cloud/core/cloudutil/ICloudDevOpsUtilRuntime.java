package net.ibizsys.central.cloud.core.cloudutil;

import java.io.File;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;

/**
 * 云体系DevOps功能组件接口
 * @author lionlau
 *
 */
public interface ICloudDevOpsUtilRuntime extends ICloudUtilRuntime{

	
	/**
	 * 插件-测试工具-前缀
	 */
	public final static String ADDIN_TESTTOOL_PREFIX = "TESTTOOL:";
	
	
	/**
	 * 插件-平台模型工具-前缀
	 */
	public final static String ADDIN_PSMODELTOOL_PREFIX = "PSMODELTOOL:";
	
	
	/**
	 * 插件-动态模型接口-前缀
	 */
	public final static String ADDIN_DYNAMODELAPI_PREFIX = "DYNAMODELAPI:";
	
	
	
	 /**
     *  启动系统，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_STARTX = "STARTX";
    /**
     *  代码发布，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PUBCODE = "PUBCODE";
    /**
     *  打包版本，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PACKVER = "PACKVER";
    /**
     *  打包移动应用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PACKMOBAPP = "PACKMOBAPP";
    /**
     *  启动微服务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_STARTMSAPI = "STARTMSAPI";
    /**
     *  启动微服务应用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_STARTMSAPP = "STARTMSAPP";
    /**
     *  部署系统组件到仓库，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_DEPLOYPKG = "DEPLOYPKG";
    /**
     *  启动微服务功能，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_STARTMSFUNC = "STARTMSFUNC";
    /**
     *  代码发布（模板开发），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PUBCODE2 = "PUBCODE2";
    /**
     *  文档发布，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PUBDOC = "PUBDOC";
    /**
     *  模型发布，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEVSYSTEMACTION_PUBMODEL = "PUBMODEL";
    
    
    /**
	 * 系统 操作：列出相关服务实例
	 */
	public final static String SYSTEMACTION_LISTSERVICEINSTANCES = "LISTSERVICEINSTANCES";
	

	/**
	 * 系统 操作：生产代码片段
	 */
	public final static String SYSTEMACTION_GENERATECODESNIPPET = "GENERATECODESNIPPET";
		
    /**
     *  机构系统操作：初始化测试项目
     */
    public final static String DCSYSTEMACTION_INITTESTPROJECTS = "INITTESTPROJECTS";
    
    /**
     *  机构系统操作：运行测试项目
     */
    public final static String DCSYSTEMACTION_RUNTESTPROJECT = "RUNTESTPROJECT";
    
    
    /**
     *  机构系统操作：同步平台模型
     */
    public final static String DCSYSTEMACTION_SYNCPSMODELS = "SYNCPSMODELS";
    
    
    /**
     * 机构系统操作：工具类型
     */
    public final static String PARAM_DCSYSTEMACTION_TOOLTYPE = "tooltype";
    
	
    /**
     * 系统标识：云平台
     */
    public final static String SYSTEMID_CLOUDPLATFORM = "srfcloudplatform";
    
    /**
     * 云平台操作：发布平台配置
     */
    public final static String CLOUDPLATFORMACTION_PUBCONFIG = "PUBCONFIG";
    
    
    
    /**
     * 对象存储分类：动态模型
     */
    public final static String OSSCAT_DYNAMODEL = "devops-dynamodel";
    
    
    
    
	/**
	 * 执行开发系统操作
	 * @param strSystemId
	 * @param strAction
	 * @param params
	 * @return
	 */
	Object executeDevSystemAction(String strSystemId, String strAction, Map<String, Object> params);
	
	
	
	/**
	 * 执行Cloud平台操作
	 * @param strAction
	 * @param params
	 * @return
	 */
	Object executeCloudPlatformAction(String strAction, Map<String, Object> params);
	
	
	/**
	 * 发布系统
	 * @param strSystemId
	 * @param params
	 */
	void publishSystem(String strSystemId, Map<String, Object> params);
	
	
	
	/**
	 * 发布机构系统（平台管理员身份或机构管理员身份）
	 * @param strDCSystemId
	 * @param params
	 */
	void publishDCSystem(String strDCSystemId, Map<String, Object> params);
	
	

	
	/**
	 * 执行机构系统操作（平台管理员身份或机构管理员身份）
	 * @param strDCSystemId
	 * @param strMethod
	 * @param params
	 * @param strKey
	 * @return
	 */
	Object executeDCSystemAction(String strDCSystemId, String strMethod, Object params, String strKey);
	
	
	
	/**
	 * 发布动态模型
	 * @param strDynaModelId
	 * @param params
	 */
	void publishDynaModel(String strDynaModelId, Map<String, Object> params);
	
	
	/**
	 * 获取指定系统的动态模型配置
	 * @param strSystemId
	 * @param strOrgId
	 * @return
	 */
	MetaDynaModel getMetaDynaModel(String strSystemId, String strOrgId);
	
	
	
	/**
	 * 获取指定系统的动态模型路径
	 * @param strSystemId
	 * @return
	 */
	String getMetaDynaModelPath(String strSystemId, String strOrgId);
	
	
	/**
	 * 获取指定机构系统的动态模型路径
	 * @param strDCSystemId
	 * @return
	 */
	String getMetaDynaModelPath(String strDCSystemId);
	
	
	/**
	 * 获取机构系统
	 * @param strDCSystemId
	 * @return
	 */
	DCSystem getDCSystem(String strDCSystemId);
	
	
	
	/**
	 * 是否支持开发回调
	 * @return
	 */
	boolean isEnableDevCallback();
	
	/**
	 * 获取回调Token
	 * @return
	 */
	String getCallbackToken();
	
	
	
	/**
	 * 获取系统模型摘要信息
	 * @param strSystemId
	 * @return
	 */
	String getSystemModelDigest(String strSystemId);
	
	
	
	/**
	 * 获取云平台指定系统
	 * @param strSystemId
	 * @return
	 */
	net.ibizsys.central.cloud.core.util.domain.System getSystem(String strSystemId);
	
	
	/**
	 * 获取云平台全部系统
	 * @return
	 */
	java.util.Collection<net.ibizsys.central.cloud.core.util.domain.System> getAllSystems();
	
	
	
	/**
	 * 执行系统操作（平台管理员身份）
	 * @param strSystemId
	 * @param strMethod
	 * @param params
	 * @param strKey
	 * @return
	 */
	Object executeSystemAction(String strSystemId, String strMethod, Object params, String strKey);
	
	
	
	/**
	 * 执行调试系统操作（平台管理员身份）
	 * @param strSystemId
	 * @param strMethod
	 * @param params
	 * @param strKey
	 * @return
	 */
	Object executeDebugSystemAction(String strSystemId, String strMethod, Object params, String strKey);
	
	
	
	/**
	 * 获取总线应用动态模型路径
	 * @param strSystemId
	 * @param strOrgId
	 * @param strAppId
	 * @return
	 */
	File getHubAppDynaModelFile(String strSystemId, String strOrgId, String strAppId);
	
	
	
	/**
	 * 获取子应用动态模型路径
	 * @param strSystemId
	 * @param strOrgId
	 * @param strAppId
	 * @param strSubAppId
	 * @return
	 */
	String getHubSubAppDynaModelPath(String strSystemId, String strOrgId, String strAppId, String strSubAppId);
	
	
	
	/**
	 * 调用动态模型接口（平台管理员身份）
	 * @param strSystemId
	 * @param strPModel
	 * @param strPKey
	 * @param strModel
	 * @param strMethod
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invokeDynaModelAPI(String strSystemId, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param);
}
