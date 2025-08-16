package net.ibizsys.central.ba;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统大数据体系运行时异常
 * @author lionlau
 *
 */
public class SysBDSchemeRuntimeException extends RuntimeException implements ISystemRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISysBDSchemeRuntime iSysBDSchemeRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	
	public SysBDSchemeRuntimeException(ISysBDSchemeRuntime iSysBDSchemeRuntime, String strInfo) {
		super(strInfo);
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	public SysBDSchemeRuntimeException(ISysBDSchemeRuntime iSysBDSchemeRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	public SysBDSchemeRuntimeException(ISysBDSchemeRuntime iSysBDSchemeRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	public SysBDSchemeRuntimeException(ISysBDSchemeRuntime iSysBDSchemeRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSysBDSchemeRuntime = iSysBDSchemeRuntime;
	}
	
	
	/**
	 * 获取系统大数据体系对象
	 * @return
	 */
	public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return this.iSysBDSchemeRuntime;
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
		if(getSysBDSchemeRuntime()!=null) {
			return this.getSysBDSchemeRuntime().getSystemRuntime();
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		return this.getSysBDSchemeRuntime();
	}
	
}
