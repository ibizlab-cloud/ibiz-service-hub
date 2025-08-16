package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.PSDEGridImpl.*;



public class PSDEGridTranspiler extends net.ibizsys.model.util.transpiler.control.PSMDAjaxControlContainerTranspiler2{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.PSDEGridImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.PSDEGridImpl realPSModelObject = (net.ibizsys.model.control.grid.PSDEGridImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "aggpsdedsid", realPSModelObject.getAggPSAppDEDataSet(), realPSModelObject, "getAggPSAppDEDataSet");
		this.setDomainValue(iPSModelTranspileContext, domain, "aggpsdeid", realPSModelObject.getAggPSAppDataEntity(), realPSModelObject, "getAggPSAppDataEntity");
		this.setDomainValue(iPSModelTranspileContext, domain, "colenablefilter", realPSModelObject.getColumnEnableFilter(), realPSModelObject, "getColumnEnableFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "colenablelink", realPSModelObject.getColumnEnableLink(), realPSModelObject, "getColumnEnableLink");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytext", realPSModelObject.getEmptyText(), realPSModelObject, "getEmptyText");
		this.setDomainValue(iPSModelTranspileContext, domain, "emptytextpslanresid", realPSModelObject.getEmptyTextPSLanguageRes(), realPSModelObject, "getEmptyTextPSLanguageRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "frozencol", realPSModelObject.getFrozenFirstColumn(), realPSModelObject, "getFrozenFirstColumn");
		this.setDomainValue(iPSModelTranspileContext, domain, "frozenlastcol", realPSModelObject.getFrozenLastColumn(), realPSModelObject, "getFrozenLastColumn");
		this.setDomainValue(iPSModelTranspileContext, domain, "gridstyle", realPSModelObject.getGridStyle(), realPSModelObject, "getGridStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupmode", realPSModelObject.getGroupMode(), realPSModelObject, "getGroupMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppsdefid", realPSModelObject.getGroupPSAppDEField(), realPSModelObject, "getGroupPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "grouppscodelistid", realPSModelObject.getGroupPSCodeList(), realPSModelObject, "getGroupPSCodeList");
		this.setDomainValue(iPSModelTranspileContext, domain, "groupstyle", realPSModelObject.getGroupStyle(), realPSModelObject, "getGroupStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortdir", realPSModelObject.getMinorSortDir(), realPSModelObject, "getMinorSortDir");
		this.setDomainValue(iPSModelTranspileContext, domain, "minorsortpsdefid", realPSModelObject.getMinorSortPSAppDEField(), realPSModelObject, "getMinorSortPSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "ordervaluepsdefid", realPSModelObject.getOrderValuePSAppDEField(), realPSModelObject, "getOrderValuePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "pagingsize", realPSModelObject.getPagingSize(), realPSModelObject, "getPagingSize");
		this.setDomainValue(iPSModelTranspileContext, domain, "sortmode", realPSModelObject.getSortMode(), realPSModelObject, "getSortMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam8", realPSModelObject.isEnableColFilter(), realPSModelObject, "isEnableColFilter");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam7", realPSModelObject.isEnableCustomized(), realPSModelObject, "isEnableCustomized");
		this.setDomainValue(iPSModelTranspileContext, domain, "enablepagingbar", realPSModelObject.isEnablePagingBar(), realPSModelObject, "isEnablePagingBar");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isEnableRowEditChangedOnly(), realPSModelObject, "isEnableRowEditChangedOnly");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isEnableRowEditOrder(), realPSModelObject, "isEnableRowEditOrder");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isEnableRowNew(), realPSModelObject, "isEnableRowNew");
		this.setDomainValue(iPSModelTranspileContext, domain, "forcefit", realPSModelObject.isForceFit(), realPSModelObject, "isForceFit");
		this.setDomainValue(iPSModelTranspileContext, domain, "showheader", realPSModelObject.isHideHeader(), realPSModelObject, "isHideHeader");
		this.setDomainValue(iPSModelTranspileContext, domain, "nosort", realPSModelObject.isNoSort(), realPSModelObject, "isNoSort");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGPSAPPDEDATASET, domain, "aggpsdedsid", net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAGGPSAPPDATAENTITY, domain, "aggpsdeid", net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNENABLEFILTER, domain, "colenablefilter", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCOLUMNENABLELINK, domain, "colenablelink", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXT, domain, "emptytext", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMPTYTEXTPSLANGUAGERES, domain, "emptytextpslanresid", net.ibizsys.model.res.IPSLanguageRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROZENFIRSTCOLUMN, domain, "frozencol", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETFROZENLASTCOLUMN, domain, "frozenlastcol", int.class, new String[]{"0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGRIDSTYLE, domain, "gridstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPMODE, domain, "groupmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSAPPDEFIELD, domain, "grouppsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPPSCODELIST, domain, "grouppscodelistid", net.ibizsys.model.codelist.IPSCodeList.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETGROUPSTYLE, domain, "groupstyle", java.lang.String.class, new String[]{"DEFAULT"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTDIR, domain, "minorsortdir", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETMINORSORTPSAPPDEFIELD, domain, "minorsortpsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETORDERVALUEPSAPPDEFIELD, domain, "ordervaluepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPAGINGSIZE, domain, "pagingsize", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSORTMODE, domain, "sortmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECOLFILTER, domain, "ctrlparam8", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLECUSTOMIZED, domain, "ctrlparam7", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEPAGINGBAR, domain, "enablepagingbar", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEROWEDIT, domain, "ctrlparam6", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEROWEDITCHANGEDONLY, domain, "ctrlparam6", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEROWEDITORDER, domain, "ctrlparam6", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISENABLEROWNEW, domain, "ctrlparam6", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISFORCEFIT, domain, "forcefit", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISHIDEHEADER, domain, "showheader", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISNOSORT, domain, "nosort", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSINGLESELECT, domain, "multiselect", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}