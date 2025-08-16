package net.ibizsys.central.dataentity.logic;

/**
 * 实体逻辑节点类型
 * @author lionlau
 *
 */
public class DELogicNodeTypes {

	/**
     *  开始，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String BEGIN = "BEGIN";
    /**
     *  实体行为，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEACTION = "DEACTION";
    /**
     *  准备参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PREPAREPARAM = "PREPAREPARAM";
    
    /**
     *  重置参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RESETPARAM = "RESETPARAM";
    /**
     *  拷贝参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String COPYPARAM = "COPYPARAM";
    /**
     *  绑定参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String BINDPARAM = "BINDPARAM";
    /**
     *  附加到数组参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String APPENDPARAM = "APPENDPARAM";
    /**
     *  排序数组参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SORTPARAM = "SORTPARAM";
    /**
     *  重新建立参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RENEWPARAM = "RENEWPARAM";
      /**
     *  直接SQL调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RAWSQLCALL = "RAWSQLCALL";
    /**
     *  直接SQL并循环调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RAWSQLANDLOOPCALL = "RAWSQLANDLOOPCALL";
    /**
     *  直接Web调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RAWWEBCALL = "RAWWEBCALL";
    /**
     *  启动流程，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String STARTWF = "STARTWF";
    
    /**
     *  提交流程操作，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SUBMITWF = "SUBMITWF";
    
    /**
     *  抛出异常，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String THROWEXCEPTION = "THROWEXCEPTION";
    /**
     *  系统服务插件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SFPLUGIN = "SFPLUGIN";
    /**
     *  直接后台代码，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String RAWSFCODE = "RAWSFCODE";
    /**
     *  系统逻辑处理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSLOGIC = "SYSLOGIC";
    
    /**
     *  实体数据集，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDATASET = "DEDATASET";
    /**
     *  实体通知，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DENOTIFY = "DENOTIFY";
    /**
     *  实体逻辑，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DELOGIC = "DELOGIC";
    /**
     *  提交事务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String COMMIT = "COMMIT";
    /**
     *  回滚事务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ROLLBACK = "ROLLBACK";
    
    /**
     *  数据查询，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDATAQUERY = "DEDATAQUERY";
    
    /**
     *  实体数据同步，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDATASYNC = "DEDATASYNC";
    
    /**
     * 调试输出逻辑参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEBUGPARAM = "DEBUGPARAM";
    
    /**
     * 外部服务接口方法调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SUBSYSSAMETHOD = "SUBSYSSAMETHOD";
    
    
    /**
     *  取消流程，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CANCELWF = "CANCELWF";
    
    /**
     *  实体打印，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEPRINT = "DEPRINT";
    
    
    /**
     *  实体报表，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEREPORT = "DEREPORT";
    
    /**
     *  实体异步处理队列，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDTSQUEUE = "DEDTSQUEUE";
    
    /**
     *  系统数据库表操作，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSDBTABLEACTION = "SYSDBTABLEACTION";
    
    /**
     *  系统大数据表操作，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSBDTABLEACTION = "SYSBDTABLEACTION";
    /**
     *  系统检索文档操作，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSSEARCHDOCACTION = "SYSSEARCHDOCACTION";
    /**
     *  系统智能报表，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSBIREPORT = "SYSBIREPORT";
    
    
    /**
     *  循环子调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String LOOPSUBCALL = "LOOPSUBCALL";
    
    /**
     *  结束，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String END = "END";
    
    /**
     *  系统数据同步代理输出，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSDATASYNCAGENTOUT = "SYSDATASYNCAGENTOUT";
    
    /**
     *  过滤数组参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FILTERPARAM = "FILTERPARAM";
    /**
     *  过滤数组参数2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FILTERPARAM2 = "FILTERPARAM2";
    /**
     *  合并数组参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String MERGEPARAM = "MERGEPARAM";
    /**
     *  聚合数组参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String AGGREGATEPARAM = "AGGREGATEPARAM";
    
    /**
     *  系统预置功能调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSUTIL = "SYSUTIL";
    
    /**
     *  系统AI交谈代理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSAICHATAGENT = "SYSAICHATAGENT";
    
    
    /**
     *  系统AI生产线代理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSAIPIPELINEAGENT = "SYSAIPIPELINEAGENT";
    
    
    /**
     *  实体数据流调用，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDATAFLOW = "DEDATAFLOW";
    
}
