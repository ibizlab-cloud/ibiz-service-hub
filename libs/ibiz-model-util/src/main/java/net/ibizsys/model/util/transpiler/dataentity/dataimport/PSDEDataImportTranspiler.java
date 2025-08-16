package net.ibizsys.model.util.transpiler.dataentity.dataimport;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl.*;



public class PSDEDataImportTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl realPSModelObject = (net.ibizsys.model.dataentity.dataimport.PSDEDataImportImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "batchsize", realPSModelObject.getBatchSize(), realPSModelObject, "getBatchSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "createpsdeopprivid", realPSModelObject.getCreateDataAccessAction(), realPSModelObject, "getCreateDataAccessAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "createpsdeactionid", realPSModelObject.getCreatePSAppDEAction(), realPSModelObject, "getCreatePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "createpsdeactionid", realPSModelObject.getCreatePSDEAction(), realPSModelObject, "getCreatePSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "impparams", realPSModelObject.getImpParams(), realPSModelObject, "getImpParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "imptag", realPSModelObject.getImpTag(), realPSModelObject, "getImpTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "imptag2", realPSModelObject.getImpTag2(), realPSModelObject, "getImpTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "potime", realPSModelObject.getPOTime(), realPSModelObject, "getPOTime");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatepsdeopprivid", realPSModelObject.getUpdateDataAccessAction(), realPSModelObject, "getUpdateDataAccessAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatepsdeactionid", realPSModelObject.getUpdatePSAppDEAction(), realPSModelObject, "getUpdatePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "updatepsdeactionid", realPSModelObject.getUpdatePSDEAction(), realPSModelObject, "getUpdatePSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.isEnableBackend(), realPSModelObject, "isEnableBackend");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecustomized", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		this.setDomainValue(iPSModelTranspileContext, domain, "actionholder", realPSModelObject.isEnableFront(), realPSModelObject, "isEnableFront");
		this.setDomainValue(iPSModelTranspileContext, domain, "stopwhenerror", realPSModelObject.isIgnoreError(), realPSModelObject, "isIgnoreError");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBATCHSIZE, domain, "batchsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEDATAACCESSACTION, domain, "createpsdeopprivid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEPSAPPDEACTION, domain, "createpsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATEPSDEACTION, domain, "createpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPPARAMS, domain, "impparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPTAG, domain, "imptag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPTAG2, domain, "imptag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPOTIME, domain, "potime", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEDATAACCESSACTION, domain, "updatepsdeopprivid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEPSAPPDEACTION, domain, "updatepsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUPDATEPSDEACTION, domain, "updatepsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEBACKEND, domain, "actionholder", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "enablecustomized", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEFRONT, domain, "actionholder", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNOREERROR, domain, "stopwhenerror", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}