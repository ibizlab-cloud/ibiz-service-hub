package net.ibizsys.central;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.util.Errors;

/**
 * 系统网关运行时异常
 * @author lionlau
 *
 */
public class SystemGatewayException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ISystemGateway iSystemGateway = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public SystemGatewayException(ISystemGateway iSystemGateway,String strInfo) {
		super(strInfo);
		this.iSystemGateway = iSystemGateway;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemGateway = iSystemGateway;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemGateway = iSystemGateway;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemGateway = iSystemGateway;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iSystemGateway = iSystemGateway;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, IModelRuntime iModelRuntime, String strInfo,int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iSystemGateway = iSystemGateway;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, IModelRuntime iModelRuntime, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iSystemGateway = iSystemGateway;
		this.iModelRuntime = iModelRuntime;
	}
	
	public SystemGatewayException(ISystemGateway iSystemGateway, IModelRuntime iModelRuntime, String strInfo,int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iSystemGateway = iSystemGateway;
		this.iModelRuntime = iModelRuntime;
	}
	
	/**
	 * 获取系统网关运行时对象
	 * @return
	 */
	public ISystemGateway getSystemGateway() {
		return this.iSystemGateway;
	}

	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	public int getErrorCode() {
		return nErrorCode;
	}

	public IModelRuntime getModelRuntime() {
		return iModelRuntime;
	}
	
	
}
