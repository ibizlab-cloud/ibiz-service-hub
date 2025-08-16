package net.ibizsys.model.util.transpiler.app.control;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.control.PSAppCounterImpl.*;



public class PSAppCounterTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.control.PSAppCounterImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.control.PSAppCounterImpl realPSModelObject = (net.ibizsys.model.app.control.PSAppCounterImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "counterdata", realPSModelObject.getCounterData(), realPSModelObject, "getCounterData");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterdata2", realPSModelObject.getCounterData2(), realPSModelObject, "getCounterData2");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscounterid", realPSModelObject.getCounterType(), realPSModelObject, "getCounterType");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getGetPSAppDEAction(), realPSModelObject, "getGetPSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getGetPSAppDEDataSet(), realPSModelObject, "getGetPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "reloadtimer", realPSModelObject.getTimer(), realPSModelObject, "getTimer");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERDATA, domain, "counterdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERDATA2, domain, "counterdata2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERTYPE, domain, "pscounterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGETPSAPPDEACTION, domain, "psdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGETPSAPPDEDATASET, domain, "psdedatasetid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMER, domain, "reloadtimer", int.class, new String[]{"0","-1"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}