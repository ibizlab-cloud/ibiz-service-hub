package net.ibizsys.central.cloud.core.util.domain;

/**
 * 代码表 系统扩展模型应用状态 相关信息
 */
public enum V2SystemExtensionApplyState {

	NOT_APPLY(0,"未应用")
    ,

    APPLIED(1,"已应用")
    ,

    APPLY_FAILED(2,"应用失败")
    ;
    public final String text;

    public final int value;

    private V2SystemExtensionApplyState(int value, String text){
        this.value = value;
        this.text = text;
    }
}
