package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

/**
 * 操作会话管理对象
 * 
 * @author lionlau
 *
 */
public class ActionSession {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ActionSession.class);
	
	/**
	 * 系统保留参数标识：最后返回结果
	 */
	public final static String PARAM_LASTRETURN = "__LAST_RETURN__";
	
	/**
	 * 系统保留参数标识：异步调用结果：下载路径
	 */
	public final static String PARAM_ASYNCACTION_DOWNLOADURL = "__ASYNCACTION_DOWNLOADURL__";
	
	
	/**
	 * 系统保留参数标识：异步调用：步骤
	 */
	public final static String PARAM_ASYNCACTION_STEP = "__ASYNCACTION_STEP__";
	
	/**
	 * 系统保留参数标识：异步调用：结果
	 */
	public final static String PARAM_ASYNCACTION_RESULT = "__ASYNCACTION_RESULT__";
	
	/**
	 * 系统保留参数标识：异步调用：全部步骤
	 */
	public final static String PARAM_ASYNCACTION_FULLSTEP = "__ASYNCACTION_FULLSTEP__";
	
	
	/**
	 * 系统保留参数标识：异步调用结果：完成率
	 */
	public final static String PARAM_ASYNCACTION_COMPLETIONRATE = "__ASYNCACTION_COMPLETIONRATE__";
	
	
	
	/**
	 * 空参数值
	 */
	public static final Object EMPTYPARAM = new Object();
	
	/**
	 * 递归操作数据Map
	 */
	private Map<String, String> recursionDataMap = new HashMap<String, String>();

	/**
	 * 操作参数
	 */
	private Map<String, Object> actionParamMap = new HashMap<String, Object>();
	
	/**
	 * 会话后续操作列表
	 */
	private java.util.List<IASFutureAction> asFutureActionList = null;

	private String strName = "";
	
	private String strDEName = "";

	//private StringBuilder actionInfoSB = new StringBuilder();
	
//	private String strActionStep = null;
//	
//	private double fCompletionRate = 0.0;
	
	private IEntity envEntity = null;

	//private ActionSession childActionSession = null;
	
	private int nLevel = 0;
	
	private IDynaInstRuntime iDynaInstRuntime = null;
	private IDynaInstRuntime childDynaInstRuntime = null;
	private String strSessionId = null;
	private String strGlobalSessionId = null;
	private String strDefaultDynaInstId = null;
	private IUserContext iUserContext = null;
	private IAppContext iAppContext = null;
	
	private ActionSessionLog actionSessionLog = null;
	
	private boolean bIgnoreDuplicateCheck = false;
	
	private boolean bIgnoreRecursionCheck = false;
	
	private boolean bIgnoreCheck = false;
	
	private boolean bIgnoreTranslateEntityNestedDERsAfterProceed = false;
	
	private boolean bEnableNestedDataLightMode = false;

	private boolean bInTran = false;
	
	private IDataEntityRuntime transactionDataEntityRuntime = null;
	
	public ActionSession(){
		
	}
	
//	protected ActionSession(ActionSession parentActionSession,int nLevel){
//		try{
//			this.nLevel = nLevel;
//			//克隆环境变量
//			if(parentActionSession.getEnvEntity(false) != null){
//				this.envEntity =  new SimpleEntity();
//				parentActionSession.getEnvEntity(false).copyTo(this.envEntity);
//			}
//		}
//		catch(Exception ex){
//			log.error(ex);
//		}
//		
//	}
	
	
//	/**
//	 * 开启子会话
//	 * @param strName
//	 * @return
//	 */
//	public ActionSession openChildSession(String strName) {
//		if(this.childActionSession == null){
//			this.childActionSession = new ActionSession(this,nLevel+1);
//			this.childActionSession.setName(strName);
//			this.childActionSession.setUserContext(this.getUserContext(true));
//			this.childActionSession.setAppContext(this.getAppContext(true));
//			this.childActionSession.setInTransaction(this.isInTransaction());
//			this.childActionSession.setGlobalSessionId(this.getGlobalSessionId());
//			return this.childActionSession;
//		}
//		else{
//			return this.childActionSession.openChildSession(strName);
//		}
//	}
//	
//	/**
//	 * 关闭子会话
//	 */
//	public int closeChildSession(){
//		return closeChildSession(true);
//	}
//	
//	/**
//	 * 关闭子会话
//	 */
//	public int closeChildSession(boolean bCommit){
//		if(this.childActionSession==null)
//			return -1;
//		
//		int nLastLevel = this.childActionSession.closeChildSession(bCommit);
//		if(nLastLevel == -1){
//			this.childActionSession = null;
//			return this.nLevel;
//		}
//		
//		return nLastLevel;
//	}
//	

