package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUILogicLinkImpl.*;



public class PSDEUILogicLinkTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUILogicLinkImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUILogicLinkImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUILogicLinkImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdelogicnodeid", realPSModelObject.getDstPSDEUILogicNode(), realPSModelObject, "getDstPSDEUILogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkcond", realPSModelObject.getLinkCond(), realPSModelObject, "getLinkCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.getLinkMode(), realPSModelObject, "getLinkMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "srcpsdelogicnodeid", realPSModelObject.getSrcPSDEUILogicNode(), realPSModelObject, "getSrcPSDEUILogicNode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isCatchLink(), realPSModelObject, "isCatchLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isDefaultLink(), realPSModelObject, "isDefaultLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isFulfilledLink(), realPSModelObject, "isFulfilledLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isRejectedLink(), realPSModelObject, "isRejectedLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultlink", realPSModelObject.isSubCallLink(), realPSModelObject, "isSubCallLink");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEUILOGICNODE, domain, "dstpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKCOND, domain, "linkcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKMODE, domain, "defaultlink", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSRCPSDEUILOGICNODE, domain, "srcpsdelogicnodeid", net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCATCHLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFULFILLEDLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREJECTEDLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSUBCALLLINK, domain, "defaultlink", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}