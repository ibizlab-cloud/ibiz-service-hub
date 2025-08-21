package net.ibizsys.model.testing;



/**
 * 系统测试项目模块模型对象接口
 *
 */
public interface IPSSysTestModule extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取模块标记
	 * @return
	 */
	java.lang.String getModuleTag();
	
	
	/**
	 * 获取模块标记2
	 * @return
	 */
	java.lang.String getModuleTag2();
	
	
	/**
	 * 获取测试用例集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getPSSysTestCases();
	
	/**
	 * 获取测试用例集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试用例集合
	 * @param list 测试用例集合
	 */
	void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list);
}