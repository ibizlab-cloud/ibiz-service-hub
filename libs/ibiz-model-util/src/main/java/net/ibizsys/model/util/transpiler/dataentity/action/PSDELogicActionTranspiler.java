package net.ibizsys.model.util.transpiler.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.action.PSDELogicActionImpl.*;



public class PSDELogicActionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.action.PSDEActionTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.action.PSDELogicActionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.action.PSDELogicActionImpl realPSModelObject = (net.ibizsys.model.dataentity.action.PSDELogicActionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.getActionHolder(), realPSModelObject, "getActionHolder");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelogicid", realPSModelObject.getPSDELogic(), realPSModelObject, "getPSDELogic");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONHOLDER, domain, "actionholder", int.class, new String[]{"3"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDELOGIC, domain, "psdelogicid", net.ibizsys.model.dataentity.logic.IPSDELogic.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}