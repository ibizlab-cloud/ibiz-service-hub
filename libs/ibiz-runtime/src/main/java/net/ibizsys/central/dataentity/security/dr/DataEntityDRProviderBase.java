package net.ibizsys.central.dataentity.security.dr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DataEntityDRProviderBase implements IDataEntityDRProvider {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityDRProviderBase.class);
	
    @Override
    public boolean isSupportMerge() {
        return false;
    }

    @Override
    public IPSDEUserRole merge(IPSDEUserRole mergePSDEUserRole, Collection<IPSDEUserRole> iPSDEUserRoles) {
        return mergePSDEUserRole;
    }

    @Override
    public List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, Collection<IPSDEUserRole> iPSDEUserRoles, String action) {
        if (isSupportMerge()) {
            IPSDEUserRole mergePSDEUserRole = createPSDEUserRole(iDataEntityRuntime);
            merge(mergePSDEUserRole, iPSDEUserRoles);
            return getDRSearchConds(iDataEntityRuntime, mergePSDEUserRole, action);
        } else {
            List<ISearchCond> searchConds = new ArrayList<>();
            iPSDEUserRoles.stream().forEach(
                    iPSDEUserRole -> {
                        if (support(iPSDEUserRole)) {
                            List<ISearchCond> itemSearchConds = getDRSearchConds(iDataEntityRuntime, iPSDEUserRole, action);
                            if (!ObjectUtils.isEmpty(itemSearchConds)) {
                                searchConds.addAll(itemSearchConds);
                            }
                        }
                    }
            );
            return searchConds;
        }
    }

    protected IPSDEUserRole createPSDEUserRole(IDataEntityRuntime iDataEntityRuntime) {
        ObjectNode objNode = JsonUtils.createObjectNode();
        IPSDEUserRole iPSDEUserRole = null;
        try {
            iPSDEUserRole = iDataEntityRuntime.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iDataEntityRuntime.getPSDataEntity(),
                    IPSDEUserRole.class, objNode);
        } catch (Exception ex) {
        	log.error(ex);
        }
        return iPSDEUserRole;
    }
}
