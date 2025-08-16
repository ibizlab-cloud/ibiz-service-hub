package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl.*;



public class PSAppDEMobMEditViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEMEditViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEMobMEditViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam9", realPSModelObject.isEnablePullDownRefresh(), realPSModelObject, "isEnablePullDownRefresh");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPULLDOWNREFRESH, domain, "viewparam9", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}