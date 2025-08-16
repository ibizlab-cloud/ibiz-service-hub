package net.ibizsys.central.dataentity.logic;

/**
 * 实体逻辑准备参数值类型
 * @author lionlau
 *
 */
public class DELogicPrepareParamValueTypes {

	 /**
     *  源逻辑参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SRCDLPARAM = "SRCDLPARAM";
    /**
     *  网页请求上下文，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String WEBCONTEXT = "WEBCONTEXT";
    /**
     *  当前应用数据，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String APPDATA = "APPDATA";
    /**
     *  系统全局对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String APPLICATION = "APPLICATION";
    /**
     *  用户全局对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SESSION = "SESSION";
    /**
     *  数据上下文，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DATACONTEXT = "DATACONTEXT";
    /**
     *  当前环境参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ENVPARAM = "ENVPARAM";
    /**
     *  当前视图参数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VIEWPARAM = "VIEWPARAM";
    /**
     *  无值（NONE），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONEVALUE = "NONEVALUE";
    /**
     *  空值（NULL），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NULLVALUE = "NULLVALUE";
    /**
     *  直接值，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SRCVALUE = "SRCVALUE";
    /**
     *  计算式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String EXPRESSION = "EXPRESSION";
    
    /**
     *  数组数量，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String COUNT = "COUNT";
    /**
     *  数组聚合计算，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String AGGREGATION = "AGGREGATION";
    
    /**
     *  系统值序列，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SEQUENCE = "SEQUENCE";
    /**
     *  系统值转换器，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TRANSLATOR = "TRANSLATOR";
}
