package net.ibizsys.model.util.transpiler.system;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.system.PSSystemModuleImpl.*;



public class PSSystemModuleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.system.PSSystemModuleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.system.PSSystemModuleImpl realPSModelObject = (net.ibizsys.model.system.PSSystemModuleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dslink", realPSModelObject.getDSLink(), realPSModelObject, "getDSLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "modulesn", realPSModelObject.getModuleSN(), realPSModelObject, "getModuleSN");
		this.setDomainValue(iPSModelTranspileContext, domain, "modtag", realPSModelObject.getModuleTag(), realPSModelObject, "getModuleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "modtag2", realPSModelObject.getModuleTag2(), realPSModelObject, "getModuleTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "modtag3", realPSModelObject.getModuleTag3(), realPSModelObject, "getModuleTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "modtag4", realPSModelObject.getModuleTag4(), realPSModelObject, "getModuleTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkgcodename", realPSModelObject.getPKGCodeName(), realPSModelObject, "getPKGCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmodelgroupid", realPSModelObject.getPSSysModelGroup(), realPSModelObject, "getPSSysModelGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysrefid", realPSModelObject.getPSSysRef(), realPSModelObject, "getPSSysRef");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefaultModule(), realPSModelObject, "isDefaultModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "subsysmodule", realPSModelObject.isSubSysModule(), realPSModelObject, "isSubSysModule");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSLINK, domain, "dslink", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULESN, domain, "modulesn", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG, domain, "modtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG2, domain, "modtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG3, domain, "modtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODULETAG4, domain, "modtag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPKGCODENAME, domain, "pkgcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMODELGROUP, domain, "pssysmodelgroupid", net.ibizsys.model.system.IPSSysModelGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSREF, domain, "pssysrefid", net.ibizsys.model.system.IPSSysRef.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODULE, domain, "defaultflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSUBSYSMODULE, domain, "subsysmodule", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}