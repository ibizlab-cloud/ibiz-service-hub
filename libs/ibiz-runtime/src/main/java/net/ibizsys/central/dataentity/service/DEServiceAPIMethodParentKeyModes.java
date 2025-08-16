package net.ibizsys.central.dataentity.service;

/**
 * 实体服务接口方法父值处理模式
 * @author lionlau
 *
 */
public class DEServiceAPIMethodParentKeyModes {

	/**
     *  默认，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEFAULT = "DEFAULT";
    /**
     *  数据上下文（查询），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DATACONTEXT = "DATACONTEXT";
    
    /**
     *  递归子数据（查询），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CHILDOF = "CHILDOF";
    /**
     *  忽略，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String IGNORE = "IGNORE";
    /**
     *  用户自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    /**
     *  用户自定义2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER2 = "USER2";
    /**
     *  用户自定义3，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER3 = "USER3";
    /**
     *  用户自定义4，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER4 = "USER4";
	
}
