package net.ibizsys.central.cloud.workflow.core.util.enums;

/**
 * 任务类型
 */
public enum WFTaskType {
    /**
     * 未提交
     */
    DRAFT("draft","未提交"),
    /**
     * 待办
     */
    TODO("todo","待办"),
    /**
     * 待阅
     */
    TOREAD("toread","待阅"),
    /**
     * 已办
     */
    DONE("done","已办"),
    /**
     * 办结
     */
    FINISH("finish","办结"),
    /**
     * 抄送
     */
    CC("cc","抄送未读"),
    /**
     * 抄送
     */
    HAVEREAD("haveread","抄送已读"),
    /**
     * 待办、已办、办结
     */
    ALL("all","待办、已办、办结");

    WFTaskType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String value;
    public String text;
}
