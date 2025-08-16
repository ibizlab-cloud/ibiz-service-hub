package net.ibizsys.central.dataentity.action;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.action.IDEActionLogicRuntime;
import net.ibizsys.runtime.util.IEntityBase;

public abstract class DEActionLogicRuntimeBase extends DataEntityModelRuntimeBase implements IDEActionLogicRuntime{

	private IPSDEActionLogic iPSDEActionLogic = null;
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContextBase, IPSDEActionLogic iPSDEActionLogic) throws Exception {
		this.setDataEntityRuntimeBase(iDataEntityRuntimeBaseContextBase.getDataEntityRuntime());
		this.setPSDEActionLogic(iPSDEActionLogic);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	public IPSDEActionLogic getPSDEActionLogic() {
		return this.iPSDEActionLogic;
	}
	
	protected void setPSDEActionLogic(IPSDEActionLogic iPSDEActionLogic) {
		this.iPSDEActionLogic = iPSDEActionLogic;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEActionLogic();
	}
	
	@Override
	public String getAttachMode() {
		return getPSDEActionLogic().getAttachMode();
	}
	

	@Override
	public Object execute(IEntityBase iEntityBase) throws Throwable {
		return onExecute((IEntityDTO)iEntityBase);
	}

	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		throw new Exception("没有实现");
	}

}
