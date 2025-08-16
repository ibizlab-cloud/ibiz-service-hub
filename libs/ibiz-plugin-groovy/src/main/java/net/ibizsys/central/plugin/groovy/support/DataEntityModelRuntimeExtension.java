package net.ibizsys.central.plugin.groovy.support;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityModelRuntime;

public class DataEntityModelRuntimeExtension {

	public static ISystemRuntime getSys(IDataEntityModelRuntime iDataEntityModelRuntime) {
		return iDataEntityModelRuntime.getSystemRuntime();
	}
}
