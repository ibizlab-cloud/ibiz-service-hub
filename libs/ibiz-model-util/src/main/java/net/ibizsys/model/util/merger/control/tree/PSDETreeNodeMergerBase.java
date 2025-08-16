package net.ibizsys.model.util.merger.control.tree;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.control.tree.PSDETreeNodeImplBase.*;



public class PSDETreeNodeMergerBase extends net.ibizsys.model.util.merger.control.PSControlItemMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.tree.PSDETreeNodeImplBase.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETNAVPSDER)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSDERBase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETNAVPSDER);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDECONTEXTMENU)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.toolbar.IPSDEContextMenu.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDECONTEXTMENU);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDETREENODECOLUMNS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.tree.IPSDETreeNodeColumn.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDETREENODECOLUMNS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDETREENODEDATAITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.tree.IPSDETreeNodeDataItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDETREENODEDATAITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDETREENODEEDITITEMUPDATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDETREENODEEDITITEMUPDATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDETREENODEEDITITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.tree.IPSDETreeNodeEditItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDETREENODEEDITITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDETREENODERVS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.tree.IPSDETreeNodeRV.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDETREENODERVS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSNAVIGATECONTEXTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSNavigateContext.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSNAVIGATECONTEXTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSNAVIGATEPARAMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSNavigateParam.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSNAVIGATEPARAMS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}