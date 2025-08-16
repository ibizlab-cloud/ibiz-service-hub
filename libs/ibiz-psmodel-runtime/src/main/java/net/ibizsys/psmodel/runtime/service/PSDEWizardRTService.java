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
import net.ibizsys.psmodel.core.domain.PSDEWizard;
import net.ibizsys.psmodel.core.service.IPSDEWizardService;
import net.ibizsys.psmodel.core.filter.PSDEWizardFilter;


public class PSDEWizardRTService extends PSModelRTServiceBase<PSDEWizard, PSDEWizardFilter> implements IPSDEWizardService{
    private static final Log log = LogFactory.getLog(PSDEWizardRTService.class);

    @Override
    public PSDEWizard createDomain(){
        return new PSDEWizard();
    }

    @Override
    public PSDEWizardFilter createFilter(){
        return new PSDEWizardFilter();
	}

	@Override
	public PSDEWizard getDomain(Object params) {
		if(params instanceof PSDEWizard) {
			return (PSDEWizard)params;
		}
		return getMapper().convertValue(params, PSDEWizard.class);
	}

	@Override
	public PSDEWizardFilter getFilter(Object params) {
		if(params instanceof PSDEWizardFilter) {
			return (PSDEWizardFilter)params;
		}
		return getMapper().convertValue(params, PSDEWizardFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEWIZARD";
        }
        else{
            return "PSDEWIZARDS";
        }
	}
}
