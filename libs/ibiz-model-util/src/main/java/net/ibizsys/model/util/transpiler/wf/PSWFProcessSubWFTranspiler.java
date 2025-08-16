package net.ibizsys.model.util.transpiler.wf;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.wf.PSWFProcessSubWFImpl.*;



public class PSWFProcessSubWFTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.wf.PSWFProcessSubWFImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.wf.PSWFProcessSubWFImpl realPSModelObject = (net.ibizsys.model.wf.PSWFProcessSubWFImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "embedpsdedsid", realPSModelObject.getPSDEDataSet(), realPSModelObject, "getPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "embedpsdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "embedpswfverid", realPSModelObject.getPSWFVersion(), realPSModelObject, "getPSWFVersion");
		this.setDomainValue(iPSModelTranspileContext, domain, "embedpswfid", realPSModelObject.getPSWorkflow(), realPSModelObject, "getPSWorkflow");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEDATASET, domain, "embedpsdedsid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "embedpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWFVERSION, domain, "embedpswfverid", net.ibizsys.model.wf.IPSWFVersion.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSWORKFLOW, domain, "embedpswfid", net.ibizsys.model.wf.IPSWorkflow.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}