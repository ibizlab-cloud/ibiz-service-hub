package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.psmodel.core.domain.PSSysBICube;
import net.ibizsys.psmodel.core.domain.PSSysBICubeDimension;
import net.ibizsys.psmodel.core.filter.PSSysBICubeDimensionFilter;
import net.ibizsys.psmodel.core.service.IPSSysBICubeDimensionService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysBICubeDimensionRTService extends PSModelRTServiceBase<PSSysBICubeDimension, PSSysBICubeDimensionFilter> implements IPSSysBICubeDimensionService{
    private static final Log log = LogFactory.getLog(PSSysBICubeDimensionRTService.class);

    @Override
    public PSSysBICubeDimension createDomain(){
        return new PSSysBICubeDimension();
    }

    @Override
    public PSSysBICubeDimensionFilter createFilter(){
        return new PSSysBICubeDimensionFilter();
    }
    
    
	@Override
	public PSSysBICubeDimension getDomain(Object params) {
		if(params instanceof PSSysBICubeDimension) {
			return (PSSysBICubeDimension)params;
		}
		return getMapper().convertValue(params, PSSysBICubeDimension.class);
	}

	@Override
	public PSSysBICubeDimensionFilter getFilter(Object params) {
		if(params instanceof PSSysBICubeDimensionFilter) {
			return (PSSysBICubeDimensionFilter)params;
		}
		return getMapper().convertValue(params, PSSysBICubeDimensionFilter.class);
    }
	

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSBICUBEDIMENSION";
        }
        else{
            return "PSSYSBICUBEDIMENSIONS";
        }
	}
    
    
    
    @Override
   	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
   		return IPSSysBICubeDimension.class;
   	}

   	@Override
   	protected List<? extends IPSSysBICubeDimension> getPSModelObjectList(PSSysBICubeDimensionFilter f) throws Exception {
   		Object objPSSysBICubeId = f.getFieldCond(PSSysBICubeDimension.FIELD_PSSYSBICUBEID, IPSModelFilter.EQ);
   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			objPSSysBICubeId = getParentId(f, PSModels.PSSYSBICUBE);
   		}
   		
   		Object objPSSysBISchemeId = null;
   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			objPSSysBISchemeId = f.getFieldCond(PSSysBICubeDimension.FIELD_PSSYSBISCHEMEID, IPSModelFilter.EQ);
   			if (ObjectUtils.isEmpty(objPSSysBISchemeId)) {
   				objPSSysBISchemeId = getParentId(f, PSModels.PSSYSBISCHEME);
   			}
   		}

   		if (ObjectUtils.isEmpty(objPSSysBICubeId)) {
   			
   			if (this.getPSSystemService().getPSSystem().getAllPSSysBISchemes() == null) {
   				return null;
   			}
   			// 查询全部
   			List<IPSSysBICubeDimension> allPSSysBICubeDimensionList = new ArrayList<IPSSysBICubeDimension>();
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
   					if (ObjectUtils.isEmpty(iPSSysBICube.getAllPSSysBICubeDimensions())) {
   						continue;
   					}
   					allPSSysBICubeDimensionList.addAll(iPSSysBICube.getAllPSSysBICubeDimensions());
   				}
   			}
   			return allPSSysBICubeDimensionList;
   		}
   		
   		return getPSModelObject(IPSSysBICube.class,

   				getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), getParentId((String) objPSSysBICubeId), false).getAllPSSysBICubes()

   				, (String) objPSSysBICubeId, false).getAllPSSysBICubeDimensions();
   	}

   	@Override
   	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {

   		String strPSSysBICubeId = getParentId(key);

   		return getPSModelObject(IPSSysBICubeDimension.class, getPSModelObject(IPSSysBICube.class, getPSModelObject(IPSSysBIScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysBISchemes(), getParentId(strPSSysBICubeId), false).getAllPSSysBICubes(), strPSSysBICubeId, false).getAllPSSysBICubeDimensions(), key, tryMode);

   	}

   	@Override
   	protected void doFillDomain(PSSysBICubeDimension domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
   		PSSysBICube parentPSModel = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, getParentId(domain.getId()));
   		domain.setPSSysBICubeId(parentPSModel.getId());
   		domain.setPSSysBICubeName(parentPSModel.getName());
   		domain.setPSSysBISchemeId(parentPSModel.getPSSysBISchemeId());
   		super.doFillDomain(domain, iPSModelObject, bFullMode);
   	}
   	
   	
    @Override
    protected void onBeforeCreate(PSSysBICubeDimension m) throws Exception {
    	if(!StringUtils.hasLength(m.getPSSysBICubeId())) {
			throw new Exception("未传入智能立方体标识");
		}
		
		PSSysBICube psSysBICube = (PSSysBICube)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSBICUBE, m.getPSSysBICubeId());
		
		String strCodeName = m.getCodeName();
		if(!StringUtils.hasLength(strCodeName)) {
			strCodeName = String.format("uxdimension%1$s", this.getRandom().nextInt(99999));
		}
		else
			if(strCodeName.indexOf("ux") == -1) {
				strCodeName = String.format("ux%1$s", strCodeName);
			}
		
		String strDimensionId = String.format("%1$s.%2$s", m.getPSSysBICubeId(), strCodeName.toLowerCase());
		
		m.setPSSysBICubeDimensionId(strDimensionId);
		m.setCodeName(strCodeName.toLowerCase());
		m.setPSSysBICubeName(psSysBICube.getPSSysBICubeName());
		
		
    	super.onBeforeCreate(m);
    }
}
