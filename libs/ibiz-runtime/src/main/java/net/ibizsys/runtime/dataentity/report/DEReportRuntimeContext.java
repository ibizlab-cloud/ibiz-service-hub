package net.ibizsys.runtime.dataentity.report;

import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 报表运行时上下文对象
 * @author lionlau
 *
 */
public class DEReportRuntimeContext implements IDEReportRuntimeContext {

	private IUserContext iUserContext = null;
	private String strContentType = null;
	private ISearchContextBase iSearchContextBase = null;
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
	 * 设置搜索上下文对象
	 * @param iSearchContextBase
	 */
	public void setSearchContextBase(ISearchContextBase iSearchContextBase) {
		this.iSearchContextBase = iSearchContextBase;
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
}
