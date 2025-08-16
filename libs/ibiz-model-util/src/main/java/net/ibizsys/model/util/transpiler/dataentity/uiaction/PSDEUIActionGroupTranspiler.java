package net.ibizsys.model.util.transpiler.dataentity.uiaction;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl.*;



public class PSDEUIActionGroupTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl realPSModelObject = (net.ibizsys.model.dataentity.uiaction.PSDEUIActionGroupImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag", realPSModelObject.getGroupTag(), realPSModelObject, "getGroupTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag2", realPSModelObject.getGroupTag2(), realPSModelObject, "getGroupTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag3", realPSModelObject.getGroupTag3(), realPSModelObject, "getGroupTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "uagtag4", realPSModelObject.getGroupTag4(), realPSModelObject, "getGroupTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSAppDataEntity(), realPSModelObject, "getPSAppDataEntity");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG, domain, "uagtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG2, domain, "uagtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG3, domain, "uagtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPTAG4, domain, "uagtag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDATAENTITY, domain, "psdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}