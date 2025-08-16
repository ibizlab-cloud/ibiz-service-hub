package net.ibizsys.central.plugin.extension.dataentity.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEUtilRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public abstract class DEDynaStorageUtilRuntimeBase extends net.ibizsys.central.dataentity.util.DEDynaStorageUtilRuntimeBase implements IDEUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDynaStorageUtilRuntimeBase.class);
	private IDEExtensionUtilRuntime iDEExtensionUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		if(this.getDataEntityRuntime().isEnableExtension() && this.getDataEntityRuntime().getDEExtensionUtilRuntime()!=null) {
			this.iDEExtensionUtilRuntime = this.getDataEntityRuntime().getDEExtensionUtilRuntime();
		}
		super.onInit();
	}
	
	
	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strActionName, iPSDEAction);
		List<IPSDEField> psDEFieldList = getExtensionPSDEFields(arg0, strActionName, iPSDEAction);
		return this.mergePSDEFieldMap(psDEFieldMap, psDEFieldList);
	}
	
	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strDataSetName, iPSDEDataSet);
		List<IPSDEField> psDEFieldList = getExtensionPSDEFields(arg0, strDataSetName, iPSDEDataSet);
		return this.mergePSDEFieldMap(psDEFieldMap, psDEFieldList);
	}
	
	@Override
	protected Map<String, IPSDEField> getDynaPSDEFields(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Exception {
		Map<String, IPSDEField> psDEFieldMap = super.getDynaPSDEFields(arg0, strDataQueryName, iPSDEDataQuery);
		List<IPSDEField> psDEFieldList = getExtensionPSDEFields(arg0, strDataQueryName, iPSDEDataQuery);
		return this.mergePSDEFieldMap(psDEFieldMap, psDEFieldList);
	}
	
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Exception {
		if(this.getDEExtensionUtilRuntime()!=null) {
			return this.getDEExtensionUtilRuntime().getPSDEFields(arg0);
		}
		return null;
	}
	
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Exception {
		if(this.getDEExtensionUtilRuntime()!=null) {
			return this.getDEExtensionUtilRuntime().getPSDEFields(arg0);
		}
		return null;
	}
	
	protected List<IPSDEField> getExtensionPSDEFields(Object arg0, String strDataQueryName, IPSDEDataQuery iPSDEDataQuery) throws Exception {
		if(this.getDEExtensionUtilRuntime()!=null) {
			return this.getDEExtensionUtilRuntime().getPSDEFields(arg0);
		}
		return null;
	}

	protected Map<String, IPSDEField> mergePSDEFieldMap(Map<String, IPSDEField> psDEFieldMap, List<IPSDEField> psDEFieldList) {
		if(!ObjectUtils.isEmpty(psDEFieldList)) {
			Map<String, IPSDEField> psDEFieldMap2 = new LinkedHashMap<String, IPSDEField>();
			if(!ObjectUtils.isEmpty(psDEFieldMap)) {
				psDEFieldMap2.putAll(psDEFieldMap);
			}
			for(IPSDEField iPSDEField : psDEFieldList) {
				if(psDEFieldMap2.containsKey(iPSDEField.getName())) {
					continue;
				}
				psDEFieldMap2.put(iPSDEField.getName(), iPSDEField);
			}
			return psDEFieldMap2;
		}
		return psDEFieldMap;
	}
	
	protected IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.iDEExtensionUtilRuntime;
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	
}
