package net.ibizsys.runtime.res;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysSequence;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统值序列运行时基类
 * 
 * @author lionlau
 *
 */
public abstract class SysSequenceRuntimeBase extends SystemModelRuntimeBase implements ISysSequenceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSequenceRuntimeBase.class);
	
	private IPSSysSequence iPSSysSequence = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysSequence iPSSysSequence) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysSequence = iPSSysSequence;
		this.onInit();
	}

	

	public IPSSysSequence getPSSysSequence() {
		return this.iPSSysSequence;
	}

	@Override
	public String getId() {
		return getPSSysSequence().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysSequence().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSSysSequence();
	}

}
