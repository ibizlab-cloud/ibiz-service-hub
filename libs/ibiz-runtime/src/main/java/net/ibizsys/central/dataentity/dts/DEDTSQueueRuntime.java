package net.ibizsys.central.dataentity.dts;


public class DEDTSQueueRuntime extends net.ibizsys.runtime.dataentity.dts.DEDTSQueueRuntime implements IDEDTSQueueRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDTSQueueRuntime.class);
	
	private int cancelTimeout = -1;
	private int refreshTimer = -1;
	
	@Override
	protected void onInit() throws Exception {
		this.setCancelTimeout(this.getPSDEDTSQueue().getCancelTimeout());
		this.setRefreshTimer(this.getPSDEDTSQueue().getRefreshTimer());
		super.onInit();
	}
	
	@Override
	public int getCancelTimeout() {
		return this.cancelTimeout;
	}

	@Override
	public int getRefreshTimer() {
		return this.refreshTimer;
	}
	
	protected void setCancelTimeout(int cancelTimeout) {
		this.cancelTimeout = cancelTimeout;
	}

	protected void setRefreshTimer(int refreshTimer) {
		this.refreshTimer = refreshTimer;
	}

	@Override
	public void confirm(Object[] args, Object result) throws Throwable {
		this.onConfirm(args, result);
	}
	
	protected void onConfirm(Object[] args, Object result) throws Throwable {
		
	}
	

	@Override
	public void cancel(Object[] args, Object result, boolean timeout) throws Throwable {
		this.onCancel(args, result, timeout);
	}

	protected void onCancel(Object[] args, Object result, boolean timeout) throws Throwable {
		
	}
	
	@Override
	public Object execute(Object[] args) throws Throwable {
		throw new Exception("没有实现");
	}
}
