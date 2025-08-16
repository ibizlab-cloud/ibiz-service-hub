package net.ibizsys.central.plugin.redis.sysutil;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.plugin.redis.util.SysUniStateListenerWrapper;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import net.ibizsys.central.sysutil.SysCacheUtilRuntimeBase;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.EntityUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.params.SetParams;

public class SysRedisUtilRuntime extends SysCacheUtilRuntimeBase implements ISysRedisUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysRedisUtilRuntime.class);
	private JedisPool jedisPool;
	private Map<String, SysUniStateListenerWrapper> sysUniStateListenerMap = new ConcurrentHashMap<String, SysUniStateListenerWrapper>();

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		if (this.getJedisPool(true) == null) {
			this.prepareJedisPool();
			if (this.getJedisPool(true) == null) {
				throw new Exception(String.format("Redis连接池对象无效"));
			}
		}
	}

	@Override
	protected void onUninstall() throws Throwable {
		if (this.getJedisPool(true) != null) {
			this.getJedisPool().close();
			this.setJedisPool(null);
		}
		super.onUninstall();
	}

	@Override
	public JedisPool getJedisPool() {
		return getJedisPool(false);
	}

	public JedisPool getJedisPool(boolean bTryMode) {
		if (this.jedisPool != null || bTryMode) {
			return this.jedisPool;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, "Redis连接池对象无效");
	}

	protected void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	protected void prepareJedisPool() throws Exception {
		if (!StringUtils.hasLength(this.getServiceUrl())) {
			throw new Exception(String.format("未指定Redis远程地址"));
		}

		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		String[] items = this.getServiceUrl().split(":");

		int nPort = 6379;
		if (items.length > 1) {
			nPort = Integer.valueOf(items[1]);
		}

		int timeout = 2000;
		// 初始化jedis
		jedisPoolConfig.setMaxTotal(100);
		jedisPoolConfig.setMaxIdle(20);
		jedisPoolConfig.setMaxWaitMillis(100);
		jedisPoolConfig.setTestOnBorrow(false);// jedis 第一次启动时，会报错
		jedisPoolConfig.setTestOnReturn(true);

		Map<String, Object> params = this.getSystemRuntimeSetting().getParams(this.getConfigFolder(), null);
		if (!ObjectUtils.isEmpty(params)) {
			EntityUtils.copyTo(params, jedisPoolConfig);
		}

		// 初始化JedisPool
		JedisPool jedisPool = new JedisPool(jedisPoolConfig, items[0], nPort, timeout);
		this.setJedisPool(jedisPool);
	}

	@Override
	public Jedis getJedis() {
		Jedis jedis = getJedisPool(false).getResource();
		if (StringUtils.hasLength(this.getClientId()) && StringUtils.hasLength(this.getClientSecret())) {
			jedis.auth(this.getClientId(), this.getClientSecret());
		} else if (StringUtils.hasLength(this.getClientSecret())) {
			jedis.auth(this.getClientSecret());
		}

		return jedis;
	}

	@Override
	protected void onSet(String strName, String strValue, int nSeconds) throws Throwable {
		try (Jedis jedis = getJedis()) {
			String strRet = null;
			if (nSeconds > 0) {
				strRet = jedis.set(strName, strValue, SetParams.setParams().ex(nSeconds));
			} else {
				strRet = jedis.set(strName, strValue);
			}
			if (!"OK".equalsIgnoreCase(strRet)) {
				log.warn(String.format("设置[%1$s]返回结果[%2$s]", strName, strRet));
			}
		}
	}

	@Override
	protected String onGet(String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			return jedis.get(strName);
		}
	}

	@Override
	protected boolean onContains(String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			return jedis.exists(strName);
		}
	}

	@Override
	protected void onReset(String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.del(strName);
		}
	}

	@Override
	protected String onGet(String strCat, String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			return jedis.hget(strCat, strName);
		}
	}

	@Override
	protected boolean onContains(String strCat, String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			return jedis.hexists(strCat, strName);
		}
	}

	@Override
	protected void onSet(String strCat, String strName, String strValue, int nSeconds) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.hset(strCat, strName, strValue);
			if (nSeconds > 0) {
				jedis.expire(strCat, nSeconds);
			}
		}
	}

	@Override
	protected void onExpire(String strName, int nSeconds) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.expire(strName, nSeconds);
		}
	}

	@Override
	protected void onRename(String strName, String strNewName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.rename(strName, strNewName);

		}
	}

	@Override
	protected void onCopyAll(String strSrcCat, String strDstCat) throws Throwable {
		try (Jedis jedis = getJedis()) {

			Set<String> keys = jedis.hkeys(strSrcCat);
			if (keys != null) {
				for (String strKey : keys) {
					String strContent = this.get(strSrcCat, strKey);
					this.set(strDstCat, strKey, strContent);
				}
			}
		}
	}

	@Override
	protected void onReset(String strCat, String strName) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.hdel(strCat, strName);
		}
	}

	@Override
	protected void onResetAll(String strCat) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.del(strCat);
		}
	}

	@Override
	protected Map<String, String> onGetAll(String strCat) throws Throwable {
		try (Jedis jedis = getJedis()) {
			return jedis.hgetAll(strCat);
		}
	}

	@Override
	protected void onSet(String strCat, Map<String, String> map, int nSeconds) throws Throwable {
		try (Jedis jedis = getJedis()) {
			jedis.hset(strCat, map);
			if (nSeconds > 0) {
				jedis.expire(strCat, nSeconds);
			}
		}
	}

	@Override
	protected String onGetPathFormat(Set<String> folderList) throws Throwable {
		return StringUtils.collectionToDelimitedString(folderList, "--");
	}

	@Override
	public boolean isEnableListener(boolean bPattern) {
		return true;
	}

	@Override
	protected void onRegisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable {
		String strTag = String.format("%1$s|%2$s", strPath, iSysUniStateListener);
		if (sysUniStateListenerMap.containsKey(strTag)) {
			throw new Exception(String.format("重复的侦听器标记[%1$s]", strTag));
		}

		SysUniStateListenerWrapper sysUniStateListenerWrapper = new SysUniStateListenerWrapper(this, strPath, bPattern, iSysUniStateListener);

		new Thread(() -> {
			//此处增加异常处理，但jedis好像具备断线重连的机制（没有抛出异常）
			while(sysUniStateListenerWrapper.isRunning()) {
				try (Jedis jedis = getJedis()) {
					jedis.configSet("notify-keyspace-events", "KEA");
					log.debug(String.format("开始侦听缓存[%1$s]模式[%2$s]变化", strPath, bPattern));
					if (bPattern) {
						jedis.psubscribe(sysUniStateListenerWrapper, String.format("__keyspace@0__:%1$s", strPath));
					} else {
						jedis.subscribe(sysUniStateListenerWrapper, String.format("__keyspace@0__:%1$s", strPath));
					}
					log.debug(String.format("结束侦听缓存[%1$s]模式[%2$s]变化", strPath, bPattern));
				}
				catch (Throwable ex) {
					log.error(String.format("侦听缓存[%1$s]模式[%2$s]变化发生异常，%3$s", strPath, bPattern, ex.getMessage()), ex);
					try {
						Thread.sleep(500);
					} catch (InterruptedException ex2) {
						log.error(String.format("线程Sleep(100)发生异常，%1$s", ex2.getMessage()), ex);
					}
				}
			}

		}).start();

		sysUniStateListenerMap.put(strTag, sysUniStateListenerWrapper);
	}

	@Override
	protected void onUnregisterListener(String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) throws Throwable {
		String strTag = String.format("%1$s|%2$s", strPath, iSysUniStateListener);

		SysUniStateListenerWrapper sysUniStateListenerWrapper = sysUniStateListenerMap.remove(strTag);
		if (sysUniStateListenerWrapper == null) {
			return;
		}
		
		sysUniStateListenerWrapper.stop();

		if (bPattern) {
			sysUniStateListenerWrapper.punsubscribe();
		} else {
			sysUniStateListenerWrapper.unsubscribe();
		}
	}
}
