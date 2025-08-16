package net.ibizsys.model.util.merger.app.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.app.logic.BuiltinPSAppUINewDataLogicImpl.*;



public class BuiltinPSAppUINewDataLogicMerger extends net.ibizsys.model.util.merger.app.logic.BuiltinPSAppUILogicMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.logic.BuiltinPSAppUINewDataLogicImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETBATCHADDPSAPPVIEWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETBATCHADDPSAPPVIEWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETNEWDATAPSAPPVIEW)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETNEWDATAPSAPPVIEW);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETNEWDATAPSAPPVIEWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETNEWDATAPSAPPVIEWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETWIZARDPSAPPVIEW)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.logic.IPSAppUILogicRefView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETWIZARDPSAPPVIEW);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}