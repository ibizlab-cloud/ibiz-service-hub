package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemVersionType {

	CORE("CORE","核心版本")
    ,
    MERGE("MERGE","合并版本")
    ;
    public final String text;
    public final String value;
    private V2SystemVersionType(String value, String text){
        this.value = value;
        this.text = text;
    }
}
