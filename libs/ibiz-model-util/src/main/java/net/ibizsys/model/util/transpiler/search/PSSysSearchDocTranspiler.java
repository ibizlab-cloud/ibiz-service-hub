package net.ibizsys.model.util.transpiler.search;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.search.PSSysSearchDocImpl.*;



public class PSSysSearchDocTranspiler extends net.ibizsys.model.util.transpiler.search.PSSysSearchSchemeObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.search.PSSysSearchDocImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.search.PSSysSearchDocImpl realPSModelObject = (net.ibizsys.model.search.PSSysSearchDocImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "docparams", realPSModelObject.getDocParams(), realPSModelObject, "getDocParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "doctag", realPSModelObject.getDocTag(), realPSModelObject, "getDocTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "doctag2", realPSModelObject.getDocTag2(), realPSModelObject, "getDocTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "replicas", realPSModelObject.getReplicas(), realPSModelObject, "getReplicas");
		this.setDomainValue(iPSModelTranspileContext, domain, "shards", realPSModelObject.getShards(), realPSModelObject, "getShards");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDOCPARAMS, domain, "docparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDOCTAG, domain, "doctag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDOCTAG2, domain, "doctag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREPLICAS, domain, "replicas", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHARDS, domain, "shards", int.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}