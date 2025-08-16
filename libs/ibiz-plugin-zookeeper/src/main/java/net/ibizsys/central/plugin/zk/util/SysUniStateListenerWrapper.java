package net.ibizsys.central.plugin.zk.util;

import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.CuratorCacheListener;

import net.ibizsys.central.sysutil.ISysUniStateListener;

public class SysUniStateListenerWrapper implements CuratorCacheListener {

	final String strPath;
	final ISysUniStateListener iSysUniStateListener;
	public SysUniStateListenerWrapper(String strPath, ISysUniStateListener iSysUniStateListener) {
		this.strPath = strPath;
		this.iSysUniStateListener = iSysUniStateListener;
	}

	@Override
	public void event(Type type, ChildData oldData, ChildData data) {
		switch(type) {
		 /**
         * A new node was added to the cache
         */
		case NODE_CREATED:
			this.iSysUniStateListener.change(strPath, data!=null?new String(data.getData()):"", null, null);
			break;

        /**
         * A node already in the cache has changed
         */
		case NODE_CHANGED:
			this.iSysUniStateListener.change(strPath, data!=null?new String(data.getData()):"", oldData!=null?new String(oldData.getData()):"", null);
			break;

        /**
         * A node already in the cache was deleted
         */
		case NODE_DELETED:
			this.iSysUniStateListener.change(strPath, null, oldData!=null?new String(oldData.getData()):"", null);
			break;
		}
	}
}