package net.ibizsys.runtime.backend;

/**
 * 系统后台任务预定义类型
 * @author lionlau
 *
 */
public class SysBackendTaskPredefinedTypes {

    /**
     *  实体通知，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DENOTIFY = "DENOTIFY";
    /**
     *  系统数据同步代理（输入），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSDATASYNCAGENT = "SYSDATASYNCAGENT";
    /**
     *  工作流回调，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String WFCALLBACK = "WFCALLBACK";
    
    /**
     *  系统管理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSADMIN = "SYSADMIN";
    
    /**
     *  系统异步处理队列，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSDTSQUEUE = "SYSDTSQUEUE";
    
    
    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    
}
