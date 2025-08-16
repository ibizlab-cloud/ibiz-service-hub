package net.ibizsys.central.cloud.notify.core.addin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudPortalClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.PortalMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageSubType;
import net.ibizsys.central.cloud.core.util.domain.PortalMessageType;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessageOwnerType;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessageStatus;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 站内消息发送者
 * @author lionlau
 *
 */
public class InternalMsgSender extends MsgSenderBase implements IInternalMsgSender{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(InternalMsgSender.class);
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	private ICloudExtensionClient iCloudExtensionClient = null;
	private ICloudPortalClient iCloudPortalClient = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		if(this.getSysCloudClientUtilRuntime(true) == null) {
			this.prepareSysCloudClientUtilRuntime(false);
		}
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if(this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysCloudClientUtilRuntime(), String.format("[%1$s]未指定系统云体系客户端组件", this.getName()));
	}
	
	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}
	
	protected void prepareSysCloudClientUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, bTryMode));
	}
	
	protected ICloudExtensionClient getCloudExtensionClient() {
		if(this.iCloudExtensionClient == null) {
			this.iCloudExtensionClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_EXTENSION, ICloudExtensionClient.class, true);
		}
		return this.iCloudExtensionClient;
	}
	
	protected ICloudPortalClient getCloudPortalClient() {
		if(this.iCloudPortalClient == null) {
			this.iCloudPortalClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_PORTAL, ICloudPortalClient.class, true);
		}
		return this.iCloudPortalClient;
	}
	
	
	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {
		
		msgSendQueue.setProcessTime(new java.sql.Timestamp(new Date().getTime()));
		
		List<String> dstUserList = new ArrayList<String>();
		String strDstUsers = msgSendQueue.getDstUsers();
		if (ObjectUtils.isEmpty(strDstUsers)) {
			throw new Exception("未指定目标用户");
		}

		if (strDstUsers.indexOf("[") == 0) {
			ArrayNode arrayNode = JsonUtils.toArrayNode(strDstUsers);
			for (int i = 0; i < arrayNode.size(); i++) {
				dstUserList.add(arrayNode.get(i).asText());
			}
		} else {
			String[] userIds = strDstUsers.split("[,]");
			for (String strUserId : userIds) {
				dstUserList.add(strUserId);
			}
		}
		
		for(String strUserId : dstUserList) {
			
			if(true) {
				V2InternalMessage v2InternalMessage = new V2InternalMessage();
				v2InternalMessage.setTitle(msgSendQueue.getSubject());
				v2InternalMessage.setContent(msgSendQueue.getContent());
				v2InternalMessage.setContentType(msgSendQueue.getContentType());
				v2InternalMessage.setSystemTag((String)msgSendQueue.get("dcsystemid"));
			//	v2InternalMessage.setMessageType(msgSendQueue.getContentType());
				v2InternalMessage.setOwnerType(V2InternalMessageOwnerType.PERSONAL.value);
				v2InternalMessage.setOwnerId(strUserId);
				v2InternalMessage.setReceiver(strUserId);
				v2InternalMessage.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
				v2InternalMessage.setStatus(V2InternalMessageStatus.RECEIVED.value);
				v2InternalMessage.setUrl(msgSendQueue.getUrl());
				v2InternalMessage.setMobileUrl(msgSendQueue.getMobileUrl());
				
				
				this.getCloudExtensionClient().createInternalMessage(v2InternalMessage);
				
				try {
					PortalMessage portalMessage = new PortalMessage();
					portalMessage.setType(PortalMessageType.COMMAND.getValue());
					portalMessage.setSubType(PortalMessageSubType.COMMAND_INTERNALMESSAGE.getValue());
					portalMessage.setSubject(v2InternalMessage.getTitle());
					portalMessage.setContent(v2InternalMessage.getContent());
					portalMessage.setUrl(v2InternalMessage.getUrl());
					portalMessage.setMobileUrl(v2InternalMessage.getMobileUrl());
					
					this.getCloudPortalClient().notifyEmployee(v2InternalMessage.getOwnerId(), v2InternalMessage.getSystemTag(), portalMessage);
				}
				catch (Throwable ex) {
					log.error(String.format("发送用户通知消息发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			
		}
		
		return null;
	}


	@Override
	public V2InternalMessage send(V2InternalMessage v2InternalMessage) {
		try {
			return this.onSend(v2InternalMessage);
		} catch (Throwable ex) {
			log.debug(String.format("[%1$s]发送消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new RuntimeException(String.format("[%1$s]发送消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	protected V2InternalMessage onSend(V2InternalMessage v2InternalMessage) throws Throwable{
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		if(!StringUtils.hasLength(v2InternalMessage.getReceiver())) {
			throw new Exception("未指定消息目标");
		}
		
		v2InternalMessage.resetId();
		
		//建立消息
		V2InternalMessage sender = new V2InternalMessage();
		v2InternalMessage.copyTo(sender);
	//	v2InternalMessage.setMessageType(msgSendQueue.getContentType());
		sender.setOwnerType(V2InternalMessageOwnerType.PERSONAL.value);
		sender.setSender(iEmployeeContext.getUserid());
		sender.setOwnerId(iEmployeeContext.getUserid());
		sender.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
		sender.setStatus(V2InternalMessageStatus.NOT_SENT.value);
		sender.setSystemTag(iEmployeeContext.getDcsystemid());
		
		sender = this.getCloudExtensionClient().createInternalMessage(sender);
		
		
		V2InternalMessage receiver = new V2InternalMessage();
		sender.copyTo(receiver);
		
		receiver.resetId();
		receiver.setOwnerType(V2InternalMessageOwnerType.PERSONAL.value);
		receiver.setOwnerId(receiver.getReceiver());
		receiver.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
		receiver.setStatus(V2InternalMessageStatus.RECEIVED.value);
		receiver.setFromId(sender.getId());
		
		try {
			receiver = this.getCloudExtensionClient().createInternalMessage(receiver);
			try {
				PortalMessage portalMessage = new PortalMessage();
				portalMessage.setType(PortalMessageType.COMMAND.getValue());
				portalMessage.setSubType(PortalMessageSubType.COMMAND_INTERNALMESSAGE.getValue());
				portalMessage.setSubject(receiver.getTitle());
				portalMessage.setContent(receiver.getContent());
				portalMessage.setUrl(receiver.getUrl());
				portalMessage.setMobileUrl(receiver.getMobileUrl());
				
				this.getCloudPortalClient().notifyEmployee(receiver.getOwnerId(), receiver.getSystemTag(), portalMessage);
			}
			catch (Throwable ex) {
				log.error(String.format("发送用户通知消息发生异常，%1$s", ex.getMessage()), ex);
			}
			
			try {
				V2InternalMessage sender2 = new V2InternalMessage();
				sender2.setId(sender.getId());
				sender2.setStatus(V2InternalMessageStatus.SENT.value);
				sender = this.getCloudExtensionClient().updateInternalMessage(sender.getId(), sender2);
			}
			catch (Throwable ex2) {
				log.error(ex2);
			}
		}
		catch (Throwable ex) {
			//更新发送失败
			try {
				V2InternalMessage sender2 = new V2InternalMessage();
				sender2.setId(sender.getId());
				sender2.setStatus(V2InternalMessageStatus.SEND_FAILED.value);
				sender2 = this.getCloudExtensionClient().updateInternalMessage(sender.getId(), sender2);
			}
			catch (Throwable ex2) {
				log.error(ex2);
			}
			
			throw ex;
		}
		
		return sender;
	}
	
	@Override
	public V2InternalMessage markRead(String strInternalMessageId, Map<String, Object> params) {
		try {
			return this.onMarkRead(strInternalMessageId, params);
		} catch (Throwable ex) {
			log.debug(String.format("[%1$s]标注已读消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new RuntimeException(String.format("[%1$s]标注已读消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	protected V2InternalMessage onMarkRead(String strInternalMessageId, Map<String, Object> params) throws Throwable{
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		V2InternalMessage message = this.getCloudExtensionClient().getInternalMessage(strInternalMessageId);
		//判断所有者
		if(!iEmployeeContext.getUserid().equals(message.getOwnerId())){
			throw new Exception("所有者不一致");
		}
		
		//判断消息状态
		if(V2InternalMessageStatus.RECEIVED.value.equals(message.getStatus())) {
			V2InternalMessage message2 = new V2InternalMessage();
			message2.setId(strInternalMessageId);
			message2.setStatus(V2InternalMessageStatus.READ.value);
			message = this.getCloudExtensionClient().updateInternalMessage(strInternalMessageId, message2);
		}
		else {
			log.warn(String.format("消息状态[%1$s]不正确，忽略标注", message.getStatus()));
		}
		
		return message;
	}
	
	@Override
	public String getName() {
		return "内部消息";
	}
}
