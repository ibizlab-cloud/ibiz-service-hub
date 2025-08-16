package net.ibizsys.model.util.merger.wf;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.IPSModelMerger;
import net.ibizsys.model.util.merger.PSModelMergerFactory;

public class PSWFProcessListMerger extends net.ibizsys.model.util.merger.PSModelListMergerBase{

	@Override
	protected String getTagField(IPSModelMergeContext iPSModelMergeContext) {
		return iPSModelMergeContext.getPSModelTagField(net.ibizsys.model.wf.IPSWFProcess.class);
	}


	@Override
	protected boolean isAppendChildOnly(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isAppendChildOnly(net.ibizsys.model.wf.IPSWFProcess.class);
		return (ret != null)?ret:super.isAppendChildOnly(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.wf.IPSWFProcess.class);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext);
	}


	@Override
	protected boolean isEnableMergeSingle(IPSModelMergeContext iPSModelMergeContext) {
		Boolean ret = iPSModelMergeContext.isEnableMergeSingle(net.ibizsys.model.wf.IPSWFProcess.class);
		return (ret != null)?ret:super.isEnableMergeSingle(iPSModelMergeContext);
	}

	@Override
	protected IPSModelMerger getPSModelMerger(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode) throws Exception {
		JsonNode typeJsonNode = objectNode.get("wFProcessType");
		String strTypeValue = (typeJsonNode == null)?"":typeJsonNode.asText("");
		switch(strTypeValue){
			case "CALLORGACTIVITY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFCallOrgActivityProcessImpl.class, false);
			case "EMBED":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFEmbedWFProcessImpl.class, false);
			case "END":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.EndPSWFProcessImpl.class, false);
			case "EXCLUSIVEGATEWAY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFExclusiveGatewayProcessImpl.class, false);
			case "INCLUSIVEGATEWAY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFInclusiveGatewayProcessImpl.class, false);
			case "INTERACTIVE":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFInteractiveProcessImpl.class, false);
			case "PARALLEL":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFParallelSubWFProcessImpl.class, false);
			case "PARALLELGATEWAY":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFParallelGatewayProcessImpl.class, false);
			case "PROCESS":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFDEActionProcessImpl.class, false);
			case "START":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.StartPSWFProcessImpl.class, false);
			case "TIMEREVENT":
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFTimerEventProcessImpl.class, false);
			default:
				return iPSModelMergeContext.getPSModelMerger(net.ibizsys.model.wf.PSWFProcessImpl.class, false);
		}
	}
}