package net.ibizsys.central.wf;

/**
 * 工作流处理连接类型
 * @author lionlau
 *
 */
public class WFLinkTypes {

	/**
     *  超时连接，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TIMEOUT = "TIMEOUT";
    /**
     *  交互连接，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String IAACTION = "IAACTION";
    /**
     *  常规连接，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ROUTE = "ROUTE";
    /**
     *  嵌入流程返回，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String WFRETURN = "WFRETURN";
}
