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
import net.ibizsys.psmodel.core.domain.PSSysWFSetting;
import net.ibizsys.psmodel.core.service.IPSSysWFSettingService;
import net.ibizsys.psmodel.core.filter.PSSysWFSettingFilter;


public class PSSysWFSettingRTService extends PSModelRTServiceBase<PSSysWFSetting, PSSysWFSettingFilter> implements IPSSysWFSettingService{
    private static final Log log = LogFactory.getLog(PSSysWFSettingRTService.class);

    @Override
    public PSSysWFSetting createDomain(){
        return new PSSysWFSetting();
    }

    @Override
    public PSSysWFSettingFilter createFilter(){
        return new PSSysWFSettingFilter();
	}

	@Override
	public PSSysWFSetting getDomain(Object params) {
		if(params instanceof PSSysWFSetting) {
			return (PSSysWFSetting)params;
		}
		return getMapper().convertValue(params, PSSysWFSetting.class);
	}

	@Override
	public PSSysWFSettingFilter getFilter(Object params) {
		if(params instanceof PSSysWFSettingFilter) {
			return (PSSysWFSettingFilter)params;
		}
		return getMapper().convertValue(params, PSSysWFSettingFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSWFSETTING";
        }
        else{
            return "PSSYSWFSETTINGS";
        }
	}
}
