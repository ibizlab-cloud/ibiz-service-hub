package net.ibizsys.psmodel.runtime.service;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModelFilter;
import net.ibizsys.psmodel.core.util.IPSModelService;
import net.ibizsys.psmodel.core.util.PSModelServiceFactory;
import net.ibizsys.psmodel.core.util.PSModelServiceSession;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;
import net.ibizsys.psmodel.core.domain.PSSysCanvas;
import net.ibizsys.psmodel.core.service.IPSSysCanvasService;
import net.ibizsys.psmodel.core.filter.PSSysCanvasFilter;


public class PSSysCanvasRTService extends PSModelRTServiceBase<PSSysCanvas, PSSysCanvasFilter> implements IPSSysCanvasService{
    private static final Log log = LogFactory.getLog(PSSysCanvasRTService.class);

    @Override
    public PSSysCanvas createDomain(){
        return new PSSysCanvas();
    }

    @Override
    public PSSysCanvasFilter createFilter(){
        return new PSSysCanvasFilter();
	}

	@Override
	public PSSysCanvas getDomain(Object params) {
		if(params instanceof PSSysCanvas) {
			return (PSSysCanvas)params;
		}
		return getMapper().convertValue(params, PSSysCanvas.class);
	}

	@Override
	public PSSysCanvasFilter getFilter(Object params) {
		if(params instanceof PSSysCanvasFilter) {
			return (PSSysCanvasFilter)params;
		}
		return getMapper().convertValue(params, PSSysCanvasFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSCANVAS";
        }
        else{
            return "PSSYSCANVAS";
        }
	}
}
