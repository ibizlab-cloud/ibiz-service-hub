package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl.*;



public class PSDELogicLinkTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDELogicLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicnodeid", realPSModelObject.getDstPSDELogicNode(), realPSModelObject, "getDstPSDELogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdelogicnodeid", realPSModelObject.getSrcPSDELogicNode(), realPSModelObject, "getSrcPSDELogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isCatchLink(), realPSModelObject, "isCatchLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isDefaultLink(), realPSModelObject, "isDefaultLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isSubCallLink(), realPSModelObject, "isSubCallLink");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICNODE, domain, "dstpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDELogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDELOGICNODE, domain, "srcpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDELogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCATCHLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSUBCALLLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}