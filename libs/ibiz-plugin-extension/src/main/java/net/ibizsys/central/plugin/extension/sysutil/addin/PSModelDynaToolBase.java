package net.ibizsys.central.plugin.extension.sysutil.addin;

import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.plugin.extension.addin.IPSModelDynaTool;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.SystemRuntimeException;

public abstract class PSModelDynaToolBase extends SysExtensionUtilRTAddinBase implements IPSModelDynaTool {

	@Override
	public ObjectNode getModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSModelObject iPSModelObject, Object param) {
		Assert.notNull(iPSModelObject, "未传入模型对象");
		try {
			return this.onGetModel(v2SystemExtensionSuite, iPSModelObject, param);
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this.getSysExtensionUtilRuntime(), ex);
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysExtensionUtilRuntime(), String.format("获取动态模型发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected  ObjectNode onGetModel(V2SystemExtensionSuite v2SystemExtensionSuite, IPSModelObject iPSModelObject, Object param) throws Throwable{
		throw new Exception("没有实现");
	}
	
}
