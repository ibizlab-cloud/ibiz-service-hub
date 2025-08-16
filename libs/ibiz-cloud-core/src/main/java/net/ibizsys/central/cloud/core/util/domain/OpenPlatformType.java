package net.ibizsys.central.cloud.core.util.domain;

/**
 * 开放平台类型
 * @author lionlau
 *
 */
public enum OpenPlatformType {

	 ALIYUN("aliyun","阿里云"),
     WECHAT("wechat","微信开放平台"),
     QQ("qq","QQ互联"),
     DINGTALK("dingtalk","钉钉开放平台"),
     WXWORK("wxwork","企业微信");

     private String value;
     private String text;


     OpenPlatformType(String value , String text) {
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
