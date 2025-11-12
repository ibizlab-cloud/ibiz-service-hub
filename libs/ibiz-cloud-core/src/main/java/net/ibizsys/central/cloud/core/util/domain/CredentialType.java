package net.ibizsys.central.cloud.core.util.domain;

public enum CredentialType {
    // 用于存储简单的加密字符串 Git access token
    SECRET_TEXT("SECRET_TEXT", "加密文本"),

    // 包含用户名和密码的一组凭据
    USERNAME_PASSWORD("USERNAME_PASSWORD", "用户名和密码"),

    // 上传并存储加密后的文件
    SECRET_FILE("SECRET_FILE", "加密文件"),

    // SSH认证所需的用户名和私钥，可选关联密语
    SSH_USERNAME_PRIVATE_KEY("SSH_USERNAME_PRIVATE_KEY", "SSH用户名与私钥"),

    // 存储数字证书以及可能相关的密码 PKCS#12 或 PEM 格式的文件
    CERTIFICATE("CERTIFICATE", "证书"),

    // 包括客户端私钥、客户端证书和服务器CA证书  X509
    CLIENT_CERTIFICATE("CLIENT_CERTIFICATE", "客户端证书"),

    // 第三方平台
    ACCESS_KEY("ACCESS_KEY", "第三方认证"),
	
    //承载令牌
	BEARER_TOKEN("BEARER_TOKEN", "承载令牌");
	

    
    private String value;
    private String text;


    CredentialType(String value , String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
    	return this.value;
    }
    
    public String getText() {
    	return this.text;
    }
    

}