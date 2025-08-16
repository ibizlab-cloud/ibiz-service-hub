package net.ibizsys.central.cloud.core.util.domain;

public enum TodoState {

	ACTIVE("ACTIVE","待处理"),
    COMPLETED("COMPLETED","已处理"),
    PAUSED("PAUSED","挂起"),
    CANCELED("CANCELED","已取消");

    private String value;
    private String text;

    TodoState(String value , String text) {
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
