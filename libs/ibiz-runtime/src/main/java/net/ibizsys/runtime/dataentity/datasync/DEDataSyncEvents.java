package net.ibizsys.runtime.dataentity.datasync;

/**
 * 数据同步事件
 * @author lionlau
 *
 */
public class DEDataSyncEvents {

	/**
     *  自动，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int AUTO = -1;
    
	 /**
     *  无，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NONE = 0;

    
    /**
     *  新建，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int CREATE = 1;

    /**
     *  更新，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int UPDATE = 2;

    /**
     *  删除，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int REMOVE = 4;

    
    /**
     *  用户自定义，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER = 256;
    
    /**
     *  用户自定义2，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int USER2 = 512;
}
