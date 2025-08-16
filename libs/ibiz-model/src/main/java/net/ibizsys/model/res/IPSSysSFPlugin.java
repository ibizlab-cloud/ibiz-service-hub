package net.ibizsys.model.res;



/**
 * 系统后台扩展插件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO}运行时对象
 *
 */
public interface IPSSysSFPlugin extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_PLUGINPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPluginParams();
	
	
	/**
	 * 获取插件标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_PLUGINTAG}
	 * @return
	 */
	java.lang.String getPluginTag();
	
	
	/**
	 * 获取插件标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_PLUGINTAG2}
	 * @return
	 */
	java.lang.String getPluginTag2();
	
	
	/**
	 * 获取插件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_PLUGINTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SFPluginType}
	 * @return
	 */
	java.lang.String getPluginType();
	
	
	/**
	 * 获取运行时对象名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_RTOBJECTNAME}
	 * @return
	 */
	java.lang.String getRTObjectName();
	
	
	/**
	 * 获取运行时对象仓库
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_RTOBJECTREPO}
	 * @return
	 */
	java.lang.String getRTObjectRepo();
	
	
	/**
	 * 获取运行时对象来源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_RTOBJECTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PluginRTMode}
	 * @return
	 */
	int getRTObjectSource();
	
	
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
	 * 获取是否延迟加载模式
	 * @return
	 */
	boolean isLazyMode();
	
	
	/**
	 * 获取是否全局默认替换
	 * @return
	 */
	boolean isReplaceDefault();
	
	
	/**
	 * 获取是否运行时对象
	 * @return
	 */
	boolean isRuntimeObject();
	
	
	/**
	 * 获取是否单例模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysSFPluginDTO#FIELD_SINGLEINSTMODE}
	 * @return
	 */
	boolean isSingleInstance();
	
	
	/**
	 * 获取是否尝试模式
	 * @return
	 */
	boolean isTryMode();
}