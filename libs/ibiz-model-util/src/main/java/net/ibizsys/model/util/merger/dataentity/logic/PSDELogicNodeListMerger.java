package net.ibizsys.model.util.merger.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDELogicNodeListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.logic.IPSDELogicNode.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("logicNodeType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "AGGREGATEPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEAggregateParamLogicImpl.class, false);
			case "APPENDPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEAppendParamLogicImpl.class, false);
			case "BEGIN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEBeginLogicImpl.class, false);
			case "BINDPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEBindParamLogicImpl.class, false);
			case "CANCELWF":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDECancelWFLogicImpl.class, false);
			case "COMMIT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDECommitLogicImpl.class, false);
			case "COPYPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDECopyParamLogicImpl.class, false);
			case "DEACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEActionLogicImpl.class, false);
			case "DEBUGPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDebugParamLogicImpl.class, false);
			case "DECISION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDecisionLogicImpl.class, false);
			case "DEDATAFLOW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEDataFlowLogicImpl.class, false);
			case "DEDATAQUERY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEDataQueryLogicImpl.class, false);
			case "DEDATASET":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEDataSetLogicImpl.class, false);
			case "DEDATASYNC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEDataSyncLogicImpl.class, false);
			case "DEDTSQUEUE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEDTSQueueLogicImpl.class, false);
			case "DELOGIC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDELogicLogicImpl.class, false);
			case "DENOTIFY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDENotifyLogicImpl.class, false);
			case "DEPRINT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEPrintLogicImpl.class, false);
			case "DEREPORT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEDEReportLogicImpl.class, false);
			case "END":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEEndLogicImpl.class, false);
			case "FILTERPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEFilterParamLogicImpl.class, false);
			case "FILTERPARAM2":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEFilterParam2LogicImpl.class, false);
			case "LOOPSUBCALL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDELoopSubCallLogicImpl.class, false);
			case "MEMO":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEMemoLogicImpl.class, false);
			case "MERGEPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEMergeParamLogicImpl.class, false);
			case "PREPAREPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEPrepareParamLogicImpl.class, false);
			case "RAWSFCODE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERawCodeLogicImpl.class, false);
			case "RAWSQLANDLOOPCALL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERawSqlAndLoopCallLogicImpl.class, false);
			case "RAWSQLCALL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl.class, false);
			case "RAWWEBCALL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERawWebCallLogicImpl.class, false);
			case "RENEWPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERenewParamLogicImpl.class, false);
			case "RESETPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEResetParamLogicImpl.class, false);
			case "ROLLBACK":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDERollbackLogicImpl.class, false);
			case "SFPLUGIN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESFPluginLogicImpl.class, false);
			case "SORTPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESortParamLogicImpl.class, false);
			case "STARTWF":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEStartWFLogicImpl.class, false);
			case "SUBMITWF":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESubmitWFLogicImpl.class, false);
			case "SUBSYSSAMETHOD":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESubSysSAMethodLogicImpl.class, false);
			case "SYSAICHATAGENT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysAIChatAgentLogicImpl.class, false);
			case "SYSAIPIPELINEAGENT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysAIPipelineAgentLogicImpl.class, false);
			case "SYSBDTABLEACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysBDTableActionLogicImpl.class, false);
			case "SYSDATASYNCAGENTOUT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysDataSyncAgentOutLogicImpl.class, false);
			case "SYSDBTABLEACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysDBTableActionLogicImpl.class, false);
			case "SYSLOGIC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysLogicLogicImpl.class, false);
			case "SYSSEARCHDOCACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysSearchDocActionLogicImpl.class, false);
			case "SYSUTIL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDESysUtilLogicImpl.class, false);
			case "THROWEXCEPTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEThrowExceptionLogicImpl.class, false);
			case "USER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUserLogicImpl.class, false);
		}
	}
}