package net.ibizsys.runtime.util.domain;

/**
 * 文件类型
 * @author lionlau
 *
 */
public class FileTypes {

	 /**
     *  本地临时文件，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String TEMP = "TEMP";
    /**
     *  远程文件（Url），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String URL = "URL";
    /**
     *  远程存储服务，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String STORAGESERVICE = "STORAGESERVICE";
    
}
