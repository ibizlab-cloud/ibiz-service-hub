package net.ibizsys.runtime.dataentity;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.util.Errors;

/**
 * 实体运行时异常
 * @author lionlau
 *
 */
public class DataEntityRuntimeException extends RuntimeException implements IDataEntityRuntimeExeption {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IDataEntityRuntimeBase iDataEntityRuntimeBase = null;
	private int nErrorCode = Errors.INTERNALERROR;
	private IModelRuntime iModelRuntime = null;
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, String strInfo) {
		super(strInfo);
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
	}
	
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, IModelRuntime iModelRuntime, String strInfo) {
		super(strInfo);
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, IModelRuntime iModelRuntime, String strInfo, int nErrorCode) {
		super(strInfo);
		this.nErrorCode = nErrorCode;
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, IModelRuntime iModelRuntime, String strInfo,Throwable throwable) {
		super(strInfo, throwable);
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	public DataEntityRuntimeException(IDataEntityRuntimeBase iDataEntityRuntimeBase, IModelRuntime iModelRuntime, String strInfo, int nErrorCode, Throwable throwable) {
		super(strInfo, throwable);
		this.nErrorCode = nErrorCode;
		this.iDataEntityRuntimeBase = iDataEntityRuntimeBase;
		this.iModelRuntime = iModelRuntime;
	}
	
	
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	public IDataEntityRuntimeBase getDataEntityRuntime() {
		return this.iDataEntityRuntimeBase;
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
		if(getDataEntityRuntime()!=null) {
			if(getDataEntityRuntime() instanceof IDataEntityRuntime) {
				return ((IDataEntityRuntime)getDataEntityRuntime()).getSystemRuntime();
			}
			if(getDataEntityRuntime() instanceof IDynaInstDataEntityRuntime) {
				return ((IDynaInstDataEntityRuntime)getDataEntityRuntime()).getDynaInstRuntime();
			}
		}
		return null;
	}

	@Override
	public IModelRuntime getModelRuntime() {
		if(this.iModelRuntime == null) {
			return this.getDataEntityRuntime();
		}
		return this.iModelRuntime;
	}

	@Override
	public String toString() {
		if(this.getModelRuntime() != null) {
			String strSystemId = null;
			if(getSystemRuntime() instanceof ISystemRuntime) {
				strSystemId = ((ISystemRuntime)getSystemRuntime()).getDeploySystemId();
			}
			else
				if(getSystemRuntime() instanceof IDynaInstRuntime) {
					IDynaInstRuntime iDynaInstRuntime = (IDynaInstRuntime)getSystemRuntime();
					strSystemId = String.format("%1$s|%2$s", iDynaInstRuntime.getSystemRuntime().getDeploySystemId(), iDynaInstRuntime.getId());
				}
			if(this.getModelRuntime() != this.getDataEntityRuntime()) {
				return String.format("[%1$s][%2$s][%3$s]%4$s", strSystemId, this.getDataEntityRuntime().getName(), this.getModelRuntime().getPSModelObject().getId(), this.getMessage());
			}
			else {
				return String.format("[%1$s][%2$s]%3$s", strSystemId, this.getDataEntityRuntime().getName(), this.getMessage());
			}
		}
		return super.toString();
	}
	
	public static void rethrow(IModelRuntime iModelRuntime, Throwable ex) {
		if(ex instanceof DataEntityRuntimeException) {
			DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
			if(dataEntityRuntimeException.getModelRuntime() == iModelRuntime) {
				throw (DataEntityRuntimeException)ex;
			}
		}
	}
	
}
