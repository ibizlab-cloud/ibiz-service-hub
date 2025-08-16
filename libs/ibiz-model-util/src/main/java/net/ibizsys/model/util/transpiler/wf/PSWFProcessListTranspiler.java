package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.model.util.transpiler.IPSModelTranspiler;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSWFProcessListTranspiler extends net.ibizsys.model.util.transpiler.PSModelListTranspilerBase{

	@Override
	protected net.ibizsys.psmodel.core.domain.PSWFProcess createDomain(IPSModelObject iPSModelObject) throws Exception{
		return new net.ibizsys.psmodel.core.domain.PSWFProcess();
	}

	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, Object type) throws Exception {
		String strTypeValue = (type == null)?"":type.toString();
		switch(strTypeValue){
			case "CALLORGACTIVITY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFCallOrgActivityProcessImpl.class, false);
			case "EMBED":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFEmbedWFProcessImpl.class, false);
			case "END":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.EndPSWFProcessImpl.class, false);
			case "EXCLUSIVEGATEWAY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFExclusiveGatewayProcessImpl.class, false);
			case "INCLUSIVEGATEWAY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFInclusiveGatewayProcessImpl.class, false);
			case "INTERACTIVE":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFInteractiveProcessImpl.class, false);
			case "PARALLEL":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFParallelSubWFProcessImpl.class, false);
			case "PARALLELGATEWAY":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFParallelGatewayProcessImpl.class, false);
			case "PROCESS":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFDEActionProcessImpl.class, false);
			case "START":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.StartPSWFProcessImpl.class, false);
			case "TIMEREVENT":
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFTimerEventProcessImpl.class, false);
			default:
				return iPSModelTranspileContext.getPSModelTranspiler(net.ibizsys.model.wf.PSWFProcessImpl.class, false);
		}
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		net.ibizsys.model.wf.IPSWFProcess iPSWFProcess = (net.ibizsys.model.wf.IPSWFProcess)iPSModelObject;
		Object type = iPSWFProcess.getWFProcessType();
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
	
	@Override
	protected IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception {
		Object type = domain.get("wfprocesstype");
		return getPSModelTranspiler(iPSModelTranspileContext, type);
	}
}