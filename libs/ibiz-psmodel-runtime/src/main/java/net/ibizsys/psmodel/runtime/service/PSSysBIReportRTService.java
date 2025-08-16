package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBIReport;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.domain.PSSysBIReport;
import net.ibizsys.psmodel.core.filter.PSSysBIReportFilter;
import net.ibizsys.psmodel.core.service.IPSSysBIReportService;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBIReportRTService extends PSModelRTServiceBase<PSSysBIReport, PSSysBIReportFilter> implements IPSSysBIReportService{
    private static final Log log = LogFactory.getLog(PSSysBIReportRTService.class);

    @Override
    public PSSysBIReport createDomain(){
        return new PSSysBIReport();
    }

    @Override
    public PSSysBIReportFilter createFilter(){
        return new PSSysBIReportFilter();
    }
    

	@Override
	public PSSysBIReport getDomain(Object params) {
		if (params instanceof PSSysBIReport) {
			return (PSSysBIReport) params;
		}
		return getMapper().convertValue(params, PSSysBIReport.class);
	}

	@Override
	public PSSysBIReportFilter getFilter(Object params) {
		if (params instanceof PSSysBIReportFilter) {
			return (PSSysBIReportFilter) params;
		}
		return getMapper().convertValue(params, PSSysBIReportFilter.class);
	}
	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBIREPORT";
        }
        else{
            return "PSSYSBIREPORTS";
        }
	}
    
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSSysBIReport.class;
    }
    
    @Override
    protected List<? extends IPSSysBIReport> getPSModelObjectList(PSSysBIReportFilter f) throws Exception {
    	Object objPSSysBISchemeId = f.getFieldCond(PSSysBIReport.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
    	}
    	
    	if(ObjectUtils.isEmpty(objPSSysBISchemeId)) {
    		if(this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
    			return null;
    		}
    		//查询全部
    		List<IPSSysBIReport> allPSSysBIReportList = new ArrayList<IPSSysBIReport>();
    		for(IPSSysBIScheme iPSSysBIScheme : this.getPSSystemService().getPSSystem().getAllPSSysBISchemes()) {
    			if(iPSSysBIScheme.getAllPSSysBIReports() != null) {
    				allPSSysBIReportList.addAll(iPSSysBIScheme.getAllPSSysBIReports());
    			}
    		}
    		return allPSSysBIReportList;
    	}
    	return getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)objPSSysBISchemeId, false).getAllPSSysBIReports();
    }
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSSysBIReport.class
    			,getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), (String)getParentId(key), false).getAllPSSysBIReports()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSSysBIReport domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBISCHEME, getParentId(domain.getId()));
    	domain.setPSSysBISchemeId(parentPSModel.getId());
    	domain.setPSSysBISchemeName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    @Override
    protected void onBeforeCreate(PSSysBIReport m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSSysBICubeId())) {
			throw new Exception("未传入智能立方体标识");
		}
		
		PSSysBICube psSysBICube = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, m.getPSSysBICubeId());
		
		String strCodeName = m.getCodeName();
		if(!StringUtils.hasLength(strCodeName)) {
			strCodeName = String.format("uxreport%1$s", this.getRandom().nextInt(9999999));
		}
		else
			if(strCodeName.indexOf("ux") == -1) {
				strCodeName = String.format("ux%1$s", strCodeName);
			}
		
		String strReportId = String.format("%1$s.%2$s", m.getPSSysBISchemeId(), strCodeName.toLowerCase());
		
		m.setPSSysBIReportId(strReportId);
		m.setCodeName(strCodeName.toLowerCase());
		m.setPSSysBICubeName(psSysBICube.getPSSysBICubeName());
		
		
    	super.onBeforeCreate(m);
    }
}
