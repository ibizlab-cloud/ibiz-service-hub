package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 模型 DataSyncOut 存储对象
 */
public class DataSyncOut extends net.ibizsys.runtime.util.EntityBase {

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
	 * 数据
	 */
	// private String data;
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

	/**
	 * 数据主键
	 */
	// private String dataKey;
	public final static String FIELD_DATAKEY = "datakey";

	@JsonIgnore
	public String getDataKey() {
		Object objValue = this.get(FIELD_DATAKEY);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATAKEY)
	public void setDataKey(String dataKey) {
		this.set(FIELD_DATAKEY, dataKey);
	}

	@JsonIgnore
	public boolean isDataKeyDirty() {
		return this.contains(FIELD_DATAKEY);
	}

	/**
	 * 数据同步发送队列标识
	 */
	// private String dataSyncOutId;
	public final static String FIELD_DATASYNCOUTID = "datasyncoutid";

	@JsonIgnore
	public String getDataSyncOutId() {
		Object objValue = this.get(FIELD_DATASYNCOUTID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATASYNCOUTID)
	public void setDataSyncOutId(String dataSyncOutId) {
		this.set(FIELD_DATASYNCOUTID, dataSyncOutId);
	}

	@JsonIgnore
	public boolean isDataSyncOutIdDirty() {
		return this.contains(FIELD_DATASYNCOUTID);
	}

	/**
	 * 发送队列名称
	 */
	// private String dataSyncOutName;
	public final static String FIELD_DATASYNCOUTNAME = "datasyncoutname";

	@JsonIgnore
	public String getDataSyncOutName() {
		Object objValue = this.get(FIELD_DATASYNCOUTNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATASYNCOUTNAME)
	public void setDataSyncOutName(String dataSyncOutName) {
		this.set(FIELD_DATASYNCOUTNAME, dataSyncOutName);
	}

	@JsonIgnore
	public boolean isDataSyncOutNameDirty() {
		return this.contains(FIELD_DATASYNCOUTNAME);
	}

	/**
	 * 数据实体
	 */
	// private String dEId;
	public final static String FIELD_DEID = "deid";

	@JsonIgnore
	public String getDEId() {
		Object objValue = this.get(FIELD_DEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DEID)
	public void setDEId(String dEId) {
		this.set(FIELD_DEID, dEId);
	}

	@JsonIgnore
	public boolean isDEIdDirty() {
		return this.contains(FIELD_DEID);
	}

	/**
	 * 数据实体
	 */
	// private String dEName;
	public final static String FIELD_DENAME = "dename";

	@JsonIgnore
	public String getDEName() {
		Object objValue = this.get(FIELD_DENAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DENAME)
	public void setDEName(String dEName) {
		this.set(FIELD_DENAME, dEName);
	}

	@JsonIgnore
	public boolean isDENameDirty() {
		return this.contains(FIELD_DENAME);
	}

	/**
	 * 事件类型
	 */
	// private Integer eventType;
	public final static String FIELD_EVENTTYPE = "eventtype";

	@JsonIgnore
	public Integer getEventType() {
		Object objValue = this.get(FIELD_EVENTTYPE);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_EVENTTYPE)
	public void setEventType(Integer eventType) {
		this.set(FIELD_EVENTTYPE, eventType);
	}

	@JsonIgnore
	public boolean isEventTypeDirty() {
		return this.contains(FIELD_EVENTTYPE);
	}

	/**
	 * 同步文件清单
	 */
	// private String fileList;
	public final static String FIELD_FILELIST = "filelist";

	@JsonIgnore
	public String getFileList() {
		Object objValue = this.get(FIELD_FILELIST);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILELIST)
	public void setFileList(String fileList) {
		this.set(FIELD_FILELIST, fileList);
	}

	@JsonIgnore
	public boolean isFileListDirty() {
		return this.contains(FIELD_FILELIST);
	}

	/**
	 * 逻辑数据
	 */
	// private String logicData;
	public final static String FIELD_LOGICDATA = "logicdata";

	@JsonIgnore
	public String getLogicData() {
		Object objValue = this.get(FIELD_LOGICDATA);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOGICDATA)
	public void setLogicData(String logicData) {
		this.set(FIELD_LOGICDATA, logicData);
	}

	@JsonIgnore
	public boolean isLogicDataDirty() {
		return this.contains(FIELD_LOGICDATA);
	}

	/**
	 * 数据输出代理
	 */
	// private String syncAgent;
	public final static String FIELD_SYNCAGENT = "syncagent";

	@JsonIgnore
	public String getSyncAgent() {
		Object objValue = this.get(FIELD_SYNCAGENT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_SYNCAGENT)
	public void setSyncAgent(String syncAgent) {
		this.set(FIELD_SYNCAGENT, syncAgent);
	}

	@JsonIgnore
	public boolean isSyncAgentDirty() {
		return this.contains(FIELD_SYNCAGENT);
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
		return this.getDataSyncOutId();
	}

	public void setSrfkey(String strValue) {
		this.setDataSyncOutId(strValue);
	}

}
