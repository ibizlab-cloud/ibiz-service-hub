package net.ibizsys.model.util.transpiler.search;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.search.PSSysSearchFieldImpl.*;



public class PSSysSearchFieldTranspiler extends net.ibizsys.model.util.transpiler.search.PSSysSearchDocObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.search.PSSysSearchFieldImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.search.PSSysSearchFieldImpl realPSModelObject = (net.ibizsys.model.search.PSSysSearchFieldImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "analyzer", realPSModelObject.getAnalyzer(), realPSModelObject, "getAnalyzer");
		this.setDomainValue(iPSModelTranspileContext, domain, "codename", realPSModelObject.getCodeName(), realPSModelObject, "getCodeName");
		this.setDomainValue(iPSModelTranspileContext, domain, "dateformat", realPSModelObject.getDateFormat(), realPSModelObject, "getDateFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldparams", realPSModelObject.getFieldParams(), realPSModelObject, "getFieldParams");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag", realPSModelObject.getFieldTag(), realPSModelObject, "getFieldTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtag2", realPSModelObject.getFieldTag2(), realPSModelObject, "getFieldTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "fieldtype", realPSModelObject.getFieldType(), realPSModelObject, "getFieldType");
		this.setDomainListValue(iPSModelTranspileContext, domain, "ignorefields", realPSModelObject.getIgnoreFields(), realPSModelObject, "getIgnoreFields", java.lang.String.class);
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "pattern", realPSModelObject.getPattern(), realPSModelObject, "getPattern");
		this.setDomainValue(iPSModelTranspileContext, domain, "searchanalyzer", realPSModelObject.getSearchAnalyzer(), realPSModelObject, "getSearchAnalyzer");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "fielddataflag", realPSModelObject.isFieldData(), realPSModelObject, "isFieldData");
		this.setDomainValue(iPSModelTranspileContext, domain, "incinparentflag", realPSModelObject.isIncludeInParent(), realPSModelObject, "isIncludeInParent");
		this.setDomainValue(iPSModelTranspileContext, domain, "indexflag", realPSModelObject.isIndex(), realPSModelObject, "isIndex");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkey", realPSModelObject.isPKey(), realPSModelObject, "isPKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "storeflag", realPSModelObject.isStore(), realPSModelObject, "isStore");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETANALYZER, domain, "analyzer", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME, domain, "codename", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATEFORMAT, domain, "dateformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDPARAMS, domain, "fieldparams", com.fasterxml.jackson.databind.node.ObjectNode.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG, domain, "fieldtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTAG2, domain, "fieldtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFIELDTYPE, domain, "fieldtype", java.lang.String.class);
		this.setModelListValue(iPSModelTranspileContext, objectNode, ATTR_GETIGNOREFIELDS, domain, "ignorefields", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPATTERN, domain, "pattern", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSEARCHANALYZER, domain, "searchanalyzer", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFIELDDATA, domain, "fielddataflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINCLUDEINPARENT, domain, "incinparentflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISINDEX, domain, "indexflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISPKEY, domain, "pkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSTORE, domain, "storeflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}