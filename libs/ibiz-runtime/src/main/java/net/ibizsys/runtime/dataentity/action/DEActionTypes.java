package net.ibizsys.runtime.dataentity.action;

/**
 * 实体行为类型
 * @author lionlau
 *
 */
public class DEActionTypes {

	/**
     *  用户自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERCUSTOM = "USERCUSTOM";
    /**
     *  实体处理逻辑，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DELOGIC = "DELOGIC";
    /**
     *  内置方法，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String BUILTIN = "BUILTIN";
    /**
     *  通过键值获取，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SELECTBYKEY = "SELECTBYKEY";
    /**
     *  用户扩展建立，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERCREATE = "USERCREATE";
    /**
     *  用户扩展更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERUPDATE = "USERUPDATE";
    /**
     *  用户扩展系统更新，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERSYSUPDATE = "USERSYSUPDATE";
    
    
    /**
     *  脚本代码，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SCRIPT = "SCRIPT";
    
}
