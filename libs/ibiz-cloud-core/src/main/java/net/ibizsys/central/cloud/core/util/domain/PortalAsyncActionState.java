package net.ibizsys.central.cloud.core.util.domain;


/**
 * 门户异步操作状态
 * @author lionlau
 *
 */
public enum PortalAsyncActionState {
   
	NOTSTARTED(10,"未开始"),
    EXECUTING(20,"执行中"),
    FINISHED(30,"已执行"),
    FAILED(40,"执行失败");

    private int value;
    private String text;

    PortalAsyncActionState(int value , String text) {
        this.value=value;
        this.text = text;
    }

    public int getValue() {
    	return this.value;
    }
    
    public String getText() {
    	return this.text;
    }

}
