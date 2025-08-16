package net.ibizsys.runtime.res;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysLogic;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统逻辑运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysLogicRuntimeBase extends SystemModelRuntimeBase implements ISysLogicRuntime {

	private static final Log log = LogFactory.getLog(SysLogicRuntimeBase.class);
	private IPSSysLogic iPSSysLogic = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysLogic iPSSysLogic) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysLogic = iPSSysLogic;

		this.onInit();
	}

	@Override
	public IPSSysLogic getPSSysLogic() {
		return this.iPSSysLogic;
	}

	@Override
	public String getId() {
		return getPSSysLogic().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysLogic().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysLogic();
	}

}
