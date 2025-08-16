package net.ibizsys.model.util.transpiler.backservice;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.backservice.PSSysBackServiceImpl.*;



public class PSSysBackServiceTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.backservice.PSSysBackServiceImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.backservice.PSSysBackServiceImpl realPSModelObject = (net.ibizsys.model.backservice.PSSysBackServiceImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "containertag", realPSModelObject.getContainerTag(), realPSModelObject, "getContainerTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeactionid", realPSModelObject.getPSDEAction(), realPSModelObject, "getPSDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecontainer", realPSModelObject.getServiceContainer(), realPSModelObject, "getServiceContainer");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceobj", realPSModelObject.getServiceHandler(), realPSModelObject, "getServiceHandler");
		this.setDomainValue(iPSModelTranspileContext, domain, "runorder", realPSModelObject.getServiceOrder(), realPSModelObject, "getServiceOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparams", realPSModelObject.getServiceParams(), realPSModelObject, "getServiceParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicepolicy", realPSModelObject.getServicePolicy(), realPSModelObject, "getServicePolicy");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicepolicy2", realPSModelObject.getServicePolicy2(), realPSModelObject, "getServicePolicy2");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicetag", realPSModelObject.getServiceTag(), realPSModelObject, "getServiceTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicetag2", realPSModelObject.getServiceTag2(), realPSModelObject, "getServiceTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "startmode", realPSModelObject.getStartMode(), realPSModelObject, "getStartMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "tasktype", realPSModelObject.getTaskType(), realPSModelObject, "getTaskType");
		this.setDomainValue(iPSModelTranspileContext, domain, "timerpolicy", realPSModelObject.getTimerPolicy(), realPSModelObject, "getTimerPolicy");
		this.setDomainValue(iPSModelTranspileContext, domain, "timermode", realPSModelObject.isTimerMode(), realPSModelObject, "isTimerMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTAINERTAG, domain, "containertag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEACTION, domain, "psdeactionid", net.ibizsys.model.dataentity.action.IPSDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECONTAINER, domain, "servicecontainer", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEHANDLER, domain, "serviceobj", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEORDER, domain, "runorder", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAMS, domain, "serviceparams", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPOLICY, domain, "servicepolicy", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPOLICY2, domain, "servicepolicy2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICETAG, domain, "servicetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICETAG2, domain, "servicetag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTARTMODE, domain, "startmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTASKTYPE, domain, "tasktype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMERPOLICY, domain, "timerpolicy", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTIMERMODE, domain, "timermode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}