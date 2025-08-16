package net.ibizsys.runtime.dataentity.der;

/**
 * 一对多关系主从类型
 * @author lionlau
 *
 */
public class DER1NMasterRSTypes {

	 /**
     *  附属关系，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int RELATED = 1;

    /**
     *  附属关系(N:N连接)，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NN = 2;

    /**
     *  数据访问控制，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int DAC = 4;

    /**
     *  嵌套操作，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NESTED = 8;

    /**
     *  递归关系，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int RECURSIVE = 16;

    /**
     *  通知关系，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NOTIFY = 32;
    /**
     *  附属扩展，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int EXTENSION = 64;

    /**
     *  限定版本，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int VERSION = 128;

    /**
     *  引用检查，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int REFCHECK = 256;

//    /**
//     *  主状态，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
//     */
//    public final static int MAINSTATE = 512;

    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER = 1048576;

    /**
     *  自定义2，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER2 = 2097152;

    /**
     *  自定义3，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER3 = 4194304;

    /**
     *  自定义4，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER4 = 8388608;

}
