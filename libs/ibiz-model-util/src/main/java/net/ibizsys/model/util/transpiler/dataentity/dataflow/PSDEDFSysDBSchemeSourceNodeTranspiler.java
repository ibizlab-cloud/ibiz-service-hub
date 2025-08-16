package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl.*;



public class PSDEDFSysDBSchemeSourceNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowSourceNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedataqueryid", realPSModelObject.getDstPSDEDataQuery(), realPSModelObject, "getDstPSDEDataQuery");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdedatasetid", realPSModelObject.getDstPSDEDataSet(), realPSModelObject, "getDstPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdeid", realPSModelObject.getDstPSDataEntity(), realPSModelObject, "getDstPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdbschemeid", realPSModelObject.getPSSysDBScheme(), realPSModelObject, "getPSSysDBScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdbtableid", realPSModelObject.getPSSysDBTable(), realPSModelObject, "getPSSysDBTable");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getSql(), realPSModelObject, "getSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodesubtype", realPSModelObject.getSubType(), realPSModelObject, "getSubType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATAQUERY, domain, "dstpsdedataqueryid", net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDEDATASET, domain, "dstpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDATAENTITY, domain, "dstpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDBSCHEME, domain, "pssysdbschemeid", net.ibizsys.model.database.IPSSysDBScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDBTABLE, domain, "pssysdbtableid", net.ibizsys.model.database.IPSSysDBTable.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSQL, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSUBTYPE, domain, "logicnodesubtype", java.lang.String.class, new String[]{"DBTABLE"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}