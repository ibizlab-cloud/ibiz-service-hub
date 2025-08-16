package net.ibizsys.model.pub;



/**
 *
 */
public interface IPSSysSFPub extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取发布内容模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SFPubContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取是否默认发布
	 * @return
	 */
	boolean getDefaultFlag();
	
	
	/**
	 * 获取Groovy源代码目录
	 * @return
	 */
	java.lang.String getGroovySourceFolder();
	
	
	/**
	 * 获取模型目录
	 * @return
	 */
	java.lang.String getModelFolder();
	
	
	/**
	 * 获取代码包名
	 * @return
	 */
	java.lang.String getPKGCodeName();
	
	
	/**
	 * 获取后台发布组件包集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> getPSSysSFPubPkgs();
	
	/**
	 * 获取后台发布组件包集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.pub.IPSSysSFPubPkg getPSSysSFPubPkg(Object objKey, boolean bTryMode);
	
	/**
	 * 设置后台发布组件包集合
	 * @param list 后台发布组件包集合
	 */
	void setPSSysSFPubPkgs(java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> list);
	
	
	/**
	 * 获取组件版本
	 * @return
	 */
	java.lang.String getVersionString();
	
	
	/**
	 * 获取是否发布代码模式
	 * @return
	 */
	boolean isCodeMode();
	
	
	/**
	 * 获取是否发布文档模式
	 * @return
	 */
	boolean isDocMode();
	
	
	/**
	 * 获取是否启用模型运行时
	 * @return
	 */
	boolean isEnableModelRT();
	
	
	/**
	 * 获取是否主后台体系
	 * @return
	 */
	boolean isMainPSSysSFPub();
	
	
	/**
	 * 获取是否发布模型
	 * @return
	 */
	boolean isPubModel();
	
	
	/**
	 * 获取是否输出子系统组件包
	 * @return
	 */
	boolean isSubSysPackage();
	
	
	/**
	 * 获取是否发布测试代码模式
	 * @return
	 */
	boolean isTestCodeMode();
}