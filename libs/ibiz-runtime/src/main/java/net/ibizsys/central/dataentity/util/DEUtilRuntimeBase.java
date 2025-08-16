package net.ibizsys.central.dataentity.util;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.util.DEUtilTypes;
import net.ibizsys.runtime.plugin.IModelRTAddin;
import net.ibizsys.runtime.plugin.ModelRTAddinRepo;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.LogLevels;

public abstract class DEUtilRuntimeBase extends net.ibizsys.runtime.dataentity.util.DEUtilRuntimeBase implements IDEUtilRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEUtilRuntimeBase.class);
	private String strLogCat = null;
	private ModelRTAddinRepo modelRTAddinRepo = null;
	private IDEUtilRuntimeContext iDEUtilRuntimeContext;
	
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEUtil iPSDEUtil) throws Exception {
		super.init(iDataEntityRuntimeContext, iPSDEUtil);
		if(this.getAddinRepo(true) == null) {
			this.prepareAddinRepo();
		}
	}
	
	protected void prepareAddinRepo() throws Exception {
		
	}
	
	@Override
	protected void onInit() throws Exception {
		this.strLogCat = this.getPSDEUtil().getUtilType();
		if(DEUtilTypes.USER.equals(this.strLogCat)) {
			this.strLogCat = this.getPSDEUtil().getUtilTag();
		}
		super.onInit();
	}
	
	protected IDEUtilRuntimeContext getModelRuntimeContext() {
		if(this.iDEUtilRuntimeContext == null) {
			this.iDEUtilRuntimeContext = this.createModelRuntimeContext();
		}
		return this.iDEUtilRuntimeContext;
	}
	
	private DEUtilRuntimeBase getSelf() {
		return this;
	}
	
	protected IDEUtilRuntimeContext createModelRuntimeContext() {
		return new DEUtilRuntimeContextBase() {
			
			@Override
			public IDEUtilRuntime getModelRuntime() {
				return getSelf();
			}

			@Override
			public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
				return getSelf().getAddins(cls, strTypePrefix);
			}
			
			@Override
			public net.ibizsys.central.dataentity.IDataEntityRuntimeContext getDataEntityRuntimeContext() {
				return getSelf().getDataEntityRuntimeContext();
			}
		};
	}
	
	protected net.ibizsys.central.dataentity.IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return (net.ibizsys.central.dataentity.IDataEntityRuntimeContext)super.getDataEntityRuntimeContext();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return null;
	}

	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return null;
	}


	protected ModelRTAddinRepo getAddinRepo(boolean bTryMode) throws Exception{
		if (this.modelRTAddinRepo != null || bTryMode) {
			return this.modelRTAddinRepo;
		}
		throw new Exception("插件仓库无效");
	}

	protected ModelRTAddinRepo getAddinRepo() {
		try {
			return this.getAddinRepo(false);
		}
		catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}

	protected void setAddinRepo(ModelRTAddinRepo modelRTAddinRepo) {
		this.modelRTAddinRepo = modelRTAddinRepo;
	}

	protected void prepareAddinRepo(IModelRuntimeContext ctx, Class<? extends IModelRTAddin> addinCls, String strTypePrefix) throws Exception {
		ModelRTAddinRepo modelRTAddinRepo = new ModelRTAddinRepo();
		modelRTAddinRepo.init(ctx, addinCls, strTypePrefix, this.getDataEntityRuntime().getSystemRuntime().getRuntimeObjectFactory());
		this.setAddinRepo(modelRTAddinRepo);
	}

	protected <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getAddinRepo().getAddins(cls, strTypePrefix);
	}
	
	protected void executeAction(String strActionName, IAction iAction) {
		this.executeAction(strActionName, iAction, null, Object.class, getLogPOTime());
	}
	
	
	protected Object executeAction(String strActionName, IAction iAction, Object[] args) {
		return this.executeAction(strActionName, iAction, args, Object.class, getLogPOTime());
	}
	
	
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls) {
		return this.executeAction(strActionName, iAction, args, cls, getLogPOTime());
	}
	

	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type) {
		return this.executeAction(strActionName, iAction, args, type, getLogPOTime());
	}
	

	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, Class<T> cls, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
			long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	/**
	 * 使用闭包的方式执行行为，提供缓存及性能监测
	 * @param strActionName
	 * @param iAction
	 * @param args
	 * @param cls
	 * @param nPOTime
	 * @return
	 * @throws Throwable
	 */
	protected <T> T executeAction(String strActionName, IAction iAction, Object[] args, TypeReference<T> type, int nPOTime) {
		try {
			long nBeginTime = System.currentTimeMillis();
			Object objRet = iAction.execute(args);
					long bEndTime = System.currentTimeMillis();
			if(bEndTime - nBeginTime > nPOTime) {
				log.warn(String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime));
				this.getSystemRuntime().logPO(LogLevels.WARN, getLogCat(), String.format("执行[%1$s]耗时[%2$s]ms", strActionName, bEndTime - nBeginTime), this.getLogicName(), strActionName, bEndTime - nBeginTime, null);
			}
			return (T)objRet;
		}
		catch (Throwable ex) {
			log.error(String.format("%1$s[%2$s]发生异常，%3$s", this.getLogicName(), strActionName, ex.getMessage()), ex);
			throw dealException(String.format("%1$s发生异常，%2$s", strActionName, ex.getMessage()), ex);
		}
	}
	
	@Override
	public Object executeAction(String strActionName, Object[] args) {
		return this.executeAction(strActionName, new IAction() {

			@Override
			public Object execute(Object[] args) throws Throwable {
				return onExecuteAction(strActionName, args);
			}
			
		}, args);
	}
	
	protected Object onExecuteAction(String strActionName, Object[] args) throws Throwable{
		throw new Exception(String.format("不支持的行为[%1$s]", strActionName));
	}
	
	
	protected RuntimeException dealException(String strMessage, Throwable ex) {
		this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("%1$s%2$s", getLogicName(), strMessage), null);
//		if(ex instanceof ISystemRuntimeException) {
//			return (RuntimeException)ex;
//		}
		return new DataEntityRuntimeException(this.getDataEntityRuntime(), this, strMessage, ex);
	}
	
	protected String getLogCat() {
		return this.strLogCat;
	}
	
	
	protected int getLogPOTime() {
		return ActionSessionManager.getLogPOTime();
	}

	
}
