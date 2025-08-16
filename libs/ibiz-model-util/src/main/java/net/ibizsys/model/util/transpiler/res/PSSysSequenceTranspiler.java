package net.ibizsys.model.util.transpiler.res;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.res.PSSysSequenceImpl.*;



public class PSSysSequenceTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.res.PSSysSequenceImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.res.PSSysSequenceImpl realPSModelObject = (net.ibizsys.model.res.PSSysSequenceImpl)iPSModelObject;
		this.setDomainListValue(iPSModelTranspileContext, domain, "extformatparams", realPSModelObject.getExtFormatParams(), realPSModelObject, "getExtFormatParams", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "keypsdefid", realPSModelObject.getKeyPSDEField(), realPSModelObject, "getKeyPSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValue(), realPSModelObject, "getMaxValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValue(), realPSModelObject, "getMinValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeid", realPSModelObject.getPSDataEntity(), realPSModelObject, "getPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssfpluginid", realPSModelObject.getPSSysSFPlugin(), realPSModelObject, "getPSSysSFPlugin");
		this.setDomainValue(iPSModelTranspileContext, domain, "psmoduleid", realPSModelObject.getPSSystemModule(), realPSModelObject, "getPSSystemModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequenceformat", realPSModelObject.getSequenceFormat(), realPSModelObject, "getSequenceFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequenceparams", realPSModelObject.getSequenceParams(), realPSModelObject, "getSequenceParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequencetag", realPSModelObject.getSequenceTag(), realPSModelObject, "getSequenceTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequencetag2", realPSModelObject.getSequenceTag2(), realPSModelObject, "getSequenceTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequencetype", realPSModelObject.getSequenceType(), realPSModelObject, "getSequenceType");
		this.setDomainValue(iPSModelTranspileContext, domain, "timeformat", realPSModelObject.getTimeFormat(), realPSModelObject, "getTimeFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "timepsdefid", realPSModelObject.getTimePSDEField(), realPSModelObject, "getTimePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "typepsdefid", realPSModelObject.getTypePSDEField(), realPSModelObject, "getTypePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSDEField(), realPSModelObject, "getValuePSDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETEXTFORMATPARAMS, domain, "extformatparams", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETKEYPSDEFIELD, domain, "keypsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUE, domain, "maxvalue", java.math.BigInteger.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUE, domain, "minvalue", java.math.BigInteger.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDATAENTITY, domain, "psdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSFPLUGIN, domain, "pssyssfpluginid", net.ibizsys.model.res.IPSSysSFPlugin.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTEMMODULE, domain, "psmoduleid", net.ibizsys.model.system.IPSSystemModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCEFORMAT, domain, "sequenceformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCEPARAMS, domain, "sequenceparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCETAG, domain, "sequencetag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCETAG2, domain, "sequencetag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCETYPE, domain, "sequencetype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEFORMAT, domain, "timeformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEPSDEFIELD, domain, "timepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTYPEPSDEFIELD, domain, "typepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSDEFIELD, domain, "valuepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}