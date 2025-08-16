package net.ibizsys.model.util.transpiler.dataentity.defield;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.defield.PSDEFieldImpl.*;



public class PSDEFieldTranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.defield.PSDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.defield.PSDEFieldImpl realPSModelObject = (net.ibizsys.model.dataentity.defield.PSDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "auditinfoformat", realPSModelObject.getAuditInfoFormat(), realPSModelObject, "getAuditInfoFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "biztag", realPSModelObject.getBizTag(), realPSModelObject, "getBizTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "computeexp", realPSModelObject.getComputeExpression(), realPSModelObject, "getComputeExpression");
		this.setDomainValue(iPSModelTranspileContext, domain, "dbvaluemode", realPSModelObject.getDBValueInsertMode(), realPSModelObject, "getDBValueInsertMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "dbvaluemode2", realPSModelObject.getDBValueUpdateMode(), realPSModelObject, "getDBValueUpdateMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "deftype", realPSModelObject.getDEFType(), realPSModelObject, "getDEFType");
		this.setDomainValue(iPSModelTranspileContext, domain, "statefield", realPSModelObject.getDEMSFieldMode(), realPSModelObject, "getDEMSFieldMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdatatypeid", realPSModelObject.getDataType(), realPSModelObject, "getDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "dvt", realPSModelObject.getDefaultValueType(), realPSModelObject, "getDefaultValueType");
		this.setDomainValue(iPSModelTranspileContext, domain, "dupcheckmode", realPSModelObject.getDupCheckMode(), realPSModelObject, "getDupCheckMode");
		this.setDomainListValue(iPSModelTranspileContext, domain, "dupchkpsdefid", realPSModelObject.getDupCheckPSDEFields(), realPSModelObject, "getDupCheckPSDEFields", net.ibizsys.model.dataentity.defield.IPSDEField.class);
		this.setDomainListValue(iPSModelTranspileContext, domain, "dupcheckvalues", realPSModelObject.getDupCheckValues(), realPSModelObject, "getDupCheckValues", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag", realPSModelObject.getFieldTag(), realPSModelObject, "getFieldTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag2", realPSModelObject.getFieldTag2(), realPSModelObject, "getFieldTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "importorder", realPSModelObject.getImportOrder(), realPSModelObject, "getImportOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "importtag", realPSModelObject.getImportTag(), realPSModelObject, "getImportTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "jsonformat", realPSModelObject.getJsonFormat(), realPSModelObject, "getJsonFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "length", realPSModelObject.getLength(), realPSModelObject, "getLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxvalue", realPSModelObject.getMaxValueString(), realPSModelObject, "getMaxValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "minstrlength", realPSModelObject.getMinStringLength(), realPSModelObject, "getMinStringLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "minvalue", realPSModelObject.getMinValueString(), realPSModelObject, "getMinValueString");
		this.setDomainValue(iPSModelTranspileContext, domain, "nullvalorder", realPSModelObject.getNullValueOrderMode(), realPSModelObject, "getNullValueOrderMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervalue", realPSModelObject.getOrderValue(), realPSModelObject, "getOrderValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "pscodelistid", realPSModelObject.getPSCodeList(), realPSModelObject, "getPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyssequenceid", realPSModelObject.getPSSysSequence(), realPSModelObject, "getPSSysSequence");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystranslatorid", realPSModelObject.getPSSysTranslator(), realPSModelObject, "getPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "precision", realPSModelObject.getPrecision(), realPSModelObject, "getPrecision");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtypeparam", realPSModelObject.getPredefinedTypeParam(), realPSModelObject, "getPredefinedTypeParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "querycs", realPSModelObject.getQueryOption(), realPSModelObject, "getQueryOption");
		this.setDomainValue(iPSModelTranspileContext, domain, "sequencemode", realPSModelObject.getSequenceMode(), realPSModelObject, "getSequenceMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "servicecodename", realPSModelObject.getServiceCodeName(), realPSModelObject, "getServiceCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "stringcase", realPSModelObject.getStringCase(), realPSModelObject, "getStringCase");
		this.setDomainValue(iPSModelTranspileContext, domain, "strlength", realPSModelObject.getStringLength(), realPSModelObject, "getStringLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "translatormode", realPSModelObject.getTranslatorMode(), realPSModelObject, "getTranslatorMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "unionkeyvalue", realPSModelObject.getUnionKeyValue(), realPSModelObject, "getUnionKeyValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "valuepsdefid", realPSModelObject.getValuePSDEField(), realPSModelObject, "getValuePSDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewcollevel", realPSModelObject.getViewLevel(), realPSModelObject, "getViewLevel");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isAllowEmpty(), realPSModelObject, "isAllowEmpty");
		this.setDomainValue(iPSModelTranspileContext, domain, "checkrecursion", realPSModelObject.isCheckRecursion(), realPSModelObject, "isCheckRecursion");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableaudit", realPSModelObject.isEnableAudit(), realPSModelObject, "isEnableAudit");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablecolpriv", realPSModelObject.isEnablePrivilege(), realPSModelObject, "isEnablePrivilege");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableqs", realPSModelObject.isEnableQuickSearch(), realPSModelObject, "isEnableQuickSearch");
		this.setDomainValue(iPSModelTranspileContext, domain, "indextype", realPSModelObject.isIndexTypeDEField(), realPSModelObject, "isIndexTypeDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkey", realPSModelObject.isKeyDEField(), realPSModelObject, "isKeyDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorfield", realPSModelObject.isKeyNameDEField(), realPSModelObject, "isKeyNameDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorfield", realPSModelObject.isMajorDEField(), realPSModelObject, "isMajorDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "multiformfield", realPSModelObject.isMultiFormDEField(), realPSModelObject, "isMultiFormDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pastereset", realPSModelObject.isPasteReset(), realPSModelObject, "isPasteReset");
		this.setDomainValue(iPSModelTranspileContext, domain, "querycolumn", realPSModelObject.isQueryColumn(), realPSModelObject, "isQueryColumn");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkey", realPSModelObject.isUniTagField(), realPSModelObject, "isUniTagField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAUDITINFOFORMAT, domain, "auditinfoformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBIZTAG, domain, "biztag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOMPUTEEXPRESSION, domain, "computeexp", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDBVALUEINSERTMODE, domain, "dbvaluemode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDBVALUEUPDATEMODE, domain, "dbvaluemode2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFTYPE, domain, "deftype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEMSFIELDMODE, domain, "statefield", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATATYPE, domain, "psdatatypeid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUETYPE, domain, "dvt", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDUPCHECKMODE, domain, "dupcheckmode", java.lang.String.class, new String[]{"NONE"});
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETDUPCHECKPSDEFIELDS, domain, "dupchkpsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETDUPCHECKVALUES, domain, "dupcheckvalues", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG, domain, "fieldtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG2, domain, "fieldtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPORTORDER, domain, "importorder", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIMPORTTAG, domain, "importtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETJSONFORMAT, domain, "jsonformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLENGTH, domain, "length", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXVALUESTRING, domain, "maxvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINSTRINGLENGTH, domain, "minstrlength", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINVALUESTRING, domain, "minvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNULLVALUEORDERMODE, domain, "nullvalorder", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUE, domain, "ordervalue", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSCODELIST, domain, "pscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSEQUENCE, domain, "pssyssequenceid", net.ibizsys.model.res.IPSSysSequence.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTRANSLATOR, domain, "pssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRECISION, domain, "precision", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPEPARAM, domain, "predefinedtypeparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETQUERYOPTION, domain, "querycs", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEQUENCEMODE, domain, "sequencemode", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICECODENAME, domain, "servicecodename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTRINGCASE, domain, "stringcase", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTRINGLENGTH, domain, "strlength", int.class, new String[]{"0","-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTRANSLATORMODE, domain, "translatormode", java.lang.String.class, new String[]{"NONE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETUNIONKEYVALUE, domain, "unionkeyvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEPSDEFIELD, domain, "valuepsdefid", net.ibizsys.model.dataentity.defield.IPSDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVIEWLEVEL, domain, "viewcollevel", int.class, new String[]{"1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEMPTY, domain, "allowempty", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISCHECKRECURSION, domain, "checkrecursion", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEAUDIT, domain, "enableaudit", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPRIVILEGE, domain, "enablecolpriv", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEQUICKSEARCH, domain, "enableqs", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINDEXTYPEDEFIELD, domain, "indextype", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISKEYDEFIELD, domain, "pkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISKEYNAMEDEFIELD, domain, "majorfield", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMAJORDEFIELD, domain, "majorfield", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMULTIFORMDEFIELD, domain, "multiformfield", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISPASTERESET, domain, "pastereset", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISQUERYCOLUMN, domain, "querycolumn", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUNITAGFIELD, domain, "pkey", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}