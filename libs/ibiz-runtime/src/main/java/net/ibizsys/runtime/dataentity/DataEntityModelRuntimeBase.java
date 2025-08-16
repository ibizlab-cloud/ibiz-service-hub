package net.ibizsys.runtime.dataentity;


import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.ModelRuntimeBase2;

/**
 * 实体模型运行时实现基类对象
 * @author lionlau
 *
 */
public abstract class DataEntityModelRuntimeBase extends ModelRuntimeBase2 implements IDataEntityModelRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityModelRuntimeBase.class);
	
	private IDataEntityRuntime iDataEntityRuntime = null;
	private IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
	private IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext = null;
	
	protected void setDataEntityRuntimeBaseContext(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext) {
		this.iDataEntityRuntimeBaseContext = iDataEntityRuntimeBaseContext;
		if(this.iDataEntityRuntimeBaseContext == null) {
			this.setDataEntityRuntimeBase(null);
		}
		else {
			this.setDataEntityRuntimeBase(this.iDataEntityRuntimeBaseContext.getDataEntityRuntime());
		}
	}
	
	protected IDataEntityRuntimeBaseContext getDataEntityRuntimeBaseContext() {
		return this.iDataEntityRuntimeBaseContext;
	}
	
	
	protected void setDataEntityRuntimeBase(IDataEntityRuntimeBase iDataEntityRuntimeBase) {
		if(iDataEntityRuntimeBase == null) {
			this.iDataEntityRuntime = null;
			this.iDynaInstDataEntityRuntime = null;
		}
		else {
			if(iDataEntityRuntimeBase instanceof IDataEntityRuntime) {
				this.iDataEntityRuntime = (IDataEntityRuntime)iDataEntityRuntimeBase;
			}
			else
				if(iDataEntityRuntimeBase instanceof IDynaInstDataEntityRuntime) {
					this.iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime)iDataEntityRuntimeBase;
					this.iDataEntityRuntime = this.iDynaInstDataEntityRuntime.getDataEntityRuntime();
				}
		}
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return this.iDynaInstDataEntityRuntime;
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	
	public IDataEntityRuntimeBase getDataEntityRuntimeBase() {
		return (getDynaInstDataEntityRuntime()!=null)?getDynaInstDataEntityRuntime():getDataEntityRuntime();
	}
	
	
	
	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		if(getDynaInstDataEntityRuntime() == null) {
			return null;
		}
		return this.getDynaInstDataEntityRuntime().getDynaInstRuntime();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		if(getDataEntityRuntime() == null) {
			return null;
		}
		return this.getDataEntityRuntime().getSystemRuntime();
	}
	
	
	public ISystemRuntimeBase getSystemRuntimeBase() {
		return (getDynaInstRuntime()!=null)?getDynaInstRuntime():getSystemRuntime();
	}
	

	
}
