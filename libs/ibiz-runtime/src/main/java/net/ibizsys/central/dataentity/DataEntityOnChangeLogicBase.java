package net.ibizsys.central.dataentity;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

public abstract class DataEntityOnChangeLogicBase extends net.ibizsys.runtime.dataentity.DataEntityOnChangeLogicBase {

	@Override
	protected  final void onExecute(IDataEntityRuntime iDataEntityRuntime, IEntityBase data, IEntityBase last, String strActionMode, IPSDEAction iPSDEAction) throws Throwable {
		onExecute((net.ibizsys.central.dataentity.IDataEntityRuntime)iDataEntityRuntime, (IEntityDTO)data, (IEntityDTO)last, strActionMode, iPSDEAction);
	}

	protected abstract void onExecute(net.ibizsys.central.dataentity.IDataEntityRuntime iDataEntityRuntime, IEntityDTO data, IEntityDTO last, String strActionMode, IPSDEAction iPSDEAction) throws Throwable;
}
