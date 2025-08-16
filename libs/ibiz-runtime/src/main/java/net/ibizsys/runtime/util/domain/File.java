package net.ibizsys.runtime.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 模型 File 存储对象
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class File extends net.ibizsys.runtime.util.EntityBase {

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
	 * 摘要数据
	 */
	// private String digestCode;
	public final static String FIELD_DIGESTCODE = "digestcode";

	@JsonIgnore
	public String getDigestCode() {
		Object objValue = this.get(FIELD_DIGESTCODE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DIGESTCODE)
	public void setDigestCode(String digestCode) {
		this.set(FIELD_DIGESTCODE, digestCode);
	}

	@JsonIgnore
	public boolean isDigestCodeDirty() {
		return this.contains(FIELD_DIGESTCODE);
	}

	// /**
	// * 逻辑有效标志
	// */
	// //private Integer enable;
	// public final static String FIELD_ENABLE = "enable";
	//
	// @JsonIgnore
	// public Integer getEnable(){
	// Object objValue = this.get(FIELD_ENABLE);
	// if(objValue==null){
	// return null;
	// }
	// return (Integer)objValue;
	// }
	//
	// @JsonProperty(FIELD_ENABLE)
	// public void setEnable(Integer enable){
	// this.set(FIELD_ENABLE, enable);
	// }
	//
	// @JsonIgnore
	// public boolean isEnableDirty(){
	// return this.contains(FIELD_ENABLE);
	// }

	/**
	 * 原始文件名称
	 */
	// private String fileName2;
	public final static String FIELD_FILENAME2 = "filename2";

	@JsonIgnore
	public String getFileName2() {
		Object objValue = this.get(FIELD_FILENAME2);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILENAME2)
	public void setFileName2(String fileName2) {
		this.set(FIELD_FILENAME2, fileName2);
	}

	@JsonIgnore
	public boolean isFileName2Dirty() {
		return this.contains(FIELD_FILENAME2);
	}

	/**
	 * 文件大小
	 */
	// private Integer fileSize;
	public final static String FIELD_FILESIZE = "filesize";

	@JsonIgnore
	public Long getFileSize() {
		Object objValue = this.get(FIELD_FILESIZE);
		if (objValue == null) {
			return null;
		}
		return (Long) objValue;
	}

	@JsonProperty(FIELD_FILESIZE)
	public void setFileSize(Long fileSize) {
		this.set(FIELD_FILESIZE, fileSize);
	}

	@JsonIgnore
	public boolean isFileSizeDirty() {
		return this.contains(FIELD_FILESIZE);
	}

	/**
	 * 文件标识
	 */
	// private String fileId;
	// public final static String FIELD_FILEID = "file_id";
	public final static String FIELD_FILEID = "fileid";
	
	public final static String FIELD_ID = "id";

	@JsonIgnore
	public String getFileId() {
		Object objValue = this.get(FIELD_FILEID);
		if (objValue == null) {
			objValue = this.get(FIELD_ID);
		}
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEID)
	public void setFileId(String fileId) {
		this.set(FIELD_FILEID, fileId);
	}

	@JsonIgnore
	public boolean isFileIdDirty() {
		return this.contains(FIELD_FILEID);
	}

	/**
	 * 文件名称
	 */
	// private String fileName;
	// public final static String FIELD_FILENAME = "file_name";
	public final static String FIELD_FILENAME = "filename";
	public final static String FIELD_NAME = "name";
	@JsonIgnore
	public String getFileName() {
		Object objValue = this.get(FIELD_FILENAME);
		if (objValue == null) {
			objValue = this.get(FIELD_NAME);
		}
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILENAME)
	public void setFileName(String fileName) {
		this.set(FIELD_FILENAME, fileName);
	}

	@JsonIgnore
	public boolean isFileNameDirty() {
		return this.contains(FIELD_FILENAME);
	}

	/**
	 * 指定目录
	 */
	// private String folder;
	public final static String FIELD_FOLDER = "folder";

	@JsonIgnore
	public String getFolder() {
		Object objValue = this.get(FIELD_FOLDER);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FOLDER)
	public void setFolder(String folder) {
		this.set(FIELD_FOLDER, folder);
	}

	@JsonIgnore
	public boolean isFolderDirty() {
		return this.contains(FIELD_FOLDER);
	}

	/**
	 * 存储路径
	 */
	// private String localPath;
	public final static String FIELD_LOCALPATH = "localpath";

	@JsonIgnore
	public String getLocalPath() {
		Object objValue = this.get(FIELD_LOCALPATH);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOCALPATH)
	public void setLocalPath(String localPath) {
		this.set(FIELD_LOCALPATH, localPath);
	}

	@JsonIgnore
	public boolean isLocalPathDirty() {
		return this.contains(FIELD_LOCALPATH);
	}

	/**
	 * 存储路径2
	 */
	// private String localPath2;
	public final static String FIELD_LOCALPATH2 = "localpath2";

	@JsonIgnore
	public String getLocalPath2() {
		Object objValue = this.get(FIELD_LOCALPATH2);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_LOCALPATH2)
	public void setLocalPath2(String localPath2) {
		this.set(FIELD_LOCALPATH2, localPath2);
	}

	@JsonIgnore
	public boolean isLocalPath2Dirty() {
		return this.contains(FIELD_LOCALPATH2);
	}

	/**
	 * 备注
	 */
	// private String memo;
	public final static String FIELD_MEMO = "memo";

	@JsonIgnore
	public String getMemo() {
		Object objValue = this.get(FIELD_MEMO);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_MEMO)
	public void setMemo(String memo) {
		this.set(FIELD_MEMO, memo);
	}

	@JsonIgnore
	public boolean isMemoDirty() {
		return this.contains(FIELD_MEMO);
	}

	/**
	 * 所有者标识
	 */
	// private String ownerId;
	public final static String FIELD_OWNERID = "ownerid";

	@JsonIgnore
	public String getOwnerId() {
		Object objValue = this.get(FIELD_OWNERID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OWNERID)
	public void setOwnerId(String ownerId) {
		this.set(FIELD_OWNERID, ownerId);
	}

	@JsonIgnore
	public boolean isOwnerIdDirty() {
		return this.contains(FIELD_OWNERID);
	}

	/**
	 * 所有者类型
	 */
	// private String ownerType;
	public final static String FIELD_OWNERTYPE = "ownertype";

	@JsonIgnore
	public String getOwnerType() {
		Object objValue = this.get(FIELD_OWNERTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OWNERTYPE)
	public void setOwnerType(String ownerType) {
		this.set(FIELD_OWNERTYPE, ownerType);
	}

	@JsonIgnore
	public boolean isOwnerTypeDirty() {
		return this.contains(FIELD_OWNERTYPE);
	}

	/**
	 * 图片高度
	 */
	// private Integer picHeight;
	public final static String FIELD_PICHEIGHT = "picheight";

	@JsonIgnore
	public Integer getPicHeight() {
		Object objValue = this.get(FIELD_PICHEIGHT);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_PICHEIGHT)
	public void setPicHeight(Integer picHeight) {
		this.set(FIELD_PICHEIGHT, picHeight);
	}

	@JsonIgnore
	public boolean isPicHeightDirty() {
		return this.contains(FIELD_PICHEIGHT);
	}

	/**
	 * 图片宽度
	 */
	// private Integer picWidth;
	public final static String FIELD_PICWIDTH = "picwidth";

	@JsonIgnore
	public Integer getPicWidth() {
		Object objValue = this.get(FIELD_PICWIDTH);
		if (objValue == null) {
			return null;
		}
		return (Integer) objValue;
	}

	@JsonProperty(FIELD_PICWIDTH)
	public void setPicWidth(Integer picWidth) {
		this.set(FIELD_PICWIDTH, picWidth);
	}

	@JsonIgnore
	public boolean isPicWidthDirty() {
		return this.contains(FIELD_PICWIDTH);
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
	 * 文件类型
	 */
	public final static String FIELD_FILETYPE = "filetype";

	@JsonIgnore
	public String getFileType() {
		Object objValue = this.get(FIELD_FILETYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILETYPE)
	public void setFileType(String updateMan) {
		this.set(FIELD_FILETYPE, updateMan);
	}

	@JsonIgnore
	public boolean isFileTypeDirty() {
		return this.contains(FIELD_FILETYPE);
	}
	
	/**
	 * Url路径
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
	public void setUrl(String updateMan) {
		this.set(FIELD_URL, updateMan);
	}

	@JsonIgnore
	public boolean isUrlDirty() {
		return this.contains(FIELD_URL);
	}
	
	/**
	 * OSS标识
	 */
	public final static String FIELD_OSSID = "ossid";

	@JsonIgnore
	public String getOSSId() {
		Object objValue = this.get(FIELD_OSSID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_OSSID)
	public void setOSSId(String updateMan) {
		this.set(FIELD_OSSID, updateMan);
	}

	@JsonIgnore
	public boolean isOSSIdDirty() {
		return this.contains(FIELD_OSSID);
	}
	
	
	/**
	 * 文件后缀
	 */
	public final static String FIELD_FILEEXT = "fileext";

	@JsonIgnore
	public String getFileExt() {
		Object objValue = this.get(FIELD_FILEEXT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILEEXT)
	public void setFileExt(String fileExt) {
		this.set(FIELD_FILEEXT, fileExt);
	}

	@JsonIgnore
	public boolean isFileExtDirty() {
		return this.contains(FIELD_FILEEXT);
	}

	
	

	@JsonIgnore
	public String getSrfkey() {
		return this.getFileId();
	}

	public void setSrfkey(String strValue) {
		this.setFileId(strValue);
	}

}
