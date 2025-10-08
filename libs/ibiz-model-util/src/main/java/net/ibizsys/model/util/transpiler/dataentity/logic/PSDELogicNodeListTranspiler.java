package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSDELogicNodeListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSDELogicNode createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSDELogicNode();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "AGGREGATEPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEAggregateParamLogicImpl.class, false);
			case "APPENDPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl.class, false);
			case "BEGIN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEBeginLogicImpl.class, false);
			case "BINDPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEBindParamLogicImpl.class, false);
			case "CANCELWF":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl.class, false);
			case "COMMIT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDECommitLogicImpl.class, false);
			case "COPYPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl.class, false);
			case "DEACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEActionLogicImpl.class, false);
			case "DEBUGPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDebugParamLogicImpl.class, false);
			case "DECISION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDecisionLogicImpl.class, false);
			case "DEDATAFLOW":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEDataFlowLogicImpl.class, false);
			case "DEDATAQUERY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl.class, false);
			case "DEDATASET":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEDataSetLogicImpl.class, false);
			case "DEDATASYNC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEDataSyncLogicImpl.class, false);
			case "DEDTSQUEUE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEDTSQueueLogicImpl.class, false);
			case "DELOGIC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDELogicLogicImpl.class, false);
			case "DENOTIFY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDENotifyLogicImpl.class, false);
			case "DEPRINT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEPrintLogicImpl.class, false);
			case "DEREPORT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEDEReportLogicImpl.class, false);
			case "END":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl.class, false);
			case "FILTERPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEFilterParamLogicImpl.class, false);
			case "FILTERPARAM2":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEFilterParam2LogicImpl.class, false);
			case "LOOPSUBCALL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDELoopSubCallLogicImpl.class, false);
			case "MEMO":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEMemoLogicImpl.class, false);
			case "MERGEPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl.class, false);
			case "PREPAREPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEPrepareParamLogicImpl.class, false);
			case "RAWSFCODE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERawCodeLogicImpl.class, false);
			case "RAWSQLANDLOOPCALL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERawSqlAndLoopCallLogicImpl.class, false);
			case "RAWSQLCALL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl.class, false);
			case "RAWWEBCALL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl.class, false);
			case "RENEWPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERenewParamLogicImpl.class, false);
			case "RESETPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEResetParamLogicImpl.class, false);
			case "ROLLBACK":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDERollbackLogicImpl.class, false);
			case "SFPLUGIN":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESFPluginLogicImpl.class, false);
			case "SORTPARAM":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESortParamLogicImpl.class, false);
			case "STARTWF":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl.class, false);
			case "SUBMITWF":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESubmitWFLogicImpl.class, false);
			case "SUBSYSSAMETHOD":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESubSysSAMethodLogicImpl.class, false);
			case "SYSAICHATAGENT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl.class, false);
			case "SYSAIPIPELINEAGENT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysAIPipelineAgentLogicImpl.class, false);
			case "SYSBDTABLEACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl.class, false);
			case "SYSDATASYNCAGENTOUT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysDataSyncAgentOutLogicImpl.class, false);
			case "SYSDBTABLEACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl.class, false);
			case "SYSLOGIC":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysLogicLogicImpl.class, false);
			case "SYSSEARCHDOCACTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl.class, false);
			case "SYSUTIL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDESysUtilLogicImpl.class, false);
			case "THROWEXCEPTION":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEThrowExceptionLogicImpl.class, false);
			case "USER":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.dataentity.logic.IPSDELogicNode iPSDELogicNode = (net.ibizsys.model.dataentity.logic.IPSDELogicNode)iPSModelObject;
		Object type = iPSDELogicNode.getLogicNodeType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("logicnodetype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}