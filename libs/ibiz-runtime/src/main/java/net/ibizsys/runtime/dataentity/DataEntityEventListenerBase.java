package net.ibizsys.runtime.dataentity;

public abstract class DataEntityEventListenerBase implements IDataEntityEventListener{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityEventListenerBase.class);
	
	@Override
	public void receiveEvent(IDataEntityRuntime iDataEntityRuntime, String event, Object[] params) {
		try {
			this.onReceiveEvent(iDataEntityRuntime, event, params);
		}
		catch (Throwable ex) {
			log.error(String.format("实体[%1$s]事件[%2$s]处理发生异常，%3$s", iDataEntityRuntime.getName(), event, ex.getMessage()), ex);
		}
	}
	
	protected void onReceiveEvent(IDataEntityRuntime iDataEntityRuntime, String event, Object[] params) throws Throwable {
		switch(event) {
		case EVENT_SYNCENTITY:
			this.onSyncEntity(iDataEntityRuntime, params);
			break;
		default:
			log.warn(String.format("实体[%1$s]事件[%2$s]未识别", iDataEntityRuntime.getName(), event));
			break;
		}
	}
	
	protected void onSyncEntity(IDataEntityRuntime iDataEntityRuntime, Object[] params) throws Throwable {
		
	}

}
