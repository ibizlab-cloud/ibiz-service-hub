package net.ibizsys.model.util.merger.testing;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSSysTestCaseListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.testing.IPSSysTestCase.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.testing.IPSSysTestCase.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.testing.IPSSysTestCase.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.testing.IPSSysTestCase.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("testCaseType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "APPVIEW":
			case "CUSTOM":
			case "DESADETAIL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.testing.PSSysTestCase2Impl.class, false);
			case "DEACTION":
			case "DEFVR":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.testing.PSSysTestCaseImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.testing.PSSysTestCaseImpl.class, false);
		}
	}
}