package net.ibizsys.model.util.merger.app.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.app.res.PSAppSubViewTypeRefImpl.*;



public class PSAppSubViewTypeRefMerger extends net.ibizsys.model.util.merger.app.PSApplicationObjectMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.res.PSAppSubViewTypeRefImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSVIEWLAYOUTPANEL)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.panel.IPSViewLayoutPanel.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSVIEWLAYOUTPANEL);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}