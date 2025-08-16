package net.ibizsys.central.plugin.cloud.sysutil;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudKBClient;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统KB组件运行时对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class SysKBUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysKBUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysKBUtilRuntimeBase.class);
	private ICloudKBClient iCloudKBClient = null;
	private String strDefaultKBPlatformType = KBPLATFORM_DEFAULT;
	
	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		
		super.onPrepareDefaultSetting();
	}

	protected ICloudKBClient getCloudKBClient() {
		if(this.iCloudKBClient == null) {
			this.iCloudKBClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_KB, ICloudKBClient.class);
		}
		return this.iCloudKBClient;
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	public String getLogicName() {
		return String.format("系统KB功能组件[%1$s]", this.getName());
	}

	@Override
	public String getDefaultKBPlatformType() {
		return this.strDefaultKBPlatformType;
	}
	
	protected void setDefaultKBPlatformType(String strDefaultKBPlatformType) {
		this.strDefaultKBPlatformType = strDefaultKBPlatformType;
	}
	
	@Override
	public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) {
		return this.fetchChunks(null, iChunkSearchContext);
	}
	
	@Override
	public Page<Chunk> fetchChunks(String type, IChunkSearchContext iChunkSearchContext) {
		return (Page<Chunk>)this.executeAction("查询知识片段", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onFetchChunks(StringUtils.hasLength(type)?type:getDefaultKBPlatformType(), iChunkSearchContext);
			}
		}, null);
	}
	
	protected Page<Chunk> onFetchChunks(String type, IChunkSearchContext iChunkSearchContext) throws Throwable{
		return getCloudKBClient().fetchChunks(type, iChunkSearchContext);
	}
	
	
}
