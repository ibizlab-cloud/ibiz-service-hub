package net.ibizsys.model.util.transpiler.dataentity.der;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.der.PSDERBaseImpl.*;



public class PSDERBaseTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.der.PSDERBaseImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.der.PSDERBaseImpl realPSModelObject = (net.ibizsys.model.dataentity.der.PSDERBaseImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dertag", realPSModelObject.getDERTag(), realPSModelObject, "getDERTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "dertag2", realPSModelObject.getDERTag2(), realPSModelObject, "getDERTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "dertype", realPSModelObject.getDERType(), realPSModelObject, "getDERType");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorpsdeid", realPSModelObject.getMajorPSDataEntity(), realPSModelObject, "getMajorPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorcodename", realPSModelObject.getMinorCodeName(), realPSModelObject, "getMinorCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorlogicname", realPSModelObject.getMinorLogicName(), realPSModelObject, "getMinorLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorpsdeid", realPSModelObject.getMinorPSDataEntity(), realPSModelObject, "getMinorPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorservicecodename", realPSModelObject.getMinorServiceCodeName(), realPSModelObject, "getMinorServiceCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecodename", realPSModelObject.getServiceCodeName(), realPSModelObject, "getServiceCodeName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDERTAG, domain, "dertag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDERTAG2, domain, "dertag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDERTYPE, domain, "dertype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAJORPSDATAENTITY, domain, "majorpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORCODENAME, domain, "minorcodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORLOGICNAME, domain, "minorlogicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORPSDATAENTITY, domain, "minorpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSERVICECODENAME, domain, "minorservicecodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECODENAME, domain, "servicecodename", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}