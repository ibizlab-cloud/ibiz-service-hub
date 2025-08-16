package net.ibizsys.central.cloud.core.util.domain;

public enum V2InternalMessageOwnerType {

	PERSONAL("PERSONAL","个人")
    ,
    SYSTEM("SYSTEM","系统全局")
    ;
    public final String text;
    public final String value;
    private V2InternalMessageOwnerType(String value, String text){
        this.value = value;
        this.text = text;
    }
}
