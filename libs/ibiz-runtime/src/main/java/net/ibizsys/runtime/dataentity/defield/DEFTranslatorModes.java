package net.ibizsys.runtime.dataentity.defield;

/**
 * 属性值转换器使用模式
 * @author lionlau
 *
 */
public class DEFTranslatorModes {

	 /**
     *  无，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";
    /**
     *  密码，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DIGEST = "DIGEST";
    /**
     *  加密，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ENCRYPT = "ENCRYPT";
    /**
     *  转换器处理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TRANSLATE = "TRANSLATE";
    /**
     *  转换器处理（双向），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TRANSLATE2 = "TRANSLATE2";
    
    /**
     *  转换为大写，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String UCASE = "UCASE";
    /**
     *  转换为小写，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String LCASE = "LCASE";
    
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
