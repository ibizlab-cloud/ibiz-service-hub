package net.ibizsys.runtime.dataentity.security;

/**
 * 实体数据审计模式
 * @author lionlau
 *
 */
public class DEDataAuditModes {

	 /**
     *  不启用，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NONE = 0;
    
    /**
     *  基本审计，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int NORMAL = 1;

     /**
     *  详细审计（含变化记录），注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int ADVANCE = 2;

    
}
