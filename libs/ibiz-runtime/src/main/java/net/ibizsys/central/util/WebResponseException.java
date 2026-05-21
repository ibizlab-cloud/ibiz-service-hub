package net.ibizsys.central.util;

public class WebResponseException extends RuntimeException {

	private String strResponseBody = null;
	private int nStatusCode = 200;
	
	public WebResponseException(int nStatusCode, String strMessage) {
		super(strMessage);
		this.nStatusCode = nStatusCode;
	}
	
	public WebResponseException(int nStatusCode, String strMessage, Throwable ex) {
		super(strMessage, ex);
		this.nStatusCode = nStatusCode;
	}
	
	public WebResponseException(int nStatusCode, String strMessage, String strResponseBody) {
		super(strMessage);
		this.nStatusCode = nStatusCode;
		this.strResponseBody = strResponseBody;
	}
	
	public WebResponseException(int nStatusCode, String strMessage, String strResponseBody, Throwable ex) {
		super(strMessage, ex);
		this.nStatusCode = nStatusCode;
		this.strResponseBody = strResponseBody;
	}
	
	public int getStatusCode() {
		return nStatusCode;
	}
	
	public String getResponseBody() {
		return this.strResponseBody;
	}

}
