package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.psmodel.core.domain.PSAppStoryBoard;
import net.ibizsys.psmodel.core.filter.PSAppStoryBoardFilter;
import net.ibizsys.psmodel.core.service.IPSAppStoryBoardService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSAppStoryBoardRTService extends PSModelRTServiceBase<PSAppStoryBoard, PSAppStoryBoardFilter> implements IPSAppStoryBoardService{
    private static final Log log = LogFactory.getLog(PSAppStoryBoardRTService.class);

    @Override
    public PSAppStoryBoard createDomain(){
        return new PSAppStoryBoard();
    }

    @Override
    public PSAppStoryBoardFilter createFilter(){
        return new PSAppStoryBoardFilter();
	}

	@Override
	public PSAppStoryBoard getDomain(Object params) {
		if(params instanceof PSAppStoryBoard) {
			return (PSAppStoryBoard)params;
		}
		return getMapper().convertValue(params, PSAppStoryBoard.class);
	}

	@Override
	public PSAppStoryBoardFilter getFilter(Object params) {
		if(params instanceof PSAppStoryBoardFilter) {
			return (PSAppStoryBoardFilter)params;
		}
		return getMapper().convertValue(params, PSAppStoryBoardFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSAPPSTORYBOARD";
        }
        else{
            return "PSAPPSTORYBOARDS";
        }
	}
    
    
   
    
    @Override
    protected List<? extends IPSModelObject> getPSModelObjectList(PSAppStoryBoardFilter f) throws Exception {
    	return null;
    }
    
    
   
}
