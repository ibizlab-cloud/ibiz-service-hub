package net.ibizsys.central.cloud.core.util.domain;

public enum V2SystemExtensionScopeType {

	SYSTEM("SYSTEM","系统")
    ,
    MODELGROUP("MODELGROUP","模型组")
    ,
    MODULE("MODULE","模块")
    ,
    DATAENTITY("DATAENTITY","实体")
    ,
    WORKFLOW("WORKFLOW","工作流")
    ,
    BICUBE("BICUBE","智能立方体")
    ,
    DATA("DATA","数据")
    ;
    public final String text;
    public final String value;
    private V2SystemExtensionScopeType(String value, String text){
        this.value = value;
        this.text = text;
    }
}
