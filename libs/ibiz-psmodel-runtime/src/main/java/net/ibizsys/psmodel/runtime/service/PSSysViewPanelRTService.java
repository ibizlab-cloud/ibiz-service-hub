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
import net.ibizsys.psmodel.core.domain.PSSysViewPanel;
import net.ibizsys.psmodel.core.service.IPSSysViewPanelService;
import net.ibizsys.psmodel.core.filter.PSSysViewPanelFilter;


public class PSSysViewPanelRTService extends PSModelRTServiceBase<PSSysViewPanel, PSSysViewPanelFilter> implements IPSSysViewPanelService{
    private static final Log log = LogFactory.getLog(PSSysViewPanelRTService.class);

    @Override
    public PSSysViewPanel createDomain(){
        return new PSSysViewPanel();
    }

    @Override
    public PSSysViewPanelFilter createFilter(){
        return new PSSysViewPanelFilter();
	}

	@Override
	public PSSysViewPanel getDomain(Object params) {
		if(params instanceof PSSysViewPanel) {
			return (PSSysViewPanel)params;
		}
		return getMapper().convertValue(params, PSSysViewPanel.class);
	}

	@Override
	public PSSysViewPanelFilter getFilter(Object params) {
		if(params instanceof PSSysViewPanelFilter) {
			return (PSSysViewPanelFilter)params;
		}
		return getMapper().convertValue(params, PSSysViewPanelFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSVIEWPANEL";
        }
        else{
            return "PSSYSVIEWPANELS";
        }
	}
}
