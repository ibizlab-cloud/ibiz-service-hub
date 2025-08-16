package net.ibizsys.central.cloud.core.bi;

import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.model.bi.IPSSysBICube;

public abstract class SysBISchemeRuntimeBase extends net.ibizsys.central.bi.SysBISchemeRuntimeBase implements ISysBISchemeRuntime{

	@Override
	protected ISysBICubeRuntime createSysBICubeRuntime(IPSSysBICube iPSSysBICube) {
		return new SysBICubeRuntime();
	}
}
