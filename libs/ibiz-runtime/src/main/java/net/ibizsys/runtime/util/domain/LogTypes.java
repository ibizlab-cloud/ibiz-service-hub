package net.ibizsys.runtime.util.domain;

public class LogTypes {

	/**
     *  一般日志，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NORMAL = "NORMAL";
    
    /**
     *  操作审计，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String AUDIT = "AUDIT";
    
    /**
     *  系统事件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String EVENT = "EVENT";
    /**
     *  性能检测，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PO = "PO";
}
