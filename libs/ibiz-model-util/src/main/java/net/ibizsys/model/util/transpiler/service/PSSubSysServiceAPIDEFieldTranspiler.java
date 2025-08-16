package net.ibizsys.model.util.transpiler.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.service.PSSubSysServiceAPIDEFieldImpl.*;



public class PSSubSysServiceAPIDEFieldTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.service.PSSubSysServiceAPIDEFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.service.PSSubSysServiceAPIDEFieldImpl realPSModelObject = (net.ibizsys.model.service.PSSubSysServiceAPIDEFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename2", realPSModelObject.getCodeName2(), realPSModelObject, "getCodeName2");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdatatypeid", realPSModelObject.getDataType(), realPSModelObject, "getDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag", realPSModelObject.getFieldTag(), realPSModelObject, "getFieldTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag2", realPSModelObject.getFieldTag2(), realPSModelObject, "getFieldTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtype", realPSModelObject.getFieldType(), realPSModelObject, "getFieldType");
		this.setDomainValue(iPSModelTranspileContext, domain, "length", realPSModelObject.getLength(), realPSModelObject, "getLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "precision", realPSModelObject.getPrecision(), realPSModelObject, "getPrecision");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "refpssubsyssadeid", realPSModelObject.getRefPSSubSysServiceAPIDE(), realPSModelObject, "getRefPSSubSysServiceAPIDE");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isAllowEmpty(), realPSModelObject, "isAllowEmpty");
		this.setDomainValue(iPSModelTranspileContext, domain, "arrayflag", realPSModelObject.isArray(), realPSModelObject, "isArray");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkey", realPSModelObject.isKeyDEField(), realPSModelObject, "isKeyDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "majorfield", realPSModelObject.isMajorDEField(), realPSModelObject, "isMajorDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME2, domain, "codename2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATATYPE, domain, "psdatatypeid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG, domain, "fieldtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG2, domain, "fieldtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTYPE, domain, "fieldtype", java.lang.String.class, new String[]{"SIMPLE"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLENGTH, domain, "length", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRECISION, domain, "precision", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREFPSSUBSYSSERVICEAPIDE, domain, "refpssubsyssadeid", net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISALLOWEMPTY, domain, "allowempty", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISARRAY, domain, "arrayflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISKEYDEFIELD, domain, "pkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMAJORDEFIELD, domain, "majorfield", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}