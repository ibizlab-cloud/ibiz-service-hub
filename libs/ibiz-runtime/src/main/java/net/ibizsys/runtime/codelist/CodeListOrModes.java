package net.ibizsys.runtime.codelist;

/**
 * 代码表或模式
 * @author lionlau
 *
 */
public class CodeListOrModes {

	 /**
     *  数字或处理，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String NUMBERORMODE = "NUM";
    /**
     *  文本或模式，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String STRINGORMODE = "STR";
    
	/**
	 * 或模式，字符，使用分隔符号拼接
	 */
	public static final String STRING = "STR";

	/**
	 * 或模式，数值，使用位或模式
	 */
	public static final String NUMBER = "NUM";
}
