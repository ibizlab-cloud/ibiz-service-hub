package net.ibizsys.central.cloud.core.cloudutil;

public class CloudUtilRuntimeContextProxy <M extends ICloudUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextBase<M, C> {

	public CloudUtilRuntimeContextProxy(C proxyContext) {
		super(proxyContext);
	}

}
