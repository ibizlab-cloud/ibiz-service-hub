package net.ibizsys.central.plugin.mybatisplus.spring.rt.dataentity.security.dr;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.security.dr.DataEntityDRProviderBase;
import net.ibizsys.central.dataentity.security.dr.IDataEntityDRProvider;
import net.ibizsys.central.plugin.mybatisplus.util.MybatisSqlUtil;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ISearchCond;

@Component
public class MybatisDbCustomerDRProvider extends DataEntityDRProviderBase {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityDRProviderBase.class);
	
	
	@PostConstruct
	protected void postConstruct() {
		RuntimeObjectFactory.getInstance().registerObject(IDataEntityDRProvider.class, "CUSTOM", this);
	}
	
    @Override
    public boolean support(IPSDEUserRole iPSDEUserRole) {
        if (StringUtils.hasLength(iPSDEUserRole.getCustomCond())) {
            return true;
        }
        return false;
    }

    @Override
    public List<ISearchCond> getDRSearchConds(IDataEntityRuntime iDataEntityRuntime, IPSDEUserRole iPSDEUserRole, String action) {
        List<ISearchCond> searchConds = new ArrayList<>();
        ISearchCond cond = MybatisSqlUtil.parsePredefinedCond(iDataEntityRuntime, iPSDEUserRole.getCustomCond());
        searchConds.add(cond);
        return searchConds;
    }
}
