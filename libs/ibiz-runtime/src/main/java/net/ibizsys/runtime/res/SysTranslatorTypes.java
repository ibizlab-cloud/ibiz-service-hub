package net.ibizsys.runtime.res;

/**
 * 系统值转换器类型
 * @author lionlau
 *
 */
public class SysTranslatorTypes {

	 /**
     *  密码（不可逆），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DIGEST = "DIGEST";
    /**
     *  加密（可逆），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ENCRYPT = "ENCRYPT";
    /**
     *  实体扩展存储，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DESTORAGE = "DESTORAGE";
    
    /**
     *  转换为大写，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String UCASE = "UCASE";
    /**
     *  转换为小写，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String LCASE = "LCASE";
    
    /**
     *  代码表，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODELIST = "CODELIST";
    
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
