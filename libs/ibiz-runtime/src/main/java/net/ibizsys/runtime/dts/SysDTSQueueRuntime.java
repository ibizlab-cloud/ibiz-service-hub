package net.ibizsys.runtime.dts;


import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dts.IPSSysDTSQueue;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统异步处理队列运行时
 * @author lionlau
 *
 */
public class SysDTSQueueRuntime extends SystemModelRuntimeBase implements ISysDTSQueueRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDTSQueueRuntime.class);
	
	private IPSSysDTSQueue iPSSysDTSQueue = null;

	
	protected class DTSQueueEntity {
		private IEntityBase iEntity = null;
		private long nStartTime = 0l;
		private long nLastRefreshTime = 0l;
		private Object objState = null;
		private Object objKey = null;
		public DTSQueueEntity(IEntityBase iEntity, Object objKey){
			this.iEntity = iEntity;
			this.objKey = objKey;
			this.nStartTime = System.currentTimeMillis();
			updateRefreshTime();
		}

		/**
		 * 获取数据对象
		 * @return
		 */
		public IEntityBase getEntity(){
			return this.iEntity;
		}
		
		public Object getState(){
			return objState;
		}
	
		
		public void setState(Object objState){
			this.objState = objState;
		}
		
		
		public Object getKey(){
			return this.objKey;
		}
		
		
		/**
		 * 更新刷新时间
		 */
		public void updateRefreshTime(){
			this.nLastRefreshTime = System.currentTimeMillis();
		}
		
		
		/**
		 * 获取开始时间
		 * @return
		 */
		public long getStartTime(){
			return this.nStartTime;
		}
		
		/**
		 * 获取最后刷新时间
		 * @return
		 */
		public long getLastRefreshTime(){
			return this.nLastRefreshTime;
		}
	}
	
	
	private Map<Object, DTSQueueEntity> dtsQueueEntityMap = new HashMap<Object, DTSQueueEntity>();

	
	private IDataEntityRuntime iDataEntityRuntime = null;
	private IPSDEAction pushPSDEAction = null;
	private IPSDEAction refreshPSDEAction = null;
	private IPSDEAction confirmPSDEAction = null;
	private IPSDEAction cancelPSDEAction = null;
	private IPSDEField statePSDEField = null;
	private IPSDEField errorPSDEField = null;
	private Object createdState = null;
	private Object processingState = null;
	private Object finishedState = null;
	private Object failedState = null;
	private Object cancelledState = null;
	
	
	private int nCancelTimeout = 600000;//600秒
	private int nRefreshTimer = 2000;//2秒
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysDTSQueue iPSSysDTSQueue) throws Exception {
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysDTSQueue = iPSSysDTSQueue;
		this.onInit();
	}
	

	
	public IPSSysDTSQueue getPSSysDTSQueue() {
		return this.iPSSysDTSQueue;
	}
	

	@Override
	public String getId() {
		return getPSSysDTSQueue().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysDTSQueue().getName();
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDTSQueue();
	}
	
	@Override
	protected void onInit() throws Exception {
		this.setPushPSDEAction(this.getPSSysDTSQueue().getPushPSDEActionMust());
		this.setCancelPSDEAction(this.getPSSysDTSQueue().getCancelPSDEAction());
		this.setConfirmPSDEAction(this.getPSSysDTSQueue().getConfirmPSDEAction());
		this.setRefreshPSDEAction(this.getPSSysDTSQueue().getRefreshPSDEAction());
		this.setStatePSDEField(this.getPSSysDTSQueue().getStatePSDEFieldMust());
		this.setErrorPSDEField(this.getPSSysDTSQueue().getErrorPSDEFieldMust());
		
		this.setDataEntityRuntime(this.getSystemRuntime().getDataEntityRuntime(this.getPSSysDTSQueue().getPSDataEntityMust().getId(), false));
		
		if(StringUtils.hasLength(this.getPSSysDTSQueue().getCreatedState())) {
			this.setCreatedState(this.getSystemRuntime().convertValue(this.getStatePSDEField().getStdDataType(), this.getPSSysDTSQueue().getCreatedState()));
		}
		
		if(StringUtils.hasLength(this.getPSSysDTSQueue().getProcessingState())) {
			this.setProcessingState(this.getSystemRuntime().convertValue(this.getStatePSDEField().getStdDataType(), this.getPSSysDTSQueue().getProcessingState()));
		}
		
		if(StringUtils.hasLength(this.getPSSysDTSQueue().getFinishedState())) {
			this.setFinishedState(this.getSystemRuntime().convertValue(this.getStatePSDEField().getStdDataType(), this.getPSSysDTSQueue().getFinishedState()));
		}
		
		if(StringUtils.hasLength(this.getPSSysDTSQueue().getFailedState())) {
			this.setFailedState(this.getSystemRuntime().convertValue(this.getStatePSDEField().getStdDataType(), this.getPSSysDTSQueue().getFailedState()));
		}
		
		if(StringUtils.hasLength(this.getPSSysDTSQueue().getCancelledState())) {
			this.setCancelledState(this.getSystemRuntime().convertValue(this.getStatePSDEField().getStdDataType(), this.getPSSysDTSQueue().getCancelledState()));
		}
		
		if(this.getProcessingState() == null) {
			throw new ModelException(this.getPSSysDTSQueue(), "未指定处理中状态");
		}
	
		if(this.getFinishedState() == null) {
			throw new ModelException(this.getPSSysDTSQueue(), "未指定已完成状态");
		}
		
		if(this.getFailedState() == null) {
			throw new ModelException(this.getPSSysDTSQueue(), "未指定已失败状态");
		}
		
		if(this.getCancelledState() == null) {
			throw new ModelException(this.getPSSysDTSQueue(), "未指定已取消状态");
		}
		
		
		super.onInit();
	}
	
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	protected void setDataEntityRuntime(IDataEntityRuntime iDataEntityRuntime) {
		this.iDataEntityRuntime = iDataEntityRuntime;
	}
	
	
	protected IPSDEAction getPushPSDEAction() {
		return pushPSDEAction;
	}



	protected void setPushPSDEAction(IPSDEAction pushPSDEAction) {
		this.pushPSDEAction = pushPSDEAction;
	}



	protected IPSDEAction getRefreshPSDEAction() {
		return refreshPSDEAction;
	}



	protected void setRefreshPSDEAction(IPSDEAction refreshPSDEAction) {
		this.refreshPSDEAction = refreshPSDEAction;
	}



	protected IPSDEAction getConfirmPSDEAction() {
		return confirmPSDEAction;
	}



	protected void setConfirmPSDEAction(IPSDEAction confirmPSDEAction) {
		this.confirmPSDEAction = confirmPSDEAction;
	}



	protected IPSDEAction getCancelPSDEAction() {
		return cancelPSDEAction;
	}



	protected void setCancelPSDEAction(IPSDEAction cancelPSDEAction) {
		this.cancelPSDEAction = cancelPSDEAction;
	}

	
	

	protected IPSDEField getStatePSDEField() {
		return statePSDEField;
	}



	protected void setStatePSDEField(IPSDEField statePSDEField) {
		this.statePSDEField = statePSDEField;
	}



	protected IPSDEField getErrorPSDEField() {
		return errorPSDEField;
	}



	protected void setErrorPSDEField(IPSDEField errorPSDEField) {
		this.errorPSDEField = errorPSDEField;
	}
	
	
	protected Object getCreatedState() {
		return createdState;
	}



	protected void setCreatedState(Object createdState) {
		this.createdState = createdState;
	}



	protected Object getProcessingState() {
		return processingState;
	}



	protected void setProcessingState(Object processingState) {
		this.processingState = processingState;
	}



	protected Object getFinishedState() {
		return finishedState;
	}



	protected void setFinishedState(Object finishedState) {
		this.finishedState = finishedState;
	}



	protected Object getFailedState() {
		return failedState;
	}



	protected void setFailedState(Object failedState) {
		this.failedState = failedState;
	}



	protected Object getCancelledState() {
		return cancelledState;
	}



	protected void setCancelledState(Object cancelledState) {
		this.cancelledState = cancelledState;
	}

	


	protected int getCancelTimeout() {
		return nCancelTimeout;
	}



	protected void setCancelTimeout(int nCancelTimeout) {
		this.nCancelTimeout = nCancelTimeout;
	}



	protected int getRefreshTimer() {
		return nRefreshTimer;
	}



	protected void setRefreshTimer(int nRefreshTimer) {
		this.nRefreshTimer = nRefreshTimer;
	}



	@Override
	public void timeout() {
		
	}

	
	
	

	@Override
	public void push(IEntityBase iEntityBase) {
		Object objKey = this.getDataEntityRuntime().getKeyFieldValue(iEntityBase);
		if(ObjectUtils.isEmpty(objKey)) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "数据对象未指定键值");
		}

		DTSQueueEntity dtsQueueEntity = null;
		synchronized (dtsQueueEntityMap) {
			if(!dtsQueueEntityMap.containsKey(objKey)){
				dtsQueueEntity = new DTSQueueEntity(iEntityBase,objKey);
				dtsQueueEntityMap.put(objKey, dtsQueueEntity);
			}
		}
		
		if(dtsQueueEntity == null)
			return;
		
		push(dtsQueueEntity);
	}

	/**
	 * 推送队列数据
	 * @param dtsQueueEntity
	 */
	protected void push(final DTSQueueEntity dtsQueueEntity){
		this.getSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				executeQueueAction(dtsQueueEntity, getPushPSDEAction() ,getProcessingState());
			}
		}, -1);
	}
	
	
	/**
	 * 推送队列数据
	 * @param dtsQueueEntity
	 */
	protected void refresh(final DTSQueueEntity dtsQueueEntity){
		long nCurTime = System.currentTimeMillis();
		if(nCurTime - dtsQueueEntity.getStartTime() > getCancelTimeout()){
			if(this.getCancelPSDEAction()!=null) {
				executeQueueAction(dtsQueueEntity,this.getCancelPSDEAction(),this.getCancelledState());
			}
			synchronized (dtsQueueEntityMap) {
				dtsQueueEntityMap.remove(dtsQueueEntity.getKey());
			}
			return;
		}
		
		if(this.getRefreshPSDEAction() != null) {
			this.getSystemRuntime().threadRun(new Runnable() {
				@Override
				public void run() {
					executeQueueAction(dtsQueueEntity,getRefreshPSDEAction(), getProcessingState());
				}
			}, nCurTime + this.getRefreshTimer());
		}
		else {
			synchronized (dtsQueueEntityMap) {
				dtsQueueEntityMap.remove(dtsQueueEntity.getKey());
			}
		}
		
	}
	
	/**
	 * 执行队列操作
	 * @param dtsQueueEntity
	 * @param strAction
	 * @param nQueueState
	 */
	protected void executeQueueAction(final DTSQueueEntity dtsQueueEntity,final IPSDEAction iPSDEAction,final Object queueState){
		
		IEntityBase et = null;
		Object curState = null;
		DTSQueueEntity moveDTSQueueEntity = null;
		try{
			et = this.getDataEntityRuntime().clone(dtsQueueEntity.getEntity(), false);
			this.getDataEntityRuntime().executeAction(iPSDEAction.getName(), iPSDEAction, new Object[] {et});
			curState = this.getDataEntityRuntime().getFieldValue(et, this.getStatePSDEField());
			if(curState == null) {
				curState = queueState;
			}
			
			synchronized (dtsQueueEntityMap) {
				DTSQueueEntity dtsQueueEntity2 = dtsQueueEntityMap.get(dtsQueueEntity.getKey());
				if(dtsQueueEntity2!=null){
					if(curState.equals(this.getFinishedState())
							|| curState.equals(this.getFailedState())
							|| curState.equals(this.getCancelledState())) {
						dtsQueueEntityMap.remove(dtsQueueEntity2.getKey());
						moveDTSQueueEntity = dtsQueueEntity2;
					}
					else {
						dtsQueueEntity2.setState(curState);
						refresh(dtsQueueEntity2);
						return;
					}
				}
			}
		}
		catch(Throwable ex){
			log.error(ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("执行异步处理队列操作发生异常，%1$s", ex.getMessage()), ex);
		}
		
		//如果有确认行为，则调用
		try{
			if(curState.equals(this.getFinishedState())) {
				if(this.getConfirmPSDEAction() != null){
					this.getDataEntityRuntime().executeAction(getConfirmPSDEAction().getName(), getConfirmPSDEAction(), new Object[] {et});
				}
			}
		}
		catch(Throwable ex){
			//可能需要日志错误信息
			log.error(ex);
		}
		
		//判断是否需要移除
//		if(moveDTSQueueEntity!=null){
//			moveToHistory(moveDTSQueueEntity);
//		}
		
	}
	
}
