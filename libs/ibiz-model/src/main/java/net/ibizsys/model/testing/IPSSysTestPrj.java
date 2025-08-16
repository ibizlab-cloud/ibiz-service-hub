package net.ibizsys.model.testing;



/**
 * 系统测试项目模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO}运行时对象
 *
 */
public interface IPSSysTestPrj extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统应用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO#FIELD_PSSYSAPPID}
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplication();


	/**
	 * 获取系统应用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplicationMust();
	
	
	/**
	 * 获取系统服务接口
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO#FIELD_PSSYSSERVICEAPIID}
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI();


	/**
	 * 获取系统服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust();
	
	
	/**
	 * 获取测试模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestModule> getPSSysTestModules();
	
	/**
	 * 获取测试模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试模块集合
	 * @param list 测试模块集合
	 */
	void setPSSysTestModules(java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list);
	
	
	/**
	 * 获取项目标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO#FIELD_PRJTAG}
	 * @return
	 */
	java.lang.String getPrjTag();
	
	
	/**
	 * 获取项目标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO#FIELD_PRJTAG2}
	 * @return
	 */
	java.lang.String getPrjTag2();
	
	
	/**
	 * 获取项目类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestPrjDTO#FIELD_PRJTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestPrjType}
	 * @return
	 */
	java.lang.String getPrjType();
}