package net.ibizsys.central.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.SystemGateway;
import net.ibizsys.central.SystemModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.SysDBSchemeRuntimeHolder;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.SqlCommandParam;
import net.ibizsys.runtime.util.SqlParam;

public abstract class SysDBSchemeRuntimeBase extends SystemModelRuntimeBase implements ISysDBSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDBSchemeRuntimeBase.class);

	/**
	 * 数据库服务
	 */
	private static IDBDataService dbDataService;

	public static void setDefaultDBDataService(IDBDataService dbDataService) {
		SysDBSchemeRuntimeBase.dbDataService = dbDataService;
	}

	public static IDBDataService getDefaultDBDataService() {
		return SysDBSchemeRuntimeBase.dbDataService;
	}

	private IPSSysDBScheme iPSSysDBScheme = null;

	private String strDBType = DBTypes.MYSQL5;

	private boolean bDBTypeDefined = false;

	private String strRealDBType = null;

	private String strDSLink = null;

	private String strSaaSDCIdColumnName = null;

	private String strSaaSDataIdColumnName = null;

	private Object objDataSourceTag = null;

	private Map<String, ISysDBTableRuntime> sysDBTableRuntimeMap = new HashMap<String, ISysDBTableRuntime>();

	private Map<String, Object> properties = null;

	private IDBDataService iDBDataService = null;

	private boolean bDropIndexFirst = false;

	private boolean bUpdateSchema = true;
	
	private boolean bInstalled = false;
	
	private IDBDialect iDBDialect = null;

	private ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext = new ISysDBSchemeRuntimeContext() {

		@Override
		public ISysDBSchemeRuntime getSysDBSchemeRuntime() {
			return getSelf();
		}

	};

	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysDBScheme iPSSysDBScheme) throws Exception {
		this.setSystemRuntimeBase(iSystemRuntimeContext.getSystemRuntime());
		this.iPSSysDBScheme = iPSSysDBScheme;
		Assert.notNull(this.iPSSysDBScheme, "传入系统数据库体系模型对象无效");

		this.setDSLink(this.getPSSysDBScheme().getDSLink());
		this.setSaaSDataIdColumnName(this.getPSSysDBScheme().getSaaSDataIdColumnName());
		this.setSaaSDCIdColumnName(this.getPSSysDBScheme().getSaaSDCIdColumnName());

		if (this.getPSSysDBScheme().isExistingModel() || this.getPSSysDBScheme().getPSSysModelGroup() != null || !StringUtils.hasLength(this.getPSSysDBScheme().getDSLink())) {
			this.setUpdateSchema(false);
		}

		String strCodeName = this.iPSSysDBScheme.getCodeName();
		if (!StringUtils.hasLength(strCodeName)) {
			strCodeName = this.getDSLink();
		}
		this.setConfigFolder("sysdbscheme." + PSModelUtils.calcUniqueTag(this.iPSSysDBScheme.getPSSysModelGroup(), this.getDSLink()));
		this.onInit();

		this.fillDataSourceInfo();
	}

	@Override
	protected void onInit() throws Exception {

		this.setDataSourceTag(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".datasourcetag", null));
		if (ObjectUtils.isEmpty(this.getDataSourceTag())) {
			String strDefaultDSName = this.getPSSysDBScheme().getDBInstTag();
			if (!StringUtils.hasLength(strDefaultDSName)) {
				// 全局默认数据源配置
				strDefaultDSName = this.getSystemRuntimeSetting().getParam("defaultdbinsttag", null);
			}
			if (!StringUtils.hasLength(strDefaultDSName)) {
				strDefaultDSName = this.getDSLink();
			}
			this.setDataSourceTag(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".datasource", strDefaultDSName));
		}
		
		String strDBType = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dbtype", null);
		if (StringUtils.hasLength(strDBType)) {
			this.setDBType(strDBType);
			this.setDBTypeDefined(true);
		}

		String strRealDBType = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".realdbtype", null);
		if (StringUtils.hasLength(strRealDBType)) {
			this.setRealDBType(strRealDBType);
		}

		this.setSaaSDCIdColumnName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".saasdccolumn", this.getSaaSDCIdColumnName()));
		this.setSaaSDataIdColumnName(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".saasidcolumn", this.getSaaSDataIdColumnName()));
		this.setDropIndexFirst(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".dropindexfirst", this.isDropIndexFirst()));
		this.setUpdateSchema(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".updateschema", this.isUpdateSchema()));

		java.util.List<IPSSysDBTable> psSysDBTableList = this.getPSSysDBScheme().getAllPSSysDBTables();
		if (psSysDBTableList != null) {
			for (IPSSysDBTable iPSSysDBTable : psSysDBTableList) {
				ISysDBTableRuntime iSysDBTableRuntime = this.createSysDBTableRuntime(iPSSysDBTable);
				try {
					iSysDBTableRuntime.init(this.getSysDBSchemeRuntimeContext(), iPSSysDBTable);
					sysDBTableRuntimeMap.put(iPSSysDBTable.getName().toUpperCase(), iSysDBTableRuntime);
				}
				catch (Exception ex) {
					throw new Exception(String.format("初始化数据库[%1$s]运行时发生异常，%2$s", iPSSysDBTable.getName(), ex.getMessage()), ex);
				}
			}
		}

		super.onInit();

	}

	protected void fillDataSourceInfo() {
		log.info(String.format("数据库体系[%1$s]类型[%2$s]数据源[%3$s]更新[%4$s]", 
				PSModelUtils.calcUniqueTag(this.getPSSysDBScheme().getPSSysModelGroup(), this.getDSLink()),
				this.getDBType(),
				this.getDataSourceTag(),
				this.isUpdateSchema()));
		
		if (SystemGateway.getInstance(true) != null) {
			SystemGateway.getInstance(false).fillDataSourceInfo(this);
		}
	}

	protected ISysDBTableRuntime createSysDBTableRuntime(IPSSysDBTable iPSSysDBTable) {
		return new SysDBTableRuntime();
	}

	protected ISysDBSchemeRuntimeContext getSysDBSchemeRuntimeContext() {
		return this.iSysDBSchemeRuntimeContext;
	}

	private SysDBSchemeRuntimeBase getSelf() {
		return this;
	}

	@Override
	public ISysDBTableRuntime getSysDBTableRuntime(String strTableName, boolean bTryMode) {
		ISysDBTableRuntime iSysDBTableRuntime = this.sysDBTableRuntimeMap.get(strTableName.toUpperCase());
		if (iSysDBTableRuntime != null || bTryMode) {
			return iSysDBTableRuntime;
		}
		throw new SysDBSchemeRuntimeException(this, String.format("无法获取指定数据表[%1$s]运行时对象", strTableName));
	}

	@Override
	public IPSSysDBScheme getPSSysDBScheme() {
		return this.iPSSysDBScheme;
	}

	@Override
	public String getId() {
		return getPSSysDBScheme().getId();
	}

	@Override
	public String getName() {
		return getPSSysDBScheme().getName();
	}

	@Override
	public String getDBType() {
		return this.strDBType;
	}

	public void setDBType(String strDBType) {
		this.strDBType = strDBType;

	}

	@Override
	public boolean isDBTypeDefined() {
		return this.bDBTypeDefined;
	}

	protected void setDBTypeDefined(boolean bDBTypeDefined) {
		this.bDBTypeDefined = bDBTypeDefined;
	}

	@Override
	public String getDSLink() {
		return this.strDSLink;
	}

	/**
	 * 设置数据源连接
	 * 
	 * @param strDSLink
	 */
	public void setDSLink(String strDSLink) {
		this.strDSLink = strDSLink;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDBScheme();
	}

	@Override
	public Object insert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		try {
			this.push();
			return this.onInsert(strTableName, args, extParamMap);
		} finally {
			this.poll();
		}
	}

	protected Object onInsert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {

		if (ObjectUtils.isEmpty(args)) {
			throw new SysDBSchemeRuntimeException(this, String.format("传入数据列表无效"));
		}

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		List<SqlCommandParam> list = new ArrayList<SqlCommandParam>();
		for (Map<String, Object> paramMap : args) {
			Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();

			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			}

			if (extParamMap != null) {
				for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
					if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
						continue;
					}
					Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
					if (objValue instanceof SqlParam) {
						SqlParam sqlParam = (SqlParam) objValue;
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					} else {
						SqlParam sqlParam = SqlParam.value(objValue);
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				}
			}

			list.add(new SqlCommandParam(sqlParamMap.values()));
		}

		return this.getDBDataService().insert(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, list);

	}

	@Override
	public Object update(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		try {
			push();
			return this.onUpdate(strTableName, args, extParamMap);
		} finally {
			poll();
		}
	}

	protected Object onUpdate(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {

		if (ObjectUtils.isEmpty(args)) {
			throw new SysDBSchemeRuntimeException(this, String.format("传入数据列表无效"));
		}

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		List<SqlCommandParam> list = new ArrayList<SqlCommandParam>();
		for (Map<String, Object> paramMap : args) {

			Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();
			Map<String, SqlParam> conditionSqlParamMap = new HashMap<String, SqlParam>();

			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (iSysDBColumnRuntime.isPKey()) {
						sqlParam.setCondition(true);
					}
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				}
			}

			if (extParamMap != null) {
				for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
					if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
						continue;
					}
					Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
					if (objValue instanceof SqlParam) {
						SqlParam sqlParam = (SqlParam) objValue;
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						if (!sqlParam.isCondition()) {
							sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						} else {
							conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						}
					} else {
						SqlParam sqlParam = SqlParam.value(objValue);
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						if (iSysDBColumnRuntime.isPKey()) {
							sqlParam.setCondition(true);
						}
						if (!sqlParam.isCondition()) {
							sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						} else {
							conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						}
					}
				}
			}

			for (String strKey : conditionSqlParamMap.keySet()) {
				sqlParamMap.remove(strKey);
			}

			list.add(new SqlCommandParam(sqlParamMap.values(), conditionSqlParamMap.values()));
		}

		return this.getDBDataService().update(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, list);
	}

	@Override
	public Object insert(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		try {
			this.push();
			return this.onInsert(strTableName, paramMap, extParamMap);
		} finally {
			this.poll();
		}
	}

	protected Object onInsert(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();

		for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
			if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
				continue;
			}
			Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
			if (objValue instanceof SqlParam) {
				SqlParam sqlParam = (SqlParam) objValue;
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
			} else {
				SqlParam sqlParam = SqlParam.value(objValue);
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
			}
		}

		if (extParamMap != null) {
			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			}
		}

		return this.getDBDataService().insert(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, new SqlCommandParam(sqlParamMap.values()));
	}

	@Override
	public Object update(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		try {
			this.push();
			return this.onUpdate(strTableName, paramMap, extParamMap);
		} finally {
			this.poll();
		}
	}

	protected Object onUpdate(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();
		Map<String, SqlParam> conditionSqlParamMap = new HashMap<String, SqlParam>();

		for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
			if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
				continue;
			}
			Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
			if (objValue instanceof SqlParam) {
				SqlParam sqlParam = (SqlParam) objValue;
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (!sqlParam.isCondition()) {
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			} else {
				SqlParam sqlParam = SqlParam.value(objValue);
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (iSysDBColumnRuntime.isPKey()) {
					sqlParam.setCondition(true);
				}
				if (!sqlParam.isCondition()) {
					sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			}
		}

		if (extParamMap != null) {
			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (iSysDBColumnRuntime.isPKey()) {
						sqlParam.setCondition(true);
					}
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				}
			}
		}

		for (String strKey : conditionSqlParamMap.keySet()) {
			sqlParamMap.remove(strKey);
		}

		return this.getDBDataService().update(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, new SqlCommandParam(sqlParamMap.values(), conditionSqlParamMap.values()));
	}

	@Override
	public Object delete(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		try {
			this.push();
			return this.onDelete(strTableName, paramMap, extParamMap);
		} finally {
			this.poll();
		}
	}

	protected Object onDelete(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		// Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		Map<String, SqlParam> conditionSqlParamMap = new HashMap<String, SqlParam>();

		for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
			if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
				continue;
			}
			Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
			if (objValue instanceof SqlParam) {
				SqlParam sqlParam = (SqlParam) objValue;
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (!sqlParam.isCondition()) {
					// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
					// sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			} else {
				SqlParam sqlParam = SqlParam.value(objValue);
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (iSysDBColumnRuntime.isPKey()) {
					sqlParam.setCondition(true);
				}
				if (!sqlParam.isCondition()) {
					// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
					// sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
				}
			}
		}

		if (extParamMap != null) {
			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (!sqlParam.isCondition()) {
						// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
						// sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (iSysDBColumnRuntime.isPKey()) {
						sqlParam.setCondition(true);
					}
					if (!sqlParam.isCondition()) {
						// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
						// sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				}
			}
		}

		return this.getDBDataService().delete(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, new SqlCommandParam(null, conditionSqlParamMap.values()));
	}

	@Override
	public Object delete(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		try {
			this.push();
			return this.onDelete(strTableName, args, extParamMap);
		} finally {
			this.poll();
		}
	}

	protected Object onDelete(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {

		if (ObjectUtils.isEmpty(args)) {
			throw new SysDBSchemeRuntimeException(this, String.format("传入数据列表无效"));
		}

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		List<SqlCommandParam> list = new ArrayList<SqlCommandParam>();
		for (Map<String, Object> paramMap : args) {
			Map<String, SqlParam> conditionSqlParamMap = new HashMap<String, SqlParam>();

			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (!sqlParam.isCondition()) {
						// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
						// sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (iSysDBColumnRuntime.isPKey()) {
						sqlParam.setCondition(true);
					}
					if (!sqlParam.isCondition()) {
						// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
						// sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
					}
				}
			}

			if (extParamMap != null) {
				for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
					if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
						continue;
					}
					Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
					if (objValue instanceof SqlParam) {
						SqlParam sqlParam = (SqlParam) objValue;
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						if (!sqlParam.isCondition()) {
							// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
							// sqlParam);
						} else {
							conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						}
					} else {
						SqlParam sqlParam = SqlParam.value(objValue);
						sqlParam.setName(iSysDBColumnRuntime.getStandardName());
						if (iSysDBColumnRuntime.isPKey()) {
							sqlParam.setCondition(true);
						}
						if (!sqlParam.isCondition()) {
							// sqlParamMap.put(iSysDBColumnRuntime.getStandardName(),
							// sqlParam);
						} else {
							conditionSqlParamMap.put(iSysDBColumnRuntime.getStandardName(), sqlParam);
						}
					}
				}
			}

			list.add(new SqlCommandParam(null, conditionSqlParamMap.values()));
		}

		return this.getDBDataService().delete(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, list);
	}

	@Override
	public List select(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {

		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onSelect(strTableName, paramMap, extParamMap);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onSelect(strTableName, paramMap, extParamMap);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				if (ret instanceof List) {
					return (List) ret;
				}
				return null;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}

	}

	protected List onSelect(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		Map<String, SqlParam> sqlParamMap = new HashMap<String, SqlParam>();
		Map<String, SqlParam> conditionSqlParamMap = new HashMap<String, SqlParam>();

		ISysDBTableRuntime iSysDBTableRuntime = this.getSysDBTableRuntime(strTableName, false);
		java.util.List<ISysDBColumnRuntime> sysDBColumnRuntimeList = iSysDBTableRuntime.getSysDBColumnRuntimes();
		if (sysDBColumnRuntimeList == null || sysDBColumnRuntimeList.size() == 0) {
			throw new SysDBSchemeRuntimeException(this, String.format("数据表[%1$s]未定义数据列", strTableName));
		}

		for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
			if (!paramMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
				continue;
			}
			Object objValue = paramMap.get(iSysDBColumnRuntime.getDataItemName());
			if (objValue instanceof SqlParam) {
				SqlParam sqlParam = (SqlParam) objValue;
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (!sqlParam.isCondition()) {
					sqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
				}
			} else {
				SqlParam sqlParam = SqlParam.value(objValue);
				sqlParam.setName(iSysDBColumnRuntime.getStandardName());
				if (iSysDBColumnRuntime.isPKey()) {
					sqlParam.setCondition(true);
				}
				if (!sqlParam.isCondition()) {
					sqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
				} else {
					conditionSqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
				}
			}
		}

		for (java.util.Map.Entry<String, Object> entry : paramMap.entrySet()) {
			if (entry.getValue() == SqlParam.NOTSET) {
				if (!sqlParamMap.containsKey(entry.getKey())) {
					sqlParamMap.put(entry.getKey(), SqlParam.rawCode(entry.getKey(), entry.getKey()));
				}
			}
		}

		if (extParamMap != null) {
			for (ISysDBColumnRuntime iSysDBColumnRuntime : sysDBColumnRuntimeList) {
				if (!extParamMap.containsKey(iSysDBColumnRuntime.getDataItemName())) {
					continue;
				}
				Object objValue = extParamMap.get(iSysDBColumnRuntime.getDataItemName());
				if (objValue instanceof SqlParam) {
					SqlParam sqlParam = (SqlParam) objValue;
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
					}
				} else {
					SqlParam sqlParam = SqlParam.value(objValue);
					sqlParam.setName(iSysDBColumnRuntime.getStandardName());
					if (iSysDBColumnRuntime.isPKey()) {
						sqlParam.setCondition(true);
					}
					if (!sqlParam.isCondition()) {
						sqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
					} else {
						conditionSqlParamMap.put(iSysDBColumnRuntime.getDataItemName(), sqlParam);
					}
				}
			}
		}

		for (String strKey : conditionSqlParamMap.keySet()) {
			sqlParamMap.remove(strKey);
		}

		return this.getDBDataService().select(this.getSysDBSchemeRuntimeContext(), iSysDBTableRuntime, new SqlCommandParam(sqlParamMap.values(), conditionSqlParamMap.values()));
	}

	@Override
	public List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onQuery(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onQuery(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				if (ret instanceof List) {
					return (List) ret;
				}
				return null;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}

	}

	protected List onQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		return this.getDBDataService().select(this.getSysDBSchemeRuntimeContext(), iDataEntityRuntime, iPSDEDataQuery, iSearchContext);
	}

	@Override
	public Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onQuery2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onQuery2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields, extParamMap);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				if (ret instanceof Page) {
					return (Page) ret;
				}
				return null;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}

	}

	protected Page onQuery2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		return this.getDBDataService().select2(this.getSysDBSchemeRuntimeContext(), iDataEntityRuntime, iPSDEDataQuery, iSearchContext);
	}

	@Override
	public Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {

		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onFetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields, extParamMap);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onFetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields, extParamMap);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				if (ret instanceof Page) {
					return (Page) ret;
				}
				return null;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}
	}

	protected Page onFetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable {
		return this.getDBDataService().select(this.getSysDBSchemeRuntimeContext(), iDataEntityRuntime, iPSDEDataSet, iSearchContext);
	}

	@Override
	public List executeSelectSQL(String strSQL, List<Object> params) throws Throwable {
		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onExecuteSelectSQL(strSQL, params);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onExecuteSelectSQL(strSQL, params);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				if (ret instanceof List) {
					return (List) ret;
				}
				return null;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}
	}

	protected List onExecuteSelectSQL(String strSQL, List<Object> params) throws Throwable {
		return this.getDBDataService().executeSelectSQL(this.getSysDBSchemeRuntimeContext(), strSQL, params);
	}

	@Override
	public int executeSQL(String strSQL, List<Object> params) throws Throwable {
		boolean bActive = this.isActive();
		try {
			if (!bActive) {
				this.push();
			}

			if (bActive) {
				return this.onExecuteSQL(strSQL, params);
			} else {
				Object ret = ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onExecuteSQL(strSQL, params);
					}
				}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);

				return (int) ret;
			}
		} finally {
			if (!bActive) {
				this.poll();
			}
		}
	}

	protected int onExecuteSQL(String strSQL, List<Object> params) throws Throwable {
		return this.getDBDataService().executeSQL(this.getSysDBSchemeRuntimeContext(), strSQL, params);
	}

	protected IDBDataService getDBDataService() {
		if (this.iDBDataService != null) {
			return iDBDataService;
		}
		if (getDefaultDBDataService() != null) {
			return getDefaultDBDataService();
		}

		throw new SysDBSchemeRuntimeException(this, "无效的数据服务对象");
	}

	protected void setDBDataService(IDBDataService iDBDataService) {
		this.iDBDataService = iDBDataService;
	}

	@Override
	public Object getDataSourceTag() {
		return this.objDataSourceTag;
	}

	@Override
	public void setDataSourceTag(Object objDataSourceTag) {
		this.objDataSourceTag = objDataSourceTag;
	}

	@Override
	public void setDataSourceProperties(Map<String, Object> properties) {
		if (properties != null) {
			this.properties = new LinkedHashMap<String, Object>();
			this.properties.putAll(properties);
		} else {
			this.properties = properties;
		}

	}

	@Override
	public Object getDataSourceProperty(String strKey, Object objDefault) {
		if (properties != null && properties.containsKey(strKey)) {
			return properties.get(strKey);
		}
		return objDefault;
	}

	@Override
	public void push() {
		try {
			this.onPush();
		}
		catch (Throwable ex) {
			SysDBSchemeRuntimeException.rethrow(this, ex);
			throw new SysDBSchemeRuntimeException(this, String.format("push数据源发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onPush() throws Throwable {
		IDBDataService iDBDataService = getDBDataService();
		iDBDataService.push(this);
		SysDBSchemeRuntimeHolder.push(this);
	}

	@Override
	public void poll() {
		try {
			this.onPoll();
		}
		catch (Throwable ex) {
			SysDBSchemeRuntimeException.rethrow(this, ex);
			throw new SysDBSchemeRuntimeException(this, String.format("poll数据源发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onPoll() throws Throwable{
		IDBDataService iDBDataService = getDBDataService();
		iDBDataService.poll();
		SysDBSchemeRuntimeHolder.poll();
	}

	@Override
	public boolean isActive() {
		IDBDataService iDBDataService = getDBDataService();
		return iDBDataService.current() == this;
	}

	@Override
	public String getSaaSDCIdColumnName() {
		return this.strSaaSDCIdColumnName;
	}

	public void setSaaSDCIdColumnName(String strSaaSDCIdColumnName) {
		this.strSaaSDCIdColumnName = strSaaSDCIdColumnName;
	}

	@Override
	public String getSaaSDataIdColumnName() {
		return this.strSaaSDataIdColumnName;
	}

	public void setSaaSDataIdColumnName(String strSaaSDataIdColumnName) {
		this.strSaaSDataIdColumnName = strSaaSDataIdColumnName;
	}

	@Override
	public boolean isDropIndexFirst() {
		return this.bDropIndexFirst;
	}

	public void setDropIndexFirst(boolean bDropIndexFirst) {
		this.bDropIndexFirst = bDropIndexFirst;
	}

	@Override
	public boolean isUpdateSchema() {
		return this.bUpdateSchema;
	}

	public void setUpdateSchema(boolean bUpdateSchema) {
		this.bUpdateSchema = bUpdateSchema;
	}

	@Override
	public String getRealDBType() {
		if (StringUtils.hasLength(this.strRealDBType)) {
			return this.strRealDBType;
		}
		return this.getDBType();
	}

	@Override
	public void setRealDBType(String strRealDBType) {
		this.strRealDBType = strRealDBType;
	}
	
	@Override
	public IDBDialect getDBDialect() {
		if(this.iDBDialect == null) {
			this.iDBDialect = this.getSystemRuntime().getDBDialect(this.getDBType());
			if(this.iDBDialect == null) {
				throw new SysDBSchemeRuntimeException(this, String.format("数据库访问适配器对象无效"));
			}
		}
		return this.iDBDialect;
	}

	@Override
	public synchronized void install() throws Exception {
		if(!this.bInstalled) {
			this.onInstall();
			
			this.bInstalled = true;
		}
	}
	
	
	protected void onInstall() throws Exception {
	
	}
	
	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}
	
	@Override
	public void uninstall() {
		try {
			onUninstall();
		}
		catch(Throwable ex) {
			log.error(String.format("卸载数据库体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载数据库体系[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}
	
	protected void onUninstall() throws Throwable{
		
	}
	
	@Override
	public void shutdown() throws Exception {
		onShutdown();
	}
	
	protected void onShutdown() throws Exception{
		
	}

	protected String getLogCat() {
		return LogCats.DBSCHEME;
	}

}
