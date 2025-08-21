package net.ibizsys.model.testing;



/**
 * 系统测试项目用例模型对象接口2
 * <P>
 * 测试项目测试用例接口
 *
 */
public interface IPSSysTestCase2 extends net.ibizsys.model.testing.IPSSysTestCase{

	
	
	/**
	 * 获取测试模块
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule();


	/**
	 * 获取测试模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModuleMust();
	
	
	/**
	 * 获取测试项目
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj();


	/**
	 * 获取测试项目，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrjMust();
}