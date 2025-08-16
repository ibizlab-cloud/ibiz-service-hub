package net.ibizsys.central.wf;

/**
 * 工作流处理类型
 * @author lionlau
 *
 */
public class WFProcessTypes {

	/**
     *  开始，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String START = "START";
    /**
     *  结束，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String END = "END";
    /**
     *  常规处理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PROCESS = "PROCESS";
    /**
     *  交互处理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String INTERACTIVE = "INTERACTIVE";
    /**
     *  嵌套子流程，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String EMBED = "EMBED";
    /**
     *  并行网关，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PARALLELGATEWAY = "PARALLELGATEWAY";
    /**
     *  排它网关，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String EXCLUSIVEGATEWAY = "EXCLUSIVEGATEWAY";
    /**
     *  包容网关，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String INCLUSIVEGATEWAY = "INCLUSIVEGATEWAY";
    /**
     *  定时触发，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TIMEREVENT = "TIMEREVENT";
    /**
     *  调用组织流程，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CALLORGACTIVITY = "CALLORGACTIVITY";
}
