package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 模型 DataAuditDetail 存储对象
 */
public class DataAuditDetail extends net.ibizsys.runtime.util.EntityBase {

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
	 * 数据审计明细标识
	 */
	// private String dataAuditDetailId;
	public final static String FIELD_DATAAUDITDETAILID = "dataauditdetailid";

	@JsonIgnore
	public String getDataAuditDetailId() {
		Object objValue = this.get(FIELD_DATAAUDITDETAILID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATAAUDITDETAILID)
	public void setDataAuditDetailId(String dataAuditDetailId) {
		this.set(FIELD_DATAAUDITDETAILID, dataAuditDetailId);
	}

	@JsonIgnore
	public boolean isDataAuditDetailIdDirty() {
		return this.contains(FIELD_DATAAUDITDETAILID);
	}

	/**
	 * 属性
	 */
	// private String dataAuditDetailName;
	public final static String FIELD_DATAAUDITDETAILNAME = "dataauditdetailname";

	@JsonIgnore
	public String getDataAuditDetailName() {
		Object objValue = this.get(FIELD_DATAAUDITDETAILNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATAAUDITDETAILNAME)
	public void setDataAuditDetailName(String dataAuditDetailName) {
		this.set(FIELD_DATAAUDITDETAILNAME, dataAuditDetailName);
	}

	@JsonIgnore
	public boolean isDataAuditDetailNameDirty() {
		return this.contains(FIELD_DATAAUDITDETAILNAME);
	}


	
	
	/**
	 * 数据审计
	 */
	// private String dataAuditId;
	public final static String FIELD_DATAAUDITID = "dataauditid";

	@JsonIgnore
	public String getDataAuditId() {
		Object objValue = this.get(FIELD_DATAAUDITID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATAAUDITID)
	public void setDataAuditId(String dataAuditId) {
		this.set(FIELD_DATAAUDITID, dataAuditId);
	}

	@JsonIgnore
	public boolean isDataAuditIdDirty() {
		return this.contains(FIELD_DATAAUDITID);
	}

	/**
	 * 数据审计
	 */
	// private String dataAuditName;
	public final static String FIELD_DATAAUDITNAME = "dataauditname";

	@JsonIgnore
	public String getDataAuditName() {
		Object objValue = this.get(FIELD_DATAAUDITNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATAAUDITNAME)
	public void setDataAuditName(String dataAuditName) {
		this.set(FIELD_DATAAUDITNAME, dataAuditName);
	}

	@JsonIgnore
	public boolean isDataAuditNameDirty() {
		return this.contains(FIELD_DATAAUDITNAME);
	}

	/**
	 * 新值（文本）
	 */
	// private String newText;
	public final static String FIELD_NEWTEXT = "newtext";

	@JsonIgnore
	public String getNewText() {
		Object objValue = this.get(FIELD_NEWTEXT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_NEWTEXT)
	public void setNewText(String newText) {
		this.set(FIELD_NEWTEXT, newText);
	}

	@JsonIgnore
	public boolean isNewTextDirty() {
		return this.contains(FIELD_NEWTEXT);
	}

	/**
	 * 新值
	 */
	// private String newValue;
	public final static String FIELD_NEWVALUE = "newvalue";

	@JsonIgnore
	public String getNewValue() {
		Object objValue = this.get(FIELD_NEWVALUE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_NEWVALUE)
	public void setNewValue(String newValue) {
		this.set(FIELD_NEWVALUE, newValue);
	}

	@JsonIgnore
	public boolean isNewValueDirty() {
		return this.contains(FIELD_NEWVALUE);
	}

	/**
	 * 原值（文本）
	 */
	// private String oldText;
	public final static String FIELD_OLDTEXT = "oldtext";

	@JsonIgnore
	public String getOldText() {
		Object objValue = this.get(FIELD_OLDTEXT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OLDTEXT)
	public void setOldText(String oldText) {
		this.set(FIELD_OLDTEXT, oldText);
	}

	@JsonIgnore
	public boolean isOldTextDirty() {
		return this.contains(FIELD_OLDTEXT);
	}

	/**
	 * 原值
	 */
	// private String oldValue;
	public final static String FIELD_OLDVALUE = "oldvalue";

	@JsonIgnore
	public String getOldValue() {
		Object objValue = this.get(FIELD_OLDVALUE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OLDVALUE)
	public void setOldValue(String oldValue) {
		this.set(FIELD_OLDVALUE, oldValue);
	}

	@JsonIgnore
	public boolean isOldValueDirty() {
		return this.contains(FIELD_OLDVALUE);
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
	 * 逻辑名称
	 */
	// private String logicName;
	public final static String FIELD_LOGICNAME = "logicname";

	@JsonIgnore
	public String getLogicName() {
		Object objValue = this.get(FIELD_LOGICNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGICNAME)
	public void setLogicName(String logicName) {
		this.set(FIELD_LOGICNAME, logicName);
	}

	@JsonIgnore
	public boolean isLogicNameDirty() {
		return this.contains(FIELD_LOGICNAME);
	}
	
	

	@JsonIgnore
	public String getSrfkey() {
		return this.getDataAuditDetailId();
	}

	public void setSrfkey(String strValue) {
		this.setDataAuditDetailId(strValue);
	}

}
