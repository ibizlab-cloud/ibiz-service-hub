package net.ibizsys.model.util.transpiler.dataentity.dataexport;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl.*;



public class PSDEDataExportTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl realPSModelObject = (net.ibizsys.model.dataentity.dataexport.PSDEDataExportImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "expparams", realPSModelObject.getExpParams(), realPSModelObject, "getExpParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "exptag", realPSModelObject.getExpTag(), realPSModelObject, "getExpTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "exptag2", realPSModelObject.getExpTag2(), realPSModelObject, "getExpTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxrowcnt", realPSModelObject.getMaxRowCount(), realPSModelObject, "getMaxRowCount");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecustomized", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.isEnableFront(), realPSModelObject, "isEnableFront");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXPPARAMS, domain, "expparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXPTAG, domain, "exptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEXPTAG2, domain, "exptag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXROWCOUNT, domain, "maxrowcnt", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "actionholder", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "enablecustomized", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFRONT, domain, "actionholder", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}