package net.ibizsys.runtime.dataentity.print;

import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 打印运行时上下文对象
 * @author lionlau
 *
 */
public class DEPrintRuntimeContext implements IDEPrintRuntimeContext {

	private IUserContext iUserContext = null;
	private String strContentType = null;
	private IEntityBase iEntityBase = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	
	@Override
	public IUserContext getUserContext() {
		return this.iUserContext;
	}
	
	/**
	 * 设置用户上下文
	 * @param iUserContext
	 */
	public void setUserContext(IUserContext iUserContext) {
		this.iUserContext = iUserContext;
	}

	@Override
	public String getContentType() {
		return this.strContentType;
	}
	
	/**
	 * 获取报表内容类型
	 * @param strContentType
	 */
	public void setContentType(String strContentType) {
		this.strContentType = strContentType;
	}
	
	
	
	
	
	/**
	 * 设置当前数据对象
	 * @param iEntityBase
	 */
	public void setEntityBase(IEntityBase iEntityBase) {
		this.iEntityBase = iEntityBase;
	}
	
	
	
	@Override
	public IEntityBase getEntity() {
		return this.iEntityBase;
	}

	/**
	 * 设置实体运行时对象
	 * @param iDataEntityRuntime
	 */
	public void setDataEntityRuntime(IDataEntityRuntime iDataEntityRuntime) {
		this.iDataEntityRuntime = iDataEntityRuntime;
	}
	 
	/**
	 * 获取实体运行时对象
	 * @return
	 */
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	

	@Override
	public boolean contains(String strName) {
		if(getEntity() instanceof IEntity) {
			return ((IEntity)getEntity()).contains(strName);
		}
		return false;
	}

	@Override
	public Object get(String strName) {
		if(getEntity() instanceof IEntity) {
			return ((IEntity)getEntity()).get(strName);
		}
		return null;
	}

}
