package net.ibizsys.model.util.merger.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.app.view.PSAppViewImpl.*;



public class PSAppViewMerger extends net.ibizsys.model.util.merger.app.PSApplicationObjectMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.view.PSAppViewImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPCOUNTERREFS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.control.IPSAppCounterRef.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPCOUNTERREFS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWENGINES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewEngine.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWENGINES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWNAVCONTEXTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewNavContext.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWNAVCONTEXTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWNAVPARAMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewNavParam.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWNAVPARAMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWPARAMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewParam.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWPARAMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWREFS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewRef.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWREFS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSAPPVIEWUIACTIONS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppViewUIAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSAPPVIEWUIACTIONS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSCONTROLS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.IPSControl.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSCONTROLS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSVIEWLAYOUTPANEL)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.panel.IPSViewLayoutPanel.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSVIEWLAYOUTPANEL);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}