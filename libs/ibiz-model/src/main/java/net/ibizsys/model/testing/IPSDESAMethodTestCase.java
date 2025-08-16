package net.ibizsys.model.testing;



/**
 * 实体服务接口方法测试用例模型对象接口
 * <P>
 * 扩展父接口类型[DESADETAIL]
 *
 */
public interface IPSDESAMethodTestCase extends net.ibizsys.model.testing.IPSSysTestCase2{

	
	
	/**
	 * 获取实体服务接口
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSDESERVICEAPIID}
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI();


	/**
	 * 获取实体服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPIMust();
	
	
	/**
	 * 获取实体服务接口方法
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSDESADETAILID}
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod();


	/**
	 * 获取实体服务接口方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethodMust();
}