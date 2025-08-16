package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl.*;



public class PSDECopyParamLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl)iPSModelObject;
		this.setDomainListValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getCopyFields(), realPSModelObject, "getCopyFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdlparamid", realPSModelObject.getSrcPSDELogicParam(), realPSModelObject, "getSrcPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isCopyIfNotExists(), realPSModelObject, "isCopyIfNotExists");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETCOPYFIELDS, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDELOGICPARAM, domain, "srcpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCOPYIFNOTEXISTS, domain, "param9", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}