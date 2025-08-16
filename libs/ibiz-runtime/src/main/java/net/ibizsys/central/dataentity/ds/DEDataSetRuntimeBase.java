package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;

public abstract class DEDataSetRuntimeBase extends DataEntityModelRuntimeBase implements IDEDataSetRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEDataSetRuntimeBase.class);
	private IPSDEDataSet iPSDEDataSet = null;
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet) throws Exception {
		this.setDataEntityRuntimeBase(iDataEntityRuntimeContext.getDataEntityRuntime());
		this.setPSDEDataSet(iPSDEDataSet);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	public IPSDEDataSet getPSDEDataSet() {
		return this.iPSDEDataSet;
	}
	
	protected void setPSDEDataSet(IPSDEDataSet iPSDEDataSet) {
		this.iPSDEDataSet = iPSDEDataSet;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEDataSet();
	}

	@Override
	public Object fetch(Object[] args) throws Throwable {
		return onFetch((ISearchContext)args[0]);
	}

	protected abstract Object onFetch(ISearchContext iSearchContext) throws Throwable;
	
	
}
