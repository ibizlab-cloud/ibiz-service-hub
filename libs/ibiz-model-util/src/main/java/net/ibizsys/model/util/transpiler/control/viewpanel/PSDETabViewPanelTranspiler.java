package net.ibizsys.model.util.transpiler.control.viewpanel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl.*;



public class PSDETabViewPanelTranspiler extends net.ibizsys.model.util.transpiler.control.viewpanel.PSDEViewPanelTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl realPSModelObject = (net.ibizsys.model.control.viewpanel.PSDETabViewPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam3", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam4", realPSModelObject.getNavFilter(), realPSModelObject, "getNavFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam2", realPSModelObject.getNavPSDER(), realPSModelObject, "getNavPSDER");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "ctrlparam3", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVFILTER, domain, "ctrlparam4", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAVPSDER, domain, "ctrlparam2", net.ibizsys.model.dataentity.der.IPSDERBase.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}