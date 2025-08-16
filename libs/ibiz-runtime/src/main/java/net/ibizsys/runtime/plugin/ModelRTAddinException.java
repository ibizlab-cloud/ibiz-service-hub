package net.ibizsys.runtime.plugin;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.util.Errors;

public class ModelRTAddinException extends RuntimeException implements IModelRTAddinException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	private IModelRTAddin iModelRTAddin = null;

	public ModelRTAddinException(IModelRuntime iModelRuntime, IModelRTAddin iModelRTAddin, String strInfo) {
		super(strInfo);
		this.iModelRuntime = iModelRuntime;
		this.iModelRTAddin = iModelRTAddin;
	}
	
	public ModelRTAddinException(IModelRuntime iModelRuntime, IModelRTAddin iModelRTAddin, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iModelRuntime = iModelRuntime;
		this.iModelRTAddin = iModelRTAddin;
	}
	
	public ModelRTAddinException(IModelRuntime iModelRuntime, IModelRTAddin iModelRTAddin, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iModelRuntime = iModelRuntime;
		this.iModelRTAddin = iModelRTAddin;
	}
	
	public ModelRTAddinException(IModelRuntime iModelRuntime, IModelRTAddin iModelRTAddin, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iModelRuntime = iModelRuntime;
		this.iModelRTAddin = iModelRTAddin;
	}
	

	@Override
	public int getErrorCode() {
		return nErrorCode;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}

	@Override
	public IModelRTAddin getModelRTAddin() {
		return this.iModelRTAddin;
	}
	
	public static void rethrow(IModelRTAddin iModelRTAddin, Throwable ex) {
		if(ex instanceof ModelRTAddinException) {
			ModelRTAddinException modelRTAddinException = (ModelRTAddinException)ex;
			if(modelRTAddinException.getModelRTAddin() == iModelRTAddin) {
				throw (ModelRTAddinException)ex;
			}
		}
	}
}
