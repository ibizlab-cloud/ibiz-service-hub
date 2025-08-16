package net.ibizsys.runtime.dataentity.util;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.res.ISysUtilRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体数据审计功能运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataAuditUtilRuntime extends IDEUtilRuntime,ISysUtilRuntime{

	/**
	 * 审计处理
	 * @param curData
	 * @param lastEntityBase
	 * @param strActionName
	 * @param iPSDEAction
	 * @param iPSDataEntity
	 * @param iDataEntityRuntime 
	 * @param iDynaInstRuntime
	 * @param actionData
	 */
	void auditAction(Object curData, IEntityBase lastEntityBase, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDataEntityRuntime iDataEntityRuntime, IDynaInstRuntime iDynaInstRuntime, Object actionData);
}
