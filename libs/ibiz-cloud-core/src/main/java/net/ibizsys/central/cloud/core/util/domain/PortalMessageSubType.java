package net.ibizsys.central.cloud.core.util.domain;

/**
 * 门户通知子类型类型
 * @author lionlau
 *
 */
public enum PortalMessageSubType {

	 COMMAND_MARKOPENDATA("MARKOPENDATA","标注打开数据"),
	
	 COMMAND_ASYNCACTION("ASYNCACTION","异步作业"),
	
	 COMMAND_INTERNALMESSAGE("INTERNALMESSAGE","内部消息"),
	
	 COMMAND_COLLABORATE("COLLABORATE","协同操作"),
	
	 COMMAND_ADDINCHANGED("ADDINCHANGED","系统插件变更");
	

     private String value;
     private String text;

    PortalMessageSubType(String value , String text) {
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
