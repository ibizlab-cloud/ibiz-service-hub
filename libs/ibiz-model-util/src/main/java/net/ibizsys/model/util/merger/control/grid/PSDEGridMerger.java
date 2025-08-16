package net.ibizsys.model.util.merger.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.control.grid.PSDEGridImpl.*;



public class PSDEGridMerger extends net.ibizsys.model.util.merger.control.PSMDAjaxControlContainerMerger2{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.grid.PSDEGridImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETAGGPSLAYOUTPANEL)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.panel.IPSLayoutPanel.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETAGGPSLAYOUTPANEL);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETCREATEPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETCREATEPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETGETDRAFTFROMPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETGETDRAFTFROMPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETGETDRAFTPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETGETDRAFTPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETGETPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETGETPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMOVEPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMOVEPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEGRIDCOLUMNS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.grid.IPSDEGridColumn.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEGRIDCOLUMNS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEGRIDDATAITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.grid.IPSDEGridDataItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEGRIDDATAITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEGRIDEDITITEMUPDATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEGRIDEDITITEMUPDATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEGRIDEDITITEMVRS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.grid.IPSDEGridEditItemVR.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEGRIDEDITITEMVRS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDEGRIDEDITITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.grid.IPSDEGridEditItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDEGRIDEDITITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETREMOVEPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETREMOVEPSCONTROLACTION);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETUPDATEPSCONTROLACTION)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControlAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETUPDATEPSCONTROLACTION);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}