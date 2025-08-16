package net.ibizsys.model.testing;



/**
 * 应用视图测试用例模型对象接口
 * <P>
 * 扩展父接口类型[APPVIEW]
 *
 */
public interface IPSAppViewTestCase extends net.ibizsys.model.testing.IPSSysTestCase2{

	
	
	/**
	 * 获取应用视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysTestCaseDTO#FIELD_PSAPPVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
}