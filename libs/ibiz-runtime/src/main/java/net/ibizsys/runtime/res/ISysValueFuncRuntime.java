package net.ibizsys.runtime.res;

import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 系统值函数运行时对象接口
 * @author lionlau
 *
 */
public interface ISysValueFuncRuntime extends ISystemModelRuntime {

	/**
	 *  平台预置函数：字符串长度
	 */
	public final static String PREDEFINED_STRLEN = "STRLEN";
	
	/**
	 *  平台预置函数：过去天数
	 */
	public final static String PREDEFINED_DATEDIFFNOW = "DATEDIFFNOW";
	
	/**
	 *  平台预置函数：未来天数
	 */
	public final static String PREDEFINED_DATEDIFFNOW2 = "DATEDIFFNOW2";
	
		

	
	
	/**
	 * 初始化值函数运行时
	 * @param iSystemRuntimeBase
	 * @param iPSSysDBValueFunc
	 * @throws Exception
	 */
	void init(ISystemRuntimeBase iSystemRuntimeBase, IPSSysDBValueFunc iPSSysDBValueFunc) throws Exception;

	
	
	/**
	 * 转化搜索条件
	 * @param iSearchContextBase
	 * @param iPSDEFSearchMode
	 * @param iPSDEField
	 * @param iDataEntityRuntime
	 */
	void convert(ISearchContextBase iSearchContextBase, IPSDEFSearchMode iPSDEFSearchMode, IPSDEField iPSDEField, IDataEntityRuntime iDataEntityRuntime);
	

}
