package net.ibizsys.model.util.merger.dataentity.action;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.dataentity.action.PSDEActionImplBase.*;



public class PSDEActionMergerBase extends net.ibizsys.model.util.merger.dataentity.PSDataEntityObjectMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.action.PSDEActionImplBase.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETAFTERPSDEACTIONLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETAFTERPSDEACTIONLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETBEFOREPSDEACTIONLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETBEFOREPSDEACTIONLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETCHECKPSDEACTIONLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETCHECKPSDEACTIONLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEACTIONINPUT)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionInput.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEACTIONINPUT);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEACTIONPARAMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionParam.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEACTIONPARAMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEACTIONRETURN)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionReturn.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEACTIONRETURN);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEACTIONVRS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionVR.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEACTIONVRS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSSYSTESTCASES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.testing.IPSSysTestCase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSSYSTESTCASES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPREPAREPSDEACTIONLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPREPAREPSDEACTIONLOGICS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}