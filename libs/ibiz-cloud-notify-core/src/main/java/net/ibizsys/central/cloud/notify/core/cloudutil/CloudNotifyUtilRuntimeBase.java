package net.ibizsys.central.cloud.notify.core.cloudutil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.Todo;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;
import net.ibizsys.central.cloud.notify.core.addin.DefaultMsgSender;
import net.ibizsys.central.cloud.notify.core.addin.ICloudNotifyUtilRTAddin;
import net.ibizsys.central.cloud.notify.core.addin.IInternalMsgSender;
import net.ibizsys.central.cloud.notify.core.addin.IMsgSender;
import net.ibizsys.central.cloud.notify.core.addin.InternalMsgSender;
import net.ibizsys.central.cloud.notify.core.addin.MailMsgSenderProxy;
import net.ibizsys.central.cloud.notify.core.addin.OpenMsgSenderProxy;
import net.ibizsys.central.cloud.notify.core.addin.SMSMsgSenderProxy;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class CloudNotifyUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudNotifyUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudNotifyUtilRuntimeBase.class);
	private static Map<Integer, String> MsgTypeMap = new HashMap<Integer, String>();
	static {
		MsgTypeMap.put(MsgTypes.INTERNAL, "INTERNAL");
		MsgTypeMap.put(MsgTypes.EMAIL, "EMAIL");
		MsgTypeMap.put(MsgTypes.SMS, "SMS");
		MsgTypeMap.put(MsgTypes.WX | MsgTypes.DD | MsgTypes.WXWORK, "OPEN");
//		MsgTypeMap.put(MsgTypes.DD, "DD");
//		MsgTypeMap.put(MsgTypes.WXWORK, "WXWORK");
		MsgTypeMap.put(MsgTypes.USER, "USER");
		MsgTypeMap.put(MsgTypes.USER2, "USER2");
		
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:INTERNAL", InternalMsgSender.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:SMS-PROXY", SMSMsgSenderProxy.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:OPEN-PROXY", OpenMsgSenderProxy.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:EMAIL-PROXY", MailMsgSenderProxy.class.getCanonicalName());
		
		
		//放入空实现
