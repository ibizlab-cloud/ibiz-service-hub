package net.ibizsys.model.util.transpiler.database;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.database.PSSysDBTableImpl.*;



public class PSSysDBTableTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.database.PSSysDBTableImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.database.PSSysDBTableImpl realPSModelObject = (net.ibizsys.model.database.PSSysDBTableImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "createsql", realPSModelObject.getCreateSql(), realPSModelObject, "getCreateSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "dropsql", realPSModelObject.getDropSql(), realPSModelObject, "getDropSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "tabletag", realPSModelObject.getTableTag(), realPSModelObject, "getTableTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "tabletag2", realPSModelObject.getTableTag2(), realPSModelObject, "getTableTag2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATESQL, domain, "createsql", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDROPSQL, domain, "dropsql", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTABLETAG, domain, "tabletag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTABLETAG2, domain, "tabletag2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}