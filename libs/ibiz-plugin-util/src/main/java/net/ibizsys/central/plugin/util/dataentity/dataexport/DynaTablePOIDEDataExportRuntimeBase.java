package net.ibizsys.central.plugin.util.dataentity.dataexport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.DEExtensionUtilRuntimeBase;
import net.ibizsys.central.plugin.poi.dataentity.dataexport.POIDEDataExportRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.model.dataentity.dataexport.PSDEDataExportItemImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DynaTablePOIDEDataExportRuntimeBase extends POIDEDataExportRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaTablePOIDEDataExportRuntimeBase.class);
	private IDEExtensionUtilRuntime iDEExtensionUtilRuntime = null;

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}

	@Override
	protected void onInit() throws Exception {
		if(this.getDataEntityRuntime().isEnableExtension() && this.getDataEntityRuntime().getDEExtensionUtilRuntime()!=null) {
			this.iDEExtensionUtilRuntime = this.getDataEntityRuntime().getDEExtensionUtilRuntime();
		}
		super.onInit();
	}

	@Override
	protected List<IPSDEDataExportItem> getPSDEDataExportItems() {
		List<IPSDEDataExportItem> list = super.getPSDEDataExportItems();
		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		IUserContext iUserContext = this.getUserContext();
		if(dataTypePSDEField != null && getDEExtensionUtilRuntime() != null && iUserContext != null) {
			String strDataType = null;
			IWebContext iWebContext = iUserContext.getWebContext();
			if(iWebContext != null) {
				strDataType = iWebContext.getParameter("srfdatatype");
			}

			if(StringUtils.hasLength(strDataType)) {
				List<IPSDEField> psDEFieldList = this.getDEExtensionUtilRuntime().getPSDEFields(String.format(DEExtensionUtilRuntimeBase.FIELD_EXTENSION_FORMAT, dataTypePSDEField.getName(), strDataType));
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					List<IPSDEDataExportItem> allList = new ArrayList<IPSDEDataExportItem>();
					Map<String, IPSDEDataExportItem> map = new HashMap<String, IPSDEDataExportItem>();
					if(!ObjectUtils.isEmpty(list)) {
						for (IPSDEDataExportItem iPSDEDataExportItem : list) {
							map.put(iPSDEDataExportItem.getCaption(), iPSDEDataExportItem);
						}
						allList.addAll(list);
					}
					list = allList;
					psDEFieldList.sort(Comparator.comparing(IPSDEField::getOrderValue));
					for(IPSDEField iPSDEField : psDEFieldList) {
						if(!StringUtils.hasLength(iPSDEField.getLogicName())) {
							continue;
						}

						if(map.containsKey(iPSDEField.getLogicName())) {
							log.warn(String.format("扩展属性[%1$s]标题[%2$s]已经存在，忽略导出", iPSDEField.getName(), iPSDEField.getLogicName()));
							continue;
						}

						ObjectNode objectNode = JsonUtils.createObjectNode();
						objectNode.put(PSDEDataExportItemImpl.ATTR_GETID, iPSDEField.getLowerCaseName());
						objectNode.put(PSDEDataExportItemImpl.ATTR_GETNAME, iPSDEField.getLowerCaseName());
						objectNode.put(PSDEDataExportItemImpl.ATTR_GETCAPTION, iPSDEField.getLogicName());


//						nOrderValue ++;
//						objectNode.put(PSDEDataExportItemImpl.ATTR_GETORDERVALUE, nOrderValue);

						IPSDEDataExportItem iPSDEDataExportItem = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSDEDataExport(), IPSDEDataExportItem.class, objectNode);
						if(iPSDEDataExportItem instanceof PSDEDataExportItemImpl) {
							PSDEDataExportItemImpl psDEDataExportItemImpl = (PSDEDataExportItemImpl)iPSDEDataExportItem;
							psDEDataExportItemImpl.setPSDEField(iPSDEField);
							if(iPSDEField.getInlinePSCodeList() != null) {
								psDEDataExportItemImpl.setPSCodeList(iPSDEField.getInlinePSCodeList());
							}
							else {
								psDEDataExportItemImpl.setPSCodeList(iPSDEField.getPSCodeList());
							}
							list.add(psDEDataExportItemImpl);
						}
					}
				}
			}
		}
		return list;
	}

	protected IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.iDEExtensionUtilRuntime;
	}

}
