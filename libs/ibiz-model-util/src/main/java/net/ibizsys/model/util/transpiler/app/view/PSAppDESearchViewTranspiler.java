package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDESearchViewImpl.*;



public class PSAppDESearchViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDESearchViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDESearchViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDESearchViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getQuickGroupPSCodeList(), realPSModelObject, "getQuickGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam5", realPSModelObject.isEnableQuickSearch(), realPSModelObject, "isEnableQuickSearch");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam5", realPSModelObject.isExpandSearchForm(), realPSModelObject, "isExpandSearchForm");
		this.setDomainValue(iPSModelTranspileContext, domain, "loaddefault", realPSModelObject.isLoadDefault(), realPSModelObject, "isLoadDefault");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETQUICKGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEQUICKSEARCH, domain, "viewparam5", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXPANDSEARCHFORM, domain, "viewparam5", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISLOADDEFAULT, domain, "loaddefault", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}