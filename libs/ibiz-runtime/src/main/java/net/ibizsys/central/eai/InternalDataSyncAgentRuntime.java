package net.ibizsys.central.eai;

import java.util.List;

import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.res.SysDataSyncAgentRuntimeBase;
import net.ibizsys.runtime.util.domain.DataSyncIn;
import net.ibizsys.runtime.util.domain.DataSyncOut;

public class InternalDataSyncAgentRuntime extends SysDataSyncAgentRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(InternalDataSyncAgentRuntime.class);
	
	@Override
	public boolean isInternalAgent() {
		return true;
	}
	
	@Override
	public boolean isRawDataMode() {
		//内部通讯代理禁用直接数据模型
		return false;
	}
	
	
	@Override
	public void send(DataSyncOut[] dataSyncOuts) {
		if(dataSyncOuts == null || dataSyncOuts.length == 0) {
			return;
		}
		
		final List<IDEDataSyncInRuntime> list = this.getDEDataSyncInRuntimeList();
		if(list == null || list.size() == 0) {
			return;
		}
		
		try {
			DataSyncIn[] dataSyncIns = getDataSyncIns(dataSyncOuts);
			for(IDEDataSyncInRuntime iDEDataSyncInRuntime : list) {
				iDEDataSyncInRuntime.recv(dataSyncIns);
			}
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("发送数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	protected DataSyncIn[] getDataSyncIns(DataSyncOut[] dataSyncOuts) throws Throwable{
		DataSyncIn[] dataSyncIns = new DataSyncIn[dataSyncOuts.length];
		for(int i=0;i<dataSyncOuts.length;i++) {
			dataSyncIns[i] = this.getDataSyncIn(dataSyncOuts[i]);
		}
		return dataSyncIns;
	}
	
	protected DataSyncIn getDataSyncIn(DataSyncOut dataSyncOut) throws Throwable {
		DataSyncIn dataSyncIn = new DataSyncIn();
		dataSyncIn.putAll(dataSyncOut.any());
		return dataSyncIn;
	}
}
