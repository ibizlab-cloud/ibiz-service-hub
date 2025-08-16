package net.ibizsys.model.util.merger.dataentity.action;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDEActionListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.action.IPSDEAction.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.action.IPSDEAction.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.action.IPSDEAction.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.action.IPSDEAction.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("actionType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "BUILTIN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEBuiltinActionImpl.class, false);
			case "DELOGIC":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDELogicActionImpl.class, false);
			case "INHERIT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEInheritActionImpl.class, false);
			case "REMOTE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDERemoteActionImpl.class, false);
			case "SCRIPT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEScriptActionImpl.class, false);
			case "SELECTBYKEY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDESelectByKeyActionImpl.class, false);
			case "USERCREATE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEUserCreateActionImpl.class, false);
			case "USERCUSTOM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl.class, false);
			case "USERSYSUPDATE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEUserSysUpdateActionImpl.class, false);
			case "USERUPDATE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEUserUpdateActionImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.action.PSDEUserCustomActionImpl.class, false);
		}
	}
}