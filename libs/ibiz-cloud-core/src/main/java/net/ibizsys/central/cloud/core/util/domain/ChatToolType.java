package net.ibizsys.central.cloud.core.util.domain;

/**
 *聊天工具类型
 * @author lionlau
 *
 */
public enum ChatToolType {

	FUNCTION("function","函数");
	
     private String value;
     private String text;


     ChatToolType(String value , String text) {
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
