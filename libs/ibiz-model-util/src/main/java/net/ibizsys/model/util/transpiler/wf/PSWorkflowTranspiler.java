package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWorkflowImpl.*;



public class PSWorkflowTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWorkflowImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWorkflowImpl realPSModelObject = (net.ibizsys.model.wf.PSWorkflowImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "enabledynasys", realPSModelObject.getDynaSysMode(), realPSModelObject, "getDynaSysMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfcancelvalue", realPSModelObject.getEntityWFCancelState(), realPSModelObject, "getEntityWFCancelState");
		this.setDomainValue(iPSModelTranspileContext, domain, "wferrorvalue", realPSModelObject.getEntityWFErrorState(), realPSModelObject, "getEntityWFErrorState");
		this.setDomainValue(iPSModelTranspileContext, domain, "wffinishevalue", realPSModelObject.getEntityWFFinishState(), realPSModelObject, "getEntityWFFinishState");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfstatevalue", realPSModelObject.getEntityWFState(), realPSModelObject, "getEntityWFState");
		this.setDomainValue(iPSModelTranspileContext, domain, "psworkflowname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepslanresid", realPSModelObject.getNamePSLanguageRes(), realPSModelObject, "getNamePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgqueueid", realPSModelObject.getPSSysMsgQueue(), realPSModelObject, "getPSSysMsgQueue");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfcatcode", realPSModelObject.getWFCatCode(), realPSModelObject, "getWFCatCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfenginetype", realPSModelObject.getWFEngineType(), realPSModelObject, "getWFEngineType");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfproxymode", realPSModelObject.getWFProxyMode(), realPSModelObject, "getWFProxyMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfsn", realPSModelObject.getWFSN(), realPSModelObject, "getWFSN");
		this.setDomainValue(iPSModelTranspileContext, domain, "wftype", realPSModelObject.getWFType(), realPSModelObject, "getWFType");
		this.setDomainValue(iPSModelTranspileContext, domain, "remoteengineflag", realPSModelObject.isUseRemoteEngine(), realPSModelObject, "isUseRemoteEngine");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNASYSMODE, domain, "enabledynasys", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFCANCELSTATE, domain, "wfcancelvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFERRORSTATE, domain, "wferrorvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFFINISHSTATE, domain, "wffinishevalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETENTITYWFSTATE, domain, "wfstatevalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "psworkflowname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSLANGUAGERES, domain, "namepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGQUEUE, domain, "pssysmsgqueueid", net.ibizsys.model.msg.IPSSysMsgQueue.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFCATCODE, domain, "wfcatcode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFENGINETYPE, domain, "wfenginetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFPROXYMODE, domain, "wfproxymode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFSN, domain, "wfsn", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFTYPE, domain, "wftype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUSEREMOTEENGINE, domain, "remoteengineflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}