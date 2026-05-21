package net.ibizsys.central.cloud.core.sysutil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntimeBase;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.INamedAction;

public abstract class SysUtilRuntimeBase extends net.ibizsys.central.sysutil.SysUtilRuntimeBase implements ISysUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysUtilRuntimeBase.class);
	private int workThreadCorePoolSize = 10;
	private int workThreadMaximumPoolSize = 40;
	private int workThreadBlockingQueueSize = 2000;
	private int workThreadBatchSize = 10;
	private ThreadPoolExecutor workThreadPoolExecutor = null;
	private boolean enableCloudReload = false;

	@Override
	public IServiceSystemRuntimeBase getSystemRuntime() {
		return (IServiceSystemRuntimeBase) super.getSystemRuntime();
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		this.workThreadCorePoolSize = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".workthread.corepoolsize", this.workThreadCorePoolSize);
		this.workThreadMaximumPoolSize = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".workthread.maximumpoolsize", this.workThreadMaximumPoolSize);
		this.workThreadBlockingQueueSize = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".workthread.blockingqueuesize", this.workThreadBlockingQueueSize);
		this.workThreadBatchSize = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".workthread.batchsize", this.workThreadBatchSize);
		super.onPrepareDefaultSetting();
	}

	protected void prepareWorkThreadPoolExecutor() throws Exception {
		this.workThreadPoolExecutor = this.createWorkThreadPoolExecutor();
	}

	protected ThreadPoolExecutor getWorkThreadPoolExecutor(boolean tryMode) throws Exception {
		if (this.workThreadPoolExecutor != null || tryMode) {
			return this.workThreadPoolExecutor;
		}
		throw new Exception("工作线程池对象无效");
	}

	protected ThreadPoolExecutor createWorkThreadPoolExecutor() {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(getWorkThreadCorePoolSize(), getWorkThreadMaximumPoolSize(), 30, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(getWorkThreadBlockingQueueSize()), new ThreadPoolExecutor.AbortPolicy());
		return threadPoolExecutor;
	}

	protected int getWorkThreadCorePoolSize() {
		return this.workThreadCorePoolSize;
	}

	protected int getWorkThreadMaximumPoolSize() {
		return this.workThreadMaximumPoolSize;
	}

	protected int getWorkThreadBlockingQueueSize() {
		return this.workThreadBlockingQueueSize;
	}
	
	protected int getWorkThreadBatchSize() {
		return this.workThreadBatchSize;
	}

	protected void setWorkThreadCorePoolSize(int workThreadCorePoolSize) {
		this.workThreadCorePoolSize = workThreadCorePoolSize;
	}

	protected void setWorkThreadMaximumPoolSize(int workThreadMaximumPoolSize) {
		this.workThreadMaximumPoolSize = workThreadMaximumPoolSize;
	}

	protected void setWorkThreadBlockingQueueSize(int workThreadBlockingQueueSize) {
		this.workThreadBlockingQueueSize = workThreadBlockingQueueSize;
	}
	
	protected void setWorkThreadBatchSize(int workThreadBatchSize) {
		this.workThreadBatchSize = workThreadBatchSize;
	}

	@Override
	protected void onInstall() throws Exception {

		super.onInstall();
	}

	@Override
	protected void onUninstall() throws Throwable {
		this.enableCloudReload = false;
		this.shutdownWorkThreadPoolExecutor();
		super.onUninstall();
	}

	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
	}

	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		if (isEnableCloudReload()) {
			log.warn(String.format("%1$s已经监控重载配置，不能重复监控", getFullName()));
			return;
		}

		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("%1$s监控重载配置[%2$s]", this.getFullName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				localReload();
			}
		});
		this.enableCloudReload = true;
	}

	protected boolean isEnableCloudReload() {
		return this.enableCloudReload;
	}

	@Override
	public void reload() {
		try {
			if (this.isEnableCloudReload() && ServiceHub.getInstance().getServiceHubSetting().isPublishConfig()) {
				String strReloadSignalId = getReloadSignalId();
				Map<String, String> map = new LinkedHashMap<String, String>();
				map.put("reloaddate", DateUtils.getCurTimeString2());
				this.onFillReloadSignal(map);
				ServiceHub.getInstance().publishConfig(strReloadSignalId, map);
				return;
			}

			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onFillReloadSignal(Map<String, String> map) throws Throwable {

	}

	public void localReload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {

	}

	protected ISysAIUtilRuntime getSysAIUtilRuntime(boolean bTryMode) throws Exception {
		return this.getSystemRuntime().getSysAIUtilRuntime(bTryMode);
	}

	protected ISysKBUtilRuntime getSysKBUtilRuntime(boolean tryMode) throws Exception {
		return this.getSystemRuntime().getSysKBUtilRuntime(tryMode);
	}

	protected Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException, Object env) throws Throwable {
		Assert.notEmpty(actions, "传入行为数组无效");

		if (this.workThreadPoolExecutor == null) {
			return this.getSystemRuntime().threadRunAllOf(actions, bIgnoreException, env);
		}
		
		Map<String, Object> totalTaskRetMap = new LinkedHashMap<String, Object>();
		
		int nIndex = 0;
		int nBatchSize= getWorkThreadBatchSize();// getWorkThreadCorePoolSize() * 4;
		while(true) {
			
			if (!isThreadRunning()) {
				throw new InterruptedException("线程停止运行");
			}
			
			int nStart = nIndex * nBatchSize;
			int nEnd = Math.min((nIndex + 1) * nBatchSize, actions.size());
		
			Map<String, Object> taskRetMap = new LinkedHashMap<String, Object>();
			List<CompletableFuture<?>> taskList = new ArrayList<CompletableFuture<?>>();
			final IUserContext iUserContext = UserContext.getCurrent();
			
			for (int i = nStart; i < nEnd; i++) {
				IAction iAction = actions.get(i);
				Assert.notNull(iAction, String.format("#%1$s行为无效", i));

				String strActionName = String.format("#%1$s", i);
				if (iAction instanceof INamedAction) {
					String name = ((INamedAction) iAction).getName();
					Assert.hasLength(name, String.format("#%1$s行为名称无效", i));
					strActionName = name;
				}

				if (taskRetMap.containsKey(strActionName) || totalTaskRetMap.containsKey(strActionName)) {
					throw new Exception(String.format("出现重复的行为名称[%1$s]", strActionName));
				}
				taskRetMap.put(strActionName, null);

				final String strActionName2 = strActionName;

				CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {

					@Override
					public void run() {
						IUserContext last = UserContext.getCurrent();
						try {
							UserContext.setCurrent(getThreadTaskUserContext(iUserContext));
							doThreadRun(new Runnable() {
								public void run() {
									try {
										Object ret = iAction.execute(null);
										taskRetMap.put(strActionName2, ret);
									} catch (Throwable ex) {
										ExceptionUtils.rethrowRuntimeException(ex);
									}
								}
							}, strActionName2, env);
						} catch (Throwable ex) {
							ex = ExceptionUtils.unwrapThrowable(ex);
							log.error(String.format("行为[%1$s]执行发生异常，%2$s", strActionName2, ex.getMessage()), ex);
							taskRetMap.put(strActionName2, ex);
						} finally {
							UserContext.setCurrent(last);
						}
					}

				}, this.workThreadPoolExecutor);

				taskList.add(task);
			}

			if (taskList.size() > 0) {
				CompletableFuture.allOf(taskList.toArray(new CompletableFuture<?>[taskList.size()])).get();
				// 判断是否存在异常
				if (!bIgnoreException) {
					for (java.util.Map.Entry<String, Object> entry : taskRetMap.entrySet()) {
						if (entry.getValue() instanceof Throwable) {
							Throwable ex = (Throwable) entry.getValue();
							throw new Exception(String.format("行为[%1$s]执行发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
						}
					}
				}
			}
			
			totalTaskRetMap.putAll(taskRetMap);
			
			if(nEnd>= actions.size()) {
				break;
			}
			
			nIndex ++;
		}

		return totalTaskRetMap;
	}

	protected void threadRun(Runnable runnable, Object env) {

		if (this.workThreadPoolExecutor == null) {
			this.getSystemRuntime().threadRun(runnable);
			return;
		}

		final IUserContext iUserContext = UserContext.getCurrent();
		this.workThreadPoolExecutor.execute(new Runnable() {
			@Override
			public void run() {
				IUserContext last = UserContext.getCurrent();
				UserContext.setCurrent(getThreadTaskUserContext(iUserContext));
				try {
					doThreadRun(runnable, null, env);
				} catch (Throwable ex) {
					ExceptionUtils.rethrowRuntimeException(ex);
				} finally {
					UserContext.setCurrent(last);
				}
			}
		});
	}

	protected void shutdownWorkThreadPoolExecutor() {
		if (this.workThreadPoolExecutor != null) {
			try {
				this.workThreadPoolExecutor.shutdownNow();
			} catch (Throwable ex) {
				log.error(String.format("关闭工作线程池发生异常，%1$s", ex.getMessage()), ex);
			}
			this.workThreadPoolExecutor = null;
		}
	}

	protected void doThreadRun(Runnable runnable, String strTaskName, Object env) throws InterruptedException {
		if (!isThreadRunning()) {
			throw new InterruptedException("线程停止运行");
		}
		runnable.run();
	}

	protected IUserContext getThreadTaskUserContext(IUserContext iUserContext) {
		return iUserContext;
	}

	protected boolean isThreadRunning() {
		return true;
	}
}
