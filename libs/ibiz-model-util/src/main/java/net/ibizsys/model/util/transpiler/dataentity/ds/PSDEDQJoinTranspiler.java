package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDQJoinImpl.*;



public class PSDEDQJoinTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDQJoinImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDQJoinImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDQJoinImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aliasname", realPSModelObject.getAlias(), realPSModelObject, "getAlias");
		this.setDomainValue(iPSModelTranspileContext, domain, "joinpsdeid", realPSModelObject.getJoinPSDataEntity(), realPSModelObject, "getJoinPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "jointag", realPSModelObject.getJoinTag(), realPSModelObject, "getJoinTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "jointag2", realPSModelObject.getJoinTag2(), realPSModelObject, "getJoinTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdejointypeid", realPSModelObject.getJoinType(), realPSModelObject, "getJoinType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALIAS, domain, "aliasname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJOINPSDATAENTITY, domain, "joinpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJOINTAG, domain, "jointag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJOINTAG2, domain, "jointag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJOINTYPE, domain, "psdejointypeid", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}