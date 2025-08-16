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
import net.ibizsys.psmodel.core.domain.PSSysImage;
import net.ibizsys.psmodel.core.service.IPSSysImageService;
import net.ibizsys.psmodel.core.filter.PSSysImageFilter;


public class PSSysImageRTService extends PSModelRTServiceBase<PSSysImage, PSSysImageFilter> implements IPSSysImageService{
    private static final Log log = LogFactory.getLog(PSSysImageRTService.class);

    @Override
    public PSSysImage createDomain(){
        return new PSSysImage();
    }

    @Override
    public PSSysImageFilter createFilter(){
        return new PSSysImageFilter();
	}

	@Override
	public PSSysImage getDomain(Object params) {
		if(params instanceof PSSysImage) {
			return (PSSysImage)params;
		}
		return getMapper().convertValue(params, PSSysImage.class);
	}

	@Override
	public PSSysImageFilter getFilter(Object params) {
		if(params instanceof PSSysImageFilter) {
			return (PSSysImageFilter)params;
		}
		return getMapper().convertValue(params, PSSysImageFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSIMAGE";
        }
        else{
            return "PSSYSIMAGES";
        }
	}
}
