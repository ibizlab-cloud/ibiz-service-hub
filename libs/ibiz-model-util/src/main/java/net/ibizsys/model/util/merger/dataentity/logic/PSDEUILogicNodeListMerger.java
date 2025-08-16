package net.ibizsys.model.util.merger.dataentity.logic;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEUILogicNodeListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.logic.IPSDEUILogicNode.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("logicNodeType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPENDPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIAppendParamLogicImpl.class, false);
			case "BEGIN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIBeginLogicImpl.class, false);
			case "BINDPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIBindParamLogicImpl.class, false);
			case "COPYPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUICopyParamLogicImpl.class, false);
			case "DEACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIDEActionLogicImpl.class, false);
			case "DEBUGPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIDebugParamLogicImpl.class, false);
			case "DEDATASET":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIDEDataSetLogicImpl.class, false);
			case "DELOGIC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIDELogicLogicImpl.class, false);
			case "DEUIACTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIActionLogicImpl.class, false);
			case "END":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIEndLogicImpl.class, false);
			case "LOOPSUBCALL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUILoopSubCallLogicImpl.class, false);
			case "MSGBOX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl.class, false);
			case "PFPLUGIN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIPFPluginLogicImpl.class, false);
			case "RAWJSCODE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIRawCodeLogicImpl.class, false);
			case "RENEWPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIRenewParamLogicImpl.class, false);
			case "RESETPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIResetParamLogicImpl.class, false);
			case "SORTPARAM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUISortParamLogicImpl.class, false);
			case "THROWEXCEPTION":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUIThrowExceptionLogicImpl.class, false);
			case "VIEWCTRLFIREEVENT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUICtrlFireEventLogicImpl.class, false);
			case "VIEWCTRLINVOKE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUICtrlInvokeLogicImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl.class, false);
		}
	}
}