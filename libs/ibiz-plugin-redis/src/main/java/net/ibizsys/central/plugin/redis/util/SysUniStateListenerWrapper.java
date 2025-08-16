package net.ibizsys.central.plugin.redis.util;

import net.ibizsys.central.plugin.redis.sysutil.ISysRedisUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateListener;
import redis.clients.jedis.JedisPubSub;

public class SysUniStateListenerWrapper extends JedisPubSub  {

	final ISysRedisUtilRuntime iSysRedisUtilRuntime;
	final String strPath;
	final ISysUniStateListener iSysUniStateListener;
	final boolean bPattern;
	private boolean bRunning = true;
	
	public SysUniStateListenerWrapper(ISysRedisUtilRuntime iSysRedisUtilRuntime, String strPath, boolean bPattern, ISysUniStateListener iSysUniStateListener) {
		this.iSysRedisUtilRuntime = iSysRedisUtilRuntime;
		this.strPath = strPath;
		this.bPattern = bPattern;
		this.iSysUniStateListener = iSysUniStateListener;
	}

	public boolean isRunning() {
		return this.bRunning;
	}
	
	public void stop() {
		this.bRunning = false;
	}
	
	@Override
	public void onMessage(String channel, String message) {
		int nPos = channel.indexOf(":");
		if(nPos != -1) {
			channel = channel.substring(nPos + 1);
		}
		if("set".equals(message)) {
			this.iSysUniStateListener.change(channel, iSysRedisUtilRuntime.get(channel), null, null);
		}
		else
			if("del".equals(message)) {
				this.iSysUniStateListener.change(channel, null, null, null);
			}
	}
	
	@Override
	public void onPMessage(String pattern, String channel, String message) {
		int nPos = channel.indexOf(":");
		if(nPos != -1) {
			channel = channel.substring(nPos + 1);
		}
		nPos = pattern.indexOf(":");
		if(nPos != -1) {
			pattern = pattern.substring(nPos + 1);
		}
		
		if("set".equals(message)) {
			this.iSysUniStateListener.change(channel, iSysRedisUtilRuntime.get(channel), null, pattern);
		}
		else
			if("del".equals(message)) {
				this.iSysUniStateListener.change(channel, null, null, pattern);
			}
	}
}