package net.ibizsys.central.cloud.core.util.domain;

/**
 * 门户通知类型
 * @author lionlau
 *
 */
public enum PortalMessageType {

	 CONSOLE("CONSOLE","Console信息"),
     COMMAND("COMMAND","命令");

     private String value;
     private String text;


     PortalMessageType(String value , String text) {
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
