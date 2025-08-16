package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.psmodel.core.domain.PSDEJoinType;
import net.ibizsys.psmodel.core.filter.PSDEJoinTypeFilter;
import net.ibizsys.psmodel.core.service.IPSDEJoinTypeService;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSDEJoinTypeRTService extends PSModelRTServiceBase<PSDEJoinType, PSDEJoinTypeFilter> implements IPSDEJoinTypeService{
    private static final Log log = LogFactory.getLog(PSDEJoinTypeRTService.class);

    private static List<PSDEJoinType> PSDEJoinTypes = new ArrayList<PSDEJoinType>(); 
    static {
    	
     	 PSDEJoinTypes.add(new PSDEJoinType().id("MAIN").name("主查询").mainflag(1));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("N1").name("相关N:1（INNER JOIN）").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("1N").name("存在1:N（EXISTS (SELECT)）").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("1NNOT").name("不存在1:N（NOT EXISTS (SELECT)）").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("INDEX").name("索引/继承-主实体").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("INDEXM").name("索引/继承-附属实体").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("N1RIGHT").name("右联接N:1").mainflag(0));
    	 PSDEJoinTypes.add(new PSDEJoinType().id("1NLEFTOUT").name("左外联接 1:N").mainflag(0));
    }
    
    @Override
    public PSDEJoinType createDomain(){
        return new PSDEJoinType();
    }

    @Override
    public PSDEJoinTypeFilter createFilter(){
        return new PSDEJoinTypeFilter();
	}

	@Override
	public PSDEJoinType getDomain(Object params) {
		if(params instanceof PSDEJoinType) {
			return (PSDEJoinType)params;
		}
		return getMapper().convertValue(params, PSDEJoinType.class);
	}

	@Override
	public PSDEJoinTypeFilter getFilter(Object params) {
		if(params instanceof PSDEJoinTypeFilter) {
			return (PSDEJoinTypeFilter)params;
		}
		return getMapper().convertValue(params, PSDEJoinTypeFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSDEJOINTYPE";
        }
        else{
            return "PSDEJOINTYPES";
        }
	}
    
    protected List<PSDEJoinType> getDomainList(String strDataSetName, PSDEJoinTypeFilter f) throws Exception {
		// 执行过滤操作
		return filterDomainList(PSDEJoinTypes, strDataSetName, f);
	}
    
    
    @Override
    protected Map<String, Object> getDataSetConds(String strDataSetName, PSDEJoinTypeFilter f) {
    	// TODO Auto-generated method stub
    	return super.getDataSetConds(strDataSetName, f);
    }
}
