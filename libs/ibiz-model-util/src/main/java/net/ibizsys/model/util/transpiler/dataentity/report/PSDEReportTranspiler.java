package net.ibizsys.model.util.transpiler.dataentity.report;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.report.PSDEReportImpl.*;



public class PSDEReportTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.report.PSDEReportImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.report.PSDEReportImpl realPSModelObject = (net.ibizsys.model.dataentity.report.PSDEReportImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid2", realPSModelObject.getPSAppDEDataSet2(), realPSModelObject, "getPSAppDEDataSet2");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid3", realPSModelObject.getPSAppDEDataSet3(), realPSModelObject, "getPSAppDEDataSet3");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid4", realPSModelObject.getPSAppDEDataSet4(), realPSModelObject, "getPSAppDEDataSet4");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid2", realPSModelObject.getPSDEDataSet2(), realPSModelObject, "getPSDEDataSet2");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid3", realPSModelObject.getPSDEDataSet3(), realPSModelObject, "getPSDEDataSet3");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid4", realPSModelObject.getPSDEDataSet4(), realPSModelObject, "getPSDEDataSet4");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbicubeid", realPSModelObject.getPSSysBICube(), realPSModelObject, "getPSSysBICube");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbireportid", realPSModelObject.getPSSysBIReport(), realPSModelObject, "getPSSysBIReport");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbischemeid", realPSModelObject.getPSSysBIScheme(), realPSModelObject, "getPSSysBIScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspfpluginid", realPSModelObject.getPSSysPFPlugin(), realPSModelObject, "getPSSysPFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "reportfile", realPSModelObject.getReportFile(), realPSModelObject, "getReportFile");
		this.setDomainValue(iPSModelTranspileContext, domain, "reportmodel", realPSModelObject.getReportModel(), realPSModelObject, "getReportModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "reportparams", realPSModelObject.getReportParams(), realPSModelObject, "getReportParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "reporttag", realPSModelObject.getReportTag(), realPSModelObject, "getReportTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "reporttag2", realPSModelObject.getReportTag2(), realPSModelObject, "getReportTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "reporttype", realPSModelObject.getReportType(), realPSModelObject, "getReportType");
		this.setDomainValue(iPSModelTranspileContext, domain, "reportuimodel", realPSModelObject.getReportUIModel(), realPSModelObject, "getReportUIModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelog", realPSModelObject.isEnableLog(), realPSModelObject, "isEnableLog");
		this.setDomainValue(iPSModelTranspileContext, domain, "multipage", realPSModelObject.isMultiPage(), realPSModelObject, "isMultiPage");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET2, domain, "psdedsid2", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET3, domain, "psdedsid3", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET4, domain, "psdedsid4", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET2, domain, "psdedsid2", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET3, domain, "psdedsid3", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET4, domain, "psdedsid4", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBICUBE, domain, "pssysbicubeid", net.ibizsys.model.bi.IPSSysBICube.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBIREPORT, domain, "pssysbireportid", net.ibizsys.model.bi.IPSSysBIReport.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBISCHEME, domain, "pssysbischemeid", net.ibizsys.model.bi.IPSSysBIScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPFPLUGIN, domain, "pssyspfpluginid", net.ibizsys.model.res.IPSSysPFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTFILE, domain, "reportfile", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTMODEL, domain, "reportmodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTPARAMS, domain, "reportparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG, domain, "reporttag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTAG2, domain, "reporttag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTYPE, domain, "reporttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTUIMODEL, domain, "reportuimodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLELOG, domain, "enablelog", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMULTIPAGE, domain, "multipage", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}