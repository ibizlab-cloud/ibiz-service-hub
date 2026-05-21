package net.ibizsys.central.cloud.core.service.util;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;

public abstract class SysServiceAPIAIUtilsBase implements ISysServiceAPIAIUtils {

	final ISysServiceAPIRuntime iSysServiceAPIRuntime;
	public SysServiceAPIAIUtilsBase(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	protected final ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		return this.iSysServiceAPIRuntime;
	}
	
	@Override
	public List<IDEServiceAPIRuntime> chatDEServiceAPIRuntimes(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> chatDEServiceAPIMethods(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
