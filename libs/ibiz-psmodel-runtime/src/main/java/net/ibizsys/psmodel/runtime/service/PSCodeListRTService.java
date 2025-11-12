package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.psmodel.core.domain.PSCodeList;
import net.ibizsys.psmodel.core.filter.PSCodeListFilter;
import net.ibizsys.psmodel.core.service.IPSCodeListService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSCodeListRTService extends PSModelRTServiceBase<PSCodeList, PSCodeListFilter> implements IPSCodeListService{
    private static final Log log = LogFactory.getLog(PSCodeListRTService.class);

    @Override
    public PSCodeList createDomain(){
        return new PSCodeList();
    }

    @Override
    public PSCodeListFilter createFilter(){
        return new PSCodeListFilter();
	}

	@Override
	public PSCodeList getDomain(Object params) {
		if(params instanceof PSCodeList) {
			return (PSCodeList)params;
		}
		return getMapper().convertValue(params, PSCodeList.class);
	}

	@Override
	public PSCodeListFilter getFilter(Object params) {
		if(params instanceof PSCodeListFilter) {
			return (PSCodeListFilter)params;
		}
		return getMapper().convertValue(params, PSCodeListFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSCODELIST";
        }
        else{
            return "PSCODELISTS";
        }
	}
    

    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSCodeList.class;
    }
    
    @Override
    protected List<? extends IPSCodeList> getPSModelObjectList(PSCodeListFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSCodeLists();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSCodeList.class, this.getPSSystemService().getPSSystem().getAllPSCodeLists(), (String)key, tryMode);
    }
}
