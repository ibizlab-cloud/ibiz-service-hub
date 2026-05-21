package net.ibizsys.model.util.transpiler.dataentity.search;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.search.PSDESearchImpl.*;



public class PSDESearchTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.search.PSDESearchImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.search.PSDESearchImpl realPSModelObject = (net.ibizsys.model.dataentity.search.PSDESearchImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "logpsdeid", realPSModelObject.getLogPSDataEntity(), realPSModelObject, "getLogPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysmsgtemplid", realPSModelObject.getPSSysMsgTempl(), realPSModelObject, "getPSSysMsgTempl");
		this.setDomainValue(iPSModelTranspileContext, domain, "statepsdefid", realPSModelObject.getStatePSDEField(), realPSModelObject, "getStatePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "threadrunmode", realPSModelObject.getThreadMode(), realPSModelObject, "getThreadMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "unionkeyflag", realPSModelObject.isEnableUnionKeyValue(), realPSModelObject, "isEnableUnionKeyValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "timermode", realPSModelObject.isTimerMode(), realPSModelObject, "isTimerMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGPSDATAENTITY, domain, "logpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "psdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSMSGTEMPL, domain, "pssysmsgtemplid", net.ibizsys.model.msg.IPSSysMsgTempl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATEPSDEFIELD, domain, "statepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTHREADMODE, domain, "threadrunmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEUNIONKEYVALUE, domain, "unionkeyflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISTIMERMODE, domain, "timermode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}