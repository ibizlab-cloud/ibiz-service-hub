package net.ibizsys.central.dataentity.ds;

/**
 * 实体查询条件类型
 * @author lionlau
 *
 */
public class DEDQCondTypes {

	/**
     *  组合条件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String GROUP = "GROUP";
    /**
     *  属性条件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SINGLE = "SINGLE";
    /**
     *  自定义条件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CUSTOM = "CUSTOM";
    /**
     *  预置条件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PREDEFINED = "PREDEFINED";
    
}
