package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.domain.PSSysBICubeDimension;
import net.ibizsys.psmodel.core.domain.PSSysBICubeMeasure;
import net.ibizsys.psmodel.core.filter.PSSysBICubeMeasureFilter;
import net.ibizsys.psmodel.core.service.IPSSysBICubeMeasureService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBICubeMeasureRTService extends PSModelRTServiceBase<PSSysBICubeMeasure, PSSysBICubeMeasureFilter> implements IPSSysBICubeMeasureService{
    private static final Log log = LogFactory.getLog(PSSysBICubeMeasureRTService.class);

    @Override
    public PSSysBICubeMeasure createDomain(){
        return new PSSysBICubeMeasure();
    }

    @Override
    public PSSysBICubeMeasureFilter createFilter(){
        return new PSSysBICubeMeasureFilter();
    }
    

	@Override
	public PSSysBICubeMeasure getDomain(Object params) {
		if (params instanceof PSSysBICubeMeasure) {
			return (PSSysBICubeMeasure) params;
		}
		return getMapper().convertValue(params, PSSysBICubeMeasure.class);
	}

	@Override
	public PSSysBICubeMeasureFilter getFilter(Object params) {
		if (params instanceof PSSysBICubeMeasureFilter) {
			return (PSSysBICubeMeasureFilter) params;
		}
		return getMapper().convertValue(params, PSSysBICubeMeasureFilter.class);
	}
	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBICUBEMEASURE";
        }
        else{
            return "PSSYSBICUBEMEASURES";
        }
	}
    
    
    @Override
   	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
   		return IPSSysBICubeMeasure.class;
   	}

   	@Override
   	protected List<? extends IPSSysBICubeMeasure> getPSModelObjectList(PSSysBICubeMeasureFilter f) throws Exception {
   		Object objPSSysBICubeId = f.getFieldCond(PSSysBICubeMeasure.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ);
   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			objPSSysBICubeId = getParentId(f, PSModels.PSSYSBICUBE);
   		}
   		
   		Object objPSSysBISchemeId = null;
   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			objPSSysBISchemeId = f.getFieldCond(PSSysBICubeMeasure.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
   			if (ObjectUtils.isEmpty(objPSSysBISchemeId)) {
   				objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
   			}
   		}

   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			
   			if (this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
   				return null;
   			}
   			// 查询全部
   			List<IPSSysBICubeMeasure> allPSSysBICubeMeasureList = new ArrayList<IPSSysBICubeMeasure>();
   			for (IPSSysBIScheme iPSSysBIScheme : this.getPSSystemService().getPSSystem().getAllPSSysBISchemes()) {
   				
   				if (!ObjectUtils.isEmpty(objPSSysBISchemeId)) {
   					if(!this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysBIScheme).equals(objPSSysBISchemeId)) {
   						continue;
   					}
   				}
   				
   				if (ObjectUtils.isEmpty(iPSSysBIScheme.getAllPSSysBICubes())) {
   					continue;
   				}
   				for (IPSSysBICube iPSSysBICube : iPSSysBIScheme.getAllPSSysBICubes()) {
   					if (ObjectUtils.isEmpty(iPSSysBICube.getAllPSSysBICubeMeasures())) {
   						continue;
   					}
   					allPSSysBICubeMeasureList.addAll(iPSSysBICube.getAllPSSysBICubeMeasures());
   				}
   			}
   			return allPSSysBICubeMeasureList;
   		}
   		
   		return getPSModelObject(IPSSysBICube.class,

   				getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), getParentId((String) objPSSysBICubeId), false).getAllPSSysBICubes()

   				, (String) objPSSysBICubeId, false).getAllPSSysBICubeMeasures();
   	}

   	@Override
   	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {

   		String strPSSysBICubeId = getParentId(key);

   		return getPSModelObject(IPSSysBICubeMeasure.class, getPSModelObject(IPSSysBICube.class, getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), getParentId(strPSSysBICubeId), false).getAllPSSysBICubes(), strPSSysBICubeId, false).getAllPSSysBICubeMeasures(), key, tryMode);

   	}

   	@Override
   	protected void doFillDomain(PSSysBICubeMeasure domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
   		PSSysBICube parentPSModel = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, getParentId(domain.getId()));
   		domain.setPSSysBICubeId(parentPSModel.getId());
   		domain.setPSSysBICubeName(parentPSModel.getName());
   		domain.setPSSysBISchemeId(parentPSModel.getPSSysBISchemeId());
   		super.doFillDomain(domain, iPSModelObject, bFullMode);
   	}
   	
    @Override
    protected void onBeforeCreate(PSSysBICubeMeasure m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSSysBICubeId())) {
			throw new Exception("未传入智能立方体标识");
		}
		
		PSSysBICube psSysBICube = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, m.getPSSysBICubeId());
		
		String strCodeName = m.getCodeName();
		if(!StringUtils.hasLength(strCodeName)) {
			strCodeName = String.format("uxmeasure%1$s", this.getRandom().nextInt(99999));
		}
		else
			if(strCodeName.indexOf("ux") == -1) {
				strCodeName = String.format("ux%1$s", strCodeName);
			}
		
		String strMeasureId = String.format("%1$s.%2$s", m.getPSSysBICubeId(), strCodeName.toLowerCase());
		
		m.setPSSysBICubeMeasureId(strMeasureId);
		m.setCodeName(strCodeName.toLowerCase());
		m.setPSSysBICubeName(psSysBICube.getPSSysBICubeName());
		
		
    	super.onBeforeCreate(m);
    }
   	
}
