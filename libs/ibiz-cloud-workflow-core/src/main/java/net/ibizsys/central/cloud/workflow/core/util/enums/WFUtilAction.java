package net.ibizsys.central.cloud.workflow.core.util.enums;

/**
 * 工作流辅助功能
 */
public enum WFUtilAction {

    SENDBACK("sendback","退回"),
    WITHDRAW("withdraw","撤回"),
    SUPPLYINFO("supplyinfo","补充信息"),
    ADDSTEPBEFORE("addstepbefore","前加签"),
    ADDSTEPAFTER("addstepafter","后加签"),
    TAKEADVICE("takeadvice","征求意见"),
    SENDCOPY("sendcopy","抄送"),
    REASSIGN("reassign","转办"),
    FINISH("finish","完成"),
    JUMP("jump","跳转"),
    TIMEOUT("timeout","超时"),
    CANCEL("cancel","取消流程"),
	RESTART("restart","重启流程");
	 
    WFUtilAction(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String value;
    public String text;
}
