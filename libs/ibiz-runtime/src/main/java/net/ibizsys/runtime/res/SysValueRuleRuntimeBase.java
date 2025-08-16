package net.ibizsys.runtime.res;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.valuerule.IPSSysValueRule;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统值规则运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysValueRuleRuntimeBase extends SystemModelRuntimeBase implements ISysValueRuleRuntime {

	private IPSSysValueRule iPSSysValueRule = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysValueRule iPSSysValueRule) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		
		this.iPSSysValueRule = iPSSysValueRule;
		this.onInit();
	}


	public IPSSysValueRule getPSSysValueRule() {
		return this.iPSSysValueRule;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysValueRule();
	}

	@Override
	public String getId() {
		return getPSSysValueRule().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysValueRule().getName();
	}

	@Override
	public boolean test(Object objSrcValue) throws Throwable {
		return test(objSrcValue, null, null, null);
	}

}
