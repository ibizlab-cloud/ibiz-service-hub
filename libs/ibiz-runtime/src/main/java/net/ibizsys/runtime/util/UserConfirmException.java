package net.ibizsys.runtime.util;

/**
 * 用户操作提示
 */
public class UserConfirmException extends RuntimeException {

    /**
     * 提示
     */
    public static final int INFORMATION = 0;

    /**
     * 警告
     */
    public static final int WARNING = 1;

    /**
     * 错误
     */
    public static final int ERROR = 2;


    private int messageType = INFORMATION;
    private UserConfirmOption[] options;

    public UserConfirmException(UserConfirmOption[] options) {
        super("操作提示");
        this.options = options;
    }

    public UserConfirmException(UserConfirmOption[] options, String strMessage) {
        super(strMessage);
        this.options = options;
    }

    public UserConfirmException(UserConfirmOption[] options, int messageType, String strMessage) {
        super(strMessage);
        this.messageType = messageType;
        this.options = options;

    }

    public int getMessageType() {
        return messageType;
    }

    public UserConfirmOption[] getOptions() {
        return options;
    }


   

}
