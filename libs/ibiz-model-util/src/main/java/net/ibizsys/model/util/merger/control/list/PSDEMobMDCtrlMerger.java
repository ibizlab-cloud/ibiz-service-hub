package net.ibizsys.model.util.merger.control.list;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.control.list.PSDEMobMDCtrlImpl.*;



public class PSDEMobMDCtrlMerger extends net.ibizsys.model.util.merger.control.list.PSDEListMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.list.PSDEMobMDCtrlImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP2)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP2);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP3)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP3);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP4)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP4);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP5)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP5);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEUIACTIONGROUP6)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEUIACTIONGROUP6);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}