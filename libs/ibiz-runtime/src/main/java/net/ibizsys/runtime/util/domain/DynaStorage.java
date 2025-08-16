package net.ibizsys.runtime.util.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 模型 DynaStorage 存储对象
 */
public class DynaStorage extends net.ibizsys.runtime.util.EntityBase {

	/**
	 * 二进制流
	 */
	// private byte[] blobVal;
	public final static String FIELD_BLOBVAL = "blobval";

	@JsonIgnore
	public byte[] getBlobVal() {
		Object objValue = this.get(FIELD_BLOBVAL);
		if (objValue == null) {
			return null;
		}
		return (byte[]) objValue;
	}

	@JsonProperty(FIELD_BLOBVAL)
	public void setBlobVal(byte[] blobVal) {
		this.set(FIELD_BLOBVAL, blobVal);
	}

	@JsonIgnore
	public boolean isBlobValDirty() {
		return this.contains(FIELD_BLOBVAL);
	}

	/**
	 * 长文本
	 */
	// private String clobVal;
	public final static String FIELD_CLOBVAL = "clobval";

	@JsonIgnore
	public String getClobVal() {
		Object objValue = this.get(FIELD_CLOBVAL);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_CLOBVAL)
	public void setClobVal(String clobVal) {
		this.set(FIELD_CLOBVAL, clobVal);
	}

	@JsonIgnore
	public boolean isClobValDirty() {
		return this.contains(FIELD_CLOBVAL);
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
	 * 时间值
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
	// private Timestamp dateVal;
	public final static String FIELD_DATEVAL = "dateval";

	@JsonIgnore
	public Timestamp getDateVal() {
		Object objValue = this.get(FIELD_DATEVAL);
		if (objValue == null) {
			return null;
		}
		return (Timestamp) objValue;
	}

	@JsonProperty(FIELD_DATEVAL)
	public void setDateVal(Timestamp dateVal) {
		this.set(FIELD_DATEVAL, dateVal);
	}

	@JsonIgnore
	public boolean isDateValDirty() {
		return this.contains(FIELD_DATEVAL);
	}

	/**
	 * 动态存储对象标识
	 */
	// private String dynaStorageId;
	public final static String FIELD_DYNASTORAGEID = "dynastorageid";

	@JsonIgnore
	public String getDynaStorageId() {
		Object objValue = this.get(FIELD_DYNASTORAGEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DYNASTORAGEID)
	public void setDynaStorageId(String dynaStorageId) {
		this.set(FIELD_DYNASTORAGEID, dynaStorageId);
	}

	@JsonIgnore
	public boolean isDynaStorageIdDirty() {
		return this.contains(FIELD_DYNASTORAGEID);
	}

	/**
	 * 动态存储对象名称
	 */
	// private String dynaStorageName;
	public final static String FIELD_DYNASTORAGENAME = "dynastoragename";

	@JsonIgnore
	public String getDynaStorageName() {
		Object objValue = this.get(FIELD_DYNASTORAGENAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DYNASTORAGENAME)
	public void setDynaStorageName(String dynaStorageName) {
		this.set(FIELD_DYNASTORAGENAME, dynaStorageName);
	}

	@JsonIgnore
	public boolean isDynaStorageNameDirty() {
		return this.contains(FIELD_DYNASTORAGENAME);
	}

	/**
	 * 整形值
	 */
	// private Long intVal;
	public final static String FIELD_INTVAL = "intval";

	@JsonIgnore
	public Long getIntVal() {
		Object objValue = this.get(FIELD_INTVAL);
		if (objValue == null) {
			return null;
		}
		return (Long) objValue;
	}

	@JsonProperty(FIELD_INTVAL)
	public void setIntVal(Long intVal) {
		this.set(FIELD_INTVAL, intVal);
	}

	@JsonIgnore
	public boolean isIntValDirty() {
		return this.contains(FIELD_INTVAL);
	}

	/**
	 * 大数值
	 */
	// private BigDecimal numVal;
	public final static String FIELD_NUMVAL = "numval";

	@JsonIgnore
	public BigDecimal getNumVal() {
		Object objValue = this.get(FIELD_NUMVAL);
		if (objValue == null) {
			return null;
		}
		return (BigDecimal) objValue;
	}

	@JsonProperty(FIELD_NUMVAL)
	public void setNumVal(BigDecimal numVal) {
		this.set(FIELD_NUMVAL, numVal);
	}

	@JsonIgnore
	public boolean isNumValDirty() {
		return this.contains(FIELD_NUMVAL);
	}

	/**
	 * 对象编号
	 */
	// private String objectId;
	public final static String FIELD_OBJECTID = "objectid";

	@JsonIgnore
	public String getObjectId() {
		Object objValue = this.get(FIELD_OBJECTID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OBJECTID)
	public void setObjectId(String objectId) {
		this.set(FIELD_OBJECTID, objectId);
	}

	@JsonIgnore
	public boolean isObjectIdDirty() {
		return this.contains(FIELD_OBJECTID);
	}

	/**
	 * 对象类型
	 */
	// private String objectType;
	public final static String FIELD_OBJECTTYPE = "objecttype";

	@JsonIgnore
	public String getObjectType() {
		Object objValue = this.get(FIELD_OBJECTTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OBJECTTYPE)
	public void setObjectType(String objectType) {
		this.set(FIELD_OBJECTTYPE, objectType);
	}

	@JsonIgnore
	public boolean isObjectTypeDirty() {
		return this.contains(FIELD_OBJECTTYPE);
	}

	/**
	 * 文本值
	 */
	// private String textVal;
	public final static String FIELD_TEXTVAL = "textval";

	@JsonIgnore
	public String getTextVal() {
		Object objValue = this.get(FIELD_TEXTVAL);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_TEXTVAL)
	public void setTextVal(String textVal) {
		this.set(FIELD_TEXTVAL, textVal);
	}

	@JsonIgnore
	public boolean isTextValDirty() {
		return this.contains(FIELD_TEXTVAL);
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

	@JsonIgnore
	public String getSrfkey() {
		return this.getDynaStorageId();
	}

	public void setSrfkey(String strValue) {
		this.setDynaStorageId(strValue);
	}

}
