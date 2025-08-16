package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl.*;



public class PSDEDFSysDataSyncAgentSinkNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowSinkNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.getEventType(), realPSModelObject, "getEventType");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdatasyncagentid", realPSModelObject.getPSSysDataSyncAgent(), realPSModelObject, "getPSSysDataSyncAgent");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodesubtype", realPSModelObject.getSubType(), realPSModelObject, "getSubType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEVENTTYPE, domain, "param7", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDATASYNCAGENT, domain, "pssysdatasyncagentid", net.ibizsys.model.res.IPSSysDataSyncAgent.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTYPE, domain, "logicnodesubtype", java.lang.String.class, new String[]{"RAW"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}