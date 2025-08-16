package net.ibizsys.central.plugin.extension.dataentity.defield;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.defield.DEFValueRuleRuntimeBaseBase;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule;

public class AddinDEFValueRuleRuntimeBase extends DEFValueRuleRuntimeBaseBase {

	private final ISystemRuntime iSystemRuntime;
	private final IDataEntityRuntime iDataEntityRuntime;
	private final IPSDEFValueRule iPSDEFValueRule;
	private IPSDEField iPSDEField = null;
	
	public AddinDEFValueRuleRuntimeBase(ISystemRuntime iSystemRuntime, IDataEntityRuntime iDataEntityRuntime, IPSDEFValueRule iPSDEFValueRule) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		Assert.notNull(iDataEntityRuntime, "传入实体运行时对象无效");
		Assert.notNull(iPSDEFValueRule, "传入实体属性值规则模型对象无效");
		
		this.iSystemRuntime = iSystemRuntime;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.iPSDEFValueRule = iPSDEFValueRule;
	}
	
	@Override
	protected IPSDEField getPSDEField() {
		if(this.iPSDEField == null) {
			IPSDEField iPSDEField = super.getPSDEField();
			if(iPSDEField != null) {
				this.iPSDEField = this.getDataEntityRuntime().getPSDEField(iPSDEField.getName());
			}
		}
		return this.iPSDEField;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	@Override
	public IPSDEFValueRule getPSDEFValueRule() {
		return this.iPSDEFValueRule;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	
}
