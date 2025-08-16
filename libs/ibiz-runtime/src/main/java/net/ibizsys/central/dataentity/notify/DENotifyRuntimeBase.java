package net.ibizsys.central.dataentity.notify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.central.dataentity.util.IDENotifySettingUtilRuntime;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DENotifyTargetType;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.notify.IPSDENotifyTarget;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.msg.ISysMsgTargetRuntime;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class DENotifyRuntimeBase extends net.ibizsys.runtime.dataentity.notify.DENotifyRuntime implements IDENotifyRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DENotifyRuntimeBase.class);
	
	public static final int[] MSGTYPES = new int[] {MsgTypes.DD, MsgTypes.EMAIL, MsgTypes.IM, MsgTypes.INTERNAL, MsgTypes.MSN, MsgTypes.SMS,
			MsgTypes.USER,MsgTypes.USER2,MsgTypes.WX,MsgTypes.WXWORK};
	
	
	private String strDENotifyTag = null;
	
	@Override
	protected void onInit() throws Exception {
		this.strDENotifyTag = PSModelUtils.calcFullUniqueTag2(this.getPSDENotify());
		super.onInit();
	}
	
	/**
	 * 获取实体通知标记
	 * @return
	 */
	protected String getDENotifyTag() {
		return this.strDENotifyTag;
	}
	
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return (IDynaInstDataEntityRuntime)super.getDynaInstDataEntityRuntime();
	}
	
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	
	
	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return (IDynaInstRuntime)super.getDynaInstRuntime();
	}
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}
	
	/**
	 * 是否克隆传入参数 
	 * @return
	 */
	protected  boolean isCloneParam() {
		return true;
	}
	
	
	@Override
	public void send(IEntityBase iEntityBase) {
		if(iEntityBase instanceof IEntity) {
			this.send((IEntity)iEntityBase, null);
			return;
		}
		super.send(iEntityBase);
	}

	@Override
	public void send(IEntity iEntity, Map<String, Object> params){
		try {
			IEntity lastEntity = null;
			if(params != null) {
				Object last = params.get(ISysMsgTemplRuntime.TEMPLPARAM_LAST);
				if(last instanceof IEntity) {
					lastEntity = (IEntity)last;
				}
			}
			if(this.isCloneParam()) {
				if(iEntity instanceof IEntityDTO) {
					IEntityDTO originEntityDTO = (IEntityDTO)iEntity;
					IEntityDTO cloneEntityDTO = this.getDataEntityRuntime().createEntity();
					originEntityDTO.copyTo(cloneEntityDTO, originEntityDTO.getDEMethodDTORuntime()!=null);
					iEntity = cloneEntityDTO;
				}
				else {
					IEntityDTO cloneEntityDTO = this.getDataEntityRuntime().createEntity();
					iEntity.copyTo(cloneEntityDTO);
					iEntity = cloneEntityDTO;
				}
				
				if(lastEntity != null) {
					if(lastEntity instanceof IEntityDTO) {
						IEntityDTO originEntityDTO = (IEntityDTO)lastEntity;
						IEntityDTO cloneEntityDTO = this.getDataEntityRuntime().createEntity();
						originEntityDTO.copyTo(cloneEntityDTO, originEntityDTO.getDEMethodDTORuntime()!=null);
						lastEntity = cloneEntityDTO;
					}
					else {
						IEntityDTO cloneEntityDTO = this.getDataEntityRuntime().createEntity();
						lastEntity.copyTo(cloneEntityDTO);
						lastEntity = cloneEntityDTO;
					}
					params.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, lastEntity);
				}
				
			}
			this.getDataEntityRuntime().fillEntityCodeListTexts(iEntity, this.getCodeItemTextSuffix());
			if(lastEntity != null) {
				this.getDataEntityRuntime().fillEntityCodeListTexts(lastEntity, this.getCodeItemTextSuffix());
			}
			this.onSend(iEntity, params);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("发送通知发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	
	protected void onSend(IEntity iEntity, Map<String, Object> params) throws Throwable {
		MsgSendQueue[] msgSendQueues = this.getMsgSendQueues(iEntity, params);
		if(msgSendQueues == null || msgSendQueues.length == 0) {
			return;
		}
		
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if(actionSession == null) {
			this.getSysMsgQueueRuntime().send(msgSendQueues);
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
					getSysMsgQueueRuntime().send(msgSendQueues);
				}
			}, true);
		}
		
		return;
	}
	
	
	protected MsgSendQueue[] getMsgSendQueues(IEntity iEntity, Map<String, Object> params) throws Throwable{
		// 判断消息类型
		int nMsgType = this.getPSDENotify().getMsgType();
		if (nMsgType == 0) {
			log.warn(String.format("实体[%1$s]通知[%2$s]没有指定消息类型，忽略建立通知消息", this.getDataEntityRuntime().getId(), this.getName()));
			return null;
		}

		Map<String,String> targetMap = new HashMap<String,String>();
		if(getDETargets()!=null) {
			for(java.util.Map.Entry<IPSDEField, IPSDEField> entry: getDETargets().entrySet()) {
				String strTargetId = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(iEntity, entry.getKey()), null);
				if(!StringUtils.hasLength(strTargetId)) {
					continue;
				}
				String strTargetType = null;
				if(entry.getValue() != null) {
					strTargetType  = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(iEntity, entry.getValue()), null);
				}
				
				targetMap.put(strTargetId, strTargetType);
			}
		}
		
		if(this.getSysMsgTargetRuntimes() != null) {
			for(ISysMsgTargetRuntime iSysMsgTargetRuntime : this.getSysMsgTargetRuntimes() ) {
				Map<String,String> result = iSysMsgTargetRuntime.get(iEntity);
				if(result != null) {
					targetMap.putAll(result);
				}
			}
		}
		
		//计算自定义目标用户
		for(IPSDENotifyTarget iPSDENotifyTarget : getPSDENotifyTargets()) {
			Map<String,String> result = this.getTarget(iPSDENotifyTarget, iEntity, params);
			if(result != null) {
				targetMap.putAll(result);
			}
		}
		
		if(targetMap.size() == 0) {
			log.warn(String.format("实体[%1$s]通知[%2$s]没有任何通知目标，忽略建立通知消息", this.getDataEntityRuntime().getId(), this.getName()));
			return null;
		}
		
		MsgSendQueue msgSendQueue = fillMsgSendQueue(null, iEntity, params);
		
		IDENotifySettingUtilRuntime iDENotifySettingUtilRuntime = this.getDataEntityRuntime().isEnableNotifySetting()?
				this.getDataEntityRuntime().getDENotifySettingUtilRuntime():null;
		if(iDENotifySettingUtilRuntime == null) {
			ArrayNode array = JsonUtils.createArrayNode();
			for(java.util.Map.Entry<String,String> entry: targetMap.entrySet()) {
				array.add(entry.getKey());
			}
			
			msgSendQueue.setDstUsers(array.toString());
			
			return new MsgSendQueue[] { msgSendQueue};
		}
		else {
			List<MsgSendQueue> list = new ArrayList<MsgSendQueue>();
			Map<String, Integer> settings = iDENotifySettingUtilRuntime.getSettings(iEntity, this.getDENotifyTag(), nMsgType, targetMap.keySet());
			for(int nType : MSGTYPES) {
				if((nMsgType & nType) == 0) {
					continue;
				}
				
				ArrayNode array = JsonUtils.createArrayNode();
				for(java.util.Map.Entry<String, Integer> entry : settings.entrySet()) {
					if(entry.getValue() == null || ((entry.getValue() & nType) == nType)) {
						array.add(entry.getKey());
					}
				}
				
				if(array.size() == 0) {
					continue;
				}
				
				MsgSendQueue msgSendQueue2 = new MsgSendQueue();
				msgSendQueue.copyTo(msgSendQueue2);
				msgSendQueue2.setMsgType(nType);
				msgSendQueue2.setDstUsers(array.toString());
				list.add(msgSendQueue2);
			}
			
			if(list.size() == 0) {
				return null;
			}
			return list.toArray(new MsgSendQueue[list.size()]);
		}
	}
	
	protected MsgSendQueue fillMsgSendQueue(MsgSendQueue msgSendQueue, IEntity iEntity, Map<String, Object> params) throws Throwable{
		if(msgSendQueue == null) {
			msgSendQueue = new MsgSendQueue();
		}
	
		int nMsgType = this.getPSDENotify().getMsgType();
		
		IEntityBase data = iEntity;
//		String strTemplEngine = getSysMsgTemplRuntime().getPSSysMsgTempl().getTemplEngine();
//		if(!StringUtils.hasLength(strTemplEngine)
//				|| strTemplEngine.equalsIgnoreCase(MsgTemplEngine.FREEMARKER.value)) {
//			data = this.getDataEntityRuntime().createScriptEntity(iEntity);
//			if(params != null) {
//				Object last = params.get(ISysMsgTemplRuntime.TEMPLPARAM_LAST);
//				if(last instanceof IEntity) {
//					last = this.getDataEntityRuntime().createScriptEntity((IEntity)last);
//					params.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, last);
//				}
//			}
//		}
		
		data = this.getDataEntityRuntime().createScriptEntity(iEntity);
		if(params != null) {
			Object last = params.get(ISysMsgTemplRuntime.TEMPLPARAM_LAST);
			if(last instanceof IEntity) {
				last = this.getDataEntityRuntime().createScriptEntity((IEntity)last);
				params.put(ISysMsgTemplRuntime.TEMPLPARAM_LAST, last);
			}
		}
		
		
		ISysMsgTemplRuntime iSysMsgTemplRuntime = null;
		if(this.getSysMsgTemplRuntime() instanceof ISysMsgTemplRuntime) {
			iSysMsgTemplRuntime = (ISysMsgTemplRuntime)this.getSysMsgTemplRuntime();
		}
		
		msgSendQueue.setMsgType(nMsgType);
		msgSendQueue.setTemplateId(getSysMsgTemplRuntime().getPSSysMsgTempl().getCodeName());
		
		// 填充标题
		if(iSysMsgTemplRuntime != null) {
			msgSendQueue.setSubject(iSysMsgTemplRuntime.getSubject(data, params));
			msgSendQueue.setUrl(iSysMsgTemplRuntime.getUrl(data, params));
			msgSendQueue.setMobileUrl(iSysMsgTemplRuntime.getMobileUrl(data, params));
		}
		else {
			msgSendQueue.setSubject(getSysMsgTemplRuntime().getSubject(data));
			msgSendQueue.setUrl(getSysMsgTemplRuntime().getUrl(data));
			msgSendQueue.setMobileUrl(getSysMsgTemplRuntime().getMobileUrl(data));
		}
		

		// 邮件及内部消息
		if ((nMsgType & (MsgTypes.INTERNAL | MsgTypes.EMAIL)) != 0) {
			msgSendQueue.setContentType(getSysMsgTemplRuntime().getContentType());
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setContent(iSysMsgTemplRuntime.getContent(data, params));
			}
			else {
				msgSendQueue.setContent(getSysMsgTemplRuntime().getContent(data));
			}
		}

		// 短消息
		if ((nMsgType & (MsgTypes.SMS)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setSMSContent(iSysMsgTemplRuntime.getSMSContent(data, params));
			}
			else {
				msgSendQueue.setSMSContent(getSysMsgTemplRuntime().getSMSContent(data));
			}
		}

		// 即时通讯
		if ((nMsgType & (MsgTypes.MSN | MsgTypes.IM)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setIMContent(iSysMsgTemplRuntime.getIMContent(data, params));
			}
			else {
				msgSendQueue.setIMContent(getSysMsgTemplRuntime().getIMContent(data));
			}
			
		}

		// 微信
		if ((nMsgType & (MsgTypes.WX)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setWXContent(iSysMsgTemplRuntime.getWXContent(data, params));
			}
			else {
				msgSendQueue.setWXContent(getSysMsgTemplRuntime().getWXContent(data));
			}
		}

		// 钉钉
		if ((nMsgType & (MsgTypes.DD)) != 0) {
			if(iSysMsgTemplRuntime != null) {
				msgSendQueue.setDDContent(iSysMsgTemplRuntime.getDDContent(data, params));
			}
			else {
				msgSendQueue.setDDContent(getSysMsgTemplRuntime().getDDContent(data));
			}
		}
		
		
		return msgSendQueue;
	}
	
	
	protected Map<String,String> getTarget(IPSDENotifyTarget iPSDENotifyTarget, IEntity iEntity, Map<String, Object> params) throws Throwable{
		
		if(DENotifyTargetType.EVENTDATAFIELD.value.equals(iPSDENotifyTarget.getTargetType())) {
			String strData = iPSDENotifyTarget.getData();
			if(!StringUtils.hasLength(strData)) {
				throw new Exception(String.format("未指定事件数据对象属性"));
			}
			if(params != null ) {
				Map<String, String> targetMap = new LinkedHashMap<String, String>();
				Object eventData = params.get(NOTIFY_PARAM_EVENTDATA);
				if(eventData instanceof IEntity) {
					String[] fields = strData.replace(";",",").split("[,]");
					IEntity eventEntity = (IEntity)eventData;
					for(String field : fields) {
						String strRealFieldName = PSModelUtils.getSimpleId(field);
						Object objUserId = eventEntity.get(strRealFieldName);
						if(objUserId == null) {
							continue;
						}
						
						targetMap.put(objUserId.toString(), "");
					}
				}
				return targetMap;
			}
			
			return null;
		}
		
		if(DENotifyTargetType.DSTUSER.value.equals(iPSDENotifyTarget.getTargetType())) {
			String strData = iPSDENotifyTarget.getData();
			if(!StringUtils.hasLength(strData)) {
				throw new Exception(String.format("未指定目标用户"));
			}
			
			List list = JsonUtils.asList(strData);
			if(!ObjectUtils.isEmpty(list)) {
				Map<String, String> targetMap = new LinkedHashMap<String, String>();
				
				for(Object item : list) {
					Object objUserId = null;
					if(item instanceof Map) {
						objUserId = ((Map)item).get("id");
					}
					else {
						objUserId = DataTypeUtils.asSimple(item);
					}
					
					if(objUserId == null) {
						continue;
					}
					
					targetMap.put(objUserId.toString(), "");
				}
				
				return targetMap;
			}
			
			return null;
			
		}
		
		
		return super.getTarget(iPSDENotifyTarget, iEntity);
		
	}
}
