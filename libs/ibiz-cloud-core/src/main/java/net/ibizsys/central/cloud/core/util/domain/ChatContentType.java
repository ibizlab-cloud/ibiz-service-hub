package net.ibizsys.central.cloud.core.util.domain;

/**
 *交谈内容类型
 * @author lionlau
 *
 */
public enum ChatContentType {

	IMAGE_URL("image_url","图片路径"),
	TEXT("text","文本");
	
     private String value;
     private String text;


     ChatContentType(String value , String text) {
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
