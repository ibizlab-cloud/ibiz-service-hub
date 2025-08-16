package net.ibizsys.psmodel.runtime.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.psmodel.core.domain.PSSysDBColumn;
import net.ibizsys.psmodel.core.domain.PSSysDBTable;
import net.ibizsys.psmodel.core.filter.PSSysDBColumnFilter;
import net.ibizsys.psmodel.core.service.IPSSysDBColumnService;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.PSModelRTServiceBase;


public class PSSysDBColumnRTService extends PSModelRTServiceBase<PSSysDBColumn, PSSysDBColumnFilter> implements IPSSysDBColumnService{
    private static final Log log = LogFactory.getLog(PSSysDBColumnRTService.class);

    @Override
    public PSSysDBColumn createDomain(){
        return new PSSysDBColumn();
    }

    @Override
    public PSSysDBColumnFilter createFilter(){
        return new PSSysDBColumnFilter();
	}

	@Override
	public PSSysDBColumn getDomain(Object params) {
		if(params instanceof PSSysDBColumn) {
			return (PSSysDBColumn)params;
		}
		return getMapper().convertValue(params, PSSysDBColumn.class);
	}

	@Override
	public PSSysDBColumnFilter getFilter(Object params) {
		if(params instanceof PSSysDBColumnFilter) {
			return (PSSysDBColumnFilter)params;
		}
		return getMapper().convertValue(params, PSSysDBColumnFilter.class);
    }

    @Override
	public String getModelName(boolean single) {
		if(single){
            return "PSSYSDBCOLUMN";
        }
        else{
            return "PSSYSDBCOLUMNS";
        }
	}
    @Override
	protected Class<? extends IPSModelObject> getPSModelObjectCls() throws Exception {
		return IPSSysDBColumn.class;
	}

	@Override
	protected List<? extends IPSSysDBColumn> getPSModelObjectList(PSSysDBColumnFilter f) throws Exception {
		Object objPSSysDBTableId = f.getFieldCond(PSSysDBColumn.FIELD_PSSYSDBTABLEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSSysDBTableId)) {
			objPSSysDBTableId = getParentId(f, PSModels.PSSYSDBTABLE);
		}
		
		Object objPSSysDBSchemeId = null;
		if (ObjectUtils.isEmpty(objPSSysDBTableId)) {
			objPSSysDBSchemeId = f.getFieldCond(PSSysDBColumn.FIELD_PSSYSDBSCHEMEID, IPSModelFilter.EQ);
			if (ObjectUtils.isEmpty(objPSSysDBSchemeId)) {
				objPSSysDBSchemeId = getParentId(f, PSModels.PSSYSDBSCHEME);
			}
		}

		if (ObjectUtils.isEmpty(objPSSysDBTableId)) {
			
			if (this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes() == null) {
				return null;
			}
			// 查询全部
			List<IPSSysDBColumn> allPSSysDBColumnList = new ArrayList<IPSSysDBColumn>();
			for (IPSSysDBScheme iPSSysDBScheme : this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes()) {
				
				if (!ObjectUtils.isEmpty(objPSSysDBSchemeId)) {
					if(!this.getPSModelRTServiceSession().getPSModelUniqueTag(iPSSysDBScheme).equals(objPSSysDBSchemeId)) {
						continue;
					}
				}
				
				
				
				if (ObjectUtils.isEmpty(iPSSysDBScheme.getAllPSSysDBTables())) {
					continue;
				}
				for (IPSSysDBTable iPSSysDBTable : iPSSysDBScheme.getAllPSSysDBTables()) {
					if (ObjectUtils.isEmpty(iPSSysDBTable.getAllPSSysDBColumns())) {
						continue;
					}
					allPSSysDBColumnList.addAll(iPSSysDBTable.getAllPSSysDBColumns());
				}
			}
			return allPSSysDBColumnList;
			
		
		}
		
		return getPSModelObject(IPSSysDBTable.class,

				getPSModelObject(IPSSysDBScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes(), getParentId((String) objPSSysDBTableId), false).getAllPSSysDBTables()

				, (String) objPSSysDBTableId, false).getAllPSSysDBColumns();
	}

	@Override
	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {

		String strPSSysDBTableId = getParentId(key);

		return getPSModelObject(IPSSysDBColumn.class, getPSModelObject(IPSSysDBTable.class, getPSModelObject(IPSSysDBScheme.class, this.getPSSystemService().getPSSystem().getAllPSSysDBSchemes(), getParentId(strPSSysDBTableId), false).getAllPSSysDBTables(), strPSSysDBTableId, false).getAllPSSysDBColumns(), key, tryMode);

	}

	@Override
	protected void doFillDomain(PSSysDBColumn domain, IPSModelObject iPSModelObject, boolean bFullMode) throws Exception {
		PSSysDBTable parentPSModel = (PSSysDBTable)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSSYSDBTABLE, getParentId(domain.getId()));
		domain.setPSSysDBTableId(parentPSModel.getId());
		domain.setPSSysDBTableName(parentPSModel.getName());
		domain.setPSSysDBSchemeId(parentPSModel.getPSSysDBSchemeId());
		super.doFillDomain(domain, iPSModelObject, bFullMode);
	}
    
}
