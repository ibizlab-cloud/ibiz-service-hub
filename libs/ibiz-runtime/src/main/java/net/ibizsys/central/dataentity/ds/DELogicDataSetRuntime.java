package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.util.ISearchContext;

public class DELogicDataSetRuntime extends DEDataSetRuntimeBase {

	@Override
	protected void onInit() throws Exception {
		this.getPSDEDataSet().getPSDELogicMust();
		super.onInit();
	}
	
	@Override
	protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
		return this.getDataEntityRuntime().getDELogicRuntime(this.getPSDEDataSet().getPSDELogicMust()).execute(new Object[] {iSearchContext});	}

}
