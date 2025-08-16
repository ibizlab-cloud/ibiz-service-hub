package net.ibizsys.model.testing;



/**
 * 系统测试用例断言模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO}运行时对象
 *
 */
public interface IPSSysTestCaseAssert extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取断言标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTTAG}
	 * @return
	 */
	java.lang.String getAssertTag();
	
	
	/**
	 * 获取断言标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTTAG2}
	 * @return
	 */
	java.lang.String getAssertTag2();
	
	
	/**
	 * 获取断言标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTTAG3}
	 * @return
	 */
	java.lang.String getAssertTag3();
	
	
	/**
	 * 获取断言标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTTAG4}
	 * @return
	 */
	java.lang.String getAssertTag4();
	
	
	/**
	 * 获取断言类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestCaseAssertType}
	 * @return
	 */
	java.lang.String getAssertType();
	
	
	/**
	 * 获取断言值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_ASSERTRESULT}
	 * @return
	 */
	java.lang.String getAssertValue();
	
	
	/**
	 * 获取异常名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_EXCEPTIONNAME}
	 * @return
	 */
	java.lang.String getExceptionName();
	
	
	/**
	 * 获取异常标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_EXCEPTIONDATA}
	 * @return
	 */
	java.lang.String getExceptionTag();
	
	
	/**
	 * 获取异常标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_EXCEPTIONDATA2}
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
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTCAssertDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
}