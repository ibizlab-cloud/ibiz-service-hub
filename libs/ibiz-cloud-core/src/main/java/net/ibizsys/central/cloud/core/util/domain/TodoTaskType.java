package net.ibizsys.central.cloud.core.util.domain;


public enum TodoTaskType{
	
	WFTASK("WFTASK","工作流任务");

    private String value;
    private String text;

    TodoTaskType(String value , String text) {
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
