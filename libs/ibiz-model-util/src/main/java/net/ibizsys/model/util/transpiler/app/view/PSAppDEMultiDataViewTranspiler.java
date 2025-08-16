package net.ibizsys.model.util.transpiler.app.view;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl.*;



public class PSAppDEMultiDataViewTranspiler extends net.ibizsys.model.util.transpiler.app.view.PSAppDEXDataViewTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl realPSModelObject = (net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getQuickGroupPSCodeList(), realPSModelObject, "getQuickGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam5", realPSModelObject.isEnableQuickSearch(), realPSModelObject, "isEnableQuickSearch");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewparam10", realPSModelObject.isExpandSearchForm(), realPSModelObject, "isExpandSearchForm");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETQUICKGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEQUICKSEARCH, domain, "viewparam5", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISEXPANDSEARCHFORM, domain, "viewparam10", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}