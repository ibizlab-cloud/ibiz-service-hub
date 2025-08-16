package net.ibizsys.psmodel.runtime.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;
import net.ibizsys.psmodel.core.domain.PSWFVersion;
import net.ibizsys.psmodel.core.domain.PSWorkflow;
import net.ibizsys.psmodel.core.filter.PSWFVersionFilter;
import net.ibizsys.psmodel.core.service.IPSWFVersionService;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModel;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSWFVersionRTService extends PSModelRTServiceBase<PSWFVersion, PSWFVersionFilter> implements IPSWFVersionService{
    private static final Log log = LogFactory.getLog(PSWFVersionRTService.class);

    @Override
    public PSWFVersion createDomain(){
        return new PSWFVersion();
    }

    @Override
    public PSWFVersionFilter createFilter(){
        return new PSWFVersionFilter();
	}

	@Override
	public PSWFVersion getDomain(Object params) {
		if(params instanceof PSWFVersion) {
			return (PSWFVersion)params;
		}
		return getMapper().convertValue(params, PSWFVersion.class);
	}

	@Override
	public PSWFVersionFilter getFilter(Object params) {
		if(params instanceof PSWFVersionFilter) {
			return (PSWFVersionFilter)params;
		}
		return getMapper().convertValue(params, PSWFVersionFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSWFVERSION";
        }
        else{
            return "PSWFVERSIONS";
        }
	}
    
    @Override
    protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
    	return IPSWFVersion.class;
    }
    
    @Override
    protected List<? extends IPSWFVersion> getPSModelObjectList(PSWFVersionFilter f) throws Exception {
    	Object objPSWFId = f.getFieldCond(PSWFVersion.FIELD_PSWFID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSWFId)) {
    		objPSWFId = getParentId(f, PSModels.PSWORKFLOW);
    		if(ObjectUtils.isEmpty(objPSWFId)) {
    			throw new Exception("未指定工作流标识");
    		}
    	}
    	return getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)objPSWFId, false).getPSWFVersions();
    }
    
    
    @Override
    protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
    	return getPSModelObject(IPSWFVersion.class
    			,getPSModelObject(IPSWorkflow.class, this.getPSSystemService().getPSSystem().getAllPSWorkflows(), (String)getParentId(key), false).getPSWFVersions()
    			,key, tryMode);
    }
    
    @Override
    protected void doFillDomain(PSWFVersion domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	IPSModel parentPSModel = this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSWORKFLOW, getParentId(domain.getId()));
    	domain.setPSWFId(parentPSModel.getId());
    	domain.setPSWFName(parentPSModel.getName());
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
    
    @Override
    protected void onBeforeCreate(PSWFVersion m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSWFId())) {
			throw new Exception("未传入工作流标识");
		}
		
		PSWorkflow psWorkflow = (PSWorkflow)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSWORKFLOW, m.getPSWFId());
		
		PSWFVersionFilter psWFVersionFilter = new PSWFVersionFilter();
		psWFVersionFilter.pswfid__eq(m.getPSWFId());
		List<PSWFVersion> psWFVersionList = this.select(psWFVersionFilter);
		int nMaxVersion = 0;
		if(!ObjectUtils.isEmpty(psWFVersionList)) {
			for(PSWFVersion psWFVersion : psWFVersionList) {
				int nCurVersion = DataTypeUtils.getIntegerValue(psWFVersion.getWFVersion(), 1);
				if(nCurVersion > nMaxVersion) {
					nMaxVersion = nCurVersion;
				}
			}
		}
		
		nMaxVersion += 1;
		
		m.setPSWFVersionId(String.format("%1$s.%2$sv%3$s", psWorkflow.getPSWorkflowId(), psWorkflow.getCodeName(), nMaxVersion));
		m.setPSWFVersionName(String.format("%1$s v%2$s", psWorkflow.getPSWorkflowName(), nMaxVersion));
		m.setPSWFName(psWorkflow.getPSWorkflowName());
		m.setWFVersion(nMaxVersion);
		m.set("codename", String.format("%1$sv%2$s", psWorkflow.getCodeName(), nMaxVersion));
		
		
    	super.onBeforeCreate(m);
    }
}
