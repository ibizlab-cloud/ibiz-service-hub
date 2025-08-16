package net.ibizsys.model.util.transpiler.dataentity.print;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.print.PSDEPrintImpl.*;



public class PSDEPrintTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.print.PSDEPrintImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.print.PSDEPrintImpl realPSModelObject = (net.ibizsys.model.dataentity.print.PSDEPrintImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contenttype", realPSModelObject.getContentType(), realPSModelObject, "getContentType");
		this.setDomainValue(iPSModelTranspileContext, domain, "readpsdeopprivid", realPSModelObject.getDataAccessAction(), realPSModelObject, "getDataAccessAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdeid", realPSModelObject.getDetailPSDE(), realPSModelObject, "getDetailPSDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getDetailPSDEDataSet(), realPSModelObject, "getDetailPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "getdatapsdeactionid", realPSModelObject.getGetDataPSDEAction(), realPSModelObject, "getGetDataPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "readpsdeopprivid", realPSModelObject.getGetDataPSDEOPPriv(), realPSModelObject, "getGetDataPSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspfpluginid", realPSModelObject.getPSSysPFPlugin(), realPSModelObject, "getPSSysPFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "printparams", realPSModelObject.getPrintParams(), realPSModelObject, "getPrintParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "printtag", realPSModelObject.getPrintTag(), realPSModelObject, "getPrintTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "printtag2", realPSModelObject.getPrintTag2(), realPSModelObject, "getPrintTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "reportfile", realPSModelObject.getReportFile(), realPSModelObject, "getReportFile");
		this.setDomainValue(iPSModelTranspileContext, domain, "printmodel", realPSModelObject.getReportModel(), realPSModelObject, "getReportModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "reporttype", realPSModelObject.getReportType(), realPSModelObject, "getReportType");
		this.setDomainValue(iPSModelTranspileContext, domain, "printuimodel", realPSModelObject.getReportUIModel(), realPSModelObject, "getReportUIModel");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecolpriv", realPSModelObject.isEnableColPriv(), realPSModelObject, "isEnableColPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablelog", realPSModelObject.isEnableLog(), realPSModelObject, "isEnableLog");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablemp", realPSModelObject.isEnableMulitPrint(), realPSModelObject, "isEnableMulitPrint");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTTYPE, domain, "contenttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAACCESSACTION, domain, "readpsdeopprivid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSDE, domain, "refpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDETAILPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGETDATAPSDEACTION, domain, "getdatapsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGETDATAPSDEOPPRIV, domain, "readpsdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPFPLUGIN, domain, "pssyspfpluginid", net.ibizsys.model.res.IPSSysPFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRINTPARAMS, domain, "printparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRINTTAG, domain, "printtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRINTTAG2, domain, "printtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTFILE, domain, "reportfile", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTMODEL, domain, "printmodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTTYPE, domain, "reporttype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPORTUIMODEL, domain, "printuimodel", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECOLPRIV, domain, "enablecolpriv", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLELOG, domain, "enablelog", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEMULITPRINT, domain, "enablemp", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}