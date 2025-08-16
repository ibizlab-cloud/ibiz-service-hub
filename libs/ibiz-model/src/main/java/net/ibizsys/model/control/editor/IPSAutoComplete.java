package net.ibizsys.model.control.editor;



/**
 * 自动填充编辑器模型对象接口
 * <P>
 * 扩展父接口类型[AC,AC_FS,AC_NOBUTTON,AC_FS_NOBUTTON]
 *
 */
public interface IPSAutoComplete extends net.ibizsys.model.control.IPSAjaxEditor
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取触发自填最小字符数[ACMINCHARS]
	 * @return
	 */
	int getACMinChars();
	
	
	/**
	 * 获取附加上下文Json字符串
	 * @return
	 */
	java.lang.String getContextJOString();
	
	
	/**
	 * 获取项参数对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getItemParamJO();
	
	
	/**
	 * 获取应用实体自填模式对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode();


	/**
	 * 获取应用实体自填模式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust();
	
	
	/**
	 * 获取应用实体结果集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体结果集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取相关界面行为组
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取相关界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
	
	
	/**
	 * 获取附加参数Json字符串
	 * @return
	 */
	java.lang.String getParamJOString();
	
	
	/**
	 * 获取是否支持自动填充
	 * @return
	 */
	boolean isEnableAC();
	
	
	/**
	 * 获取是否必须为选择数据[FORCESELECTION]
	 * @return
	 */
	boolean isForceSelection();
	
	
	/**
	 * 获取是否显示下拉按钮[TRIGGER]
	 * @return
	 */
	boolean isShowTrigger();
}