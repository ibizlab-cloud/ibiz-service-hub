package net.ibizsys.runtime;

import net.ibizsys.runtime.util.Errors;

public class ModelRuntimeException extends RuntimeException implements IModelRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;

	public ModelRuntimeException(IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iModelRuntime = iModelRuntime;
	}
	
	public ModelRuntimeException(IModelRuntime iModelRuntime, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iModelRuntime = iModelRuntime;
	}
	
	public ModelRuntimeException(IModelRuntime iModelRuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iModelRuntime = iModelRuntime;
	}
	
	public ModelRuntimeException(IModelRuntime iModelRuntime, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iModelRuntime = iModelRuntime;
	}
	

	@Override
	public int getErrorCode() {
		return nErrorCode;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof ModelRuntimeException) {
			ModelRuntimeException modelRuntimeException = (ModelRuntimeException)ex;
			if(modelRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (ModelRuntimeException)ex;
			}
		}
	}
}
