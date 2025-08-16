package net.ibizsys.runtime.dataentity.der;

/**
 * 关系类型
 * @author lionlau
 *
 */
public class DERTypes {

	 /**
     *  1:N关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DER1N = "DER1N";
    /**
     *  继承关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DERINHERIT = "DERINHERIT";
    /**
     *  索引关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DERINDEX = "DERINDEX";
    /**
     *  1:1 关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DER11 = "DER11";
    /**
     *  多继承关系（虚拟实体），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DERMULINH = "DERMULINH";
    /**
     *  自定义关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DERCUSTOM = "DERCUSTOM";
    /**
     *  聚合数据关系，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DERAGGDATA = "DERAGGDATA";
    
}