//		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:EMAIL", DefaultMsgSender.class.getCanonicalName());
//		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:WX", DefaultMsgSender.class.getCanonicalName());
//		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:DD", DefaultMsgSender.class.getCanonicalName());
//		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:WXWORK", DefaultMsgSender.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:USER", DefaultMsgSender.class.getCanonicalName());
		RuntimeObjectFactory.getInstance().registerObjectIf(ICloudNotifyUtilRTAddin.class, "MSGSENDER:USER2", DefaultMsgSender.class.getCanonicalName());
		
	}
	
	
	
	private int nNotifyTimeRangeFrom = 60000 * 30;
	private int nNotifyTimeRangeTo = 60000 * 2;
	
	private String strCloudNotifyUtilRuntimeUniqueTag = null;
	
	
	private Map<String, IMsgSender> msgSenderMap = null;
	
	@Override
	protected ICloudNotifyUtilRuntimeContext createModelRuntimeContext() {
		return new CloudNotifyUtilRuntimeContextBase<ICloudNotifyUtilRuntime, ICloudUtilRuntimeContext>(super.createModelRuntimeContext()) {
			@Override
			public Employee getEmployee(String strUserId) {
				return getSelf().getEmployee(strUserId);
			}

			@Override
			public DCSystem getDCSystem(String strDCSystemId) {
				return getSelf().getDCSystem(strDCSystemId);
			}
			
			@Override
			public OpenUser getOpenUser(String strOpenType, String strUserId) {
				return getSelf().getOpenUser(strOpenType, strUserId);
			}



			@Override
			public OpenAccess getOpenAccess(String strOpenAccessId, boolean bTryMode) {
				return getSelf().getOpenAccess(strOpenAccessId, bTryMode);
			}



			@Override
			public MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId) {
				return getSelf().getMsgTemplate(strOpenAccessId, strTemplateType, strTemplateId);
			}
		};
	}
	
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	@Override
	protected boolean isPrepareSysCloudClientUtilRuntime() {
		return true;
	}
	

	
	@Override
	protected void onInstall() throws Exception {
	
		this.prepareAddinRepo(this.getModelRuntimeContext(), ICloudNotifyUtilRTAddin.class, null);
		
		super.onInstall();
		
		this.strCloudNotifyUtilRuntimeUniqueTag = KeyValueUtils.genUniqueId(ICloudNotifyUtilRuntime.class.getCanonicalName(), ICloudUtilRuntime.CLOUDSERVICE_NOTIFY);
		this.msgSenderMap = this.getAddins(IMsgSender.class, ADDIN_MSGSENDER_PREFIX);
		
		//获取系统的功能选举对象
		if(this.getSysUniStateUtilRuntime(true) == null) {
			this.prepareSysUniStateUtilRuntime(true);
			if(this.getSysUniStateUtilRuntime(true) == null) {
				this.getSystemRuntime().log(LogLevels.WARN, CloudNotifyUtilRuntimeBase.class.getName(), String.format("系统未配置统一状态组件，多节点运行会出现重复调度问题"), null);
			}
		}
		
		//启动通知
		runNotifyTimer(true);
	}
	
	private CloudNotifyUtilRuntimeBase getSelf() {
		return this;
	}
	
	
	
	@Override
	protected ICloudNotifyUtilRuntimeContext getModelRuntimeContext() {
		return (ICloudNotifyUtilRuntimeContext)super.getModelRuntimeContext();
	}
	
	
	
	protected int getNotifyTimeRangeFrom() {
		return this.nNotifyTimeRangeFrom;
	}
	
	protected int getNotifyTimeRangeTo() {
		return this.nNotifyTimeRangeTo;
	}
	
	
	protected void runNotifyTimer() {
		runNotifyTimer(false);
	}

	protected void runNotifyTimer(boolean bTimerOnly) {
		if(!bTimerOnly) {
			try {
				onNotifyTimer();
			} catch (Throwable ex) {
				log.error(String.format("云体系通知组件[%1$s]通知定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
				getSystemRuntime().log(LogLevels.ERROR, "云体系通知组件", String.format("云体系通知组件[%1$s]通知定时器处理发生异常，%2$s", getName(), ex.getMessage()), ex);
			}
		}
		
		
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				runNotifyTimer();
			}
		}, System.currentTimeMillis() + 20000, "NotifyTimer_" + this.getId());
	}

	protected void onNotifyTimer() throws Throwable{
	}
	
	
	
	@Override
	public void createTodos(Todo[] todos) {
		this.executeAction("建立待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCreateTodos(todos);
				return null;
			}
		}, null);
	}
	
	protected void onCreateTodos(Todo[] todos) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Todo markReadTodo(String strTodoId) {
		return this.executeAction("标注已读待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkReadTodo(strTodoId);
			}
		}, null, Todo.class);
	}

	protected Todo onMarkReadTodo(String strTodoId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public Todo markReadTodo(String strTaskType, String strTaskId) {
		return this.executeAction("标注已读待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkReadTodo(strTaskType, strTaskId);
			}
		}, null, Todo.class);
	}
	
	protected Todo onMarkReadTodo(String strTaskType, String strTaskId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public Todo completeTodo(String strTaskType, String strTaskId) {
		return this.executeAction("完成待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCompleteTodo(strTaskType, strTaskId);
			}
		}, null, Todo.class);
	}
	
	protected Todo onCompleteTodo(String strTaskType, String strTaskId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public Todo cancelTodo(String strTaskType, String strTaskId) {
		return this.executeAction("取消待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCancelTodo(strTaskType, strTaskId);
			}
		}, null, Todo.class);
	}

	protected Todo onCancelTodo(String strTaskType, String strTaskId) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public Todo delegateTodo(String strTaskType, String strTaskId, String strTargetUserId) {
		return this.executeAction("委派待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onDelegateTodo(strTaskType, strTaskId, strTargetUserId);
			}
		}, null, Todo.class);
	}
	
	protected Todo onDelegateTodo(String strTaskType, String strTaskId, String strTargetUserId) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public Todo resolveTodo(String strTaskType, String strTaskId) {
		return this.executeAction("解决待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onResolveTodo(strTaskType, strTaskId);
			}
		}, null, Todo.class);
	}
	
	protected Todo onResolveTodo(String strTaskType, String strTaskId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public Todo reassignTodo(String strTaskType, String strTaskId, String strTargetUserId) {
		return this.executeAction("指派待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onReassignTodo(strTaskType, strTaskId, strTargetUserId);
			}
		}, null, Todo.class);
	}
	
	protected Todo onReassignTodo(String strTaskType, String strTaskId, String strTargetUserId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public Page<Todo> fetchTodos(String strTaskType, Map<String, Object> conds) {
		return this.executeAction("查询待办", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchTodos(strTaskType, conds);
			}
		}, null, TodoPageType);
	}
	
	protected Page<Todo> onFetchTodos(String strTaskType, Map<String, Object> conds) throws Throwable{
		throw new Exception("没有实现");
	}
	
	@Override
	public void createCarbonCopies(CarbonCopy[] todos) {
		this.executeAction("建立抄送", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onCreateCarbonCopies(todos);
				return null;
			}
		}, null);
	}

	protected void onCreateCarbonCopies(CarbonCopy[] todos) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	@Override
	public CarbonCopy markReadCarbonCopy(String strCarbonCopyId) {
		return this.executeAction("标记已读抄送", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkReadCarbonCopy(strCarbonCopyId);
			}
		}, null, CarbonCopy.class);
	}
	
	protected CarbonCopy onMarkReadCarbonCopy(String strCarbonCopyId) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public CarbonCopy markReadCarbonCopy(String strTaskType, String strTaskId) {
		return this.executeAction("标记已读抄送", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkReadCarbonCopy(strTaskType, strTaskId);
			}
		}, null, CarbonCopy.class);
	}
	
	protected CarbonCopy onMarkReadCarbonCopy(String strTaskType, String strTaskId) throws Throwable{
		throw new Exception("没有实现");
	}

	@Override
	public void sendMessages(MsgSendQueue[] msgSendQueues) {
		this.executeAction("发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onSendMessages(msgSendQueues);
				return null;
			}
		}, null);
	}
	
	protected void onSendMessages(MsgSendQueue[] msgSendQueues) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public MsgSendQueue sendMessage(String strMsgId) {
		return this.executeAction("发送指定消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSendMessage(strMsgId);
			}
		}, null, MsgSendQueue.class);
	}
	
	protected MsgSendQueue onSendMessage(String strMsgId) throws Throwable{
		throw new Exception("没有实现");
	}
	

	@Override
	public Collection<MsgSendQueue> getMessages(String[] ids) {
		return this.executeAction("获取发送消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetMessages(ids);
			}
		}, null, MsgSendQueueListType);
	}

	protected Collection<MsgSendQueue> onGetMessages(String[] ids) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	protected boolean hasDCSendMsgLeadership(String strDCId, String strMsgSendQueueId) {
		ISysUniStateUtilRuntime iSysUniStateUtilRuntime = this.getSysUniStateUtilRuntime(true);
		if(iSysUniStateUtilRuntime != null) {
			
			String strTag = KeyValueUtils.genUniqueId(getCloudNotifyUtilRuntimeUniqueTag(), strDCId);
			
			iSysUniStateUtilRuntime.addLeaderLatchIf(strTag);
			
			if(!iSysUniStateUtilRuntime.hasLeadership(strTag)) {
				return false;
			}
		}
		return true;
	}
	
	
	protected void doSendMsg(MsgSendQueue msgSendQueue, boolean bTimer) {
		
		String strDCId = (String)msgSendQueue.get("srfdcid");
		//判断是否拥有目标
		if(bTimer) {
			if(!hasDCSendMsgLeadership(strDCId, msgSendQueue.getMsgSendQueueId())) {
				log.debug(String.format("未获取发送消息执行权[%1$s][%2$s]，忽略发送", msgSendQueue.getMsgSendQueueId(), strDCId));
				return;
			}
		}
		
		//判断是马上发送或定时发送
		long nCurTime = System.currentTimeMillis();
		if(msgSendQueue.getPlanSendTime() == null || msgSendQueue.getPlanSendTime().getTime() <= nCurTime) {
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					doSendMsgReal(msgSendQueue);
				}
			});
		}
		else {
			//定时发送，计算偏移时间
			long nInterval = msgSendQueue.getPlanSendTime().getTime() - nCurTime;
			if(nInterval > this.getNotifyTimeRangeTo()) {
				log.debug(String.format("提前发送消息[%1$s][%2$s]，忽略发送", msgSendQueue.getMsgSendQueueId(), strDCId));
				return;
			}
			
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					doSendMsgReal(msgSendQueue);
				}
			}, System.currentTimeMillis() +  nInterval);
		}
	}
	
	/**
	 * //执行实际消息发送
	 * @param msgSendQueue
	 */
	protected void doSendMsgReal(MsgSendQueue msgSendQueue) {  
		
	
		StringBuilder sb = new StringBuilder();
		boolean bError = false;
		
		int nMsgType = 0;
		try {
			nMsgType = DataTypeUtils.getIntegerValue(msgSendQueue.getMsgType(), 0);
		} catch (Exception ex) {
			sb.append(String.format("获取消息类型[%1$s]发生异常，%2$s", msgSendQueue.getMsgType(), ex.getMessage()));
		}
		if(nMsgType != 0) {
			
			for(java.util.Map.Entry<Integer, String> entry : MsgTypeMap.entrySet()) {
				if((nMsgType & entry.getKey()) == 0) {
					continue;
				}
				IMsgSender iMsgSender = this.msgSenderMap.get(String.format("%1$s-PROXY", entry.getValue()));
				if(iMsgSender == null) {
					iMsgSender = this.msgSenderMap.get(entry.getValue());
				}
				if(iMsgSender == null) {
					bError = true;
					if(sb.length()>0) {
						sb.append("\r\n");
					}
					sb.append(String.format("[失败]%1$s：无法获取发送对象", entry.getValue()));
					continue;
				}
				
				boolean bSendOk = true;
				for(int i = 0;i<getRetryCount();i++) {
					
					try {
						String strMessage = iMsgSender.send(msgSendQueue);
						if(StringUtils.hasLength(strMessage)) {
							if(sb.length()>0) {
								sb.append("\r\n");
							}
							sb.append(String.format("[成功]%1$s：%2$s", entry.getValue(), strMessage));
						}
						bSendOk = true;
						break;
					}
					catch (Throwable ex) {
						log.error(String.format("[%1$s]发送消息发生异常，%2$s", iMsgSender.getName(), ex.getMessage()), ex);
						this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("[%1$s]发送消息发生异常，%2$s", iMsgSender.getName(), ex.getMessage()), null);
						bSendOk = false;
						if(sb.length()>0) {
							sb.append("\r\n");
						}
						sb.append(String.format("[失败]%1$s：%2$s", entry.getValue(), ex.getMessage()));
						continue;
					}
				}
				if(!bSendOk) {
					bError = true;
				}
			}
		}
		
		msgSendQueue.setIsSend(bError?0:1);
		msgSendQueue.setIsError(bError?1:0);
		msgSendQueue.setProcessTime(new java.sql.Timestamp(System.currentTimeMillis()));
		msgSendQueue.setErrorInfo(sb.toString());
		log.debug(String.format("发送消息[%1$s][%2$s][%3$s]", msgSendQueue.getMsgSendQueueId(), msgSendQueue.getIsError(), msgSendQueue.getErrorInfo()));
	}
	
	
	
	@Override
	public V2InternalMessage sendInternal(V2InternalMessage v2InternalMessage) {
		return this.executeAction("发送内部消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSendInternal(v2InternalMessage);
			}
		}, null, V2InternalMessage.class);
	}

	protected V2InternalMessage onSendInternal(V2InternalMessage v2InternalMessage)  throws Throwable{
		IMsgSender iMsgSender = this.msgSenderMap.get("INTERNAL");
		if(iMsgSender instanceof IInternalMsgSender) {
			return ((IInternalMsgSender)iMsgSender).send(v2InternalMessage);
		}
		throw new Exception("未提供内部消息发送代理");
	}

	@Override
	public V2InternalMessage markReadInternal(String strInternalMessageId, Map<String, Object> params) {
		return this.executeAction("标注已读内部消息", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onMarkReadInternal(strInternalMessageId, params);
			}
		}, null, V2InternalMessage.class);
	}

	protected V2InternalMessage onMarkReadInternal(String strInternalMessageId, Map<String, Object> params)  throws Throwable{
		IMsgSender iMsgSender = this.msgSenderMap.get("INTERNAL");
		if(iMsgSender instanceof IInternalMsgSender) {
			return ((IInternalMsgSender)iMsgSender).markRead(strInternalMessageId, params);
		}
		throw new Exception("未提供内部消息发送代理");
	}
	
	/**
	 * 获取尝试发送的次数
	 * @return
	 */
	protected int getRetryCount() {
		return 3;
	}
	
	
	protected Employee getEmployee(String strUserId) {
		return this.getCloudSaaSUtilRuntime().getEmployee(strUserId);
	}
	
	
	protected DCSystem getDCSystem(String strDCSystemId) {
		return this.getCloudSaaSUtilRuntime().getDCSystem(strDCSystemId);
	}
	
	/**
	 * 获取传入机构用户的第三方用户信息
	 * @param strOpenType
	 * @param strUserId
	 * @return
	 */
	protected OpenUser getOpenUser(String strOpenType, String strUserId) {
		return this.getCloudSaaSUtilRuntime().getOpenUser(strOpenType, strUserId);
	}
	
	
	protected MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId) {
		return this.getCloudSaaSUtilRuntime().getMsgTemplate(strOpenAccessId, strTemplateType, strTemplateId);
	}
	
	protected OpenAccess getOpenAccess(String strOpenAccessId, boolean bTryMode) {
		return this.getCloudSaaSUtilRuntime().getOpenAccess(strOpenAccessId, bTryMode);
	}
	
	
	protected String getCloudNotifyUtilRuntimeUniqueTag() {
		return this.strCloudNotifyUtilRuntimeUniqueTag; 
	}
	
}
