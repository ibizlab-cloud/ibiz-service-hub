package net.ibizsys.central.cloud.oss.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.runtime.util.domain.File;

/**
 * 文件项 存储对象（兼容旧版）
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileItem extends File {

	/**
	 * 预览类型：Excel，预览信息将提供一个携带基本表格信息的两维数据
	 */
	public final static String PREVIEWTYPE_EXCEL = "excel"; 
	
	/**
	 * 预览类型
	 */
	public final static String FIELD_PREVIEWTYPE = "previewtype";
	
	
	

	@JsonIgnore
	public String getPreviewType() {
		Object objValue = this.get(FIELD_PREVIEWTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_PREVIEWTYPE)
	public void setPreviewType(String updateMan) {
		this.set(FIELD_PREVIEWTYPE, updateMan);
	}

	@JsonIgnore
	public boolean isPreviewTypeDirty() {
		return this.contains(FIELD_PREVIEWTYPE);
	}
	
	
	
	/**
	 * 预览信息
	 */
	public final static String FIELD_PREVIEWINFO = "previewinfo";

	@JsonIgnore
	public String getPreviewInfo() {
		Object objValue = this.get(FIELD_PREVIEWINFO);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_PREVIEWINFO)
	public void setPreviewInfo(String updateMan) {
		this.set(FIELD_PREVIEWINFO, updateMan);
	}

	@JsonIgnore
	public boolean isPreviewInfoDirty() {
		return this.contains(FIELD_PREVIEWINFO);
	}
	
	/**
	 * 下载凭证
	 */
	public final static String FIELD_TICKET = "ticket";
	
	@JsonIgnore
	public DownloadTicket getTicket() {
		Object objValue = this.get(FIELD_TICKET);
		if (objValue == null) {
			return null;
		}
		return (DownloadTicket) objValue;
	}

	@JsonProperty(FIELD_TICKET)
	public void setTicket(DownloadTicket downloadTicket) {
		this.set(FIELD_TICKET, downloadTicket);
	}

	@JsonIgnore
	public boolean isTicketDirty() {
		return this.contains(FIELD_TICKET);
	}
	
	
	
	@JsonProperty("id")
	public String getId() {
		return super.getFileId();
	}

	@JsonProperty("name")
	public String getName() {
		return super.getFileName();
	}
	
	@JsonProperty("size")
	public Long getSize() {
		return super.getFileSize();
	}
	
	@JsonProperty("ext")
	public String getExt() {
		return super.getFileExt();
	}
	
	
}
