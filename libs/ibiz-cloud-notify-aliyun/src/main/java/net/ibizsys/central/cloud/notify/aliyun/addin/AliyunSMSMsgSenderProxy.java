package net.ibizsys.central.cloud.notify.aliyun.addin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.notify.core.addin.SMSMsgSenderProxy;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.YamlUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

public class AliyunSMSMsgSenderProxy extends SMSMsgSenderProxy {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AliyunSMSMsgSenderProxy.class);
	private OpenAccess openAccess = null;
	private Client client = null;
	private String strSignName = null;
	private Map<String, String> templCodeMap = null;
	
	@Override
	protected void onInit() throws Exception {
		String strAddin = null;
		if (this.getAddinData() instanceof String) {
			strAddin = (String) this.getAddinData();
		}
		if (ObjectUtils.isEmpty(strAddin)) {
			strAddin = "agent-sms_proxy";
		} else {
			strAddin = strAddin.replace("-", "_").replace("MSGSENDER:", "agent-").toLowerCase();
		}

		String strConfigId = String.format("%1$s-%2$s-%3$s", ICloudUtilRuntime.CLOUDCONFIGID_NOTIFY, strAddin, "aliyun");
		String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
		if (StringUtils.hasLength(strConfig)) {
			this.openAccess = JsonUtils.as(YamlUtils.asMap(strConfig), OpenAccess.class);
			this.client = this.createClient(this.openAccess);
			this.strSignName = (String)this.openAccess.get("signname");
			Object templates = this.openAccess.get("templates");
			if(templates instanceof Map) {
				this.templCodeMap = (Map)templates;
			}
		} else {
			log.warn(String.format("无法获取cloud配置[%1$s]", strConfigId));
		}

		super.onInit();
	}

	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {

		final Client client = this.client;
		if (client == null) {
			return "无法获取客户端对象";
		}
		return this.doSend(client, msgSendQueue);

	}

	protected Client createClient(OpenAccess openAccess) throws Exception {
		Config config = new Config()
				// 配置 AccessKey ID，请确保代码运行环境设置了环境变量。
				.setAccessKeyId(openAccess.getAccessKey()).setAccessKeySecret(openAccess.getSecretKey());

		// 配置 Endpoint
		if (StringUtils.hasLength(openAccess.getNotifyUrl())) {
			config.endpoint = openAccess.getNotifyUrl();
		} else
			config.endpoint = "dysmsapi.aliyuncs.com";

		return new Client(config);
	}
	
	

	protected String doSend(Client client, MsgSendQueue msgSendQueue) throws Throwable {

		List<String> phoneNumberList = new ArrayList<String>();

		String strDstUsers = msgSendQueue.getDstUsers();
		if (ObjectUtils.isEmpty(strDstUsers)) {
			throw new Exception("未指定目标用户");
		}
		
		String strSMSContent = msgSendQueue.getSMSContent();
		if (ObjectUtils.isEmpty(strSMSContent)) {
			throw new Exception("未指定发送内容");
		}
		
		Map<String, Object> content = JsonUtils.asMap(strSMSContent);
		Object templCode = content.remove("templcode");
		String strTemplCode = null;
		if(!ObjectUtils.isEmpty(templCode)) {
			if(this.templCodeMap!=null) {
				strTemplCode = this.templCodeMap.get((String)templCode);
			}
			if(ObjectUtils.isEmpty(strTemplCode)) {
				//尝试使用直接代码
				strTemplCode = (String)templCode;
			}
		}
		else {
			if(this.templCodeMap!=null) {
				strTemplCode = this.templCodeMap.get("default");
			}
		}
		
		if(ObjectUtils.isEmpty(strTemplCode)) {
			throw new Exception("未指定发送模板代码");
		}

		if (strDstUsers.indexOf("[") == 0) {
			ArrayNode arrayNode = JsonUtils.toArrayNode(strDstUsers);
			for (int i = 0; i < arrayNode.size(); i++) {
				try {
					Employee employee = this.getContext().getEmployee(arrayNode.get(i).asText());
					if(StringUtils.hasLength(employee.getPhone())) {
						phoneNumberList.add(employee.getPhone());
					}
					else {
						log.warn(String.format("机构用户[%1$s]未指定手机号码", employee.getUAAUserName()));
					}
				}
				catch (Throwable ex) {
					throw new Exception(String.format("无法获取指定机构用户信息[%1$s]", arrayNode.get(i).asText()));
				}
			}
		} else {
			String[] userIds = strDstUsers.split("[,]");
			for (String strUserId : userIds) {
				try {
					Employee employee = this.getContext().getEmployee(strUserId);
					if(StringUtils.hasLength(employee.getPhone())) {
						phoneNumberList.add(employee.getPhone());
					}
					else {
						log.warn(String.format("机构用户[%1$s]未指定手机号码", employee.getUAAUserName()));
					}
				}
				catch (Throwable ex) {
					throw new Exception(String.format("无法获取指定机构用户信息[%1$s]", strUserId));
				}
			}
		}
		
		if(ObjectUtils.isEmpty(phoneNumberList)){
			return null;
		}
		
		strSMSContent = JsonUtils.toString(content);
		
		SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers(StringUtils.collectionToDelimitedString(phoneNumberList, ","))
                .setSignName(this.strSignName)
                .setTemplateCode(strTemplCode)
                .setTemplateParam(strSMSContent);
		SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
		if(sendSmsResponse.getStatusCode() != 200) {
			log.error(String.format("发送短消息返回错误，%1$s", JsonUtils.toString(sendSmsResponse)));
			throw new Exception(String.format("发送短消息返回错误，%1$s", (sendSmsResponse.getBody()!=null)?sendSmsResponse.getBody().getMessage():"未知错误"));
		}
		

		return null;
	}
}
