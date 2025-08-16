package net.ibizsys.central.codelist;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.codelist.DynamicCodeListRuntime;
import net.ibizsys.runtime.util.ISearchContextBase;

public class DynamicCodeListRuntimeInstance extends DynamicCodeListRuntime{

	private Map<String, Object> params = new HashMap<String, Object>();
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSCodeList iPSCodeList, Map<String, Object> params) throws Exception {
		super.init(iSystemRuntimeBaseContext, iPSCodeList);
		if(params!=null) {
			this.params.putAll(params);
		}
	}
	
	@Override
	protected void fillSearchContext(ISearchContextBase iSearchContextBase) throws Throwable {
		if(iSearchContextBase instanceof ISearchContextDTO) {
			((ISearchContextDTO)iSearchContextBase).putAll(this.params);
		}
		super.fillSearchContext(iSearchContextBase);
	}
	
}
