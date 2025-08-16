package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dynamodel.IPSSysDynaModel;
import net.ibizsys.psmodel.core.domain.PSSysDynaModel;
import net.ibizsys.psmodel.core.filter.PSSysDynaModelFilter;
import net.ibizsys.psmodel.core.service.IPSSysDynaModelService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysDynaModelRTService extends PSModelRTServiceBase<PSSysDynaModel, PSSysDynaModelFilter> implements IPSSysDynaModelService{
    private static final Log log = LogFactory.getLog(PSSysDynaModelRTService.class);

    @Override
    public PSSysDynaModel createDomain(){
        return new PSSysDynaModel();
    }

    @Override
    public PSSysDynaModelFilter createFilter(){
        return new PSSysDynaModelFilter();
	}

	@Override
	public PSSysDynaModel getDomain(Object params) {
		if(params instanceof PSSysDynaModel) {
			return (PSSysDynaModel)params;
		}
		return getMapper().convertValue(params, PSSysDynaModel.class);
	}

	@Override
	public PSSysDynaModelFilter getFilter(Object params) {
		if(params instanceof PSSysDynaModelFilter) {
			return (PSSysDynaModelFilter)params;
		}
		return getMapper().convertValue(params, PSSysDynaModelFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDYNAMODEL";
        }
        else{
            return "PSSYSDYNAMODELS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysDynaModel.class;
    }
    
    @Override
    protected List<? extends IPSSysDynaModel> getPSModelObjectList(PSSysDynaModelFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysDynaModels();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysDynaModel.class, this.getPSSystemService().getPSSystem().getAllPSSysDynaModels(), (String)key, false);
    }
}
