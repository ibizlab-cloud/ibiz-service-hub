package net.ibizsys.central.cloud.core.util;

/**
 * 用户取消提示
 */
public class UserCancelException extends RuntimeException {

	public UserCancelException() {
		super();
	}

	public UserCancelException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public UserCancelException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserCancelException(String arg0) {
		super(arg0);
	}

	public UserCancelException(Throwable arg0) {
		super(arg0);
	}


 

   

}
