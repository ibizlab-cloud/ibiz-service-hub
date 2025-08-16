package net.ibizsys.central.dataentity.defield;

import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntityBase;

public interface IDEFValueRuleRuntimeBase {

	/**
	 * 判断传入值是否符合规则
	 * @param objValue
	 * @param iEntityBase
	 * @param entityError
	 * @return
	 * @throws Throwable
	 */
	boolean test(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable;
}
