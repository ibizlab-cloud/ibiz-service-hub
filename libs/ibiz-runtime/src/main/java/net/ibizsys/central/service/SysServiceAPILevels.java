package net.ibizsys.central.service;

/**
 * 系统服务接口访问级别
 * @author lionlau
 *
 */
public class SysServiceAPILevels {

    /**
     *  核心级，整形类型，可用于 switch 或 == 比较
     */
    public final static int CORE = 0;
   
    /**
     *  平台管理员，整形类型，可用于 switch 或 == 比较
     */
    public final static int CLOUDADMIN = 1;
   
    /**
     *  机构管理员，整形类型，可用于 switch 或 == 比较
     */
    public final static int DCADMIN = 2;
   
    /**
     *  用户级，整形类型，可用于 switch 或 == 比较
     */
    public final static int USER = 3;
 

    /**
     *  当前系统用户级，整形类型，可用于 switch 或 == 比较
     */
    public final static int CURSYSTEMUSER = 5;
    
    
    /**
     *  API用户级，整形类型，可用于 switch 或 == 比较
     */
    public final static int APIUSER = 6;
    
    
    
    /**
     *  匿名用户级，整形类型，可用于 switch 或 == 比较
     */
    public final static int ANONYMOUSUSER = 4;
}