//	/**
//	 * 获取当前会话
//	 * @return
//	 */
//	public ActionSession getCurrentSession(){
//		if(this.childActionSession==null)
//			return this;
//		return this.childActionSession.getCurrentSession();
//	}
	
	
	/**
	 * 获取名称
	 * 
	 * @return
	 */
	public String getName() {
		return this.strName;
	}

	/**
	 * 设置名称
	 * 
	 * @param strName
	 */
	public void setName(String strName) {
		this.strName = strName;
	}
	
	/**
	 * 获取实体名称
	 * 
	 * @return
	 */
	public String getDEName() {
		return this.strDEName;
	}

	/**
	 * 设置实体名称
	 * 
	 * @param strName
	 */
	public void setDEName(String strDEName) {
		this.strDEName = strDEName;
	}
	
	/**
	 * 获取实体名称，未指定是使用名称替代
	 * @return
	 */
	public String getDENameIf() {
		if(StringUtils.hasLength(this.strDEName)) {
			return this.strDEName;
		}
		return this.getName();
	}
	

	/**
	 * 获取是否在事务中
	 * 
	 * @return
	 */
	public boolean isInTransaction() {
		return this.bInTran;
	}

	/**
	 * 设置是否在事务中
	 * 
	 * @param bInTran
	 */
	public void setInTransaction(boolean bInTran) {
		this.bInTran = bInTran;
	}
	
	/**
	 * 获取当前的事务实体
	 * 
	 * @return
	 */
	public IDataEntityRuntime getTransactionDataEntityRuntime() {
		return this.transactionDataEntityRuntime;
	}

	/**
	 * 设置当前的事务实体
	 * 
	 * @param bInTran
	 */
	public void setTransactionDataEntityRuntime(IDataEntityRuntime transactionDataEntityRuntime) {
		this.transactionDataEntityRuntime = transactionDataEntityRuntime;
	}
	

	/**
	 * 注册递归操作
	 * 
	 * @param strDEId
	 * @param objKeyValue
	 * @return
	 */
	public boolean registerRecursion(String strDEId, Object objKeyValue) {
		String strRecursionTag = String.format("%1$s||%2$s", strDEId, objKeyValue);
		if (recursionDataMap.containsKey(strRecursionTag)) {
			return false;
		}
		recursionDataMap.put(strRecursionTag, "");
		return true;
	}
	
	
	/**
	 * 注销递归操作
	 * @param strDEId
	 * @param objKeyValue
	 */
	public void unregisterRecursion(String strDEId, Object objKeyValue) {
		String strRecursionTag = String.format("%1$s||%2$s", strDEId, objKeyValue);
		recursionDataMap.remove(strRecursionTag);
	}
	

	/**
	 * 注册递归操作
	 * 
	 * @param strActionType 操作类型
	 * @param strDEId
	 * @param objKeyValue
	 * @return
	 */
	public boolean registerRecursion(String strActionType, String strDEId, Object objKeyValue) {
		String strRecursionTag = String.format("%1$s||%2$s||%3$s", strActionType, strDEId, objKeyValue);
		if (recursionDataMap.containsKey(strRecursionTag)) {
			return false;
		}
		recursionDataMap.put(strRecursionTag, "");
		return true;
	}
	
	/**
	 * 注销递归操作
	 * @param strActionType
	 * @param strDEId
	 * @param objKeyValue
	 */
	public void unregisterRecursion(String strActionType, String strDEId, Object objKeyValue) {
		String strRecursionTag = String.format("%1$s||%2$s||%3$s", strActionType, strDEId, objKeyValue);
		recursionDataMap.remove(strRecursionTag);
	}
	
	
	
	/**
	 * 注册递归操作
	 * 
	 * @param strActionType 操作类型
	 * @param strDEId
	 * @param objKeyValue
	 * @param objTag 
	 * @return
	 */
	public boolean registerRecursion(String strActionType, String strDEId, Object objKeyValue,Object objTag) {
		String strRecursionTag = String.format("%1$s||%2$s||%3$s||%4$s", strActionType, strDEId, objKeyValue,objTag);
		if (recursionDataMap.containsKey(strRecursionTag)) {
			return false;
		}
		recursionDataMap.put(strRecursionTag, "");
		return true;
	}
	
	/**
	 * 注销递归操作
	 * 
	 * @param strActionType 操作类型
	 * @param strDEId
	 * @param objKeyValue
	 * @param objTag 
	 * @return
	 */
	public void unregisterRecursion(String strActionType, String strDEId, Object objKeyValue,Object objTag) {
		String strRecursionTag = String.format("%1$s||%2$s||%3$s||%4$s", strActionType, strDEId, objKeyValue,objTag);
		recursionDataMap.remove(strRecursionTag);
	}

