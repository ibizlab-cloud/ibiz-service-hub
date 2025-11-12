package net.ibizsys.model.testing;



/**
 * 系统测试用例断言模型对象接口
 *
 */
public interface IPSSysTestCaseAssert extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取断言标记
	 * @return
	 */
	java.lang.String getAssertTag();
	
	
	/**
	 * 获取断言标记2
	 * @return
	 */
	java.lang.String getAssertTag2();
	
	
	/**
	 * 获取断言标记3
	 * @return
	 */
	java.lang.String getAssertTag3();
	
	
	/**
	 * 获取断言标记4
	 * @return
	 */
	java.lang.String getAssertTag4();
	
	
	/**
	 * 获取断言类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestCaseAssertType}
	 * @return
	 */
	java.lang.String getAssertType();
	
	
	/**
	 * 获取断言值
	 * @return
	 */
	java.lang.String getAssertValue();
	
	
	/**
	 * 获取异常名称
	 * @return
	 */
	java.lang.String getExceptionName();
	
	
	/**
	 * 获取异常标记
	 * @return
	 */
	java.lang.String getExceptionTag();
	
	
	/**
	 * 获取异常标记2
	 * @return
	 */
	java.lang.String getExceptionTag2();
	
	
	/**
	 * 获取测试用例输入
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInput();


	/**
	 * 获取测试用例输入，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInputMust();
	
	
	/**
	 * 获取测试数据
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestData();


	/**
	 * 获取测试数据，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestDataMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
}