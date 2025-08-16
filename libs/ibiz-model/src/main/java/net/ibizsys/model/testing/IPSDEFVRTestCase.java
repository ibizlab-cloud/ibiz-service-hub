package net.ibizsys.model.testing;



/**
 * 实体属性值规则测试用例模型对象接口
 * <P>
 * 扩展父接口类型[DEFVR]
 *
 */
public interface IPSDEFVRTestCase extends net.ibizsys.model.testing.IPSSysTestCase
		,net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取相关实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取相关实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
}