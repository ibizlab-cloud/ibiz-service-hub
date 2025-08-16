package net.ibizsys.central.plugin.zk.sysutil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.listen.ListenerManager;
import org.apache.curator.framework.recipes.cache.CuratorCache;
import org.apache.curator.framework.recipes.leader.LeaderLatch;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException.NoNodeException;
import org.apache.zookeeper.data.Stat;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.plugin.zk.util.SysUniStateListenerWrapper;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.SysUtilRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IInterProcessMutexUtil;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

public class SysZooKeeperUtilRuntime extends SysUtilRuntimeBase implements ISysZooKeeperUtilRuntime, ISysUniStateUtilRuntime, IInterProcessMutexUtil {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysZooKeeperUtilRuntime.class);

	private final static String PREFIX = "ibiz-cloud";

	private static class InterProcessMutexData {
		final InterProcessMutex interProcessMutex;
		final String lockPath;
		final AtomicInteger lockCount = new AtomicInteger(0);

		private InterProcessMutexData(InterProcessMutex interProcessMutex, String lockPath) {
			this.interProcessMutex = interProcessMutex;
			this.lockPath = lockPath;
		}
	}

	private CuratorFramework curatorFramework = null;

	private Map<String, LeaderLatch> leaderLatchMap = new ConcurrentHashMap<String, LeaderLatch>();
	private Map<String, InterProcessMutex> interProcessMutexMap = new ConcurrentHashMap<String, InterProcessMutex>();
	private Map<String, Map<String, InterProcessMutexData>> interProcessMutexDataMapMap = new HashMap<String, Map<String, InterProcessMutexData>>();

	private Map<String, CuratorCache> curatorCacheMap = new HashMap<String, CuratorCache>();
	private Map<String, SysUniStateListenerWrapper> sysUniStateListenerMap = new ConcurrentHashMap<String, SysUniStateListenerWrapper>();

	private String strLeaderShipPath = null;
	private String strProcessMutexPath = null;
	private String strRandomClientTag = null;

	@Override
	protected void onInit() throws Exception {

		String strLeaderShipPath = this.getUtilParam("leadershippath", null);
		if (!StringUtils.hasLength(strLeaderShipPath)) {
			strLeaderShipPath = String.format("/%1$s/sys/%2$s/leadership", PREFIX, this.getSystemRuntime().getDeploySystemId());
		}
		this.setLeaderShipPath(strLeaderShipPath);

		String strProcessMutexPath = this.getUtilParam("processmutexpath", null);
		if (!StringUtils.hasLength(strProcessMutexPath)) {
			strProcessMutexPath = String.format("/%1$s/sys/%2$s/processmutex", PREFIX, this.getSystemRuntime().getDeploySystemId());
		}
		this.setProcessMutexPath(strProcessMutexPath);

		super.onInit();

		if (this.getCuratorFramework(true) == null) {
			this.prepareCuratorFramework();
			if (this.getCuratorFramework(true) == null) {
				throw new Exception(String.format("ZooKeeper客户端对象无效"));
			}
		}

		this.setRandomClientTag("client_" + this.getSystemRuntime().getDeploySessionId());
		this.getSystemRuntime().log(LogLevels.INFO, SysZooKeeperUtilRuntime.class.getName(), String.format("zk根路径: %1$s\r\n随机客户端: %2$s\r\n", this.getLeaderShipPath(), this.getRandomClientTag()), null);

		if (ActionSessionManager.getInterProcessMutexUtil() == null) {
			log.debug(String.format("设置 ActionSessionManager.setInterProcessMutexUtil"));
			ActionSessionManager.setInterProcessMutexUtil(this);
		}
	}

	@Override
	public CuratorFramework getCuratorFramework() {
		return getCuratorFramework(false);
	}

	public CuratorFramework getCuratorFramework(boolean bTryMode) {
		if (this.curatorFramework != null || bTryMode) {
			return this.curatorFramework;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, "ZooKeeper客户端对象无效");
	}

	protected void setCuratorFramework(CuratorFramework curatorFramework) {
		this.curatorFramework = curatorFramework;
	}

	protected void prepareCuratorFramework() throws Exception {
		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception(String.format("未指定ZooKeeper远程地址"));
		}
		CuratorFramework client = CuratorFrameworkFactory.newClient(this.getServiceUrl(), new ExponentialBackoffRetry(1000, 3));
		client.start();
		this.setCuratorFramework(client);
	}

	@Override
	public boolean hasLeadership(String strTag) {
		Assert.hasLength(strTag, "传入标记无效");
		LeaderLatch leaderLatch = null;
		synchronized (this.leaderLatchMap) {
			leaderLatch = this.leaderLatchMap.get(strTag);
		}
		if (leaderLatch == null) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("传入控制标记[%1$s]不存在", strTag));
		}

		return leaderLatch.hasLeadership();
	}

	@Override
	public void addLeaderLatch(String strTag) {
		this.addLeaderLatch(strTag, false);
	}

	@Override
	public void addLeaderLatchIf(String strTag) {
		this.addLeaderLatch(strTag, true);
	}

	protected void addLeaderLatch(String strTag, boolean bTryMode) {
		Assert.hasLength(strTag, "传入标记无效");

		synchronized (this.leaderLatchMap) {
			if (this.leaderLatchMap.containsKey(strTag)) {
				if (bTryMode) {
					return;
				}
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("传入控制标记[%1$s]已经存在", strTag));
			}
			String strFullPath = String.format("%1$s/%2$s", this.getLeaderShipPath(), KeyValueUtils.genUniqueId(strTag));
			LeaderLatch leaderLatch = new LeaderLatch(getCuratorFramework(), strFullPath, this.getRandomClientTag());

			try {
				leaderLatch.start();
				this.leaderLatchMap.put(strTag, leaderLatch);
			} catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("启动控制获取发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}

	@Override
	public void removeLeaderLatch(String strTag) {
		Assert.hasLength(strTag, "传入标记无效");

		LeaderLatch leaderLatch = null;
		synchronized (this.leaderLatchMap) {
			leaderLatch = this.leaderLatchMap.remove(strTag);

		}

		if (leaderLatch == null) {
			return;
		}

		try {
			leaderLatch.close();
		} catch (Exception ex) {
			log.debug(String.format("关闭控制获取发生异常，%1$s", ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, SysZooKeeperUtilRuntime.class.getName(), String.format("关闭控制获取发生异常，%1$s", ex.getMessage()), null);
		}
	}

	/**
	 * 获取控制关系根路径
	 * 
	 * @param strLeaderShipPath
	 */
	protected void setLeaderShipPath(String strLeaderShipPath) {
		this.strLeaderShipPath = strLeaderShipPath;
	}

	/**
	 * 设置控制关系根路径
	 * 
	 * @return
	 */
	protected String getLeaderShipPath() {
		return this.strLeaderShipPath;
	}

	/**
	 * 获取分布处理锁根路径
	 * 
	 * @param strProcessMutexPath
	 */
	protected void setProcessMutexPath(String strProcessMutexPath) {
		this.strProcessMutexPath = strProcessMutexPath;
	}

	/**
	 * 设置分布处理锁根路径
	 * 
	 * @return
	 */
	protected String getProcessMutexPath() {
		return this.strProcessMutexPath;
	}

	protected void setRandomClientTag(String strRandomClientTag) {
		this.strRandomClientTag = strRandomClientTag;
	}

	protected String getRandomClientTag() {
		return this.strRandomClientTag;
	}

	@Override
	public boolean contains(String strPath) {
		Assert.hasLength(strPath, "传入路径无效");
		try {
			Stat stat = this.getCuratorFramework().checkExists().forPath(strPath);
			return stat != null;
		} catch (NoNodeException ex) {
			return false;
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("检查状态[%1$s]是否存在发生异常，%2$s", strPath, ex.getMessage()), ex);
		}
	}

	@Override
	public void set(String strPath, Object objValue) {
		this.set(strPath, objValue == null ? "" : (String) this.getSystemRuntime().serialize(objValue));
	}

	@Override
	public void set(String strPath, String strValue) {
		Assert.hasLength(strPath, "传入路径无效");
		Assert.notNull(strValue, "传入值无效");
		try {
		    Stat stat = this.getCuratorFramework().checkExists().forPath(strPath);
		    if (stat != null) {
		    	this.getCuratorFramework().setData().forPath(strPath, strValue.getBytes());
		    } else {
		        // 创建路径并设置数据（包括中间路径）
		    	this.getCuratorFramework().create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath(strPath, strValue.getBytes());
		    }
		} catch (NoNodeException e) {
			// 创建路径并设置数据（包括中间路径）
			try {
				this.getCuratorFramework().create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath(strPath, strValue.getBytes());
			}
			catch (Exception ex) {
				throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("设置状态[%1$s]发生异常，%2$s", strPath, ex.getMessage()), ex);
			}
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("设置状态[%1$s]发生异常，%2$s", strPath, ex.getMessage()), ex);
		}
	}

	@Override
	public void reset(String strPath) {
		Assert.hasLength(strPath, "传入路径无效");
		try {
			this.getCuratorFramework().delete().deletingChildrenIfNeeded().forPath(strPath);
		} catch (NoNodeException ex) {
			
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("移除状态[%1$s]发生异常，%2$s", strPath, ex.getMessage()), ex);
		}
	}
	

	@Override
	public String get(String strPath) {
		Assert.hasLength(strPath, "传入路径无效");
		try {
			byte[] data = this.getCuratorFramework().getData().forPath(strPath);
			if(data == null) {
				return null;
			}
			return new String(data);
			
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取状态[%1$s]发生异常，%2$s", strPath, ex.getMessage()), ex);
		}
	}

	@Override
	public <T> T get(String strPath, Class<T> cls) {
		String strValue = this.get(strPath);
		if(ObjectUtils.isEmpty(strValue)) {
			return null;
		}
		return this.getSystemRuntime().deserialize(strValue, cls);
	}

	@Override
	public <T> T get(String strPath, TypeReference<T> type) {
		String strValue = this.get(strPath);
		if(ObjectUtils.isEmpty(strValue)) {
			return null;
		}
		return this.getSystemRuntime().deserialize(strValue, type);
	}
	

	@Override
	public void registerListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		Assert.hasLength(strPath, "传入路径无效");
		Assert.notNull(iSysUniStateListener, "传入状态侦听对象无效");
		
		try {
			synchronized (this.curatorCacheMap) {
				onRegisterListener(strPath, bPattern, iSysUniStateListener);
			}
		} catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("注册侦听器发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onRegisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable{
	
		CuratorCache curatorCache = this.getCuratorCacheIf(strPath);
		
		String strTag = String.format("%1$s|%2$s", strPath, iSysUniStateListener);
		if(sysUniStateListenerMap.containsKey(strTag)) {
			throw new Exception(String.format("重复的侦听器标记[%1$s]", strTag));
		}
		
		SysUniStateListenerWrapper sysUniStateListenerWrapper = new SysUniStateListenerWrapper(strPath, iSysUniStateListener);
		curatorCache.listenable().addListener(sysUniStateListenerWrapper);
		
		sysUniStateListenerMap.put(strTag, sysUniStateListenerWrapper);
	}

	@Override
	public void unregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		Assert.hasLength(strPath, "传入路径无效");
		Assert.notNull(iSysUniStateListener, "传入状态侦听对象无效");
		
		try {
			synchronized (this.curatorCacheMap) {
				onUnregisterListener(strPath, bPattern, iSysUniStateListener);
			}
		} catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("注销侦听器发生异常，%1$s", ex.getMessage()), ex);
		}
		
	}
	
	protected void onUnregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable{
		
		CuratorCache curatorCache = this.getCuratorCacheIf(strPath);
		
		String strTag = String.format("%1$s|%2$s", strPath, iSysUniStateListener);
		
		SysUniStateListenerWrapper sysUniStateListenerWrapper = sysUniStateListenerMap.remove(strTag);
		if(sysUniStateListenerWrapper == null) {
			return ;
		}
		
		curatorCache.listenable().removeListener(sysUniStateListenerWrapper);
		this.resetCuratorCacheIf(strPath);
	}


	protected CuratorCache getCuratorCacheIf(String strPath) throws Throwable {
		CuratorCache curatorCache = this.curatorCacheMap.get(strPath);
		if (curatorCache != null) {
			return curatorCache;
		}

		curatorCache = CuratorCache.build(this.getCuratorFramework(), strPath);
		curatorCache.start();
		this.curatorCacheMap.put(strPath, curatorCache);
		return curatorCache;
	}
	
	protected boolean resetCuratorCacheIf(String strPath) throws Throwable {
		CuratorCache curatorCache = this.curatorCacheMap.get(strPath);
		if (curatorCache != null) {
			if(curatorCache.listenable() instanceof ListenerManager) {
				if(((ListenerManager)curatorCache.listenable()).size() == 0) {
					this.curatorCacheMap.remove(strPath);
					curatorCache.close();
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strCrossProcessLock) throws Throwable {
		return execute(iAction, args, strCrossProcessLock, -1, null);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strCrossProcessLock, String strSessionId) throws Throwable {
		return execute(iAction, args, strCrossProcessLock, strSessionId, -1, null);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strCrossProcessLock, long time, TimeUnit unit) throws Throwable {
		return execute(iAction, args, strCrossProcessLock, null, time, unit);
	}

	@Override
	public Object execute(IAction iAction, Object[] args, String strCrossProcessLock, String strSessionId, long time, TimeUnit unit) throws Throwable {
		Assert.hasLength(strCrossProcessLock, "传入分布处理锁无效");
		if (ObjectUtils.isEmpty(strSessionId)) {
			InterProcessMutex interProcessMutex = this.interProcessMutexMap.get(strCrossProcessLock);
			synchronized (interProcessMutexMap) {
				interProcessMutex = this.interProcessMutexMap.get(strCrossProcessLock);
				if (interProcessMutex == null) {
					String strFullPath = String.format("%1$s/%2$s", this.getProcessMutexPath(), KeyValueUtils.genUniqueId(strCrossProcessLock));
					interProcessMutex = new InterProcessMutex(this.getCuratorFramework(), strFullPath);
					this.interProcessMutexMap.put(strCrossProcessLock, interProcessMutex);
				}
			}

			boolean bLock = false;
			try {
				if (time == -1) {
					interProcessMutex.acquire();
					bLock = true;
				} else {
					bLock = interProcessMutex.acquire(time, unit);
				}

				if (!bLock) {
					log.warn(String.format("等待分布处理锁[%1$s]超时，忽略处理", strCrossProcessLock));
					return null;
				}

				// log.debug(String.format("线程[%1$s]开始处理",
				// Thread.currentThread().getId()));
				return iAction.execute(args);

			} finally {

				if (bLock) {
					// log.debug(String.format("线程[%1$s]结束处理",
					// Thread.currentThread().getId()));
					try {
						interProcessMutex.release();
					} catch (Exception ex) {
						log.error(ex);
					}
				}
			}
		} else {
			Map<String, InterProcessMutexData> map = interProcessMutexDataMapMap.get(strCrossProcessLock);
			synchronized (this.interProcessMutexDataMapMap) {
				map = this.interProcessMutexDataMapMap.get(strCrossProcessLock);
				if (map == null) {
					map = new HashMap<String, InterProcessMutexData>();
					this.interProcessMutexDataMapMap.put(strCrossProcessLock, map);
				}
			}

			InterProcessMutexData interProcessMutexData = null;
			synchronized (map) {
				interProcessMutexData = map.get(strSessionId);
				if (interProcessMutexData == null) {
					String strFullPath = String.format("%1$s/%2$s/%3$s", this.getProcessMutexPath(), KeyValueUtils.genUniqueId(strCrossProcessLock), KeyValueUtils.genUniqueId(strSessionId));
					interProcessMutexData = new InterProcessMutexData(new InterProcessMutex(this.getCuratorFramework(), strFullPath), strFullPath);
					map.put(strSessionId, interProcessMutexData);
				}
				interProcessMutexData.lockCount.incrementAndGet();
			}

			boolean bLock = false;
			try {
				if (time == -1) {
					interProcessMutexData.interProcessMutex.acquire();
					bLock = true;
				} else {
					bLock = interProcessMutexData.interProcessMutex.acquire(time, unit);
				}

				if (!bLock) {
					log.warn(String.format("等待分布处理锁[%1$s][%2$s]超时，忽略处理", strCrossProcessLock, strSessionId));
					return null;
				}
				return iAction.execute(args);
			} finally {

				if (bLock) {
					// log.debug(String.format("线程[%1$s]结束处理",
					// Thread.currentThread().getId()));
					try {
						interProcessMutexData.interProcessMutex.release();
					} catch (Exception ex) {
						log.error(ex);
					}
				}

				synchronized (map) {
					if (interProcessMutexData.lockCount.decrementAndGet() == 0) {
						map.remove(strSessionId);
					}
				}
			}
		}

	}

	@Override
	public String getPathFormat(Set<String> folderList) {
		Assert.notEmpty(folderList, "传入路径列表无效");
		return String.format("/%1$s", StringUtils.collectionToDelimitedString(folderList, "/"));
	}

	@Override
	public boolean isEnableListener(boolean bPattern) {
		if(bPattern) {
			return false;
		}
		return true;
	}

	
}
