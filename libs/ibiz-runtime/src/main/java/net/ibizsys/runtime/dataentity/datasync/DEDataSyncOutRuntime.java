package net.ibizsys.runtime.dataentity.datasync;

import org.springframework.util.Assert;

import net.ibizsys.model.PSModelEnums.DataSyncOutMode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.res.ISysDataSyncAgentRuntime;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.domain.DataSyncOut;

/**
 * 实体数据同步（输出）运行时对象实现
 * @author lionlau
 *
 */
public class DEDataSyncOutRuntime extends DEDataSyncRuntimeBase implements IDEDataSyncOutRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSyncOutRuntime.class);
	private ISysDataSyncAgentRuntime iSysDataSyncAgentRuntime = null;
	private boolean bSendImmediately = false;
	private boolean bRealTimeMode = true;
	
	@Override
	protected void onInit() throws Exception {
		
		Assert.notNull(this.getPSDEDataSync().getOutPSSysDataSyncAgent(),"没有指定输出的数据同步代理");
		
		if(this.getPSDEDataSync().getOutputMode() == DataSyncOutMode.REALTIME.value) {
			this.setRealTimeMode(true);
		}
		else {
			this.setRealTimeMode(false);
		}
		
		if(this.getDynaInstRuntime()!=null) {
			this.iSysDataSyncAgentRuntime = this.getDynaInstRuntime().getSysDataSyncAgentRuntime(this.getPSDEDataSync().getOutPSSysDataSyncAgent());
		}
		else {
			this.iSysDataSyncAgentRuntime = this.getSystemRuntime().getSysDataSyncAgentRuntime(this.getPSDEDataSync().getOutPSSysDataSyncAgent());
		}
		
		if(this.getSysDataSyncAgentRuntime().isInternalAgent()) {
			this.setSendImmediately(true);
		}
		
		super.onInit();
	}
	

	public ISysDataSyncAgentRuntime getSysDataSyncAgentRuntime() {
		return this.iSysDataSyncAgentRuntime;
	}
	
	@Override
	public boolean isSendImmediately() {
		return this.bSendImmediately;
	}
	
	protected void setSendImmediately(boolean bSendImmediately) {
		this.bSendImmediately = bSendImmediately;
	}
	
	@Override
	public boolean isRealTimeMode() {
		return this.bRealTimeMode;
	}
	
	protected void setRealTimeMode(boolean bRealTimeMode) {
		this.bRealTimeMode = bRealTimeMode;
	}

	@Override
	public void send(int nEvent, Object objData, Object actionData) {

		//判断是否为当前监控事件
		if((nEvent & this.getEventType()) == 0) {
			return;
		}
		
		boolean bImmediately = isSendImmediately();
		if(actionData instanceof Boolean) {
			bImmediately = (Boolean)bImmediately;
		}
		
		try {
			this.onSend(nEvent, objData, bImmediately);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("发送同步信息发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	
	@Override
	public void sendDirect(int nEvent, Object objData) {
		try {
			this.onSend(nEvent, objData, true);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("发送同步信息发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	/**
	 * 发送同步信息
	 * @param nEvent
	 * @param objData
	 * @param bImmediately
	 * @throws Throwable
	 */
	protected void onSend(int nEvent, Object objData, boolean bImmediately) throws Throwable{
		DataSyncOut dataSyncOut = new DataSyncOut();
		dataSyncOut.setEventType(nEvent);
		Object objKey = null;
		Object objSendData = null;
		if(objData instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getFieldValue((IEntityBase)objData, this.getDataEntityRuntime().getKeyPSDEField());
			//后续要判断是否需要附加租户标识（实体启用SaaS模式）
			objSendData = this.getDataEntityRuntime().serializeEntity((IEntityBase)objData);
		}
		else {
			objKey = objData;
		}
		dataSyncOut.setDataKey(DataTypeUtils.getStringValue(objKey, null));
		dataSyncOut.setData(DataTypeUtils.getStringValue(objSendData, null));
		dataSyncOut.setDEId(this.getDataEntityRuntime().getId());
		dataSyncOut.setDEName(this.getDataEntityRuntime().getName());
		dataSyncOut.setCreateDate(new java.sql.Timestamp(System.currentTimeMillis()));
		
		this.doSend(dataSyncOut, bImmediately);
	}
	
	
	protected void doSend(DataSyncOut dataSyncOut, boolean bImmediately) throws Throwable{
		if(bImmediately) {
			getSysDataSyncAgentRuntime().send(new DataSyncOut[] {dataSyncOut});
		}
		else {
			final String strActionId = String.format("%1$s|%2$s|%3$s",this.getDataEntityRuntime().getName(), dataSyncOut.getDataKey() ,dataSyncOut.getEventType());
			//进入队列
			ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
			actionSession.registerFutureAction(new ASFutureActionBase() {
				
				@Override
				public String getId(){
					return strActionId;
				}
				
				@Override
				public void commit() {
					getSysDataSyncAgentRuntime().send(new DataSyncOut[] {dataSyncOut});
				}
			}, true);
		}
	}


	
	
}
