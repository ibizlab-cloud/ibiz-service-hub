package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.psmodel.core.domain.PSSysUtil;
import net.ibizsys.psmodel.core.filter.PSSysUtilFilter;
import net.ibizsys.psmodel.core.service.IPSSysUtilService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysUtilRTService extends PSModelRTServiceBase<PSSysUtil, PSSysUtilFilter> implements IPSSysUtilService{
    private static final Log log = LogFactory.getLog(PSSysUtilRTService.class);

    @Override
    public PSSysUtil createDomain(){
        return new PSSysUtil();
    }

    @Override
    public PSSysUtilFilter createFilter(){
        return new PSSysUtilFilter();
	}

	@Override
	public PSSysUtil getDomain(Object params) {
		if(params instanceof PSSysUtil) {
			return (PSSysUtil)params;
		}
		return getMapper().convertValue(params, PSSysUtil.class);
	}

	@Override
	public PSSysUtilFilter getFilter(Object params) {
		if(params instanceof PSSysUtilFilter) {
			return (PSSysUtilFilter)params;
		}
		return getMapper().convertValue(params, PSSysUtilFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSUTIL";
        }
        else{
            return "PSSYSUTILS";
        }
	}

    @Override
    protected String getOriginModelName() {
        return "PSSYSUTILDE";
    }
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysUtil.class;
    }
    
    @Override
    protected List<? extends IPSSysUtil> getPSModelObjectList(PSSysUtilFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysUtils();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysUtil.class, this.getPSSystemService().getPSSystem().getAllPSSysUtils(), (String)key, false);
    }
}
