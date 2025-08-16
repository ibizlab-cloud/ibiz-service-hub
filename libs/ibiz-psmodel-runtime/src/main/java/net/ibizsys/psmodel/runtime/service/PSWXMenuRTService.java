package net.ibizsys.psmodel.runtime.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;
import net.ibizsys.psmodel.core.domain.PSWXMenu;
import net.ibizsys.psmodel.core.service.IPSWXMenuService;
import net.ibizsys.psmodel.core.filter.PSWXMenuFilter;


public class PSWXMenuRTService extends PSModelRTServiceBase<PSWXMenu, PSWXMenuFilter> implements IPSWXMenuService{
    private static final Log log = LogFactory.getLog(PSWXMenuRTService.class);

    @Override
    public PSWXMenu createDomain(){
        return new PSWXMenu();
    }

    @Override
    public PSWXMenuFilter createFilter(){
        return new PSWXMenuFilter();
	}

	@Override
	public PSWXMenu getDomain(Object params) {
		if(params instanceof PSWXMenu) {
			return (PSWXMenu)params;
		}
		return getMapper().convertValue(params, PSWXMenu.class);
	}

	@Override
	public PSWXMenuFilter getFilter(Object params) {
		if(params instanceof PSWXMenuFilter) {
			return (PSWXMenuFilter)params;
		}
		return getMapper().convertValue(params, PSWXMenuFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWXMENU";
        }
        else{
            return "PSWXMENUS";
        }
	}
}
