package net.ibizsys.model.util.transpiler.dataentity.logic;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl.*;



public class PSDEUIMsgBoxLogicTranspiler extends net.ibizsys.model.util.transpiler.dataentity.logic.PSDEUILogicNodeTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl realPSModelObject = (net.ibizsys.model.dataentity.logic.PSDEUIMsgBoxLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "param1", realPSModelObject.getButtonsType(), realPSModelObject, "getButtonsType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param4", realPSModelObject.getMessage(), realPSModelObject, "getMessage");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstpsdlparamid", realPSModelObject.getMsgBoxParam(), realPSModelObject, "getMsgBoxParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "param2", realPSModelObject.getMsgBoxType(), realPSModelObject, "getMsgBoxType");
		this.setDomainValue(iPSModelTranspileContext, domain, "param11", realPSModelObject.getShowMode(), realPSModelObject, "getShowMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "param3", realPSModelObject.getTitle(), realPSModelObject, "getTitle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBUTTONSTYPE, domain, "param1", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMESSAGE, domain, "param4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGBOXPARAM, domain, "dstpsdlparamid", net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMSGBOXTYPE, domain, "param2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHOWMODE, domain, "param11", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTITLE, domain, "param3", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}