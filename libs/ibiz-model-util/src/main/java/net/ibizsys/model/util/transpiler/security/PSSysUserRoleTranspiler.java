package net.ibizsys.model.util.transpiler.security;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.security.PSSysUserRoleImpl.*;



public class PSSysUserRoleTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.security.PSSysUserRoleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.security.PSSysUserRoleImpl realPSModelObject = (net.ibizsys.model.security.PSSysUserRoleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.getDefaultUser(), realPSModelObject, "getDefaultUser");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedatasetid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "privid", realPSModelObject.getRoleTag(), realPSModelObject, "getRoleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "roletagpsdefid", realPSModelObject.getRoleTagPSDEField(), realPSModelObject, "getRoleTagPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "privtype", realPSModelObject.getRoleType(), realPSModelObject, "getRoleType");
		this.setDomainValue(iPSModelTranspileContext, domain, "useridpsdefid", realPSModelObject.getUserIdPSDEField(), realPSModelObject, "getUserIdPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "globalflag", realPSModelObject.isGlobalRole(), realPSModelObject, "isGlobalRole");
		this.setDomainValue(iPSModelTranspileContext, domain, "systemflag", realPSModelObject.isSystemReserved(), realPSModelObject, "isSystemReserved");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTUSER, domain, "defaultmode", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETROLETAG, domain, "privid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETROLETAGPSDEFIELD, domain, "roletagpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETROLETYPE, domain, "privtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUSERIDPSDEFIELD, domain, "useridpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISGLOBALROLE, domain, "globalflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSYSTEMRESERVED, domain, "systemflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}