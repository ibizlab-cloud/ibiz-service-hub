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
import net.ibizsys.psmodel.core.domain.PSSysCalendar;
import net.ibizsys.psmodel.core.service.IPSSysCalendarService;
import net.ibizsys.psmodel.core.filter.PSSysCalendarFilter;


public class PSSysCalendarRTService extends PSModelRTServiceBase<PSSysCalendar, PSSysCalendarFilter> implements IPSSysCalendarService{
    private static final Log log = LogFactory.getLog(PSSysCalendarRTService.class);

    @Override
    public PSSysCalendar createDomain(){
        return new PSSysCalendar();
    }

    @Override
    public PSSysCalendarFilter createFilter(){
        return new PSSysCalendarFilter();
	}

	@Override
	public PSSysCalendar getDomain(Object params) {
		if(params instanceof PSSysCalendar) {
			return (PSSysCalendar)params;
		}
		return getMapper().convertValue(params, PSSysCalendar.class);
	}

	@Override
	public PSSysCalendarFilter getFilter(Object params) {
		if(params instanceof PSSysCalendarFilter) {
			return (PSSysCalendarFilter)params;
		}
		return getMapper().convertValue(params, PSSysCalendarFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCALENDAR";
        }
        else{
            return "PSSYSCALENDARS";
        }
	}
}
