package net.ibizsys.central.search;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.runtime.ModelRuntimeBase;

public abstract class SysSearchDocRuntimeBase extends ModelRuntimeBase implements ISysSearchDocRuntime{
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSearchDocRuntimeBase.class);
	
	private ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext = null;
	private IPSSysSearchDoc iPSSysSearchDoc = null;

	
	
	@Override
	public void init(ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext, IPSSysSearchDoc iPSSysSearchDoc) throws Exception {
		this.iSysSearchSchemeRuntimeContext = iSysSearchSchemeRuntimeContext;
		this.iPSSysSearchDoc = iPSSysSearchDoc;
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
//		List<IPSSysDBColumn> psSysDBColumnList = this.getPSSysSearchDoc().getAllPSSysDBColumns();
//		if(psSysDBColumnList != null) {
//			for(IPSSysDBColumn iPSSysDBColumn : psSysDBColumnList) {
//				SysDBColumnRuntime sysDBColumnRuntime = new SysDBColumnRuntime();
//				sysDBColumnRuntime.init(ISysSearchSchemeRuntimeContext, this, iPSSysDBColumn);
//				this.sysDBColumnRuntimeList.add(sysDBColumnRuntime);
//				this.sysDBColumnRuntimeMap.put(sysDBColumnRuntime.getName(), sysDBColumnRuntime);
//			}
//		}
		super.onInit();
	}
	
	
	
	protected ISysSearchSchemeRuntimeContext getSysSearchSchemeRuntimeContext() {
		return this.iSysSearchSchemeRuntimeContext;
	}
	
	@Override
	public IPSSysSearchDoc getPSSysSearchDoc() {
		return this.iPSSysSearchDoc;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysSearchDoc();
	}

	@Override
	public String getId() {
		return this.getPSSysSearchDoc().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysSearchDoc().getName();
	}


	@Override
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return this.getSysSearchSchemeRuntimeContext().getSysSearchSchemeRuntime();
	}

	
	
}
