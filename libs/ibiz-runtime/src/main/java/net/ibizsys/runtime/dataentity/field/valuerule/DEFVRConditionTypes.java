package net.ibizsys.runtime.dataentity.field.valuerule;

/**
 * 属性值规则条件类型
 * @author lionlau
 *
 */
public class DEFVRConditionTypes {

	/**
     *  条件组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String GROUP = "GROUP";
    /**
     *  空值判断，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NULLRULE = "NULLRULE";
    /**
     *  数据集范围，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VALUERANGE = "VALUERANGE";
    /**
     *  数值范围，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VALUERANGE2 = "VALUERANGE2";
    /**
     *  正则式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String REGEX = "REGEX";
    /**
     *  字符长度，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String STRINGLENGTH = "STRINGLENGTH";
    /**
     *  常规条件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SIMPLE = "SIMPLE";
    /**
     *  值清单，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VALUERANGE3 = "VALUERANGE3";
    /**
     *  查询计数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String QUERYCOUNT = "QUERYCOUNT";
    /**
     *  值递归检查，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String VALUERECURSION = "VALUERECURSION";
    /**
     *  系统值规则，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSVALUERULE = "SYSVALUERULE";
    
}
