package net.ibizsys.runtime.res;

import java.util.ArrayList;
import java.util.List;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;

/**
 * 系统实体通知代理运行时基类
 * 
 * @author lionlau
 *
 */
public class SysNotifyAgentRuntime extends SystemModelRuntimeBase implements ISysNotifyAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysNotifyAgentRuntime.class);
	private List<IDENotifyRuntime> deNotifyRuntimeList = null;

	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		deNotifyRuntimeList = new ArrayList<IDENotifyRuntime>();
		this.onInit();
	}

	@Override
	public String getId() {
		return this.getSystemRuntimeBase().getId();
	}

	@Override
	public String getName() {
		return "系统通知代理";
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return null;
	}

	@Override
	public void registerDENotifyRuntime(IDENotifyRuntime iDENotifyRuntime) {

		this.deNotifyRuntimeList.add(iDENotifyRuntime);
	}

	@Override
	public void send() {
		if (this.deNotifyRuntimeList == null) {
			return;
		}

		for (IDENotifyRuntime iDENotifyRuntime : this.deNotifyRuntimeList) {
			try {
				iDENotifyRuntime.send();
			} catch (RuntimeException ex) {
				log.error(String.format("实体通知[%1$s]处理发生异常，%2$s", iDENotifyRuntime.getName(), ex.getMessage()), ex);
			}
		}
	}

}
