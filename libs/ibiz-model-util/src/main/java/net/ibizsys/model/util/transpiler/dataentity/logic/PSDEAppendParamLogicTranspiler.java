package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl.*;



public class PSDEAppendParamLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstindex", realPSModelObject.getDstIndex(), realPSModelObject, "getDstIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "customsrcparam", realPSModelObject.getSrcFieldName(), realPSModelObject, "getSrcFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcindex", realPSModelObject.getSrcIndex(), realPSModelObject, "getSrcIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getSrcPSDELogicParam(), realPSModelObject, "getSrcPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcsize", realPSModelObject.getSrcSize(), realPSModelObject, "getSrcSize");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTINDEX, domain, "dstindex", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCFIELDNAME, domain, "customsrcparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCINDEX, domain, "srcindex", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDELOGICPARAM, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCSIZE, domain, "srcsize", int.class, new String[]{"-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}