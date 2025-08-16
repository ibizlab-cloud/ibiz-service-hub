package net.ibizsys.central.app.dataentity.uilogic;

import net.ibizsys.central.app.dataentity.IAppDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.dataentity.IPSAppDEUILogic;
import net.ibizsys.runtime.ModelRuntimeBase;

public abstract class AppDEUILogicRuntimeBase extends ModelRuntimeBase implements IAppDEUILogicRuntime{

	private IAppDataEntityRuntimeContext iAppDataEntityRuntimeContext = null;
	private IPSAppDEUILogic iPSAppDEUILogic = null;
	
	@Override
	public void init(IAppDataEntityRuntimeContext iAppDataEntityRuntimeContext, IPSAppDEUILogic iPSAppDEUILogic) throws Exception {
		this.iAppDataEntityRuntimeContext = iAppDataEntityRuntimeContext;
		this.iPSAppDEUILogic = iPSAppDEUILogic;
		this.onInit();
	}
	

	@Override
	public IPSModelObject getPSModelObject() {
		return this.iPSAppDEUILogic;
	}

	protected IAppDataEntityRuntimeContext getAppDataEntityRuntimeContext() {
		return this.iAppDataEntityRuntimeContext;
	}
}
