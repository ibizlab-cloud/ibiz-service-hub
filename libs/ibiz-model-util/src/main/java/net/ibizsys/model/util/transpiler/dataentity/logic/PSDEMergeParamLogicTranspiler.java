package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl.*;



public class PSDEMergeParamLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl)iPSModelObject;
		this.setDomainListValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getCopyFields(), realPSModelObject, "getCopyFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param3", realPSModelObject.getDstParamMergeField(), realPSModelObject, "getDstParamMergeField");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getMergeMode(), realPSModelObject, "getMergeMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "retpsdlparamid", realPSModelObject.getRetPSDELogicParam(), realPSModelObject, "getRetPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getSrcPSDELogicParam(), realPSModelObject, "getSrcPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getSrcParamMergeField(), realPSModelObject, "getSrcParamMergeField");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isCopyIfNotExists(), realPSModelObject, "isCopyIfNotExists");
		this.setDomainValue(iPSModelTranspileContext, domain, "param10", realPSModelObject.isMergeIntoField(), realPSModelObject, "isMergeIntoField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETCOPYFIELDS, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPARAMMERGEFIELD, domain, "param3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMERGEMODE, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRETPSDELOGICPARAM, domain, "retpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDELOGICPARAM, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPARAMMERGEFIELD, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCOPYIFNOTEXISTS, domain, "param9", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMERGEINTOFIELD, domain, "param10", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}