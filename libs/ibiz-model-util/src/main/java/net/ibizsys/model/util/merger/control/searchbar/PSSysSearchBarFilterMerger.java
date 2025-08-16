package net.ibizsys.model.util.merger.control.searchbar;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl.*;



public class PSSysSearchBarFilterMerger extends net.ibizsys.model.util.merger.control.searchbar.PSSysSearchBarItemMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.searchbar.PSSysSearchBarFilterImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEFSEARCHMODE)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEFSEARCHMODE);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSEDITOR)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSEditor.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSEDITOR);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETRESETITEMNAMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(java.lang.String.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETRESETITEMNAMES);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}