package net.ibizsys.psmodel.runtime.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSSystem;
import net.ibizsys.psmodel.core.domain.PSSystem;
import net.ibizsys.psmodel.core.filter.PSSystemFilter;
import net.ibizsys.psmodel.core.service.IPSSystemService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;

public class PSSystemRTService extends PSModelRTServiceBase<PSSystem, PSSystemFilter> implements IPSSystemService {
	private static final Log log = LogFactory.getLog(PSSystemRTService.class);

	@Override
	public PSSystem createDomain() {
		return new PSSystem();
	}

	@Override
	public PSSystemFilter createFilter() {
		return new PSSystemFilter();
	}

	@Override
	public PSSystem getDomain(Object params) {
		if(params instanceof PSSystem) {
			return (PSSystem)params;
		}
		return getMapper().convertValue(params, PSSystem.class);
	}

	@Override
	public PSSystemFilter getFilter(Object params) {
		if(params instanceof PSSystemFilter) {
			return (PSSystemFilter)params;
		}
		return getMapper().convertValue(params, PSSystemFilter.class);
	}

	@Override
	public String getModelName(boolean single) {
		if (single) {
			return "PSSYSTEM";
		} else {
			return "PSSYSTEMS";
		}
	}

	@Override
	public PSSystem get(String key, boolean tryMode) throws Exception {
		PSSystem psSystem = new PSSystem();
		
		getPSModelRTServiceSession().getPSModelTranspiler(IPSSystem.class, false).decompile(this.getPSModelRTServiceSession(), this.getPSSystemService().getPSSystem(), psSystem, true);
		return psSystem;
	}
}
