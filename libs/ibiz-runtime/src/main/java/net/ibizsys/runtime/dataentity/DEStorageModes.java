package net.ibizsys.runtime.dataentity;

/**
 * 实体存储模式
 * @author lionlau
 *
 */
public class DEStorageModes {


    /**
     *  无存储，整形类型，可用于 switch 或 == 比较
     */
    public final static int NONE = 0;
 
    /**
     *  SQL，整形类型，可用于 switch 或 == 比较
     */
    public final static int SQL = 1;
  
    /**
     *  NoSQL，整形类型，可用于 switch 或 == 比较
     */
    public final static int NOSQL = 2;

    /**
     *  ServiceAPI，整形类型，可用于 switch 或 == 比较
     */
    public final static int SERVICEAPI = 4;
   
    /**
     *  SQL（多模式支持），整形类型，可用于 switch 或 == 比较
     */
    public final static int SQLANDMORE = 9;
   

    /**
     *  NoSQL（多模式支持），整形类型，可用于 switch 或 == 比较
     */
    public final static int NOSQLANDMORE = 10;


    /**
     *  ServiceAPI（多模式支持），整形类型，可用于 switch 或 == 比较
     */
    public final static int SERVICEAPIANDMORE = 12;


    /**
     *  用户自定义，整形类型，可用于 switch 或 == 比较
     */
    public final static int USER = 128;
    

    /**
     *  用户自定义2，整形类型，可用于 switch 或 == 比较
     */
    public final static int USER2 = 256;
    
}
