package net.ibizsys.model.app.view;



/**
 * 应用视图界面引擎模型对象接口
 *
 */
public interface IPSAppViewEngine extends net.ibizsys.model.view.IPSUIEngine{

	
	
	/**
	 * 获取引擎分类
	 * @return
	 */
	java.lang.String getEngineCat();
	
	
	/**
	 * 获取引擎类型
	 * @return
	 */
	java.lang.String getEngineType();
}