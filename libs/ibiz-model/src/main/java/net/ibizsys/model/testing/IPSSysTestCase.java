package net.ibizsys.model.testing;



/**
 * 系统测试用例模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getTestCaseType}
 *
 */
public interface IPSSysTestCase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取断言异常数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_EXCEPTIONDATA}
	 * @return
	 */
	java.lang.String getAssertExceptionData();
	
	
	/**
	 * 获取断言异常数据2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_EXCEPTIONDATA2}
	 * @return
	 */
	java.lang.String getAssertExceptionData2();
	
	
	/**
	 * 获取断言异常名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_EXCEPTIONNAME}
	 * @return
	 */
	java.lang.String getAssertExceptionName();
	
	
	/**
	 * 获取测试断言类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_ASSERTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestCaseAssertType}
	 * @return
	 */
	java.lang.String getAssertType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取测试实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取测试实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取测试用例断言集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> getPSSysTestCaseAsserts();
	
	/**
	 * 获取测试用例断言集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCaseAssert getPSSysTestCaseAssert(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试用例断言集合
	 * @param list 测试用例断言集合
	 */
	void setPSSysTestCaseAsserts(java.util.List<net.ibizsys.model.testing.IPSSysTestCaseAssert> list);
	
	
	/**
	 * 获取测试用例输入集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> getPSSysTestCaseInputs();
	
	/**
	 * 获取测试用例输入集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestCaseInput getPSSysTestCaseInput(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试用例输入集合
	 * @param list 测试用例输入集合
	 */
	void setPSSysTestCaseInputs(java.util.List<net.ibizsys.model.testing.IPSSysTestCaseInput> list);
	
	
	/**
	 * 获取测试数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSSYSTESTDATAID}
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestData();


	/**
	 * 获取测试数据，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.testing.IPSSysTestData getPSSysTestDataMust();
	
	
	/**
	 * 获取测试用例编号
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_TESTCASESN}
	 * @return
	 */
	java.lang.String getTestCaseSN();
	
	
	/**
	 * 获取用例类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_TARGETTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestCaseTargetType}
	 * @return
	 */
	java.lang.String getTestCaseType();
	
	
	/**
	 * 获取是否事务回滚
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_ROLLBACKTRAN}
	 * @return
	 */
	boolean isRollbackTransaction();
}