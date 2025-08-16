package net.ibizsys.model.util.transpiler.dataentity.datasync;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.datasync.PSDEDataSyncImpl.*;



public class PSDEDataSyncTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.datasync.PSDEDataSyncImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.datasync.PSDEDataSyncImpl realPSModelObject = (net.ibizsys.model.dataentity.datasync.PSDEDataSyncImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "eventtype", realPSModelObject.getEventType(), realPSModelObject, "getEventType");
		this.setDomainValue(iPSModelTranspileContext, domain, "importpsdeactionid", realPSModelObject.getImportPSDEAction(), realPSModelObject, "getImportPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "inpsdedatasetid", realPSModelObject.getInPSDEDataSet(), realPSModelObject, "getInPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "inpssysdatasyncagentid", realPSModelObject.getInPSSysDataSyncAgent(), realPSModelObject, "getInPSSysDataSyncAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "incustomcode", realPSModelObject.getInScriptCode(), realPSModelObject, "getInScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "inpsdeactionid", realPSModelObject.getInTestPSDEAction(), realPSModelObject, "getInTestPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpsdedatasetid", realPSModelObject.getOutPSDEDataSet(), realPSModelObject, "getOutPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpssysdatasyncagentid", realPSModelObject.getOutPSSysDataSyncAgent(), realPSModelObject, "getOutPSSysDataSyncAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "outcustomcode", realPSModelObject.getOutScriptCode(), realPSModelObject, "getOutScriptCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpsdeactionid", realPSModelObject.getOutTestPSDEAction(), realPSModelObject, "getOutTestPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "outmode", realPSModelObject.getOutputMode(), realPSModelObject, "getOutputMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "syncdir", realPSModelObject.getSyncDir(), realPSModelObject, "getSyncDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "exportfull", realPSModelObject.isExportFull(), realPSModelObject, "isExportFull");
		this.setDomainValue(iPSModelTranspileContext, domain, "incustommode", realPSModelObject.isInCustomCode(), realPSModelObject, "isInCustomCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "outcustommode", realPSModelObject.isOutCustomCode(), realPSModelObject, "isOutCustomCode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTTYPE, domain, "eventtype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPORTPSDEACTION, domain, "importpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPSDEDATASET, domain, "inpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINPSSYSDATASYNCAGENT, domain, "inpssysdatasyncagentid", net.ibizsys.model.res.IPSSysDataSyncAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINSCRIPTCODE, domain, "incustomcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINTESTPSDEACTION, domain, "inpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSDEDATASET, domain, "outpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSSYSDATASYNCAGENT, domain, "outpssysdatasyncagentid", net.ibizsys.model.res.IPSSysDataSyncAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTSCRIPTCODE, domain, "outcustomcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTTESTPSDEACTION, domain, "outpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPUTMODE, domain, "outmode", int.class, new String[]{"1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSYNCDIR, domain, "syncdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXPORTFULL, domain, "exportfull", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINCUSTOMCODE, domain, "incustommode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISOUTCUSTOMCODE, domain, "outcustommode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}