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
import net.ibizsys.psmodel.core.domain.PSSysDictCat;
import net.ibizsys.psmodel.core.service.IPSSysDictCatService;
import net.ibizsys.psmodel.core.filter.PSSysDictCatFilter;


public class PSSysDictCatRTService extends PSModelRTServiceBase<PSSysDictCat, PSSysDictCatFilter> implements IPSSysDictCatService{
    private static final Log log = LogFactory.getLog(PSSysDictCatRTService.class);

    @Override
    public PSSysDictCat createDomain(){
        return new PSSysDictCat();
    }

    @Override
    public PSSysDictCatFilter createFilter(){
        return new PSSysDictCatFilter();
	}

	@Override
	public PSSysDictCat getDomain(Object params) {
		if(params instanceof PSSysDictCat) {
			return (PSSysDictCat)params;
		}
		return getMapper().convertValue(params, PSSysDictCat.class);
	}

	@Override
	public PSSysDictCatFilter getFilter(Object params) {
		if(params instanceof PSSysDictCatFilter) {
			return (PSSysDictCatFilter)params;
		}
		return getMapper().convertValue(params, PSSysDictCatFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDICTCAT";
        }
        else{
            return "PSSYSDICTCATS";
        }
	}
}
