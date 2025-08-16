package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl.*;



public class PSDEDFSysBDSchemeSinkNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowSinkNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdefgroupid", realPSModelObject.getDstPSDEFGroup(), realPSModelObject, "getDstPSDEFGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdschemeid", realPSModelObject.getPSSysBDScheme(), realPSModelObject, "getPSSysBDScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysbdtableid", realPSModelObject.getPSSysBDTable(), realPSModelObject, "getPSSysBDTable");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodesubtype", realPSModelObject.getSubType(), realPSModelObject, "getSubType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getTableAction(), realPSModelObject, "getTableAction");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEFGROUP, domain, "dstpsdefgroupid", net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDSCHEME, domain, "pssysbdschemeid", net.ibizsys.model.ba.IPSSysBDScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSBDTABLE, domain, "pssysbdtableid", net.ibizsys.model.ba.IPSSysBDTable.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTYPE, domain, "logicnodesubtype", java.lang.String.class, new String[]{"BDTABLE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTABLEACTION, domain, "param1", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}