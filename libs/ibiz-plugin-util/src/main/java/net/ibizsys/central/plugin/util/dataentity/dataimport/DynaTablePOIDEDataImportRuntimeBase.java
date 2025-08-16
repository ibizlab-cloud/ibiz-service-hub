package net.ibizsys.central.plugin.util.dataentity.dataimport;

import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.DEExtensionUtilRuntimeBase;
import net.ibizsys.central.plugin.poi.dataentity.dataimport.POIDEDataImportRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem;
import net.ibizsys.model.dataentity.dataimport.PSDEDataImportItemImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IWebContext;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DynaTablePOIDEDataImportRuntimeBase extends POIDEDataImportRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaTablePOIDEDataImportRuntimeBase.class);
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
	protected Map<Integer, EntityError> onImportData(IEntity baseEntity, List<Map<String, Object>> list, boolean bTestPriv, net.ibizsys.central.dataentity.IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		if(dataTypePSDEField != null && getDEExtensionUtilRuntime() != null && this.getUserContext() != null) {
			String strDataType = null;
			IWebContext iWebContext = this.getUserContext().getWebContext();
			if(iWebContext != null) {
				strDataType = iWebContext.getParameter("srfdatatype");
			}
			if(StringUtils.hasLength(strDataType)) {
				this.getDataEntityRuntime().setFieldValue(baseEntity, dataTypePSDEField, DataTypeUtils.parse(dataTypePSDEField.getStdDataType(), strDataType));
			}
		}
		return super.onImportData(baseEntity, list, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	@Override
	protected Map<String, IPSDEDataImportItem> getPSDEDataImportItems(IUserContext iUserContext) throws Throwable {
		Map<String, IPSDEDataImportItem> map = super.getPSDEDataImportItems(iUserContext);
		IPSDEField dataTypePSDEField = this.getDataEntityRuntime().getDataTypePSDEField();
		if(dataTypePSDEField != null && getDEExtensionUtilRuntime() != null) {
			String strDataType = null;
			IWebContext iWebContext = iUserContext.getWebContext();
			if(iWebContext != null) {
				strDataType = iWebContext.getParameter("srfdatatype");
			}

			if(StringUtils.hasLength(strDataType)) {
				List<IPSDEField> psDEFieldList = this.getDEExtensionUtilRuntime().getPSDEFields(String.format(DEExtensionUtilRuntimeBase.FIELD_EXTENSION_FORMAT, dataTypePSDEField.getName(), strDataType));
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					int nOrderValue = 99999999;
					for(IPSDEField iPSDEField : psDEFieldList) {
						if(!StringUtils.hasLength(iPSDEField.getLogicName())) {
							continue;
						}
						if(map.containsKey(iPSDEField.getLogicName())) {
							log.warn(String.format("扩展属性[%1$s]标题[%2$s]已经存在，忽略导入", iPSDEField.getName(), iPSDEField.getLogicName()));
							continue;
						}

						ObjectNode objectNode = JsonUtils.createObjectNode();
						objectNode.put(PSDEDataImportItemImpl.ATTR_GETID, iPSDEField.getLowerCaseName());
						objectNode.put(PSDEDataImportItemImpl.ATTR_GETNAME, iPSDEField.getLowerCaseName());
						objectNode.put(PSDEDataImportItemImpl.ATTR_GETCAPTION, iPSDEField.getLogicName());


						objectNode.put(PSDEDataImportItemImpl.ATTR_GETORDERVALUE, iPSDEField.getImportOrder()!=0?iPSDEField.getImportOrder():iPSDEField.getOrderValue());

						IPSDEDataImportItem iPSDEDataImportItem = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSDEDataImport(), IPSDEDataImportItem.class, objectNode);
						if(iPSDEDataImportItem instanceof PSDEDataImportItemImpl) {
							PSDEDataImportItemImpl psDEDataImportItemImpl = (PSDEDataImportItemImpl)iPSDEDataImportItem;
							psDEDataImportItemImpl.setPSDEField(iPSDEField);
							if(iPSDEField.getInlinePSCodeList() != null) {
								psDEDataImportItemImpl.setPSCodeList(iPSDEField.getInlinePSCodeList());
							}
							else {
								psDEDataImportItemImpl.setPSCodeList(iPSDEField.getPSCodeList());
							}

							map.put(psDEDataImportItemImpl.getCaption(), psDEDataImportItemImpl);
						}
					}
				}
			}

		}
		return map;
	}

	protected IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.iDEExtensionUtilRuntime;
	}
}
