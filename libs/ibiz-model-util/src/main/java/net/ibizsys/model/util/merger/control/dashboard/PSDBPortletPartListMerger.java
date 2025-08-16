package net.ibizsys.model.util.merger.control.dashboard;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDBPortletPartListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.dashboard.IPSDBPortletPart.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("portletType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPMENU":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl.class, false);
			case "CHART":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBChartPortletPartImpl.class, false);
			case "CONTAINER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBContainerPortletPartImpl.class, false);
			case "CUSTOM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBCustomPortletPartImpl.class, false);
			case "FILTER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBFilterPortletPartImpl.class, false);
			case "HTML":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBHtmlPortletPartImpl.class, false);
			case "LIST":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBListPortletPartImpl.class, false);
			case "RAWITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBRawItemPortletPartImpl.class, false);
			case "REPORT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBReportPortletPartImpl.class, false);
			case "TOOLBAR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBToolbarPortletPartImpl.class, false);
			case "VIEW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.dashboard.PSDBPortletPartImpl.class, false);
		}
	}
}