package net.ibizsys.central.plugin.groovy.support;

import groovy.lang.Closure;
import groovy.lang.DelegatesTo;
import net.ibizsys.central.util.ISearchGroupCond;

public class SearchGroupCondExtension {

	/**
	 * 注入与条件
	 * @param iSearchGroupCond
	 * @param closure
	 * @return
	 */
	public static ISearchGroupCond and(ISearchGroupCond iSearchGroupCond, @DelegatesTo(ISearchGroupCond.class) Closure closure) {
		ISearchGroupCond groupCond = iSearchGroupCond.and();
		closure.setDelegate(groupCond);	
		closure.setResolveStrategy(Closure.OWNER_FIRST);
		
		closure.call();
		return iSearchGroupCond;
	}
	
	
	/**
	 * 注入或条件
	 * @param iSearchGroupCond
	 * @param closure
	 * @return
	 */
	public static ISearchGroupCond or(ISearchGroupCond iSearchGroupCond, @DelegatesTo(ISearchGroupCond.class) Closure closure) {
		ISearchGroupCond groupCond = iSearchGroupCond.or();
		closure.setDelegate(groupCond);	
		closure.setResolveStrategy(Closure.OWNER_FIRST);
		
		closure.call();
		return iSearchGroupCond;
	}
}
