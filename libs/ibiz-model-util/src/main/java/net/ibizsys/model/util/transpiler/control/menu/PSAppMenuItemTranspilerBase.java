package net.ibizsys.model.util.transpiler.control.menu;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.menu.PSAppMenuItemImplBase.*;



public class PSAppMenuItemTranspilerBase extends net.ibizsys.model.util.transpiler.control.menu.PSMenuItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.menu.PSAppMenuItemImplBase)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.menu.PSAppMenuItemImplBase realPSModelObject = (net.ibizsys.model.control.menu.PSAppMenuItemImplBase)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "menuitemstate", realPSModelObject.getAppMenuItemState(), realPSModelObject, "getAppMenuItemState");
		this.setDomainValue(iPSModelTranspileContext, domain, "counterid", realPSModelObject.getCounterId(), realPSModelObject, "getCounterId");
		this.setDomainValue(iPSModelTranspileContext, domain, "rawcssstyle", realPSModelObject.getCssStyle(), realPSModelObject, "getCssStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "data", realPSModelObject.getData(), realPSModelObject, "getData");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "informtag", realPSModelObject.getInformTag(), realPSModelObject, "getInformTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "informtag2", realPSModelObject.getInformTag2(), realPSModelObject, "getInformTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "amitemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psappfuncid", realPSModelObject.getPSAppFunc(), realPSModelObject, "getPSAppFunc");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtype", realPSModelObject.getPredefinedType(), realPSModelObject, "getPredefinedType");
		this.setDomainValue(iPSModelTranspileContext, domain, "predefinedtypeparam", realPSModelObject.getPredefinedTypeParam(), realPSModelObject, "getPredefinedTypeParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "disableclose", realPSModelObject.isDisableClose(), realPSModelObject, "isDisableClose");
		this.setDomainValue(iPSModelTranspileContext, domain, "hiddenitem", realPSModelObject.isHidden(), realPSModelObject, "isHidden");
		this.setDomainValue(iPSModelTranspileContext, domain, "hidesidebar", realPSModelObject.isHideSideBar(), realPSModelObject, "isHideSideBar");
		this.setDomainValue(iPSModelTranspileContext, domain, "opendefault", realPSModelObject.isOpenDefault(), realPSModelObject, "isOpenDefault");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablemode", realPSModelObject.isValid(), realPSModelObject, "isValid");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPPMENUITEMSTATE, domain, "menuitemstate", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOUNTERID, domain, "counterid", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCSSSTYLE, domain, "rawcssstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA, domain, "data", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINFORMTAG, domain, "informtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETINFORMTAG2, domain, "informtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "amitemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPFUNC, domain, "psappfuncid", net.ibizsys.model.app.func.IPSAppFunc.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssysimageid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPE, domain, "predefinedtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPREDEFINEDTYPEPARAM, domain, "predefinedtypeparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISDISABLECLOSE, domain, "disableclose", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDDEN, domain, "hiddenitem", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDESIDEBAR, domain, "hidesidebar", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISOPENDEFAULT, domain, "opendefault", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVALID, domain, "enablemode", boolean.class, new String[]{"true"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}