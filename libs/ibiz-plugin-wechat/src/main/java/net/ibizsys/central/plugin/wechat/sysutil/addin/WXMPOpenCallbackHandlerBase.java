package net.ibizsys.central.plugin.wechat.sysutil.addin;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.plugin.open.sysutil.addin.OpenCallbackHandlerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;

public abstract class WXMPOpenCallbackHandlerBase extends OpenCallbackHandlerBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenCallbackHandlerBase.class);
	
	public final static String EVENTKEY_LOGIN_PREFIX = "LOGIN:";
	public final static String EVENTKEY_LOGIN_PREFIX2 = "qrscene_LOGIN:";
	
	
	@Override
	protected String onExecuteCallback(String strOpenTag, String strInput) throws Throwable{
		IDataEntityRuntime processDataEntityRuntime = this.getContext().getProcessDataEntityRuntime(this.getOpenType(), strOpenTag, true);
		if(processDataEntityRuntime == null) {
			log.error(String.format("无法获取指定开放平台[%1$s][%2$s]处理实体，忽略响应", this.getOpenType(), strOpenTag));
			return null;
		}
		
		log.debug(String.format("[%1$s]%2$s", strOpenTag, strInput));
		
		WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(strInput);
		
		WxMpXmlOutMessage outMessage = onWxMpXmlMessage(processDataEntityRuntime, strOpenTag, inMessage);
		if(outMessage != null) {
			return outMessage.toXml();
		}
		return null;
	}
	
	protected WxMpXmlOutMessage onWxMpXmlMessage(IDataEntityRuntime processDataEntityRuntime, String strOpenTag, WxMpXmlMessage inMessage) throws Throwable {
		boolean bGetUser = true;
		IEntity bindUser = null;
		if(WxConsts.XmlMsgType.EVENT.equals(inMessage.getMsgType())) {
			if(WxConsts.EventType.SCAN.equals(inMessage.getEvent())
				||WxConsts.EventType.SUBSCRIBE.equals(inMessage.getEvent())) {
				if(StringUtils.hasLength(inMessage.getEventKey())) {
					if(inMessage.getEventKey().indexOf(EVENTKEY_LOGIN_PREFIX) == 0
							|| inMessage.getEventKey().indexOf(EVENTKEY_LOGIN_PREFIX2) == 0) {
						String[] items = inMessage.getEventKey().split("[:]");
						bindUser = this.bindUser(processDataEntityRuntime, strOpenTag, inMessage.getFromUser(), items[1], true);
						bGetUser = false;
					}
				}
			}
			else if(WxConsts.EventType.UNSUBSCRIBE.equals(inMessage.getEvent())) {
				bindUser = this.unbindUser(processDataEntityRuntime, strOpenTag, inMessage.getFromUser(), true);
				bGetUser = false;
			}
		}
		
		IEntity iEntity = processDataEntityRuntime.createEntity();
		iEntity.set("openuserid", inMessage.getFromUser());
		String strLogicTag = null;
		switch(inMessage.getMsgType()) {
		case WxConsts.XmlMsgType.EVENT:
			strLogicTag = String.format("%1$s_%2$s_%3$s", this.getOpenType(), inMessage.getMsgType(), inMessage.getEvent()).toLowerCase();
			iEntity.set("eventkey", inMessage.getEventKey());
			break;
		case WxConsts.XmlMsgType.TEXT:
			strLogicTag = String.format("%1$s_%2$s", this.getOpenType(), inMessage.getMsgType()).toLowerCase();
			iEntity.set("content", inMessage.getContent());
			break;
		}
		
		if(!StringUtils.hasLength(strLogicTag)) {
			return null;
		}
		
		IDELogicRuntime iPSDELogicRuntime = processDataEntityRuntime.getDELogicRuntime(strLogicTag, true);
		if(iPSDELogicRuntime != null) {
			
			//查询默认用户
			if(bindUser == null || bGetUser) {
				bindUser = this.getUser(processDataEntityRuntime, strOpenTag, inMessage.getFromUser(), true);
			}
			
			Map<String, Object> extParams = new HashMap<String, Object>();
			extParams.put("binduser", bindUser);
			
			Object ret = processDataEntityRuntime.executeLogic(strLogicTag, new Object[] { iEntity, extParams });
			if(ret instanceof IEntity) {
				IEntity resultEntityDTO = (IEntity)ret;
				String strMsgType = DataTypeUtils.getStringValue(resultEntityDTO.get("msgtype"), WxConsts.XmlMsgType.TEXT);
				if(WxConsts.XmlMsgType.TEXT.equals(strMsgType)) {
					return WxMpXmlOutMessage.TEXT().fromUser(inMessage.getToUser()).toUser(inMessage.getFromUser()).content(DataTypeUtils.getStringValue(resultEntityDTO.get("content"), "")).build();
				}
			}
		}
		
		return null;
	}
	
}
