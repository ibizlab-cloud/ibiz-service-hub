package net.ibizsys.model.util.transpiler.dataentity.priv;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl.*;



public class PSDEUserRoleTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl realPSModelObject = (net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "sysuserdr2param", realPSModelObject.getCustomDRMode2Param(), realPSModelObject, "getCustomDRMode2Param");
		this.setDomainValue(iPSModelTranspileContext, domain, "sysuserdrparam", realPSModelObject.getCustomDRModeParam(), realPSModelObject, "getCustomDRModeParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "orgdr", realPSModelObject.getOrgDR(), realPSModelObject, "getOrgDR");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuserdrid", realPSModelObject.getPSSysUserDR(), realPSModelObject, "getPSSysUserDR");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuserdrid2", realPSModelObject.getPSSysUserDR2(), realPSModelObject, "getPSSysUserDR2");
		this.setDomainValue(iPSModelTranspileContext, domain, "userroletag", realPSModelObject.getRoleTag(), realPSModelObject, "getRoleTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "secbc", realPSModelObject.getSecBC(), realPSModelObject, "getSecBC");
		this.setDomainValue(iPSModelTranspileContext, domain, "secdr", realPSModelObject.getSecDR(), realPSModelObject, "getSecDR");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableorgdr", realPSModelObject.isEnableOrgDR(), realPSModelObject, "isEnableOrgDR");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablesecbc", realPSModelObject.isEnableSecBC(), realPSModelObject, "isEnableSecBC");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablesecdr", realPSModelObject.isEnableSecDR(), realPSModelObject, "isEnableSecDR");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableuserdr", realPSModelObject.isEnableUserDR(), realPSModelObject, "isEnableUserDR");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMDRMODE2PARAM, domain, "sysuserdr2param", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMDRMODEPARAM, domain, "sysuserdrparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORGDR, domain, "orgdr", long.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUSERDR, domain, "pssysuserdrid", net.ibizsys.model.security.IPSSysUserDR.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUSERDR2, domain, "pssysuserdrid2", net.ibizsys.model.security.IPSSysUserDR.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETROLETAG, domain, "userroletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSECBC, domain, "secbc", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSECDR, domain, "secdr", long.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEORGDR, domain, "enableorgdr", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESECBC, domain, "enablesecbc", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESECDR, domain, "enablesecdr", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEUSERDR, domain, "enableuserdr", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}