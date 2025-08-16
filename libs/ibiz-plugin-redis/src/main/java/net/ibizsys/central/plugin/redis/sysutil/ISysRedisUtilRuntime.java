package net.ibizsys.central.plugin.redis.sysutil;

import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public interface ISysRedisUtilRuntime extends ISysCacheUtilRuntime{

	/**
	 * 获取客户端链接池对象
	 * @return
	 */
	JedisPool getJedisPool();
	
	
	/**
	 * 获取客户端对象
	 * @return
	 */
	Jedis getJedis();
}
