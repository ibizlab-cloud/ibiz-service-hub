package net.ibizsys.runtime.util;

/**
 * 错误代码异常对象
 * 
 * @author lionlau
 *
 */
public class ErrorException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nErrorCode = Errors.INTERNALERROR;

	public ErrorException(String strInfo) {
		super(strInfo);
	}
	
	public ErrorException(String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
	}
	
	public ErrorException(String strInfo, Throwable throwable) {
		super(strInfo, throwable);
	}
	
	public ErrorException(String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
	}
	

	public int getErrorCode() {
		return nErrorCode;
	}

	
	
}
