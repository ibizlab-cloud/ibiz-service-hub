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
import net.ibizsys.psmodel.core.domain.PSSysModelFolder;
import net.ibizsys.psmodel.core.service.IPSSysModelFolderService;
import net.ibizsys.psmodel.core.filter.PSSysModelFolderFilter;


public class PSSysModelFolderRTService extends PSModelRTServiceBase<PSSysModelFolder, PSSysModelFolderFilter> implements IPSSysModelFolderService{
    private static final Log log = LogFactory.getLog(PSSysModelFolderRTService.class);

    @Override
    public PSSysModelFolder createDomain(){
        return new PSSysModelFolder();
    }

    @Override
    public PSSysModelFolderFilter createFilter(){
        return new PSSysModelFolderFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMODELFOLDER";
        }
        else{
            return "PSSYSMODELFOLDERS";
        }
	}
}
