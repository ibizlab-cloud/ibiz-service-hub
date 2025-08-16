package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.psmodel.core.domain.PSSysDBTable;
import net.ibizsys.psmodel.core.filter.PSSysDBTableFilter;
import net.ibizsys.psmodel.core.service.IPSSysDBTableService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysDBTableRTService extends PSModelRTServiceBase<PSSysDBTable, PSSysDBTableFilter> implements IPSSysDBTableService{
    private static final Log log = LogFactory.getLog(PSSysDBTableRTService.class);

    @Override
    public PSSysDBTable createDomain(){
        return new PSSysDBTable();
    }

    @Override
    public PSSysDBTableFilter createFilter(){
        return new PSSysDBTableFilter();
	}

	@Override
	public PSSysDBTable getDomain(Object params) {
		if(params instanceof PSSysDBTable) {
			return (PSSysDBTable)params;
		}
		return getMapper().convertValue(params, PSSysDBTable.class);
	}

	@Override
	public PSSysDBTableFilter getFilter(Object params) {
		if(params instanceof PSSysDBTableFilter) {
			return (PSSysDBTableFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBTableFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBTABLE";
        }
        else{
            return "PSSYSDBTABLES";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysDBTable.class;
    }
    
    @Override
    protected List<? extends IPSSysDBTable> getPSModelObjectList(PSSysDBTableFilter f) throws Exception {
    	Object objPSSysDBSchemeId = f.getFieldCond(PSSysDBTable.FIELD_PSSYSDBSCHEMEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysDBSchemeId)) {
    		objPSSysDBSchemeId = getParentId(f, PSModels.PSSYSDBSCHEME);
    		if(ObjectUtils.isEmpty(objPSSysDBSchemeId)) {
    			throw new Exception(String.format("未指定数据库体系"));
    		}
    	}
    	
    	return getPSModelObject(IPSSysDBScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes(), (String)objPSSysDBSchemeId, false).getAllPSSysDBTables();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysDBTable.class
    			,getPSModelObject(IPSSysDBScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes(), (String)getParentId(key), false).getAllPSSysDBTables()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysDBTable domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSDBSCHEME, getParentId(domain.getId()));
    	domain.setPSSysDBSchemeId(parentPSModel.getId());
    	domain.setPSSysDBSchemeName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
