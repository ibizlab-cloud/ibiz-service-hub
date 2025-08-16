package net.ibizsys.central.dataentity.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;

public class DEActionPluginRuntime2Proxy implements IDEActionPluginRuntime{

	private static final Log log = LogFactory.getLog(DEActionPluginRuntime2Proxy.class);
	private List<IDEActionPluginRuntime2> deActionPluginRuntime2List = null;
	
	@Override
	public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
		final List<IDEActionPluginRuntime2> list = this.deActionPluginRuntime2List;
		if(!ObjectUtils.isEmpty(list)) {
			for(IDEActionPluginRuntime2 item : list) {
				if(item.isValid(iDataEntityRuntimeContext, iPSDEAction, args, actionData)) {
					return item.execute(iDataEntityRuntimeContext, iPSDEAction, args, actionData);
				}
			}
		}
		return iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData);
	}

	public synchronized boolean register(IDEActionPluginRuntime2 iDEActionPluginRuntime2) {
		List<IDEActionPluginRuntime2> list = new ArrayList<IDEActionPluginRuntime2>();
		if(!ObjectUtils.isEmpty(this.deActionPluginRuntime2List)) {
			list.addAll(this.deActionPluginRuntime2List);
		}
		boolean bRet = false;
		if(!list.contains(iDEActionPluginRuntime2)) {
			list.add(iDEActionPluginRuntime2);
			Collections.sort(list, new Comparator<IDEActionPluginRuntime2>() {
				@Override
				public int compare(IDEActionPluginRuntime2 o1, IDEActionPluginRuntime2 o2) {
					return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
				}
			});
			bRet = true;
			this.deActionPluginRuntime2List = list;
		}
		else {
			log.warn(String.format("实体行为插件运行时对象[%1$s]已经注册，无法再次注册", iDEActionPluginRuntime2));
		}
		return bRet;
	}

	public synchronized boolean unregister(IDEActionPluginRuntime2 iDEActionPluginRuntime2) {
		List<IDEActionPluginRuntime2> list = new ArrayList<IDEActionPluginRuntime2>();
		if(!ObjectUtils.isEmpty(this.deActionPluginRuntime2List)) {
			list.addAll(this.deActionPluginRuntime2List);
		}
		boolean bRet = false;
		if(list.remove(iDEActionPluginRuntime2)) {
			Collections.sort(list, new Comparator<IDEActionPluginRuntime2>() {
				@Override
				public int compare(IDEActionPluginRuntime2 o1, IDEActionPluginRuntime2 o2) {
					return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
				}
			});
			bRet = true;
			this.deActionPluginRuntime2List = list;	
		}
		else {
			log.warn(String.format("实体行为插件运行时对象[%1$s]未注册，无法注销", iDEActionPluginRuntime2));
		}
		return bRet;
	}

	public boolean contains(IDEActionPluginRuntime2 iDEActionPluginRuntime2) {
		final List<IDEActionPluginRuntime2> list = this.deActionPluginRuntime2List;
		if(!ObjectUtils.isEmpty(list)) {
			return list.contains(iDEActionPluginRuntime2);
		}
		return false;
	}

}
