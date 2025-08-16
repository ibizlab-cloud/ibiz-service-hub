package net.ibizsys.central.cloud.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 配置侦听器仓库
 * @author lionlau
 *
 */
public class ConfigListenerRepo implements IConfigListenerRepo, IModelRuntimeShutdownable{

	private static final Log log = LogFactory.getLog(ConfigListenerRepo.class);
	
	private ISystemRuntime iSystemRuntime = null;
	private Map<String, List<IConfigListener>> configListenerListMap = new HashMap<String, List<IConfigListener>>();
	private Map<String, IConfigListener> proxyConfigListenerMap = new HashMap<String, IConfigListener>();
	
	private boolean bUnregisterWhenShutdown = false;
	
	public void init(ISystemRuntime iSystemRuntime, boolean bUnregisterWhenShutdown) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.bUnregisterWhenShutdown = bUnregisterWhenShutdown;
		this.onInit();
		if(this.bUnregisterWhenShutdown) {
			this.iSystemRuntime.unregisterModelRuntimeShutdownable(this);
		}
	}
	
	
	protected void onInit() throws Exception {
		
	}
	
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected boolean isUnregisterWhenShutdown() {
		return this.bUnregisterWhenShutdown;
	}

	@Override
	public synchronized void shutdown() throws Exception {
		
		if(!ObjectUtils.isEmpty(this.configListenerListMap)) {
			this.configListenerListMap.clear();
		}
		
		
		if(!ObjectUtils.isEmpty(this.proxyConfigListenerMap) ) {
			for(java.util.Map.Entry<String, IConfigListener> entry : this.proxyConfigListenerMap.entrySet()) {
				ServiceHub.getInstance().removeConfigListener(entry.getKey(), entry.getValue());
			}
			this.proxyConfigListenerMap.clear();
		}
		
		
		

	}
	
	@Override
	public synchronized void addConfigListener(String strConfigId, IConfigListener iConfigListener) {
		Assert.hasLength(strConfigId, "未传入配置标识");
		Assert.notNull(iConfigListener, "未传入配置侦听器");
		
		List<IConfigListener> list = this.configListenerListMap.get(strConfigId);
		if(!ObjectUtils.isEmpty(list)) {
			if(list.contains(iConfigListener)) {
				return;
			}
		}
		
		List<IConfigListener> list2 = new ArrayList<IConfigListener>();
		if(!ObjectUtils.isEmpty(list)) {
			list2.addAll(list);
		}
		list2.add(iConfigListener);
		this.configListenerListMap.put(strConfigId, list2);
		
		IConfigListener proxyConfigListener = this.proxyConfigListenerMap.get(strConfigId);
		if(proxyConfigListener == null) {
			proxyConfigListener = new IConfigListener() {
				@Override
				public void receiveConfigInfo(String configInfo) {
					onReceiveConfigInfo(strConfigId, configInfo);
				}
			};
			ServiceHub.getInstance().addConfigListener(strConfigId, proxyConfigListener);
			this.proxyConfigListenerMap.put(strConfigId, proxyConfigListener);
		}

		
	}
	
	protected void onReceiveConfigInfo(String strConfigId, String configInfo) {
		List<IConfigListener> list = this.configListenerListMap.get(strConfigId);
		if(ObjectUtils.isEmpty(list)) {
			return;
		}
		
		for(IConfigListener iConfigListener : list) {
			Executor executor = iConfigListener.getExecutor();
			if(executor != null) {
				executor.execute(new Runnable() {
					@Override
					public void run() {
						try {
							iConfigListener.receiveConfigInfo(configInfo);
						}
						catch (Throwable ex) {
							log.error(ex);
						}
					}
				});
			}
			else {
				try {
					iConfigListener.receiveConfigInfo(configInfo);
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
		}
	}
	
	@Override
	public synchronized void removeConfigListener(String strConfigId, IConfigListener iConfigListener) {
		Assert.hasLength(strConfigId, "未传入配置标识");
		Assert.notNull(iConfigListener, "未传入配置侦听器");
		
		List<IConfigListener> list = this.configListenerListMap.get(strConfigId);
		if(ObjectUtils.isEmpty(list)) {
			return;
		}
		else {
			if(!list.contains(iConfigListener)) {
				return;
			}
		}

		List<IConfigListener> list2 = new ArrayList<IConfigListener>();
		list2.addAll(list);
		list2.remove(iConfigListener);
		this.configListenerListMap.put(strConfigId, list2);

		if(ObjectUtils.isEmpty(list2)) {
			IConfigListener proxyConfigListener = this.proxyConfigListenerMap.remove(strConfigId);
			if(proxyConfigListener != null) {
				ServiceHub.getInstance().removeConfigListener(strConfigId, proxyConfigListener);
			}
		}
		
	}


	@Override
	public synchronized void removeConfigListenersByOwner(Object owner) {
		Assert.notNull(owner, "未传入配置侦听器所有者");
		
		if(!ObjectUtils.isEmpty(this.configListenerListMap)) {
			for(java.util.Map.Entry<String, List<IConfigListener>> entry : this.configListenerListMap.entrySet()) {
				final List<IConfigListener> list = entry.getValue();
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				
				for(IConfigListener iConfigListener : list) {
					if(iConfigListener.getOwner() != null && iConfigListener.getOwner() == owner) {
						this.removeConfigListener(entry.getKey(), iConfigListener);
					}
				}
			}
		}
	}


	@Override
	public synchronized void removeConfigListenersByTag(Object tag) {
		Assert.notNull(tag, "未传入配置侦听器标记");
		
		if(!ObjectUtils.isEmpty(this.configListenerListMap)) {
			for(java.util.Map.Entry<String, List<IConfigListener>> entry : this.configListenerListMap.entrySet()) {
				final List<IConfigListener> list = entry.getValue();
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}
				
				for(IConfigListener iConfigListener : list) {
					if(iConfigListener.getTag() != null && tag.equals(iConfigListener.getTag())) {
						this.removeConfigListener(entry.getKey(), iConfigListener);
					}
				}
			}
		}
	}
	
	
}
