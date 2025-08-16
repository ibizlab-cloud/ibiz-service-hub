package net.ibizsys.central.cloud.core.msg;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.model.PSModelEnums.MsgTemplType;
import net.ibizsys.runtime.util.DateUtils;

public abstract class SysMsgTemplRuntimeBase extends net.ibizsys.central.msg.SysMsgTemplRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysMsgTemplRuntimeBase.class);
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		if(this.getMsgTemplType() == MsgTemplType.DE) {
			this.listenReloadSignal();
		}
	}
	
	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
	}
	
	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("消息模板[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				superReset();
			}
		});
	}
	
	@Override
	public synchronized void reset() {
		if(this.getMsgTemplType() == MsgTemplType.DE) {
			String strReloadSignalId = getReloadSignalId();
			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("reloaddate", DateUtils.getCurTimeString2());
			ServiceHub.getInstance().publishConfig(strReloadSignalId, map);
			
			return;
		}
		super.reset();
	}
	
	public synchronized void superReset() {
		super.reset();
	}
}
