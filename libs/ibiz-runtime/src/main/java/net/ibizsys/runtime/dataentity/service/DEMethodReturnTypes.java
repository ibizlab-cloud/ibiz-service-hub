package net.ibizsys.runtime.dataentity.service;

/**
 * 实体方法返回类型
 * @author lionlau
 *
 */
public class DEMethodReturnTypes {

	/**
     *  没有返回，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VOID = "VOID";
    /**
     *  简单值，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SIMPLE = "SIMPLE";
    /**
     *  简单值数组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SIMPLES = "SIMPLES";
    /**
     *  DTO对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DTO = "DTO";
    /**
     *  DTO对象集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DTOS = "DTOS";
    /**
     *  搜索分页，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PAGE = "PAGE";
    
    /**
     *  异步操作对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ASYNCACTION = "ASYNCACTION";
    
    
    /**
     *  服务器端事件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SSE = "SSE";
    
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
