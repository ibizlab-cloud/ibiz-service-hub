package net.ibizsys.model.util.transpiler.ai;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.ai.PSSysAIPipelineJobImpl.*;



public class PSSysAIPipelineJobTranspiler extends net.ibizsys.model.util.transpiler.ai.PSSysAIPipelineObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.ai.PSSysAIPipelineJobImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.ai.PSSysAIPipelineJobImpl realPSModelObject = (net.ibizsys.model.ai.PSSysAIPipelineJobImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "steppscodelistid", realPSModelObject.getStepPSCodeList(), realPSModelObject, "getStepPSCodeList");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTEPPSCODELIST, domain, "steppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}