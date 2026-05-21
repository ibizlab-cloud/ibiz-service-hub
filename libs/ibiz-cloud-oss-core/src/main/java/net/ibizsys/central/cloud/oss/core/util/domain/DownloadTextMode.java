package net.ibizsys.central.cloud.oss.core.util.domain;

public enum DownloadTextMode {
	DISABLED("disabled","禁用"),
	EXCLUSION("exclusion","启用下载文本，排除指定文件后缀"), 
	INCLUSION("inclusion","启用下载文本，支持指定文件后缀"); 

    private String value;
    private String text;


    DownloadTextMode(String value , String text) {
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
