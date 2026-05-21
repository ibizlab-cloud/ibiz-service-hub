package net.ibizsys.central.cloud.core.util.domain;


/**
 * 门户异步行为类型
 * @author lionlau
 *
 */
public enum PortalAsyncActionType {
   
	ASYNCCHATCOMPLETION("异步交互补全");

    private String text;

    PortalAsyncActionType(String text) {
        this.text = text;
    }

    public String getValue() {
    	return this.name();
    }
    
    public String getText() {
    	return this.text;
    }

}
