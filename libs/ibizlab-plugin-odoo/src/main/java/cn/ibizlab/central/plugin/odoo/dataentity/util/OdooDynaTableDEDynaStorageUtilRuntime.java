package cn.ibizlab.central.plugin.odoo.dataentity.util;

import net.ibizsys.central.plugin.util.dataentity.util.DynaTableDEDynaStorageUtilRuntimeBase;

public class OdooDynaTableDEDynaStorageUtilRuntime extends DynaTableDEDynaStorageUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OdooDynaTableDEDynaStorageUtilRuntime.class);
	
	@Override
	protected String getDynaTableName(String strType) throws Exception {
		return this.getDataEntityRuntime().getTableName();
	}
	
	
	@Override
	public int getStorageMode() {
		return STORAGEMODE_EMBEDDED_DYNAMIC_COLUMNS;
	}
}
