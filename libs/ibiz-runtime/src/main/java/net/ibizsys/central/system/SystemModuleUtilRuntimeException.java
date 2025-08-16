package net.ibizsys.central.system;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统模块功能运行时异常
 * @author lionlau
 *
 */
public class SystemModuleUtilRuntimeException extends RuntimeException implements ISystemModuleUtilRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISystemModuleUtilRuntime iSystemModuleUtilRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime,String strInfo) {
		super(strInfo);
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, IModelRuntime iModelRuntime, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, IModelRuntime iModelRuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemModuleUtilRuntimeException(ISystemModuleUtilRuntime iSystemModuleUtilRuntime, IModelRuntime iModelRuntime, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemModuleUtilRuntime = iSystemModuleUtilRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	/**
	 * 获取系统模块功能运行时对象
	 * @return
	 */
	public ISystemModuleUtilRuntime getSystemModuleUtilRuntime() {
		return this.iSystemModuleUtilRuntime;
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
	public IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}
	
	
}