//	/**
//	 * 附加操作信息
//	 * 
//	 * @param strInfo
//	 */
//	public void appendActionInfo(String strInfo) {
//		actionInfoSB.append(strInfo);
//	}
	
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 */
	public void updateActionStep(String strStep) {
		this.updateActionStep(strStep, getCompletionRate());
	}
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 * @param bAppendFullStepInfo 附加完整步骤
	 */
	public void updateActionStep(String strStep, boolean bAppendFullStepInfo) {
		this.updateActionStep(strStep, getCompletionRate(), bAppendFullStepInfo);
	}
	
//	/**
//	 * 更新当前行为操作步骤
//	 * @param strStep
//	 * @param fCompletionRate
//	 */
//	public void updateActionStep(String strStep, double fCompletionRate) {
//		//this.updateActionStep(strStep, fCompletionRate, true);
//		this.updateActionStep(strStep, fCompletionRate, false);
//	}
//	
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 * @param fCompletionRate
	 */
	public void updateActionStep(String strStep, double fCompletionRate) {
		this.updateActionStep(strStep, fCompletionRate, false);
	}
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 * @param fCompletionRate
	 * @param bAppendFullStepInfo 附加完整步骤
	 */
	public void updateActionStep(String strStep, double fCompletionRate, boolean bAppendFullStepInfo) {
		this.setActionParam(PARAM_ASYNCACTION_STEP, strStep);
		this.setActionParam(PARAM_ASYNCACTION_COMPLETIONRATE, fCompletionRate);
		if(bAppendFullStepInfo && StringUtils.hasLength(strStep)) {
			String strFullStepInfo = this.getActionFullStep();
			if(StringUtils.hasLength(strFullStepInfo)) {
				strFullStepInfo = String.format("%1$s\r\n%2$s", strFullStepInfo,strStep);
			}
			else {
				strFullStepInfo = strStep;
			}
			this.setActionParam(PARAM_ASYNCACTION_FULLSTEP, strFullStepInfo);
		}
	}
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 * @param fCompletionRate
	 * @param strActionResult
	 * @param bAppendActionInfo
	 */
	public void updateActionStep(String strStep, String strActionResult) {
		this.updateActionStep(strStep, getCompletionRate(), strActionResult);
	}
	
