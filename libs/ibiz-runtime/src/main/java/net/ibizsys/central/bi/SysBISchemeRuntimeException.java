package net.ibizsys.central.bi;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统智能报表体系运行时异常
 * @author lionlau
 *
 */
public class SysBISchemeRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysBISchemeRuntime iSysBISchemeRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	private IModelRuntime iModelRuntime = null;
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, String strInfo) {
		super(strInfo);
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SysBISchemeRuntimeException(ISysBISchemeRuntime iSysBISchemeRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取系统智能报表体系对象
	 * @return
	 */
	public ISysBISchemeRuntime getSysBISchemeRuntime() {
		return this.iSysBISchemeRuntime;
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
		if(getSysBISchemeRuntime()!=null) {
			return this.getSysBISchemeRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		if(iModelRuntime!=null) {
			return iModelRuntime;
		}
		return this.getSysBISchemeRuntime();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof SysBISchemeRuntimeException) {
			SysBISchemeRuntimeException sysBISchemeRuntimeException = (SysBISchemeRuntimeException)ex;
			if(sysBISchemeRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (SysBISchemeRuntimeException)ex;
			}
		}
	}
}
