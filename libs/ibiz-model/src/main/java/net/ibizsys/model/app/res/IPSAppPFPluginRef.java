package net.ibizsys.model.app.res;



/**
 * 应用前端模板插件引用模型对象接口
 * <P>
 * 定义前端应用对前端模板插件的引用，根据使用自动计算
 *
 */
public interface IPSAppPFPluginRef extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取前端模板插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端模板插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取插件代码
	 * @return
	 */
	java.lang.String getPluginCode();
	
	
	/**
	 * 获取插件模型
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPluginModel();
	
	
	/**
	 * 获取插件动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPluginParams();
	
	
	/**
	 * 获取应用插件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PFPluginType}
	 * @return
	 */
	java.lang.String getPluginType();
	
	
	/**
	 * 获取运行时对象名称
	 * @return
	 */
	java.lang.String getRTObjectName();
	
	
	/**
	 * 获取运行时对象仓库
	 * @return
	 */
	java.lang.String getRTObjectRepo();
	
	
	/**
	 * 获取引用模式
	 * @return
	 */
	java.lang.String getRefMode();
	
	
	/**
	 * 获取引用标记
	 * @return
	 */
	java.lang.String getRefTag();
	
	
	/**
	 * 获取引用标记2
	 * @return
	 */
	java.lang.String getRefTag2();
	
	
	/**
	 * 获取运行时模板代码
	 * @return
	 */
	java.lang.String getTemplCode();
	
	
	/**
	 * 获取运行时模板代码2
	 * @return
	 */
	java.lang.String getTemplCode2();
	
	
	/**
	 * 获取运行时模板代码3
	 * @return
	 */
	java.lang.String getTemplCode3();
	
	
	/**
	 * 获取运行时模板代码4
	 * @return
	 */
	java.lang.String getTemplCode4();
	
	
	/**
	 * 获取是否仅扩展界面样式
	 * @return
	 */
	boolean isExtendStyleOnly();
	
	
	/**
	 * 获取是否全局默认替换
	 * @return
	 */
	boolean isReplaceDefault();
	
	
	/**
	 * 获取是否运行时插件
	 * @return
	 */
	boolean isRuntimeObject();
}