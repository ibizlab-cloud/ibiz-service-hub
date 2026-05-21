package net.ibizsys.central.plugin.ai.sysutil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.cloud.core.dataentity.util.IDEChatPromptUtil;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.plugin.ai.dataentity.util.DEChatPromptUtil;

public abstract class SysChatPromptUtilRuntimeBase extends SysUtilRuntimeBase implements ISysChatPromptUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysChatPromptUtilRuntimeBase.class);
	
	private Map<String, IDEChatPromptUtil> deChatPromptUtilMap = new ConcurrentHashMap<String, IDEChatPromptUtil>();
	
	@Override
	public IDEChatPromptUtil getDEChatPromptUtil(String mode) {
		Assert.hasLength(mode, "传入模式无效");
		IDEChatPromptUtil iDEChatPromptUtil = deChatPromptUtilMap.get(mode);
		if(iDEChatPromptUtil == null) {
			iDEChatPromptUtil = this.createDEChatPromptUtil(mode);
			this.deChatPromptUtilMap.put(mode, iDEChatPromptUtil);
		}
		return iDEChatPromptUtil;
	}
	
	
	
	protected IDEChatPromptUtil createDEChatPromptUtil(String mode) {
		return new DEChatPromptUtil(); 
	}

}
