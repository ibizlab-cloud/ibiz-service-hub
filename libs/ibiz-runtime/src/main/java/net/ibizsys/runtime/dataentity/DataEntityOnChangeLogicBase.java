package net.ibizsys.runtime.dataentity;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.util.IEntityBase;

public abstract class DataEntityOnChangeLogicBase implements IDataEntityOnChangeLogic {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityOnChangeLogicBase.class);
	
	@Override
	public void execute(final IDataEntityRuntime iDataEntityRuntime, final  IEntityBase data, final  IEntityBase last, final  String strActionMode, final IPSDEAction iPSDEAction) {
		try {
			this.onExecute(iDataEntityRuntime, data, last, strActionMode, iPSDEAction);
		}
		catch (Throwable ex) {
			log.error(String.format("实体[%1$s]执行属性触发逻辑发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
		}
	}

	protected abstract void onExecute(final IDataEntityRuntime iDataEntityRuntime, final IEntityBase data, final IEntityBase last, final String strActionMode, final IPSDEAction iPSDEAction) throws Throwable;
	
}
