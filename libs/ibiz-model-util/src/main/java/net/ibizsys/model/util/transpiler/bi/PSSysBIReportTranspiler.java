package net.ibizsys.model.util.transpiler.bi;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.bi.PSSysBIReportImpl.*;



public class PSSysBIReportTranspiler extends net.ibizsys.model.util.transpiler.bi.PSSysBISchemeObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.bi.PSSysBIReportImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.bi.PSSysBIReportImpl realPSModelObject = (net.ibizsys.model.bi.PSSysBIReportImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbicubeid", realPSModelObject.getPSSysBICube(), realPSModelObject, "getPSSysBICube");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspfpluginid", realPSModelObject.getPSSysPFPlugin(), realPSModelObject, "getPSSysPFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getPSSysUniRes(), realPSModelObject, "getPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireportmodel", realPSModelObject.getReportModel(), realPSModelObject, "getReportModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireportparams", realPSModelObject.getReportParams(), realPSModelObject, "getReportParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireporttag", realPSModelObject.getReportTag(), realPSModelObject, "getReportTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireporttag2", realPSModelObject.getReportTag2(), realPSModelObject, "getReportTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "bireportuimodel", realPSModelObject.getReportUIModel(), realPSModelObject, "getReportUIModel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBICUBE, domain, "pssysbicubeid", net.ibizsys.model.bi.IPSSysBICube.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPFPLUGIN, domain, "pssyspfpluginid", net.ibizsys.model.res.IPSSysPFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTMODEL, domain, "bireportmodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTPARAMS, domain, "bireportparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG, domain, "bireporttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG2, domain, "bireporttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTUIMODEL, domain, "bireportuimodel", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}