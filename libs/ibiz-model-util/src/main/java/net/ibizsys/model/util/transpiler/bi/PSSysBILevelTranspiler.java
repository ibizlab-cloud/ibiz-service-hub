package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBILevelImpl.*;



public class PSSysBILevelTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBIHierarchyObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBILevelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBILevelImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBILevelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aggcaption", realPSModelObject.getAggCaption(), realPSModelObject, "getAggCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquemembers", realPSModelObject.isUniqueMembers(), realPSModelObject, "isUniqueMembers");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGCAPTION, domain, "aggcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUNIQUEMEMBERS, domain, "uniquemembers", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}