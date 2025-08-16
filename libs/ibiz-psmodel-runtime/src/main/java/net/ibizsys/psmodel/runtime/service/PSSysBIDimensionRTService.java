package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBIDimension;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBIDimension;
import net.ibizsys.psmodel.core.filter.PSSysBIDimensionFilter;
import net.ibizsys.psmodel.core.service.IPSSysBIDimensionService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBIDimensionRTService extends PSModelRTServiceBase<PSSysBIDimension, PSSysBIDimensionFilter> implements IPSSysBIDimensionService{
    private static final Log log = LogFactory.getLog(PSSysBIDimensionRTService.class);

    @Override
    public PSSysBIDimension createDomain(){
        return new PSSysBIDimension();
    }

    @Override
    public PSSysBIDimensionFilter createFilter(){
        return new PSSysBIDimensionFilter();
	}

	@Override
	public PSSysBIDimension getDomain(Object params) {
		if(params instanceof PSSysBIDimension) {
			return (PSSysBIDimension)params;
		}
		return getMapper().convertValue(params, PSSysBIDimension.class);
	}

	@Override
	public PSSysBIDimensionFilter getFilter(Object params) {
		if(params instanceof PSSysBIDimensionFilter) {
			return (PSSysBIDimensionFilter)params;
		}
		return getMapper().convertValue(params, PSSysBIDimensionFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIDIMENSION";
        }
        else{
            return "PSSYSBIDIMENSIONS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBIDimension.class;
    }
    
    @Override
    protected List<? extends IPSSysBIDimension> getPSModelObjectList(PSSysBIDimensionFilter f) throws Exception {
    	Object objPSSysBISchemeId = f.getFieldCond(PSSysBIDimension.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysBIDimension> allPSSysBIDimensionList = new ArrayList<IPSSysBIDimension>();
    		for(IPSSysBIScheme iPSSysBIScheme : this.getPSSystemService().getPSSystem().getAllPSSysBISchemes()) {
    			if(iPSSysBIScheme.getAllPSSysBIDimensions() != null) {
    				allPSSysBIDimensionList.addAll(iPSSysBIScheme.getAllPSSysBIDimensions());
    			}
    		}
    		return allPSSysBIDimensionList;
    	}
    	return getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)objPSSysBISchemeId, false).getAllPSSysBIDimensions();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBIDimension.class
    			,getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)getParentId(key), false).getAllPSSysBIDimensions()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysBIDimension domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBISCHEME, getParentId(domain.getId()));
    	domain.setPSSysBISchemeId(parentPSModel.getId());
    	domain.setPSSysBISchemeName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
