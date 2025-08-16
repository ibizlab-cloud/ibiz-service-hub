package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl.*;



public class PSDEEndLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getDstFieldName(), realPSModelObject, "getDstFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getRawValue(), realPSModelObject, "getRawValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getRawValueStdDataType(), realPSModelObject, "getRawValueStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getReturnParam(), realPSModelObject, "getReturnParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getReturnType(), realPSModelObject, "getReturnType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTFIELDNAME, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWVALUE, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRAWVALUESTDDATATYPE, domain, "param7", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETURNPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETURNTYPE, domain, "param1", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}