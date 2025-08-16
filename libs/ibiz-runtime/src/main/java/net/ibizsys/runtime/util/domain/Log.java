package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Log extends net.ibizsys.runtime.util.EntityBase {

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
	 * 日志标识
	 */
	public final static String FIELD_LOGID = "logid";

	@JsonIgnore
	public String getLogId() {
		Object objValue = this.get(FIELD_LOGID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGID)
	public void setLogId(String fileId) {
		this.set(FIELD_LOGID, fileId);
	}

	@JsonIgnore
	public boolean isLogIdDirty() {
		return this.contains(FIELD_LOGID);
	}

	/**
	 * 日志名称
	 */
	public final static String FIELD_LOGNAME = "logname";

	@JsonIgnore
	public String getLogName() {
		Object objValue = this.get(FIELD_LOGNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGNAME)
	public void setLogName(String fileName) {
		this.set(FIELD_LOGNAME, fileName);
	}

	@JsonIgnore
	public boolean isLogNameDirty() {
		return this.contains(FIELD_LOGNAME);
	}

	/**
	 * 指定信息
	 */
	public final static String FIELD_INFO = "info";

	@JsonIgnore
	public String getInfo() {
		Object objValue = this.get(FIELD_INFO);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_INFO)
	public void setInfo(String info) {
		this.set(FIELD_INFO, info);
	}

	@JsonIgnore
	public boolean isInfoDirty() {
		return this.contains(FIELD_INFO);
	}

	/**
	 * 操作用户
	 */
	public final static String FIELD_USERID = "userid";

	@JsonIgnore
	public String getUserId() {
		Object objValue = this.get(FIELD_USERID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERID)
	public void setUserId(String localPath) {
		this.set(FIELD_USERID, localPath);
	}

	@JsonIgnore
	public boolean isUserIdDirty() {
		return this.contains(FIELD_USERID);
	}

	/**
	 * 租户
	 */
	public final static String FIELD_TENANT = "tenant";

	@JsonIgnore
	public String getTenant() {
		Object objValue = this.get(FIELD_TENANT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_TENANT)
	public void setTenant(String memo) {
		this.set(FIELD_TENANT, memo);
	}

	@JsonIgnore
	public boolean isTenantDirty() {
		return this.contains(FIELD_TENANT);
	}

	/**
	 * 组织标识
	 */
	public final static String FIELD_ORGID = "orgid";

	@JsonIgnore
	public String getOrgId() {
		Object objValue = this.get(FIELD_ORGID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_ORGID)
	public void setOrgId(String orgId) {
		this.set(FIELD_ORGID, orgId);
	}

	@JsonIgnore
	public boolean isOrgIdDirty() {
		return this.contains(FIELD_ORGID);
	}

	/**
	 * 部门标识
	 */
	public final static String FIELD_DEPTID = "deptid";

	@JsonIgnore
	public String getDeptId() {
		Object objValue = this.get(FIELD_DEPTID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEPTID)
	public void setDeptId(String deptId) {
		this.set(FIELD_DEPTID, deptId);
	}

	@JsonIgnore
	public boolean isDeptIdDirty() {
		return this.contains(FIELD_DEPTID);
	}

	/**
	 * 系统标识
	 */
	public final static String FIELD_SYSTEMID = "systemid";

	@JsonIgnore
	public String getSystemId() {
		Object objValue = this.get(FIELD_SYSTEMID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SYSTEMID)
	public void setSystemId(String systemId) {
		this.set(FIELD_SYSTEMID, systemId);
	}

	@JsonIgnore
	public boolean isSystemIdDirty() {
		return this.contains(FIELD_SYSTEMID);
	}

	/**
	 * 部署系统标识
	 */
	public final static String FIELD_DEPLOYSYSTEMID = "deploysystemid";

	@JsonIgnore
	public String getDeploySystemId() {
		Object objValue = this.get(FIELD_DEPLOYSYSTEMID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEPLOYSYSTEMID)
	public void setDeploySystemId(String deploysystemId) {
		this.set(FIELD_DEPLOYSYSTEMID, deploysystemId);
	}

	@JsonIgnore
	public boolean isDeploySystemIdDirty() {
		return this.contains(FIELD_DEPLOYSYSTEMID);
	}

	/**
	 * 远程地址
	 */
	public final static String FIELD_REMOTEADDRESS = "remoteaddress";

	@JsonIgnore
	public String getRemoteAddress() {
		Object objValue = this.get(FIELD_REMOTEADDRESS);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_REMOTEADDRESS)
	public void setRemoteAddress(String remoteAddress) {
		this.set(FIELD_REMOTEADDRESS, remoteAddress);
	}

	@JsonIgnore
	public boolean isRemoteAddressDirty() {
		return this.contains(FIELD_REMOTEADDRESS);
	}

	/**
	 * 日志级别
	 */
	public final static String FIELD_LOGLEVEL = "loglevel";

	@JsonIgnore
	public Integer getLogLevel() {
		Object objValue = this.get(FIELD_LOGLEVEL);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_LOGLEVEL)
	public void setLogLevel(Integer logLevel) {
		this.set(FIELD_LOGLEVEL, logLevel);
	}

	@JsonIgnore
	public boolean isLogLevelDirty() {
		return this.contains(FIELD_LOGLEVEL);
	}

	/**
	 * 保留字段
	 */
	// private String reserver;
	public final static String FIELD_RESERVER = "reserver";

	@JsonIgnore
	public String getReserver() {
		Object objValue = this.get(FIELD_RESERVER);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_RESERVER)
	public void setReserver(String reserver) {
		this.set(FIELD_RESERVER, reserver);
	}

	@JsonIgnore
	public boolean isReserverDirty() {
		return this.contains(FIELD_RESERVER);
	}

	/**
	 * 保留字段2
	 */
	// private String reserver2;
	public final static String FIELD_RESERVER2 = "reserver2";

	@JsonIgnore
	public String getReserver2() {
		Object objValue = this.get(FIELD_RESERVER2);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_RESERVER2)
	public void setReserver2(String reserver2) {
		this.set(FIELD_RESERVER2, reserver2);
	}

	@JsonIgnore
	public boolean isReserver2Dirty() {
		return this.contains(FIELD_RESERVER2);
	}

	/**
	 * 保留字段3
	 */
	// private String reserver3;
	public final static String FIELD_RESERVER3 = "reserver3";

	@JsonIgnore
	public String getReserver3() {
		Object objValue = this.get(FIELD_RESERVER3);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_RESERVER3)
	public void setReserver3(String reserver3) {
		this.set(FIELD_RESERVER3, reserver3);
	}

	@JsonIgnore
	public boolean isReserver3Dirty() {
		return this.contains(FIELD_RESERVER3);
	}

	/**
	 * 保留字段4
	 */
	// private String reserver4;
	public final static String FIELD_RESERVER4 = "reserver4";

	@JsonIgnore
	public String getReserver4() {
		Object objValue = this.get(FIELD_RESERVER4);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_RESERVER4)
	public void setReserver4(String reserver4) {
		this.set(FIELD_RESERVER4, reserver4);
	}

	@JsonIgnore
	public boolean isReserver4Dirty() {
		return this.contains(FIELD_RESERVER4);
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
	 * 日志分类
	 */
	public final static String FIELD_LOGCAT = "logcat";

	@JsonIgnore
	public String getLogCat() {
		Object objValue = this.get(FIELD_LOGCAT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGCAT)
	public void setLogCat(String logCat) {
		this.set(FIELD_LOGCAT, logCat);
	}

	@JsonIgnore
	public boolean isLogCatDirty() {
		return this.contains(FIELD_LOGCAT);
	}

	/**
	 * 日志类型
	 */
	public final static String FIELD_LOGTYPE = "logtype";

	@JsonIgnore
	public String getLogType() {
		Object objValue = this.get(FIELD_LOGTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGTYPE)
	public void setLogType(String logType) {
		this.set(FIELD_LOGTYPE, logType);
	}

	@JsonIgnore
	public boolean isLogTypeDirty() {
		return this.contains(FIELD_LOGTYPE);
	}

	/**
	 * 行为所有者
	 */
	public final static String FIELD_ACTIONOWNER = "actionowner";

	@JsonIgnore
	public String getActionOwner() {
		Object objValue = this.get(FIELD_ACTIONOWNER);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_ACTIONOWNER)
	public void setActionOwner(String actionOwner) {
		this.set(FIELD_ACTIONOWNER, actionOwner);
	}

	@JsonIgnore
	public boolean isActionOwnerDirty() {
		return this.contains(FIELD_ACTIONOWNER);
	}

	/**
	 * 行为
	 */
	public final static String FIELD_ACTION = "action";

	@JsonIgnore
	public String getAction() {
		Object objValue = this.get(FIELD_ACTION);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_ACTION)
	public void setAction(String action) {
		this.set(FIELD_ACTION, action);
	}

	@JsonIgnore
	public boolean isActionDirty() {
		return this.contains(FIELD_ACTION);
	}

	/**
	 * 操作持续时间
	 */
	public final static String FIELD_ACTIONDURATION = "actionduration";

	@JsonIgnore
	public Integer getActionDuration() {
		Object objValue = this.get(FIELD_ACTIONDURATION);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_ACTIONDURATION)
	public void setActionDuration(Integer actionDuration) {
		this.set(FIELD_ACTIONDURATION, actionDuration);
	}

	@JsonIgnore
	public boolean isActionDurationDirty() {
		return this.contains(FIELD_ACTIONDURATION);
	}

	/**
	 * 日志时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	public final static String FIELD_LOGTIME = "logtime";

	@JsonIgnore
	public Timestamp getLogTime() {
		Object objValue = this.get(FIELD_LOGTIME);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_LOGTIME)
	public void setLogTime(Timestamp createDate) {
		this.set(FIELD_LOGTIME, createDate);
	}

	@JsonIgnore
	public boolean isLogTimeDirty() {
		return this.contains(FIELD_LOGTIME);
	}

	/**
	 * 用户数据
	 *
	 */
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
	public void setUserData(String action) {
		this.set(FIELD_USERDATA, action);
	}

	@JsonIgnore
	public boolean isUserDataDirty() {
		return this.contains(FIELD_USERDATA);
	}

	/**
	 * 用户数据2
	 *
	 */
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
	public void setUserData2(String action) {
		this.set(FIELD_USERDATA2, action);
	}

	@JsonIgnore
	public boolean isUserData2Dirty() {
		return this.contains(FIELD_USERDATA2);
	}

	
	/**
	 * 控制台类型
	 *
	 */
	public final static String FIELD_CONSOLETYPE = "consoletype";

	@JsonIgnore
	public String getConsoleType() {
		Object objValue = this.get(FIELD_CONSOLETYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONSOLETYPE)
	public void setConsoleType(String action) {
		this.set(FIELD_CONSOLETYPE, action);
	}

	@JsonIgnore
	public boolean isConsoleTypeDirty() {
		return this.contains(FIELD_CONSOLETYPE);
	}
	

	/**
	 * 控制台标识
	 *
	 */
	public final static String FIELD_CONSOLEID = "consoleid";

	@JsonIgnore
	public String getConsoleId() {
		Object objValue = this.get(FIELD_CONSOLEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONSOLEID)
	public void setConsoleId(String consoleId) {
		this.set(FIELD_CONSOLEID, consoleId);
	}

	@JsonIgnore
	public boolean isConsoleIdDirty() {
		return this.contains(FIELD_CONSOLEID);
	}
	
	/**
	 * 控制台发送者
	 *
	 */
	public final static String FIELD_CONSOLESENDER = "consolesender";

	@JsonIgnore
	public String getConsoleSender() {
		Object objValue = this.get(FIELD_CONSOLESENDER);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONSOLESENDER)
	public void setConsoleSender(String consoleSender) {
		this.set(FIELD_CONSOLESENDER, consoleSender);
	}

	@JsonIgnore
	public boolean isConsoleSenderDirty() {
		return this.contains(FIELD_CONSOLESENDER);
	}
	
	/**
	 * 控制台信息
	 *
	 */
	public final static String FIELD_CONSOLEINFO = "consoleinfo";

	@JsonIgnore
	public String getConsoleInfo() {
		Object objValue = this.get(FIELD_CONSOLEINFO);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CONSOLEINFO)
	public void setConsoleInfo(String consoleInfo) {
		this.set(FIELD_CONSOLEINFO, consoleInfo);
	}

	@JsonIgnore
	public boolean isConsoleInfoDirty() {
		return this.contains(FIELD_CONSOLEINFO);
	}
	
	/**
	 * 数据
	 *
	 */
	public final static String FIELD_DATA = "data";

	@JsonIgnore
	public String getData() {
		Object objValue = this.get(FIELD_DATA);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATA)
	public void setData(String data) {
		this.set(FIELD_DATA, data);
	}

	@JsonIgnore
	public boolean isDataDirty() {
		return this.contains(FIELD_DATA);
	}
	
	
	
	

	@JsonIgnore
	public String getSrfkey() {
		return this.getLogId();
	}

	public void setSrfkey(String strValue) {
		this.setLogId(strValue);
	}

}
