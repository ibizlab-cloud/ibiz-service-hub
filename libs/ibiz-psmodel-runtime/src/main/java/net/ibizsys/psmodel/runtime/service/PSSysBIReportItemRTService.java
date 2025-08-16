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
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.psmodel.core.domain.PSSysBIReportItem;
import net.ibizsys.psmodel.core.domain.PSSysDBColumn;
import net.ibizsys.psmodel.core.domain.PSSysDBTable;
import net.ibizsys.psmodel.core.filter.PSSysDBColumnFilter;


public class PSSysBIReportItemRTService extends PSModelRTServiceBase<PSSysBIReportItem, PSModelFilter>{
    private static final Log log = LogFactory.getLog(PSSysBIReportItemRTService.class);

    @Override
    public PSSysBIReportItem createDomain(){
        return new PSSysBIReportItem();
    }

    @Override
    public PSModelFilter createFilter(){
        return new PSModelFilter();
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIREPORTITEM";
        }
        else{
            return "PSSYSBIREPORTITEMS";
        }
	}
    
   
}
