package net.ibizsys.model.testing;



/**
 * 系统测试用例输入（调用）模型对象接口
 *
 */
public interface IPSSysTestCaseInput extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取输入行为
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInputPSDEAction();


	/**
	 * 获取输入行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getInputPSDEActionMust();
	
	
	/**
	 * 获取输入标记
	 * @return
	 */
	java.lang.String getInputTag();
	
	
	/**
	 * 获取输入标记2
	 * @return
	 */
	java.lang.String getInputTag2();
	
	
	/**
	 * 获取输入标记3
	 * @return
	 */
	java.lang.String getInputTag3();
	
	
	/**
	 * 获取输入标记4
	 * @return
	 */
	java.lang.String getInputTag4();
	
	
	/**
	 * 获取输入类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestCaseInputType}
	 * @return
	 */
	java.lang.String getInputType();
	
	
	/**
	 * 获取输入值
	 * @return
	 */
	java.lang.String getInputValue();
	
	
	/**
	 * 获取输入断言集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> getPSSysTestCaseAsserts();
	
	/**
	 * 获取输入断言集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCaseAssert getPSSysTestCaseAssert(Object objKey, boolean bTryMode);
	
	/**
	 * 设置输入断言集合
	 * @param list 输入断言集合
	 */
	void setPSSysTestCaseAsserts(java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> list);
	
	
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