package net.ibizsys.model.app.res;



/**
 * 应用编辑器样式引用模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysEditorStyleDTO}运行时对象
 * <P>
 * 定义前端应用对系统编辑器样式的引用，根据使用自动计算
 *
 */
public interface IPSAppEditorStyleRef extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取容器类型
	 * @return
	 */
	java.lang.String getContainerType();
	
	
	/**
	 * 获取编辑器类型
	 * @return
	 */
	java.lang.String getEditorType();
	
	
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
	 * 获取引用标记
	 * @return
	 */
	java.lang.String getRefTag();
	
	
	/**
	 * 获取样式代码
	 * @return
	 */
	java.lang.String getStyleCode();
	
	
	/**
	 * 获取是否仅扩展界面样式
	 * @return
	 */
	boolean isExtendStyleOnly();
}