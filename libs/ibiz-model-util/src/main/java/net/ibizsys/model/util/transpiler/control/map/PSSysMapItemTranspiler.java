package net.ibizsys.model.util.transpiler.control.map;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.map.PSSysMapItemImpl.*;



public class PSSysMapItemTranspiler extends net.ibizsys.model.util.transpiler.control.PSControlItemTranspiler2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.map.PSSysMapItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.map.PSSysMapItemImpl realPSModelObject = (net.ibizsys.model.control.map.PSSysMapItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "altpsdefid", realPSModelObject.getAltitudePSAppDEField(), realPSModelObject, "getAltitudePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "bkcolor", realPSModelObject.getBKColor(), realPSModelObject, "getBKColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "bkcolorpsdefid", realPSModelObject.getBKColorPSAppDEField(), realPSModelObject, "getBKColorPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "bordercolor", realPSModelObject.getBorderColor(), realPSModelObject, "getBorderColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "borderwidth", realPSModelObject.getBorderWidth(), realPSModelObject, "getBorderWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "clspsdefid", realPSModelObject.getClsPSAppDEField(), realPSModelObject, "getClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "color", realPSModelObject.getColor(), realPSModelObject, "getColor");
		this.setDomainValue(iPSModelTranspileContext, domain, "colorpsdefid", realPSModelObject.getColorPSAppDEField(), realPSModelObject, "getColorPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "contentpsdefid", realPSModelObject.getContentPSAppDEField(), realPSModelObject, "getContentPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "customcond", realPSModelObject.getCustomCond(), realPSModelObject, "getCustomCond");
		this.setDomainValue(iPSModelTranspileContext, domain, "data2psdefid", realPSModelObject.getData2PSAppDEField(), realPSModelObject, "getData2PSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "datapsdefid", realPSModelObject.getDataPSAppDEField(), realPSModelObject, "getDataPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "dynaclass", realPSModelObject.getDynaClass(), realPSModelObject, "getDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdefid", realPSModelObject.getGroupPSAppDEField(), realPSModelObject, "getGroupPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "iconpsdefid", realPSModelObject.getIconPSAppDEField(), realPSModelObject, "getIconPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "keypsdefid", realPSModelObject.getIdPSAppDEField(), realPSModelObject, "getIdPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemstyle", realPSModelObject.getItemStyle(), realPSModelObject, "getItemStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "latpsdefid", realPSModelObject.getLatitudePSAppDEField(), realPSModelObject, "getLatitudePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "linkpsdefid", realPSModelObject.getLinkPSAppDEField(), realPSModelObject, "getLinkPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "longpsdefid", realPSModelObject.getLongitudePSAppDEField(), realPSModelObject, "getLongitudePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "maxsize", realPSModelObject.getMaxSize(), realPSModelObject, "getMaxSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "namepslanresid", realPSModelObject.getNamePSLanguageRes(), realPSModelObject, "getNamePSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervaluepsdefid", realPSModelObject.getOrderValuePSAppDEField(), realPSModelObject, "getOrderValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdedsid", realPSModelObject.getPSAppDEDataSet(), realPSModelObject, "getPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdetoolbarid", realPSModelObject.getPSDEContextMenu(), realPSModelObject, "getPSDEContextMenu");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyscssid", realPSModelObject.getPSSysCss(), realPSModelObject, "getPSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysimageid", realPSModelObject.getPSSysImage(), realPSModelObject, "getPSSysImage");
		this.setDomainValue(iPSModelTranspileContext, domain, "radius", realPSModelObject.getRadius(), realPSModelObject, "getRadius");
		this.setDomainValue(iPSModelTranspileContext, domain, "removepsdeactionid", realPSModelObject.getRemovePSAppDEAction(), realPSModelObject, "getRemovePSAppDEAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "removepsdeopprivid", realPSModelObject.getRemovePSDEOPPriv(), realPSModelObject, "getRemovePSDEOPPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapeclspsdefid", realPSModelObject.getShapeClsPSAppDEField(), realPSModelObject, "getShapeClsPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapedynaclass", realPSModelObject.getShapeDynaClass(), realPSModelObject, "getShapeDynaClass");
		this.setDomainValue(iPSModelTranspileContext, domain, "shapepssyscssid", realPSModelObject.getShapePSSysCss(), realPSModelObject, "getShapePSSysCss");
		this.setDomainValue(iPSModelTranspileContext, domain, "tag2psdefid", realPSModelObject.getTag2PSAppDEField(), realPSModelObject, "getTag2PSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tagpsdefid", realPSModelObject.getTagPSAppDEField(), realPSModelObject, "getTagPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "textpsdefid", realPSModelObject.getTextPSAppDEField(), realPSModelObject, "getTextPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "timepsdefid", realPSModelObject.getTimePSAppDEField(), realPSModelObject, "getTimePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "tipspsdefid", realPSModelObject.getTipsPSAppDEField(), realPSModelObject, "getTipsPSAppDEField");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALTITUDEPSAPPDEFIELD, domain, "altpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLOR, domain, "bkcolor", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBKCOLORPSAPPDEFIELD, domain, "bkcolorpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERCOLOR, domain, "bordercolor", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETBORDERWIDTH, domain, "borderwidth", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLSPSAPPDEFIELD, domain, "clspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLOR, domain, "color", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLORPSAPPDEFIELD, domain, "colorpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSAPPDEFIELD, domain, "contentpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCUSTOMCOND, domain, "customcond", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATA2PSAPPDEFIELD, domain, "data2psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAPSAPPDEFIELD, domain, "datapsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDYNACLASS, domain, "dynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSAPPDEFIELD, domain, "grouppsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETICONPSAPPDEFIELD, domain, "iconpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETIDPSAPPDEFIELD, domain, "keypsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMSTYLE, domain, "itemstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "itemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLATITUDEPSAPPDEFIELD, domain, "latpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLINKPSAPPDEFIELD, domain, "linkpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLONGITUDEPSAPPDEFIELD, domain, "longpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMAXSIZE, domain, "maxsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETNAMEPSLANGUAGERES, domain, "namepslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUEPSAPPDEFIELD, domain, "ordervaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEDATASET, domain, "psdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDECONTEXTMENU, domain, "psdetoolbarid", net.ibizsys.model.control.toolbar.IPSDEContextMenu.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSCSS, domain, "pssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSIMAGE, domain, "pssysimageid", net.ibizsys.model.res.IPSSysImage.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETRADIUS, domain, "radius", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEPSAPPDEACTION, domain, "removepsdeactionid", net.ibizsys.model.app.dataentity.IPSAppDEAction.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETREMOVEPSDEOPPRIV, domain, "removepsdeopprivid", net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPECLSPSAPPDEFIELD, domain, "shapeclspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPEDYNACLASS, domain, "shapedynaclass", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSHAPEPSSYSCSS, domain, "shapepssyscssid", net.ibizsys.model.res.IPSSysCss.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAG2PSAPPDEFIELD, domain, "tag2psdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTAGPSAPPDEFIELD, domain, "tagpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTEXTPSAPPDEFIELD, domain, "textpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIMEPSAPPDEFIELD, domain, "timepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETTIPSPSAPPDEFIELD, domain, "tipspsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}