package net.ibizsys.runtime.dataentity.security;

/**
 * 实体数据访问控制方式
 * @author lionlau
 *
 */
public class DEDataAccCtrlModes {

	/**
     *  无控制，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NONE = 0;


    /**
     *  自控制，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int SELF = 1;

    /**
     *  附属主实体控制，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int MASTER = 2;


    /**
     *  附属主实体控制（未映射自控），注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int MASTER_SELF = 3;


    
}
