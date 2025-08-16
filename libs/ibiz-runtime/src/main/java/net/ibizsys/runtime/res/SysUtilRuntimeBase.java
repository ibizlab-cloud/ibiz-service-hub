package net.ibizsys.runtime.res;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.runtime.ISystemRuntimeContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统功能运行时基类
 * @author lionlau
 *
 */
public abstract class SysUtilRuntimeBase extends SystemModelRuntimeBase implements ISysUtilRuntime{

	private IPSSysUtil iPSSysUtil = null;

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysUtil iPSSysUtil) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeContext);
		this.iPSSysUtil = iPSSysUtil;
		this.onInit();
	}
	
	
	
	public IPSSysUtil getPSSysUtil() {
		return this.iPSSysUtil;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysUtil();
	}
	


}
