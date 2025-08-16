package net.ibizsys.runtime.res;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBValueFunc;
import net.ibizsys.runtime.ISystemRuntimeBase;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统值函数运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysValueFuncRuntimeBase extends SystemModelRuntimeBase implements ISysValueFuncRuntime {

	private IPSSysDBValueFunc iPSSysDBValueFunc = null;

	@Override
	public void init(ISystemRuntimeBase iSystemRuntimeBase, IPSSysDBValueFunc iPSSysDBValueFunc) throws Exception {
		this.setSystemRuntimeBase(iSystemRuntimeBase);
		this.iPSSysDBValueFunc = iPSSysDBValueFunc;

		this.onInit();
	}

	public IPSSysDBValueFunc getPSSysDBValueFunc() {
		return this.iPSSysDBValueFunc;
	}

	@Override
	public String getId() {
		return getPSSysDBValueFunc().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysDBValueFunc().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDBValueFunc();
	}

}
