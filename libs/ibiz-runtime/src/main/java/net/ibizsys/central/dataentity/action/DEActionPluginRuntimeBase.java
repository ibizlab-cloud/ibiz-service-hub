package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;

public abstract class DEActionPluginRuntimeBase implements IDEActionPluginRuntime {

	@Override
	public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		return this.onExecute(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
	}

	protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		return this.onExecute(args);
	}

	protected Object onExecute(Object[] args) throws Throwable {
		// 判断参数类型，进行调用
		if (args != null && args.length > 0) {
			Object arg = args[0];
			if (arg instanceof IEntityDTO) {
				return this.onExecute((IEntityDTO) arg);
			}

			return onExecute(arg);
		}

		throw new Exception("没有实现");
	}
	
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		return onExecute((Object) iEntityDTO);
	}

	
	protected Object onExecute(Object obj) throws Throwable {
		throw new Exception("没有实现");
	}

}
