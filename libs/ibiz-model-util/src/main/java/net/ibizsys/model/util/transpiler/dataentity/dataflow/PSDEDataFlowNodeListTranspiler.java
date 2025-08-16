package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDEDataFlowNodeListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.util.IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception{
		throw new Exception("没有提供域对象");
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "DFAGGREGATEPROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFAggregateProcessNodeImpl.class, false);
			case "DFDEACTIONSINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFDEActionSinkNodeImpl.class, false);
			case "DFDEDATAFLOWSINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataFlowSinkNodeImpl.class, false);
			case "DFDEDATASETSOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSetSourceNodeImpl.class, false);
			case "DFDEDATASYNCSINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFDEDataSyncSinkNodeImpl.class, false);
			case "DFDELOGICSINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFDELogicSinkNodeImpl.class, false);
			case "DFJOINPROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFJoinProcessNodeImpl.class, false);
			case "DFMERGEPROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl.class, false);
			case "DFPREDEFINEDSOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFPredefinedSourceNodeImpl.class, false);
			case "DFPREPAREPROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFPrepareProcessNodeImpl.class, false);
			case "DFSORTROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSortProcessNodeImpl.class, false);
			case "DFSUBSYSSERVICEAPISINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISinkNodeImpl.class, false);
			case "DFSUBSYSSERVICEAPISOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSubSysServiceAPISourceNodeImpl.class, false);
			case "DFSYSBDSCHEMESINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSinkNodeImpl.class, false);
			case "DFSYSBDSCHEMESOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysBDSchemeSourceNodeImpl.class, false);
			case "DFSYSDATASYNCAGENTSINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSinkNodeImpl.class, false);
			case "DFSYSDATASYNCAGENTSOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDataSyncAgentSourceNodeImpl.class, false);
			case "DFSYSDBSCHEMESINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSinkNodeImpl.class, false);
			case "DFSYSDBSCHEMESOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysDBSchemeSourceNodeImpl.class, false);
			case "DFSYSRESOURCESINK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSinkNodeImpl.class, false);
			case "DFSYSRESOURCESOURCE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDFSysResourceSourceNodeImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.dataflow.PSDEDataFlowNodeImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode iPSDEDataFlowNode = (net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode)iPSModelObject;
		Object type = iPSDEDataFlowNode.getNodeType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("nodetype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}