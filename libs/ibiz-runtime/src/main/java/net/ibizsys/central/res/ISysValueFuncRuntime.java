package net.ibizsys.central.res;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchFieldCond;

public interface ISysValueFuncRuntime extends net.ibizsys.runtime.res.ISysValueFuncRuntime {

	/**
	 * 转换值函数条件
	 * @param iSearchContext
	 * @param iSearchFieldCond
	 * @param iDataEntityRuntime
	 * @return
	 */
	ISearchCond convert(ISearchContext iSearchContext, ISearchFieldCond iSearchFieldCond, IDataEntityRuntime iDataEntityRuntime);
}
