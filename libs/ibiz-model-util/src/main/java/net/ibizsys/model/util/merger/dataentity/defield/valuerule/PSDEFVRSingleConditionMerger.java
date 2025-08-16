package net.ibizsys.model.util.merger.dataentity.defield.valuerule;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl.*;



public class PSDEFVRSingleConditionMerger extends net.ibizsys.model.util.merger.dataentity.defield.valuerule.PSDEFVRConditionMerger{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}