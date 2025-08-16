package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemType {

	CORE("CORE","核心系统")
    ,
    EXTENSION("EXTENSION","扩展功能")
    ,
    BASE("BASE","基础功能")
    ,
    COMPONENT("COMPONENT","组件")
    ;
    public final String text;
    public final String value;
    private V2SystemType(String value, String text){
        this.value = value;
        this.text = text;
    }
}
