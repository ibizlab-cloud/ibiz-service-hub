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
 * 组织权限范围
 */
public class OrgDRProvider extends DataEntityDRProviderBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OrgDRProvider.class);

	@Override
	public boolean support(IPSDEUserRole iPSDEUserRole) {
		if (iPSDEUserRole.isEnableOrgDR()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean support(IPSDEDataRange iPSDEDataRange) {
		if (iPSDEDataRange.isEnableOrgDR()) {
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
				mergeDEUserRole.getObjectNode().put(PSDEUserRoleImpl.ATTR_ISENABLEORGDR, true);
				mergeDEUserRole.getObjectNode().put(PSDEUserRoleImpl.ATTR_GETORGDR, mergeDEUserRole.getOrgDR() | iPSDEUserRole.getOrgDR());
			}
		});
		return mergeDEUserRole;
	}

	@Override
	protected List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange, String action) {
		List<ISearchCond> searchConds = new ArrayList<>();
		// AuthenticationUser authenticationUser =
		// AuthenticationUser.getAuthenticationUser();
		// IEmployeeContext iEmployeeContext = ;
		long orgDR = iPSDEDataRange.getOrgDR();
		if (orgDR > 0) {
			// 获取对应控制字段
			if (iDataEntityRuntime.getOrgIdPSDEField() == null) {
				// 未指定组织字段
				log.warn(String.format("实体[%s]未指定权限[组织]字段", iDataEntityRuntime.getName()));
				// SearchCustomCond customCond = new SearchCustomCond();
				// customCond.setCustomCond(ISearchCustomCond.FALSE);
				// searchConds.add(customCond);
			} else {
				// 当前机构
				if ((DataRanges.ORG_CURRENT & orgDR) > 0) {
					SearchFieldCond searchFieldCond = new SearchFieldCond();
					searchFieldCond.setFieldName(iDataEntityRuntime.getOrgIdPSDEField().getName());
					searchFieldCond.setCondOp(Conditions.EQ);
					searchFieldCond.setValue(iEmployeeContext.getOrgid());
					searchConds.add(searchFieldCond);
				}

				// 上级机构
				if ((DataRanges.ORG_PARENT & orgDR) > 0) {
					if (StringUtils.hasLength(iEmployeeContext.getPorg())) {
						SearchFieldCond searchFieldCond = new SearchFieldCond();
						searchFieldCond.setFieldName(iDataEntityRuntime.getOrgIdPSDEField().getName());
						searchFieldCond.setCondOp(Conditions.IN);
						searchFieldCond.setValue(String.format("'%s'", String.join("','", iEmployeeContext.getPorg().split(","))));
						searchFieldCond.setParamMode(false);
						searchConds.add(searchFieldCond);
					}
				}

				// 下级机构
				if ((DataRanges.ORG_CHILD & orgDR) > 0) {
					if (StringUtils.hasLength(iEmployeeContext.getSorg())) {
						SearchFieldCond searchFieldCond = new SearchFieldCond();
						searchFieldCond.setFieldName(iDataEntityRuntime.getOrgIdPSDEField().getName());
						searchFieldCond.setCondOp(Conditions.IN);
						searchFieldCond.setValue(String.format("'%s'", String.join("','", iEmployeeContext.getSorg().split(","))));
						searchFieldCond.setParamMode(false);
						searchConds.add(searchFieldCond);
					}
				}

				// 无值
				if ((DataRanges.ORG_NULL & orgDR) > 0) {
					SearchFieldCond searchFieldCond = new SearchFieldCond();
					searchFieldCond.setFieldName(iDataEntityRuntime.getOrgIdPSDEField().getName());
					searchFieldCond.setCondOp(Conditions.ISNULL);
					searchConds.add(searchFieldCond);
				}
			}
		}
		return searchConds;
	}

}
