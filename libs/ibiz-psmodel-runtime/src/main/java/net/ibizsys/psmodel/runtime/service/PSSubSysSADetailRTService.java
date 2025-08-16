package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.psmodel.core.domain.PSSubSysSADE;
import net.ibizsys.psmodel.core.domain.PSSubSysSADetail;
import net.ibizsys.psmodel.core.filter.PSSubSysSADetailFilter;
import net.ibizsys.psmodel.core.service.IPSSubSysSADetailService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;

public class PSSubSysSADetailRTService extends PSModelRTServiceBase<PSSubSysSADetail, PSSubSysSADetailFilter> implements IPSSubSysSADetailService {
	
	private static final Log log = LogFactory.getLog(PSSubSysSADetailRTService.class);

	@Override
	public PSSubSysSADetail createDomain() {
		return new PSSubSysSADetail();
	}

	@Override
	public PSSubSysSADetailFilter createFilter() {
		return new PSSubSysSADetailFilter();
	}

	@Override
	public PSSubSysSADetail getDomain(Object params) {
		if(params instanceof PSSubSysSADetail) {
			return (PSSubSysSADetail)params;
		}
		return getMapper().convertValue(params, PSSubSysSADetail.class);
	}

	@Override
	public PSSubSysSADetailFilter getFilter(Object params) {
		if(params instanceof PSSubSysSADetailFilter) {
			return (PSSubSysSADetailFilter)params;
		}
		return getMapper().convertValue(params, PSSubSysSADetailFilter.class);
	}

	@Override
	public String getModelName(boolean single) {
		if (single) {
			return "PSSUBSYSSADETAIL";
		} else {
			return "PSSUBSYSSADETAILS";
		}
	}

	@Override
	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
		return IPSSubSysServiceAPIDEMethod.class;
	}

	@Override
	protected List<? extends IPSSubSysServiceAPIDEMethod> getPSModelObjectList(PSSubSysSADetailFilter f) throws Exception {
		Object objPSSubSysServiceAPIDEId = f.getFieldCond(PSSubSysSADetail.FIELD_PSSUBSYSSADEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			objPSSubSysServiceAPIDEId = getParentId(f, PSModels.PSSUBSYSSADE);
		}
		
		Object objPSSubSysServiceAPIId = null;
		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			objPSSubSysServiceAPIId = f.getFieldCond(PSSubSysSADetail.FIELD_PSSUBSYSSERVICEAPIID, IPSModelFilter.EQ);
			if (ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
				objPSSubSysServiceAPIId = getParentId(f, PSModels.PSSUBSYSSERVICEAPI);
			}
		}

		if (ObjectUtils.isEmpty(objPSSubSysServiceAPIDEId)) {
			
			if (this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs() == null) {
				return null;
			}
			// 查询全部
			List<IPSSubSysServiceAPIDEMethod> allPSSubSysSADetailList = new ArrayList<IPSSubSysServiceAPIDEMethod>();
			for (IPSSubSysServiceAPI iPSSubSysServiceAPI : this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs()) {
				
				if (!ObjectUtils.isEmpty(objPSSubSysServiceAPIId)) {
					if(!this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSubSysServiceAPI).equals(objPSSubSysServiceAPIId)) {
						continue;
					}
				}
				
				
				
				if (ObjectUtils.isEmpty(iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs())) {
					continue;
				}
				for (IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE : iPSSubSysServiceAPI.getAllPSSubSysServiceAPIDEs()) {
					if (ObjectUtils.isEmpty(iPSSubSysServiceAPIDE.getPSSubSysServiceAPIDEMethods())) {
						continue;
					}
					allPSSubSysSADetailList.addAll(iPSSubSysServiceAPIDE.getPSSubSysServiceAPIDEMethods());
				}
			}
			return allPSSubSysSADetailList;
			
		
		}
		
		return getPSModelObject(IPSSubSysServiceAPIDE.class,

				getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), getParentId((String) objPSSubSysServiceAPIDEId), false).getAllPSSubSysServiceAPIDEs()

				, (String) objPSSubSysServiceAPIDEId, false).getPSSubSysServiceAPIDEMethods();
	}

	@Override
	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {

		String strPSSubSysServiceAPIDEId = getParentId(key);

		return getPSModelObject(IPSSubSysServiceAPIDEMethod.class, getPSModelObject(IPSSubSysServiceAPIDE.class, getPSModelObject(IPSSubSysServiceAPI.class, this.getPSSystemService().getPSSystem().getAllPSSubSysServiceAPIs(), getParentId(strPSSubSysServiceAPIDEId), false).getAllPSSubSysServiceAPIDEs(), strPSSubSysServiceAPIDEId, false).getPSSubSysServiceAPIDEMethods(), key, tryMode);

	}

	@Override
	protected void doFillDomain(PSSubSysSADetail domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
		PSSubSysSADE parentPSModel = (PSSubSysSADE)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSUBSYSSADE, getParentId(domain.getId()));
		domain.setPSSubSysSADEId(parentPSModel.getId());
		domain.setPSSubSysSADEName(parentPSModel.getName());
		domain.setPSSubSysServiceAPIId(parentPSModel.getPSSubSysServiceAPIId());
		domain.setPSSubSysServiceAPIName(parentPSModel.getPSSubSysServiceAPIName());
		super.doFillDomain(domain, iPSModelObject, bFullMode);
	}

}
