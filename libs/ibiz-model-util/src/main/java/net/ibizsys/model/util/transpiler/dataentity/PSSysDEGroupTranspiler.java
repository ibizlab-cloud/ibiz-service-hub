package net.ibizsys.model.util.transpiler.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.PSSysDEGroupImpl.*;



public class PSSysDEGroupTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.PSSysDEGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.PSSysDEGroupImpl realPSModelObject = (net.ibizsys.model.dataentity.PSSysDEGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouptag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicmode", realPSModelObject.getLogicMode(), realPSModelObject, "getLogicMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam", realPSModelObject.getLogicParam(), realPSModelObject, "getLogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicparam2", realPSModelObject.getLogicParam2(), realPSModelObject, "getLogicParam2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "grouptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "grouptag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICMODE, domain, "logicmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICPARAM, domain, "logicparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICPARAM2, domain, "logicparam2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}