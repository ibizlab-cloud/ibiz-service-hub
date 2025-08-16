package net.ibizsys.runtime.msg;


import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.msg.IPSSysMsgTarget;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemRuntimeSetting;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统消息目标运行时基类
 * @author lionlau
 *
 */
public abstract class SysMsgTargetRuntimeBase extends SystemModelRuntimeBase implements ISysMsgTargetRuntime{

	private IPSSysMsgTarget iPSSysMsgTarget = null;
	
	
	/**
	 * 获取消息目标的配置目录
	 * @param iPSSysMsgTarget
	 * @return
	 */
	public static String getConfigFolder(IPSSysMsgTarget iPSSysMsgTarget) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSMSGTARGET + "." + PSModelUtils.calcUniqueTag(iPSSysMsgTarget.getPSSystemModule(), iPSSysMsgTarget.getCodeName());
	}
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgTarget iPSSysMsgTarget) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysMsgTarget = iPSSysMsgTarget;
		this.setConfigFolder(getConfigFolder(iPSSysMsgTarget));
		this.onInit();
	}
	
	
	public IPSSysMsgTarget getPSSysMsgTarget() {
		return this.iPSSysMsgTarget;
	}
	

	@Override
	public String getId() {
		return getPSSysMsgTarget().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysMsgTarget().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysMsgTarget();
	}

}
