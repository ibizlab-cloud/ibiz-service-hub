package net.ibizsys.central.dataentity.logic;

/**
 * 实体逻辑返回值类型
 * @author lionlau
 *
 */
public class DELogicReturnTypes {

	/**
	 * break值
	 */
	public final static Object BREAK_VALUE = new Object();
	
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
     *  逻辑参数对象，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String LOGICPARAM = "LOGICPARAM";
    /**
     *  逻辑参数属性，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String LOGICPARAMFIELD = "LOGICPARAMFIELD";
    /**
     *  跳出循环（BREAK），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String BREAK = "BREAK";
    
}
