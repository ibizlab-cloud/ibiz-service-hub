package net.ibizsys.central.cloud.core.util.domain;

/**
 *交谈消息类型
 * @author lionlau
 *
 */
public enum ChatMessageType {

	SYSTEM("SYSTEM","系统");
	
     private String value;
     private String text;


     ChatMessageType(String value , String text) {
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
