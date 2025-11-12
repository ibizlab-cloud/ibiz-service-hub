package net.ibizsys.model.util.transpiler.database;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.database.PSSysDBColumnImpl.*;



public class PSSysDBColumnTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.database.PSSysDBColumnImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.database.PSSysDBColumnImpl realPSModelObject = (net.ibizsys.model.database.PSSysDBColumnImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "codename2", realPSModelObject.getCodeName2(), realPSModelObject, "getCodeName2");
		this.setDomainValue(iPSModelTranspileContext, domain, "columntag", realPSModelObject.getColumnTag(), realPSModelObject, "getColumnTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "columntag2", realPSModelObject.getColumnTag2(), realPSModelObject, "getColumnTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "createsql", realPSModelObject.getCreateSql(), realPSModelObject, "getCreateSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "datatype", realPSModelObject.getDataType(), realPSModelObject, "getDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "dropsql", realPSModelObject.getDropSql(), realPSModelObject, "getDropSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "length", realPSModelObject.getLength(), realPSModelObject, "getLength");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "precision2", realPSModelObject.getScale(), realPSModelObject, "getScale");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "identitymode", realPSModelObject.isAutoIncrement(), realPSModelObject, "isAutoIncrement");
		this.setDomainValue(iPSModelTranspileContext, domain, "fkey", realPSModelObject.isFKey(), realPSModelObject, "isFKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "allowempty", realPSModelObject.isNullable(), realPSModelObject, "isNullable");
		this.setDomainValue(iPSModelTranspileContext, domain, "pkey", realPSModelObject.isPKey(), realPSModelObject, "isPKey");
		this.setDomainValue(iPSModelTranspileContext, domain, "unsignedmode", realPSModelObject.isUnsigned(), realPSModelObject, "isUnsigned");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCODENAME2, domain, "codename2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNTAG, domain, "columntag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNTAG2, domain, "columntag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCREATESQL, domain, "createsql", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATATYPE, domain, "datatype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDROPSQL, domain, "dropsql", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLENGTH, domain, "length", int.class, new String[]{"-1","0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSCALE, domain, "precision2", int.class, new String[]{"-1"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISAUTOINCREMENT, domain, "identitymode", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFKEY, domain, "fkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNULLABLE, domain, "allowempty", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISPKEY, domain, "pkey", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISUNSIGNED, domain, "unsignedmode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}