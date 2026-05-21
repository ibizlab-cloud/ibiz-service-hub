package net.ibizsys.central.cloud.core.ba;

import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;

public abstract class SysBDSchemeRuntimeBase extends net.ibizsys.central.ba.SysBDSchemeRuntimeBase implements ISysBDSchemeRuntime {

	protected String strEmbeddingPlatform = null;
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		this.setEmbeddingPlatform(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".embeddingplatform", this.getEmbeddingPlatform()));
		super.onInit();
	}
	
	protected void setEmbeddingPlatform(String strEmbeddingPlatform) {
		this.strEmbeddingPlatform = strEmbeddingPlatform;
	}
	
	protected String getEmbeddingPlatform() {
		return this.strEmbeddingPlatform;
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if(this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}
	
//	@Override
//	public Page<Chunk> fetchChunks(String tableName, IChunkSearchContext iChunkSearchContext) throws Throwable {
//		Assert.hasLength(tableName, "未传入数据表标识");
//		Assert.notNull(iChunkSearchContext, "未传入片段搜索上下文对象");
//		try {
//			return this.onFetchChunks(tableName, iChunkSearchContext);
//		}
//		catch(Throwable ex) {
//			ex = ExceptionUtils.unwrapThrowable(ex);
//			SysBDSchemeRuntimeException.rethrow(this, ex);
//			throw new SysBDSchemeRuntimeException(this, String.format("片段搜索发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	protected Page<Chunk> onFetchChunks(String tableName, IChunkSearchContext iChunkSearchContext) throws Throwable {
//		throw new SysBDSchemeRuntimeException(this, "没有实现", Errors.NOTIMPL);
//	}
	
}
