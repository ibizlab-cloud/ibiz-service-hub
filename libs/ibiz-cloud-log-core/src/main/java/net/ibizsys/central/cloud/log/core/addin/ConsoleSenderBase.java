package net.ibizsys.central.cloud.log.core.addin;

import java.util.List;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.log.core.cloudutil.ICloudLogUtilRuntimeContext;
import net.ibizsys.runtime.util.domain.Log;

public abstract class ConsoleSenderBase extends CloudLogUtilRTAddinBase implements IConsoleSender {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ConsoleSenderBase.class);

	private String strConfig = null;

	@Override
	public void init(ICloudLogUtilRuntimeContext ctx, String strSender, String strConfig) throws Exception {
		this.strConfig = strConfig;
		try {
			this.setConfigEntity(new ConfigEntity(strConfig));
		} catch (Throwable ex) {
			throw new Exception(String.format("加载配置发生异常，%1$s", ex.getMessage()), ex);
		}

		this.init(ctx, strSender);
	}

	protected String getConfig() {
		return this.strConfig;
	}

	@Override
	public String getSender() {
		return (String) super.getAddinData();
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	public void send(List<Log> logs) {
		try {
			this.onSend(logs);
		} catch (Throwable ex) {
			log.debug(String.format("[%1$s]发送控制台信息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new RuntimeException(String.format("[%1$s]发送控制台信息发生异常，%2$s", this.getName(), ex.getMessage()), ex);
		}
	}

	abstract void onSend(List<Log> logs) throws Throwable;
}
