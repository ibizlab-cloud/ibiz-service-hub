package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;

public abstract class DEActionRuntimeBase extends DataEntityModelRuntimeBase implements IDEActionRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEActionRuntimeBase.class);
	
	private IPSDEAction iPSDEAction = null;
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction) throws Exception {
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDEAction(iPSDEAction);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	public IPSDEAction getPSDEAction() {
		return this.iPSDEAction;
	}
	
	protected void setPSDEAction(IPSDEAction iPSDEAction) {
		this.iPSDEAction = iPSDEAction;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEAction();
	}
	

	@Override
	public Object execute(Object[] args) throws Throwable {
		return onExecute(args);
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
