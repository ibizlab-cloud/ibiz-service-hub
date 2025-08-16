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
import net.ibizsys.psmodel.core.domain.PSSysModelFolderItem;
import net.ibizsys.psmodel.core.service.IPSSysModelFolderItemService;
import net.ibizsys.psmodel.core.filter.PSSysModelFolderItemFilter;


public class PSSysModelFolderItemRTService extends PSModelRTServiceBase<PSSysModelFolderItem, PSSysModelFolderItemFilter> implements IPSSysModelFolderItemService{
    private static final Log log = LogFactory.getLog(PSSysModelFolderItemRTService.class);

    @Override
    public PSSysModelFolderItem createDomain(){
        return new PSSysModelFolderItem();
    }

    @Override
    public PSSysModelFolderItemFilter createFilter(){
        return new PSSysModelFolderItemFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSMODELFOLDERITEM";
        }
        else{
            return "PSSYSMODELFOLDERITEMS";
        }
	}
}
