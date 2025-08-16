package net.ibizsys.model.util.transpiler.control.drctrl;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.drctrl.PSDEDRCtrlItemImpl.*;



public class PSDEDRCtrlItemTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.drctrl.PSDEDRCtrlItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.drctrl.PSDEDRCtrlItemImpl realPSModelObject = (net.ibizsys.model.control.drctrl.PSDEDRCtrlItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "countermode", realPSModelObject.getCounterMode(), realPSModelObject, "getCounterMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewbaseid", realPSModelObject.getPSAppView(), realPSModelObject, "getPSAppView");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERMODE, domain, "countermode", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEW, domain, "psdeviewbaseid", net.ibizsys.model.app.view.IPSAppView.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}