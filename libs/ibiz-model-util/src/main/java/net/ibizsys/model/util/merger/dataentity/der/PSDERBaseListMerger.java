package net.ibizsys.model.util.merger.dataentity.der;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSDERBaseListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.dataentity.der.IPSDERBase.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.dataentity.der.IPSDERBase.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.der.IPSDERBase.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.dataentity.der.IPSDERBase.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("dERType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "DER11":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDER11Impl.class, false);
			case "DER1N":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDER1NImpl.class, false);
			case "DERAGGDATA":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERAggDataImpl.class, false);
			case "DERCUSTOM":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERCustomImpl.class, false);
			case "DERINDEX":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERIndexImpl.class, false);
			case "DERINHERIT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERInheritImpl.class, false);
			case "DERMULINH":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERMultiInheritImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.dataentity.der.PSDERBaseImpl.class, false);
		}
	}
}