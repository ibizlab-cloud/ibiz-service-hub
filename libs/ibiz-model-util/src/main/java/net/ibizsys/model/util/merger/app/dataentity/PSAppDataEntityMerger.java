package net.ibizsys.model.util.merger.app.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.app.dataentity.PSAppDataEntityImpl.*;



public class PSAppDataEntityMerger extends net.ibizsys.model.util.merger.app.PSApplicationObjectMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.dataentity.PSAppDataEntityImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEACMODES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEACMode.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEACMODES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEACTIONS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEACTIONS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEDATAEXPORTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEDataExport.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEDATAEXPORTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEDATAIMPORTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEDataImport.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEDATAIMPORTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEDATASETS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEDATASETS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEFIELDS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDELOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDELogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDELOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEMAPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEMap.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEMAPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEMETHODDTOS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEMETHODDTOS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEMETHODS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEMETHODS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEPRINTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEPrint.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEPRINTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEUIACTIONGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEUIACTIONGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEUIACTIONS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEUIACTIONS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPDEUILOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPDEUILOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPPORTLETCATS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.control.IPSAppPortletCat.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPPORTLETCATS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPVIEWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.view.IPSAppView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPVIEWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEMAINSTATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEMAINSTATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEOPPRIVS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEOPPRIVS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMAINSTATEPSAPPDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMAINSTATEPSAPPDEFIELDS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMINORPSAPPDERSS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDERS.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMINORPSAPPDERSS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSDER1N)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSDER1N.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSDER1N);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETQUICKSEARCHPSAPPDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETQUICKSEARCHPSAPPDEFIELDS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETREQUESTPATHS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(java.lang.String.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETREQUESTPATHS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETUNIONKEYVALUEPSAPPDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.dataentity.IPSAppDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETUNIONKEYVALUEPSAPPDEFIELDS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}