package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl.*;



public class PSDEMSLogicLinkGroupCondTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEMSLogicLinkCondTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkGroupCondImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupop", realPSModelObject.getGroupOP(), realPSModelObject, "getGroupOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupnotflag", realPSModelObject.isNotMode(), realPSModelObject, "isNotMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPOP, domain, "groupop", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOTMODE, domain, "groupnotflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}