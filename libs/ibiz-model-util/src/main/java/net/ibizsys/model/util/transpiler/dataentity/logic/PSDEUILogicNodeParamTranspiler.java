package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUILogicNodeParamImpl.*;



public class PSDEUILogicNodeParamTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUILogicNodeParamImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUILogicNodeParamImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUILogicNodeParamImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aggmode", realPSModelObject.getAggMode(), realPSModelObject, "getAggMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "customdstparam", realPSModelObject.getDstFieldName(), realPSModelObject, "getDstFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstindex", realPSModelObject.getDstIndex(), realPSModelObject, "getDstIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDEUILogicParam(), realPSModelObject, "getDstPSDEUILogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstsortdir", realPSModelObject.getDstSortDir(), realPSModelObject, "getDstSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtype", realPSModelObject.getParamAction(), realPSModelObject, "getParamAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "customsrcparam", realPSModelObject.getSrcFieldName(), realPSModelObject, "getSrcFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcindex", realPSModelObject.getSrcIndex(), realPSModelObject, "getSrcIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getSrcPSDEUILogicParam(), realPSModelObject, "getSrcPSDEUILogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcsize", realPSModelObject.getSrcSize(), realPSModelObject, "getSrcSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvalue", realPSModelObject.getSrcValue(), realPSModelObject, "getSrcValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcvaluetype", realPSModelObject.getSrcValueType(), realPSModelObject, "getSrcValueType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGMODE, domain, "aggmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTFIELDNAME, domain, "customdstparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTINDEX, domain, "dstindex", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEUILOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTSORTDIR, domain, "dstsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMACTION, domain, "paramtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCFIELDNAME, domain, "customsrcparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCINDEX, domain, "srcindex", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEUILOGICPARAM, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCSIZE, domain, "srcsize", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUE, domain, "srcvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCVALUETYPE, domain, "srcvaluetype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}