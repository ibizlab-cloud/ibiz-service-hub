package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSDEFSearchModeImpl.*;



public class PSDEFSearchModeTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSDEFSearchModeImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSDEFSearchModeImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSDEFSearchModeImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "itemtag", realPSModelObject.getItemTag(), realPSModelObject, "getItemTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemtag2", realPSModelObject.getItemTag2(), realPSModelObject, "getItemTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "searchmode", realPSModelObject.getMode(), realPSModelObject, "getMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystranslatorid", realPSModelObject.getPSSysTranslator(), realPSModelObject, "getPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdbvalueopid", realPSModelObject.getValueOP(), realPSModelObject, "getValueOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueseperator", realPSModelObject.getValueSeparator(), realPSModelObject, "getValueSeparator");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultflag", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG, domain, "itemtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTAG2, domain, "itemtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMODE, domain, "searchmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTRANSLATOR, domain, "pssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEOP, domain, "psdbvalueopid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUESEPARATOR, domain, "valueseperator", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}