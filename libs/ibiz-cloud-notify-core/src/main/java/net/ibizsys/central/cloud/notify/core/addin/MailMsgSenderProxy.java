package net.ibizsys.central.cloud.notify.core.addin;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplateType;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;

/**
 * 电子邮件消息发送者
 * @author lionlau
 *
 */
public class MailMsgSenderProxy extends MsgSenderBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(MailMsgSenderProxy.class);
	
	public class SmtpAuthenticator extends Authenticator {
		private PasswordAuthentication password_auth;

		public SmtpAuthenticator(String smtp_user, String smtp_password) {
			password_auth = new PasswordAuthentication(smtp_user, smtp_password);
		}

		public PasswordAuthentication getPasswordAuthentication() {
			return password_auth;
		}
	}
	
	@Override
	protected String onSend(MsgSendQueue msgSendQueue) throws Throwable {
		
		String strDCId = (String)msgSendQueue.get("srfdcid");
		if(!StringUtils.hasLength(strDCId)) {
			throw new Exception("消息未指定机构");
		}
		
		String strDefaultAccessId = KeyValueUtils.genUniqueId(strDCId, "MAIL");
		
		OpenAccess openAccess = null;
		try {
			openAccess = this.getContext().getOpenAccess(strDefaultAccessId, true);
			if(openAccess == null) {
				return "无法获取机构邮件配置";
			}
		}
		catch (Throwable ex) {
			log.error(String.format("无法获取机构[%1$s]邮件配置，%2$s", strDCId, ex.getMessage()), ex);
			return "无法获取机构邮件配置";
		}
		
		return this.doSend(openAccess, msgSendQueue);
		
	}
	
	protected String doSend(OpenAccess openAccess, MsgSendQueue msgSendQueue) throws Throwable {
		
		if(!StringUtils.hasLength(openAccess.getNotifyUrl())) {
			return "未指定邮件服务器地址";
		}
		
		Session session = null;
		String strSMTPServer = "";

		int nSMTPPort = 25;

		String strSMTPPort = "25";

		String strSMTPUser = openAccess.getAccessKey();// this.getServiceParam("SMTPUSER", "");
		String strSMTPPassword = openAccess.getAccessToken();// this.getServiceParam("SMTPPASSWORD", "");
		

		String strMailFrom = "";

		boolean bSSL = false;

		boolean bSMTPAuth = true;

		int nSendTimer = 30000;
		
		try {
			
			URL url = new URL(openAccess.getNotifyUrl());
			
			strSMTPServer =  url.getHost();
			nSMTPPort =  url.getPort();// Integer.parseInt(this.getServiceParam("SMTPPORT", "25"));
			strSMTPPort = String.format("%1$s",  nSMTPPort);
			
			strMailFrom = strSMTPUser;// this.getServiceParam("MAILFROM", strSMTPUser);
			bSMTPAuth = true;
			nSendTimer = 30000;
			if("smtps".equalsIgnoreCase(url.getProtocol())) {
				bSSL = true;
			}

			Properties props = new Properties();
			props.setProperty("mail.transport.protocol", bSSL ? "smtps" : "smtp");
			props.setProperty("mail.smtp.host", strSMTPServer);
			props.setProperty("mail.smtp.port", strSMTPPort);
			props.setProperty("mail.smtp.user", strSMTPUser); // 发送方邮件地址。
			props.setProperty("mail.smtp.from", strMailFrom);
			props.setProperty("mail.smtp.password", strSMTPPassword); // 邮件密码。
			props.setProperty("mail.smtp.auth", bSMTPAuth ? "true" : "false");
			// props.put("mail.smtp.sendpartial",true);
			props.setProperty("mail.smtp.timeout", String.format("%1$s", 1000 * 60 * 10));
			props.setProperty("mail.smtp.starttls.enable", "true");

			if (bSSL) {
				props.setProperty("mail.smtp.ssl.enable", "true");
				props.setProperty("mail.smtp.socketFactory.host", strSMTPServer);
				props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.setProperty("mail.smtp.socketFactory.fallback", "false");
			}

			session = Session.getDefaultInstance(props, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(strSMTPUser, strSMTPPassword);
				}
			});
			
		} catch (Exception ex) {
			throw new Exception(String.format("登录邮件服务器发生错误，%1$s", ex.getMessage()), ex);
		}
		
		msgSendQueue.setProcessTime(new java.sql.Timestamp(new Date().getTime()));
		MimeMessage mimemessage = new MimeMessage(session);
		mimemessage.setFrom(new InternetAddress(strMailFrom));
		mimemessage.setSentDate(new Date());
		// set SUBJECT

		// 标题转码
		// String strSubject= MimeUtility.encodeText(msgSendQueue.getSubject(), "GBK", "B");

		//mimemessage.setSubject(msgSendQueue.getSubject(), "GBK");
		mimemessage.setSubject(msgSendQueue.getSubject(), "UTF-8");

		List<InternetAddress> addressList = new ArrayList<InternetAddress>();

		String strDstUsers = msgSendQueue.getDstUsers();
		if (ObjectUtils.isEmpty(strDstUsers)) {
			throw new Exception("未指定目标用户");
		}

		if (strDstUsers.indexOf("[") == 0) {
			ArrayNode arrayNode = JsonUtils.toArrayNode(strDstUsers);
			for (int i = 0; i < arrayNode.size(); i++) {
				try {
					Employee employee = this.getContext().getEmployee(arrayNode.get(i).asText());
					if(StringUtils.hasLength(employee.getEmail())) {
						addressList.add(new InternetAddress(employee.getEmail()));
					}
					else {
						log.warn(String.format("机构用户[%1$s]未指定邮件信息", employee.getUAAUserName()));
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
					if(StringUtils.hasLength(employee.getEmail())) {
						addressList.add(new InternetAddress(employee.getEmail()));
					}
					else {
						log.warn(String.format("机构用户[%1$s]未指定邮件信息", employee.getUAAUserName()));
					}
				}
				catch (Throwable ex) {
					throw new Exception(String.format("无法获取指定机构用户信息[%1$s]", strUserId));
				}
			}
		}
		
		InternetAddress[] iaddrs = new InternetAddress[addressList.size()];
		addressList.toArray(iaddrs);
		mimemessage.setRecipients(javax.mail.Message.RecipientType.TO, iaddrs);
		

		String strEncode = "text/html;charset=UTF-8";
		if ("HTML".equalsIgnoreCase(msgSendQueue.getContentType())) {
			strEncode = "text/plain;charset=UTF-8";
		}

		// set message BODY
		MimeBodyPart mimebodypart = new MimeBodyPart();
		
		//mimebodypart.setContent( msgSendQueue.getContent(), strEncode);
		mimebodypart.setContent(this.getRealContent(openAccess.getId(), msgSendQueue, MsgTemplateType.EMAIL.getValue()), strEncode);

		// attach message BODY
		MimeMultipart mimemultipart = new MimeMultipart();
		mimemultipart.addBodyPart(mimebodypart);

//		ArrayList attachedFileList = new ArrayList();
//		if (!StringHelper.isNullOrEmpty(msgSendQueue.getFileAT())) {
//			attachedFileList.add(msgSendQueue.getFileAT());
//		}
//		if (!StringHelper.isNullOrEmpty(msgSendQueue.getFileAT2())) {
//			attachedFileList.add(msgSendQueue.getFileAT2());
//		}
//		if (!StringHelper.isNullOrEmpty(msgSendQueue.getFileAT3())) {
//			attachedFileList.add(msgSendQueue.getFileAT3());
//		}
//		if (!StringHelper.isNullOrEmpty(msgSendQueue.getFileAT4())) {
//			attachedFileList.add(msgSendQueue.getFileAT4());
//		}
//
//		if (attachedFileList.size() > 0) {
//			for (Iterator e = attachedFileList.iterator(); e.hasNext();) {
//				FileDataSource ds = new FileDataSource((String) e.next());
//
//				mimebodypart = new MimeBodyPart();
//				try {
//					mimebodypart.setDataHandler(new DataHandler(ds));
//				} catch (Exception exception3) {
//					throw exception3;
//				}
//				mimebodypart.setFileName(MimeUtility.encodeText(ds.getName())); // set
//																				// FILENAME
//				mimemultipart.addBodyPart(mimebodypart);
//			}
//		}

		mimemessage.setContent(mimemultipart);
		// mimemessage.setSubject(msgSendQueue.getSubject(),"GBK");
		mimemessage.saveChanges();
		
		Transport.send(mimemessage);
		
		return null;
	}
	

	@Override
	public String getName() {
		return "邮件";
	}
}
