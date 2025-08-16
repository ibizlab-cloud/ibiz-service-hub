package net.ibizsys.model.util.transpiler.dataentity.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.wf.PSDEWFImpl.*;



public class PSDEWFTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.wf.PSDEWFImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.wf.PSDEWFImpl realPSModelObject = (net.ibizsys.model.dataentity.wf.PSDEWFImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "finishpsdeactionid", realPSModelObject.getFinishPSDEAction(), realPSModelObject, "getFinishPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "initpsdeactionid", realPSModelObject.getInitPSDEAction(), realPSModelObject, "getInitPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "mywfdatapslanresid", realPSModelObject.getMyWFDataCapPSLanguageRes(), realPSModelObject, "getMyWFDataCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "mywfdata", realPSModelObject.getMyWFDataCaption(), realPSModelObject, "getMyWFDataCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "mywfworkpslanresid", realPSModelObject.getMyWFWorkCapPSLanguageRes(), realPSModelObject, "getMyWFWorkCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "mywfwork", realPSModelObject.getMyWFWorkCaption(), realPSModelObject, "getMyWFWorkCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "pwfinstpsdefid", realPSModelObject.getPWFInstPSDEField(), realPSModelObject, "getPWFInstPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "proxydatapsdefid", realPSModelObject.getProxyDataPSDEField(), realPSModelObject, "getProxyDataPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "statepsdefid", realPSModelObject.getUDStatePSDEField(), realPSModelObject, "getUDStatePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfactorpsdefid", realPSModelObject.getWFActorsPSDEField(), realPSModelObject, "getWFActorsPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfinstpsdefid", realPSModelObject.getWFInstPSDEField(), realPSModelObject, "getWFInstPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfmode", realPSModelObject.getWFMode(), realPSModelObject, "getWFMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfproxymode", realPSModelObject.getWFProxyMode(), realPSModelObject, "getWFProxyMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfretpsdefid", realPSModelObject.getWFRetPSDEField(), realPSModelObject, "getWFRetPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfstatepsdefid", realPSModelObject.getWFStatePSDEField(), realPSModelObject, "getWFStatePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfsteppsdefid", realPSModelObject.getWFStepPSDEField(), realPSModelObject, "getWFStepPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfverpsdefid", realPSModelObject.getWFVerPSDEField(), realPSModelObject, "getWFVerPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wfidpsdefid", realPSModelObject.getWorkflowPSDEField(), realPSModelObject, "getWorkflowPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "userstart", realPSModelObject.isEnableUserStart(), realPSModelObject, "isEnableUserStart");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFINISHPSDEACTION, domain, "finishpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINITPSDEACTION, domain, "initpsdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMYWFDATACAPPSLANGUAGERES, domain, "mywfdatapslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMYWFDATACAPTION, domain, "mywfdata", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMYWFWORKCAPPSLANGUAGERES, domain, "mywfworkpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMYWFWORKCAPTION, domain, "mywfwork", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPWFINSTPSDEFIELD, domain, "pwfinstpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPROXYDATAPSDEFIELD, domain, "proxydatapsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUDSTATEPSDEFIELD, domain, "statepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFACTORSPSDEFIELD, domain, "wfactorpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFINSTPSDEFIELD, domain, "wfinstpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFMODE, domain, "wfmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFPROXYMODE, domain, "wfproxymode", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFRETPSDEFIELD, domain, "wfretpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFSTATEPSDEFIELD, domain, "wfstatepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFSTEPPSDEFIELD, domain, "wfsteppsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWFVERPSDEFIELD, domain, "wfverpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWORKFLOWPSDEFIELD, domain, "wfidpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEUSERSTART, domain, "userstart", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}