package net.ibizsys.central.bi;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.bi.util.BISearchDimension;
import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.bi.util.IBISearchDimension;
import net.ibizsys.central.bi.util.IBISearchMeasure;
import net.ibizsys.central.bi.util.IBISearchPeriod;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.IDEDQSQLCustomCondParser;
import net.ibizsys.central.dataentity.ds.IDEDQSQLSelectParser;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.central.util.SearchGroupCond;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.BICubeOption;
import net.ibizsys.model.PSModelEnums.BIDimensionType;
import net.ibizsys.model.PSModelEnums.BIMeasureType;
import net.ibizsys.model.PSModelEnums.DEDataSetGroupMode;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.bi.IPSSysBICube;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.model.bi.IPSSysBIHierarchy;
import net.ibizsys.model.bi.IPSSysBILevel;
import net.ibizsys.model.bi.PSSysBICubeDimensionImpl;
import net.ibizsys.model.bi.PSSysBICubeMeasureImpl;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.PSDEDataSetGroupParamImpl;
import net.ibizsys.model.dataentity.ds.PSDEDataSetImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;

public abstract class SysBICubeRuntimeBase extends ModelRuntimeBase implements ISysBICubeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysBICubeRuntimeBase.class);

	private ISysBISchemeRuntimeContext iSysBISchemeRuntimeContext = null;
	private IPSSysBICube iPSSysBICube = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private Map<String, IPSSysBICubeMeasure> psSysBICubeMeasureMap = new LinkedHashMap<>();
	private Map<String, IPSSysBICubeDimension> psSysBICubeDimensionMap = new LinkedHashMap<>();
	// private Map<String, String> dimensionFormulaMap = new
	// ConcurrentHashMap<String, String>();
	// private Map<String, Set<String>> dimensionFormulaFieldListMap = new
	// ConcurrentHashMap<String, Set<String>>();
	// private Map<String, String> measureFormulaMap = new
	// ConcurrentHashMap<String, String>();
	// private Map<String, Set<String>> measureFormulaFieldListMap = new
	// ConcurrentHashMap<String, Set<String>>();
	private String strAccessKey = null;
	private ISysBICubeCalculatedDimensionParser iSysBICubeCalculatedDimensionParser = null;
	private ISysBICubeCalculatedMeasureParser iSysBICubeCalculatedMeasureParser = null;
	private boolean bEnableAuthoritySearchCond = false;

	/**
	 * 搜索条件分组分类：BI搜索周期
	 */
	final public static String SEARCHCONDCAT_BISEARCHPERIOD = "BISEARCHPERIOD";

	@Override
	public void init(ISysBISchemeRuntimeContext iSysBISchemeRuntimeContext, IPSSysBICube iPSSysBICube) throws Exception {
		this.iSysBISchemeRuntimeContext = iSysBISchemeRuntimeContext;
		this.iPSSysBICube = iPSSysBICube;
		if (this.iPSSysBICube.getPSSysUniRes() != null) {
			this.strAccessKey = this.iPSSysBICube.getPSSysUniRes().getResCode();
		}
		this.onInit();
	}

	@Override
	protected void onInit() throws Exception {

		this.bEnableAuthoritySearchCond = (this.getPSSysBICube().getCubeOption() & BICubeOption.REFCHECK.value) == BICubeOption.REFCHECK.value;

		// List<IPSSysDBColumn> psSysDBColumnList =
		// this.getPSSysBICube().getAllPSSysDBColumns();
		// if(psSysDBColumnList != null) {
		// for(IPSSysDBColumn iPSSysDBColumn : psSysDBColumnList) {
		// SysDBColumnRuntime sysDBColumnRuntime = new SysDBColumnRuntime();
		// sysDBColumnRuntime.init(ISysBISchemeRuntimeContext, this,
		// iPSSysDBColumn);
		// this.sysDBColumnRuntimeList.add(sysDBColumnRuntime);
		// this.sysDBColumnRuntimeMap.put(sysDBColumnRuntime.getName(),
		// sysDBColumnRuntime);
		// }
		// }

		List<IPSSysBICubeMeasure> psSysBICubeMeasureList = this.getPSSysBICube().getAllPSSysBICubeMeasures();
		if (!ObjectUtils.isEmpty(psSysBICubeMeasureList)) {
			for (IPSSysBICubeMeasure iPSSysBICubeMeasure : psSysBICubeMeasureList) {
				psSysBICubeMeasureMap.put(iPSSysBICubeMeasure.getCodeName().toLowerCase(), iPSSysBICubeMeasure);
			}
		}

		List<IPSSysBICubeDimension> psSysBICubeDimensionList = this.getPSSysBICube().getAllPSSysBICubeDimensions();
		if (!ObjectUtils.isEmpty(psSysBICubeDimensionList)) {
			for (IPSSysBICubeDimension iPSSysBICubeDimension : psSysBICubeDimensionList) {
				psSysBICubeDimensionMap.put(iPSSysBICubeDimension.getCodeName().toLowerCase(), iPSSysBICubeDimension);
			}
		}

		this.iDataEntityRuntime = this.getSysBISchemeRuntime().getSystemRuntime().getDataEntityRuntime(this.getPSSysBICube().getPSDataEntityMust().getId(), true);
		if (this.iDataEntityRuntime == null) {
			throw new Exception("实体运行时对象无效");
		}

		if (this.getSysBICubeCalculatedDimensionParser(true) == null) {
			this.setSysBICubeCalculatedDimensionParser(this.iDataEntityRuntime.getSystemRuntime().getRuntimeObject(ISysBICubeCalculatedDimensionParser.class, "SQL"));
			this.getSysBICubeCalculatedDimensionParser(false);
		}

		if (this.getSysBICubeCalculatedMeasureParser(true) == null) {
			this.setSysBICubeCalculatedMeasureParser(this.iDataEntityRuntime.getSystemRuntime().getRuntimeObject(ISysBICubeCalculatedMeasureParser.class, "SQL"));
			this.getSysBICubeCalculatedMeasureParser(false);
		}

		super.onInit();
	}

	public ISystemRuntime getSystemRuntime() {
		return this.getSysBISchemeRuntime().getSystemRuntime();
	}

	protected ISysBISchemeRuntimeContext getSysBISchemeRuntimeContext() {
		return this.iSysBISchemeRuntimeContext;
	}

	// public List<IPSSysBICubeDimension> getPSSysBICubeDimensions() {
	// return this.getPSSysBICube().getAllPSSysBICubeDimensions();
	// }
	//
	// public List<IPSSysBICubeMeasure> getPSSysBICubeMeasures() {
	// return this.getPSSysBICube().getAllPSSysBICubeMeasures();
	// }

	protected ISysBICubeCalculatedDimensionParser getSysBICubeCalculatedDimensionParser(boolean bTryMode) throws Exception {
		if (this.iSysBICubeCalculatedDimensionParser != null || bTryMode) {
			return this.iSysBICubeCalculatedDimensionParser;
		}
		throw new Exception("系统智能立方体计算维度分析器对象无效");
	}

	protected void setSysBICubeCalculatedDimensionParser(ISysBICubeCalculatedDimensionParser iSysBICubeCalculatedDimensionParser) {
		this.iSysBICubeCalculatedDimensionParser = iSysBICubeCalculatedDimensionParser;
	}

	protected ISysBICubeCalculatedMeasureParser getSysBICubeCalculatedMeasureParser(boolean bTryMode) throws Exception {
		if (this.iSysBICubeCalculatedMeasureParser != null || bTryMode) {
			return this.iSysBICubeCalculatedMeasureParser;
		}
		throw new Exception("系统智能立方体计算指标分析器对象无效");
	}

	protected void setSysBICubeCalculatedMeasureParser(ISysBICubeCalculatedMeasureParser iSysBICubeCalculatedMeasureParser) {
		this.iSysBICubeCalculatedMeasureParser = iSysBICubeCalculatedMeasureParser;
	}

	@Override
	public IPSSysBICube getPSSysBICube() {
		return this.iPSSysBICube;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysBICube();
	}

	@Override
	public String getId() {
		return this.getPSSysBICube().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysBICube().getName();
	}

	@Override
	public String getAccessKey() {
		return this.strAccessKey;
	}

	@Override
	public ISysBISchemeRuntime getSysBISchemeRuntime() {
		return this.getSysBISchemeRuntimeContext().getSysBISchemeRuntime();
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public IPSSysBICubeMeasure getPSSysBICubeMeasure(String strName, boolean bTryMode) {
		Assert.hasLength(strName, "未传入立方体指标名称");

		IPSSysBICubeMeasure iPSSysBICubeMeasure = this.psSysBICubeMeasureMap.get(strName.toLowerCase());
		if (iPSSysBICubeMeasure != null || bTryMode) {
			return iPSSysBICubeMeasure;
		}

		throw new SysBISchemeRuntimeException(this.getSysBISchemeRuntime(), this, String.format("指定立方体指标[%1$s]不存在", strName));
	}

	@Override
	public IPSSysBICubeDimension getPSSysBICubeDimension(String strName, boolean bTryMode) {
		Assert.hasLength(strName, "未传入立方体维度名称");

		IPSSysBICubeDimension iPSSysBICubeDimension = this.psSysBICubeDimensionMap.get(strName.toLowerCase());
		if (iPSSysBICubeDimension != null || bTryMode) {
			return iPSSysBICubeDimension;
		}

		throw new SysBISchemeRuntimeException(this.getSysBISchemeRuntime(), this, String.format("指定立方体维度[%1$s]不存在", strName));
	}

	@Override
	public List fetch(IBISearchContext iBISearchContext) throws Throwable {
		Assert.notNull(iBISearchContext, "传入BI搜索上下文对象无效");
		try {

			this.onBeforeFetch(iBISearchContext);

			return this.onFetch(iBISearchContext);
		} catch (Throwable ex) {
			SysBISchemeRuntimeException.rethrow(this, ex);
			throw new SysBISchemeRuntimeException(this.getSysBISchemeRuntime(), this, String.format("查询立方体数据发生异常, %1$s", ex.getMessage()), ex);
		}

	}

	protected void onBeforeFetch(IBISearchContext iBISearchContext) throws Throwable {
		if (ObjectUtils.isEmpty(iBISearchContext.getBISearchDimensions())) {
			List<IPSSysBICubeDimension> psSysBICubeDimensionList = this.getPSSysBICube().getAllPSSysBICubeDimensions();
			if (!ObjectUtils.isEmpty(psSysBICubeDimensionList)) {
				for (IPSSysBICubeDimension item : psSysBICubeDimensionList) {
					if (item.isDefault()) {
						BISearchDimension biSearchDimension = new BISearchDimension();
						biSearchDimension.setName(item.getCodeName());
						iBISearchContext.getBISearchDimensionsIf().add(biSearchDimension);
					}
				}
			}
			// if(ObjectUtils.isEmpty(iBISearchContext.getBISearchDimensions()))
			// {
			// throw new Exception("未传入立方体维度");
			// }
		}

		if (ObjectUtils.isEmpty(iBISearchContext.getBISearchMeasures())) {
			throw new Exception("未传入立方体指标");
		}
	}
	
	protected IPSDEDataSet getPSDEDataSet(IBISearchContext iBISearchContext) {
		IPSDEDataSet iPSDEDataSet = this.getPSSysBICube().getPSDEDataSet();
		if (iPSDEDataSet == null) {
			iPSDEDataSet = this.getDataEntityRuntime().getDefaultPSDEDataSet();
		}
		return iPSDEDataSet;
	}

	protected List onFetch(IBISearchContext iBISearchContext) throws Throwable {

		IPSDEDataSet iPSDEDataSet = getPSDEDataSet(iBISearchContext);

		ObjectNode deDataSetNode = iPSDEDataSet.getObjectNode().deepCopy();
		deDataSetNode.put(PSDEDataSetImpl.ATTR_GETGROUPMODE, DEDataSetGroupMode.GROUPPARAMEX.value);
		deDataSetNode.put(PSDEDataSetImpl.ATTR_ISENABLEGROUP, true);

		deDataSetNode.remove(PSDEDataSetImpl.ATTR_GETPSDEDATASETGROUPPARAMS);
		ArrayNode groupParamArray = deDataSetNode.putArray(PSDEDataSetImpl.ATTR_GETPSDEDATASETGROUPPARAMS);

		Set<String> columnList = new LinkedHashSet<String>();

		if (!ObjectUtils.isEmpty(iBISearchContext.getBISearchMeasures())) {
			for (IBISearchMeasure iBISearchMeasure : iBISearchContext.getBISearchMeasures()) {
				
				IPSSysBICubeMeasure iPSSysBICubeMeasure = this.getPSSysBICubeMeasure(iBISearchMeasure.getName(), false);
				if (BIMeasureType.COMMON.value.equals(iPSSysBICubeMeasure.getMeasureType())) {
					if (iPSSysBICubeMeasure.getPSDEField() != null) {
						columnList.add(iPSSysBICubeMeasure.getPSDEField().getName());
					}
				}
				try {
					ObjectNode groupParamNode = this.getMeasureDataSetGroupParamModel(iBISearchContext, iBISearchMeasure, iPSSysBICubeMeasure);
					groupParamArray.add(groupParamNode);

					if (groupParamNode.has(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE)) {
						String strSelectCode = groupParamNode.get(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE).asText();
						if (StringUtils.hasLength(strSelectCode)) {
							columnList.addAll(Arrays.asList(strSelectCode.toUpperCase().split("[,]")));
						}
					}
				} catch (Throwable ex) {
					throw new Exception(String.format("计算指标模型[%1$s]发生异常，%2$s", iPSSysBICubeMeasure.getName(), ex.getMessage()));
				}
			}
		}

		if (!ObjectUtils.isEmpty(iBISearchContext.getBISearchDimensions())) {
			for (IBISearchDimension iBISearchDimension : iBISearchContext.getBISearchDimensions()) {
				IPSSysBICubeDimension iPSSysBICubeDimension = this.getPSSysBICubeDimension(iBISearchDimension.getName(), false);
				if (BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
					if (iPSSysBICubeDimension.getPSDEField() != null) {
						columnList.add(iPSSysBICubeDimension.getPSDEField().getName());
					}
				}
				try {
					ObjectNode groupParamNode = this.getDimensionDataSetGroupParamModel(iBISearchContext, iBISearchDimension, iPSSysBICubeDimension, false);
					groupParamArray.add(groupParamNode);

					if (groupParamNode.has(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE)) {
						String strSelectCode = groupParamNode.get(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE).asText();
						if (StringUtils.hasLength(strSelectCode)) {
							columnList.addAll(Arrays.asList(strSelectCode.toUpperCase().split("[,]")));
						}
					}

					if (iPSSysBICubeDimension.getTextPSDEField() != null) {
						ObjectNode groupParamNode2 = this.getDimensionDataSetGroupParamModel(iBISearchContext, iBISearchDimension, iPSSysBICubeDimension, true);
						groupParamArray.add(groupParamNode2);
					}
				} catch (Throwable ex) {
					throw new Exception(String.format("计算维度模型[%1$s]发生异常，%2$s", iPSSysBICubeDimension.getName(), ex.getMessage()));
				}
			}
		}
		
		Map<String, String> ignoreMap = new HashMap<String, String>();

		Collection<ObjectNode> dynaFieldParams = this.getDynaFieldDataSetGroupParamModels(iBISearchContext, columnList);
		if (!ObjectUtils.isEmpty(dynaFieldParams)) {
			groupParamArray.addAll(dynaFieldParams);
			for(ObjectNode node : dynaFieldParams) {
				String strName = JsonUtils.getField(node, PSDEDataSetGroupParamImpl.ATTR_GETNAME, null);
				if(StringUtils.hasLength(strName)) {
					ignoreMap.put(strName.toLowerCase(), "");
				}
			}
		}
		
		if (!ObjectUtils.isEmpty(iBISearchContext.getBISearchMeasures())) {
			for (IBISearchMeasure iBISearchMeasure : iBISearchContext.getBISearchMeasures()) {
				if(iBISearchMeasure.isHidden()) {
					ignoreMap.put(iBISearchMeasure.getName().toLowerCase(), "");
				}
				else {
					ignoreMap.remove(iBISearchMeasure.getName().toLowerCase());
				}
			}
		}

		// 进一步填充维度权限
		if (isEnableAuthoritySearchCond()) {
			ISearchCond iSearchCond = this.getAuthoritySearchCond(iBISearchContext, columnList);
			if (iSearchCond != null) {
				iBISearchContext.getSearchContext().getSearchCondsIf().add(iSearchCond);
			}
		}

		iPSDEDataSet = this.getSysBISchemeRuntime().getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getDataEntityRuntime().getPSDataEntity(), IPSDEDataSet.class, deDataSetNode);
		List<IEntity> entityList = new ArrayList<IEntity>();

		List page = this.doFetch(iBISearchContext, iPSDEDataSet);

		if (!ObjectUtils.isEmpty(page)) {
			for (Object item : page) {
				entityList.add(this.getSysBISchemeRuntime().getSystemRuntime().createEntity(item));
			}
		}
		
		if (!ObjectUtils.isEmpty(entityList) && !ObjectUtils.isEmpty(ignoreMap)) {
			for (IEntity iEntity : entityList) {
				for(String strName : ignoreMap.keySet()) {
					iEntity.reset(strName);
				}
			}
		}

		return entityList;
	}

	protected List doFetch(IBISearchContext iBISearchContext, IPSDEDataSet iPSDEDataSet) throws Throwable {
		ISearchContext iSearchContext = iBISearchContext.getSearchContext();
		iSearchContext.setCount(false);
		iSearchContext.setPageable(ISearchContext.STARTPAGE, Integer.MAX_VALUE, 0);
		// 重新设置排序信息
		iSearchContext.setPageSort(iBISearchContext.getBISort());

		IBISearchPeriod iBISearchPeriod = iBISearchContext.getBISearchPeriod();
		if (iBISearchPeriod != null) {
			Map<String, ISearchCond> conds = null;
			try {
				conds = this.getSearchPeriodConds(iBISearchPeriod);
				if (ObjectUtils.isEmpty(conds)) {
					throw new Exception(String.format("未返回任何条件"));
				}
			} catch (Throwable ex) {
				throw new Exception(String.format("计算周期条件发生异常， %1$s", ex.getMessage()), ex);
			}

			ISearchGroupCond iSearchGroupCond = SearchContextDTO.getSearchGroupCondByCat(iSearchContext, SEARCHCONDCAT_BISEARCHPERIOD);
			if (iSearchGroupCond == null) {
				SearchGroupCond searchGroupCond = new SearchGroupCond();
				searchGroupCond.setCondOp(Conditions.AND);
				searchGroupCond.setCat(SEARCHCONDCAT_BISEARCHPERIOD);
				iSearchContext.getSearchCondsIf().add(searchGroupCond);
				iSearchGroupCond = searchGroupCond;
			}

			List all = new ArrayList();
			for (java.util.Map.Entry<String, ISearchCond> entry : conds.entrySet()) {
				iSearchGroupCond.getSearchCondsIf().clear();
				iSearchGroupCond.getSearchCondsIf().add(entry.getValue());

				List list = this.doFetch(iSearchContext, iPSDEDataSet);
				if (!ObjectUtils.isEmpty(list)) {
					for (Object item : list) {
						if (item instanceof Map) {
							((Map) item).put("srfperiodtype", entry.getKey());
						}
					}
					all.addAll(list);
				}
			}

			return all;
		} else {
			return this.doFetch(iSearchContext, iPSDEDataSet);
		}

	}

	protected Map<String, ISearchCond> getSearchPeriodConds(IBISearchPeriod iBISearchPeriod) throws Throwable {
		Map<String, ISearchCond> searchCondMap = new LinkedHashMap<String, ISearchCond>();

		if (!StringUtils.hasLength(iBISearchPeriod.getField())) {
			throw new Exception("未指定时间维度");
		}

		java.sql.Timestamp startTime = null;
		java.sql.Timestamp endTime = null;

		String strUnit = iBISearchPeriod.getUnit();
		String strType = iBISearchPeriod.getType();
		if (StringUtils.hasLength(strType)) {
			if (strType.indexOf(IBISearchPeriod.PREFIX_CURRENT) == 0) {
				String[] items = strType.split("[_]");
				strType = IBISearchPeriod.TYPE_CURRENT;
				if (items.length == 2) {
					strUnit = items[1];
				}
			}
		}

		if (IBISearchPeriod.TYPE_STATIC.equals(strType)) {
			startTime = new Timestamp(iBISearchPeriod.getStart() * 1000);
			endTime = new Timestamp(iBISearchPeriod.getEnd() * 1000);
		} else if (IBISearchPeriod.TYPE_DYNAMIC.equals(strType) || IBISearchPeriod.TYPE_CURRENT.equals(strType)) {

			Calendar start = Calendar.getInstance();
			start.setTimeInMillis(System.currentTimeMillis());
			Calendar end = Calendar.getInstance();
			end.setTimeInMillis(System.currentTimeMillis());

			if (IBISearchPeriod.TYPE_DYNAMIC.equals(strType)) {
				if (IBISearchPeriod.UNIT_DAY.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.DATE, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.DATE, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.WEEK_OF_YEAR, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.WEEK_OF_YEAR, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.MONTH, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.MONTH, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.MONTH, (int) iBISearchPeriod.getStart() * 3);
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.MONTH, (int) iBISearchPeriod.getEnd() * 3);
					}
				} else if (IBISearchPeriod.UNIT_YEAR.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.YEAR, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.YEAR, (int) iBISearchPeriod.getEnd());
					}
				} else
					throw new Exception(String.format("无法识别的单位[%1$s]", strUnit));
			}

			startTime = new Timestamp(start.getTimeInMillis());
			endTime = new Timestamp(end.getTimeInMillis());
		}

		if (startTime == null) {
			throw new Exception("无法计算起始时间");
		}

		if (endTime == null) {
			throw new Exception("无法计算结束时间");
		}

		if (endTime.getTime() < startTime.getTime()) {
			throw new Exception("结束时间小于开始时间");
		}

		if (IBISearchPeriod.UNIT_DAY.equals(strUnit)) {

			String strCond = String.format("(%1$s >= TIMESTAMP('%2$s')) AND (%1$s <= TIMESTAMP('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			searchCondMap.put("", SearchCustomCond.of(strCond, "PQL"));

			if (iBISearchPeriod.getPoP() > 0) {
				Calendar start = Calendar.getInstance();
				start.setTimeInMillis(startTime.getTime());

				Calendar end = Calendar.getInstance();
				end.setTimeInMillis(endTime.getTime());

				// 计算两个时间间隔天数
				int nDays = (int) (endTime.getTime() / 86400000l - startTime.getTime() / 86400000l + 1);

				for (int i = 0; i < iBISearchPeriod.getPoP(); i++) {
					start.add(Calendar.DATE, -(i + 1) * nDays);
					end.add(Calendar.DATE, -(i + 1) * nDays);

					String strCond2 = String.format("(%1$s >= TIMESTAMP('%2$s')) AND (%1$s <= TIMESTAMP('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("PoP%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}
			}
		} else if (IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {

			String strCond = String.format("(%1$s >= STARTOFWEEK('%2$s')) AND (%1$s <= ENDOFWEEK('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			searchCondMap.put("", SearchCustomCond.of(strCond, "PQL"));

			if (iBISearchPeriod.getPoP() > 0) {
				Calendar start = Calendar.getInstance();
				start.setTimeInMillis(startTime.getTime());

				Calendar end = Calendar.getInstance();
				end.setTimeInMillis(endTime.getTime());

				// 计算两个时间间隔天数
				int nDays = (int) (endTime.getTime() / 86400000l - startTime.getTime() / 86400000l + 1);

				for (int i = 0; i < iBISearchPeriod.getPoP(); i++) {
					start.add(Calendar.DATE, -(i + 1) * nDays);
					end.add(Calendar.DATE, -(i + 1) * nDays);

					String strCond2 = String.format("(%1$s >= STARTOFWEEK('%2$s')) AND (%1$s <= ENDOFWEEK('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("PoP%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}
			}
		} else if (IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {

			String strCond = String.format("(%1$s >= STARTOFMONTH('%2$s')) AND (%1$s <= ENDOFMONTH('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			searchCondMap.put("", SearchCustomCond.of(strCond, "PQL"));

			if (iBISearchPeriod.getPoP() > 0) {
				Calendar start = Calendar.getInstance();
				start.setTimeInMillis(startTime.getTime());

				Calendar end = Calendar.getInstance();
				end.setTimeInMillis(endTime.getTime());

				for (int i = 0; i < iBISearchPeriod.getPoP(); i++) {
					start.add(Calendar.MONTH, -(i + 1));
					end.add(Calendar.MONTH, -(i + 1));

					String strCond2 = String.format("(%1$s >= STARTOFMONTH('%2$s')) AND (%1$s <= ENDOFMONTH('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("PoP%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}
			}
		} else if (IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {

			String strCond = String.format("(%1$s >= STARTOFQUARTER('%2$s')) AND (%1$s <= ENDOFQUARTER('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			searchCondMap.put("", SearchCustomCond.of(strCond, "PQL"));

			if (iBISearchPeriod.getPoP() > 0) {
				Calendar start = Calendar.getInstance();
				start.setTimeInMillis(startTime.getTime());

				Calendar end = Calendar.getInstance();
				end.setTimeInMillis(endTime.getTime());

				for (int i = 0; i < iBISearchPeriod.getPoP(); i++) {
					start.add(Calendar.MONTH, -(i + 1) * 3);
					end.add(Calendar.MONTH, -(i + 1) * 3);

					String strCond2 = String.format("(%1$s >= STARTOFQUARTER('%2$s')) AND (%1$s <= ENDOFQUARTER('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("PoP%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}
			}
		} else if (IBISearchPeriod.UNIT_YEAR.equals(strUnit)) {

			String strCond = String.format("(%1$s >= STARTOFYEAR('%2$s')) AND (%1$s <= ENDOFYEAR('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			searchCondMap.put("", SearchCustomCond.of(strCond, "PQL"));

			if (iBISearchPeriod.getPoP() > 0) {
				Calendar start = Calendar.getInstance();
				start.setTimeInMillis(startTime.getTime());

				Calendar end = Calendar.getInstance();
				end.setTimeInMillis(endTime.getTime());

				for (int i = 0; i < iBISearchPeriod.getPoP(); i++) {
					start.add(Calendar.YEAR, -(i + 1));
					end.add(Calendar.YEAR, -(i + 1));

					String strCond2 = String.format("(%1$s >= STARTOFYEAR('%2$s')) AND (%1$s <= ENDOFYEAR('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("PoP%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}
			}
		} else
			throw new Exception(String.format("无法识别的单位[%1$s]", strUnit));

		if (iBISearchPeriod.getYoY() > 0) {
			Calendar start = Calendar.getInstance();
			start.setTimeInMillis(startTime.getTime());

			Calendar end = Calendar.getInstance();
			end.setTimeInMillis(endTime.getTime());

			int nStartWeekOfYear = start.get(Calendar.WEEK_OF_YEAR);
			int nEndWeekOfYear = end.get(Calendar.WEEK_OF_YEAR);

			for (int i = 0; i < iBISearchPeriod.getYoY(); i++) {
				start.add(Calendar.YEAR, -(i + 1));
				end.add(Calendar.YEAR, -(i + 1));

				if (IBISearchPeriod.UNIT_DAY.equals(strUnit)) {
					String strCond2 = String.format("(%1$s >= TIMESTAMP('%2$s')) AND (%1$s <= TIMESTAMP('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("YoY%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				} else if (IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {
					start.set(Calendar.WEEK_OF_YEAR, nStartWeekOfYear);
					end.set(Calendar.WEEK_OF_YEAR, nEndWeekOfYear);

					String strCond2 = String.format("(%1$s >= STARTOFWEEK('%2$s')) AND (%1$s <= ENDOFWEEK('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("YoY%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				} else if (IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {

					String strCond2 = String.format("(%1$s >= STARTOFMONTH('%2$s')) AND (%1$s <= ENDOFMONTH('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("YoY%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				} else if (IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {

					String strCond2 = String.format("(%1$s >= STARTOFQUARTER('%2$s')) AND (%1$s <= ENDOFQUARTER('%3$s'))", iBISearchPeriod.getField(), String.format("%1$tY-%1$tm-%1$td 00:00:00", start.getTime()), String.format("%1$tY-%1$tm-%1$td 23:59:59", end.getTime()));

					searchCondMap.put(String.format("YoY%1$s", i + 1), SearchCustomCond.of(strCond2, "PQL"));
				}

			}
		}

		return searchCondMap;
	}

	protected ISearchCond fillDimensionDataSetGroupParamPeriodModel(ObjectNode groupParamNode, IBISearchPeriod iBISearchPeriod, IBISearchContext iBISearchContext, IBISearchDimension iBISearchDimension, IPSSysBICubeDimension iPSSysBICubeDimension) throws Throwable {

		String strField = null;
		if (BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
			strField = iPSSysBICubeDimension.getPSDEFieldMust().getName();
		} else {
			strField = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, this, iBISearchContext, null);
		}

		java.sql.Timestamp startTime = null;
		java.sql.Timestamp endTime = null;

		String strUnit = iBISearchPeriod.getUnit();
		String strType = iBISearchPeriod.getType();

		if (!IBISearchPeriod.TYPE_STATIC.equals(strType) && !IBISearchPeriod.TYPE_DYNAMIC.equals(strType)) {
			throw new Exception(String.format("周期类型[%1$s]不支持", strType));
		}

		if (IBISearchPeriod.TYPE_STATIC.equals(strType)) {
			startTime = new Timestamp(iBISearchPeriod.getStart() * 1000);
			endTime = new Timestamp(iBISearchPeriod.getEnd() * 1000);
		} else if (IBISearchPeriod.TYPE_DYNAMIC.equals(strType)) {

			Calendar start = Calendar.getInstance();
			start.setTimeInMillis(System.currentTimeMillis());
			Calendar end = Calendar.getInstance();
			end.setTimeInMillis(System.currentTimeMillis());

			if (IBISearchPeriod.TYPE_DYNAMIC.equals(strType)) {
				if (IBISearchPeriod.UNIT_DAY.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.DATE, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.DATE, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.WEEK_OF_YEAR, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.WEEK_OF_YEAR, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.MONTH, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.MONTH, (int) iBISearchPeriod.getEnd());
					}
				} else if (IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.MONTH, (int) iBISearchPeriod.getStart() * 3);
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.MONTH, (int) iBISearchPeriod.getEnd() * 3);
					}
				} else if (IBISearchPeriod.UNIT_YEAR.equals(strUnit)) {
					if (iBISearchPeriod.getStart() != 0) {
						start.add(Calendar.YEAR, (int) iBISearchPeriod.getStart());
					}
					if (iBISearchPeriod.getEnd() != 0) {
						end.add(Calendar.YEAR, (int) iBISearchPeriod.getEnd());
					}
				} else
					throw new Exception(String.format("无法识别的单位[%1$s]", strUnit));
			}

			startTime = new Timestamp(start.getTimeInMillis());
			endTime = new Timestamp(end.getTimeInMillis());
		}

		if (startTime == null) {
			throw new Exception("无法计算起始时间");
		}

		if (endTime == null) {
			throw new Exception("无法计算结束时间");
		}

		if (endTime.getTime() < startTime.getTime()) {
			throw new Exception("结束时间小于开始时间");
		}

		if (IBISearchPeriod.UNIT_DAY.equals(strUnit)) {

			String strGroupCode = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, String.format("DATEFORMAT(%1$s, '%%Y%%m%%d')", strField), this, iBISearchContext, null);
			groupParamNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);

			String strCond = String.format("(%1$s >= TIMESTAMP('%2$s')) AND (%1$s <= TIMESTAMP('%3$s'))", strField, String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			return SearchCustomCond.of(strCond, "PQL");
		} else if (IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {

			String strGroupCode = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, String.format("YEARWEEKCHAR(%1$s)", strField), this, iBISearchContext, null);
			groupParamNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);

			String strCond = String.format("(%1$s >= STARTOFWEEK('%2$s')) AND (%1$s <= ENDOFWEEK('%3$s'))", strField, String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			return SearchCustomCond.of(strCond, "PQL");
		} else if (IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {

			String strGroupCode = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, String.format("DATEFORMAT(%1$s, '%%Y%%m')", strField), this, iBISearchContext, null);
			groupParamNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);

			String strCond = String.format("(%1$s >= STARTOFMONTH('%2$s')) AND (%1$s <= ENDOFMONTH('%3$s'))", strField, String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			return SearchCustomCond.of(strCond, "PQL");
		} else if (IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {

			String strGroupCode = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, String.format("YEARQUARTERCHAR(%1$s)", strField), this, iBISearchContext, null);
			groupParamNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);

			String strCond = String.format("(%1$s >= STARTOFQUARTER('%2$s')) AND (%1$s <= ENDOFQUARTER('%3$s'))", strField, String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			return SearchCustomCond.of(strCond, "PQL");
		} else if (IBISearchPeriod.UNIT_YEAR.equals(strUnit)) {

			String strGroupCode = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, String.format("DATEFORMAT(%1$s, '%%Y')", strField), this, iBISearchContext, null);
			groupParamNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);

			String strCond = String.format("(%1$s >= STARTOFYEAR('%2$s')) AND (%1$s <= ENDOFYEAR('%3$s'))", strField, String.format("%1$tY-%1$tm-%1$td 00:00:00", startTime), String.format("%1$tY-%1$tm-%1$td 23:59:59", endTime));

			return SearchCustomCond.of(strCond, "PQL");
		} else
			throw new Exception(String.format("无法识别的单位[%1$s]", strUnit));
	}

	protected List doFetch(ISearchContext iSearchContext, IPSDEDataSet iPSDEDataSet) throws Throwable {
		return (List) this.getDataEntityRuntime().execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				Page page = getDataEntityRuntime().getSystemPersistentAdapterMust().fetchDataSet(getDataEntityRuntime(), iPSDEDataSet, iSearchContext, null);
				return page != null ? page.getContent() : null;
			}
		}, null);
	}

	protected List<IPSDEField> getDynaFields() throws Throwable {
		List<IPSDEField> psDEFields = this.getDataEntityRuntime().getPSDEFields(true);
		if (ObjectUtils.isEmpty(psDEFields)) {
			return null;
		}

		List<IPSDEField> list = new ArrayList<IPSDEField>();
		for (IPSDEField iPSDEField : psDEFields) {
			if (!iPSDEField.isDynaStorageDEField()) {
				continue;
			}
			list.add(iPSDEField);
		}
		return list;
	}

	protected Collection<ObjectNode> getDynaFieldDataSetGroupParamModels(IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {

		Map<String, ObjectNode> map = new LinkedHashMap<String, ObjectNode>();

		Set<String> columnList2 = new LinkedHashSet<String>();

		// 判断数据项
		for (String strColumn : columnList) {
			IPSSysBICubeMeasure iPSSysBICubeMeasure = this.getPSSysBICubeMeasure(strColumn, true);
			if (iPSSysBICubeMeasure == null || !iPSSysBICubeMeasure.isDataItem()) {
				continue;
			}

			if (BIMeasureType.CALCULATED.value.equals(iPSSysBICubeMeasure.getMeasureType())) {
				String strFormula = this.getSysBICubeCalculatedMeasureParser(false).parse(iPSSysBICubeMeasure, this, iBISearchContext, columnList2);

				String strGroupCode = "";
				strGroupCode += String.format("(%1$s) AS %2$s", strFormula, iPSSysBICubeMeasure.getCodeName().toUpperCase());

				ObjectNode objectNode = JsonUtils.createObjectNode();
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, String.format("%1$s_%2$s", "DATAITEM", iPSSysBICubeMeasure.getCodeName()).toLowerCase());
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPJOINCODE, "NONE");

				map.put(strColumn, objectNode);
			}
		}

		if (!this.getDataEntityRuntime().isEnableDynaStorage() || this.getDataEntityRuntime().getDEDynaStorageUtilRuntime() == null) {
			return map.values();
		}

		List<IPSDEField> psDEFields = this.getDynaFields();
		if (ObjectUtils.isEmpty(psDEFields)) {
			return map.values();
		}
		
		IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = this.getDataEntityRuntime().getDEDynaStorageUtilRuntime();
		if(iDEDynaStorageUtilRuntime.getStorageMode() == IDEDynaStorageUtilRuntime.STORAGEMODE_EXTERNAL_KEY_VALUE_TABLE) {
			IPSDEField parentTypePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTTYPE.value, false);
			IPSDEField parentIdPSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTID.value, false);
			IPSDEField namePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(IDEDynaStorageUtilRuntime.PREDEFINEDFIELD_NAME, false);

			String strMajorAlias = "dataresult";
			String strKeyCode = "";

			strKeyCode = String.format("%1$s.%2$s", strMajorAlias, this.getDataEntityRuntime().getKeyPSDEField().getName());

			for (int i = 0; i < psDEFields.size(); i++) {
				IPSDEField iPSDEField = psDEFields.get(i);

				if (columnList != null && !columnList.contains(iPSDEField.getName())) {
					continue;
				}

				if (map.containsKey(iPSDEField.getName())) {
					continue;
				}

				String strAlias = String.format("dynaresult%1$s", i);

				IPSDEField storagePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(iPSDEField);

				ObjectNode objectNode = JsonUtils.createObjectNode();

				String strJoinCode = String.format("LEFT JOIN %1$s %2$s ON (%3$s= %2$s.%4$s AND %2$s.%5$s = '%6$s' AND %2$s.%7$s = '%8$s')", iDEDynaStorageUtilRuntime.getStorageDataEntityRuntime().getTableName(), strAlias, strKeyCode, parentIdPSDEField.getName(), parentTypePSDEField.getName(), this.getDataEntityRuntime().getName(), namePSDEField.getName(), iPSDEField.getName());
				// 构建连接代码
				String strGroupCode = "";
				strGroupCode += String.format("%1$s.%2$s AS %3$s", strAlias, storagePSDEField.getName(), iPSDEField.getName());

				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, String.format("%1$s_%2$s", strAlias, iPSDEField.getName()).toLowerCase());
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPJOINCODE, strJoinCode);

				map.put(iPSDEField.getName(), objectNode);
			}
		}
		

		return map.values();

	}

	protected ObjectNode getMeasureDataSetGroupParamModel(IBISearchContext iBISearchContext, IBISearchMeasure iBISearchMeasure, IPSSysBICubeMeasure iPSSysBICubeMeasure) throws Throwable {

		ObjectNode objectNode = JsonUtils.createObjectNode();

		objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, iPSSysBICubeMeasure.getCodeName());
		objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETALIAS, iPSSysBICubeMeasure.getCodeName());

		IPSDEField iPSDEField = iPSSysBICubeMeasure.getPSDEField();
		if (iPSDEField != null) {
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETPSDEFIELD, iPSSysBICubeMeasure.getObjectNode().get(PSSysBICubeMeasureImpl.ATTR_GETPSDEFIELD).deepCopy());
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, iPSDEField.getName());
		}

		objectNode.put(PSDEDataSetGroupParamImpl.ATTR_ISENABLEGROUP, false);

		if (BIMeasureType.COMMON.value.equals(iPSSysBICubeMeasure.getMeasureType())) {
			if (iPSDEField == null) {
				throw new Exception(String.format("指标[%1$s]未指定属性", iPSSysBICubeMeasure.getName()));
			}

			if (StringUtils.hasLength(iBISearchMeasure.getAggMode())) {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETAGGMODE, iBISearchMeasure.getAggMode());
			} else {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETAGGMODE, iPSSysBICubeMeasure.getAggMode());
			}

			if (iPSDEField.getDEFType() == DEFType.DYNASTORAGE.value) {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE, iPSDEField.getName());
			}
		} else if (BIMeasureType.CALCULATED.value.equals(iPSSysBICubeMeasure.getMeasureType())) {
			// String strFormula =
			// this.measureFormulaMap.get(iPSSysBICubeMeasure.getCodeName());
			// Set<String> columnList =
			// this.measureFormulaFieldListMap.get(iPSSysBICubeMeasure.getCodeName());
			// if(!StringUtils.hasLength(strFormula)) {
			//
			// columnList = new LinkedHashSet<String>();
			// strFormula =
			// this.getSysBICubeCalculatedMeasureParser(false).parse(iPSSysBICubeMeasure,
			// this, iBISearchContext, columnList);
			// this.measureFormulaMap.put(iPSSysBICubeMeasure.getCodeName(),
			// strFormula);
			// this.measureFormulaFieldListMap.put(iPSSysBICubeMeasure.getCodeName(),
			// columnList);
			// }
			Set<String> columnList = new LinkedHashSet<String>();
			String strFormula = this.getSysBICubeCalculatedMeasureParser(false).parse(iPSSysBICubeMeasure, this, iBISearchContext, columnList);

			if (!iPSSysBICubeMeasure.isDataItem()) {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strFormula);
				if (!ObjectUtils.isEmpty(columnList)) {
					objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE, StringUtils.collectionToDelimitedString(columnList, ","));
				}
			} else {
				if (StringUtils.hasLength(iBISearchMeasure.getAggMode())) {
					objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETAGGMODE, iBISearchMeasure.getAggMode());
				} else {
					objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETAGGMODE, iPSSysBICubeMeasure.getAggMode());
				}
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE, iPSSysBICubeMeasure.getCodeName());
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, iPSSysBICubeMeasure.getCodeName());
			}
		} else
			throw new Exception(String.format("未支持的指标类型[%1$s]", iPSSysBICubeMeasure.getMeasureType()));

		return objectNode;
	}

	protected ObjectNode getDimensionDataSetGroupParamModel(IBISearchContext iBISearchContext, IBISearchDimension iBISearchDimension, IPSSysBICubeDimension iPSSysBICubeDimension, boolean bText) throws Throwable {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		IPSDEField iPSDEField = bText ? iPSSysBICubeDimension.getTextPSDEFieldMust() : iPSSysBICubeDimension.getPSDEField();
		if (bText) {
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, String.format("%1$s_text", iPSSysBICubeDimension.getCodeName()));
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETALIAS, String.format("%1$s_text", iPSSysBICubeDimension.getCodeName()));
		} else {
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, iPSSysBICubeDimension.getCodeName());
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETALIAS, iPSSysBICubeDimension.getCodeName());
		}

		if (iPSDEField != null) {
			if (bText) {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETPSDEFIELD, iPSSysBICubeDimension.getObjectNode().get(PSSysBICubeDimensionImpl.ATTR_GETTEXTPSDEFIELD).deepCopy());
			} else {
				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETPSDEFIELD, iPSSysBICubeDimension.getObjectNode().get(PSSysBICubeDimensionImpl.ATTR_GETPSDEFIELD).deepCopy());
			}
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETNAME, iPSDEField.getName());
		}

		objectNode.put(PSDEDataSetGroupParamImpl.ATTR_ISENABLEGROUP, true);

		if (bText || iPSSysBICubeDimension.getPSSysBIDimension() == null) {
			// 常规维度
			if (BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				if (iPSDEField == null) {
					throw new Exception(String.format("维度[%1$s]未指定属性", iPSSysBICubeDimension.getName()));
				}

				if (!bText && iBISearchDimension.getPeriod() != null) {
					if (DataTypeUtils.isDateTimeDataType(iPSSysBICubeDimension.getStdDataType())) {
						ISearchCond iSearchCond = this.fillDimensionDataSetGroupParamPeriodModel(objectNode, iBISearchDimension.getPeriod(), iBISearchContext, iBISearchDimension, iPSSysBICubeDimension);
						if (iSearchCond != null) {
							iBISearchContext.getSearchContext().getSearchCondsIf().add(iSearchCond);
						}
					}
				}

				// if(iPSDEField.isDynaStorageDEField()) {
				// if(!this.getDataEntityRuntime().isEnableDynaStorage() ||
				// this.getDataEntityRuntime().getDEDynaStorageUtilRuntime() ==
				// null) {
				// throw new Exception(String.format("实体[%1$s]未启用动态存储",
				// this.getDataEntityRuntime().getName()));
				// }
				//
				// IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime =
				// this.getDataEntityRuntime().getDEDynaStorageUtilRuntime();
				// IPSDEField parentTypePSDEField =
				// iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTTYPE.value,
				// false);
				// IPSDEField parentIdPSDEField =
				// iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTID.value,
				// false);
				// IPSDEField storagePSDEField =
				// iDEDynaStorageUtilRuntime.getStoragePSDEField(iPSDEField);
				//
				// String strMajorAlias = "dataresult";
				// String strKeyCode = "";
				//
				// strKeyCode = String.format("%1$s.%2$s", strMajorAlias,
				// this.getDataEntityRuntime().getKeyPSDEField().getName());
				//
				// String strJoinCode = String.format("LEFT JOIN %1$s %2$s ON
				// (%3$s= %2$s.%4$s AND %2$s.%5$s = '%6$s')",
				// iDEDynaStorageUtilRuntime.getStorageDataEntityRuntime().getTableName(),
				// iPSSysBICubeDimension.getCodeName(), strKeyCode,
				// parentIdPSDEField.getName(), parentTypePSDEField.getName(),
				// this.getDataEntityRuntime().getName());
				// //构建连接代码
				// String strGroupCode = "";
				// strGroupCode += String.format("%1$s.%2$s AS %3$s",
				// iPSSysBICubeDimension.getCodeName(),
				// storagePSDEField.getName(), iPSDEField.getName());
				//
				// objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE,
				// strGroupCode);
				// objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPJOINCODE,
				// strJoinCode);
				// }

			} else if (!bText && BIDimensionType.CALCULATED.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				// String strFormula =
				// this.dimensionFormulaMap.get(iPSSysBICubeDimension.getCodeName());
				// Set<String> columnList =
				// this.dimensionFormulaFieldListMap.get(iPSSysBICubeDimension.getCodeName());
				// if(!StringUtils.hasLength(strFormula)) {
				// columnList = new LinkedHashSet<String>();
				// strFormula =
				// this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension,
				// this, iBISearchContext, columnList);
				// this.dimensionFormulaMap.put(iPSSysBICubeDimension.getCodeName(),
				// strFormula);
				// this.dimensionFormulaFieldListMap.put(iPSSysBICubeDimension.getCodeName(),
				// columnList);
				// }
				//

				if (iBISearchDimension.getPeriod() != null && DataTypeUtils.isDateTimeDataType(iPSSysBICubeDimension.getStdDataType())) {
					ISearchCond iSearchCond = this.fillDimensionDataSetGroupParamPeriodModel(objectNode, iBISearchDimension.getPeriod(), iBISearchContext, iBISearchDimension, iPSSysBICubeDimension);
					if (iSearchCond != null) {
						iBISearchContext.getSearchContext().getSearchCondsIf().add(iSearchCond);
					}
				}

				Set<String> columnList = new LinkedHashSet<String>();
				String strFormula = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, this, iBISearchContext, columnList);

				objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strFormula);
				if (!ObjectUtils.isEmpty(columnList)) {
					objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETSELECTCODE, StringUtils.collectionToDelimitedString(columnList, ","));
				}
			} else
				throw new Exception(String.format("未支持的维度类型[%1$s]", iPSSysBICubeDimension.getDimensionType()));
		} else {
			// 引用维度
			String strHierarchy = iBISearchDimension.getHierarchy();
			IPSSysBIHierarchy iPSSysBIHierarchy = null;
			List<IPSSysBIHierarchy> list = iPSSysBICubeDimension.getPSSysBIDimension().getAllPSSysBIHierarchies();
			if (!ObjectUtils.isEmpty(list)) {
				for (IPSSysBIHierarchy item : list) {
					if (StringUtils.hasLength(strHierarchy)) {
						if (strHierarchy.equalsIgnoreCase(item.getCodeName())) {
							iPSSysBIHierarchy = item;
							break;
						}
					} else {
						iPSSysBIHierarchy = item;
						break;
					}
				}
			}

			if (iPSSysBIHierarchy == null) {
				throw new Exception(String.format("无法获取指定维度层次体系[%1$s]", strHierarchy));
			}

			Set<IPSSysBILevel> selectedPSSysBILevelList = new LinkedHashSet<IPSSysBILevel>();
			// 默认放入唯一值
			List<IPSSysBILevel> psSysBILevelList = iPSSysBIHierarchy.getAllPSSysBILevels();
			if (!ObjectUtils.isEmpty(psSysBILevelList)) {
				for (IPSSysBILevel item : psSysBILevelList) {
					if (item.isUniqueMembers()) {
						selectedPSSysBILevelList.add(item);
					} else {
						if (!ObjectUtils.isEmpty(iBISearchDimension.getLevels())) {
							for (String strLevel : iBISearchDimension.getLevels()) {
								if (strLevel.equalsIgnoreCase(item.getCodeName())) {
									selectedPSSysBILevelList.add(item);
									break;
								}
							}
						}
					}
				}
			}

			// 计算选择列
			Map<String, String> levelMap = new LinkedHashMap<String, String>();
			for (IPSSysBILevel item : selectedPSSysBILevelList) {
				if (item.getValuePSDEField() == null) {
					continue;
				}
				levelMap.put(item.getValuePSDEField().getName(), String.format("%1$s__%2$s", iPSSysBICubeDimension.getCodeName(), item.getCodeName()));
				if (item.getTextPSDEField() != null) {
					levelMap.put(item.getTextPSDEField().getName(), String.format("%1$s__%2$s_text", iPSSysBICubeDimension.getCodeName(), item.getCodeName()));
				}
			}

			// levelMap
			String strMajorAlias = "dataresult";
			String strKeyCode = "";
			// 常规维度
			if (BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				strKeyCode = String.format("%1$s.%2$s", strMajorAlias, iPSSysBICubeDimension.getPSDEFieldMust().getName());
			} else if (BIDimensionType.CALCULATED.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				// String strFormula =
				// this.dimensionFormulaMap.get(iPSSysBICubeDimension.getCodeName());
				// Set<String> columnList =
				// this.dimensionFormulaFieldListMap.get(iPSSysBICubeDimension.getCodeName());
				// if(!StringUtils.hasLength(strFormula)) {
				// columnList = new LinkedHashSet<String>();
				// strFormula =
				// this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension,
				// this, iBISearchContext, columnList);
				// this.dimensionFormulaMap.put(iPSSysBICubeDimension.getCodeName(),
				// strFormula);
				// this.dimensionFormulaFieldListMap.put(iPSSysBICubeDimension.getCodeName(),
				// columnList);
				// }
				//
				Set<String> columnList = new LinkedHashSet<String>();
				String strFormula = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, this, iBISearchContext, columnList);
				strKeyCode = strFormula;
			} else
				throw new Exception(String.format("未支持的维度类型[%1$s]", iPSSysBICubeDimension.getDimensionType()));

			IDataEntityRuntime biHierarchyDataEntityRuntime = this.getDataEntityRuntime().getSystemRuntime().getDataEntityRuntime(iPSSysBIHierarchy.getPSDataEntityMust().getId());
			IDBDialect iDBDialect = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBDialect();

			String strJoinCode = String.format("LEFT JOIN %1$s %2$s ON (%3$s = %2$s.%4$s)", iDBDialect.getDBObjStandardName(biHierarchyDataEntityRuntime.getTableName()), iDBDialect.getDBObjStandardName(iPSSysBICubeDimension.getCodeName().toLowerCase()), strKeyCode, iDBDialect.getDBObjStandardName(biHierarchyDataEntityRuntime.getKeyPSDEField().getName()));
			// 构建连接代码
			String strGroupCode = "";
			for (java.util.Map.Entry<String, String> entry : levelMap.entrySet()) {
				if (StringUtils.hasLength(strGroupCode)) {
					strGroupCode += ",";
				}
				strGroupCode += String.format("%1$s.%2$s AS %3$s", iDBDialect.getDBObjStandardName(iPSSysBICubeDimension.getCodeName().toLowerCase()), iDBDialect.getDBObjStandardName(entry.getKey()), iDBDialect.getDBObjStandardName(entry.getValue()));
			}

			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPCODE, strGroupCode);
			objectNode.put(PSDEDataSetGroupParamImpl.ATTR_GETGROUPJOINCODE, strJoinCode);
		}

		return objectNode;
	}

	protected void resetDimensionFormulaCache(IPSSysBICubeDimension iPSysBICubeDimension) {
		// this.dimensionFormulaMap.remove(iPSysBICubeDimension.getCodeName());
		// this.dimensionFormulaFieldListMap.remove(iPSysBICubeDimension.getCodeName());
	}

	protected void resetMeasureFormulaCache(IPSSysBICubeMeasure iPSysBICubeMeasure) {
		// this.measureFormulaMap.remove(iPSysBICubeMeasure.getCodeName());
		// this.measureFormulaFieldListMap.remove(iPSysBICubeMeasure.getCodeName());
	}

	protected ISearchCond getAuthoritySearchCond(IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {
		if (ObjectUtils.isEmpty(columnList)) {
			return null;
		}

		IUserContext iUserContext = UserContext.getCurrent();
		if (iUserContext == null) {
			return null;
		}

		List<String> conditionList = new ArrayList<String>();

		for (String strColumn : columnList) {

			IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strColumn, true);
			if (iPSDEField == null) {
				continue;
			}

			IPSPickupDEField iPSPickupDEField = null;
			if (iPSDEField instanceof IPSPickupDEField) {
				iPSPickupDEField = (IPSPickupDEField) iPSDEField;
			} else if (iPSDEField instanceof IPSLinkDEField) {
				IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
				if (iPSLinkDEField.getRelatedPSDEFieldMust() instanceof IPSPickupDEField) {
					iPSPickupDEField = (IPSPickupDEField) iPSLinkDEField.getRelatedPSDEFieldMust();
				}
			}

			if (iPSPickupDEField == null) {
				continue;
			}

			IPSDER1N iPSDER1N = (IPSDER1N) iPSPickupDEField.getPSDERMust();
			if ((iPSDER1N.getMasterRS() & DER1NMasterRS.REFCHECK.value) != DER1NMasterRS.REFCHECK.value) {
				continue;
			}

			// 需要过滤条件
			IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId());

			IPSDEDataSet iPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
			if (iPSDEDataSet == null) {
				iPSDEDataSet = refDataEntityRuntime.getDefaultPSDEDataSet();
			}

			if (ObjectUtils.isEmpty(iPSDEDataSet.getPSDEDataQueries())) {
				continue;
			}

			IDEDQSQLSelectParser iDEDQSQLSelectParser = this.getSystemRuntime().getRuntimeObject(IDEDQSQLSelectParser.class, null);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			refDataEntityRuntime.getDataEntityAccessManager().testDataAccessAction(iUserContext, null, null, searchContextDTO, DataAccessActions.READ);

			List<String> dqDataSqls = new ArrayList<>();

			for (IPSDEDataQuery iPSDEDataQuery : iPSDEDataSet.getPSDEDataQueries()) {
				IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = refDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, refDataEntityRuntime.getSysDBSchemeRuntimeMust().getDBType(), false);
				StringBuilder sb = new StringBuilder();
				IPSDEDataQueryCode curDBPSDEDataQueryCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCode();

				if (iDEDQSQLSelectParser != null) {
					Set<String> set = new HashSet<String>();
					set.add(refDataEntityRuntime.getKeyPSDEField().getName());
					sb.append(iDEDQSQLSelectParser.reselect(curDBPSDEDataQueryCode.getQueryCode(), set, iDEDataQueryCodeRuntime.getDBDialect(), refDataEntityRuntime, iDEDataQueryCodeRuntime));
				} else {
					sb.append(curDBPSDEDataQueryCode.getQueryCode());
				}

				// 查询模型 自身条件
				boolean bOutputWhere = false;
				boolean bCondFirst = true;

				if (!ObjectUtils.isEmpty(curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds())) {

					for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
						String strCondition = queryCodeCond.getCustomCond();
						if (!StringUtils.hasLength(strCondition)) {
							continue;
						}

						if (StringUtils.hasLength(queryCodeCond.getCustomType())) {
							IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = this.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
							if (iDEDQSQLCustomCondParser == null) {
								throw new Exception(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
							}

							try {
								strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, searchContextDTO, searchContextDTO != null ? searchContextDTO.any() : null);
							} catch (Throwable ex) {
								throw new Exception(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
							}
						}

						if (!bOutputWhere) {
							sb.append(" WHERE ");
							bOutputWhere = true;
						}
						if (bCondFirst) {
							bCondFirst = false;
						} else {
							sb.append(" AND ");
						}
						sb.append(String.format("(%1$s)", strCondition));
					}
				}

				// 附加权限
				StringBuilder stringBuilder = new StringBuilder();
				this.genAuthoritySearchCustomCond(stringBuilder, searchContextDTO, iDEDataQueryCodeRuntime, searchContextDTO);
				String strCondition = stringBuilder.toString();
				if (StringUtils.hasLength(strCondition)) {
					if (!bOutputWhere) {
						sb.append(" WHERE ");
						bOutputWhere = true;
					}
					if (bCondFirst) {
						bCondFirst = false;
					} else {
						sb.append(" AND ");
					}
					sb.append(String.format("%1$s", strCondition));
				}

				// 判断是否输出条件

				dqDataSqls.add(sb.toString());
			}
			String strDataSql = String.join(" UNION ", dqDataSqls);
			// groupQuery.setDatasql(strDataSql);

			conditionList.add(String.format("%1$s IN (%2$s)", strColumn, strDataSql));
		}

		if (ObjectUtils.isEmpty(conditionList)) {
			return null;
		}

		return SearchCustomCond.of(String.join(" AND ", conditionList));
	}

	protected void genAuthoritySearchCustomCond(StringBuilder stringBuilder, ISearchCond cond, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext) throws Throwable {
		if (cond instanceof ISearchFieldCond) {
			SearchFieldCond searchFieldCond = (SearchFieldCond) cond;
			IPSDEField iPSDEField = iDEDataQueryCodeRuntime.getDataEntityRuntime().getPSDEField(searchFieldCond.getFieldName(), false);
			String strExpression = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(searchFieldCond.getFieldName(), false).getExpression();
			String condition = iDEDataQueryCodeRuntime.getDBDialect().getConditionSQL(strExpression, iPSDEField.getStdDataType(), searchFieldCond.getCondOp(), searchFieldCond.isParamMode() ? iSearchContext.get(String.valueOf(searchFieldCond.getValue())) : searchFieldCond.getValue(), false, iSearchContext);
			stringBuilder.append(condition);
		} else if (cond instanceof ISearchGroupCond) {
			ISearchGroupCond searchGroupCond = (ISearchGroupCond) cond;
			List<ISearchCond> childConds = searchGroupCond.getSearchCondsIf();
			if (!ObjectUtils.isEmpty(childConds)) {
				stringBuilder.append("(");
				for (int i = 0; i < childConds.size(); i++) {
					if (i > 0)
						stringBuilder.append(" " + searchGroupCond.getCondOp() + " ");
					genAuthoritySearchCustomCond(stringBuilder, childConds.get(i), iDEDataQueryCodeRuntime, iSearchContext);
				}
				stringBuilder.append(")");
			}
		} else if (cond instanceof ISearchCustomCond) {
			ISearchCustomCond iSearchCustomCond = (ISearchCustomCond) cond;

			if (StringUtils.hasLength(iSearchCustomCond.getCustomType())) {
				// 获取自定义解析器
				IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = this.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, iSearchCustomCond.getCustomType());
				if (iDEDQSQLCustomCondParser == null) {
					throw new Exception(String.format("无法获取指定[%1$s]自定义SQL条件解析器", iSearchCustomCond.getCustomType()));
				}

				String strRealCustomCond = null;
				try {
					strRealCustomCond = iDEDQSQLCustomCondParser.parse(iSearchCustomCond, iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), null, iSearchContext, iSearchContext != null ? iSearchContext.any() : null);
				} catch (Throwable ex) {
					throw new Exception(String.format("解析自定义条件[%1$s]发生异常，%2$s", iSearchCustomCond.getCustomCond(), ex.getMessage()), ex);
				}

				stringBuilder.append(strRealCustomCond);
			} else {
				stringBuilder.append(iSearchCustomCond.getCustomCond());
			}
		}
	}

	protected boolean isEnableAuthoritySearchCond() {
		return this.bEnableAuthoritySearchCond;
	}

}
