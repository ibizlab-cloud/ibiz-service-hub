package net.ibizsys.central.service;

/**
 * 系统服务接口认证模式
 * @author lionlau
 *
 */
public class APIAuthModes {

	 /**
     *  无认证，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NONE = "NONE";
    /**
     *  授权码模式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String AUTHORIZATION_CODE = "AUTHORIZATION_CODE";
    /**
     *  密码模式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PASSWORD = "PASSWORD";
    /**
     *  客户端模式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CLIENT_CREDENTIALS = "CLIENT_CREDENTIALS";
    /**
     *  简化模式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String IMPLICIT = "IMPLICIT";
    /**
     *  用户自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER = "USER";
    /**
     *  用户自定义2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USER2 = "USER2";
    
}
