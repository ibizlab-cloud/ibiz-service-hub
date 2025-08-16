package net.ibizsys.model.util.transpiler.dataentity.dataflow;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl.*;



public class PSDEDFMergeProcessNodeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.dataflow.PSDEDataFlowProcessNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.dataflow.PSDEDFMergeProcessNodeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getMergeField(), realPSModelObject, "getMergeField");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getMergeType(), realPSModelObject, "getMergeType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isCopyIfNotExists(), realPSModelObject, "isCopyIfNotExists");
		this.setDomainValue(iPSModelTranspileContext, domain, "param10", realPSModelObject.isMergeIntoField(), realPSModelObject, "isMergeIntoField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMERGEFIELD, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMERGETYPE, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCOPYIFNOTEXISTS, domain, "param9", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMERGEINTOFIELD, domain, "param10", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}