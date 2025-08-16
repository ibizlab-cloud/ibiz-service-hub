package net.ibizsys.model.testing;



/**
 * 实体行为测试用例模型对象接口
 * <P>
 * 扩展父接口类型[DEACTION]
 *
 */
public interface IPSDEActionTestCase extends net.ibizsys.model.testing.IPSSysTestCase
		,net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取测试实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取测试实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
}