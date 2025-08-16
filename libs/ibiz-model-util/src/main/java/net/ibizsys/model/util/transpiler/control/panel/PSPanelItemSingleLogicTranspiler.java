package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSPanelItemSingleLogicImpl.*;



public class PSPanelItemSingleLogicTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSPanelItemLogicTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSPanelItemSingleLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSPanelItemSingleLogicImpl realPSModelObject = (net.ibizsys.model.control.panel.PSPanelItemSingleLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "condop", realPSModelObject.getCondOp(), realPSModelObject, "getCondOp");
		this.setDomainValue(iPSModelTranspileContext, domain, "dstfieldname", realPSModelObject.getDstModelField(), realPSModelObject, "getDstModelField");
		this.setDomainValue(iPSModelTranspileContext, domain, "condvalue", realPSModelObject.getValue(), realPSModelObject, "getValue");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONDOP, domain, "condop", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDSTMODELFIELD, domain, "dstfieldname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUE, domain, "condvalue", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}