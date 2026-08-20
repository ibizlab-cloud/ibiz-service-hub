package net.ibizsys.central.testing;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统测试项目运行时异常
 * @author lionlau
 *
 */
public class SysTestPrjRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysTestPrjRuntime iSysTestPrjRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	private IModelRuntime iModelRuntime = null;
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, String strInfo) {
		super(strInfo);
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysTestPrjRuntimeException(ISysTestPrjRuntime iSysTestPrjRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysTestPrjRuntime = iSysTestPrjRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统测试项目对象
	 * @return
	 */
	public ISysTestPrjRuntime getSysTestPrjRuntime() {
		return this.iSysTestPrjRuntime;
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
		if(getSysTestPrjRuntime()!=null) {
			return this.getSysTestPrjRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		if(iModelRuntime!=null) {
			return iModelRuntime;
		}
		return this.getSysTestPrjRuntime();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysTestPrjRuntimeException) {
			SysTestPrjRuntimeException sysTestPrjRuntimeException = (SysTestPrjRuntimeException)ex;
			if(sysTestPrjRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysTestPrjRuntimeException)ex;
			}
		}
	}
}
