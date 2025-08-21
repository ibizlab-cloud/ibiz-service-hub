package net.ibizsys.model.view;



/**
 * 界面行为组成员模型基础对象接口
 *
 */
public interface IPSUIActionGroupDetail extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取按钮样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonStyle}
	 * @return
	 */
	java.lang.String getButtonStyle();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取成员标记
	 * @return
	 */
	java.lang.String getDetailTag();
	
	
	/**
	 * 获取成员标记2
	 * @return
	 */
	java.lang.String getDetailTag2();
	
	
	/**
	 * 获取启用判断脚本代码
	 * @return
	 */
	java.lang.String getEnableScriptCode();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取界面行为对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取界面行为附加参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO();
	
	
	/**
	 * 获取可见判断脚本代码
	 * @return
	 */
	java.lang.String getVisibleScriptCode();
	
	
	/**
	 * 获取是否添加分隔栏
	 * @return
	 */
	boolean isAddSeparator();
	
	
	/**
	 * 获取是否显示标题
	 * @return
	 */
	boolean isShowCaption();
	
	
	/**
	 * 获取是否显示图标
	 * @return
	 */
	boolean isShowIcon();
}