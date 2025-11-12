package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.pub.IPSSysSFPub;
import net.ibizsys.psmodel.core.domain.PSSysSFPub;
import net.ibizsys.psmodel.core.filter.PSSysSFPubFilter;
import net.ibizsys.psmodel.core.service.IPSSysSFPubService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysSFPubRTService extends PSModelRTServiceBase<PSSysSFPub, PSSysSFPubFilter> implements IPSSysSFPubService{
    private static final Log log = LogFactory.getLog(PSSysSFPubRTService.class);

    @Override
    public PSSysSFPub createDomain(){
        return new PSSysSFPub();
    }

    @Override
    public PSSysSFPubFilter createFilter(){
        return new PSSysSFPubFilter();
	}

	@Override
	public PSSysSFPub getDomain(Object params) {
		if(params instanceof PSSysSFPub) {
			return (PSSysSFPub)params;
		}
		return getMapper().convertValue(params, PSSysSFPub.class);
	}

	@Override
	public PSSysSFPubFilter getFilter(Object params) {
		if(params instanceof PSSysSFPubFilter) {
			return (PSSysSFPubFilter)params;
		}
		return getMapper().convertValue(params, PSSysSFPubFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSFPUB";
        }
        else{
            return "PSSYSSFPUBS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysSFPub.class;
    }
    
    @Override
    protected List<? extends IPSSysSFPub> getPSModelObjectList(PSSysSFPubFilter f) throws Exception {
    	return this.getPSSystemService().getPSSystem().getAllPSSysSFPubs();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysSFPub.class, this.getPSSystemService().getPSSystem().getAllPSSysSFPubs(), (String)key, tryMode);
    }
}
