package net.ibizsys.central.dataentity.security.dr;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.util.ISearchCond;

import java.util.Collection;
import java.util.List;

/**
 * 实体数据范围提供器对象
 * @author lionlau
 *
 */
public interface IDataEntityDRProvider {

    /**
     * 支持权限范围
     *
     * @param iPSDEUserRole
     * @return
     */
    boolean support(IPSDEUserRole iPSDEUserRole);

    /**
     * 支持权限合并处理
     *
     * @return
     */
    boolean isSupportMerge();

    /**
     * 数据范围
     *
     * @param mergePSDEUserRole
     * @param psDEUserRoles
     * @return
     */

    IPSDEUserRole merge(IPSDEUserRole mergePSDEUserRole, Collection<IPSDEUserRole> psDEUserRoles);

    /**
     * 权限范围
     *
     * @param iDataEntityRuntime
     * @param iPSDEUserRole
     * @param action
     * @return
     */
    List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action);

    /**
     * 权限范围
     *
     * @param iDataEntityRuntime
     * @param psDEUserRoles
     * @param action
     * @return
     */
    List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, Collection<IPSDEUserRole> psDEUserRoles, String action);

}
