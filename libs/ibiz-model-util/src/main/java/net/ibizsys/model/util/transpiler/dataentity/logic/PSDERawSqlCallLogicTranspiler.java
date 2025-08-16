package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl.*;



public class PSDERawSqlCallLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDELogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDERawSqlCallLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getDstPSDELogicParam(), realPSModelObject, "getDstPSDELogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysdbschemeid", realPSModelObject.getPSSysDBScheme(), realPSModelObject, "getPSSysDBScheme");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getSql(), realPSModelObject, "getSql");
		this.setDomainValue(iPSModelTranspileContext, domain, "param9", realPSModelObject.isFillDstLogicParam(), realPSModelObject, "isFillDstLogicParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param7", realPSModelObject.isIgnoreResetDstLogicParam(), realPSModelObject, "isIgnoreResetDstLogicParam");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTPSDELOGICPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDELogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSDBSCHEME, domain, "pssysdbschemeid", net.ibizsys.model.database.IPSSysDBScheme.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSQL, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFILLDSTLOGICPARAM, domain, "param9", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISIGNORERESETDSTLOGICPARAM, domain, "param7", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}