package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSSysBICubeLevel;
import net.ibizsys.psmodel.core.filter.PSSysBICubeLevelFilter;
import net.ibizsys.psmodel.core.service.IPSSysBICubeLevelService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;

public class PSSysBICubeLevelRTService extends PSModelRTServiceBase<PSSysBICubeLevel, PSSysBICubeLevelFilter> implements IPSSysBICubeLevelService {
	private static final Log log = LogFactory.getLog(PSSysBICubeLevelRTService.class);

	@Override
	public PSSysBICubeLevel createDomain() {
		return new PSSysBICubeLevel();
	}

	@Override
	public PSSysBICubeLevelFilter createFilter() {
		return new PSSysBICubeLevelFilter();
	}

	@Override
	public PSSysBICubeLevel getDomain(Object params) {
		if (params instanceof PSSysBICubeLevel) {
			return (PSSysBICubeLevel) params;
		}
		return getMapper().convertValue(params, PSSysBICubeLevel.class);
	}

	@Override
	public PSSysBICubeLevelFilter getFilter(Object params) {
		if (params instanceof PSSysBICubeLevelFilter) {
			return (PSSysBICubeLevelFilter) params;
		}
		return getMapper().convertValue(params, PSSysBICubeLevelFilter.class);
	}

	@Override
	public String getModelName(boolean single) {
		if (single) {
			return "PSSYSBICUBELEVEL";
		} else {
			return "PSSYSBICUBELEVELS";
		}
	}
	
	
   	
}
