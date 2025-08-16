package net.ibizsys.central.cloud.core.dataentity.security.dr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.PSDEUserRoleImpl;
import net.ibizsys.runtime.security.DataRanges;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.SearchFieldCond;

/**
 * 部门权限范围
 */
public class DeptDRProvider extends DataEntityDRProviderBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DeptDRProvider.class);

	@Override
	public boolean support(IPSDEUserRole iPSDEUserRole) {
		if (iPSDEUserRole.isEnableSecDR()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean support(IPSDEDataRange iPSDEDataRange) {
		if (iPSDEDataRange.isEnableSecDR()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isSupportMerge() {
		return true;
	}

	@Override
	public IPSDEUserRole merge(IPSDEUserRole mergeDEUserRole, Collection<IPSDEUserRole> iPSDEUserRoles) {
		iPSDEUserRoles.stream().forEach(iPSDEUserRole -> {
			if (support(iPSDEUserRole)) {
				mergeDEUserRole.getObjectNode().put(PSDEUserRoleImpl.ATTR_ISENABLESECDR, true);
				mergeDEUserRole.getObjectNode().put(PSDEUserRoleImpl.ATTR_GETSECDR, mergeDEUserRole.getSecDR() | iPSDEUserRole.getSecDR());
			}
		});
		return mergeDEUserRole;
	}

	@Override
	protected List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange, String action) {
		List<ISearchCond> searchConds = new ArrayList<>();
		// AuthenticationUser iEmployeeContext =
		// AuthenticationUser.getAuthenticationUser();
		// IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		long secDR = iPSDEDataRange.getSecDR();
		if (secDR > 0) {
			if (iDataEntityRuntime.getDeptIdPSDEField() == null) {
				// 未指定组织部门字段
				log.warn(String.format("实体[%s]未指定权限[部门]范围字段", iDataEntityRuntime.getName()));
				// SearchCustomCond customCond = new SearchCustomCond();
				// customCond.setCustomCond(ISearchCustomCond.FALSE);
				// searchConds.add(customCond);
			} else {
				// 当前
				if ((DataRanges.SECTOR_CURRENT & secDR) > 0) {
					SearchFieldCond searchFieldCond = new SearchFieldCond();
					searchFieldCond.setFieldName(iDataEntityRuntime.getDeptIdPSDEField().getName());
					searchFieldCond.setCondOp(Conditions.EQ);
					searchFieldCond.setValue(iEmployeeContext.getDeptid());
					searchConds.add(searchFieldCond);
				}
				// 上级
				if ((DataRanges.SECTOR_PARENT & secDR) > 0) {
					if (StringUtils.hasLength(iEmployeeContext.getPdept())) {
						SearchFieldCond searchFieldCond = new SearchFieldCond();
						searchFieldCond.setFieldName(iDataEntityRuntime.getDeptIdPSDEField().getName());
						searchFieldCond.setCondOp(Conditions.IN);
						searchFieldCond.setValue(String.format("'%s'", String.join("','", iEmployeeContext.getPdept().split(","))));
						searchFieldCond.setParamMode(false);
						searchConds.add(searchFieldCond);
					}
				}
				// 下级
				if ((DataRanges.SECTOR_CHILD & secDR) > 0) {
					if (StringUtils.hasLength(iEmployeeContext.getSdept())) {
						SearchFieldCond searchFieldCond = new SearchFieldCond();
						searchFieldCond.setFieldName(iDataEntityRuntime.getDeptIdPSDEField().getName());
						searchFieldCond.setCondOp(Conditions.IN);
						searchFieldCond.setValue(String.format("'%s'", String.join("','", iEmployeeContext.getSdept().split(","))));
						searchFieldCond.setParamMode(false);
						searchConds.add(searchFieldCond);
					}
				}
				// 无值
				if ((DataRanges.SECTOR_NULL & secDR) > 0) {
					SearchFieldCond searchFieldCond = new SearchFieldCond();
					searchFieldCond.setFieldName(iDataEntityRuntime.getDeptIdPSDEField().getName());
					searchFieldCond.setCondOp(Conditions.ISNULL);
					searchConds.add(searchFieldCond);
				}
			}
		}
		return searchConds;
	}
}
