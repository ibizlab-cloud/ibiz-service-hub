package net.ibizsys.runtime.msg;


import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.msg.IPSSysMsgQueue;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemRuntimeSetting;
import net.ibizsys.runtime.SystemModelRuntimeBase;

/**
 * 系统消息队列运行时基类
 * @author lionlau
 *
 */
public abstract class SysMsgQueueRuntimeBase extends SystemModelRuntimeBase implements ISysMsgQueueRuntime{

	private IPSSysMsgQueue iPSSysMsgQueue = null;
	
	/**
	 * 获取消息队列的配置目录
	 * @param iPSSysMsgQueue
	 * @return
	 */
	public static String getConfigFolder(IPSSysMsgQueue iPSSysMsgQueue) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSMSGQUEUE + "." + PSModelUtils.calcUniqueTag(iPSSysMsgQueue.getPSSystemModule(), iPSSysMsgQueue.getCodeName());
	}
	
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgQueue iPSSysMsgQueue) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysMsgQueue = iPSSysMsgQueue;
		this.setConfigFolder(getConfigFolder(iPSSysMsgQueue));
		this.onInit();
	}
	
	
	public IPSSysMsgQueue getPSSysMsgQueue() {
		return this.iPSSysMsgQueue;
	}
	

	@Override
	public String getId() {
		return getPSSysMsgQueue().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysMsgQueue().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysMsgQueue();
	}

	
	
	
}
