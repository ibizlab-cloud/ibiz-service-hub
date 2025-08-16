package net.ibizsys.model.util.transpiler.msg;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.msg.PSSysMsgTargetImpl.*;



public class PSSysMsgTargetTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.msg.PSSysMsgTargetImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.msg.PSSysMsgTargetImpl realPSModelObject = (net.ibizsys.model.msg.PSSysMsgTargetImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtargetparams", realPSModelObject.getMsgTargetParams(), realPSModelObject, "getMsgTargetParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtargettag", realPSModelObject.getMsgTargetTag(), realPSModelObject, "getMsgTargetTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtargettag2", realPSModelObject.getMsgTargetTag2(), realPSModelObject, "getMsgTargetTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "msgtargettype", realPSModelObject.getMsgTargetType(), realPSModelObject, "getMsgTargetType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysutildeid", realPSModelObject.getPSSysUtil(), realPSModelObject, "getPSSysUtil");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "targetpsdefid", realPSModelObject.getTargetPSDEField(), realPSModelObject, "getTargetPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "targettypepsdefid", realPSModelObject.getTargetTypePSDEField(), realPSModelObject, "getTargetTypePSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTARGETPARAMS, domain, "msgtargetparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTARGETTAG, domain, "msgtargettag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTARGETTAG2, domain, "msgtargettag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGTARGETTYPE, domain, "msgtargettype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUTIL, domain, "pssysutildeid", net.ibizsys.model.res.IPSSysUtil.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETPSDEFIELD, domain, "targetpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTARGETTYPEPSDEFIELD, domain, "targettypepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}