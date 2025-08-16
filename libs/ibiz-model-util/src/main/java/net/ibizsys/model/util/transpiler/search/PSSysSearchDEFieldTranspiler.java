package net.ibizsys.model.util.transpiler.search;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.search.PSSysSearchDEFieldImpl.*;



public class PSSysSearchDEFieldTranspiler extends net.ibizsys.model.util.transpiler.search.PSSysSearchDEObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.search.PSSysSearchDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.search.PSSysSearchDEFieldImpl realPSModelObject = (net.ibizsys.model.search.PSSysSearchDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvaluetype", realPSModelObject.getDefaultValueType(), realPSModelObject, "getDefaultValueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag", realPSModelObject.getFieldTag(), realPSModelObject, "getFieldTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag2", realPSModelObject.getFieldTag2(), realPSModelObject, "getFieldTag2");
		this.setDomainListValue(iPSModelTranspileContext, domain, "fields", realPSModelObject.getFields(), realPSModelObject, "getFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "psdefid", realPSModelObject.getPSDEField(), realPSModelObject, "getPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssearchfieldid", realPSModelObject.getPSSysSearchField(), realPSModelObject, "getPSSysSearchField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystranslatorid", realPSModelObject.getPSSysTranslator(), realPSModelObject, "getPSSysTranslator");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUETYPE, domain, "defaultvaluetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG, domain, "fieldtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG2, domain, "fieldtag2", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDS, domain, "fields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEFIELD, domain, "psdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSEARCHFIELD, domain, "pssyssearchfieldid", net.ibizsys.model.search.IPSSysSearchField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTRANSLATOR, domain, "pssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}