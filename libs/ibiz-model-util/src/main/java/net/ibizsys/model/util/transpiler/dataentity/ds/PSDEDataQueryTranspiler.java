package net.ibizsys.model.util.transpiler.dataentity.ds;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.ds.PSDEDataQueryImpl.*;



public class PSDEDataQueryTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.ds.PSDEDataQueryImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.ds.PSDEDataQueryImpl realPSModelObject = (net.ibizsys.model.dataentity.ds.PSDEDataQueryImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dqtag", realPSModelObject.getDataQueryTag(), realPSModelObject, "getDataQueryTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "dqtag2", realPSModelObject.getDataQueryTag2(), realPSModelObject, "getDataQueryTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dqtag3", realPSModelObject.getDataQueryTag3(), realPSModelObject, "getDataQueryTag3");
		this.setDomainValue(iPSModelTranspileContext, domain, "dqtag4", realPSModelObject.getDataQueryTag4(), realPSModelObject, "getDataQueryTag4");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefgroupid", realPSModelObject.getPSDEFGroup(), realPSModelObject, "getPSDEFGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewcollevel", realPSModelObject.getViewLevel(), realPSModelObject, "getViewLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "custommode", realPSModelObject.isCustomCode(), realPSModelObject, "isCustomCode");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultmode", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepql", realPSModelObject.isEnablePQL(), realPSModelObject, "isEnablePQL");
		this.setDomainValue(iPSModelTranspileContext, domain, "queryviewflag", realPSModelObject.isQueryFromView(), realPSModelObject, "isQueryFromView");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAQUERYTAG, domain, "dqtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAQUERYTAG2, domain, "dqtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAQUERYTAG3, domain, "dqtag3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAQUERYTAG4, domain, "dqtag4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFGROUP, domain, "psdefgroupid", net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWLEVEL, domain, "viewcollevel", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCUSTOMCODE, domain, "custommode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "defaultmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPQL, domain, "enablepql", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISQUERYFROMVIEW, domain, "queryviewflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}