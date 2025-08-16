package net.ibizsys.model.util.merger.control.dashboard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl.*;



public class PSDBViewPortletPartMerger extends net.ibizsys.model.util.merger.control.dashboard.PSDBSysPortletPartMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPORTLETPSAPPVIEW)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPORTLETPSAPPVIEW);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}