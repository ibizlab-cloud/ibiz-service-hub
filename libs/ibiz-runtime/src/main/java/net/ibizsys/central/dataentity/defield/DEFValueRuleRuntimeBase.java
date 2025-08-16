package net.ibizsys.central.dataentity.defield;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.dataentity.defield.IDEFValueRuleRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntityBase;

public abstract class DEFValueRuleRuntimeBase extends DataEntityModelRuntimeBase implements IDEFValueRuleRuntime  {

	private IPSDEFValueRule iPSDEFValueRule = null;
	private IPSDEField iPSDEField = null;
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContextBase, IPSDEFValueRule iPSDEFValueRule) throws Exception {
		this.setDataEntityRuntimeBaseContext(iDataEntityRuntimeBaseContextBase);
		this.setPSDEFValueRule(iPSDEFValueRule);
		this.setPSDEField(iPSDEFValueRule.getParentPSModelObject(IPSDEField.class));
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	public IPSDEFValueRule getPSDEFValueRule() {
		return this.iPSDEFValueRule;
	}
	
	protected void setPSDEFValueRule(IPSDEFValueRule iPSDEFValueRule) {
		this.iPSDEFValueRule = iPSDEFValueRule;
	}
	
	@Override
	public IPSDEField getPSDEField() {
		return this.iPSDEField;
	}
	
	protected void setPSDEField(IPSDEField iPSDEField) {
		this.iPSDEField = iPSDEField;
	}

	

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEFValueRule();
	}
	
	@Override
	public boolean test(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable {
		return this.onTest(objValue, iEntityBase, entityError);
	}
	
	protected boolean onTest(Object objValue, IEntityBase iEntityBase, EntityError entityError) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	
	
}
