package net.ibizsys.model.util.merger.app.view;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSAppViewListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.app.view.IPSAppView.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.app.view.IPSAppView.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.app.view.IPSAppView.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.app.view.IPSAppView.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("viewType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPDATAUPLOADVIEW":
			case "APPERRORVIEW":
			case "APPFILEUPLOADVIEW":
			case "APPFUNCPICKUPVIEW":
			case "APPLOGINVIEW":
			case "APPLOGOUTVIEW":
			case "APPPICUPLOADVIEW":
			case "APPREDIRECTVIEW":
			case "APPSTARTVIEW":
			case "APPUTILVIEW":
			case "APPWELCOMEVIEW":
			case "APPWFADDSTEPBEFOREVIEW":
			case "APPWFREDIRECTVIEW":
			case "APPWFSENDBACKVIEW":
			case "APPWFSTEPACTORVIEW":
			case "APPWFSTEPDATAVIEW":
			case "APPWFSTEPTRACEVIEW":
			case "APPWFSUPPLYINFOVIEW":
			case "APPWFTAKEADVICEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppUtilViewImpl.class, false);
			case "APPDEVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
			case "APPINDEXVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppIndexViewImpl.class, false);
			case "APPPANELVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppPanelViewImpl.class, false);
			case "APPPORTALVIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppPortalViewImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.app.view.PSAppDEViewImpl.class, false);
		}
	}
}