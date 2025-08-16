package net.ibizsys.runtime.dataentity;

/**
 * 实体虚拟模式
 * @author lionlau
 *
 */
public class DEVirtualModes {

    /**
     *  不启用，整形类型，可用于 switch 或 == 比较
     */
    public final static int NONE = 0;
     /**
     *  常规多继承模式，整形类型，可用于 switch 或 == 比较
     */
    public final static int MINHERIT = 1;
       /**
     *  高级继承扩展模式，整形类型，可用于 switch 或 == 比较
     */
    public final static int INHERIT = 2;
  
    /**
     *  索引主实体模式，整形类型，可用于 switch 或 == 比较
     */
    public final static int INDEXMAJOR = 3;
    
    /**
     *  混合多继承模式，整形类型，可用于 switch 或 == 比较
     */
    public final static int MIXMINHERIT = 4;
    
    /**
     *  混合多继承模式（合并），整形类型，可用于 switch 或 == 比较
     */
    public final static int MIXMINHERITMERGE = 5;
}