//	/**
//	 * 更新当前行为操作步骤
//	 * @param strStep
//	 * @param fCompletionRate
//	 * @param strActionResult
//	 * @param bAppendActionInfo
//	 */
//	public void updateActionStep(String strStep, double fCompletionRate, String strActionResult) {
//		this.updateActionStep(strStep, fCompletionRate, strActionResult, false);
//	}
	
	public void updateActionStep(String strStep, double fCompletionRate, String strActionResult) {
		this.updateActionStep(strStep, fCompletionRate, strActionResult, false);
	}
	
	/**
	 * 更新当前行为操作步骤
	 * @param strStep
	 * @param fCompletionRate
	 * @param strActionResult
	 * @param bAppendActionInfo
	 */
	public void updateActionStep(String strStep, double fCompletionRate, String strActionResult, boolean bAppendFullStepInfo) {
		this.setActionParam(PARAM_ASYNCACTION_STEP, strStep);
		this.setActionParam(PARAM_ASYNCACTION_COMPLETIONRATE, fCompletionRate);
		this.setActionParam(PARAM_ASYNCACTION_RESULT, strActionResult);
		if(bAppendFullStepInfo && StringUtils.hasLength(strStep)) {
			String strFullStepInfo = this.getActionFullStep();
			if(StringUtils.hasLength(strFullStepInfo)) {
				strFullStepInfo = String.format("%1$s\r\n%2$s", strFullStepInfo,strStep);
			}
			else {
				strFullStepInfo = strStep;
			}
			this.setActionParam(PARAM_ASYNCACTION_FULLSTEP, strFullStepInfo);
		}
	}
	
	
	public String getActionStep() {
		return DataTypeUtils.asString(this.getActionParam(PARAM_ASYNCACTION_STEP), null);
	}
	
	public String getActionFullStep() {
		return DataTypeUtils.asString(this.getActionParam(PARAM_ASYNCACTION_FULLSTEP), null);
	}
	
	public String getActionResult() {
		return DataTypeUtils.asString(this.getActionParam(PARAM_ASYNCACTION_RESULT), null);
	}
	
	public double getCompletionRate() {
		return DataTypeUtils.asDouble(this.getActionParam(PARAM_ASYNCACTION_COMPLETIONRATE), 0.0);
	}
	
	
	
