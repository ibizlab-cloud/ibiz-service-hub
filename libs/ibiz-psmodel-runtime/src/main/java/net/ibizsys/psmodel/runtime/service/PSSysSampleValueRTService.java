package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysSampleValue;
import net.ibizsys.psmodel.core.domain.PSSysSampleValue;
import net.ibizsys.psmodel.core.filter.PSSysSampleValueFilter;
import net.ibizsys.psmodel.core.service.IPSSysSampleValueService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysSampleValueRTService extends PSModelRTServiceBase<PSSysSampleValue, PSSysSampleValueFilter> implements IPSSysSampleValueService{
    private static final Log log = LogFactory.getLog(PSSysSampleValueRTService.class);

    @Override
    public PSSysSampleValue createDomain(){
        return new PSSysSampleValue();
    }

    @Override
    public PSSysSampleValueFilter createFilter(){
        return new PSSysSampleValueFilter();
	}

	@Override
	public PSSysSampleValue getDomain(Object params) {
		if(params instanceof PSSysSampleValue) {
			return (PSSysSampleValue)params;
		}
		return getMapper().convertValue(params, PSSysSampleValue.class);
	}

	@Override
	public PSSysSampleValueFilter getFilter(Object params) {
		if(params instanceof PSSysSampleValueFilter) {
			return (PSSysSampleValueFilter)params;
		}
		return getMapper().convertValue(params, PSSysSampleValueFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSAMPLEVALUE";
        }
        else{
            return "PSSYSSAMPLEVALUES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysSampleValue.class;
    }
    
    @Override
    protected List<? extends IPSSysSampleValue> getPSModelObjectList(PSSysSampleValueFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysSampleValues();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysSampleValue.class, this.getPSSystemService().getPSSystem().getAllPSSysSampleValues(), (String)key, false);
    }
}
