package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.domain.PSSysSFPITempl;
import net.ibizsys.psmodel.core.filter.PSSysSFPITemplFilter;
import net.ibizsys.psmodel.core.service.IPSSysSFPITemplService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysSFPITemplRTService extends PSModelRTServiceBase<PSSysSFPITempl, PSSysSFPITemplFilter> implements IPSSysSFPITemplService{
    private static final Log log = LogFactory.getLog(PSSysSFPITemplRTService.class);

    @Override
    public PSSysSFPITempl createDomain(){
        return new PSSysSFPITempl();
    }

    @Override
    public PSSysSFPITemplFilter createFilter(){
        return new PSSysSFPITemplFilter();
	}

	@Override
	public PSSysSFPITempl getDomain(Object params) {
		if(params instanceof PSSysSFPITempl) {
			return (PSSysSFPITempl)params;
		}
		return getMapper().convertValue(params, PSSysSFPITempl.class);
	}

	@Override
	public PSSysSFPITemplFilter getFilter(Object params) {
		if(params instanceof PSSysSFPITemplFilter) {
			return (PSSysSFPITemplFilter)params;
		}
		return getMapper().convertValue(params, PSSysSFPITemplFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSSFPITEMPL";
        }
        else{
            return "PSSYSSFPITEMPLS";
        }
	}
    
    
    @Override
    protected List<PSSysSFPITempl> getDomainList(String strDataSetName, PSSysSFPITemplFilter f) throws Exception {
    	
    	//拿出实体全部表单
    	Object objPSSysSFPluginId = f.getFieldCond(PSSysSFPITempl.FIELD_PSSYSSFPLUGINID, IPSModelFilter.EQ);
    	if(ObjectUtils.isEmpty(objPSSysSFPluginId)) {
     		objPSSysSFPluginId = getParentId(f, PSModels.PSSYSSFPLUGIN);
    	}
    	
    	String strPSSysSFPluginId = null;
    	if(objPSSysSFPluginId!=null) {
    		strPSSysSFPluginId = (String)objPSSysSFPluginId;
    	}

    	List<IPSSysSFPlugin> psSysSFPluginList = new ArrayList<IPSSysSFPlugin>();
    	java.util.List<IPSSysSFPlugin> psSysSFPlugins = this.getPSSystemService().getPSSystem().getAllPSSysSFPlugins();
    	if(!ObjectUtils.isEmpty(psSysSFPlugins)) {
    		for(IPSSysSFPlugin iPSSysSFPlugin : psSysSFPlugins) {
    			if(StringUtils.hasLength(strPSSysSFPluginId)) {
    				String strId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysSFPlugin);
        			if(!strPSSysSFPluginId.equals(strId)) {
        				continue;
        			}
    			}
    			psSysSFPluginList.add(iPSSysSFPlugin);
    		}
    	}
    	
    	
    	List<PSSysSFPITempl> psSysSFPITemplList = new ArrayList<PSSysSFPITempl>();
    	for(IPSSysSFPlugin iPSSysSFPlugin : psSysSFPluginList) {
    		
    		String strPId = this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysSFPlugin);
    		
    		if(StringUtils.hasLength(iPSSysSFPlugin.getTemplCode())) {
    			PSSysSFPITempl psSysSFPITempl = new PSSysSFPITempl();
        		psSysSFPITempl.setPSSysSFPITemplId(String.format("%1$s.%2$s", strPId, "templcode"));
        		psSysSFPITempl.setPSSysSFPITemplName(String.format("模板代码"));
        		psSysSFPITempl.setTemplCode(iPSSysSFPlugin.getTemplCode());
        		psSysSFPITemplList.add(psSysSFPITempl);
    		}
    		
    		if(StringUtils.hasLength(iPSSysSFPlugin.getTemplCode2())) {
    			PSSysSFPITempl psSysSFPITempl = new PSSysSFPITempl();
        		psSysSFPITempl.setPSSysSFPITemplId(String.format("%1$s.%2$s", strPId, "templcode2"));
        		psSysSFPITempl.setPSSysSFPITemplName(String.format("模板代码2"));
        		psSysSFPITempl.setTemplCode(iPSSysSFPlugin.getTemplCode2());
        		psSysSFPITemplList.add(psSysSFPITempl);
    		}
    		
    		if(StringUtils.hasLength(iPSSysSFPlugin.getTemplCode3())) {
    			PSSysSFPITempl psSysSFPITempl = new PSSysSFPITempl();
        		psSysSFPITempl.setPSSysSFPITemplId(String.format("%1$s.%2$s", strPId, "templcode3"));
        		psSysSFPITempl.setPSSysSFPITemplName(String.format("模板代码3"));
        		psSysSFPITempl.setTemplCode(iPSSysSFPlugin.getTemplCode3());
        		psSysSFPITemplList.add(psSysSFPITempl);
    		}
    		
    		if(StringUtils.hasLength(iPSSysSFPlugin.getTemplCode4())) {
    			PSSysSFPITempl psSysSFPITempl = new PSSysSFPITempl();
        		psSysSFPITempl.setPSSysSFPITemplId(String.format("%1$s.%2$s", strPId, "templcode4"));
        		psSysSFPITempl.setPSSysSFPITemplName(String.format("模板代码4"));
        		psSysSFPITempl.setTemplCode(iPSSysSFPlugin.getTemplCode4());
        		psSysSFPITemplList.add(psSysSFPITempl);
    		}
    	}
    	
    	return filterDomainList(psSysSFPITemplList, strDataSetName, f);
    }
    
    @Override
    protected PSSysSFPITempl doGet(String key, boolean tryMode) throws Exception {
    	
    	String strPSSysSFPluginId = getParentId(key);
    	PSSysSFPITemplFilter psSysSFPITemplFilter = new PSSysSFPITemplFilter();
    	psSysSFPITemplFilter.pssyssfpluginid__eq(strPSSysSFPluginId);
    	
    	List<PSSysSFPITempl> list = this.getDomainList("Default", psSysSFPITemplFilter);
    	if(!ObjectUtils.isEmpty(list)) {
    		for(PSSysSFPITempl psSysSFPITempl : list) {
    			if(key.equals(psSysSFPITempl.getId())) {
    				return psSysSFPITempl;
    			}
    		}
    	}
    	
    	throw new Exception(String.format("无法获取指定模型对象[%1$s]", key));
    }
    
    @Override
    protected void doFillDomain(PSSysSFPITempl domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
    	PSDataEntity parentPSModel = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSSFPLUGIN, getParentId(domain.getId()));
    	domain.setPSSysSFPluginId(parentPSModel.getId());
    	domain.setPSSysSFPluginName(parentPSModel.getName());
    	domain.setPSSFId("J2EE6");
    	domain.setPSSFName("J2EE6");
    	super.doFillDomain(domain, iPSModelObject, bFullMode);
    }
    
}
