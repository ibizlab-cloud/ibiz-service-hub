package net.ibizsys.central.cloud.core.dataentity.security.dr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.util.ISearchCond;

public abstract class DataEntityDRProviderBase extends net.ibizsys.central.dataentity.security.dr.DataEntityDRProviderBase implements IDataEntityDRProvider {

	@Override
	public List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, Collection<IPSDEUserRole> iPSDEUserRoles, String action) {
		return this.getDRSearchConds(EmployeeContext.getCurrentMust(), iDataEntityRuntime, iPSDEUserRoles, action);
	}
	
	@Override
	public List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, Collection<IPSDEUserRole> iPSDEUserRoles, String action) {
		if (isSupportMerge()) {
			IPSDEUserRole mergePSDEUserRole = createPSDEUserRole(iDataEntityRuntime);
			merge(mergePSDEUserRole, iPSDEUserRoles);
			return getDRSearchConds(iEmployeeContext, iDataEntityRuntime, mergePSDEUserRole, action);
		} else {
			List<ISearchCond> searchConds = new ArrayList<>();
			iPSDEUserRoles.stream().forEach(iPSDEUserRole -> {
				if (support(iPSDEUserRole)) {
					List<ISearchCond> itemSearchConds = getDRSearchConds(iEmployeeContext, iDataEntityRuntime, iPSDEUserRole, action);
					if (!ObjectUtils.isEmpty(itemSearchConds)) {
						searchConds.addAll(itemSearchConds);
					}
				}
			});
			return searchConds;
		}
	}

	public List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action) {
		return this.getDRSearchConds(EmployeeContext.getCurrentMust(), iDataEntityRuntime, iPSDEUserRole, action);
	}

	@Override
	public List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange) {
		return this.getDRSearchConds(iEmployeeContext, iDataEntityRuntime, iPSDEDataRange, iPSDEDataRange.getUserDRAction());
	}

	@Override
	public List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action) {
		return this.getDRSearchConds(iEmployeeContext, iDataEntityRuntime, (IPSDEDataRange)iPSDEUserRole, action);
	}
	
	protected abstract List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange, String action);

}
