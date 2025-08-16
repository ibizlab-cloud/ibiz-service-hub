package net.ibizsys.model.util.transpiler.app.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.res.PSAppDEFInputTipSetImpl.*;



public class PSAppDEFInputTipSetTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.res.PSAppDEFInputTipSetImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.res.PSAppDEFInputTipSetImpl realPSModelObject = (net.ibizsys.model.app.res.PSAppDEFInputTipSetImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpsdefid", realPSModelObject.getContentPSAppDEField(), realPSModelObject, "getContentPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ecpsdefid", realPSModelObject.getEnableClosePSAppDEField(), realPSModelObject, "getEnableClosePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkpsdefid", realPSModelObject.getLinkPSAppDEField(), realPSModelObject, "getLinkPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "uniquetagpsdefid", realPSModelObject.getUniqueTagPSAppDEField(), realPSModelObject, "getUniqueTagPSAppDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSAPPDEFIELD, domain, "contentpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENABLECLOSEPSAPPDEFIELD, domain, "ecpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKPSAPPDEFIELD, domain, "linkpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedatasetid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIQUETAGPSAPPDEFIELD, domain, "uniquetagpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}