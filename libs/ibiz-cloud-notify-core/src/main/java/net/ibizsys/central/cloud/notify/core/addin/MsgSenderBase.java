package net.ibizsys.central.cloud.notify.core.addin;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.runtime.msg.MsgContentTypes;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public abstract class MsgSenderBase extends CloudNotifyUtilRTAddinBase implements IMsgSender {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(MsgSenderBase.class);
	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();

	@Override
	protected void onInit() throws Exception {
		// 构建消息模板
		config.setTemplateLoader(stringTemplateLoader);
		super.onInit();
	}

	@Override
	public String send(MsgSendQueue msgSendQueue) {
		try {
			return this.onSend(msgSendQueue);
		} catch (Throwable ex) {
			log.debug(String.format("[%1$s]发送消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new RuntimeException(String.format("[%1$s]发送消息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	abstract String onSend(MsgSendQueue msgSendQueue) throws Throwable;

	protected String getRealContent(String strOpenAccessId, MsgSendQueue msgSendQueue, String strMsgTemplateType) {
		// 根据类型
		if (MsgContentTypes.JSON.equals(msgSendQueue.getContentType())) {
			// 获取对应的消息模板
			MsgTemplate msgTemplate = this.getContext().getMsgTemplate(strOpenAccessId, strMsgTemplateType, msgSendQueue.getTemplateId());
			if (!StringUtils.hasLength(msgTemplate.getTId())) {
				return msgTemplate.getContent();
			}
			// msgTemplate.setTId("DEFAULT");
			// 格式化内容

			if (stringTemplateLoader.findTemplateSource(msgTemplate.getTId()) == null) {
				stringTemplateLoader.putTemplate(msgTemplate.getTId(), msgTemplate.getContent());
			}

			IEntity iEntityBase = null;
			if (StringUtils.hasLength(msgSendQueue.getContent())) {
				iEntityBase = this.getSystemRuntime().deserialize(msgSendQueue.getContent(), EntityDTO.class);
			} else {
				iEntityBase = new EntityDTO();
			}

			// Cloud侧功能仅提供基础数据对象能力
			// IScriptEntity iScriptEntity =
			// this.getSystemRuntime().createScriptEntity(iEntityBase);
			return this.getTemplContent(msgTemplate.getTId(), iEntityBase);
		}

		return msgSendQueue.getContent();
	}

	protected String getTemplContent(String strType, IEntityBase iEntityBase) {

		Map<String, Object> params = new HashMap<String, Object>();
		if (iEntityBase != null) {
			params.put("data", iEntityBase);
			params.put("entity", iEntityBase);
		}
		// params.put("sys",
		// this.getSystemRuntime().getSystemRTScriptContext());
		// if (oldEntity != null) params.put("olddata", oldEntity);
		// if (iWebContext != null) params.put("webcontext", iWebContext);
		// params.put("msgtype", nMsgType);
		//
		// if (msgAccount != null) {
		// params.put("username", msgAccount.getMsgAccountName());
		// params.put("userid", msgAccount.getMsgAccountId());
		// } else {
		// params.put("username", "");
		// params.put("userid", "");
		// }

		try {
			Template template = config.getTemplate(strType);
			StringWriter sw = new StringWriter();
			template.process(params, sw);
			String strContent = sw.toString();
			return strContent;
		} catch (Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
			return ex.getMessage();
		}
	}
}
