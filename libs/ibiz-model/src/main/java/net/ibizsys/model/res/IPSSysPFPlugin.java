package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysPFPlugin extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PLUGINPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getPluginParams();
	
	
	/**
	 * 获取插件标记
	 * @return
	 */
	java.lang.String getPluginTag();
	
	
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
	 * 获取运行时对象来源
	 * @return
	 */
	int getRTObjectSource();
	
	
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
	 * 获取是否运行时对象
	 * @return
	 */
	boolean isRuntimeObject();
}