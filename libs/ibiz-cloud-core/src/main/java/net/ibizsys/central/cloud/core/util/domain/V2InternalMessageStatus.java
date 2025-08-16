package net.ibizsys.central.cloud.core.util.domain;

public enum V2InternalMessageStatus {

	 SENT("SENT","已发送")
     ,
     RECEIVED("RECEIVED","已接收")
     ,
     READ("READ","已阅读")
     ,
     NOT_SENT("NOT_SENT","未发送")
     ,
     SEND_FAILED("SEND_FAILED","发送失败")
     ,
     REPLIED("REPLIED","已回复")
     ,
     DELETED("DELETED","已删除")
     ;
     public final String text;
     public final String value;
     
     private V2InternalMessageStatus(String value, String text){
         this.value = value;
         this.text = text;
     }
}
