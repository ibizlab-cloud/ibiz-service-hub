package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDESideBarExplorerViewImpl.*;



public class PSAppDESideBarExplorerViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEMultiDataViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDESideBarExplorerViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDESideBarExplorerViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDESideBarExplorerViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam13", realPSModelObject.getMarkOpenDataMode(), realPSModelObject, "getMarkOpenDataMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam8", realPSModelObject.getSideBarLayout(), realPSModelObject, "getSideBarLayout");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam6", realPSModelObject.isShowDataInfoBar(), realPSModelObject, "isShowDataInfoBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMARKOPENDATAMODE, domain, "viewparam13", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSIDEBARLAYOUT, domain, "viewparam8", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWDATAINFOBAR, domain, "viewparam6", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}