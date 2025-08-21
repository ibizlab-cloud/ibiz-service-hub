package net.ibizsys.central.cloud.core.dataentity.util;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.app.view.IPSAppView;
import net.ibizsys.model.control.IPSControl;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.IEntity;

/**
 * 实体扩展功能运行时对象接口
 * @author lionlau
 *
 */
public interface IDEExtensionUtilRuntime extends IDEUtilRuntime {

	public final static String EXTENSIONMODE_DATA = "DATA";
	
	public final static String EXTENSIONMODE_PDATA = "PDATA";
	
	
	public final static String EXTENSIONLOGIC_TIMERTASK = "TIMERTASK";
	
	public final static String EXTENSIONLOGIC_WEBHOOK = "WEBHOOK";
	
	public final static String DELOGIC_EVENTHOOK_PARAM_EVENTNAME = "EVENTNAME";
	
	public final static String DELOGIC_EVENTHOOK_PARAM_EVENTDATA = "EVENTDATA";
	
	public final static String DELOGIC_EVENTHOOK_PARAM_EVENTDATA2 = "EVENTDATA2";
	
	public final static String DELOGIC_EVENTHOOK_PARAM_EVENTDATA3 = "EVENTDATA3";
	
	public final static String DELOGIC_EVENTHOOK_PARAM_EVENTDATA4 = "EVENTDATA4";
	
	
	public final static String DELOGIC_DEFIELDHOOK_PARAM_LAST = "LAST";
	
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_OWNER_TYPE = "OWNER_TYPE";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_OWNER_SUBTYPE = "OWNER_SUBTYPE";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_OWNER_ID = "OWNER_ID";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_END_AT = "END_AT";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_START_AT = "START_AT";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_INFO = "INFO";
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_LEVEL = "LEVEL";
	
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_STATE = "STATE";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_CATEGORY = "CATEGORY";
	
	public final static String EXTENSIONLOG_PREDEFINEDFIELD_ELAPSED_TIME = "ELAPSED_TIME";
	
	
	
	public final static String EXTENSIONLOG_LEVEL_INFO = "INFO";
	public final static String EXTENSIONLOG_LEVEL_WARN = "WARN";
	public final static String EXTENSIONLOG_LEVEL_ERROR = "ERROR";
	
	
	public final static String EXTENSIONLOG_STATE_SUCCESS = "SUCCESS";
	public final static String EXTENSIONLOG_STATE_FAILURE = "FAILURE";
	
	/**
	 * 重新加载扩展
	 * @param v2SystemExtensionSuite
	 */
	void reloadExtension(V2SystemExtensionSuite v2SystemExtensionSuite);
	
	
	
	/**
	 * 获取扩展的实体逻辑运行时对象
	 * @param iDELogicRuntime
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime(IDELogicRuntime iDELogicRuntime);
	
	
	/**
	 * 获取扩展的实体逻辑运行时对象
	 * @param strLogicTag
	 * @param bProxyMode 是否代理模式
	 * @param bTryMode 是否尝试模式
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime(String strLogicTag, boolean bProxyMode, boolean bTryMode);
	
	
	/**
	 * 获取扩展的实体主状态逻辑运行时对象
	 * @param iDEMSLogicRuntime
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(IDEMSLogicRuntime iDEMSLogicRuntime);
	
	
	/**
	 * 获取扩展的实体主状态逻辑运行时对象
	 * @param strMSLogicTag
	 * @param bProxyMode 是否代理模式
	 * @param bTryMode 是否尝试模式
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(String strMSLogicTag, boolean bProxyMode, boolean bTryMode);
	
	
	/**
	 * 是否支持指定行为的附加逻辑
	 * @param iPSDEAction
	 * @param strAttachMode
	 * @return
	 */
	boolean isEnableActionLogic(IPSDEAction iPSDEAction, String strAttachMode);
	
	
	
	/**
	 * 执行行为附加逻辑
	 * @param dataOrKey
	 * @param iPSDEAction
	 * @param strAttachMode
	 */
	void executeActionLogics(Object dataOrKey, IPSDEAction iPSDEAction, String strAttachMode);
	
	
	/**
	 * 获取传入数据的扩展属性
	 * @param dataOrKey
	 * @return
	 */
	List<IPSDEField> getPSDEFields(Object dataOrKey);
	
	
	
	/**
	 * 获取传入模型的扩展模式
	 * @param strPSModel
	 * @return
	 */
	String[] getExtensionModes(String strPSModel);
	
	
	
	
	/**
	 * 获取扩展逻辑
	 * @param strLogicType
	 * @return
	 */
	V2SystemExtensionLogic[] getExtensionLogics(String strLogicType);
	
	
	
	
	/**
	 * 执行传入扩展逻辑
	 * @param v2SystemExtensionLogic
	 * @param objData
	 * @return
	 */
	Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData);
	
	
	
	
	
	/**
	 * 执行通知操作
	 * @param key
	 * @param strEvent
	 * @param eventData
	 * @param eventData2
	 */
	void notify(Object key, String strEvent, Object eventData, Object eventData2, Object eventData3, Object eventData4);
	
	
	
	
	
	/**
	 * 获取传入数据实体主状态运行时对象
	 * @param iEntity
	 * @param bTryMode
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity, boolean bTryMode);
	
	
	
	/**
	 * 检查传入数据及执行行为是否满足主状态
	 * @param dataOrKey
	 * @param iPSDEAction
	 */
	void checkDEMainState(Object dataOrKey, IPSDEAction iPSDEAction);
	
	
	
	
	
	/**
	 * 检查传入数据是否具备数据据访问操作
	 * @param dataOrKey
	 * @param strAccessAction
	 * @return
	 */
	boolean testDataAccessAction(Object dataOrKey, String strAccessAction);
	
	
	
	
	
	/**
	 * 获取传入应用实体的JsonSchema
	 * @param iPSAppDataEntity
	 * @param param
	 * @return
	 */
	ObjectNode getJsonSchemaModel(IPSAppDataEntity iPSAppDataEntity, Object param);
	
	
	/**
	 * 获取当前实体的JsonSchema
	 * @param param
	 * @return
	 */
	ObjectNode getJsonSchemaModel(Object param);
	
	
	/**
	 * 获取传入应用实体视图的扩展模型，如不存在，返回null
	 * @param iPSAppDEView
	 * @param param
	 * @return
	 */
	ObjectNode getPSAppViewModel(IPSAppView iPSAppView, Object param);
	
	
	
	
	/**
	 * 获取传入部件的扩展模型，如不存在，返回null
	 * @param iPSControl
	 * @param param
	 * @return
	 */
	ObjectNode getPSControlModel(IPSControl iPSControl, Object param);
	
	
	
	/**
	 * 获取扩展缓存数据（用于标记当前缓存的标记）
	 * @return
	 */
	String getExtensionSessionId();
}
