package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import io.modelcontextprotocol.server.McpServerFeatures.AsyncToolSpecification;
import io.modelcontextprotocol.server.McpServerFeatures.SyncToolSpecification;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;

public class AIFactoryMcpServerToolProvider extends McpServerToolProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AIFactoryMcpServerToolProvider.class);

	private ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
	
	public final static String PARAM_AIFACTORYTAG = "aifactorytag";
	
	@Override
	protected void onInit() throws Exception {
		if(this.getSysAIFactoryRuntime(true) == null) {
			String strAIFactoryTag = this.getContext().getSetting(PARAM_AIFACTORYTAG, null);
			if(StringUtils.hasLength(strAIFactoryTag)) {
				this.iSysAIFactoryRuntime = this.getSystemRuntime().getSysAIFactoryRuntime(strAIFactoryTag, false);
			}
		}
		if(this.getSysAIFactoryRuntime(true) != null) {
			prepareToolSpecifications();
		}
		super.onInit();
	}
	
	protected ISysAIFactoryRuntime getSysAIFactoryRuntime(boolean bTryMode) throws Exception{
		if(this.iSysAIFactoryRuntime != null || bTryMode) {
			return this.iSysAIFactoryRuntime;
		}
		throw new Exception("AI工厂运行时对象无效");
	}
	
	protected void prepareToolSpecifications() throws Exception {
		
		List<SyncToolSpecification> syncToolSpecificationList = new ArrayList<SyncToolSpecification>();
		List<AsyncToolSpecification> asyncToolSpecificationList = new ArrayList<AsyncToolSpecification>();
		
		List<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = this.getSysAIFactoryRuntime(false).getSysAIChatAgentRuntimes();
		
		

		for(SyncToolSpecification item : syncToolSpecificationList) {
			asyncToolSpecificationList.add(fromSync(item));
		}
		
		setSyncToolSpecifications(Collections.unmodifiableList(syncToolSpecificationList));
		setAsyncToolSpecifications(Collections.unmodifiableList(asyncToolSpecificationList));
	}
}