//	/**
//	 * 获取操作信息
//	 * 
//	 * @return
//	 */
//	public String getActionInfo() {
//		return this.actionInfoSB.toString();
//	}

	/**
	 * 设置操作参数
	 * 
	 * @param strName
	 * @param objValue
	 */
	public void setActionParam(String strName, Object objValue) {
		actionParamMap.put(strName, objValue);
	}

	/**
	 * 移除操作参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object removeActionParam(String strName) {
		return actionParamMap.remove(strName);
	}
	
	
	
	/**
	 * 判断是否存在指定操作参数
	 * @param strName
	 * @return
	 */
	public boolean containsActionParam(String strName){
		return actionParamMap.containsKey(strName);
	}

	/**
	 * 获取操作参数
	 * 
	 * @param strName
	 * @return
	 */
	public Object getActionParam(String strName) {
		return actionParamMap.get(strName);
	}
	
	
	/**
	 * 重置行为参数
	 * 
	 * @return
	 */
	public void resetActionParams() {
		actionParamMap.clear();
	}
	
	
	/**
	 * 获取当前环境变量
	 * @param bIfCreate 不存在是否建立
	 * @return
	 */
	public IEntity getEnvEntity(boolean bIfCreate){
		if(this.envEntity == null){
			if(bIfCreate)
				this.envEntity = new SimpleEntity();
		}
		return this.envEntity;
	}
	
	
	/**
	 * 获取当前环境变量
	 * @return
	 */
	public IEntity getEnvEntity(){
		return getEnvEntity(false);
	}
	
	
	/**
	 * 重置当前环境变量
	 */
	public void resetEnvEntity(){
		this.envEntity = null;
	}
	
	/**
	 * 获取操作会话层级
	 * @return
	 */
	public int getLevel(){
		return this.nLevel;
	}
	
	
	/**
	 * 设置会话的动态实例运行时
	 * @param iDynaInstRuntime
	 */
	public void setDynaInstRuntime(IDynaInstRuntime iDynaInstRuntime) {
		this.iDynaInstRuntime = iDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的动态实例运行时
	 * @return
	 */
	public IDynaInstRuntime getDynaInstRuntime() {
		return this.iDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的子动态实例运行时
	 * @param childDynaInstRuntime
	 */
	public void setChildDynaInstRuntime(IDynaInstRuntime childDynaInstRuntime) {
		this.childDynaInstRuntime = childDynaInstRuntime;
	}
	
	
	/**
	 * 设置会话的子动态实例运行时
	 * @return
	 */
	public IDynaInstRuntime getChildDynaInstRuntime() {
		return this.childDynaInstRuntime;
	}
	
	/**
	 * 获取默认动态实例标识
	 * @return
	 */
	public String getDefaultDynaInstId() {
		return this.strDefaultDynaInstId;
	}
	
	/**
	 * 设置默认动态实例标识
	 * @param strDefaultDynaInstId
	 */
	public void setDefaultDynaInstId(String strDefaultDynaInstId) {
		this.strDefaultDynaInstId = strDefaultDynaInstId;
	}
	
	
	/**
	 * 获取当前会话标识
	 * @return
	 */
	public String getSessionId() {
		return this.strSessionId;
	}
	
	/**
	 * 设置当前会话标识
	 * @param strSessionId
	 */
	public void setSessionId(String strSessionId) {
		this.strSessionId = strSessionId;
	}
	
	/**
	 * 获取全局会话标识
	 * @return
	 */
	public String getGlobalSessionId() {
		return this.strGlobalSessionId;
	}
	
	/**
	 * 设置全局会话标识
	 * @param strSessionId
	 */
	public void setGlobalSessionId(String strGlobalSessionId) {
		this.strGlobalSessionId = strGlobalSessionId;
	}
	
	
	public void newSessionId() {
		this.strSessionId = KeyValueUtils.genGuidEx();
	}
	
	
	/**
	 * 获取当前用户上下文
	 * @return
	 */
	public IUserContext getUserContext() {
		return getUserContext(false);
	}
	
	/**
	 * 获取当前会话的用户上下文
	 * @param 仅当前会话定义
	 * @return
	 */
	public IUserContext getUserContext(boolean bSessionOnly) {
		if(this.iUserContext == null && !bSessionOnly) {
			return UserContext.getCurrent();
		}
		return this.iUserContext;
	}
	
	/**
	 * 设置当前会话的用户上下文
	 * @return
	 */
	public void setUserContext(IUserContext iUserContext) {
		this.iUserContext = iUserContext;
	}
	
	
	/**
	 * 获取当前用户上下文（必须存在）
	 * @return
	 */
	public IUserContext getUserContextMust() {
		IUserContext iUserContext = getUserContext();
		if(iUserContext == null) {
			throw new RuntimeException("用户上下文对象无效");
		}
		return iUserContext;
	}
	
	
	/**
	 * 获取当前应用上下文
	 * @return
	 */
	public IAppContext getAppContext() {
		return getAppContext(false);
	}
	
	/**
	 * 获取当前应用上下文
	 * @param bSessionOnly 仅当前会话定义
	 * @return
	 */
	public IAppContext getAppContext(boolean bSessionOnly) {
		if(this.iAppContext == null && !bSessionOnly && getUserContext() != null) {
			return getUserContext().getAppContext();
		}
		return this.iAppContext;
		
	}
	
	/**
	 * 设置当前用户上下文
	 * @return
	 */
	public void setAppContext(IAppContext iAppContext) {
		this.iAppContext = iAppContext;
	}
	
	
	/**
	 * 获取当前应用上下文（必须存在）
	 * @return
	 */
	public IAppContext getAppContextMust() {
		IAppContext iAppContext = getAppContext();
		if(iAppContext == null) {
			throw new RuntimeException("应用上下文对象无效");
		}
		return iAppContext;
	}
	
	
	
	/**
	 * 注册操作会话后续作业
	 * 
	 * @param iASFutureAction
	 * @return
	 */
	public void registerFutureAction(IASFutureAction iASFutureAction) {
		registerFutureAction(iASFutureAction,false);
	}
	/**
	 * 注册操作会话后续作业
	 * 
	 * @param iASFutureAction
	 * @param 是否移除相同标识
	 * @return
	 */
	public void registerFutureAction(IASFutureAction iASFutureAction, boolean bRemoveIf) {
		
		Assert.notNull(iASFutureAction,"传入操作会话后续行为无效");
		
		if(this.asFutureActionList == null) {
			this.asFutureActionList = new ArrayList<IASFutureAction>();
		}
		if(bRemoveIf && StringUtils.hasLength(iASFutureAction.getId())) {
			for(IASFutureAction lastASFutureAction : this.asFutureActionList) {
				if(iASFutureAction.getId().equals(lastASFutureAction.getId())) {
					this.asFutureActionList.remove(lastASFutureAction);
					break;
				}
			}
		}
		
		this.asFutureActionList.add(iASFutureAction);
	}
	
	
//	private List<IASFutureAction> getFutureActionList() {
//		return this.asFutureActionList;
//	}
//	
//	
//	private void setFutureActionList(List<IASFutureAction> asFutureActionList) {
//		this.asFutureActionList = asFutureActionList;
//	}
	
//	
//	/**
//	 * 获取当前后续作业数量
//	 * @return
//	 */
//	public int getFutureActionCount() {
//		if(this.asFutureActionList == null) {
//			return 0;
//		}
//		return this.asFutureActionList.size();
//	}
//
	
	protected void executeFutureActions(boolean bCommit) {
		if(this.asFutureActionList == null) {
			return;
		}
		
		for(IASFutureAction lastASFutureAction : this.asFutureActionList) {
			if(bCommit) {
				lastASFutureAction.commit();
			}
			else {
				lastASFutureAction.rollback();
			}
		}
		
		this.asFutureActionList = null;
	}
	
	/**
	 * 注销操作会话后续作业
	 * 
	 * @param iASFutureAction
	 * @return
	 */
	public void unregisterFutureAction(String strActionId) {
		if(this.asFutureActionList == null) {
			return;
		}
		
		for(IASFutureAction lastASFutureAction : this.asFutureActionList) {
			if(strActionId.equals(lastASFutureAction.getId())) {
				this.asFutureActionList.remove(lastASFutureAction);
				break;
			}
		}
	}

	/**
	 * 关闭会话
	 * @param bCommit
	 */
	public void close(boolean bCommit) {
		executeFutureActions(bCommit);
	}
	
	
	/**
	 * 开始日志
	 * @param strDEName
	 * @param strAction
	 * @return
	 */
	public IActionSessionLog beginLog(String strDEName, String strAction) {
		
		if(actionSessionLog == null) {
			actionSessionLog = new ActionSessionLog(null);
			actionSessionLog.setBeginTime(System.currentTimeMillis());
			actionSessionLog.setAction(strAction);
			actionSessionLog.setDEName(strDEName);
			return actionSessionLog;
		}
		else {
			actionSessionLog =  actionSessionLog.beginSubAction(strDEName, strAction);
			return actionSessionLog;
		}
	}
	
	/**
	 * 结束日志
	 * @param strInfo
	 * @return
	 */
	public IActionSessionLog endLog(String strInfo) {
		if(actionSessionLog == null) {
			//throw new RuntimeException(String.format("未开始日志"));
			return null;
		}
		
		ActionSessionLog curActionSessionLog = actionSessionLog;
		actionSessionLog = curActionSessionLog.endAction(strInfo);
		return curActionSessionLog;
	}
	
	/**
	 * 结束日志
	 * @param strInfo
	 * @param bError
	 * @param cause
	 * @return
	 */
	public IActionSessionLog endLog(String strInfo, boolean bError, Throwable cause) {
		if(actionSessionLog == null) {
			return null;
		}
		
		ActionSessionLog curActionSessionLog = actionSessionLog;
		actionSessionLog = curActionSessionLog.endAction(strInfo, bError, cause);
		return curActionSessionLog;
	}
	
	
	/**
	 * 设置最后的返回结果
	 * @return
	 */
	public Object getLastReturn() {
		return this.getActionParam(PARAM_LASTRETURN);
	}

	/**
	 * 设置最后的返回结果
	 * @param lastReturn
	 */
	public void setLastReturn(Object lastReturn) {
		this.setActionParam(PARAM_LASTRETURN, lastReturn);
	}
	
	public boolean isIgnoreCheck() {
		return bIgnoreCheck;
	}

	public void setIgnoreCheck(boolean bIgnoreCheck) {
		this.bIgnoreCheck = bIgnoreCheck;
	}
	
	public boolean isIgnoreDuplicateCheck() {
		return this.bIgnoreDuplicateCheck || isIgnoreCheck();
	}

	public void setIgnoreDuplicateCheck(boolean bIgnoreDuplicateCheck) {
		this.bIgnoreDuplicateCheck = bIgnoreDuplicateCheck;
	}

	public boolean isIgnoreRecursionCheck() {
		return this.bIgnoreRecursionCheck || isIgnoreCheck();
	}

	public void setIgnoreRecursionCheck(boolean bIgnoreRecursionCheck) {
		this.bIgnoreRecursionCheck = bIgnoreRecursionCheck;
	}
	
	public boolean isIgnoreTranslateEntityNestedDERsAfterProceed() {
		return bIgnoreTranslateEntityNestedDERsAfterProceed;
	}

	public void setIgnoreTranslateEntityNestedDERsAfterProceed(boolean bIgnoreTranslateEntityNestedDERsAfterProceed) {
		this.bIgnoreTranslateEntityNestedDERsAfterProceed = bIgnoreTranslateEntityNestedDERsAfterProceed;
	}
	


	public boolean isEnableNestedDataLightMode() {
		return bEnableNestedDataLightMode;
	}

	public void setEnableNestedDataLightMode(boolean bEnableNestedDataLightMode) {
		this.bEnableNestedDataLightMode = bEnableNestedDataLightMode;
	}

	public ActionSessionBackup backup() {
		ActionSessionBackup actionSessionBackup = new ActionSessionBackup();
		actionSessionBackup.setChildDynaInstRuntime(this.childDynaInstRuntime);
		actionSessionBackup.setDynaInstRuntime(this.iDynaInstRuntime);
		actionSessionBackup.setIgnoreCheck(this.bIgnoreCheck);
		actionSessionBackup.setIgnoreDuplicateCheck(this.bIgnoreDuplicateCheck);
		actionSessionBackup.setIgnoreRecursionCheck(this.bIgnoreRecursionCheck);
		actionSessionBackup.setIgnoreTranslateEntityNestedDERsAfterProceed(this.bIgnoreTranslateEntityNestedDERsAfterProceed);
		actionSessionBackup.setEnableNestedDataLightMode(this.bEnableNestedDataLightMode);
		actionSessionBackup.setSessionId(this.strSessionId);
		return actionSessionBackup;
	}
	
	public void restore(ActionSessionBackup actionSessionBackup) {
		this.childDynaInstRuntime = actionSessionBackup.getChildDynaInstRuntime();
		this.iDynaInstRuntime = actionSessionBackup.getDynaInstRuntime();
		this.bIgnoreCheck = actionSessionBackup.isIgnoreCheck();
		this.bIgnoreDuplicateCheck = actionSessionBackup.isIgnoreDuplicateCheck();
		this.bIgnoreRecursionCheck = actionSessionBackup.isIgnoreRecursionCheck();
		this.bIgnoreTranslateEntityNestedDERsAfterProceed = actionSessionBackup.isIgnoreTranslateEntityNestedDERsAfterProceed();
		this.bEnableNestedDataLightMode = actionSessionBackup.isEnableNestedDataLightMode();
		this.strSessionId = actionSessionBackup.getSessionId();
	}

	public Object execute(IAction iAction, Object[] args, int propagation) throws Throwable{
		return this.execute(null, iAction, args, propagation);
	}
	
	public Object execute(IAction iAction, Object[] args, int propagation, int isolation) throws Throwable{
		return this.execute(null, iAction, args, propagation, isolation);
	}
	
	public Object execute(IDataEntityRuntime iDataEntityRuntime, IAction iAction, Object[] args, int nPropagation) throws Throwable{
		return this.execute(iDataEntityRuntime, iAction, args, nPropagation, ITransactionalUtil.ISOLATION_DEFAULT);
	}
	/**
	 * 执行行为
	 * 
	 *  REQUIRED 支持当前已经存在的事务，如果还没有事务，就创建一个新事务。
	　　MANDATORY 支持当前已经存在的事务，如果还没有事务，就抛出一个异常。
	　　NESTED 在当前事务中创建一个嵌套事务，如果还没有事务，那么就简单地创建一个新事务。
	　　REQUIRES_NEW 挂起当前事务，创建一个新事务，如果还没有事务，就简单地创建一个新事务。
	　　NEVER 强制要求不在事务中运行，如果当前存在一个事务，则抛出异常。
	　　NOT_SUPPORTED 强制不在事务中运行，如果当前存在一个事务，则挂起该事务。
	　　SUPPORTS 支持当前事务，如果没有事务那么就不在事务中运行。
	
	 * @param iAction
	 * @param args
	 * @param nPropagation
	 * @return
	 * @throws Throwable
	 */
	public Object execute(IDataEntityRuntime iDataEntityRuntime, IAction iAction, Object[] args, int nPropagation, int isolation) throws Throwable{
		ITransactionalUtil iTransactionalUtil = ActionSessionManager.getTransactionalUtil();
		if(nPropagation == ITransactionalUtil.PROPAGATION_UNKNOWN || iTransactionalUtil == null) {
			return iAction.execute(args);
		}
		else {
			if(iDataEntityRuntime!=null) {
				String strDataSourceTag = iDataEntityRuntime.getDataSourceTag();
				if(!StringUtils.hasLength(strDataSourceTag)
						|| strDataSourceTag.indexOf(IDataEntityRuntime.DATASOURCETAGPREFIX_DB)!=0) {
					return iAction.execute(args);
				}
			}
			
			boolean bLastTran = this.isInTransaction();
			IDataEntityRuntime lastDataEntityRuntime = this.getTransactionDataEntityRuntime();
			if(iDataEntityRuntime == null ) {
				iDataEntityRuntime = lastDataEntityRuntime;
			}
			
			//当前不判断两个数据源是否一致，通过报错让用户解决多源的事务问题
			
			try {
				switch(nPropagation) {
				case ITransactionalUtil.PROPAGATION_NESTED:
					this.setInTransaction(true);
					this.setTransactionDataEntityRuntime(iDataEntityRuntime);
					return iTransactionalUtil.nested(iAction, args, isolation);
				case ITransactionalUtil.PROPAGATION_MANDATORY:
					this.setInTransaction(true);
					this.setTransactionDataEntityRuntime(iDataEntityRuntime);
					return iTransactionalUtil.mandatory(iAction, args, isolation);
				case ITransactionalUtil.PROPAGATION_NEVER:
					return iTransactionalUtil.never(iAction, args);
				case ITransactionalUtil.PROPAGATION_NOT_SUPPORTED:
					return iTransactionalUtil.not_supported(iAction, args, isolation);
				case ITransactionalUtil.PROPAGATION_REQUIRED:
					if(bLastTran) {
						return iAction.execute(args);
					}
					else {
						this.setInTransaction(true);
						this.setTransactionDataEntityRuntime(iDataEntityRuntime);
						return iTransactionalUtil.required(iAction, args, isolation);
					}
				case ITransactionalUtil.PROPAGATION_REQUIRES_NEW:
					
					java.util.List<IASFutureAction> lastASFutureActionList = this.asFutureActionList;
					this.asFutureActionList = null;
					this.setInTransaction(true);
					this.setTransactionDataEntityRuntime(iDataEntityRuntime);
					try {
						Object objRet = iTransactionalUtil.required_new(iAction, args, isolation);
						this.executeFutureActions(true);
						this.asFutureActionList = lastASFutureActionList;
						return objRet;
					}
					catch(Throwable ex) {
						this.executeFutureActions(false);
						this.asFutureActionList = lastASFutureActionList;
						throw ex;
					}
					
				case ITransactionalUtil.PROPAGATION_SUPPORTS:
					//return iTransactionalUtil.supports(iAction, args);
					return iAction.execute(args);
				default:
					throw new RuntimeException(String.format("无法识别的事务模式[%1$s]", nPropagation));
				}
			}
			catch(Throwable ex) {
				//嵌套事务如果新开，后续要考虑是否向父传递异常（自己异常）
				throw ex;
			}
			finally {
				this.setInTransaction(bLastTran);
				this.setTransactionDataEntityRuntime(lastDataEntityRuntime);
			}
		}
	}
	
	
}
