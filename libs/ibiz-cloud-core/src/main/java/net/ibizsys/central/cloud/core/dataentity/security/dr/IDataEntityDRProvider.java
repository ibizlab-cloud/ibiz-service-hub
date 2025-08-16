package net.ibizsys.central.cloud.core.dataentity.security.dr;

import java.util.Collection;
import java.util.List;

import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEDataRange;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.util.ISearchCond;

public interface IDataEntityDRProvider extends net.ibizsys.central.dataentity.security.dr.IDataEntityDRProvider {

	 /**
     * 支持权限范围
     *
     * @param iPSDEDataRange
     * @return
     */
    boolean support(IPSDEDataRange iPSDEDataRange);

    
    /**
     * 获取数据范围相关的查询条件
     * @param iEmployeeContext 用户上下文
     * @param iDataEntityRuntime
     * @param iPSDEDataRange
     * @return
     */
    List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataRange iPSDEDataRange);
    
    
    /**
     * 权限范围
     * iEmployeeContext 用户上下文
     * @param iDataEntityRuntime
     * @param iPSDEUserRole
     * @param action
     * @return
     */
    List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action);

    /**
     * 权限范围
     *  iEmployeeContext 用户上下文
     * @param iDataEntityRuntime
     * @param psDEUserRoles
     * @param action
     * @return
     */
    List<ISearchCond> getDRSearchConds(IEmployeeContext iEmployeeContext, IDataEntityRuntime iDataEntityRuntime, Collection<IPSDEUserRole> psDEUserRoles, String action);
}
