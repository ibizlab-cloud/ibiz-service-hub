package net.ibizsys.model.util.transpiler.app.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.bi.PSAppBIReportImpl.*;



public class PSAppBIReportTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.bi.PSAppBIReportImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.bi.PSAppBIReportImpl realPSModelObject = (net.ibizsys.model.app.bi.PSAppBIReportImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bireporttag", realPSModelObject.getReportTag(), realPSModelObject, "getReportTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireporttag2", realPSModelObject.getReportTag2(), realPSModelObject, "getReportTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireportuimodel", realPSModelObject.getReportUIModel(), realPSModelObject, "getReportUIModel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG, domain, "bireporttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG2, domain, "bireporttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTUIMODEL, domain, "bireportuimodel", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}