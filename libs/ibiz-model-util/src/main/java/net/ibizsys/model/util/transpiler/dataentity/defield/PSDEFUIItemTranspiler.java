package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl.*;



public abstract class PSDEFUIItemTranspiler extends net.ibizsys.model.util.transpiler.dataentity.defield.PSDEFieldObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "editorparams", realPSModelObject.getEditorParams(), realPSModelObject, "getEditorParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyseditorstyleid", realPSModelObject.getEditorStyle(), realPSModelObject, "getEditorStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "editortype", realPSModelObject.getEditorType(), realPSModelObject, "getEditorType");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValueString(), realPSModelObject, "getMaxValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "minstrlength", realPSModelObject.getMinStringLength(), realPSModelObject, "getMinStringLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValueString(), realPSModelObject, "getMinValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "codelistconfigmode", realPSModelObject.getOutputCodeListConfigMode(), realPSModelObject, "getOutputCodeListConfigMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "phpslanresid", realPSModelObject.getPHPSLanguageRes(), realPSModelObject, "getPHPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "placeholder", realPSModelObject.getPlaceHolder(), realPSModelObject, "getPlaceHolder");
		this.setDomainValue(iPSModelTranspileContext, domain, "precision", realPSModelObject.getPrecision(), realPSModelObject, "getPrecision");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdeacmodeid", realPSModelObject.getRefPSDEACMode(), realPSModelObject, "getRefPSDEACMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdedatasetid", realPSModelObject.getRefPSDEDataSet(), realPSModelObject, "getRefPSDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpsdeid", realPSModelObject.getRefPSDataEntity(), realPSModelObject, "getRefPSDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "strlength", realPSModelObject.getStringLength(), realPSModelObject, "getStringLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "ftmode", realPSModelObject.getUIMode(), realPSModelObject, "getUIMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isAllowEmpty(), realPSModelObject, "isAllowEmpty");
		this.setDomainValue(iPSModelTranspileContext, domain, "ftmode", realPSModelObject.isMobileMode(), realPSModelObject, "isMobileMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "needcodelistconfig", realPSModelObject.isNeedCodeListConfig(), realPSModelObject, "isNeedCodeListConfig");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORPARAMS, domain, "editorparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORSTYLE, domain, "pssyseditorstyleid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEDITORTYPE, domain, "editortype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUESTRING, domain, "maxvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINSTRINGLENGTH, domain, "minstrlength", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUESTRING, domain, "minvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPUTCODELISTCONFIGMODE, domain, "codelistconfigmode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPHPSLANGUAGERES, domain, "phpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPLACEHOLDER, domain, "placeholder", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRECISION, domain, "precision", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEACMODE, domain, "refpsdeacmodeid", net.ibizsys.model.dataentity.ac.IPSDEACMode.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDEDATASET, domain, "refpsdedatasetid", net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSDATAENTITY, domain, "refpsdeid", net.ibizsys.model.dataentity.IPSDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTRINGLENGTH, domain, "strlength", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUIMODE, domain, "ftmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class, new String[]{"%1$s"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEMPTY, domain, "allowempty", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMOBILEMODE, domain, "ftmode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNEEDCODELISTCONFIG, domain, "needcodelistconfig", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}