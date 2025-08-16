package net.ibizsys.central.cloud.core.util.domain;

/**
 *交谈消息角色
 * @author lionlau
 *
 */
public enum ChatMessageRole {

	SYSTEM("SYSTEM","系统"),
	USER("USER","用户"),
	ASSISTANT("ASSISTANT","助手"),
	TOOL("TOOL","工具");
	
     private String value;
     private String text;


     ChatMessageRole(String value , String text) {
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
