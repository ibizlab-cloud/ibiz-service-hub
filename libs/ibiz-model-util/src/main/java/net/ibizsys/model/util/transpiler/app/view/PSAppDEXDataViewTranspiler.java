package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEXDataViewImpl.*;



public class PSAppDEXDataViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEXDataViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEXDataViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEXDataViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "loaddefault", realPSModelObject.isLoadDefault(), realPSModelObject, "isLoadDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "readonlymode", realPSModelObject.isReadOnly(), realPSModelObject, "isReadOnly");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISLOADDEFAULT, domain, "loaddefault", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISREADONLY, domain, "readonlymode", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}