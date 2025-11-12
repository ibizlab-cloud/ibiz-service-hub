package net.ibizsys.central.dataentity.wf;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.msg.ISysMsgQueueRuntime;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 默认实体方法DTO运行时对象实现
 *
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class DEWFRuntime extends DataEntityModelRuntimeBase implements IDEWFRuntime {

	private static final Log log = LogFactory.getLog(DEWFRuntime.class);

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IPSDEWF iPSDEWF = null;
	private ISysMsgQueueRuntime iSysMsgQueueRuntime = null;

	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEWF iPSDEWF) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.setDataEntityRuntimeBase(getDataEntityRuntimeContext().getDataEntityRuntime());
		this.iPSDEWF = iPSDEWF;

		onInit();
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return iDataEntityRuntimeContext;
	}

	@Override
	public IPSDEWF getPSDEWF() {
		return this.iPSDEWF;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEWF();
	}
	
	protected ISysMsgQueueRuntime getSysMsgQueueRuntime(boolean bTryMode) throws Exception {
		if(this.iSysMsgQueueRuntime == null) {
			//从系统中获取运行时默认，后续再增强
			
			this.iSysMsgQueueRuntime = this.getSystemRuntime().getDefaultSysMsgQueueRuntime();
		}
		
		if(this.iSysMsgQueueRuntime != null || bTryMode) {
			return this.iSysMsgQueueRuntime;
		}
		
		throw new Exception("系统消息队列对象无效");
	}

	@Override
	public void init(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFState())) {
			Object lastValue = getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField());
			if (lastValue == null) {
				getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFState()));
			}
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void start(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Object submit(Object arg0, String wfAction, Map<String, Object> params, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void error(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}

		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFErrorState())) {
			this.getDataEntityRuntime().setFieldValue((IEntityDTO) arg0, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFErrorState()));
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void finish(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}

		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFFinishState())) {
			if (ObjectUtils.isEmpty(this.getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField()))) {
				this.getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFFinishState()));
			}
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	public void cancel(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	@Override
	public void update(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void rollback(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {

	}

	@Override
	public void notify(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}

		ISysMsgQueueRuntime iSysMsgQueueRuntime = this.getSysMsgQueueRuntime(true);
		if(iSysMsgQueueRuntime == null) {
			log.warn(String.format("系统消息队列对象无效，忽略通知操作"));
			return;
		}
		
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		String strNotifyUsers = iEntityDTO.getString("notifyusers", null);
		if(!StringUtils.hasLength(strNotifyUsers)) {
			log.warn(String.format("未指定通知用户，忽略通知操作"));
			return;
		}
		
		String strMsgTemplate = iEntityDTO.getString("msgtemplate", null);
		if(!StringUtils.hasLength(strMsgTemplate)) {
			log.warn(String.format("未指定消息模板，忽略通知操作"));
			return;
		}
		
		net.ibizsys.runtime.msg.ISysMsgTemplRuntime iSysMsgTemplRuntime = this.getSystemRuntime().getSysMsgTemplRuntime(strMsgTemplate, true);
		if(iSysMsgTemplRuntime == null) {
			log.warn(String.format("无法获取指定消息模板[%1$s]，忽略通知操作", strMsgTemplate));
			return;
		}
		
		int nMsgType = iEntityDTO.getInteger("msgtype", 0);
		if(nMsgType <= 0) {
			log.warn(String.format("未指定消息类型，忽略通知操作"));
			return;
		}
		
		
		//获取主数据
		IEntityDTO data = this.getDataEntityRuntime().get(this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO));
		this.getDataEntityRuntime().fillEntityCodeListTexts(data, this.getCodeItemTextSuffix());
		
		Map<String, Object> params = new HashMap<String, Object>();
		Map<String,String> targetMap = new LinkedHashMap<String, String>();
		String[] userIds = strNotifyUsers.split("[;]");
		for(String strUserId : userIds) {
			targetMap.put(strUserId, "");
		}
		
		MsgSendQueue[] msgSendQueues = this.getMsgSendQueues(data, nMsgType, targetMap, iSysMsgTemplRuntime, params);
		if(msgSendQueues == null || msgSendQueues.length == 0) {
			log.warn(String.format("未获取消息发送队列数据，忽略通知操作"));
			return;
		}
		
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if(actionSession == null) {
			iSysMsgQueueRuntime.send(msgSendQueues);
		}
		else {
			String strId = JsonUtils.toString(msgSendQueues);
			actionSession.registerFutureAction(new ASFutureActionBase() {
				@Override
				public String getId() {
					return strId;
				}
				
				@Override
				public void commit() {
					iSysMsgQueueRuntime.send(msgSendQueues);
				}
			}, true);
		}
		
		return;
		
	}
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}
	
	protected MsgSendQueue[] getMsgSendQueues(IEntity iEntity, int nMsgType, Map<String,String> targetMap, net.ibizsys.runtime.msg.ISysMsgTemplRuntime originSysMsgTemplRuntime, Map<String, Object> params) throws Throwable{
		
		if(targetMap.size() == 0) {
			log.warn(String.format("实体[%1$s]通知[%2$s]没有任何通知目标，忽略建立通知消息", this.getDataEntityRuntime().getId(), this.getName()));
			return null;
		}
		
		MsgSendQueue msgSendQueue = fillMsgSendQueue(null, iEntity, nMsgType, originSysMsgTemplRuntime, params);
		
		ArrayNode array = JsonUtils.createArrayNode();
		for(java.util.Map.Entry<String,String> entry: targetMap.entrySet()) {
			array.add(entry.getKey());
		}
		
		msgSendQueue.setDstUsers(array.toString());
		
		return new MsgSendQueue[] { msgSendQueue};
	}
	
	protected MsgSendQueue fillMsgSendQueue(MsgSendQueue msgSendQueue, IEntity iEntity, int nMsgType, net.ibizsys.runtime.msg.ISysMsgTemplRuntime originSysMsgTemplRuntime, Map<String, Object> params) throws Throwable{
		if(msgSendQueue == null) {
			msgSendQueue = new MsgSendQueue();
		}
	
		
		IEntityBase data = iEntity;
		
		data = this.getDataEntityRuntime().createScriptEntity(iEntity);
		if(params != null) {
			Object last = params.get(ISysMsgTemplRuntime.TEMPLPARAM_LAST);
			if(last instanceof IEntity) {
				last = this.getDataEntityRuntime().createScriptEntity((IEntity)last);
				params.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, last);
			}
		}
		
		
		ISysMsgTemplRuntime iSysMsgTemplRuntime = null;
		if(originSysMsgTemplRuntime instanceof ISysMsgTemplRuntime) {
			iSysMsgTemplRuntime = (ISysMsgTemplRuntime)originSysMsgTemplRuntime;
		}
		
		msgSendQueue.setMsgType(nMsgType);
		msgSendQueue.setTemplateId(originSysMsgTemplRuntime.getPSSysMsgTempl().getCodeName());
		
		// 填充标题
		if(iSysMsgTemplRuntime != null) {
			msgSendQueue.setSubject(iSysMsgTemplRuntime.getSubject(data, params));
			msgSendQueue.setUrl(iSysMsgTemplRuntime.getUrl(data, params));
			msgSendQueue.setMobileUrl(iSysMsgTemplRuntime.getMobileUrl(data, params));
		}
		else {
			msgSendQueue.setSubject(originSysMsgTemplRuntime.getSubject(data));
			msgSendQueue.setUrl(originSysMsgTemplRuntime.getUrl(data));
			msgSendQueue.setMobileUrl(originSysMsgTemplRuntime.getMobileUrl(data));
		}
		

		// 邮件及内部消息
		if ((nMsgType & (MsgTypes.INTERNAL | MsgTypes.EMAIL)) != 0) {
			msgSendQueue.setContentType(originSysMsgTemplRuntime.getContentType());
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setContent(iSysMsgTemplRuntime.getContent(data, params));
			}
			else {
				msgSendQueue.setContent(originSysMsgTemplRuntime.getContent(data));
			}
		}

		// 短消息
		if ((nMsgType & (MsgTypes.SMS)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setSMSContent(iSysMsgTemplRuntime.getSMSContent(data, params));
			}
			else {
				msgSendQueue.setSMSContent(originSysMsgTemplRuntime.getSMSContent(data));
			}
		}

		// 即时通讯
		if ((nMsgType & (MsgTypes.MSN | MsgTypes.IM)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setIMContent(iSysMsgTemplRuntime.getIMContent(data, params));
			}
			else {
				msgSendQueue.setIMContent(originSysMsgTemplRuntime.getIMContent(data));
			}
			
		}

		// 微信
		if ((nMsgType & (MsgTypes.WX | MsgTypes.WXWORK)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setWXContent(iSysMsgTemplRuntime.getWXContent(data, params));
			}
			else {
				msgSendQueue.setWXContent(originSysMsgTemplRuntime.getWXContent(data));
			}
		}

		// 钉钉
		if ((nMsgType & (MsgTypes.DD)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setDDContent(iSysMsgTemplRuntime.getDDContent(data, params));
			}
			else {
				msgSendQueue.setDDContent(originSysMsgTemplRuntime.getDDContent(data));
			}
		}
		
		
		return msgSendQueue;
	}
	
	@Override
	public void register(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregister(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void fillWFTag(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessMode(Object arg0, Object actionData) throws Throwable {
		return ACCESSMODE_DENY;
	}

}
