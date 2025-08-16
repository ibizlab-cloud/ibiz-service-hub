package net.ibizsys.central.app.dataentity;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 应用实体运行时异常
 * @author lionlau
 *
 */
public class AppDataEntityRuntimeException extends RuntimeException implements IAppDataEntityRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IAppDataEntityRuntime iAppDataEntityRuntime = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, String strInfo) {
		super(strInfo);
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	public AppDataEntityRuntimeException(IAppDataEntityRuntime iAppDataEntityRuntime, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iAppDataEntityRuntime = iAppDataEntityRuntime;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	@Override
	public IAppDataEntityRuntime getAppDataEntityRuntime() {
		return this.iAppDataEntityRuntime;
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
		if(getApplicationRuntime()!=null) {
			return this.getApplicationRuntime().getSystemRuntime();
		}
		return null;
	}


	
	@Override
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getAppDataEntityRuntime();
		}
		return this.iModelRuntime;
	}

	@Override
	public IApplicationRuntime getApplicationRuntime() {
		if(getAppDataEntityRuntime()!=null) {
			return this.getAppDataEntityRuntime().getApplicationRuntime();
		}
		return null;
	}
}
