package net.ibizsys.central.cloud.core.sysutil;

/**
 * 系统DevOps功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysDevOpsUtilRuntime extends net.ibizsys.central.sysutil.ISysDevOpsUtilRuntime{

	/**
	 * 测试项目类型：单元测试
	 */
	public final static String TESTPRJTYPE_UNITTEST = "UNITTEST";

	/**
	 * 测试项目类型：模型测试
	 */
	public final static String TESTPRJTYPE_MODELTEST = "MODELTEST";
	
	
	/**
	 * 测试项目类型：工作流测试
	 */
	public final static String TESTPRJTYPE_WFTEST = "WFTEST";
	

	/**
	 * DevOps组件操作：运行测试项目
	 */
	public final static String DEVOPSACTION_RUNTESTPROJECT = "RUNTESTPROJECT";
	
	
	/**
	 * DevOps组件操作：列出后台服务插件
	 */
	public final static String DEVOPSACTION_LISTPSSYSSFPLUGINS = "LISTPSSYSSFPLUGINS";
	
	
	/**
	 * DevOps组件操作：获取运行系统的相关信息
	 */
	public final static String DEVOPSACTION_GETSYSTEMINFO = "GETSYSTEMINFO";
	
	/**
	 * 执行作业
	 * @param strAction
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 */
	Object executeAction(String strAction, Object objBody, String strKey, Object objTag);

	
}
