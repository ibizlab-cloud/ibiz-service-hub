package net.ibizsys.runtime.util;

/**
 * 实体行为事务模式
 * @author lionlau
 *
 */
public class TransactionModes {

	/**
     *  默认，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEFAULT = "DEFAULT";
    /**
     *  需要事务（没有新建），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String REQUIRED = "REQUIRED";
    /**
     *  需要事务（没有异常），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String MANDATORY = "MANDATORY";
    /**
     *  嵌套事务（没有新建），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NESTED = "NESTED";
    /**
     *  挂起当前事务（没有新建），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String REQUIRES_NEW = "REQUIRES_NEW";
    /**
     *  无事务（存在则挂起），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NOT_SUPPORTED = "NOT_SUPPORTED";
    /**
     *  支持事务（没有无事务），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SUPPORTS = "SUPPORTS";
    /**
     *  无事务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";
    /**
     *  分布式事务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String GLOBAL = "GLOBAL";
    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    /**
     *  自定义2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER2 = "USER2";
}
