package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDQCustomConditionImpl.*;



public class PSDEDQCustomConditionTranspiler extends net.ibizsys.model.util.transpiler.dataentity.ds.PSDEDQConditionTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDQCustomConditionImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDQCustomConditionImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDQCustomConditionImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getCondition(), realPSModelObject, "getCondition");
		this.setDomainValue(iPSModelTranspileContext, domain, "customtype", realPSModelObject.getCustomType(), realPSModelObject, "getCustomType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDITION, domain, "condvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMTYPE, domain, "customtype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}