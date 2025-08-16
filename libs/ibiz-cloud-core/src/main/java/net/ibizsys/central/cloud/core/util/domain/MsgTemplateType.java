package net.ibizsys.central.cloud.core.util.domain;

/**
 * 代码表[模板类型（Cloud）]
 */
public enum MsgTemplateType {
	
    SMS("SMS","短信"),
    EMAIL("EMAIL","邮件"),
    MSG("MSG","即时消息");

    private String value;
    private String text;

    MsgTemplateType(String value , String text) {
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
