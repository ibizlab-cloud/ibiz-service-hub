package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.psmodel.core.domain.PSDER;
import net.ibizsys.psmodel.core.filter.PSDERFilter;
import net.ibizsys.psmodel.core.service.IPSDERService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDERRTService extends PSModelRTServiceBase<PSDER, PSDERFilter> implements IPSDERService{
    private static final Log log = LogFactory.getLog(PSDERRTService.class);

    @Override
    public PSDER createDomain(){
        return new PSDER();
    }

    @Override
    public PSDERFilter createFilter(){
        return new PSDERFilter();
	}

	@Override
	public PSDER getDomain(Object params) {
		if(params instanceof PSDER) {
			return (PSDER)params;
		}
		return getMapper().convertValue(params, PSDER.class);
	}

	@Override
	public PSDERFilter getFilter(Object params) {
		if(params instanceof PSDERFilter) {
			return (PSDERFilter)params;
		}
		return getMapper().convertValue(params, PSDERFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDER";
        }
        else{
            return "PSDERS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSDERBase.class;
    }
    
    @Override
    protected List<? extends IPSDERBase> getPSModelObjectList(PSDERFilter f) throws Exception {
    	Object objPSDEId = f.getFieldCond(PSDER.FIELD_MINORPSDEID, IPSModelFilter.EQ);
    	if(!ObjectUtils.isEmpty(objPSDEId)) {
    		//objPSDEId = getParentId(f, PSModels.PSDATAENTITY);
    		return getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)objPSDEId, false).getMinorPSDERs();
    	}
    	
    	if(this.getPSSystemService().getPSSystem().getAllPSDataEntities() == null) {
			return null;
		}
		//查询全部
		List<IPSDERBase> allPSDERList = new ArrayList<IPSDERBase>();
		for(IPSDataEntity iPSDataEntity : this.getPSSystemService().getPSSystem().getAllPSDataEntities()) {
			if(iPSDataEntity.getMinorPSDERs() != null) {
				allPSDERList.addAll(iPSDataEntity.getMinorPSDERs());
			}
		}
		
		return allPSDERList;
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSDERBase.class
    			,getPSModelObject(IPSDataEntity.class, this.getPSSystemService().getPSSystem().getAllPSDataEntities(), (String)getParentId(key), false).getMinorPSDERs()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSDER domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
}
