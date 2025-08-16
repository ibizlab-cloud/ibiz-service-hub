package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl.*;



public class PSPanelItemGroupLogicTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSPanelItemLogicTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl realPSModelObject = (net.ibizsys.model.control.panel.PSPanelItemGroupLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "groupop", realPSModelObject.getGroupOP(), realPSModelObject, "getGroupOP");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupnotflag", realPSModelObject.isNotMode(), realPSModelObject, "isNotMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPOP, domain, "groupop", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOTMODE, domain, "groupnotflag", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}