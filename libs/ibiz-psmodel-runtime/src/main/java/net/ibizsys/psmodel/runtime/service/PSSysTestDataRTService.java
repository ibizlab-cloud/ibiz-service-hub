package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.psmodel.core.domain.PSSysTestData;
import net.ibizsys.psmodel.core.filter.PSSysTestDataFilter;
import net.ibizsys.psmodel.core.service.IPSSysTestDataService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysTestDataRTService extends PSModelRTServiceBase<PSSysTestData, PSSysTestDataFilter> implements IPSSysTestDataService{
    private static final Log log = LogFactory.getLog(PSSysTestDataRTService.class);

    @Override
    public PSSysTestData createDomain(){
        return new PSSysTestData();
    }

    @Override
    public PSSysTestDataFilter createFilter(){
        return new PSSysTestDataFilter();
	}

	@Override
	public PSSysTestData getDomain(Object params) {
		if(params instanceof PSSysTestData) {
			return (PSSysTestData)params;
		}
		return getMapper().convertValue(params, PSSysTestData.class);
	}

	@Override
	public PSSysTestDataFilter getFilter(Object params) {
		if(params instanceof PSSysTestDataFilter) {
			return (PSSysTestDataFilter)params;
		}
		return getMapper().convertValue(params, PSSysTestDataFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSTESTDATA";
        }
        else{
            return "PSSYSTESTDATA";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysTestData.class;
    }
    
    @Override
    protected List<? extends IPSSysTestData> getPSModelObjectList(PSSysTestDataFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysTestDatas();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysTestData.class, this.getPSSystemService().getPSSystem().getAllPSSysTestDatas(), (String)key, tryMode);
    }
}
