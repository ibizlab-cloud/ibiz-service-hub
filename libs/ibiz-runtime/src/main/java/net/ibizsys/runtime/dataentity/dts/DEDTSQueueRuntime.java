package net.ibizsys.runtime.dataentity.dts;

import org.springframework.util.Assert;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.runtime.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.dts.ISysDTSQueueRuntime;
import net.ibizsys.runtime.util.ASFutureActionBase;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体异步处理队列运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DEDTSQueueRuntime extends DataEntityModelRuntimeBase implements IDEDTSQueueRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDTSQueueRuntime.class);

	private IPSDEDTSQueue iPSDEDTSQueue = null;
	private ISysDTSQueueRuntime iSysDTSQueueRuntime = null;
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDTSQueue iPSDEDTSQueue) throws Exception {
		Assert.notNull(iDataEntityRuntimeBaseContext, "传入实体运行时上下文对象无效");
		Assert.notNull(iPSDEDTSQueue, "传入实体异步处理队列模型对象无效");

		this.setDataEntityRuntimeBaseContext(iDataEntityRuntimeBaseContext);
	
		this.iPSDEDTSQueue = iPSDEDTSQueue;

		Assert.notNull(this.getPSDEDTSQueue().getPSSysDTSQueue(), "没有指定使用的系统异步处理队列");

		this.iSysDTSQueueRuntime = this.getSystemRuntime().getSysDTSQueueRuntime(this.getPSDEDTSQueue().getPSSysDTSQueue());
		

		this.onInit();
	}

	@Override
	public IPSDEDTSQueue getPSDEDTSQueue() {
		return this.iPSDEDTSQueue;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEDTSQueue();
	}

	
	
	
	@Override
	public String getId() {
		if (getPSDEDTSQueue() != null) {
			return getPSDEDTSQueue().getId();
		}
		return null;
	}

	@Override
	public String getName() {
		if (getPSDEDTSQueue() != null) {
			return getPSDEDTSQueue().getName();
		}
		return null;
	}
	
	public ISysDTSQueueRuntime getSysDTSQueueRuntime() {
		return this.iSysDTSQueueRuntime;
	}
	

	@Override
	public void push(IEntityBase iEntityBase) {
		
		Object objKey = this.getDataEntityRuntime().getFieldValue(iEntityBase, this.getDataEntityRuntime().getKeyPSDEField());
		final String strActionId = String.format("%1$s|%2$s",this.getDataEntityRuntime().getName(), objKey);
		//进入队列
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		actionSession.registerFutureAction(new ASFutureActionBase() {
			
			@Override
			public String getId(){
				return strActionId;
			}
			
			@Override
			public void commit() {
				getSysDTSQueueRuntime().push(iEntityBase);
			}
		} ,true);
		
	}

	
}
