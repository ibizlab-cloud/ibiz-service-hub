package net.ibizsys.model.app.view;



/**
 * 应用视图逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO}运行时对象
 *
 */
public interface IPSAppViewLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取注入属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_ATTRNAME}
	 * @return
	 */
	java.lang.String getAttrName();
	
	
	/**
	 * 获取事件参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_EVENTARG}
	 * @return
	 */
	java.lang.String getEventArg();
	
	
	/**
	 * 获取事件参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_EVENTARG2}
	 * @return
	 */
	java.lang.String getEventArg2();
	
	
	/**
	 * 获取事件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_EVENTNAMES}
	 * @return
	 */
	java.lang.String getEventNames();
	
	
	/**
	 * 获取子项名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_ITEMNAME}
	 * @return
	 */
	java.lang.String getItemName();
	
	
	/**
	 * 获取逻辑标记
	 * @return
	 */
	java.lang.String getLogicParam();
	
	
	/**
	 * 获取逻辑标记2
	 * @return
	 */
	java.lang.String getLogicParam2();
	
	
	/**
	 * 获取逻辑触发
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSAPPVIEWLOGICTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewLogicTrigger}
	 * @return
	 */
	java.lang.String getLogicTrigger();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlLogicType}
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取部件容器
	 * @return
	 */
	java.lang.Object getOwner();
	
	
	/**
	 * 获取应用实体界面行为对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction();


	/**
	 * 获取应用实体界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIActionMust();
	
	
	/**
	 * 获取应用实体界面逻辑对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取应用实体界面逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
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
	 * 获取应用预置界面逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic();


	/**
	 * 获取应用预置界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust();
	
	
	/**
	 * 获取视图界面引擎
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine();


	/**
	 * 获取视图界面引擎，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngineMust();
	
	
	/**
	 * 获取调用视图逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSSYSVIEWLOGICID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic();


	/**
	 * 获取调用视图逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogicMust();
	
	
	/**
	 * 获取视图界面行为
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction();


	/**
	 * 获取视图界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIActionMust();
	
	
	/**
	 * 获取应用前端插件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSSYSPFPLUGINID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取应用前端插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取部件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_PSDEVIEWCTRLNAME}
	 * @return
	 */
	java.lang.String getPSViewCtrlName();
	
	
	/**
	 * 获取脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取定时间隔（ms）
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEViewLogicDTO#FIELD_TIMER}
	 * @return
	 */
	int getTimer();
	
	
	/**
	 * 获取是否内建逻辑
	 * @return
	 */
	boolean isBuiltinLogic();
}