package net.ibizsys.runtime.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

public class ModelRuntimeUtils {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ModelRuntimeUtils.class);

	public static void shutdownModelRuntimes(Map<String, ? extends IModelRuntime> modelRuntimes) {
		if(ObjectUtils.isEmpty(modelRuntimes)) {
			return;
		}
		internalShutdownModelRuntimes(modelRuntimes.values());
		modelRuntimes.clear();
	}
	
	public static void shutdownModelRuntimes(List<? extends IModelRuntime> modelRuntimes) {
		if(ObjectUtils.isEmpty(modelRuntimes)) {
			return;
		}
		internalShutdownModelRuntimes(modelRuntimes);
		modelRuntimes.clear();		
	}
	
	
	protected static void internalShutdownModelRuntimes(Collection<? extends IModelRuntime> modelRuntimes) {
		if(ObjectUtils.isEmpty(modelRuntimes)) {
			return;
		}
		HashSet<IModelRuntime> set = new HashSet<IModelRuntime>();
		for(IModelRuntime iModelRuntime : modelRuntimes) {
			if(set.contains(iModelRuntime)) {
				continue;
			}
			shutdownModelRuntime(iModelRuntime);
			set.add(iModelRuntime);
		}
	}
	
	public static void shutdownModelRuntime(IModelRuntime iModelRuntime) {
		if(iModelRuntime instanceof IModelRuntimeShutdownable) {
			try {
				((IModelRuntimeShutdownable)iModelRuntime).shutdown();
			}
			catch (Exception ex) {
				log.error(String.format("关闭模型[%1$s]运行时对象发生异常，%2$s", iModelRuntime.getId(), ex.getMessage()), ex);
			}
		}
	}
}
