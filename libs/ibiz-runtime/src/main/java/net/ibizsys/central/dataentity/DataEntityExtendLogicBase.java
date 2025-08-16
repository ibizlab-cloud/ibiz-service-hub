package net.ibizsys.central.dataentity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.defield.DEFGroupTypes;
import net.ibizsys.runtime.dataentity.ds.DEDataQueryViewLevels;

public abstract class DataEntityExtendLogicBase implements IDataEntityExtendLogic {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityExtendLogicBase.class);
	
	final ISystemRuntime addinSystemRuntime;
	final IPSDataEntity iPSDataEntity;
	private IPSDEDataQuery simplePSDEDataQuery = null;
	private IPSDEDataQuery auditPSDEDataQuery = null;
	private IPSDEDataQuery defaultPSDEDataQuery = null;
	private IPSDEDataSet defaultPSDEDataSet = null;
	private IPSDEDataQuery viewPSDEDataQuery = null;
	
	private Map<String, IPSDEDataQueryCode> psDEDataQueryCodeMap = new HashMap<String, IPSDEDataQueryCode>();
	
	public DataEntityExtendLogicBase(ISystemRuntime addinSystemRuntime, IPSDataEntity iPSDataEntity) throws Exception {
		Assert.notNull(addinSystemRuntime, "传入插件系统运行时对象无效");
		Assert.notNull(iPSDataEntity, "传入扩展实体模型对象无效");
		this.addinSystemRuntime = addinSystemRuntime;
		this.iPSDataEntity = iPSDataEntity;
		this.onInit();
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.addinSystemRuntime;
	}
	
	@Override
	public IPSDataEntity getPSDataEntity() {
		return this.iPSDataEntity;
	}
	
	protected void onInit() throws Exception {
		java.util.List<IPSDEDataQuery> psDEDataQueries = this.getPSDataEntity().getAllPSDEDataQueries();
		if (psDEDataQueries != null) {
			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				java.util.List<IPSDEDataQueryCode> list = iPSDEDataQuery.getAllPSDEDataQueryCodes();
				if(!ObjectUtils.isEmpty(list)) {
					for(IPSDEDataQueryCode iPSDEDataQueryCode : list) {
						String strTag = String.format("%1$s|%2$s", iPSDEDataQuery.getId(), iPSDEDataQueryCode.getDBType()).toUpperCase();
						psDEDataQueryCodeMap.put(strTag, iPSDEDataQueryCode);
					}
				}
			}
			
			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if (iPSDEDataQuery.isDefaultMode()) {
					this.defaultPSDEDataQuery = iPSDEDataQuery;
					break;
				}
			}

			if (this.defaultPSDEDataQuery == null) {
				for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
					if ("DEFAULT".equalsIgnoreCase(iPSDEDataQuery.getName())) {
						this.defaultPSDEDataQuery = iPSDEDataQuery;
						break;
					}
				}
			}

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if (iPSDEDataQuery.getViewLevel() == DEDataQueryViewLevels.ALL) {
					if ("VIEW".equalsIgnoreCase(iPSDEDataQuery.getName())) {
						this.viewPSDEDataQuery = iPSDEDataQuery;
						break;
					} else {
						this.viewPSDEDataQuery = iPSDEDataQuery;
					}
				}
			}

			if (this.viewPSDEDataQuery == null) {
				log.warn(String.format("实体[%1$s][%2$s]未指定视图级别查询，可能会导致GET行为数据查询不完整", this.getPSDataEntity().getName(), this.getPSDataEntity().getId()));
				this.viewPSDEDataQuery = defaultPSDEDataQuery;
			}

			for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
				if ("SIMPLE".equalsIgnoreCase(iPSDEDataQuery.getCodeName()) && DEFGroupTypes.BASEFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
					this.simplePSDEDataQuery = iPSDEDataQuery;
					break;
				}
			}

			if (this.simplePSDEDataQuery == null) {
				for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueries) {
					if (DEFGroupTypes.BASEFIELDS.equals(iPSDEDataQuery.getDEFGroupType())) {
						this.simplePSDEDataQuery = iPSDEDataQuery;
						break;
					}
				}
			}

			// 未指定简单查询时使用默认查询
			if (this.simplePSDEDataQuery == null) {
				this.simplePSDEDataQuery = defaultPSDEDataQuery;
			}
		}
	}

	@Override
	public List<IPSDEField> getPSDEFields() {
		return getPSDataEntity().getAllPSDEFields();
	}

	@Override
	public IPSDEDataQuery getDefaultPSDEDataQuery() {
		return this.defaultPSDEDataQuery;
	}

	@Override
	public IPSDEDataQuery getViewPSDEDataQuery() {
		return this.viewPSDEDataQuery;
	}

	@Override
	public IPSDEDataQueryCode getPSDEDataQueryCode(IPSDEDataQuery iPSDEDataQuery, String dbType, boolean tryMode) throws Exception {
		Assert.notNull(iPSDEDataQuery, "传入实体数据查询模型对象无效");
		Assert.hasLength(dbType, "传入数据库类型无效");
		
		String strTag = String.format("%1$s|%2$s", iPSDEDataQuery.getId(), dbType).toUpperCase();
		IPSDEDataQueryCode iPSDEDataQueryCode = this.psDEDataQueryCodeMap.get(strTag);
		if(iPSDEDataQueryCode != null || tryMode) {
			return iPSDEDataQueryCode;
		}
		throw new Exception(String.format("实体数据查询[%1$s]数据库类型[%2$s]代码模型对象不存在", iPSDEDataQuery.getName(), dbType));
	}
	
	
	
}
