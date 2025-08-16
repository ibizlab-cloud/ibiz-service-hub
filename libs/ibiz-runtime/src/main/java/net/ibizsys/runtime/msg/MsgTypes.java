package net.ibizsys.runtime.msg;

/**
 * 消息类型
 * @author lionlau
 *
 */
public class MsgTypes {

	 /**
     *  系统消息，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int INTERNAL = 1;

     /**
     *  电子邮件，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int EMAIL = 2;

    /**
     *  手机短信，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int SMS = 4;

    /**
     *  MSN消息，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int MSN = 8;

    /**
     *  即时消息，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int IM = 16;

  	/**
     *  微信，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int WX = 32;

     /**
     *  钉钉，注意：值为对象值，不能直接用于 == 比较，可使用 INT_ 替换
     */
    public final static int DD = 64;

	/**
	 * 企业微信，整形类型，可用于 switch 或 == 比较
	 */
	public final static int WXWORK = 128;

	/**
	 * 用户自定义，整形类型，可用于 switch 或 == 比较
	 */
	public final static int USER = 256;

	/**
	 * 用户自定义2，整形类型，可用于 switch 或 == 比较
	 */
	public final static int USER2 = 512;
}
