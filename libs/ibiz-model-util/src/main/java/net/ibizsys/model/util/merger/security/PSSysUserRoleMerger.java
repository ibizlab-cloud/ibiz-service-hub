package net.ibizsys.model.util.merger.security;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.security.PSSysUserRoleImpl.*;



public class PSSysUserRoleMerger extends net.ibizsys.model.util.merger.PSModelMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.security.PSSysUserRoleImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSSYSUSERROLEDATAS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUserRoleData.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSSYSUSERROLEDATAS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETPSSYSUSERROLERESES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUserRoleRes.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETPSSYSUSERROLERESES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETUNIRESTAGS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(java.lang.String.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETUNIRESTAGS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}