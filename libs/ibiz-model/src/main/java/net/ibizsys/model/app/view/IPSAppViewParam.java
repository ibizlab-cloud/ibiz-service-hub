package net.ibizsys.model.app.view;



/**
 * 应用视图参数模型对象接口
 *
 */
public interface IPSAppViewParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取说明
	 * @return
	 */
	java.lang.String getDesc();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	java.lang.String getKey();
	
	
	/**
	 * 获取值
	 * @return
	 */
	java.lang.String getValue();
}