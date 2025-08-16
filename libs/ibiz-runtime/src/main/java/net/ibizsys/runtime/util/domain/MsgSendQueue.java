package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 模型 MsgSendQueue 存储对象
 */
public class MsgSendQueue extends net.ibizsys.runtime.util.EntityBase {

	/**
	 * 消息内容
	 */
	// private String content;
	public final static String FIELD_CONTENT = "content";

	@JsonIgnore
	public String getContent() {
		Object objValue = this.get(FIELD_CONTENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONTENT)
	public void setContent(String content) {
		this.set(FIELD_CONTENT, content);
	}

	@JsonIgnore
	public boolean isContentDirty() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 内容类型
	 */
	// private String contentType;
	public final static String FIELD_CONTENTTYPE = "contenttype";

	@JsonIgnore
	public String getContentType() {
		Object objValue = this.get(FIELD_CONTENTTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONTENTTYPE)
	public void setContentType(String contentType) {
		this.set(FIELD_CONTENTTYPE, contentType);
	}

	@JsonIgnore
	public boolean isContentTypeDirty() {
		return this.contains(FIELD_CONTENTTYPE);
	}

	/**
	 * 建立时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	// private Timestamp createDate;
	public final static String FIELD_CREATEDATE = "createdate";

	@JsonIgnore
	public Timestamp getCreateDate() {
		Object objValue = this.get(FIELD_CREATEDATE);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_CREATEDATE)
	public void setCreateDate(Timestamp createDate) {
		this.set(FIELD_CREATEDATE, createDate);
	}

	@JsonIgnore
	public boolean isCreateDateDirty() {
		return this.contains(FIELD_CREATEDATE);
	}

	/**
	 * 建立人
	 */
	// private String createMan;
	public final static String FIELD_CREATEMAN = "createman";

	@JsonIgnore
	public String getCreateMan() {
		Object objValue = this.get(FIELD_CREATEMAN);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CREATEMAN)
	public void setCreateMan(String createMan) {
		this.set(FIELD_CREATEMAN, createMan);
	}

	@JsonIgnore
	public boolean isCreateManDirty() {
		return this.contains(FIELD_CREATEMAN);
	}

	/**
	 * 钉钉消息内容
	 */
	// private String dDContent;
	public final static String FIELD_DDCONTENT = "ddcontent";

	@JsonIgnore
	public String getDDContent() {
		Object objValue = this.get(FIELD_DDCONTENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DDCONTENT)
	public void setDDContent(String dDContent) {
		this.set(FIELD_DDCONTENT, dDContent);
	}

	@JsonIgnore
	public boolean isDDContentDirty() {
		return this.contains(FIELD_DDCONTENT);
	}

	/**
	 * 目标地址
	 */
	// private String dstAddresses;
	public final static String FIELD_DSTADDRESSES = "dstaddresses";

	@JsonIgnore
	public String getDstAddresses() {
		Object objValue = this.get(FIELD_DSTADDRESSES);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DSTADDRESSES)
	public void setDstAddresses(String dstAddresses) {
		this.set(FIELD_DSTADDRESSES, dstAddresses);
	}

	@JsonIgnore
	public boolean isDstAddressesDirty() {
		return this.contains(FIELD_DSTADDRESSES);
	}

	/**
	 * 目标用户
	 */
	// private String dstUsers;
	public final static String FIELD_DSTUSERS = "dstusers";

	@JsonIgnore
	public String getDstUsers() {
		Object objValue = this.get(FIELD_DSTUSERS);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DSTUSERS)
	public void setDstUsers(String dstUsers) {
		this.set(FIELD_DSTUSERS, dstUsers);
	}

	@JsonIgnore
	public boolean isDstUsersDirty() {
		return this.contains(FIELD_DSTUSERS);
	}

	/**
	 * 错误信息
	 */
	// private String errorInfo;
	public final static String FIELD_ERRORINFO = "errorinfo";

	@JsonIgnore
	public String getErrorInfo() {
		Object objValue = this.get(FIELD_ERRORINFO);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_ERRORINFO)
	public void setErrorInfo(String errorInfo) {
		this.set(FIELD_ERRORINFO, errorInfo);
	}

	@JsonIgnore
	public boolean isErrorInfoDirty() {
		return this.contains(FIELD_ERRORINFO);
	}

	/**
	 * 文件附件
	 */
	// private String fileAT;
	public final static String FIELD_FILEAT = "fileat";

	@JsonIgnore
	public String getFileAT() {
		Object objValue = this.get(FIELD_FILEAT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEAT)
	public void setFileAT(String fileAT) {
		this.set(FIELD_FILEAT, fileAT);
	}

	@JsonIgnore
	public boolean isFileATDirty() {
		return this.contains(FIELD_FILEAT);
	}

	/**
	 * 文件附件2
	 */
	// private String fileAT2;
	public final static String FIELD_FILEAT2 = "fileat2";

	@JsonIgnore
	public String getFileAT2() {
		Object objValue = this.get(FIELD_FILEAT2);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEAT2)
	public void setFileAT2(String fileAT2) {
		this.set(FIELD_FILEAT2, fileAT2);
	}

	@JsonIgnore
	public boolean isFileAT2Dirty() {
		return this.contains(FIELD_FILEAT2);
	}

	/**
	 * 文件附件3
	 */
	// private String fileAT3;
	public final static String FIELD_FILEAT3 = "fileat3";

	@JsonIgnore
	public String getFileAT3() {
		Object objValue = this.get(FIELD_FILEAT3);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEAT3)
	public void setFileAT3(String fileAT3) {
		this.set(FIELD_FILEAT3, fileAT3);
	}

	@JsonIgnore
	public boolean isFileAT3Dirty() {
		return this.contains(FIELD_FILEAT3);
	}

	/**
	 * 文件附件4
	 */
	// private String fileAT4;
	public final static String FIELD_FILEAT4 = "fileat4";

	@JsonIgnore
	public String getFileAT4() {
		Object objValue = this.get(FIELD_FILEAT4);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEAT4)
	public void setFileAT4(String fileAT4) {
		this.set(FIELD_FILEAT4, fileAT4);
	}

	@JsonIgnore
	public boolean isFileAT4Dirty() {
		return this.contains(FIELD_FILEAT4);
	}

	/**
	 * IM消息内容
	 */
	// private String iMContent;
	public final static String FIELD_IMCONTENT = "imcontent";

	@JsonIgnore
	public String getIMContent() {
		Object objValue = this.get(FIELD_IMCONTENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_IMCONTENT)
	public void setIMContent(String iMContent) {
		this.set(FIELD_IMCONTENT, iMContent);
	}

	@JsonIgnore
	public boolean isIMContentDirty() {
		return this.contains(FIELD_IMCONTENT);
	}

	/**
	 * 重要程度
	 */
	// private Integer importanceFlag;
	public final static String FIELD_IMPORTANCEFLAG = "importanceflag";

	@JsonIgnore
	public Integer getImportanceFlag() {
		Object objValue = this.get(FIELD_IMPORTANCEFLAG);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_IMPORTANCEFLAG)
	public void setImportanceFlag(Integer importanceFlag) {
		this.set(FIELD_IMPORTANCEFLAG, importanceFlag);
	}

	@JsonIgnore
	public boolean isImportanceFlagDirty() {
		return this.contains(FIELD_IMPORTANCEFLAG);
	}

	/**
	 * 处理错误
	 */
	// private Integer isError;
	public final static String FIELD_ISERROR = "iserror";

	@JsonIgnore
	public Integer getIsError() {
		Object objValue = this.get(FIELD_ISERROR);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_ISERROR)
	public void setIsError(Integer isError) {
		this.set(FIELD_ISERROR, isError);
	}

	@JsonIgnore
	public boolean isIsErrorDirty() {
		return this.contains(FIELD_ISERROR);
	}

	/**
	 * 是否发送
	 */
	// private Integer isSend;
	public final static String FIELD_ISSEND = "issend";

	@JsonIgnore
	public Integer getIsSend() {
		Object objValue = this.get(FIELD_ISSEND);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_ISSEND)
	public void setIsSend(Integer isSend) {
		this.set(FIELD_ISSEND, isSend);
	}

	@JsonIgnore
	public boolean isIsSendDirty() {
		return this.contains(FIELD_ISSEND);
	}

	/**
	 * 消息发送队列标识
	 */
	// private String msgSendQueueId;
	public final static String FIELD_MSGSENDQUEUEID = "msgsendqueueid";

	@JsonIgnore
	public String getMsgSendQueueId() {
		Object objValue = this.get(FIELD_MSGSENDQUEUEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MSGSENDQUEUEID)
	public void setMsgSendQueueId(String msgSendQueueId) {
		this.set(FIELD_MSGSENDQUEUEID, msgSendQueueId);
	}

	@JsonIgnore
	public boolean isMsgSendQueueIdDirty() {
		return this.contains(FIELD_MSGSENDQUEUEID);
	}

	/**
	 * 消息发送队列名称
	 */
	// private String msgSendQueueName;
	public final static String FIELD_MSGSENDQUEUENAME = "msgsendqueuename";

	@JsonIgnore
	public String getMsgSendQueueName() {
		Object objValue = this.get(FIELD_MSGSENDQUEUENAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MSGSENDQUEUENAME)
	public void setMsgSendQueueName(String msgSendQueueName) {
		this.set(FIELD_MSGSENDQUEUENAME, msgSendQueueName);
	}

	@JsonIgnore
	public boolean isMsgSendQueueNameDirty() {
		return this.contains(FIELD_MSGSENDQUEUENAME);
	}

	/**
	 * 消息类型
	 */
	// private Integer msgType;
	public final static String FIELD_MSGTYPE = "msgtype";

	@JsonIgnore
	public Integer getMsgType() {
		Object objValue = this.get(FIELD_MSGTYPE);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_MSGTYPE)
	public void setMsgType(Integer msgType) {
		this.set(FIELD_MSGTYPE, msgType);
	}

	@JsonIgnore
	public boolean isMsgTypeDirty() {
		return this.contains(FIELD_MSGTYPE);
	}

	/**
	 * 计划发送时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	// private Timestamp planSendTime;
	public final static String FIELD_PLANSENDTIME = "plansendtime";

	@JsonIgnore
	public Timestamp getPlanSendTime() {
		Object objValue = this.get(FIELD_PLANSENDTIME);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_PLANSENDTIME)
	public void setPlanSendTime(Timestamp planSendTime) {
		this.set(FIELD_PLANSENDTIME, planSendTime);
	}

	@JsonIgnore
	public boolean isPlanSendTimeDirty() {
		return this.contains(FIELD_PLANSENDTIME);
	}

	/**
	 * 处理时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	// private Timestamp processTime;
	public final static String FIELD_PROCESSTIME = "processtime";

	@JsonIgnore
	public Timestamp getProcessTime() {
		Object objValue = this.get(FIELD_PROCESSTIME);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_PROCESSTIME)
	public void setProcessTime(Timestamp processTime) {
		this.set(FIELD_PROCESSTIME, processTime);
	}

	@JsonIgnore
	public boolean isProcessTimeDirty() {
		return this.contains(FIELD_PROCESSTIME);
	}

	/**
	 * 发送者标识
	 */
	// private String sendTag;
	public final static String FIELD_SENDTAG = "sendtag";

	@JsonIgnore
	public String getSendTag() {
		Object objValue = this.get(FIELD_SENDTAG);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SENDTAG)
	public void setSendTag(String sendTag) {
		this.set(FIELD_SENDTAG, sendTag);
	}

	@JsonIgnore
	public boolean isSendTagDirty() {
		return this.contains(FIELD_SENDTAG);
	}

	/**
	 * 短消息内容
	 */
	// private String sMSContent;
	public final static String FIELD_SMSCONTENT = "smscontent";

	@JsonIgnore
	public String getSMSContent() {
		Object objValue = this.get(FIELD_SMSCONTENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SMSCONTENT)
	public void setSMSContent(String sMSContent) {
		this.set(FIELD_SMSCONTENT, sMSContent);
	}

	@JsonIgnore
	public boolean isSMSContentDirty() {
		return this.contains(FIELD_SMSCONTENT);
	}

	/**
	 * 消息标题
	 */
	// private String subject;
	public final static String FIELD_SUBJECT = "subject";

	@JsonIgnore
	public String getSubject() {
		Object objValue = this.get(FIELD_SUBJECT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SUBJECT)
	public void setSubject(String subject) {
		this.set(FIELD_SUBJECT, subject);
	}

	@JsonIgnore
	public boolean isSubjectDirty() {
		return this.contains(FIELD_SUBJECT);
	}

	/**
	 * 全部地址
	 */
	// private String totalDstAddresses;
	public final static String FIELD_TOTALDSTADDRESSES = "totaldstaddresses";

	@JsonIgnore
	public String getTotalDstAddresses() {
		Object objValue = this.get(FIELD_TOTALDSTADDRESSES);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_TOTALDSTADDRESSES)
	public void setTotalDstAddresses(String totalDstAddresses) {
		this.set(FIELD_TOTALDSTADDRESSES, totalDstAddresses);
	}

	@JsonIgnore
	public boolean isTotalDstAddressesDirty() {
		return this.contains(FIELD_TOTALDSTADDRESSES);
	}

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	// private Timestamp updateDate;
	public final static String FIELD_UPDATEDATE = "updatedate";

	@JsonIgnore
	public Timestamp getUpdateDate() {
		Object objValue = this.get(FIELD_UPDATEDATE);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_UPDATEDATE)
	public void setUpdateDate(Timestamp updateDate) {
		this.set(FIELD_UPDATEDATE, updateDate);
	}

	@JsonIgnore
	public boolean isUpdateDateDirty() {
		return this.contains(FIELD_UPDATEDATE);
	}

	/**
	 * 更新人
	 */
	// private String updateMan;
	public final static String FIELD_UPDATEMAN = "updateman";

	@JsonIgnore
	public String getUpdateMan() {
		Object objValue = this.get(FIELD_UPDATEMAN);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_UPDATEMAN)
	public void setUpdateMan(String updateMan) {
		this.set(FIELD_UPDATEMAN, updateMan);
	}

	@JsonIgnore
	public boolean isUpdateManDirty() {
		return this.contains(FIELD_UPDATEMAN);
	}

	/**
	 * 用户数据
	 */
	// private String userData;
	public final static String FIELD_USERDATA = "userdata";

	@JsonIgnore
	public String getUserData() {
		Object objValue = this.get(FIELD_USERDATA);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERDATA)
	public void setUserData(String userData) {
		this.set(FIELD_USERDATA, userData);
	}

	@JsonIgnore
	public boolean isUserDataDirty() {
		return this.contains(FIELD_USERDATA);
	}

	/**
	 * 用户数据2
	 */
	// private String userData2;
	public final static String FIELD_USERDATA2 = "userdata2";

	@JsonIgnore
	public String getUserData2() {
		Object objValue = this.get(FIELD_USERDATA2);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERDATA2)
	public void setUserData2(String userData2) {
		this.set(FIELD_USERDATA2, userData2);
	}

	@JsonIgnore
	public boolean isUserData2Dirty() {
		return this.contains(FIELD_USERDATA2);
	}

	/**
	 * 用户数据3
	 */
	// private String userData3;
	public final static String FIELD_USERDATA3 = "userdata3";

	@JsonIgnore
	public String getUserData3() {
		Object objValue = this.get(FIELD_USERDATA3);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERDATA3)
	public void setUserData3(String userData3) {
		this.set(FIELD_USERDATA3, userData3);
	}

	@JsonIgnore
	public boolean isUserData3Dirty() {
		return this.contains(FIELD_USERDATA3);
	}

	/**
	 * 用户数据4
	 */
	// private String userData4;
	public final static String FIELD_USERDATA4 = "userdata4";

	@JsonIgnore
	public String getUserData4() {
		Object objValue = this.get(FIELD_USERDATA4);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERDATA4)
	public void setUserData4(String userData4) {
		this.set(FIELD_USERDATA4, userData4);
	}

	@JsonIgnore
	public boolean isUserData4Dirty() {
		return this.contains(FIELD_USERDATA4);
	}

	/**
	 * 微信消息内容
	 */
	// private String wXContent;
	public final static String FIELD_WXCONTENT = "wxcontent";

	@JsonIgnore
	public String getWXContent() {
		Object objValue = this.get(FIELD_WXCONTENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_WXCONTENT)
	public void setWXContent(String wXContent) {
		this.set(FIELD_WXCONTENT, wXContent);
	}

	@JsonIgnore
	public boolean isWXContentDirty() {
		return this.contains(FIELD_WXCONTENT);
	}

	@JsonIgnore
	public String getSrfkey() {
		return this.getMsgSendQueueId();
	}

	public void setSrfkey(String strValue) {
		this.setMsgSendQueueId(strValue);
	}

	/**
	 * 消息模板标识
	 */
	// private String content;
	public final static String FIELD_TEMPLATEID = "templateid";

	@JsonIgnore
	public String getTemplateId() {
		Object objValue = this.get(FIELD_TEMPLATEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_TEMPLATEID)
	public void setTemplateId(String content) {
		this.set(FIELD_TEMPLATEID, content);
	}

	@JsonIgnore
	public boolean isTemplateIdDirty() {
		return this.contains(FIELD_TEMPLATEID);
	}

	
	/**
	 * URL链接
	 */
	public final static String FIELD_URL = "url";

	@JsonIgnore
	public String getUrl() {
		Object objValue = this.get(FIELD_URL);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_URL)
	public void setUrl(String content) {
		this.set(FIELD_URL, content);
	}

	@JsonIgnore
	public boolean isUrlDirty() {
		return this.contains(FIELD_URL);
	}
	
	
	/**
	 * 移动端链接
	 */
	public final static String FIELD_MOBILEURL = "mobileurl";

	@JsonIgnore
	public String getMobileUrl() {
		Object objValue = this.get(FIELD_MOBILEURL);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MOBILEURL)
	public void setMobileUrl(String content) {
		this.set(FIELD_MOBILEURL, content);
	}

	@JsonIgnore
	public boolean isMobileUrlDirty() {
		return this.contains(FIELD_MOBILEURL);
	}
	
}
