package net.ibizsys.central.plugin.task.sysutil.addin;

import net.ibizsys.central.plugin.task.addin.IExecutor;

public class DefaultExecutorProvider extends ExecutorProviderBase {

	@Override
	public IExecutor createExecutor(Object addin) {
		return this.getSystemRuntime().createObject(IExecutor.class, DefaultExecutor.class);
	}

}
