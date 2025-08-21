package net.ibizsys.central.cloud.oss.core.util.domain;

public enum DownloadTicketMode {
	DISABLED("disabled","禁用"),
	EXCLUSION("exclusion","启用凭证验证，但对指定文件夹豁免"), //启用凭证验证，但对指定内容（如特定文件、用户组）豁免验证
	INCLUSION("inclusion","启用凭证验证，仅对指定文件夹控制"); //启用凭证验证，且仅针对指定内容进行控制（即仅允许凭证有效的下载）

    private String value;
    private String text;


    DownloadTicketMode(String value , String text) {
        this.value=value;
        this.text = text;
    }

    public String getValue() {
    	return this.value;
    }
    
    public String getText() {
    	return this.text;
    }
}
