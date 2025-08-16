package net.ibizsys.model.util.merger.control.menu;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSAppMenuItemListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.menu.IPSAppMenuItem.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.menu.IPSAppMenuItem.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.menu.IPSAppMenuItem.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.menu.IPSAppMenuItem.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("itemType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPMENUREF":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuAMRefImpl.class, false);
			case "MENUITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuItemImpl.class, false);
			case "RAWITEM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuRawItemImpl.class, false);
			case "SEPERATOR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuSeperatorImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.menu.PSAppMenuItemImpl.class, false);
		}
	}
}