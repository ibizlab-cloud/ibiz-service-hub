package net.ibizsys.runtime.dataentity.der;

/**
 * 关系主实体数据删除模式
 * @author lionlau
 *
 */
public class DERRemoveActionTypes {

    /**
     *  无操作，整形类型，可用于 switch 或 == 比较
     */
    public final static int NONE = 0;
    
    /**
     *  同时删除，整形类型，可用于 switch 或 == 比较
     */
    public final static int DELETE = 1;
   
    /**
     *  置空，整形类型，可用于 switch 或 == 比较
     */
    public final static int RESET = 2;
   
    /**
     *  限制删除，整形类型，可用于 switch 或 == 比较
     */
    public final static int REJECT = 3;
    
}
