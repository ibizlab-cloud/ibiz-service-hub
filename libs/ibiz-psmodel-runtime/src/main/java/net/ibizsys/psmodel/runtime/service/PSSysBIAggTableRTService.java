package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBIAggTable;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBIAggTable;
import net.ibizsys.psmodel.core.filter.PSSysBIAggTableFilter;
import net.ibizsys.psmodel.core.service.IPSSysBIAggTableService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBIAggTableRTService extends PSModelRTServiceBase<PSSysBIAggTable, PSSysBIAggTableFilter> implements IPSSysBIAggTableService{
    private static final Log log = LogFactory.getLog(PSSysBIAggTableRTService.class);

    @Override
    public PSSysBIAggTable createDomain(){
        return new PSSysBIAggTable();
    }

    @Override
    public PSSysBIAggTableFilter createFilter(){
        return new PSSysBIAggTableFilter();
	}

	@Override
	public PSSysBIAggTable getDomain(Object params) {
		if(params instanceof PSSysBIAggTable) {
			return (PSSysBIAggTable)params;
		}
		return getMapper().convertValue(params, PSSysBIAggTable.class);
	}

	@Override
	public PSSysBIAggTableFilter getFilter(Object params) {
		if(params instanceof PSSysBIAggTableFilter) {
			return (PSSysBIAggTableFilter)params;
		}
		return getMapper().convertValue(params, PSSysBIAggTableFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIAGGTABLE";
        }
        else{
            return "PSSYSBIAGGTABLES";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBIAggTable.class;
    }
    
    @Override
    protected List<? extends IPSSysBIAggTable> getPSModelObjectList(PSSysBIAggTableFilter f) throws Exception {
    	Object objPSSysBISchemeId = f.getFieldCond(PSSysBIAggTable.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysBIAggTable> allPSSysBIAggTableList = new ArrayList<IPSSysBIAggTable>();
    		for(IPSSysBIScheme iPSSysBIScheme : this.getPSSystemService().getPSSystem().getAllPSSysBISchemes()) {
    			if(iPSSysBIScheme.getAllPSSysBIAggTables() != null) {
    				allPSSysBIAggTableList.addAll(iPSSysBIScheme.getAllPSSysBIAggTables());
    			}
    		}
    		return allPSSysBIAggTableList;
    	}
    	return getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)objPSSysBISchemeId, false).getAllPSSysBIAggTables();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBIAggTable.class
    			,getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)getParentId(key), false).getAllPSSysBIAggTables()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysBIAggTable domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBISCHEME, getParentId(domain.getId()));
    	domain.setPSSysBISchemeId(parentPSModel.getId());
    	domain.setPSSysBISchemeName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
