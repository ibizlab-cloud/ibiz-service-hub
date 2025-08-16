package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.filter.PSSysBICubeFilter;
import net.ibizsys.psmodel.core.service.IPSSysBICubeService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBICubeRTService extends PSModelRTServiceBase<PSSysBICube, PSSysBICubeFilter> implements IPSSysBICubeService{
    private static final Log log = LogFactory.getLog(PSSysBICubeRTService.class);

    @Override
    public PSSysBICube createDomain(){
        return new PSSysBICube();
    }

    @Override
    public PSSysBICubeFilter createFilter(){
        return new PSSysBICubeFilter();
	}

	@Override
	public PSSysBICube getDomain(Object params) {
		if(params instanceof PSSysBICube) {
			return (PSSysBICube)params;
		}
		return getMapper().convertValue(params, PSSysBICube.class);
	}

	@Override
	public PSSysBICubeFilter getFilter(Object params) {
		if(params instanceof PSSysBICubeFilter) {
			return (PSSysBICubeFilter)params;
		}
		return getMapper().convertValue(params, PSSysBICubeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBICUBE";
        }
        else{
            return "PSSYSBICUBES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBICube.class;
    }
    
    @Override
    protected List<? extends IPSSysBICube> getPSModelObjectList(PSSysBICubeFilter f) throws Exception {
    	Object objPSSysBISchemeId = f.getFieldCond(PSSysBICube.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysBICube> allPSSysBICubeList = new ArrayList<IPSSysBICube>();
    		for(IPSSysBIScheme iPSSysBIScheme : this.getPSSystemService().getPSSystem().getAllPSSysBISchemes()) {
    			if(iPSSysBIScheme.getAllPSSysBICubes() != null) {
    				allPSSysBICubeList.addAll(iPSSysBIScheme.getAllPSSysBICubes());
    			}
    		}
    		return allPSSysBICubeList;
    	}
    	return getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)objPSSysBISchemeId, false).getAllPSSysBICubes();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBICube.class
    			,getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)getParentId(key), false).getAllPSSysBICubes()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysBICube domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBISCHEME, getParentId(domain.getId()));
    	domain.setPSSysBISchemeId(parentPSModel.getId());
    	domain.setPSSysBISchemeName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
