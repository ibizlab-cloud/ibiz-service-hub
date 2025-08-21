package net.ibizsys.model.app;



/**
 * 应用界面模式模型对象接口
 *
 */
public interface IPSAppUIStyle extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.app.IPSApplicationUI{

	
	
	/**
	 * 获取应用目录名称
	 * @return
	 */
	java.lang.String getAppFolder();
	
	
	/**
	 * 获取模式代码
	 * @return
	 */
	java.lang.String getStyleCode();
	
	
	/**
	 * 获取应用界面模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUIStyle}
	 * @return
	 */
	java.lang.String getUIStyle();
}