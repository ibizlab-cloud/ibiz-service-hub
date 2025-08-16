package net.ibizsys.runtime.dataentity.service;

/**
 * 实体方法输入类型
 * @author lionlau
 *
 */
public class DEMethodInputTypes {

	 /**
     *  没有输入，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";
    /**
     *  主键属性，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String KEYFIELD = "KEYFIELD";
    /**
     *  主键属性集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String KEYFIELDS = "KEYFIELDS";
    /**
     *  DTO对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DTO = "DTO";
    /**
     *  DTO对象集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DTOS = "DTOS";
    /**
     *  搜索过滤对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FILTER = "FILTER";
    /**
     *  未知，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String UNKNOWN = "UNKNOWN";
    /**
     *  用户自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    /**
     *  用户自定义2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER2 = "USER2";
    
}
