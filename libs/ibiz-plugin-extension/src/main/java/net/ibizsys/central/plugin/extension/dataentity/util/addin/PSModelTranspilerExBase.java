package net.ibizsys.central.plugin.extension.dataentity.util.addin;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.plugin.extension.addin.IPSModelTranspilerEx;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public abstract class PSModelTranspilerExBase extends DEExtensionUtilRTAddinBase implements IPSModelTranspilerEx {

	@Override
	public IPSModel decompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode){
		try {
			return this.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this.getDEExtensionUtilRuntime(), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this.getDEExtensionUtilRuntime(), String.format("反编译模型发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected abstract Class<? extends IPSModelObject> getPSModelObjectCls(); 
	
	protected IPSModel onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Throwable{
		return iPSModelTranspileContext.getPSModelTranspiler(this.getPSModelObjectCls(), false).decompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}

	@Override
	public ObjectNode compile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode){
		try {
			return this.onCompile(iPSModelTranspileContext, domain, objectNode);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this.getDEExtensionUtilRuntime(), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this.getDEExtensionUtilRuntime(), String.format("编译模型发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ObjectNode onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Throwable{
		return iPSModelTranspileContext.getPSModelTranspiler(this.getPSModelObjectCls(), false).compile(iPSModelTranspileContext, domain, objectNode);
	}
	
}
