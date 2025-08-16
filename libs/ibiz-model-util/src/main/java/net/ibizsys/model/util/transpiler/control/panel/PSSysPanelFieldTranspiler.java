package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelFieldImpl.*;



public class PSSysPanelFieldTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSSysPanelItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelFieldImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldstates", realPSModelObject.getFieldStates(), realPSModelObject, "getFieldStates");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainListValue(iPSModelTranspileContext, domain, "resetitemname", realPSModelObject.getResetItemNames(), realPSModelObject, "getResetItemNames", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueitemname", realPSModelObject.getValueItemName(), realPSModelObject, "getValueItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldname", realPSModelObject.getViewFieldName(), realPSModelObject, "getViewFieldName");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDSTATES, domain, "fieldstates", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETRESETITEMNAMES, domain, "resetitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEITEMNAME, domain, "valueitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWFIELDNAME, domain, "fieldname", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}