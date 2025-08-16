package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;

public abstract class DEDataSetPluginRuntimeBase implements IDEDataSetPluginRuntime {

	@Override
	public Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		return this.onFetch(iDataEntityRuntimeContext, iPSDEDataSet, args, actionData);
	}

	protected Object onFetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		return this.onFetch(args);
	}

	protected Object onFetch(Object[] args) throws Throwable {
		// 判断参数类型，进行调用
		if (args != null && args.length > 0) {
			Object arg = args[0];
			if (arg instanceof ISearchContextDTO) {
				return this.onFetch((ISearchContextDTO) arg);
			}
		}

		throw new Exception("没有实现");
	}
	
	protected Object onFetch(ISearchContextDTO iSearchContextDTO) throws Throwable {
		throw new Exception("没有实现");
	}


}
