package net.ibizsys.central.plugin.ai.sysutil.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportAgent;

public abstract class McpServerTransportAgentBase extends SysMcpServerUtilRTAddinBase implements IMcpServerTransportAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(McpServerTransportAgentBase.class);
	private boolean bStarted = false;
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("AI应用代理已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		this.closeGracefully().subscribe();
	}
	
	
	@Override
	public void close() {
		try {
			this.stop();
		} catch (Exception ex) {
			log.error(ex);
		}
	}
	
	
	@Override
	public String getType() {
		return (String) this.getAddinData();
	}
	
}