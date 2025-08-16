package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBIReportItemImpl.*;



public abstract class PSSysBIReportItemTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBIReportObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBIReportItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBIReportItemImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBIReportItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "birepitemtag", realPSModelObject.getItemTag(), realPSModelObject, "getItemTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "birepitemtag2", realPSModelObject.getItemTag2(), realPSModelObject, "getItemTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "birepitemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG, domain, "birepitemtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG2, domain, "birepitemtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "birepitemtype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}