package net.ibizsys.model.util.merger.control.layout;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSLayoutListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.control.layout.IPSLayout.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.control.layout.IPSLayout.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.control.layout.IPSLayout.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.control.layout.IPSLayout.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("layout");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "ABSOLUTE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.layout.PSAbsoluteLayoutImpl.class, false);
			case "BORDER":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.layout.PSBorderLayoutImpl.class, false);
			case "FLEX":
			case "SIMPLEFLEX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.layout.PSFlexLayoutImpl.class, false);
			case "TABLE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.layout.PSTableLayoutImpl.class, false);
			case "TABLE_12COL":
			case "TABLE_24COL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.control.layout.PSGrid12LayoutImpl.class, false);
			default:
				throw new Exception("未提供默认模型合并器");
		}
	}
}