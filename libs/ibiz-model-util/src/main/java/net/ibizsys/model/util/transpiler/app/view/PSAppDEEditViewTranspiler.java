package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEEditViewImpl.*;



public class PSAppDEEditViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEXDataViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEEditViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEEditViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEEditViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam13", realPSModelObject.getMarkOpenDataMode(), realPSModelObject, "getMarkOpenDataMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam3", realPSModelObject.isEnableDirtyChecking(), realPSModelObject, "isEnableDirtyChecking");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam17", realPSModelObject.isManualAppendForms(), realPSModelObject, "isManualAppendForms");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMARKOPENDATAMODE, domain, "viewparam13", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEDIRTYCHECKING, domain, "viewparam3", boolean.class, new String[]{"true"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMANUALAPPENDFORMS, domain, "viewparam17", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}