package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl.*;



public class PSAppDEMultiDataView2Transpiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEMultiDataViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEMultiDataView2Impl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam6", realPSModelObject.getMDCtrlActiveMode(), realPSModelObject, "getMDCtrlActiveMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMDCTRLACTIVEMODE, domain, "viewparam6", int.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}