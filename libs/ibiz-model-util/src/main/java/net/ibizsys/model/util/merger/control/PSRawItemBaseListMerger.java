package net.ibizsys.model.util.merger.control;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSRawItemBaseListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.IPSRawItemBase.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.IPSRawItemBase.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.IPSRawItemBase.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.IPSRawItemBase.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("contentType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "HTML":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSHtmlItemImpl.class, false);
			case "IMAGE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSImageItemImpl.class, false);
			case "MARKDOWN":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSMarkdownItemImpl.class, false);
			case "PLACEHOLDER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSPlaceholderItemImpl.class, false);
			case "RAW":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSTextItemImpl.class, false);
			case "VIDEO":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.rawitem.PSVideoItemImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.PSRawItemImpl.class, false);
		}
	}
}