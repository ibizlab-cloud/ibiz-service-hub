package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBIHierarchyImpl.*;



public class PSSysBIHierarchyTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBIDimensionObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBIHierarchyImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBIHierarchyImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBIHierarchyImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "allcaption", realPSModelObject.getAllCaption(), realPSModelObject, "getAllCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "hasall", realPSModelObject.hasAll(), realPSModelObject, "hasAll");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALLCAPTION, domain, "allcaption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_HASALL, domain, "hasall", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}