package net.ibizsys.runtime.res;


/**
 * 系统值规则
 * @author lionlau
 *
 */
public class SysValueRuleTypes {

    /**
     *  脚本，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SCRIPT = "SCRIPT";
    /**
     *  正则式，注意：值为对象值，不能直接用于 == 比较 ,后续废弃
     */
    @Deprecated
    public final static String REG = "REG";
    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CUSTOM = "CUSTOM";
    
    /**
     *  正则式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String REGEX = "REGEX";
    
}
