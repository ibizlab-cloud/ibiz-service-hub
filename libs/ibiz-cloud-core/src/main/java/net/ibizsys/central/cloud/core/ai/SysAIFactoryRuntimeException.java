package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统AI工厂运行时异常
 * @author lionlau
 *
 */
public class SysAIFactoryRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	private IModelRuntime iModelRuntime = null;
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, String strInfo) {
		super(strInfo);
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysAIFactoryRuntimeException(ISysAIFactoryRuntime iSysAIFactoryRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统AI工厂对象
	 * @return
	 */
	public ISysAIFactoryRuntime getSysAIFactoryRuntime() {
		return this.iSysAIFactoryRuntime;
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
		if(getSysAIFactoryRuntime()!=null) {
			return this.getSysAIFactoryRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		if(iModelRuntime!=null) {
			return iModelRuntime;
		}
		return this.getSysAIFactoryRuntime();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysAIFactoryRuntimeException) {
			SysAIFactoryRuntimeException sysAIFactoryRuntimeException = (SysAIFactoryRuntimeException)ex;
			if(sysAIFactoryRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysAIFactoryRuntimeException)ex;
			}
		}
	}
}
