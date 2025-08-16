package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl.*;



public class PSDEMSLogicLinkTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicnodeid", realPSModelObject.getDstPSDEMSLogicNode(), realPSModelObject, "getDstPSDEMSLogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdelogicnodeid", realPSModelObject.getSrcPSDEMSLogicNode(), realPSModelObject, "getSrcPSDEMSLogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isDefaultLink(), realPSModelObject, "isDefaultLink");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEMSLOGICNODE, domain, "dstpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEMSLOGICNODE, domain, "srcpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}