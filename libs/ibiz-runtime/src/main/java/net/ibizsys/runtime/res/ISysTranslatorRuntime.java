package net.ibizsys.runtime.res;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.res.IPSSysTranslator;
import net.ibizsys.runtime.ISystemModelRuntime;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统值转换器运行时
 * @author lionlau
 *
 */
public interface ISysTranslatorRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化值转换器运行时
	 * @param iSystemRuntimeBaseContext
	 * @param iPSSysTranslator
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysTranslator iPSSysTranslator) throws Exception;

	
	
	/**
	 * 获取系统值转换器
	 * @return
	 */
	IPSSysTranslator getPSSysTranslator();

	/**
	 * 值转换
	 * @param objValue
	 * @param bIn
	 * @return
	 * @throws Throwable
	 */
	Object translate(Object objValue, boolean bIn) throws Throwable;
	
	
	
	/**
	 * 值转换
	 * @param objValue
	 * @param bIn
	 * @param iEntityBase
	 * @param iPSDEField
	 * @param entityDataEntityRuntime
	 * @return
	 * @throws Throwable
	 */
	Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable;
}
