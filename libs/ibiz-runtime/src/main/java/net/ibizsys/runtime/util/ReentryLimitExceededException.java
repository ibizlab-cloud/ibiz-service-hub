package net.ibizsys.runtime.util;

public class ReentryLimitExceededException extends RuntimeException {

	private int nReentryLimit = -1;

	public ReentryLimitExceededException(String arg0, int nReentryLimit, Throwable arg1) {
		super(arg0, arg1);
		this.nReentryLimit = nReentryLimit;
	}
	
	public ReentryLimitExceededException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ReentryLimitExceededException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public ReentryLimitExceededException(String arg0, int nReentryLimit) {
		super(arg0);
		this.nReentryLimit = nReentryLimit;
	}


	public ReentryLimitExceededException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public int getReentryLimit() {
		return this.nReentryLimit;
	}
	
}
