package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl.*;



public class PSDEMSLogicNodeTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEMSLogicNodeImpl)iPSModelObject;
		this.setDomainListValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getActions(), realPSModelObject, "getActions", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "param13", realPSModelObject.getBKColor(), realPSModelObject, "getBKColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "param12", realPSModelObject.getColor(), realPSModelObject, "getColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "param11", realPSModelObject.getCssClass(), realPSModelObject, "getCssClass");
		this.setDomainListValue(iPSModelTranspileContext, domain, "param6", realPSModelObject.getFields(), realPSModelObject, "getFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "leftpos", realPSModelObject.getLeftPos(), realPSModelObject, "getLeftPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicnodetype", realPSModelObject.getLogicNodeType(), realPSModelObject, "getLogicNodeType");
		this.setDomainListValue(iPSModelTranspileContext, domain, "param5", realPSModelObject.getOPPrivs(), realPSModelObject, "getOPPrivs", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getStateValue(), realPSModelObject, "getStateValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "toppos", realPSModelObject.getTopPos(), realPSModelObject, "getTopPos");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.isActionAllowMode(), realPSModelObject, "isActionAllowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isDefaultMode(), realPSModelObject, "isDefaultMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param10", realPSModelObject.isFieldAllowMode(), realPSModelObject, "isFieldAllowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param8", realPSModelObject.isOPPrivAllowMode(), realPSModelObject, "isOPPrivAllowMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETACTIONS, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLOR, domain, "param13", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLOR, domain, "param12", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSCLASS, domain, "param11", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDS, domain, "param6", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLEFTPOS, domain, "leftpos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNODETYPE, domain, "logicnodetype", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETOPPRIVS, domain, "param5", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class, new String[]{"99999"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATEVALUE, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTOPPOS, domain, "toppos", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISACTIONALLOWMODE, domain, "param7", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULTMODE, domain, "param9", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFIELDALLOWMODE, domain, "param10", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISOPPRIVALLOWMODE, domain, "param8", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}