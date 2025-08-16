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
import net.ibizsys.psmodel.core.domain.PSSysSFPubPkg;
import net.ibizsys.psmodel.core.service.IPSSysSFPubPkgService;
import net.ibizsys.psmodel.core.filter.PSSysSFPubPkgFilter;


public class PSSysSFPubPkgRTService extends PSModelRTServiceBase<PSSysSFPubPkg, PSSysSFPubPkgFilter> implements IPSSysSFPubPkgService{
    private static final Log log = LogFactory.getLog(PSSysSFPubPkgRTService.class);

    @Override
    public PSSysSFPubPkg createDomain(){
        return new PSSysSFPubPkg();
    }

    @Override
    public PSSysSFPubPkgFilter createFilter(){
        return new PSSysSFPubPkgFilter();
	}

	@Override
	public PSSysSFPubPkg getDomain(Object params) {
		if(params instanceof PSSysSFPubPkg) {
			return (PSSysSFPubPkg)params;
		}
		return getMapper().convertValue(params, PSSysSFPubPkg.class);
	}

	@Override
	public PSSysSFPubPkgFilter getFilter(Object params) {
		if(params instanceof PSSysSFPubPkgFilter) {
			return (PSSysSFPubPkgFilter)params;
		}
		return getMapper().convertValue(params, PSSysSFPubPkgFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSFPUBPKG";
        }
        else{
            return "PSSYSSFPUBPKGS";
        }
	}
}
