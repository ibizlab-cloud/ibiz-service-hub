package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl.*;



public class PSDEUILogicParamTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUILogicParamImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultvalue", realPSModelObject.getDefaultValue(), realPSModelObject, "getDefaultValue");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "reffieldname", realPSModelObject.getParamFieldName(), realPSModelObject, "getParamFieldName");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtag", realPSModelObject.getParamTag(), realPSModelObject, "getParamTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "paramtag2", realPSModelObject.getParamTag2(), realPSModelObject, "getParamTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "stddatatype", realPSModelObject.getStdDataType(), realPSModelObject, "getStdDataType");
		this.setDomainValue(iPSModelTranspileContext, domain, "defaultparam", realPSModelObject.isDefault(), realPSModelObject, "isDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDEFAULTVALUE, domain, "defaultvalue", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMFIELDNAME, domain, "reffieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMTAG, domain, "paramtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPARAMTAG2, domain, "paramtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTDDATATYPE, domain, "stddatatype", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDEFAULT, domain, "defaultparam", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}