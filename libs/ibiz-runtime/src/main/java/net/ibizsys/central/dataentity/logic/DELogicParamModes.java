package net.ibizsys.central.dataentity.logic;

/**
 * 实体逻辑参数模式
 * @author lionlau
 *
 */
public class DELogicParamModes {

	
    /**
     *  常规变量，整形类型，可用于 switch 或 == 比较
     */
    public final static int COMMON = 0;
    
    /**
     *  会话变量，整形类型，可用于 switch 或 == 比较
     */
    public final static int SESSION = 1;


    /**
     *  环境变量，整形类型，可用于 switch 或 == 比较
     */
    public final static int ENV = 2;


    /**
     *  最后数据变量，整形类型，可用于 switch 或 == 比较
     */
    public final static int LAST = 3;


    /**
     *  应用上下文变量（前端处理逻辑），整形类型，可用于 switch 或 == 比较
     */
    public final static int CONTEXT = 24;


    /**
     *  应用全局变量（前端处理逻辑），整形类型，可用于 switch 或 == 比较
     */
    public final static int APPGLOBALPARAM = 27;
    
}
