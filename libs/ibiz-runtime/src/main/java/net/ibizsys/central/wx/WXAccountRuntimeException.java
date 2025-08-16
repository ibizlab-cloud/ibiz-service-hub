package net.ibizsys.central.wx;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统微信账户运行时异常
 * @author lionlau
 *
 */
public class WXAccountRuntimeException extends RuntimeException implements IWXAccountRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IWXAccountRuntime iWXAccountRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, String strInfo) {
		super(strInfo);
		this.iWXAccountRuntime = iWXAccountRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iWXAccountRuntime = iWXAccountRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iWXAccountRuntime = iWXAccountRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iWXAccountRuntime = iWXAccountRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iWXAccountRuntime = iWXAccountRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iWXAccountRuntime = iWXAccountRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iWXAccountRuntime = iWXAccountRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public WXAccountRuntimeException(IWXAccountRuntime iWXAccountRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iWXAccountRuntime = iWXAccountRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统微信账户对象
	 * @return
	 */
	@Override
	public IWXAccountRuntime getWXAccountRuntime() {
		return this.iWXAccountRuntime;
	}
	
	
	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	public int getErrorCode() {
		return nErrorCode;
	}

	@Override
	public ISystemRuntimeBase getSystemRuntime() {
		if(getWXAccountRuntime()!=null) {
			return this.getWXAccountRuntime().getSystemRuntime();
		}
		return null;
	}


	
	@Override
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getWXAccountRuntime();
		}
		return this.iModelRuntime;
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof WXAccountRuntimeException) {
			WXAccountRuntimeException applicationRuntimeException = (WXAccountRuntimeException)ex;
			if(applicationRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (WXAccountRuntimeException)ex;
			}
		}
	}
}
