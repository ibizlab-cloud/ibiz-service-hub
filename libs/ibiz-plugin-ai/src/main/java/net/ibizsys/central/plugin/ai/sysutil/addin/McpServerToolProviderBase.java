package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.List;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.mcp.server.McpServerFeatures.AsyncToolSpecification;
import net.ibizsys.central.plugin.ai.mcp.server.McpServerFeatures.SyncToolSpecification;

/**
 * Mcp服务器工具提供器对象基类
 * @author lionlau
 *
 */
public abstract class McpServerToolProviderBase extends SysMcpServerUtilRTAddinBase implements IMcpServerToolProvider{
	
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(McpServerToolProviderBase.class);
	
	private List<AsyncToolSpecification> asyncToolSpecificationList = null;
	private List<SyncToolSpecification> syncToolSpecificationList = null;
	
	
	@Override
	public List<AsyncToolSpecification> getAsyncToolSpecifications() {
		return this.asyncToolSpecificationList;
	}
	
	protected void setAsyncToolSpecifications(List<AsyncToolSpecification> asyncToolSpecificationList) {
		this.asyncToolSpecificationList = asyncToolSpecificationList;
	}
	

	@Override
	public List<SyncToolSpecification> getSyncToolSpecifications() {
		return this.syncToolSpecificationList;
	}
	
	protected void setSyncToolSpecifications(List<SyncToolSpecification> syncToolSpecificationList) {
		this.syncToolSpecificationList = syncToolSpecificationList;
	}
}
