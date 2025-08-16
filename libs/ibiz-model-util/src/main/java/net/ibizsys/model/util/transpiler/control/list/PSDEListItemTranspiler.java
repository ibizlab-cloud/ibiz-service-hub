package net.ibizsys.model.util.transpiler.control.list;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.list.PSDEListItemImpl.*;



public class PSDEListItemTranspiler extends net.ibizsys.model.util.transpiler.control.list.PSListItemTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.list.PSDEListItemImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.list.PSDEListItemImpl realPSModelObject = (net.ibizsys.model.control.list.PSDEListItemImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "align", realPSModelObject.getAlign(), realPSModelObject, "getAlign");
		this.setDomainValue(iPSModelTranspileContext, domain, "clconvertmode", realPSModelObject.getCLConvertMode(), realPSModelObject, "getCLConvertMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "cappslanresid", realPSModelObject.getCapPSLanguageRes(), realPSModelObject, "getCapPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "caption", realPSModelObject.getCaption(), realPSModelObject, "getCaption");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdelistitemname", realPSModelObject.getDataItemName(), realPSModelObject, "getDataItemName");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupitem", realPSModelObject.getGroupItem(), realPSModelObject, "getGroupItem");
		this.setDomainValue(iPSModelTranspileContext, domain, "itemtype", realPSModelObject.getItemType(), realPSModelObject, "getItemType");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuagroupid", realPSModelObject.getPSDEUIActionGroup(), realPSModelObject, "getPSDEUIActionGroup");
		this.setDomainValue(iPSModelTranspileContext, domain, "valueformat", realPSModelObject.getValueFormat(), realPSModelObject, "getValueFormat");
		this.setDomainValue(iPSModelTranspileContext, domain, "width", realPSModelObject.getWidth(), realPSModelObject, "getWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "enableitempriv", realPSModelObject.isEnableItemPriv(), realPSModelObject, "isEnableItemPriv");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isEnableSort(), realPSModelObject, "isEnableSort");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETALIGN, domain, "align", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCLCONVERTMODE, domain, "clconvertmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPPSLANGUAGERES, domain, "cappslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCAPTION, domain, "caption", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETDATAITEMNAME, domain, "psdelistitemname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPITEM, domain, "groupitem", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETITEMTYPE, domain, "itemtype", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEUIACTIONGROUP, domain, "psdeuagroupid", net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETVALUEFORMAT, domain, "valueformat", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIDTH, domain, "width", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEITEMPRIV, domain, "enableitempriv", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLESORT, domain, "nosort", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}