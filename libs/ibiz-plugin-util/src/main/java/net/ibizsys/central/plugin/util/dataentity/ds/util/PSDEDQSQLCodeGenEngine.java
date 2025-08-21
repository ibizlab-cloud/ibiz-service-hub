package net.ibizsys.central.plugin.util.dataentity.ds.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.DBType;
import net.ibizsys.model.PSModelEnums.DEDQJoinType;
import net.ibizsys.model.PSModelEnums.DEDataQueryViewLevel;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.PSModelEnums.DEVirtualMode;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSFormulaDEField;
import net.ibizsys.model.dataentity.defield.IPSInheritDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER11;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERIndex;
import net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap;
import net.ibizsys.model.dataentity.der.IPSDERInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDQColumn;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQCustomCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQJoin;
import net.ibizsys.model.dataentity.ds.IPSDEDQMain;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeCondImp;
import net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeExpImp;
import net.ibizsys.model.dataentity.ds.PSDEDataQueryCodeImpl;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 数据库查询引擎
 *
 * @author Administrator
 *
 */
public class PSDEDQSQLCodeGenEngine {

	public static class DEDataQueryCodeExp {
		private String strExpression = "";
		private int nShowOrder = -1;
		private String strName = "";

		public void setName(String strName) {
			this.strName = strName;
		}

		public String getName() {
			return this.strName;
		}

		public String getExpression() {
			return strExpression;
		}

		public int getShowOrder() {
			return nShowOrder;
		}

		/**
		 * @param strExpression
		 *            the strExpression to set
		 */
		public void setExpression(String strExpression) {
			this.strExpression = strExpression;
		}

		/**
		 * @param nShowOrder
		 *            the nShowOrder to set
		 */
		public void setShowOrder(int nShowOrder) {
			this.nShowOrder = nShowOrder;
		}

	}

	public static class DEDataQueryCodeCond {
		private String strCustomCond = "";
		private int nShowOrder = -1;
		private String strName = "";

		public void setName(String strName) {
			this.strName = strName;
		}

		public String getName() {
			return this.strName;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see net.ibizsys.paas.core.IDEDataQueryCodeExp#getShowOrder()
		 */
		public int getShowOrder() {
			return nShowOrder;
		}

		/**
		 * @param nShowOrder
		 *            the nShowOrder to set
		 */
		public void setShowOrder(int nShowOrder) {
			this.nShowOrder = nShowOrder;
		}

		public void setCustomCond(String strCustomCond) {
			this.strCustomCond = strCustomCond;
		}

		public String getCustomCond() {
			return this.strCustomCond;
		}
	}


	public static class DEDQAlias
	{


		private IPSDataEntity iPSDataEntity = null;

		private List<String> derList = null;

		private Map<String, Integer> derAliasMap = null;

		private String strParentDER = "";

		private int nAliasIndex = -1;
		/**
		 * @return the iPSDataEntity
		 */
		public IPSDataEntity getIPSDataEntity()
		{
			return iPSDataEntity;
		}

		/**
		 * @return the derList
		 */
		public List<String> getDERList()
		{
			return derList;
		}

		/**
		 * @return the derAliasMap
		 */
		public Map<String, Integer> getDERAliasMap()
		{
			return derAliasMap;
		}

		/**
		 * @return the strParentDER
		 */
		public String getParentDER()
		{
			return strParentDER;
		}

		/**
		 * @param helper
		 *            the iPSDataEntity to set
		 */
		public void setPSDataEntity(IPSDataEntity helper)
		{
			iPSDataEntity = helper;
		}

		/**
		 * @param derList
		 *            the derList to set
		 */
		public void setDERList(List<String> derList)
		{
			this.derList = derList;
		}

		/**
		 * @param derAliasMap
		 *            the derAliasMap to set
		 */
		public void setDERAliasMap(Map<String, Integer> derAliasMap)
		{
			this.derAliasMap = derAliasMap;
		}

		/**
		 * @param strParentDER
		 *            the strParentDER to set
		 */
		public void setParentDER(String strParentDER)
		{
			this.strParentDER = strParentDER;
		}

		public int getAliasIndex() {
			return nAliasIndex;
		}

		public void setAliasIndex(int nAliasIndex) {
			this.nAliasIndex = nAliasIndex;
		}

	}

	public class DEDQDeclare
	{
		protected String strDeclareCode = "";
		//protected String strDeclareCode2 = "";

		protected Vector<CallParam> params = new Vector<CallParam>();

		/**
		 * 语句头定义
		 * @return the strDeclareCode
		 */
		public String getDeclareCode()
		{
			return strDeclareCode;
		}



		/**
		 * @param strDeclareCode
		 *            the strDeclareCode to set
		 */
		public void setDeclareCode(String strDeclareCode)
		{
			this.strDeclareCode = strDeclareCode;
		}

		//
//		/**
//		 * @return the strDeclareCode
//		 */
//		public String getDeclareCode2()
//		{
//			if(StringHelper.IsNullOrEmpty(strDeclareCode2))
//				return getDeclareCode();
//			return strDeclareCode2;
//		}
		//
		//
		//
//		/**
//		 * @param strDeclareCode
//		 *            the strDeclareCode to set
//		 */
//		public void setDeclareCode2(String strDeclareCode2)
//		{
//			this.strDeclareCode2 = strDeclareCode2;
//		}


		/**
		 * @return the params
		 */
		public Vector<CallParam> getParams()
		{
			return params;
		}
	}


	/**
	 * 空值
	 */
	public final static String QMVALUE_ISNULL = "__SRFQMVALUE_ISNULL__";

	/**
	 * 非空值
	 */
	public final static String QMVALUE_ISNOTNULL = "__SRFQMVALUE_ISNOTNULL__";

	protected IPSDataEntity majorPSDataEntity = null;

	protected Hashtable<String, String> fieldExpMap = new Hashtable<String, String>();

	protected Hashtable<String, Integer> fieldDataTypeMap = new Hashtable<String, Integer>();

	// protected boolean bHasCondition = false;

	private static final Log log = LogFactory.getLog(PSDEDQSQLCodeGenEngine.class);

	protected String strQueryScript = "";

	protected String strQueryScriptTemp = "";

	protected String strQueryScriptWithCondition = "";

	protected List<CallParam> callParams = new ArrayList<CallParam>();

	protected String strDAQueryModelHelperId = "";

	private int nAliasIndex = 0;

	private List<String> majorDERList = null;

	private Map<String, Integer> majorDERAliasMap = null;

	private List<String> majorConditionList = null;


	protected Map<String, DEDQAlias> qmAliasMap = new TreeMap<String, DEDQAlias>();

	protected Map<String, DEDQDeclare> qmDeclareMap = new TreeMap<String, DEDQDeclare>();

	/**
	 * 字段查询大小写敏感
	 */
	protected Map<String, Integer> fieldCaseSensitiveMap = new TreeMap<String, Integer>();

	public final static int QUERYCASESENSITIVE_EQ = 1;

	public final static int QUERYCASESENSITIVE_LIKE = 2;

	/**
	 * 匹配分割
	 */
	public final static int QUERYOPTION_LIKESPLIT = 4;

	public final static String TAG_DYNAMICTABLES = "__DYNAMICTABLES__";

	class URLCondPair {
		public String strFieldName;

		public int nDataType;

		public String strCondition;

		public String strMacro;

		public String strURLParam;

		public boolean bAll = true;
	}

	private int nMacroIndex = 1;

	protected ArrayList<URLCondPair> urlCondPairList = new ArrayList<URLCondPair>();

	protected Map<String, Object> macroParams = new TreeMap<String, Object>();

	protected Map<String, String> globalParamMap = new LinkedHashMap<String, String>();

	protected Map<String, Object> attributeMap = new LinkedHashMap<String, Object>();

	protected IDBDialect iDBDialect = null;

	protected List<DEDataQueryCodeExp> deDataQueryCodeExpImplList = new ArrayList<DEDataQueryCodeExp>();

	protected List<DEDataQueryCodeCond> deDataQueryCodeCondImplList = new ArrayList<DEDataQueryCodeCond>();

	protected boolean bTempData = false;

	private boolean bEnablePQL = false;

	private ISystemRuntime iSystemRuntime = null;

	private IDataEntityRuntime majorDataEntityRuntime = null;

	public PSDEDQSQLCodeGenEngine(IDataEntityRuntime iDataEntityRuntime, IDBDialect iDBDialect) throws Exception {
		this.init(iDataEntityRuntime, iDBDialect);
	}

	/**
	 * 初始化
	 *
	 * @param iPSDataEntity
	 */
	public void init(IDataEntityRuntime iDataEntityRuntime, IDBDialect iDBDialect) throws Exception {

		this.majorDataEntityRuntime = iDataEntityRuntime;
		this.iSystemRuntime = iDataEntityRuntime.getSystemRuntime();
		this.majorPSDataEntity = iDataEntityRuntime.getPSDataEntity();
		this.iDBDialect = iDBDialect;

		onInit();
	}

	protected void onInit() throws Exception {

	}

	protected IDataEntityRuntime getMajorDataEntityRuntime() {
		return this.majorDataEntityRuntime;
	}

	protected ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected String getDBType() {
		return iDBDialect.getDBType();
	}

	public void registerStaticParamValue(String strMacroParam, String strValue) {
		globalParamMap.put(strMacroParam, strValue);
	}

	public String getStaticParamValue(String strMacroParam) {
		String strValue = globalParamMap.get(strMacroParam);
		return strValue;
	}

	public void compile(IPSDEDQMain mainQueryConfig, IPSDEDQMain mainQueryConfig2, boolean bDPControl, List<List<IPSDEDQMain>> notQueryConfigs, List<List<IPSDEDQMain>> orQueryConfigs) throws Throwable {
		compileEx(mainQueryConfig, mainQueryConfig2, bDPControl, notQueryConfigs, orQueryConfigs, false);
	}

	public void compileEx(IPSDEDQMain mainQueryConfig, IPSDEDQMain mainQueryConfig2, boolean bDPControl, List<List<IPSDEDQMain>> notQueryConfigs, List<List<IPSDEDQMain>> orQueryConfigs, boolean bDelete) throws Throwable {

		IPSDEDataQuery mainPSDEDataQuery = mainQueryConfig.getParentPSModelObject(IPSDEDataQuery.class, false);
		this.bEnablePQL = mainPSDEDataQuery.isEnablePQL();

		callParams.clear();
		List<String> mainConditionList = new ArrayList<String>();
		List<String> derList = new ArrayList<String>();
		Map<String, Integer> derAliasMap = new TreeMap<String, Integer>();
		derAliasMap.put("", 0);
		fieldExpMap.clear();
		this.deDataQueryCodeExpImplList.clear();

		TreeMap<String, String> extSelects = new TreeMap<String, String>();

		StringBuilder script = new StringBuilder();
		StringBuilder scriptTemp = null;
		if (this.majorPSDataEntity.isEnableTempDataBackend()) {
			scriptTemp = new StringBuilder();
		}

		TreeMap<String, Integer> selectColumns = new TreeMap<String, Integer>();
		java.util.List<IPSDEDQColumn> selectPSQMColumns = mainQueryConfig.getSelectedPSDEDQColumns();
		if (!ObjectUtils.isEmpty(selectPSQMColumns)) {
			for (IPSDEDQColumn iPSQMColumn : selectPSQMColumns) {
				selectColumns.put(iPSQMColumn.getName().toUpperCase(), 1);
			}
		}

		if (mainQueryConfig2 != null) {
			selectPSQMColumns = mainQueryConfig2.getSelectedPSDEDQColumns();
			if (!ObjectUtils.isEmpty(selectPSQMColumns)) {
				for (IPSDEDQColumn iPSQMColumn : selectPSQMColumns) {
					selectColumns.put(iPSQMColumn.getName().toUpperCase(), 1);
				}
			}
		}

		if (mainPSDEDataQuery.getViewLevel() == DEDataQueryViewLevel.DEFGROUP.value && mainPSDEDataQuery.getPSDEFGroup() != null) {
			java.util.List<IPSDEFGroupDetail> psDEFGroupDetails = mainPSDEDataQuery.getPSDEFGroup().getPSDEFGroupDetails();
			if (psDEFGroupDetails != null) {
				for (IPSDEFGroupDetail iPSDEFGroupDetail : psDEFGroupDetails) {
					selectColumns.put(iPSDEFGroupDetail.getPSDEFieldMust().getName().toUpperCase(), 1);
				}
			}
			// 默认放入主键
			selectColumns.put(this.majorPSDataEntity.getKeyPSDEFieldMust().getName().toUpperCase(), 1);
		}

		String strRealQueryCode = null;
		if (this.majorPSDataEntity.isVirtual() && this.majorPSDataEntity.getVirtualMode() == DEVirtualMode.INDEXMAJOR.value) {
			// 循环各索引关系
			int nIndex = 0;
			StringBuilder unionAll = new StringBuilder();
			List<IPSDERIndex> psDERIndexs = new ArrayList<IPSDERIndex>();
			List<IPSDERBase> psDERBaseList = this.majorPSDataEntity.getMajorPSDERs();
			if (!ObjectUtils.isEmpty(psDERBaseList)) {
				for (IPSDERBase iPSDERBase : psDERBaseList) {
					if (iPSDERBase instanceof IPSDERIndex) {
						psDERIndexs.add((IPSDERIndex) iPSDERBase);
					}
				}
			}

			if (!ObjectUtils.isEmpty(psDERIndexs)) {
				for (IPSDERIndex iPSDERIndex : psDERIndexs) {
					if (iPSDERIndex.isInherit()) {
						continue;
					}

					Map<String, IPSDEField> fieldMap = new LinkedHashMap<String, IPSDEField>();
					// 构建选择列
					List<String> psDEDQColumnList = new ArrayList<String>();
					// 主实体有主键则自动附加
					if (this.majorPSDataEntity.getKeyPSDEField() != null && iPSDERIndex.getMinorPSDataEntity().getKeyPSDEField() != null) {
						psDEDQColumnList.add(iPSDERIndex.getMinorPSDataEntity().getKeyPSDEField().getName());
						fieldMap.put(this.majorPSDataEntity.getKeyPSDEField().getName(), iPSDERIndex.getMinorPSDataEntity().getKeyPSDEField());
					}

					// 主实体有主信息则自动附加
					if (this.majorPSDataEntity.getMajorPSDEField() != null && iPSDERIndex.getMinorPSDataEntity().getMajorPSDEField() != null) {
						psDEDQColumnList.add(iPSDERIndex.getMinorPSDataEntity().getMajorPSDEField().getName());
						fieldMap.put(this.majorPSDataEntity.getMajorPSDEField().getName(), iPSDERIndex.getMinorPSDataEntity().getMajorPSDEField());
					}

					// 附加其它选择列
					java.util.List<IPSDERIndexDEFieldMap> psDERIndexDEFieldMaps = iPSDERIndex.getPSDERIndexDEFieldMaps();
					if (!ObjectUtils.isEmpty(psDERIndexDEFieldMaps)) {
						for (IPSDERIndexDEFieldMap iPSDERIndexDEFieldMap : psDERIndexDEFieldMaps) {
							if (iPSDERIndexDEFieldMap.getMinorPSDEField() != null && iPSDERIndexDEFieldMap.getMajorPSDEField() != null) {
								psDEDQColumnList.add(iPSDERIndexDEFieldMap.getMinorPSDEField().getName());

								fieldMap.put(iPSDERIndexDEFieldMap.getMajorPSDEField().getName(), iPSDERIndexDEFieldMap.getMinorPSDEField());
							}
						}
					}

					PSDEDQSQLCodeGenEngine psDEDQEngineImpl = new PSDEDQSQLCodeGenEngine(this.getSystemRuntime().getDataEntityRuntime(iPSDERIndex.getMinorPSDataEntity().getId()), this.iDBDialect);

					SimplePSDEDQMainImpl simplePSDEDQMainImpl = new SimplePSDEDQMainImpl();
					simplePSDEDQMainImpl.init(this.getSystemRuntime().getDataEntityRuntime(iPSDERIndex.getMinorPSDataEntity().getId()), psDEDQColumnList);
					psDEDQEngineImpl.compile(simplePSDEDQMainImpl);

					String strCode = psDEDQEngineImpl.getQueryScript();
					StringBuilder sb = new StringBuilder();

					nIndex++;
					sb.append("SELECT\n");
					// 输出类型列
					if (this.majorPSDataEntity.getIndexTypePSDEField() == null) {
						throw new Exception("索引主实体没有定义类型属性");
					} else {
						IPSDEField iPSDEField = this.majorPSDataEntity.getIndexTypePSDEField();
						if (DataTypeUtils.isStringDataType(iPSDEField.getStdDataType())) {
							sb.append(String.format("'%1$s' AS %2$s", iPSDERIndex.getTypeValue(), this.iDBDialect.getDBObjStandardName(iPSDEField.getName())));
						} else {
							sb.append(String.format("%1$s AS %2$s", iPSDERIndex.getTypeValue(), this.iDBDialect.getDBObjStandardName(iPSDEField.getName())));
						}
					}

					java.util.List<IPSDEField> psDEFields = this.majorPSDataEntity.getAllPSDEFields();
					if (!ObjectUtils.isEmpty(psDEFields)) {
						for (IPSDEField iPSDEField : psDEFields) {
							if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
								continue;

							if (iPSDEField.isIndexTypeDEField()) {
								continue;
							}
							// IPSDEFDTColumn iPSDEFDTColumn =
							// iPSDEField.getPSDTColumn(this.getDBType());
							if (iPSDEField instanceof IPSFormulaDEField) {
								IPSFormulaDEField iPSFormulaDEField = (IPSFormulaDEField) iPSDEField;
								if (!ObjectUtils.isEmpty(iPSFormulaDEField.getFormulaFormat()) && !ObjectUtils.isEmpty(iPSFormulaDEField.getFormulaColumns())) {
									// 传统模式
									continue;
								}
							}

							IPSDEField minorPSDEField = fieldMap.get(iPSDEField.getName());
							if (minorPSDEField == null) {
								// 常规模式
								sb.append(String.format(",NULL AS %1$s\n", this.iDBDialect.getDBObjStandardName(iPSDEField.getName())));
							} else {
								// 别名
								// IPSDEFDTColumn minorPSDEFDTColumn =
								// minorPSDEField.getPSDTColumn(this.getDBType());
								sb.append(String.format(",v%1$s.%2$s AS %3$s\n", nIndex, this.iDBDialect.getDBObjStandardName(minorPSDEField.getName()), this.iDBDialect.getDBObjStandardName(iPSDEField.getName())));
							}
						}
					}

					sb.append("FROM\n");
					sb.append(String.format("(%1$s) v%2$s\n", strCode, nIndex));

					if (nIndex > 1) {
						unionAll.append("UNION ALL\n");
					}
					unionAll.append(sb.toString());
				}

			}
			strRealQueryCode = unionAll.toString();
			if (ObjectUtils.isEmpty(strRealQueryCode)) {
				throw new Exception("索引主实体未定义任何索引关系");
			}
		}
		boolean bSelectColumn = selectColumns.size() > 0;

		java.util.List<IPSDEField> psDEFields = this.majorPSDataEntity.getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFields)) {
			for (IPSDEField iPSDEField : psDEFields) {

				if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField()) {
					continue;
				}

				if (!iPSDEField.isPhisicalDEField() && iPSDEField.isLinkDEField()) {
					IPSLinkDEField iPSLinkDEField = (IPSLinkDEField) iPSDEField;
					boolean bIgnore = false;
					while (iPSLinkDEField != null) {
						if (iPSLinkDEField.getPSDER() instanceof IPSDER1NBase) {
							IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) iPSLinkDEField.getPSDER();
							if (iPSDER1NBase.getPickupPSDEField() != null) {
								if (!iPSDER1NBase.getPickupPSDEField().isPhisicalDEField()) {
									bIgnore = true;
									break;
								}
							}
						}
						IPSDEField relatedPSDEField = iPSLinkDEField.getRelatedPSDEField();
						if (!relatedPSDEField.getParentPSModelObject(IPSDataEntity.class).isEnableSQLStorage()) {
							if (!(iPSLinkDEField.getParentPSModelObject(IPSDataEntity.class).getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value)) {
								bIgnore = true;
								break;
							}
						}
						if (relatedPSDEField.isPhisicalDEField()) {
							if (relatedPSDEField.isDynaStorageDEField()) {
								bIgnore = true;
							}
							break;
						}

						if (relatedPSDEField.isLinkDEField()) {
							// 递归计算
							iPSLinkDEField = (IPSLinkDEField) relatedPSDEField;
						} else {
							if (relatedPSDEField.isUIAssistDEField()) {
								bIgnore = true;
							}
							break;
						}
					}
					if (bIgnore) {
						String strMsg = String.format("属性[%1$s]引用实体[%2$s]属性[%3$s]不支持SQL存储，忽略", iPSDEField.getName(), iPSLinkDEField.getRelatedPSDataEntity().getName(), iPSLinkDEField.getRelatedPSDEField().getName());
						log.warn(strMsg);
						continue;
					}
				}

				if (bSelectColumn && selectColumns.containsKey(iPSDEField.getName())) {
					// 选择列
				} else if (!isQueryColumn(iPSDEField, mainQueryConfig.getPSDEDataQuery().getViewLevel()) || bSelectColumn) {
					if (!iPSDEField.isQueryColumn() || !selectColumns.containsKey(iPSDEField.getName())) {
						// 获取物理列的标识
						// if(!iPSDEField.getPSDTColumn(this.getDBType()).isViewColumn())
						// continue;

						if (!iPSDEField.isPhisicalDEField()) {
							if (!iPSDEField.isInheritDEField())
								continue;
						}

						// IPSDEFDTColumn iPSDEFDTColumn =
						// iPSDEField.getPSDTColumn(this.getDBType());
						String strPSDEFieldExp = null;
						if (mainQueryConfig.getPSDEDataQuery().isQueryFromView()) {
							strPSDEFieldExp = String.format("%1$s.%2$s", "t1", this.iDBDialect.getDBObjStandardName(iPSDEField.getName()));
							// this.setFieldQueryCaseSensitive(strPSDEFieldExp,
							// iPSDEFDTColumn.getQueryCaseSenstive());
						} else {
							strPSDEFieldExp = getPSDEFieldExp(iPSDEField, "", derAliasMap, derList);
						}

						int nDataType = iPSDEField.getStdDataType();

						fieldDataTypeMap.put(iPSDEField.getName().toUpperCase(), nDataType);
						fieldExpMap.put(iPSDEField.getName().toUpperCase(), strPSDEFieldExp);
						continue;
					}
				}

				// IPSDEFDTColumn iPSDEFDTColumn =
				// iPSDEField.getPSDTColumn(this.getDBType());
				String strPSDEFieldExp = null;
				if (mainQueryConfig.getPSDEDataQuery().isQueryFromView()) {
					strPSDEFieldExp = String.format("%1$s.%2$s", "t1", this.iDBDialect.getDBObjStandardName(iPSDEField.getName()));
					// this.setFieldQueryCaseSensitive(strPSDEFieldExp,
					// iPSDEFDTColumn.getQueryCaseSenstive());
				} else {
					strPSDEFieldExp = getPSDEFieldExp(iPSDEField, "", derAliasMap, derList);
				}

				if (iPSDEField.getStringLength() != -1 && iPSDEField.getStringLength() > 8000) {
					log.error(String.format("长文本属性[%1$s]放入查询中，会影响检索性能", iPSDEField.getName()));
				}

				extSelects.put(iPSDEField.getName().toUpperCase(), strPSDEFieldExp);

				int nDataType = iPSDEField.getStdDataType();

				fieldDataTypeMap.put(iPSDEField.getName().toUpperCase(), nDataType);
				fieldExpMap.put(iPSDEField.getName().toUpperCase(), strPSDEFieldExp);
			}
		}

		IPSDEField keyPSDEField = majorPSDataEntity.getKeyPSDEFieldMust();

		// IPSDEDBConfig majorPSDEDBConfig =
		// this.majorPSDataEntity.getPSDEDBConfig(this.getDBType());
		String strMainTable = majorPSDataEntity.getTableName();

		// String strUserTable = "";
		String strSaaSDCIdColName = "";
		// if (this.majorPSDataEntity.getSaaSMode() ==
		// IPSDataEntity.SAASMODE_STANDARD
		// ||this.majorPSDataEntity.getSaaSMode() ==
		// IPSDataEntity.SAASMODE_STANDARD3) {
		// strSaaSDCIdColName = majorPSDEDBConfig.getSaaSDCIdColumnName();
		// }
		//
		// if (mainQueryConfig.getPSDEDataQuery().isQueryFromView()) {
		// strMainTable =
		// majorPSDEDBConfig.getViewName(mainQueryConfig.getPSDEDataQuery().getViewLevel());
		// }

		if (this.getMajorPSDataEntity().isVirtual()) {

			if (getMajorPSDataEntity().getKeyPSDEFieldMust() instanceof IPSLinkDEField) {
				IPSDataEntity realPSDataEntity = getRealPSDEField(((IPSLinkDEField) getMajorPSDataEntity().getKeyPSDEField()), false).getParentPSModelObject(IPSDataEntity.class);
				strMainTable = realPSDataEntity.getTableName();
				// strUserTable =
				// realPSDataEntity.getPSDEDBConfig(this.getDBType()).getUserTable();
				// if (realPSDataEntity.getSaaSMode() ==
				// IPSDataEntity.SAASMODE_STANDARD
				// ||realPSDataEntity.getSaaSMode() ==
				// IPSDataEntity.SAASMODE_STANDARD3) {
				// strSaaSDCIdColName =
				// realPSDataEntity.getPSDEDBConfig(this.getDBType()).getSaaSDCIdColumnName();
				// }
				// if (mainQueryConfig.getPSDEDataQuery().isQueryFromView()) {
				// strMainTable =
				// realPSDataEntity.getPSDEDBConfig(this.getDBType()).getViewName(mainQueryConfig.getPSDEDataQuery().getViewLevel());
				// strUserTable = "";
				// }
			}
		}

		boolean bDynamicTable = false;
		{
			if (!ObjectUtils.isEmpty(strRealQueryCode)) {
				script.append(String.format("\nFROM (%1$s) t1 \n", strRealQueryCode));
			} else {
				script.append(String.format("\nFROM %1$s t1 \n", this.iDBDialect.getDBObjStandardName(strMainTable)));
				// if (!ObjectUtils.isEmpty(strUserTable) && !bDelete) {
				// script.append("INNER JOIN %1$s t2 ON t1.%2$s = t2.%2$s",
				// this.iDBDialect.getDBObjStandardName(strUserTable),
				// this.iDBDialect.getDBObjStandardName(keyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
				// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
				// script.append(" AND t2.%1$s = '__SRFSAASDCID__'",
				// strSaaSDCIdColName);
				// }
				// script.append("\n");
				// }

				// 临时
				if (scriptTemp != null) {
					scriptTemp.append(String.format("\nFROM %1$s t1 \n", this.iDBDialect.getDBObjStandardName(strMainTable + "_TMP")));
					// if (!ObjectUtils.isEmpty(strUserTable) && !bDelete) {
					// scriptTemp.append("INNER JOIN %1$s t2 ON t1.%2$s =
					// t2.%2$s"
					// , this.iDBDialect.getDBObjStandardName(strUserTable +
					// "_TMP")
					// ,
					// this.iDBDialect.getDBObjStandardName(keyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
					// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
					// scriptTemp.append(" AND t2.%1$s = '__SRFSAASDCID__'",
					// strSaaSDCIdColName);
					// }
					// scriptTemp.append("\n");
					// }
				}
			}

		}

		DEDQAlias qmAlias = new DEDQAlias();
		qmAlias.setPSDataEntity(majorPSDataEntity);
		qmAlias.setParentDER("");
		qmAlias.setDERAliasMap(derAliasMap);
		qmAlias.setDERList(derList);
		qmAlias.setAliasIndex(0);
		qmAliasMap.put("MAIN", qmAlias);

		if (!ObjectUtils.isEmpty(mainQueryConfig.getAlias())) {
			qmAliasMap.put(mainQueryConfig.getAlias().toLowerCase(), qmAlias);
		}

		// 循环其它关系
		if (mainQueryConfig.getChildPSDEDQJoins() != null) {
			java.util.List<IPSDEDQJoin> psQMJoinQueries = mainQueryConfig.getChildPSDEDQJoins();
			for (IPSDEDQJoin joinQueryConfig : psQMJoinQueries) {
				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NO.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, true, false, false, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NORIGHT.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, false, false, false, true, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMNO.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, true, false, false, false, false, false, true, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OO.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, true, false, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OOM.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, true, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONLEFTOUT.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, true, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ON.value, true) == 0) {
					String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, false);
					mainConditionList.add(strCondition);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMON.value, true) == 0) {
					String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, true);
					mainConditionList.add(strCondition);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, false);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, true);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEX.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, true, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEXM.value, true) == 0) {
					buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, false, true, false, false, extSelects);
					continue;
				}

			}
		}

		// 循环其它关系
		if (mainQueryConfig2 != null && mainQueryConfig2.getChildPSDEDQJoins() != null) {
			if (!ObjectUtils.isEmpty(mainQueryConfig2.getAlias())) {
				qmAliasMap.put(mainQueryConfig2.getAlias().toLowerCase(), qmAlias);
			}

			complie(mainQueryConfig2, this.majorPSDataEntity, derAliasMap, derList, mainConditionList, extSelects);
		}

		if (bDPControl) {
			if (notQueryConfigs != null) {
				for (List<IPSDEDQMain> notList : notQueryConfigs) {
					List<String> listconditions = new ArrayList<String>();

					for (IPSDEDQMain queryConfig : notList) {
						if (!ObjectUtils.isEmpty(queryConfig.getAlias())) {
							qmAliasMap.put(queryConfig.getAlias().toLowerCase(), qmAlias);
						}

						List<String> conditions = new ArrayList<String>();
						complie(queryConfig, this.majorPSDataEntity, derAliasMap, derList, conditions, null);

						if (queryConfig.getPSDEDQGroupCondition() != null) {
							String strGroupCondition = getGroupCondition(this.majorDataEntityRuntime, "", queryConfig.getPSDEDQGroupCondition(), derAliasMap, derList);
							if (!ObjectUtils.isEmpty(strGroupCondition))
								conditions.add(strGroupCondition);
						}

						if (conditions.size() == 0)
							continue;

						String strTotalCond = "";
						for (String strCond : conditions) {
							if (ObjectUtils.isEmpty(strCond))
								continue;

							if (!ObjectUtils.isEmpty(strTotalCond))
								strTotalCond += " AND ";
							strTotalCond += strCond;
						}

						if (ObjectUtils.isEmpty(strTotalCond))
							continue;

						// if (queryConfig.isExcludeMode()) {
						// strTotalCond = "NOT " + strTotalCond + "";
						// }
						listconditions.add(strTotalCond);
					}
					if (listconditions.size() == 0)
						continue;

					String strTotalCond = "";
					for (String strCond : listconditions) {
						if (ObjectUtils.isEmpty(strCond))
							continue;

						if (!ObjectUtils.isEmpty(strTotalCond))
							strTotalCond += " AND ";
						strTotalCond += strCond;
					}

					if (ObjectUtils.isEmpty(strTotalCond))
						continue;

					mainConditionList.add("NOT (" + strTotalCond + ")");
				}
			}

			String strOrTotalCond = "";
			if (orQueryConfigs != null) {
				for (List<IPSDEDQMain> orList : orQueryConfigs) {

					List<String> listconditions = new ArrayList<String>();

					for (IPSDEDQMain queryConfig : orList) {
						if (!ObjectUtils.isEmpty(queryConfig.getAlias())) {
							qmAliasMap.put(queryConfig.getAlias().toLowerCase(), qmAlias);
						}

						List<String> conditions = new ArrayList<String>();
						complie(queryConfig, this.majorPSDataEntity, derAliasMap, derList, conditions, null);

						if (queryConfig.getPSDEDQGroupCondition() != null) {
							String strGroupCondition = getGroupCondition(this.majorDataEntityRuntime, "", queryConfig.getPSDEDQGroupCondition(), derAliasMap, derList);
							if (!ObjectUtils.isEmpty(strGroupCondition))
								conditions.add(strGroupCondition);
						}

						if (conditions.size() == 0)
							continue;

						String strTotalCond = "";
						for (String strCond : conditions) {
							if (ObjectUtils.isEmpty(strCond))
								continue;

							if (!ObjectUtils.isEmpty(strTotalCond))
								strTotalCond += " AND ";
							strTotalCond += strCond;
						}

						if (ObjectUtils.isEmpty(strTotalCond))
							continue;

						// if (queryConfig.isExcludeMode()) {
						// strTotalCond = "NOT" + strTotalCond + "";
						// }
						listconditions.add(strTotalCond);
					}

					if (listconditions.size() == 0)
						continue;

					String strTotalCond = "";
					for (String strCond : listconditions) {
						if (ObjectUtils.isEmpty(strCond))
							continue;

						if (!ObjectUtils.isEmpty(strTotalCond))
							strTotalCond += " AND ";
						strTotalCond += strCond;
					}

					if (ObjectUtils.isEmpty(strTotalCond))
						continue;

					if (!ObjectUtils.isEmpty(strOrTotalCond))
						strOrTotalCond += " OR ";
					strOrTotalCond += ("(" + strTotalCond + ")");
				}
			}
			if (ObjectUtils.isEmpty(strOrTotalCond))
				strOrTotalCond = "(1<>1)";

			mainConditionList.add(strOrTotalCond);
		}

		// 合并条件

		// SaaS实体
		if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
			mainConditionList.add(String.format("t1.%1$s = '__SRFSAASDCID__'", strSaaSDCIdColName));
		}

		if (this.majorPSDataEntity.isLogicValid()) {
			IPSDEField iPSDEField = this.majorDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.LOGICVALID, false);
			if (iPSDEField != null) {
				// mainConditionList.add(String.format("t1.%1$s = %2$s",
				// iPSDEField.getPSDTColumn(this.getDBType()).getFormalColumnName(),
				// this.majorPSDataEntity.getPSDEDBConfig(this.getDBType()).getLogicValidSQLCode(true)));
				if (DataTypeUtils.isNumberDataType(iPSDEField.getStdDataType())) {
					mainConditionList.add(String.format("t1.%1$s = %2$s", iDBDialect.getDBObjStandardName(iPSDEField.getName()), this.majorDataEntityRuntime.getValidLogicValue()));
				} else {
					mainConditionList.add(String.format("t1.%1$s = '%2$s'", iDBDialect.getDBObjStandardName(iPSDEField.getName()), this.majorDataEntityRuntime.getValidLogicValue()));
				}
			} else {
				throw new Exception(String.format("无法找到实体[%1$s]的逻辑有效属性", this.majorPSDataEntity.getName()));
			}
		}

		if (this.majorPSDataEntity.isVirtual() && this.majorPSDataEntity.getVirtualMode() == DEVirtualMode.INHERIT.value) {
			// 合入继承过滤
			IPSDERInherit iPSDERInherit = this.majorPSDataEntity.getPSDERInherit();
			if (iPSDERInherit != null) {
				IPSDEField indexTypePSDEField = this.majorPSDataEntity.getInheritPSDataEntity().getIndexTypePSDEField();
				IPSDEField curIndexTypePSDEField = null;
				// 获取继承识别属性的继承属性
				psDEFields = this.majorPSDataEntity.getAllPSDEFields();
				if (!ObjectUtils.isEmpty(psDEFields)) {
					for (IPSDEField iPSDEField : psDEFields) {
						if (iPSDEField instanceof IPSLinkDEField) {
							if (DataTypeUtils.compare(((IPSLinkDEField) iPSDEField).getRelatedPSDEField().getId(), indexTypePSDEField.getId(), false) == 0) {
								curIndexTypePSDEField = iPSDEField;
								break;
							}
						}
					}
				}

				if (curIndexTypePSDEField == null) {
					throw new Exception(String.format("无法找到实体[%1$s]的继承识别属性", this.majorPSDataEntity.getName()));
				}
				String strPSDEFieldExp = getPSDEFieldExp(curIndexTypePSDEField, "", derAliasMap, derList);

				mainConditionList.add(this.getConditionSQL(strPSDEFieldExp, curIndexTypePSDEField.getStdDataType(), Conditions.EQ, iPSDERInherit.getTypeValue(), ""));

			} else {
				throw new Exception(String.format("无法找到实体[%1$s]的继承关系", this.majorPSDataEntity.getName()));
			}
		}

		// 主数据条件
		if (mainQueryConfig.getPSDEDQGroupCondition() != null) {
			String strGroupCondition = getGroupCondition(this.majorDataEntityRuntime, "", mainQueryConfig.getPSDEDQGroupCondition(), derAliasMap, derList);
			if (!ObjectUtils.isEmpty(strGroupCondition))
				mainConditionList.add(strGroupCondition);
		}

		if (mainQueryConfig2 != null && mainQueryConfig2.getPSDEDQGroupCondition() != null) {
			String strGroupCondition = getGroupCondition(this.majorDataEntityRuntime, "", mainQueryConfig2.getPSDEDQGroupCondition(), derAliasMap, derList);
			if (!ObjectUtils.isEmpty(strGroupCondition))
				mainConditionList.add(strGroupCondition);
		}

		Map<String, Integer> joinMap = new TreeMap<String, Integer>();
		// 循环其它的关系
		for (String strDERs : derList) {
			getJoin(script, scriptTemp, this.majorDataEntityRuntime, this.majorPSDataEntity.isEnableTempDataBackend(), "", strDERs, derAliasMap, joinMap);
		}

		majorConditionList = mainConditionList;

		if (bDelete) {
			strQueryScript = "DELETE \n";
		} else {
			strQueryScript = "SELECT\n";
			// if (mainQueryConfig.isDistinctMode()) {
			// strQueryScript += " DISTINCT\n";
			// }

			int nIndex = 0;
			// 输出脚本
			boolean bFirst = true;
			for (String strColumnName : extSelects.keySet()) {
				if (bFirst) {
					bFirst = false;
				} else {
					strQueryScript += ",\n";
				}

				String strField = extSelects.get(strColumnName);
				// if (DataTypeUtils.compare(majorPSDEDBConfig.getObjNameCase(),
				// IPSSystemDBConfig.OBJNAME_UCASE, true) == 0) {
				// strColumnName = strColumnName.toUpperCase();
				// } else if
				// (DataTypeUtils.compare(majorPSDEDBConfig.getObjNameCase(),
				// IPSSystemDBConfig.OBJNAME_LCASE, true) == 0) {
				// strColumnName = strColumnName.toLowerCase();
				// }

				String[] parts = strField.split("[.]");
				String strAlias = this.iDBDialect.getDBObjStandardName(strColumnName);
				if (parts.length == 2 && DataTypeUtils.compare(parts[1], strAlias, false) == 0) {
					strQueryScript += String.format("%1$s", strField);
				} else {
					strQueryScript += String.format("%1$s AS %2$s", strField, strAlias);
				}

				DEDataQueryCodeExp deDataQueryCodeExpImpl = new DEDataQueryCodeExp();
				deDataQueryCodeExpImpl.setName(strColumnName);
				deDataQueryCodeExpImpl.setExpression(strField);
				deDataQueryCodeExpImpl.setShowOrder(nIndex);
				nIndex++;
				this.deDataQueryCodeExpImplList.add(deDataQueryCodeExpImpl);
			}
		}
		if (scriptTemp != null) {
			strQueryScriptTemp = strQueryScript;
			if (!bDelete) {
				strQueryScriptTemp += String.format(",t1.%1$s AS %1$s,t1.%2$s AS %2$s", this.iDBDialect.getDBObjStandardName("SRFORIKEY"), this.iDBDialect.getDBObjStandardName("SRFDRAFTFLAG"));
			}
		}
		strQueryScript += script.toString();
		if (scriptTemp != null) {
			strQueryScriptTemp += scriptTemp.toString();
		}

		majorDERList = derList;
		majorDERAliasMap = derAliasMap;

		// 放入其它表达式
		for (String strColumnName : fieldExpMap.keySet()) {
			if (extSelects.containsKey(strColumnName)) {
				continue;
			}
			String strExpression = fieldExpMap.get(strColumnName);

			DEDataQueryCodeExp deDataQueryCodeExpImpl = new DEDataQueryCodeExp();
			deDataQueryCodeExpImpl.setName(strColumnName);
			deDataQueryCodeExpImpl.setExpression(strExpression);
			deDataQueryCodeExpImpl.setShowOrder(-1);
			this.deDataQueryCodeExpImplList.add(deDataQueryCodeExpImpl);
		}

		for (String strCondition : majorConditionList) {
			DEDataQueryCodeCond deDataQueryCodeCondImpl = new DEDataQueryCodeCond();
			deDataQueryCodeCondImpl.setName("");
			deDataQueryCodeCondImpl.setCustomCond(strCondition);
			deDataQueryCodeCondImpl.setShowOrder(-1);
			this.deDataQueryCodeCondImplList.add(deDataQueryCodeCondImpl);
		}

		String strAlias = "";
		for (String strAliasName : this.qmAliasMap.keySet()) {
			if (DataTypeUtils.compare(strAliasName, "MAIN", true) == 0) {
				continue;
			}

			DEDQAlias psDEDQAlias = this.qmAliasMap.get(strAliasName);
			// psDEDQAlias.toString();
			if (!ObjectUtils.isEmpty(strAlias)) {
				strAlias += ",";
			}
			strAlias += String.format("ALIAS.%1$s=t%2$s", strAliasName, psDEDQAlias.getAliasIndex() + 1);
		}
		if (!ObjectUtils.isEmpty(strAlias)) {
			strQueryScript += String.format("\r\n/*%1$s*/", strAlias);
		}

	}

	public void compile(IPSDEDQMain mainQueryConfig) throws Throwable {
		compile(mainQueryConfig, null, false, null, null);
	}

	public void compile(IPSDEDQMain mainQueryConfig, IPSDEDQMain mainQueryConfig2) throws Throwable {
		compileEx(mainQueryConfig, mainQueryConfig2, false, null, null, false);
	}

	public void compileEx(IPSDEDQMain mainQueryConfig, IPSDEDQMain mainQueryConfig2, boolean bDeleteMode) throws Throwable {
		compileEx(mainQueryConfig, mainQueryConfig2, false, null, null, bDeleteMode);
	}

	final private void complie(IPSDEDQMain mainQueryConfig, IPSDataEntity iPSDataEntity, Map<String, Integer> derAliasMap, List<String> derList, List<String> conditionList, TreeMap<String, String> extSelects) throws Throwable {
		java.util.List<IPSDEDQJoin> psQMJoinQueries = mainQueryConfig.getChildPSDEDQJoins();
		if (psQMJoinQueries == null)
			return;

		for (IPSDEDQJoin joinQueryConfig : psQMJoinQueries) {

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NO.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, true, false, false, false, false, false, false, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NORIGHT.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, false, false, false, false, false, false, true, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMNO.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, true, false, false, false, false, false, true, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OO.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, true, false, false, false, false, false, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OOM.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, false, true, false, false, false, false, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONLEFTOUT.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, false, false, true, false, false, false, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ON.value, true) == 0) {
				String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, false);
				conditionList.add(strCondition);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMON.value, true) == 0) {
				String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, true);
				conditionList.add(strCondition);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONNOT.value, true) == 0) {
				String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, false);
				conditionList.add("NOT(" + strCondition + ")");
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMONNOT.value, true) == 0) {
				String strCondition = buildExistQuery(this.majorDataEntityRuntime, joinQueryConfig, 0, true);
				conditionList.add("NOT(" + strCondition + ")");
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEX.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, false, false, false, true, false, false, false, extSelects);
				continue;
			}

			if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEXM.value, true) == 0) {
				buildJoinQuery(this.majorDataEntityRuntime, joinQueryConfig, "", derAliasMap, derList, conditionList, false, false, false, false, false, true, false, false, extSelects);
				continue;
			}
		}

	}

	/**
	 * 编译直接代码模式
	 *
	 * @param strQuerySQL
	 * @param strQueryParam
	 * @param strQueryField
	 * @return
	 */
	public void compileRawCodeMode(String strQuerySQL, String strQueryCond, String strQueryParam, String strQueryField) throws Exception {
		this.strQueryScript = strQuerySQL;
		if (!ObjectUtils.isEmpty(strQueryCond)) {
			if (this.majorConditionList == null)
				this.majorConditionList = new ArrayList<String>();
			this.majorConditionList.add(strQueryCond);
		}

		// 分析参数，使用
		try {
			strQueryParam = strQueryParam.replace("\r\n", "\n");
			String[] params = strQueryParam.split("[\n]");
			for (int i = 0; i < params.length; i++) {
				String strParam = params[i];
				strParam = strParam.trim();
				if (ObjectUtils.isEmpty(strParam))
					continue;

				CallParam callParam = new CallParam();
				callParam.setParamName(strParam);
				callParams.add(callParam);
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new Exception(String.format("加载查询变量发生错误，%1$s", e.getMessage()));
		}

		fieldExpMap.clear();
		fieldDataTypeMap.clear();

		java.util.List<IPSDEField> psDEFields = majorPSDataEntity.getAllPSDEFields();
		if (!ObjectUtils.isEmpty(psDEFields)) {
			for (IPSDEField iPSDEField : psDEFields) {

				if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
					continue;

				fieldDataTypeMap.put(iPSDEField.getName(), iPSDEField.getStdDataType());
				fieldExpMap.put(iPSDEField.getName(), iPSDEField.getName());
			}
		}

	}

	/**
	 * 获取查询脚本
	 *
	 * @return
	 */
	public String getQueryScript() {
		return this.strQueryScript;
	}

	/**
	 * 获取查询脚本临时
	 *
	 * @return
	 */
	public String getQueryScriptTemp() {
		return this.strQueryScriptTemp;
	}

	// public String getQueryModelScriptEx(ISRFExWebContext webContext) throws
	// Exception {
	// String strFinalScript = this.strQueryScript;
	// for (URLCondPair condPair : urlCondPairList) {
	// String strParamValue = webContext.GetParamValue(condPair.strURLParam);
	// // if(ObjectUtils.isEmpty(strParamValue))
	// // strParamValue = webContext.GetPostValue(condPair.strURLParam);
	// if (ObjectUtils.isEmpty(strParamValue)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// String strCond = this.getConditionSQL(condPair.strFieldName,
	// condPair.nDataType, condPair.strCondition, strParamValue, "");
	// if (ObjectUtils.isEmpty(strCond)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, strCond);
	// }
	// }
	// }
	//
	// return strFinalScript;
	// }
	//
	// public String replaceURLParamMacro(String strFinalScript,
	// ISRFExWebContext webContext, boolean bTestPost) throws Exception {
	// for (URLCondPair condPair : urlCondPairList) {
	// String strParamValue = webContext.GetParamValue(condPair.strURLParam);
	// if (ObjectUtils.isEmpty(strParamValue) && bTestPost) {
	// strParamValue =
	// webContext.GetPostValue(condPair.strURLParam.toLowerCase());
	// }
	// if (ObjectUtils.isEmpty(strParamValue)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// String strCond = this.getConditionSQL(condPair.strFieldName,
	// condPair.nDataType, condPair.strCondition, strParamValue, "");
	// if (ObjectUtils.isEmpty(strCond)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, strCond);
	// }
	// }
	// }
	//
	// return strFinalScript;
	// }
	//
	// public String replaceURLParamMacro(String strFinalScript,
	// ISRFExWebContext webContext) throws Exception {
	// return replaceURLParamMacro(strFinalScript, webContext, false);
	// }
	//
	// public String replaceDynamicTableMacro(String strFinalScript,
	// ArrayList<String> dynamicTables) throws Exception {
	// if (dynamicTables.size() == 0) {
	// strFinalScript = strFinalScript.replace(TAG_DYNAMICTABLES, "没有找到对应的表");
	// return strFinalScript;
	// }
	//
	// if (dynamicTables.size() == 1) {
	// strFinalScript = strFinalScript.replace(TAG_DYNAMICTABLES,
	// dynamicTables.get(0));
	// } else {
	// String strTables = "(";
	// boolean bFirst = true;
	// for (String strTableName : dynamicTables) {
	// if (bFirst)
	// bFirst = false;
	// else {
	// strTables += " UNION ALL \n";
	// }
	//
	// strTables += String.format("SELECT * FROM %1$s \n", strTableName);
	// }
	// strTables += ")";
	// strFinalScript = strFinalScript.replace(TAG_DYNAMICTABLES, strTables);
	// }
	// return strFinalScript;
	// }

	/**
	 * 获取查询脚本
	 *
	 * @return
	 */
	public String getQueryModelScript(List<String> userConditionList) {
		List<String> conditionList = userConditionList;
		if (userConditionList == null)
			conditionList = this.majorConditionList;

		String strSql = this.strQueryScript;
		if (conditionList != null && conditionList.size() > 0) {
			strSql += " WHERE \n";
			boolean bFirst = true;
			for (String strCondition : conditionList) {
				if (bFirst) {
					bFirst = false;
				} else {
					strSql += " AND ";
				}
				strSql += strCondition;
			}
		}
		return strSql;
	}

	// public String getQueryModelScriptEx(ArrayList<String> userConditionList,
	// ISRFExWebContext webContext) throws Exception {
	// List<String> conditionList = userConditionList;
	// if (userConditionList == null)
	// conditionList = this.majorConditionList;
	//
	// String strSql = this.strQueryScript;
	// if (conditionList != null && conditionList.size() > 0) {
	// strSql += " WHERE \n";
	// boolean bFirst = true;
	// for (String strCondition : conditionList) {
	// if (bFirst) {
	// bFirst = false;
	// } else {
	// strSql += " AND ";
	// }
	// strSql += strCondition;
	// }
	// }
	// String strFinalScript = strSql;
	// for (URLCondPair condPair : urlCondPairList) {
	// String strParamValue = webContext.GetParamValue(condPair.strURLParam);
	// if (ObjectUtils.isEmpty(strParamValue)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// String strCond = this.getConditionSQL(condPair.strFieldName,
	// condPair.nDataType, condPair.strCondition, strParamValue, "");
	// if (ObjectUtils.isEmpty(strCond)) {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, condPair.bAll
	// ? "1=1" : "1<>1");
	// } else {
	// strFinalScript = strFinalScript.replace(condPair.strMacro, strCond);
	// }
	// }
	// }
	//
	// return strFinalScript;
	// }
	//
	// public void fillQMDeclareParams(ArrayList<CallParam> list,
	// ISRFDAWebContext webContext, ISRFDAGlobalHelper iDAGlobalHelper, String
	// strCurPersonId) {
	// fillQMDeclareParams(list, webContext, iDAGlobalHelper, strCurPersonId,
	// null);
	// }
	//
	// public void fillQMDeclareParams(ArrayList<CallParam> list,
	// ISRFDAWebContext webContext, ISRFDAGlobalHelper iDAGlobalHelper, String
	// strCurPersonId, BaseDataEntity baseDataEntity) {
	// CallResult callResult = null;
	//
	// for (String strName : qmDeclareMap.keySet()) {
	// DEDQDeclare qmDeclare = qmDeclareMap.get(strName);
	// for (CallParam callParam : qmDeclare.getParams()) {
	// CallParam cp = callParam.Clone();
	// callResult = MacroHelper.GetValue(cp.getParamName(), webContext,
	// iDAGlobalHelper, strCurPersonId, baseDataEntity);
	// if (callResult.getRetCode() == Errors.OK) {
	// Object objValue = callResult.getUserObject();
	// if (objValue == null || DataTypeUtils.compare(objValue.toString(),
	// cp.getParamName(), true) != 0) {
	// cp.setValue(objValue);
	// }
	// }
	// list.add(cp);
	// }
	// }
	// }
	//
	// public void fillCallParams(ArrayList<CallParam> list, ISRFDAWebContext
	// webContext, ISRFDAGlobalHelper iDAGlobalHelper, String strCurPersonId,
	// BaseDataEntity baseDataEntity) {
	// CallResult callResult = null;
	// for (CallParam callParam : callParams) {
	// CallParam cp = callParam.Clone();
	// callResult = MacroHelper.GetValue(cp.getParamName(), webContext,
	// iDAGlobalHelper, strCurPersonId, baseDataEntity);
	// if (callResult.getRetCode() == Errors.OK) {
	// Object objValue = callResult.getUserObject();
	// if (objValue == null || DataTypeUtils.compare(objValue.toString(),
	// cp.getParamName(), true) != 0) {
	// cp.setValue(objValue);
	// }
	// }
	//
	// list.add(cp);
	// }
	// }
	//
	// public void fillCallParams(ArrayList<CallParam> list, ISRFDAWebContext
	// webContext, ISRFDAGlobalHelper iDAGlobalHelper, String strCurPersonId) {
	// fillCallParams(list, webContext, iDAGlobalHelper, strCurPersonId, null);
	// }

	public void fillMajorConditions(List<String> list) {
		if (majorConditionList == null)
			return;
		for (String strCondition : majorConditionList) {
			list.add(strCondition);
		}
	}

	private void buildJoinQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDQJoin joinQueryConfig, String strParentDER, Map<String, Integer> derAliasMap, List<String> derList, List<String> mainConditionList, boolean bN1, boolean b11, boolean b11M, boolean b1NLEFTOUTER, boolean bIndex, boolean bIndexM, boolean bCustom, boolean bN1RIGHT, TreeMap<String, String> extSelects) throws Throwable {

		if (iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取实体辅助对象"));
		}

		if (!iDataEntityRuntime.getPSDataEntity().isEnableSQLStorage()) {
			log.warn(String.format("实体[%1$s]不支持SQL存储，忽略连接", iDataEntityRuntime.getName()));
			return;
		}

		String strDERID = joinQueryConfig.getJoinPSDERMust().getId();
		String strMajorDEID = "";
		if (bN1 || b1NLEFTOUTER || bN1RIGHT) {
			if (bCustom) {
				IPSDERCustom der1N = (IPSDERCustom) joinQueryConfig.getJoinPSDERMust();
				if (bN1) {
					strMajorDEID = der1N.getMajorPSDataEntityMust().getId();
				} else if (b1NLEFTOUTER) {
					strMajorDEID = der1N.getMinorPSDataEntityMust().getId();
					strDERID = "1NLO:" + strDERID;
				} else {
					strMajorDEID = der1N.getMajorPSDataEntityMust().getId();
					strDERID = "N1R:" + strDERID;
				}
			} else {
				IPSDERBase derBase = joinQueryConfig.getJoinPSDERMust();
				// IPSDER1N der1N = (IPSDER1N)
				// this.getPSSystem().getPSDER(strDERID);
				if (bN1) {
					strMajorDEID = derBase.getMajorPSDataEntityMust().getId();
				} else if (b1NLEFTOUTER) {
					strMajorDEID = derBase.getMinorPSDataEntityMust().getId();
					strDERID = "1NLO:" + strDERID;
				} else {
					strMajorDEID = derBase.getMajorPSDataEntityMust().getId();
					strDERID = "N1R:" + strDERID;
				}
			}
		}

		if (b11 || b11M) {
			IPSDERBase derBase = joinQueryConfig.getJoinPSDERMust();
			if (b11)
				strMajorDEID = derBase.getMajorPSDataEntityMust().getId();
			else {
				strMajorDEID = derBase.getMinorPSDataEntityMust().getId();
				strDERID = "11M:" + strDERID;
			}
		}

		if (bIndex || bIndexM) {
			IPSDERIndex derIndex = (IPSDERIndex) joinQueryConfig.getJoinPSDERMust();
			if (bIndex) {
				strMajorDEID = derIndex.getMajorPSDataEntityMust().getId();
				strDERID = "INDEX:" + strDERID;
			} else {
				strMajorDEID = derIndex.getMinorPSDataEntityMust().getId();
				strDERID = "INDEXM:" + strDERID;
			}
		}

		String strNewDER = strParentDER;
		if (!ObjectUtils.isEmpty(strNewDER))
			strNewDER += "|";
		strNewDER += strDERID;

		if (!derAliasMap.containsKey(strNewDER)) {
			derAliasMap.put(strNewDER, getAliasIndex());

			String strLastDERID = "";
			if (derList.size() > 0)
				strLastDERID = derList.get(derList.size() - 1);
			if ((strNewDER.indexOf(strLastDERID) == 0) && (strNewDER.length() == strLastDERID.length() || strNewDER.charAt(strLastDERID.length()) == '|') && !ObjectUtils.isEmpty(strLastDERID)) {
				derList.set(derList.size() - 1, strNewDER);
			} else
				derList.add(strNewDER);
		}

		int nCurAliasIndex = derAliasMap.get(strNewDER);

		IDataEntityRuntime iCurDEHelper = this.getDataEntityRuntime(strMajorDEID);// getPSDataEntity(strMajorDEID);
		if (extSelects != null) {
			java.util.List<IPSDEDQColumn> psDEDQColumns = joinQueryConfig.getSelectedPSDEDQColumns();
			if (psDEDQColumns != null) {
				for (IPSDEDQColumn iPSDEDQColumn : psDEDQColumns) {
					IPSDEField iPSDEField = iCurDEHelper.getPSDEField(iPSDEDQColumn.getName(), false);
					String strFieldName = getPSDEFieldExp(iPSDEField, strNewDER, derAliasMap, derList);
					extSelects.put(iPSDEDQColumn.getAlias(), strFieldName);
				}
			}
		}

		if (!ObjectUtils.isEmpty(joinQueryConfig.getAlias())) {
			DEDQAlias qmAlias = new DEDQAlias();
			qmAlias.setPSDataEntity(iCurDEHelper.getPSDataEntity());
			qmAlias.setParentDER(strNewDER);
			qmAlias.setDERAliasMap(derAliasMap);
			qmAlias.setDERList(derList);
			qmAlias.setAliasIndex(nCurAliasIndex);
			qmAliasMap.put(joinQueryConfig.getAlias().toLowerCase(), qmAlias);
		}

		// 循环其它关系
		if (joinQueryConfig.getChildPSDEDQJoins() != null) {
			java.util.List<IPSDEDQJoin> psDEDQJoinsIterator = joinQueryConfig.getChildPSDEDQJoins();
			for (IPSDEDQJoin subjoinQueryConfig : psDEDQJoinsIterator) {

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.NO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, true, false, false, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.NORIGHT.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, false, false, false, false, false, false, true, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMNO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, true, false, false, false, false, false, true, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.OO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, true, false, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.OOM.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, false, true, false, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.ONLEFTOUT.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, false, false, true, false, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.ON.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, subjoinQueryConfig, nCurAliasIndex, false);
					mainConditionList.add(strCondition);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMON.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, subjoinQueryConfig, nCurAliasIndex, true);
					mainConditionList.add(strCondition);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.ONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, subjoinQueryConfig, nCurAliasIndex, false);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, subjoinQueryConfig, nCurAliasIndex, true);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.INDEX.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, false, false, false, true, false, false, false, extSelects);
					continue;
				}

				if (DataTypeUtils.compare(subjoinQueryConfig.getJoinType(), DEDQJoinType.INDEXM.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, subjoinQueryConfig, strNewDER, derAliasMap, derList, mainConditionList, false, false, false, false, false, true, false, false, extSelects);
					continue;
				}
			}
		}

		// 放入关系
		if (joinQueryConfig.getPSDEDQGroupCondition() != null) {
			String strGroupCondition = getGroupCondition(iCurDEHelper, strNewDER, joinQueryConfig.getPSDEDQGroupCondition(), derAliasMap, derList);
			if (!ObjectUtils.isEmpty(strGroupCondition))
				mainConditionList.add(strGroupCondition);
		}
	}

	protected String buildExistQuery(IDataEntityRuntime iDataEntityRuntime, IPSDEDQJoin existQueryConfig, int nAlias, boolean bCustom) throws Throwable {
		if (iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取实体辅助对象"));
		}

		if (!iDataEntityRuntime.getPSDataEntity().isEnableSQLStorage()) {
			throw new Exception(String.format("实体[%1$s]不支持SQL存储", iDataEntityRuntime.getName()));
		}

		String strDERID = existQueryConfig.getJoinPSDERMust().getId();
		List<String> mainConditionList = new ArrayList<String>();
		List<String> derList = new ArrayList<String>();
		Map<String, Integer> derAliasMap = new TreeMap<String, Integer>();
		IDataEntityRuntime iCurDEHelper = null;
		int nCurAliasIndex = -1;
		StringBuilder script = new StringBuilder();
		boolean bFirst = true;

		if (bCustom) {
			IPSDERCustom der1N = (IPSDERCustom) existQueryConfig.getJoinPSDERMust();

			// 相关数据对象
			iCurDEHelper = this.getDataEntityRuntime(der1N.getMinorPSDataEntityMust().getId());

			nCurAliasIndex = this.getAliasIndex();
			if (!ObjectUtils.isEmpty(existQueryConfig.getAlias())) {
				DEDQAlias qmAlias = new DEDQAlias();
				qmAlias.setPSDataEntity(iCurDEHelper.getPSDataEntity());
				qmAlias.setParentDER("");
				qmAlias.setDERAliasMap(derAliasMap);
				qmAlias.setDERList(derList);
				qmAlias.setAliasIndex(nCurAliasIndex);
				qmAliasMap.put(existQueryConfig.getAlias().toLowerCase(), qmAlias);
			}

			IPSDEField pKeyDEFHelper = iCurDEHelper.getKeyPSDEField();

			String strMainTable = iCurDEHelper.getTableName();
			// String strUserTable =
			// iCurDEHelper.getPSDEDBConfig(this.getDBType()).getUserTable();

			String strMainTable2 = strMainTable;
			// String strUserTable2 = strUserTable;

			// if (DataTypeUtils.compare(iCurDEHelper.getDBSchema(),
			// this.majorPSDataEntity.getDBSchema(), true) != 0) {
			// strMainTable2 = String.format("%1$s.%2$s",
			// iCurDEHelper.getDBSchema(), strMainTable);
			// strUserTable2 = String.format("%1$s.%2$s",
			// iCurDEHelper.getDBSchema(), strUserTable);
			// }

			derAliasMap.put("", nCurAliasIndex);

			script.append(String.format("SELECT * FROM %1$s t%2$s \n", this.iDBDialect.getDBObjStandardName(strMainTable2), nCurAliasIndex + 1));
			// if (!ObjectUtils.isEmpty(strUserTable)) {
			// script.append("INNER JOIN %1$s t%4$s ON t%3$s.%2$s =
			// t%4$s.%2$s\n",
			// this.iDBDialect.getDBObjStandardName(strUserTable2),
			// this.iDBDialect.getDBObjStandardName(pKeyDEFHelper.getPSDTColumn(this.getDBType()).getColumnName()),
			// nCurAliasIndex + 1, nCurAliasIndex + 2);
			// }

			if (iCurDEHelper.isEnableLogicValid()) {
				IPSDEField iValidDEFHelper = iCurDEHelper.getPSDEFieldByPredefinedType(PredefinedFieldType.LOGICVALID, false);
				if (DataTypeUtils.isNumberDataType(iValidDEFHelper.getStdDataType())) {
					mainConditionList.add(String.format("t%3$s.%1$s = %2$s", this.iDBDialect.getDBObjStandardName(iValidDEFHelper.getName()), iCurDEHelper.getValidLogicValue(), nCurAliasIndex + 1));
				} else {
					mainConditionList.add(String.format("t%3$s.%1$s = '%2$s'", this.iDBDialect.getDBObjStandardName(iValidDEFHelper.getName()), iCurDEHelper.getValidLogicValue(), nCurAliasIndex + 1));
				}
			}

			throw new Exception("没有实现自定义关系");
		} else {

			nCurAliasIndex = this.getAliasIndex();

			IPSDERBase derBase = existQueryConfig.getJoinPSDERMust();
			if (!ObjectUtils.isEmpty(existQueryConfig.getAlias())) {
				DEDQAlias qmAlias = new DEDQAlias();
				qmAlias.setPSDataEntity(iCurDEHelper.getPSDataEntity());
				qmAlias.setParentDER("");
				qmAlias.setDERAliasMap(derAliasMap);
				qmAlias.setDERList(derList);
				qmAlias.setAliasIndex(nCurAliasIndex);
				qmAliasMap.put(existQueryConfig.getAlias().toLowerCase(), qmAlias);
			}

			iCurDEHelper = this.getDataEntityRuntime(derBase.getMinorPSDataEntityMust().getId());
			IPSDEField pKeyDEFHelper = iCurDEHelper.getKeyPSDEField();
			IPSDEField pickupDEFHelper = null;
			IPSDERCustom derCustom = null;
			if (derBase instanceof IPSDER1N) {
				IPSDER1N der1N = (IPSDER1N) derBase;
				pickupDEFHelper = der1N.getPickupPSDEField();
			} else if (derBase instanceof IPSDERCustom) {
				derCustom = (IPSDERCustom) derBase;
				pickupDEFHelper = derCustom.getPickupPSDEField();
			}

			if (pKeyDEFHelper == null) {
				throw new Exception(String.format("无法获取实体[%1$s]的主键属性 ", iCurDEHelper.getName()));
			}

			if (pickupDEFHelper == null) {
				throw new Exception(String.format("无法获取实体[%1$s]的与相关实体的关系属性 ", iCurDEHelper.getName()));
			}

			IPSDEField pickupRelatedDEFHelper = null;
			if (pickupDEFHelper instanceof IPSLinkDEField) {
				pickupRelatedDEFHelper = ((IPSLinkDEField) pickupDEFHelper).getRelatedPSDEField();
			}
			if (pickupRelatedDEFHelper == null) {
				if (derCustom != null) {
					pickupRelatedDEFHelper = iDataEntityRuntime.getKeyPSDEField();
				}
				if (pickupRelatedDEFHelper == null) {
					throw new Exception(String.format("无法获取属性[%1$s]的关系属性 ", pickupDEFHelper.getName()));
				}
			}

			// 判断该关系属性与上级属性
			if (DataTypeUtils.compare(pickupRelatedDEFHelper.getParentPSModelObject(IPSDataEntity.class).getId(), iDataEntityRuntime.getId(), true) != 0) {
				throw new Exception(String.format("关系属性[%1$s]的实体与上级实体不一致 ", pickupDEFHelper.getName()));
			}

			String strMainTable = iCurDEHelper.getTableName();// .getPSDEDBConfig(this.getDBType()).getTableName();
			// String strUserTable =
			// iCurDEHelper.getPSDEDBConfig(this.getDBType()).getUserTable();

			String strMainTable2 = strMainTable;
			// String strUserTable2 = strUserTable;

			String strSaaSDCIdColName = "";
			// if (iCurDEHelper.getSaaSMode() == IPSDataEntity.SAASMODE_STANDARD
			// || iCurDEHelper.getSaaSMode() ==
			// IPSDataEntity.SAASMODE_STANDARD3) {
			// strSaaSDCIdColName =
			// iCurDEHelper.getPSDEDBConfig(this.getDBType()).getSaaSDCIdColumnName();
			// }
			//
			// if (DataTypeUtils.compare(iCurDEHelper.getDBSchema(),
			// this.majorPSDataEntity.getDBSchema(), true) != 0) {
			// strMainTable2 = String.format("%1$s.%2$s",
			// iCurDEHelper.getDBSchema(), strMainTable);
			// strUserTable2 = String.format("%1$s.%2$s",
			// iCurDEHelper.getDBSchema(), strUserTable);
			// }

			derAliasMap.put("", nCurAliasIndex);

			script.append(String.format("SELECT * FROM %1$s t%2$s \n", this.iDBDialect.getDBObjStandardName(strMainTable2), nCurAliasIndex + 1));
			// if (!ObjectUtils.isEmpty(strUserTable)) {
			// script.append("INNER JOIN %1$s t%4$s ON t%3$s.%2$s = t%4$s.%2$s",
			// this.iDBDialect.getDBObjStandardName(strUserTable2),
			// this.iDBDialect.getDBObjStandardName(pKeyDEFHelper.getPSDTColumn(this.getDBType()).getColumnName()),
			// nCurAliasIndex + 1, nCurAliasIndex + 2);
			// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
			// script.append(" AND t%1$s.%2$s = '__SRFSAASDCID__'",
			// nCurAliasIndex + 2, strSaaSDCIdColName);
			// }
			// script.append("\n");
			// }

			if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
				mainConditionList.add(String.format("t%1$s.%2$s = '__SRFSAASDCID__'", nCurAliasIndex + 1, strSaaSDCIdColName));
			}
			if (iCurDEHelper.isEnableLogicValid()) {
				IPSDEField iValidDEFHelper = iCurDEHelper.getPSDEFieldByPredefinedType(PredefinedFieldType.LOGICVALID, false);
				if (iValidDEFHelper != null) {
					if (DataTypeUtils.isNumberDataType(iValidDEFHelper.getStdDataType())) {
						mainConditionList.add(String.format("t%3$s.%1$s = %2$s", this.iDBDialect.getDBObjStandardName(iValidDEFHelper.getName()), iCurDEHelper.getValidLogicValue(), nCurAliasIndex + 1));
					} else {
						mainConditionList.add(String.format("t%3$s.%1$s = '%2$s'", this.iDBDialect.getDBObjStandardName(iValidDEFHelper.getName()), iCurDEHelper.getValidLogicValue(), nCurAliasIndex + 1));
					}
				} else {
					throw new Exception(String.format("无法找到实体[%1$s]的逻辑有效属性", iCurDEHelper.getName()));
				}
			}

			// 附加上级关系
			boolean bMT = true;
			// if
			// (DataTypeUtils.compare(pickupDEFHelper.getPSDTColumn(this.getDBType()).getRealTableName(),
			// strMainTable, true) == 0)
			// bMT = true;
			// else
			// bMT = false;

			mainConditionList.add(String.format("t%1$s.%3$s = t%2$s.%4$s", nAlias + 1, nCurAliasIndex + (bMT ? 1 : 2), this.iDBDialect.getDBObjStandardName(pickupRelatedDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(pickupDEFHelper.getName())));

			if (derCustom != null) {
				IPSDEField parentType = iCurDEHelper.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, true);
				IPSDEField parentSubType = iCurDEHelper.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
				if (parentType != null) {
					String strFieldName = String.format("t%1$s.%2$s", nCurAliasIndex + (bMT ? 1 : 2), this.iDBDialect.getDBObjStandardName(parentType.getName()));
					// mainConditionList.add(parentType.getPSDTColumn(this.getDBType()).getConditionSQL(this,
					// strFieldName, null, ICondition.CONDOP_EQ,
					// iPSDataEntity.getName(), null, null));
					mainConditionList.add(this.iDBDialect.getConditionSQL(strFieldName, parentType.getStdDataType(), Conditions.EQ, iDataEntityRuntime.getName(), false, null));
				}
				if (parentSubType != null) {
					String strFieldName = String.format("t%1$s.%2$s", nCurAliasIndex + (bMT ? 1 : 2), this.iDBDialect.getDBObjStandardName(parentSubType.getName()));
					String strTypeValue = derCustom.getTypeValue();
					if (ObjectUtils.isEmpty(strTypeValue)) {
						strTypeValue = derCustom.getMinorCodeName();
					}

					if (!ObjectUtils.isEmpty(strTypeValue)) {
						// mainConditionList.add(parentSubType.getPSDTColumn(this.getDBType()).getConditionSQL(this,
						// strFieldName, null, ICondition.CONDOP_EQ,
						// strTypeValue, null, null));
						mainConditionList.add(this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.EQ, strTypeValue, false, null));
					} else {
						// mainConditionList.add(parentSubType.getPSDTColumn(this.getDBType()).getConditionSQL(this,
						// strFieldName, null, ICondition.CONDOP_ISNULL, null,
						// null, null));
						mainConditionList.add(this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.ISNULL, null, false, null));
					}
				}
			}
		}

		// 循环其它关系
		if (existQueryConfig.getChildPSDEDQJoins() != null) {
			java.util.List<IPSDEDQJoin> childPSDEDQJoins = existQueryConfig.getChildPSDEDQJoins();
			for (IPSDEDQJoin joinQueryConfig : childPSDEDQJoins) {

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, true, false, false, false, false, false, false, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.NORIGHT.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, false, false, false, true, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMNO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, true, false, false, false, false, false, true, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OO.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, true, false, false, false, false, false, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.OOM.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, true, false, false, false, false, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONLEFTOUT.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, true, false, false, false, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ON.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, joinQueryConfig, nCurAliasIndex, false);
					mainConditionList.add((String) strCondition);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMON.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, joinQueryConfig, nCurAliasIndex, true);
					mainConditionList.add((String) strCondition);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.ONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, joinQueryConfig, nCurAliasIndex, false);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.CUSTOMONNOT.value, true) == 0) {
					String strCondition = buildExistQuery(iCurDEHelper, joinQueryConfig, nCurAliasIndex, true);
					mainConditionList.add("NOT(" + strCondition + ")");
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEX.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, true, false, false, false, null);
					continue;
				}

				if (DataTypeUtils.compare(joinQueryConfig.getJoinType(), DEDQJoinType.INDEXM.value, true) == 0) {
					buildJoinQuery(iCurDEHelper, joinQueryConfig, "", derAliasMap, derList, mainConditionList, false, false, false, false, false, true, false, false, null);
					continue;
				}
			}
		}

		// 主数据条件
		if (existQueryConfig.getPSDEDQGroupCondition() != null) {
			String strGroupCondition = getGroupCondition(iCurDEHelper, "", existQueryConfig.getPSDEDQGroupCondition(), derAliasMap, derList);
			if (!ObjectUtils.isEmpty(strGroupCondition))
				mainConditionList.add(strGroupCondition);
		}

		Map<String, Integer> joinMap = new TreeMap<String, Integer>();
		// 循环其它的关系
		for (String strDERs : derList) {
			getJoin(script, null, iCurDEHelper, false, "", strDERs, derAliasMap, joinMap);
		}

		if (mainConditionList.size() > 0) {
			script.append(" WHERE \n");
			bFirst = true;
			for (String strCondition : mainConditionList) {
				if (bFirst) {
					bFirst = false;
				} else {
					script.append(" AND ");
				}
				script.append(String.format(" %1$s ", strCondition));
			}
		}

		return "EXISTS(" + script.toString() + ")";
	}

	public String getGroupCondition(IPSDEDQGroupCondition iPSDEDQGroupCondition) throws Throwable {
		return getGroupCondition(this.majorDataEntityRuntime, "", iPSDEDQGroupCondition, majorDERAliasMap, majorDERList);
	}

	public String getPSDEFieldExp(String strDEField) throws Throwable {
		IPSDEField iPSDEField = this.majorDataEntityRuntime.getPSDEField(strDEField, true);
		if (iPSDEField == null)
			throw new Exception(String.format("无法获取实体属性[%1$s]对象", strDEField));

		return getPSDEFieldExp(iPSDEField);
	}

	public String getPSDEFieldExp(IPSDEField iPSDEField) throws Throwable {
		return getPSDEFieldExp(iPSDEField, "", majorDERAliasMap, majorDERList);
	}

	/**
	 * 未链接，返回-1
	 *
	 * @param strDERId
	 * @return
	 */
	public int getMajorDERAlias(String strDERId) {
		if (majorDERAliasMap.containsKey(strDERId))
			return majorDERAliasMap.get(strDERId);
		return -1;
	}

	protected String getGroupCondition(IDataEntityRuntime iDataEntityRuntime, String strParentDER, IPSDEDQGroupCondition iPSDEDQGroupCondition, Map<String, Integer> derAliasMap, List<String> derList) throws Throwable {
		boolean bHasCondition = false;
		StringBuilder script = new StringBuilder();

		if (iPSDEDQGroupCondition.getPSDEDQConditions() == null) {
			return "";
		}

		if (iPSDEDQGroupCondition.isNotMode())
			script.append("NOT");
		script.append("(");

		java.util.List<IPSDEDQCondition> psDEDQConditions = iPSDEDQGroupCondition.getPSDEDQConditions();
		if (!ObjectUtils.isEmpty(psDEDQConditions)) {
			for (IPSDEDQCondition iPSDEDQCondition : psDEDQConditions) {
				if (iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
					String strCond = getGroupCondition(iDataEntityRuntime, strParentDER, (IPSDEDQGroupCondition) iPSDEDQCondition, derAliasMap, derList);
					if (!ObjectUtils.isEmpty(strCond))
						strCond = strCond.trim();
					if (!ObjectUtils.isEmpty(strCond)) {
						if (bHasCondition) {
							if (DataTypeUtils.compare(iPSDEDQGroupCondition.getCondOp(), Conditions.AND, true) == 0)
								script.append(" AND ");
							else
								script.append(" OR ");
						}

						script.append(String.format(" %1$s ", strCond));
						bHasCondition = true;
					}

					continue;
				}

				if (iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
					IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition) iPSDEDQCondition;
					String strCond = getSingleCondition(iDataEntityRuntime, strParentDER, iPSDEDQFieldCondition, derAliasMap, derList);
					if (!ObjectUtils.isEmpty(strCond))
						strCond = strCond.trim();

					if (!ObjectUtils.isEmpty(strCond)) {
						if (bHasCondition) {
							if (DataTypeUtils.compare(iPSDEDQGroupCondition.getCondOp(), Conditions.AND, true) == 0)
								script.append(" AND ");
							else
								script.append(" OR ");
						}

						script.append(String.format(" %1$s ", strCond));
						bHasCondition = true;
					}
					continue;
				}

				if (iPSDEDQCondition instanceof IPSDEDQCustomCondition) {
					IPSDEDQCustomCondition iPSDEDQCustomCondition = (IPSDEDQCustomCondition) iPSDEDQCondition;
					String strCond = getCustomCondition(iDataEntityRuntime, strParentDER, iPSDEDQCustomCondition, derAliasMap, derList);
					if (!ObjectUtils.isEmpty(strCond))
						strCond = strCond.trim();

					if (!ObjectUtils.isEmpty(strCond)) {
						if (bHasCondition) {
							if (DataTypeUtils.compare(iPSDEDQGroupCondition.getCondOp(), Conditions.AND, true) == 0)
								script.append(" AND ");
							else
								script.append(" OR ");
						}

						script.append(String.format(" %1$s ", strCond));
						bHasCondition = true;
					}
					continue;
				}
			}
		}

		script.append(")");
		if (bHasCondition)
			return script.toString();
		else
			return "";
	}

	protected String getSingleCondition(IDataEntityRuntime iDataEntityRuntime, String strParentDER, IPSDEDQFieldCondition iPSDEDQFieldCondition, Map<String, Integer> derAliasMap, List<String> derList) throws Throwable {
		if (iDataEntityRuntime == null) {
			throw new Exception("没有指定实体辅助对象");
		}

		IPSDEField iPSDEField = iPSDEDQFieldCondition.getPSDEField();
		if (iPSDEField == null) {
			iPSDEField = iDataEntityRuntime.getPSDEField(iPSDEDQFieldCondition.getFieldName());
		}
		if (iPSDEField == null) {
			throw new Exception(String.format("无法找到属性[%1$s]", iPSDEDQFieldCondition.getFieldName()));
		}

		String strFieldName = getPSDEFieldExp(iPSDEField, strParentDER, derAliasMap, derList);

		String strFunc = iPSDEDQFieldCondition.getValueFunc();// .getPSSysDBVFId();
		if (ObjectUtils.isEmpty(strFunc)) {
			String strParamName = iPSDEDQFieldCondition.getPSVARTypeId();
			String strParamValue = iPSDEDQFieldCondition.getCondValue();
			if(strParamValue == null) {
				strParamValue = "";
			}

			if (this.globalParamMap.containsKey(strParamName)) {
				strParamValue = this.globalParamMap.get(strParamName);
				strParamName = "";
			}

			String strCode = null;
			if (ObjectUtils.isEmpty(strParamName) || !isEnablePQL()) {
				// strCode =
				// iPSDEField.getPSDTColumn(this.getDBType()).getConditionSQL(this,
				// strFieldName, iPSDEDQFieldCondition.getCondOp(),
				// strParamValue, strParamName,
				// iPSDEDQFieldCondition.getVARTypeParam());
				boolean bParamMode = false;
				String strParamValue2 = strParamValue;
				if(StringUtils.hasLength(strParamName)) {
					strParamValue2 = String.format("#{ctx.%1$s.%2$s}", strParamName.toLowerCase(), strParamValue.toLowerCase());
					bParamMode = true;
				}
				strCode = this.iDBDialect.getConditionSQL(strFieldName, iPSDEField.getStdDataType(), iPSDEDQFieldCondition.getCondOp(), strParamValue2, bParamMode, null);
			} else {
				String strDefaultParamName = "__PARAM__NAME__";
				String strDefaultParamName2 = "__PARAM__PARAM__";
				String strDefaultFuncName = "srf" + strDefaultParamName.toLowerCase();
				// strCode =
				// iPSDEField.getPSDTColumn(this.getDBType()).getConditionSQL(this,
				// strFieldName, iPSDEDQFieldCondition.getCondOp(),
				// strParamValue, strDefaultParamName, strDefaultParamName2);
				strCode = this.iDBDialect.getConditionSQL(strFieldName, iPSDEField.getStdDataType(), iPSDEDQFieldCondition.getCondOp(), strDefaultParamName, true, null);
				int nPos = strCode.indexOf(strDefaultFuncName);
				if (nPos != -1) {
					StringBuilder sb = new StringBuilder();
					String strPart1 = strCode.substring(0, nPos);
					int nPos2 = strPart1.lastIndexOf("$");
					if (nPos2 != -1) {
						sb.append(strPart1.substring(0, nPos2));
					} else
						throw new Exception(String.format("语句[%1$s]格式不正确", strCode));

					String strPart2 = strCode.substring(nPos + strDefaultFuncName.length());
					// 去除格式化
					strPart2 = strPart2.trim();
					// 判断函数类型
					nPos2 = strPart2.indexOf("'" + strDefaultParamName2 + "'");
					if (nPos2 != -1) {
						strPart1 = strPart2.substring(0, nPos2);
						strPart1 = strPart1.trim();
						// 去掉逗号
						strPart1 = strPart1.substring(1);
						strPart1 = strPart1.substring(0, strPart1.length() - 1);
						// 判断函数类型
						if (DataTypeUtils.compare(strParamName, "PQL", false) == 0) {
							// 去掉单引号
							strPart1 = strPart1.substring(1);
							strPart1 = strPart1.substring(0, strPart1.length() - 1);
							sb.append(strPart1);
						} else {
							sb.append(strParamName);
							sb.append("(");
							sb.append(strPart1);
							sb.append(")");
						}

						strPart2 = strPart2.substring(nPos2 + strDefaultParamName2.length() + 2);
						// 去除)
						strPart2 = strPart2.trim();
						if (strPart2.length() > 0)
							strPart2 = strPart2.substring(1);
						// 去除}
						strPart2 = strPart2.trim();
						if (strPart2.length() > 0)
							strPart2 = strPart2.substring(1);
						sb.append(strPart2);

						strCode = sb.toString();
					} else
						throw new Exception(String.format("语句[%1$s]格式不正确", strCode));
				} else {
					throw new Exception(String.format("语句[%1$s]格式不正确", strCode));
				}

			}

			if (!ObjectUtils.isEmpty(strCode)) {
				strCode = strCode.trim();
				if (!ObjectUtils.isEmpty(strCode)) {
					if(StringUtils.hasLength(iPSDEDQFieldCondition.getPSVARTypeId())) {
						String strPSVarTypeId = iPSDEDQFieldCondition.getPSVARTypeId();
						if(strPSVarTypeId == null) {
							strPSVarTypeId = "";
						}
						String strCondValue = iPSDEDQFieldCondition.getCondValue();
						if(strCondValue == null) {
							strCondValue = "";
						}

						StringBuilder sb = new StringBuilder();
						if (iPSDEDQFieldCondition.isIgnoreEmpty()) {
							sb.append(String.format("<choose><when test=\"ctx.%1$s.%2$s !=null \">", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
						}

						sb.append(strFieldName);
						sb.append(" ");
						switch(iPSDEDQFieldCondition.getCondOp()) {
							case Conditions.EQ:
							case Conditions.ABSEQ:
								sb.append("=");
								break;
							case Conditions.GT:
								sb.append(">");
								break;
							case Conditions.GTANDEQ:
								sb.append(">=");
								break;
							case Conditions.LT:
								sb.append("<");
								break;
							case Conditions.LTANDEQ:
								sb.append("<=");
								break;
							case Conditions.NOTEQ:
								sb.append("<>");
								break;
							case Conditions.ISNULL:
								sb.append("IS NULL");
								break;
							case Conditions.ISNOTNULL:
								sb.append("IS NOT NULL");
								break;
							case Conditions.USERLIKE:
							case Conditions.LIKE:
							case Conditions.LEFTLIKE:
							case Conditions.RIGHTLIKE:
								sb.append("LIKE");
								break;
							case Conditions.TESTNULL:
								sb.append("!=");
								break;
							case Conditions.IN:
								sb.append("IN");
								break;
							case Conditions.NOTIN:
								sb.append("NOT IN");
								break;
							case Conditions.CHILDOF:
								sb.append("!=");
								break;
							case Conditions.PARENTOF:
								sb.append("!=");
								break;
						}
						sb.append(" ");
						if(StringUtils.hasLength(iPSDEDQFieldCondition.getCondValue())) {
							switch(iPSDEDQFieldCondition.getCondOp()) {
								case Conditions.LIKE:
								case Conditions.USERLIKE:
									if(DBType.MYSQL5.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("CONCAT('%',#{ctx.%1$s.%2$s},'%')", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else
									if(DBType.ORACLE.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("'%' || #{ctx.%1$s.%2$s} || '%'", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else {
										sb.append(String.format("#{ctx.%1$s.%2$s}", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									break;
								case Conditions.LEFTLIKE:
									if(DBType.MYSQL5.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("CONCAT('%',#{ctx.%1$s.%2$s})", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else
									if(DBType.ORACLE.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("'%' || #{ctx.%1$s.%2$s}", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else {
										sb.append(String.format("#{ctx.%1$s.%2$s}", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									break;
								case Conditions.RIGHTLIKE:
									if(DBType.MYSQL5.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("CONCAT(#{ctx.%1$s.%2$s},'%')", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else
									if(DBType.ORACLE.value.equals(this.iDBDialect.getDBType())) {
										sb.append(String.format("#{ctx.%1$s.%2$s} || '%'", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									else {
										sb.append(String.format("#{ctx.%1$s.%2$s}", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									}
									break;
								case Conditions.IN:
									sb.append(String.format("({ctx.%1$s.%2$s})", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									break;
								default:
									sb.append(String.format("#{ctx.%1$s.%2$s}", strPSVarTypeId.toLowerCase(), strCondValue.toLowerCase()));
									break;
							}
						}
						else {
							sb.append(String.format("#{ctx.%1$s.unknown}", strPSVarTypeId.toLowerCase()));
						}

						if (iPSDEDQFieldCondition.isIgnoreEmpty()) {
							sb.append(String.format("</when><otherwise>1=1</otherwise></choose>"));
						}
						strCode = sb.toString();
					}
					else {
						return strCode;
					}
					// if (this.getMajorPSDataEntity().getPSSysSFPub() != null
					// &&
					// this.getMajorPSDataEntity().getPSSysSFPub().getPSSFStyle()
					// != null) {
					//
					// String strDEDQFieldCondTempl =
					// this.getMajorPSDataEntity().getPSSysSFPub().getPSSFStyle().getStyleParam("%DEDQ_FIELDCOND%",
					// "");
					// if (!ObjectUtils.isEmpty(strDEDQFieldCondTempl)) {
					// Map<String, Object> params = new HashMap<String,
					// Object>();
					// params.put("dbtype", this.getDBType());
					// params.put("code", strCode);
					// params.put("cond", iPSDEDQFieldCondition);
					// params.put("field", strFieldName);
					// String strResult =
					// PSTemplHelper.generateCode(strDEDQFieldCondTempl,
					// params);
					// return strResult;
					// }
					// }
					// 判断是否忽略控制
//					if (iPSDEDQFieldCondition.isIgnoreEmpty()) {
//						if (!ObjectUtils.isEmpty(iPSDEDQFieldCondition.getPSVARTypeId())) {
//							if (isEnablePQL()) {
//								if (DataTypeUtils.compare(strParamName, "PQL", false) != 0) {
//									return String.format("%1$sIF('%2$s', %3$s)", strParamName, iPSDEDQFieldCondition.getCondValue(), strCode);
//								}
//							} else {
//								// String strTag =
//								// String.format("${srf%1$s('%2$s','%3$s')}",
//								// iPSDEDQFieldCondition.getPSVARTypeId().toLowerCase(),
//								// iPSDEDQFieldCondition.getCondValue(),
//								// iPSDEDQFieldCondition.getVARTypeParam());
//								String strTag = String.format("${srf%1$s('%2$s','%3$s')}", iPSDEDQFieldCondition.getPSVARTypeId().toLowerCase(), iPSDEDQFieldCondition.getCondValue(), "{}");
//								if (strCode.indexOf(strTag) != -1) {
//									strCode = strCode.replace(strTag, "${_value}");
//								}
//
//								return String.format("<#assign _value=srf%2$s('%3$s','%4$s')><#if _value?length gt 0>%1$s<#else>1=1</#if>", strCode, iPSDEDQFieldCondition.getPSVARTypeId().toLowerCase(), iPSDEDQFieldCondition.getCondValue(), "{}");
//							}
//						}
//					}
				}
			}
			return strCode;
		} else {
			String strParamName = iPSDEDQFieldCondition.getPSVARTypeId();
			String strParamValue = iPSDEDQFieldCondition.getCondValue();

			if (this.globalParamMap.containsKey(strParamName)) {
				strParamValue = this.globalParamMap.get(strParamName);
				strParamName = "";
			}

			// IPSSysDBValueFunc iPSSysDBValueFunc =
			// this.getPSSystem().getPSSysDBValueFunc(strFunc);
			// IDBFunction iDBFunction =
			// this.iDBDialect.getDBFunction(iPSSysDBValueFunc.getCodeName());
			// String strSQL =
			// iPSDEField.getPSDTColumn(this.getDBType()).getConditionSQL(this,
			// strFieldName, iDBFunction, iPSDEDQFieldCondition.getCondOp(),
			// strParamValue, strParamName,
			// iPSDEDQFieldCondition.getVARTypeParam());
			// return strSQL;
			throw new Exception("没有实现");
		}
	}

	protected String getCustomCondition(IDataEntityRuntime iDataEntityRuntime, String strParentDER, IPSDEDQCustomCondition iPSDEDQCustomCondition, Map<String, Integer> derAliasMap, List<String> derList) throws Throwable {

		// if (this.getMajorPSDataEntity().getPSSysSFPub() != null &&
		// this.getMajorPSDataEntity().getPSSysSFPub().getPSSFStyle() != null) {
		// String strDEDQCustomCondTempl =
		// this.getMajorPSDataEntity().getPSSysSFPub().getPSSFStyle().getStyleParam("%DEDQ_CUSTOMCOND%",
		// "");
		// if (!ObjectUtils.isEmpty(strDEDQCustomCondTempl)) {
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("dbtype", this.getDBType());
		// params.put("code", iPSDEDQCustomCondition.getCondition());
		// params.put("cond", iPSDEDQCustomCondition);
		// String strResult = PSTemplHelper.generateCode(strDEDQCustomCondTempl,
		// params);
		// return strResult;
		// }
		// }

		return iPSDEDQCustomCondition.getCondition();
	}

	protected void getJoin(StringBuilder script, StringBuilder scriptTemp, IDataEntityRuntime iDataEntityRuntime, boolean bEnableTemp, String strParentDERs, String strDER, Map<String, Integer> derAliasMap, Map<String, Integer> joinMap) throws Throwable {
		if (ObjectUtils.isEmpty(strDER)) {
			throw new Exception(String.format("无法指定连接关系"));
		}

		// 判断当前关系是否已经连接
		String[] strDERs = strDER.split("[|]");

		String strCurDERId = strDERs[0];
		// 判断当前连接是否已经完成
		String strCurTotalDER = strParentDERs;
		if (!ObjectUtils.isEmpty(strCurTotalDER))
			strCurTotalDER += "|";
		strCurTotalDER += strCurDERId;

		IDataEntityRuntime iNextDEHelper = null;
		// IPSDEDBConfig iPSDEDBConfig =
		// iPSDataEntity.getPSDEDBConfig(this.getDBType());

		IPSDEField joinDEFHelper = null;
		boolean bInheritMode = false;
		boolean bSameTable = false;
		boolean bRightJoin = false;
		String strRealDERId = strCurDERId;
		if (strCurDERId.indexOf("N1R:") == 0) {
			strRealDERId = strCurDERId.substring(4);
			bRightJoin = true;
		}

		IPSDERCustom derCustom = null;
		IPSDERBase iPSDERBase = null;
		List<IPSDERBase> psDERBases = iDataEntityRuntime.getPSDataEntity().getMinorPSDERs();
		if (!ObjectUtils.isEmpty(psDERBases)) {
			for (IPSDERBase item : psDERBases) {
				if (item.getId().equals(strRealDERId)) {
					iPSDERBase = item;
					break;
				}
			}
		}

		// iPSDataEntity.getPSDER(false, strRealDERId, true);
		if (iPSDERBase != null && iPSDERBase instanceof IPSDERCustom) {
			derCustom = (IPSDERCustom) iPSDERBase;
		}

		if (iPSDERBase instanceof IPSDER1NBase) {
			IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) iPSDERBase;
			if (iPSDER1NBase.getPickupPSDEField() != null) {
				if (!iPSDER1NBase.getPickupPSDEField().isPhisicalDEField()) {
					return;
				}
			}
		}

		if (false && derCustom != null) {
			throw new Exception(String.format("没有实现"));

		} else {

			if (derCustom != null) {
				joinDEFHelper = derCustom.getPickupPSDEField();
			} else {
				java.util.List<IPSDEField> psDEFields = iDataEntityRuntime.getPSDEFields();
				if (!ObjectUtils.isEmpty(psDEFields)) {
					for (IPSDEField iPSDEField : psDEFields) {

						if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
							continue;

						if (!iPSDEField.isLinkDEField())
							continue;

						if (!(iPSDEField instanceof IPSLinkDEField))
							continue;

						IPSLinkDEField linkDEFHelper = (IPSLinkDEField) iPSDEField;

						if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strCurDERId, true) != 0) {
							if (bRightJoin) {
								if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strCurDERId.substring(4), true) != 0)
									continue;
							} else {
								continue;
							}
						}

						if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUP.value, true) == 0) {
							joinDEFHelper = iPSDEField;
							break;
						}

						if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.INHERIT.value, true) == 0) {
							bInheritMode = true;
							iNextDEHelper = this.getDataEntityRuntime(linkDEFHelper.getRelatedPSDEFieldMust().getParentPSModelObject(IPSDataEntity.class).getId());
							break;
						}
					}
				}

				/**
				 * 20200718 增强同表继承处理
				 */

				if (joinDEFHelper == null && iNextDEHelper == null && ((iDataEntityRuntime.getPSDERInherit() != null && isSameTable(iDataEntityRuntime.getPSDERInherit()) || iDataEntityRuntime.getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value))) {
					bSameTable = true;
					// 没有找到，实体为继承从实体且与主实体同表
					psDEFields = iDataEntityRuntime.getPSDEFields();
					if (!ObjectUtils.isEmpty(psDEFields)) {
						for (IPSDEField iPSDEField : psDEFields) {

							if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
								continue;

							if (!iPSDEField.isLinkDEField())
								continue;

							if (!(iPSDEField instanceof IPSLinkDEField))
								continue;

							if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.INHERIT.value, true) != 0) {
								continue;
							}

							IPSLinkDEField linkDEFHelper = (IPSLinkDEField) iPSDEField;
							if (linkDEFHelper.getRelatedPSDEField() instanceof IPSLinkDEField) {
								linkDEFHelper = (IPSLinkDEField) linkDEFHelper.getRelatedPSDEField();
							} else {
								linkDEFHelper = null;
							}
							if (linkDEFHelper == null) {
								continue;
							}
							iPSDEField = linkDEFHelper;

							if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strCurDERId, true) != 0) {
								if (bRightJoin) {
									if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strCurDERId.substring(4), true) != 0)
										continue;
								} else {
									continue;
								}
							}

							if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUP.value, true) == 0) {
								joinDEFHelper = iPSDEField;
								break;
							}

							if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.INHERIT.value, true) == 0) {
								bInheritMode = true;
								iNextDEHelper = this.getDataEntityRuntime(linkDEFHelper.getRelatedPSDEField().getParentPSModelObject(IPSDataEntity.class).getId());
								break;
							}
						}
					}
				}
			}
			if (bInheritMode) {
				if (!joinMap.containsKey(strCurTotalDER)) {
					String strPreFix = "t";
					// 进行连接操作
					// 获取各别名
					String strMTAlias = "";
					String strUTAlias = "";
					if (ObjectUtils.isEmpty(strParentDERs)) {
						strMTAlias = strPreFix + "1";
						strUTAlias = strPreFix + "2";
					} else {
						if (!derAliasMap.containsKey(strParentDERs)) {
							throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDERs));
						}

						Integer nAlias = derAliasMap.get(strParentDERs);
						strMTAlias = String.format("%1$s%2$s", strPreFix, nAlias + 1);
						strUTAlias = String.format("%1$s%2$s", strPreFix, nAlias + 2);
					}

					String strCurMTAlias = "";
					String strCurUTAlias = "";
					if (!derAliasMap.containsKey(strCurTotalDER)) {
						throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDERs));
					}

					Integer nAlias = derAliasMap.get(strCurTotalDER);
					strCurMTAlias = String.format("%1$s%2$s", strPreFix, nAlias + 1);
					strCurUTAlias = String.format("%1$s%2$s", strPreFix, nAlias + 2);

					boolean bJoinAsMain = true;

					IPSDEField iKeyDEFHelper = iDataEntityRuntime.getKeyPSDEField();
					// if
					// (DataTypeUtils.compare(iKeyDEFHelper.getPSDTColumn(this.getDBType()).getTableScope(),
					// iPSDataEntity.getTableName(), true) == 0) {
					// bJoinAsMain = true;
					// } else {
					// bJoinAsMain = false;
					// }

					String strMainTable = iDataEntityRuntime.getTableName();// iNextDEHelper.getPSDEDBConfig(this.getDBType()).getTableName();
					// String strUserTable =
					// iNextDEHelper.getPSDEDBConfig(this.getDBType()).getUserTable();

					String strMainTable2 = strMainTable;
					// String strUserTable2 = strUserTable;

					String strMainTable3 = strMainTable;
					// String strUserTable3 = strUserTable;
					if (iNextDEHelper.getPSDataEntity().isEnableTempDataBackend() && bEnableTemp) {
						strMainTable3 = strMainTable + "_TMP";
						// if (!ObjectUtils.isEmpty(strUserTable)) {
						// strUserTable3 = strUserTable + "_TMP";
						// }
					}

					String strSaaSDCIdColName = "";
					// if (iNextDEHelper.getSaaSMode() ==
					// IPSDataEntity.SAASMODE_STANDARD ||
					// iNextDEHelper.getSaaSMode() ==
					// IPSDataEntity.SAASMODE_STANDARD3) {
					// strSaaSDCIdColName =
					// iNextDEHelper.getPSDEDBConfig(this.getDBType()).getSaaSDCIdColumnName();
					// }
					//
					// if (DataTypeUtils.compare(iNextDEHelper.getDBSchema(),
					// this.majorPSDataEntity.getDBSchema(), true) != 0) {
					// strMainTable2 = String.format("%1$s.%2$s",
					// iNextDEHelper.getDBSchema(), strMainTable);
					// strUserTable2 = String.format("%1$s.%2$s",
					// iNextDEHelper.getDBSchema(), strUserTable);
					// strMainTable3 = String.format("%1$s.%2$s",
					// iNextDEHelper.getDBSchema(), strMainTable3);
					// strUserTable3 = String.format("%1$s.%2$s",
					// iNextDEHelper.getDBSchema(), strUserTable3);
					//
					// }

					script.append(String.format("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable2), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(iKeyDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(iNextDEHelper.getKeyPSDEField().getName())));
					// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
					// script.append(" AND %1$s.%2$s = '__SRFSAASDCID__'",
					// strCurMTAlias, strSaaSDCIdColName);
					// }
					script.append("\n");

					// if (!ObjectUtils.isEmpty(strUserTable)) {
					// IPSDEField pkeyPSDEField =
					// iNextDEHelper.getKeyPSDEField();
					// script.append("LEFT JOIN %1$s %2$s ON %3$s.%4$s =
					// %2$s.%4$s",
					// this.iDBDialect.getDBObjStandardName(strUserTable2),
					// strCurUTAlias, strCurMTAlias,
					// this.iDBDialect.getDBObjStandardName(pkeyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
					// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
					// script.append(" AND %1$s.%2$s = '__SRFSAASDCID__'",
					// strCurUTAlias, strSaaSDCIdColName);
					// }
					// script.append("\n");
					// }

					if (scriptTemp != null) {
						scriptTemp.append(String.format("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable3), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(iKeyDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(iNextDEHelper.getKeyPSDEField().getName())));
						// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
						// script.append(" AND %1$s.%2$s = '__SRFSAASDCID__'",
						// strCurMTAlias, strSaaSDCIdColName);
						// }
						script.append("\n");

						// if (!ObjectUtils.isEmpty(strUserTable)) {
						// IPSDEField pkeyPSDEField =
						// iNextDEHelper.getKeyPSDEField();
						// scriptTemp.append("LEFT JOIN %1$s %2$s ON %3$s.%4$s =
						// %2$s.%4$s",
						// this.iDBDialect.getDBObjStandardName(strUserTable3),
						// strCurUTAlias, strCurMTAlias,
						// this.iDBDialect.getDBObjStandardName(pkeyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
						// if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
						// script.append(" AND %1$s.%2$s = '__SRFSAASDCID__'",
						// strCurUTAlias, strSaaSDCIdColName);
						// }
						// script.append("\n");
						// }
					}
					joinMap.put(strCurTotalDER, 1);
				}

				String strNextDERId = "";
				for (int i = 1; i < strDERs.length; i++) {
					if (!ObjectUtils.isEmpty(strNextDERId))
						strNextDERId += "|";
					strNextDERId += strDERs[i];
				}

				if (ObjectUtils.isEmpty(strNextDERId)) {
					return;
				}
				getJoin(script, scriptTemp, iNextDEHelper, bEnableTemp, strCurTotalDER, strNextDERId, derAliasMap, joinMap);
			} else {
				boolean bLeftOuterJoin = false;
				boolean bNextEnableTemp = false;
				IPSDEField joinRelatedDEFHelper = null;
				if (joinDEFHelper == null) {
					String strTempCurDERId = "";
					if ((strCurDERId.indexOf("1NLO:") == 0)) {
						strTempCurDERId = strCurDERId.substring(5);

						IPSDERBase derBase = this.getSystemRuntime().getPSDER(strTempCurDERId, false);
						if (derBase instanceof IPSDER1N) {
							IPSDER1N der1N = (IPSDER1N) derBase;
							if (bEnableTemp) {
								bNextEnableTemp = (der1N.getTempDataOrder() >= 0);
							}
						} else if (derBase instanceof IPSDERCustom) {
							derCustom = (IPSDERCustom) derBase;
						}

						if (DataTypeUtils.compare(iDataEntityRuntime.getId(), derBase.getMajorPSDataEntityMust().getId(), true) != 0) {
							throw new Exception(String.format("无法找到实体[%1$s]关系[%2$s]的连接属性", iDataEntityRuntime.getName(), strTempCurDERId));
						}

						// 当前为1N关系主实体
						iNextDEHelper = getDataEntityRuntime(derBase.getMinorPSDataEntityMust().getId());
						if (iNextDEHelper == null) {
							throw new Exception(String.format("无法找到实体[%1$s]辅助操作对象", derBase.getMinorPSDataEntityMust().getId()));
						}

						java.util.List<IPSDEField> psDEFields = iNextDEHelper.getPSDEFields();
						if(!ObjectUtils.isEmpty(psDEFields)) {
							for(IPSDEField iPSDEField : psDEFields) {
								if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
									continue;

								if (!iPSDEField.isLinkDEField())
									continue;

								if (!(iPSDEField instanceof IPSLinkDEField))
									continue;

								IPSLinkDEField linkDEFHelper = (IPSLinkDEField) iPSDEField;

								if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strTempCurDERId, true) != 0)
									continue;

								if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUP.value, true) == 0) {
									joinRelatedDEFHelper = iPSDEField;
									joinDEFHelper = linkDEFHelper.getRelatedPSDEField();
									break;
								}
							}
						}
						if (joinRelatedDEFHelper == null) {
							if (derCustom != null) {
								joinRelatedDEFHelper = derCustom.getPickupPSDEField();
								joinDEFHelper = derBase.getMajorPSDataEntity().getKeyPSDEField();
							}
							if (joinRelatedDEFHelper == null) {
								throw new Exception(String.format("无法找到实体[%1$s]关系[%2$s]的连接属性", iNextDEHelper.getName(), strCurDERId));
							}
						}
						bLeftOuterJoin = true;

					} else if (strCurDERId.indexOf("11M:") == 0) {
						strTempCurDERId = strCurDERId.substring(4);

						IPSDER11 der11 = (IPSDER11) this.getSystemRuntime().getPSDER(strTempCurDERId, false);

						if (DataTypeUtils.compare(iDataEntityRuntime.getId(), der11.getMajorPSDataEntityMust().getId(), true) != 0) {
							throw new Exception(String.format("无法找到实体[%1$s]关系[%2$s]的连接属性", iDataEntityRuntime.getName(), strTempCurDERId));
						}

						// 当前为11关系主实体
						iNextDEHelper = getDataEntityRuntime(der11.getMinorPSDataEntityMust().getId());
						if (iNextDEHelper == null) {
							throw new Exception(String.format("无法找到实体[%1$s]辅助操作对象", der11.getMinorPSDataEntityMust().getId()));
						}

						java.util.List<IPSDEField> psDEFields = iNextDEHelper.getPSDEFields();
						if(!ObjectUtils.isEmpty(psDEFields)) {
							for(IPSDEField iPSDEField : psDEFields) {
								if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
									continue;

								if (!iPSDEField.isLinkDEField())
									continue;

								if (!(iPSDEField instanceof IPSLinkDEField))
									continue;

								IPSLinkDEField linkDEFHelper = (IPSLinkDEField) iPSDEField;

								if (DataTypeUtils.compare(linkDEFHelper.getPSDERMust().getId(), strTempCurDERId, true) != 0)
									continue;

								if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUP.value, true) == 0) {
									joinRelatedDEFHelper = iPSDEField;
									joinDEFHelper = linkDEFHelper.getRelatedPSDEField();
									break;
								}
							}
						}

						if (joinRelatedDEFHelper == null) {
							throw new Exception(String.format("无法找到实体[%1$s]关系[%2$s]的连接属性", iNextDEHelper.getName(), strCurDERId));
						}
					} else if ((strCurDERId.indexOf("INDEX:") == 0) || (strCurDERId.indexOf("INDEXM:") == 0)) {
						boolean bIndexM = false;
						if ((strCurDERId.indexOf("INDEXM:") == 0))
							bIndexM = true;

						strTempCurDERId = "";
						if (bIndexM)
							strTempCurDERId = strCurDERId.substring(7);
						else
							strTempCurDERId = strCurDERId.substring(6);

						IPSDERIndex derIndex = (IPSDERIndex) this.getSystemRuntime().getPSDER(strTempCurDERId, false);

						// 当前为11关系主实体
						if (bIndexM)
							iNextDEHelper = getDataEntityRuntime(derIndex.getMinorPSDataEntityMust().getId());
						else
							iNextDEHelper = getDataEntityRuntime(derIndex.getMajorPSDataEntityMust().getId());

						if (iNextDEHelper == null) {
							throw new Exception(String.format("无法找到实体[%1$s]辅助操作对象", bIndexM ? derIndex.getMinorPSDataEntityMust().getId() : derIndex.getMajorPSDataEntityMust().getId()));
						}

						joinRelatedDEFHelper = iNextDEHelper.getKeyPSDEField();
						joinDEFHelper = iDataEntityRuntime.getKeyPSDEField();
					} else {
						throw new Exception(String.format("无法找到实体[%1$s]关系[%2$s]的连接属性", iDataEntityRuntime.getName(), strCurDERId));
					}

				} else {
					if (joinDEFHelper instanceof IPSLinkDEField) {
						joinRelatedDEFHelper = ((IPSLinkDEField) joinDEFHelper).getRelatedPSDEField();
						IPSDER1N iPSDER1N = (IPSDER1N) ((IPSLinkDEField) joinDEFHelper).getPSDER();
						if (bEnableTemp) {
							bEnableTemp = (iPSDER1N.getTempDataOrder() >= 0);
						}
					}

					if (joinRelatedDEFHelper == null) {
						if (derCustom != null) {
							joinRelatedDEFHelper = derCustom.getMajorPSDataEntity().getKeyPSDEField();
						}
						if (joinRelatedDEFHelper == null) {
							throw new Exception(String.format("无法找到属性[%1$s]关联属性", joinDEFHelper.getName()));
						}
					}
					iNextDEHelper = this.getDataEntityRuntime(joinRelatedDEFHelper.getParentPSModelObject(IPSDataEntity.class).getId());

				}

				if (!joinMap.containsKey(strCurTotalDER)) {
					// 进行连接操作
					// 获取各别名
					String strMTAlias = "";
					String strUTAlias = "";
					if (ObjectUtils.isEmpty(strParentDERs)) {
						Integer nAlias = derAliasMap.get("");
						strMTAlias = String.format("t%1$s", nAlias + 1);
						strUTAlias = String.format("t%1$s", nAlias + 2);
					} else {
						if (!derAliasMap.containsKey(strParentDERs)) {
							throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDERs));
						}

						Integer nAlias = derAliasMap.get(strParentDERs);
						strMTAlias = String.format("t%1$s", nAlias + 1);
						strUTAlias = String.format("t%1$s", nAlias + 2);
					}

					String strCurMTAlias = "";
					String strCurUTAlias = "";
					if (!derAliasMap.containsKey(strCurTotalDER)) {
						throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDERs));
					}

					Integer nAlias = derAliasMap.get(strCurTotalDER);
					strCurMTAlias = String.format("t%1$s", nAlias + 1);
					strCurUTAlias = String.format("t%1$s", nAlias + 2);

					boolean bJoinAsMain = true;

//					if (bSameTable || DataTypeUtils.compare(joinDEFHelper.getPSDTColumn(this.getDBType()).getTableScope(), iPSDataEntity.getTableName(), true) == 0) {
//						bJoinAsMain = true;
//					} else {
//						bJoinAsMain = false;
//					}

					String strMainTable = iNextDEHelper.getTableName();
					//String strMainTable = iNextDEHelper.getPSDEDBConfig(this.getDBType()).getTableName();
					//String strUserTable = iNextDEHelper.getPSDEDBConfig(this.getDBType()).getUserTable();

					String strMainTable2 = strMainTable;
					//String strUserTable2 = strUserTable;

					String strMainTable3 = strMainTable;
					//String strUserTable3 = strUserTable;
					if (iNextDEHelper.getPSDataEntity().isEnableTempDataBackend() && bEnableTemp) {
						strMainTable3 = strMainTable + "_TMP";
						//strUserTable3 = strUserTable + "_TMP";
					}

					String strSaaSDCIdColName = "";
//					if (iNextDEHelper.getSaaSMode() == IPSDataEntity.SAASMODE_STANDARD || iNextDEHelper.getSaaSMode() == IPSDataEntity.SAASMODE_STANDARD3) {
//						strSaaSDCIdColName = iNextDEHelper.getPSDEDBConfig(this.getDBType()).getSaaSDCIdColumnName();
//					}
//
//					if (DataTypeUtils.compare(iNextDEHelper.getDBSchema(), this.majorPSDataEntity.getDBSchema(), true) != 0) {
//						strMainTable2 = String.format("%1$s.%2$s", iNextDEHelper.getDBSchema(), strMainTable);
//						strUserTable2 = String.format("%1$s.%2$s", iNextDEHelper.getDBSchema(), strUserTable);
//
//						strMainTable3 = String.format("%1$s.%2$s", iNextDEHelper.getDBSchema(), strMainTable3);
//						strUserTable3 = String.format("%1$s.%2$s", iNextDEHelper.getDBSchema(), strUserTable3);
//
//					}

					if (bLeftOuterJoin) {
						script.append(String.format("LEFT OUTER JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable2), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
						if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
							script.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
						}
						if (derCustom != null) {
							script.append("\n");
							IPSDEField parentType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, true);
							IPSDEField parentSubType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);

							if (parentType != null) {
								String strFieldName = String.format("%1$s.%2$s", strCurMTAlias, this.iDBDialect.getDBObjStandardName(parentType.getName()));
								script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentType.getStdDataType(), Conditions.EQ, iDataEntityRuntime.getName(), false, null));
							}
							if (parentSubType != null) {
								String strFieldName = String.format("%1$s.%2$s", strCurMTAlias, this.iDBDialect.getDBObjStandardName(parentSubType.getName()));
								String strTypeValue = derCustom.getTypeValue();
								if (ObjectUtils.isEmpty(strTypeValue)) {
									strTypeValue = derCustom.getMinorCodeName();
								}

								if (!ObjectUtils.isEmpty(strTypeValue)) {
									script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.EQ, strTypeValue, false, null));
								} else {
									script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.ISNULL, null, false, null));
								}
							}
						}
						script.append("\n");
						if (scriptTemp != null) {
							scriptTemp.append(String.format("LEFT OUTER JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable3), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
							if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
								scriptTemp.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
							}
							scriptTemp.append("\n");
						}
					} else {
						if (bRightJoin) {
							script.append(String.format("RIGHT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable2), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
							if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
								script.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
							}
							if (derCustom != null) {
								script.append("\n");
								IPSDEField parentType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, true);
								IPSDEField parentSubType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
								if (parentType != null) {
									String strFieldName = String.format("%1$s.%2$s", bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(parentType.getName()));
									//script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext)parentType.getPSDTColumn(this.getDBType()).getConditionSQL(this, strFieldName, null, ICondition.CONDOP_EQ, iPSDataEntity.getName(), null, null));
									script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentType.getStdDataType(), Conditions.EQ, iDataEntityRuntime.getName(), false, null));
								}
								if (parentSubType != null) {
									String strFieldName = String.format("%1$s.%2$s", bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(parentSubType.getName()));
									String strTypeValue = derCustom.getTypeValue();
									if (ObjectUtils.isEmpty(strTypeValue)) {
										strTypeValue = derCustom.getMinorCodeName();
									}

									if (!ObjectUtils.isEmpty(strTypeValue)) {
										script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.EQ, strTypeValue, false, null));
									} else {
										script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.ISNULL, null, false, null));
									}
								}
							}
							script.append("\n");
							if (scriptTemp != null) {
								scriptTemp.append(String.format("RIGHT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable3), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
								if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
									scriptTemp.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
								}
								scriptTemp.append("\n");
							}
						} else {
							script.append(String.format("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable2), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
							if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
								script.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
							}
							if (derCustom != null) {
								script.append("\n");
								IPSDEField parentType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, true);
								IPSDEField parentSubType = this.getDataEntityRuntime(derCustom.getMinorPSDataEntity().getId()).getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
								if (parentType != null) {
									String strFieldName = String.format("%1$s.%2$s", bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(parentType.getName()));
									//script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext)parentType.getPSDTColumn(this.getDBType()).getConditionSQL(this, strFieldName, null, ICondition.CONDOP_EQ, iPSDataEntity.getName(), null, null));
									script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentType.getStdDataType(), Conditions.EQ, iDataEntityRuntime.getName(), false, null));
								}
								if (parentSubType != null) {
									String strFieldName = String.format("%1$s.%2$s", bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(parentSubType.getName()));
									String strTypeValue = derCustom.getTypeValue();
									if (ObjectUtils.isEmpty(strTypeValue)) {
										strTypeValue = derCustom.getMinorCodeName();
									}

									if (!ObjectUtils.isEmpty(strTypeValue)) {
										script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.EQ, strTypeValue, false, null));
									} else {
										script.append(" AND " + this.iDBDialect.getConditionSQL(strFieldName, parentSubType.getStdDataType(), Conditions.ISNULL, null, false, null));
									}
								}
							}
							script.append("\n");
							if (scriptTemp != null) {
								scriptTemp.append(String.format("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%5$s ", this.iDBDialect.getDBObjStandardName(strMainTable3), strCurMTAlias, bJoinAsMain ? strMTAlias : strUTAlias, this.iDBDialect.getDBObjStandardName(joinDEFHelper.getName()), this.iDBDialect.getDBObjStandardName(joinRelatedDEFHelper.getName())));
								if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
									scriptTemp.append(String.format(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurMTAlias, strSaaSDCIdColName));
								}
								scriptTemp.append("\n");
							}
						}
					}

//					if (!ObjectUtils.isEmpty(strUserTable)) {
//						IPSDEField pkeyPSDEField = null;
//						if (joinRelatedDEFHelper.getPSDTColumn(this.getDBType()).isPKey())
//							pkeyPSDEField = joinRelatedDEFHelper;
//						else {
//							pkeyPSDEField = iNextDEHelper.getKeyPSDEField();
//						}
//						script.append("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%4$s", this.iDBDialect.getDBObjStandardName(strUserTable2), strCurUTAlias, strCurMTAlias, this.iDBDialect.getDBObjStandardName(pkeyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
//						if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
//							script.append(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurUTAlias, strSaaSDCIdColName);
//						}
//						script.append("\n");
//						if (scriptTemp != null) {
//							scriptTemp.append("LEFT JOIN %1$s %2$s ON %3$s.%4$s = %2$s.%4$s", this.iDBDialect.getDBObjStandardName(strUserTable3), strCurUTAlias, strCurMTAlias, this.iDBDialect.getDBObjStandardName(pkeyPSDEField.getPSDTColumn(this.getDBType()).getColumnName()));
//							if (!ObjectUtils.isEmpty(strSaaSDCIdColName)) {
//								scriptTemp.append(" AND %1$s.%2$s = '__SRFSAASDCID__'", strCurUTAlias, strSaaSDCIdColName);
//							}
//							scriptTemp.append("\n");
//						}
//					}
					joinMap.put(strCurTotalDER, 1);
				}

				String strNextDERId = "";
				for (int i = 1; i < strDERs.length; i++) {
					if (!ObjectUtils.isEmpty(strNextDERId))
						strNextDERId += "|";
					strNextDERId += strDERs[i];
				}

				if (ObjectUtils.isEmpty(strNextDERId)) {
					return;
				}

				getJoin(script, scriptTemp, iNextDEHelper, bNextEnableTemp, strCurTotalDER, strNextDERId, derAliasMap, joinMap);
			}
		}

	}

	protected String getPSDEFieldExp(IPSDEField iPSDEField, String strParentDER, Map<String, Integer> derAliasMap, List<String> derList) throws Throwable {
		// 判断是否递归
		boolean bClose = false;
		ActionSession actionSession = null;
		try {
			String strPSDEFieldId = KeyValueUtils.genUniqueId(this.toString()) + "|" + PSModelUtils.calcFullUniqueTag2(iPSDEField, true);
			actionSession = ActionSessionManager.getCurrentSession();
			if (actionSession == null) {
				bClose = true;
				actionSession = ActionSessionManager.openSession("PSDEDQEngineImpl");
				actionSession.registerRecursion("PSDEFIELDEXP", strPSDEFieldId);
			} else {
				if (!actionSession.registerRecursion("PSDEFIELDEXP", strPSDEFieldId)) {
					throw new Exception(String.format("属性[%1$s]SQL表达式存在递归关系", iPSDEField.getName()));
				}
			}

			String strPSDEFieldExp = onGetPSDEFieldExp(iPSDEField, strParentDER, derAliasMap, derList);
			actionSession.unregisterRecursion("PSDEFIELDEXP", strPSDEFieldId);
			if (bClose) {
				ActionSessionManager.closeSession(true);
			}
			return strPSDEFieldExp;
		} catch (Exception ex) {
			if (bClose) {
				ActionSessionManager.closeSession(false);
			}
			throw ex;
		}
	}

	protected String onGetPSDEFieldExp(IPSDEField iPSDEField, String strParentDER, Map<String, Integer> derAliasMap, List<String> derList) throws Throwable {
		try {

			IPSDataEntity iPSDataEntity = iPSDEField.getParentPSModelObject(IPSDataEntity.class);
			IDataEntityRuntime iDataEntityRuntime = this.getDataEntityRuntime(iPSDataEntity.getId());
			//	IPSDEFDTColumn iPSDEFDTColumn = iPSDEField.getPSDTColumn(this.getDBType());
			IPSFormulaDEField iPSFormulaDEField = null;
			IPSDEField iPSDEField2 = iPSDEField;
			if (iPSDEField.isInheritDEField()) {
				IPSDEField relatedPSPSDEField = ((IPSInheritDEField) iPSDEField).getRelatedPSDEField();
				iPSDEField2 = relatedPSPSDEField;
//				IPSDEFDTColumn iPSDEFDTColumn2 = relatedPSPSDEField.getPSDTColumn(this.getDBType());
//				if (iPSDEFDTColumn2.isFormula()) {
//					iPSDEFDTColumn = iPSDEFDTColumn2;
//				}
				if(relatedPSPSDEField instanceof IPSFormulaDEField) {
					iPSFormulaDEField = (IPSFormulaDEField)relatedPSPSDEField;
				}
			}
			else
			if(iPSDEField instanceof IPSFormulaDEField) {
				iPSFormulaDEField = (IPSFormulaDEField)iPSDEField;
			}

			//iPSDEFDTColumn.isFormula() && !iPSDEFDTColumn.isFormulaPhisical()
			if (iPSFormulaDEField != null && !iPSFormulaDEField.isPhisicalDEField()) {
				// 公式字段
				String strFormulaFields = iPSFormulaDEField.getFormulaColumns();
				if (!ObjectUtils.isEmpty(strFormulaFields)) {
					Object[] params = null;
					String[] strFields = strFormulaFields.split("[;]");
					params = new Object[strFields.length];
					for (int i = 0; i < strFields.length; i++) {
						String strDEFName = strFields[i].toUpperCase();

						IPSDEField argvField = iDataEntityRuntime.getPSDEField(strDEFName, true);
						if (argvField != null) {
							params[i] = getPSDEFieldExp(argvField, strParentDER, derAliasMap, derList);
						} else {
							params[i] = strDEFName;
						}
					}

					String strExp = String.format(iPSFormulaDEField.getFormulaFormat(), params);
					return strExp;
				} else {
					if (iDataEntityRuntime.isVirtual() && iDataEntityRuntime.getVirtualMode() == DEVirtualMode.INDEXMAJOR.value) {
						String strExp = String.format("%1$s.%2$s", "t1", this.iDBDialect.getDBObjStandardName(iPSDEField.getName()));
						//this.setFieldQueryCaseSensitive(strExp, iPSDEFDTColumn.getQueryCaseSenstive());
						return strExp;
					}
					String strExp = String.format(iPSFormulaDEField.getFormulaFormat());
					//this.setFieldQueryCaseSensitive(strExp, iPSDEFDTColumn.getQueryCaseSenstive());
					return strExp;
				}
			} else {
				// 获取对应实体编号
				IPSDataEntity realPSDataEntity = null;
				IDataEntityRuntime realDataEntityRuntime = null;
				if (ObjectUtils.isEmpty(strParentDER)) {
					// 顶级属性
					if (this.getMajorPSDataEntity().isVirtual()) {
//						if (getMajorPSDataEntity().getKeyPSDEFieldMust() == null) {
//							throw PSDataEntityException.create(getMajorPSDataEntity(), PSDataEntityException.ERROR_KEYFIELDNOTFOUND);
//						}
						if (getMajorPSDataEntity().getKeyPSDEFieldMust() instanceof IPSLinkDEField) {
							realPSDataEntity = this.getRealPSDEField(((IPSLinkDEField) getMajorPSDataEntity().getKeyPSDEField()), true).getParentPSModelObject(IPSDataEntity.class);
							if (DataTypeUtils.compare(this.getRealPSDEField(((IPSLinkDEField) getMajorPSDataEntity().getKeyPSDEField()), true).getParentPSModelObject(IPSDataEntity.class).getId(), realPSDataEntity.getId(), false) != 0) {
								realPSDataEntity = null;
							}
						}
					}
				}
				String strDERID = "";
				boolean bAddJoin = false;
				if (realPSDataEntity == null) {
					IPSLinkDEField linkDEFHelper = null;
					if (iPSDEField instanceof IPSLinkDEField) {
						linkDEFHelper = (IPSLinkDEField) iPSDEField;
						strDERID = linkDEFHelper.getPSDERMust().getId();
						bAddJoin = true;
					}

					if (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUP.value, true) == 0) {
						strDERID = "";
						bAddJoin = false;
					} else {
						// 继续判断，是否为物理化逻辑字段
						if ((DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUPTEXT.value, true) == 0) && iPSDEField.getDEFType() == DEFType.PHISICAL.value) {
							strDERID = "";
							bAddJoin = false;
						}

						if ((DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.PICKUPDATA.value, true) == 0) && iPSDEField.getDEFType() == DEFType.PHISICAL.value) {
							strDERID = "";
							bAddJoin = false;
						}

						if (linkDEFHelper != null && (DataTypeUtils.compare(iPSDEField.getDataType(), DEFDataType.INHERIT.value, true) == 0)) {
							// 判断集成主实体跟当前实体是否同表，如果同表则忽略关系
							if (iDataEntityRuntime.getPSDERInherit() != null && isSameTable(iDataEntityRuntime.getPSDERInherit())) {
								bAddJoin = false;
								if (linkDEFHelper.getRelatedPSDEField() != null && linkDEFHelper.getRelatedPSDEField().isPhisicalDEField()) {
									strDERID = "";
								}
							} else {
								// 判断是否为虚拟多继承合并模式
								if (iDataEntityRuntime.getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value) {
									bAddJoin = false;
									// 判断实体是否为物理化属性
									if (linkDEFHelper.getRelatedPSDEField() != null) {
										if (linkDEFHelper.getRelatedPSDEField().isPhisicalDEField()) {
											strDERID = "";
										}
									}
								}
							}
						}
					}
				}

				if(realPSDataEntity != null) {
					realDataEntityRuntime = this.getDataEntityRuntime(realPSDataEntity.getId());
				}

				if (ObjectUtils.isEmpty(strDERID)) {
					boolean bDynamicTable = false;
					String strMainTable = "";
					//String strUserTable = "";
					if (realDataEntityRuntime != null) {
						strMainTable = realDataEntityRuntime.getTableName();
						//strUserTable = realPSDataEntity.getPSDEDBConfig(this.getDBType()).getUserTable();
					} else {
						strMainTable = iDataEntityRuntime.getTableName();// iPSDataEntity.getPSDEDBConfig(this.getDBType()).getTableName();
						//strUserTable = iPSDataEntity.getPSDEDBConfig(this.getDBType()).getUserTable();
					}

					String strMTAlias = "";
					String strUTAlias = "";
					if (ObjectUtils.isEmpty(strParentDER)) {
						int nAlias = derAliasMap.get("");
						strMTAlias = String.format("t%1$s", nAlias + 1);
						strUTAlias = String.format("t%1$s", nAlias + 2);
						// bDynamicTable =
						// DataTypeUtils.compare(iPSDataEntity.getDataEntity().getSTORAGETYPE(),
						// DataEntity.STORAGETYPE_DYNAMIC, true) == 0;
						bDynamicTable = false;
					} else {
						if (!derAliasMap.containsKey(strParentDER)) {
							throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDER));
						}

						Integer nAlias = derAliasMap.get(strParentDER);
						strMTAlias = String.format("t%1$s", nAlias + 1);
						strUTAlias = String.format("t%1$s", nAlias + 2);
					}
					String strDEFTableName = this.getDataEntityRuntime(iPSDEField2.getParentPSModelObject(IPSDataEntity.class).getId()).getTableName();
					if (ObjectUtils.isEmpty(strDEFTableName)) {
						if (this.getMajorPSDataEntity().isVirtual()) {
							if (iPSDEField instanceof IPSLinkDEField) {
								strDEFTableName = this.getDataEntityRuntime(getRealPSDEField(((IPSLinkDEField) iPSDEField), true).getParentPSModelObject(IPSDataEntity.class).getId()).getTableName();
								iPSDEField2 = getRealPSDEField(((IPSLinkDEField) iPSDEField), true);
							}
						}
					}

					if (bDynamicTable || DataTypeUtils.compare(strMainTable, strDEFTableName, true) == 0) {
						String strExp = String.format("%1$s.%2$s", strMTAlias, this.iDBDialect.getDBObjStandardName(iPSDEField2.getName()));
						//this.setFieldQueryCaseSensitive(strExp, iPSDEFDTColumn.getQueryCaseSenstive());
						return strExp;
					}

//					if (DataTypeUtils.compare(strUserTable, strDEFTableName, true) == 0) {
//						String strExp = String.format("%1$s.%2$s", strUTAlias, this.iDBDialect.getDBObjStandardName(iPSDEFDTColumn.getColumnName()));
//						this.setFieldQueryCaseSensitive(strExp, iPSDEFDTColumn.getQueryCaseSenstive());
//						return strExp;
//					}

					throw new Exception(String.format("无法识别的属性[%1$s]表名[%2$s]", iPSDEField.getName(), strDEFTableName));
				} else {
					// 其它表字段
					String strNewDER = strParentDER;
					if (bAddJoin) {
						if (!ObjectUtils.isEmpty(strNewDER))
							strNewDER += "|";
						strNewDER += strDERID;
					}

					IPSDEField relatedDEFHelper = null;
					if (iPSDEField instanceof IPSLinkDEField) {
						relatedDEFHelper = ((IPSLinkDEField) iPSDEField).getRelatedPSDEField();
					}
					if (relatedDEFHelper == null) {
						throw new Exception(String.format("无法获取属性[%1$s]的关系属性", iPSDEField.getName()));
					}

					if (bAddJoin && !derAliasMap.containsKey(strNewDER)) {
						derAliasMap.put(strNewDER, getAliasIndex());
						String strLastDERID = "";
						if (derList.size() > 0)
							strLastDERID = derList.get(derList.size() - 1);
						if ((strNewDER.indexOf(strLastDERID) == 0) && (strNewDER.length() == strLastDERID.length() || strNewDER.charAt(strLastDERID.length()) == '|') && !ObjectUtils.isEmpty(strLastDERID))
						// if ((strNewDER.indexOf(strLastDERID) == 0) &&
						// !ObjectUtils.isEmpty(strLastDERID))
						{
							derList.set(derList.size() - 1, strNewDER);
						} else
							derList.add(strNewDER);
					}

					return getPSDEFieldExp(relatedDEFHelper, strNewDER, derAliasMap, derList);
				}
			}

		} catch (Exception ex) {
			throw new Exception(String.format("获取实体属性[%1$s]表达式发生异常，%2$s", iPSDEField.getName(), ex.getMessage()), ex);
		}
	}

	protected String getTableAlias(IPSDataEntity iPSDataEntity, boolean bMain, String strParentDER, Map<String, Integer> derAliasMap, List<String> derList) throws Exception {
		int nAlias = derAliasMap.get("");
		String strMTAlias = "";
		String strUTAlias = "";

		strMTAlias = String.format("t%1$s", nAlias + 1);
		strUTAlias = String.format("t%1$s", nAlias + 2);

		if (ObjectUtils.isEmpty(strParentDER)) {
			strMTAlias = String.format("t%1$s", nAlias + 1);
			strUTAlias = String.format("t%1$s", nAlias + 2);
		} else {
			if (!derAliasMap.containsKey(strParentDER)) {
				throw new Exception(String.format("无法找到关系[%1$s]别名", strParentDER));
			}

			strMTAlias = String.format("t%1$s", nAlias + 1);
			strUTAlias = String.format("t%1$s", nAlias + 2);
		}

		String strExp = bMain ? strMTAlias : strUTAlias;
		return strExp;
	}

	/**
	 * 获取查询条件
	 *
	 * @param strFieldName
	 * @param nDataType
	 * @param strCondition
	 * @param strValue
	 * @param strParamName
	 * @return
	 * @throws Exception
	 */
	protected String getConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue, String strParamName) throws Exception {
		if (DataTypeUtils.compare(strCondition, Conditions.TESTNULL, true) == 0) {
			if (DataTypeUtils.compare(strValue, "1", true) == 0) {
				return String.format("%1$s IS NULL", strFieldName);
			} else {
				return String.format("%1$s IS NOT NULL", strFieldName);
			}
		}

		if (DataTypeUtils.compare(strCondition, Conditions.ISNULL, true) == 0) {
			return String.format("%1$s IS NULL", strFieldName);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.ISNOTNULL, true) == 0) {
			return String.format("%1$s IS NOT NULL", strFieldName);
		}

		if (!ObjectUtils.isEmpty(strParamName)) {
			throw new Exception(String.format("没有实现"));
		}

		if (DataTypeUtils.isStringDataType(nDataType)) {
			return getStringConditionSQL(strFieldName, nDataType, strCondition, strValue, strParamName);
		}

		if (DataTypeUtils.isIntDataType(nDataType)) {
			return getIntConditionSQL(strFieldName, nDataType, strCondition, strValue, strParamName);
		}

		if (DataTypeUtils.isDoubleDataType(nDataType)) {
			return getDoubleConditionSQL(strFieldName, nDataType, strCondition, strValue, strParamName);
		}

		if (DataTypeUtils.isDateTimeDataType(nDataType)) {
			return getDateTimeConditionSQL(strFieldName, nDataType, strCondition, strValue, strParamName);
		}

		throw new Exception(String.format("无法识别的数据类型[%1$s]", nDataType));
	}

	/**
	 * 获取属性字符串条件
	 *
	 * @param strFieldName
	 * @param nDataType
	 * @param strCondition
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	public String getStringConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue) throws Exception {
		return getStringConditionSQL(strFieldName, nDataType, strCondition, strValue, "");
	}

	/**
	 * 获取字符串条件
	 *
	 * @param strFieldName
	 * @param nDataType
	 * @param strCondition
	 * @param strValue
	 * @param strParamName
	 * @return
	 * @throws Exception
	 */
	protected String getStringConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue, String strParamName) throws Exception {
		if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0)) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s = '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s <> '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s > '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s >= '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s < '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
			strValue = strValue.replace("'", "''");
			return String.format("%1$s <= '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.LIKE, true) == 0) {
			strValue = strValue.replace("'", "''");
			strValue = "%" + strValue + "%";
			return String.format("%1$s LIKE '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.LEFTLIKE, true) == 0) {
			strValue = strValue.replace("'", "''");
			strValue = strValue + "%";
			return String.format("%1$s LIKE '%2$s'", strFieldName, strValue);
		}

		if (DataTypeUtils.compare(strCondition, Conditions.RIGHTLIKE, true) == 0) {
			strValue = strValue.replace("'", "''");
			strValue = "%" + strValue;
			return String.format("%1$s LIKE '%2$s'", strFieldName, strValue);
		}

		if ((DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0)) {
			strValue = strValue.replace(",", ";");
			strValue = strValue.replace("'", "''");
			String items[] = strValue.split("[;]");
			if (items.length == 0) {
				throw new Exception("没有指定参数");
			}
			StringBuilder sb = new StringBuilder();
			sb.append(strFieldName);
			if (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0) {
				sb.append(" NOT ");
			}
			sb.append(" IN (");
			for (int i = 0; i < items.length; i++) {
				if (i != 0) {
					sb.append(",");
				}
				sb.append(String.format("'%1$s'", items[i]));
			}
			sb.append(")");
			return sb.toString();
		}

		return "";
	}

	public String getIntConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue) throws Exception {
		return getIntConditionSQL(strFieldName, nDataType, strCondition, strValue, "");
	}

	protected String getIntConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue, String strParamName) throws Exception {
		// 判断值是否正确
		Object objValue = null;
		if (!((DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0))) {
			objValue = DataTypeUtils.testBigInt(strValue);
			if (objValue == null) {
				throw new Exception(String.format("值[%1$s]非整数值", strValue));
			}
		}

		if (ObjectUtils.isEmpty(strParamName)) {
			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0)) {
				return String.format("%1$s = %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				return String.format("%1$s <> %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				return String.format("%1$s > %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				return String.format("%1$s >= %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				return String.format("%1$s < %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				return String.format("%1$s <= %2$s", strFieldName, strValue);
			}

			if ((DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0)) {
				if (ObjectUtils.isEmpty(strValue)) {
					if (DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0)
						return "1<>1";
					else
						return "1=1";
				}

				strValue = strValue.replace(",", ";");
				String[] items = strValue.split("[;]");
				String strSQL = "";
				if (DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) {
					strSQL = String.format("%1$s IN (", strFieldName);
				} else {
					strSQL = String.format("%1$s NOT IN (", strFieldName);
				}
				for (int i = 0; i < items.length; i++) {
					Object objItem = DataTypeUtils.testBigInt(items[i]);
					if (objItem == null) {
						throw new Exception(String.format("值[%1$s]非整数值", items[i]));
					}

					if (i != 0)
						strSQL += ",";
					strSQL += String.format("%1$s", items[i]);
				}
				strSQL += ")";
				return strSQL;
			}

			return "";
		} else {
			CallParam callParam = new CallParam();
			callParam.setParamName(strParamName);
			callParam.setValue(objValue);

			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0))

			{
				callParams.add(callParam);
				return String.format("%1$s = ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <> ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s > ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s >=?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s < ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <= ?", strFieldName);
			}

			return "";
		}
	}

	public String getDoubleConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue) throws Exception {
		return getDoubleConditionSQL(strFieldName, nDataType, strCondition, strValue, "");
	}

	protected String getDoubleConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue, String strParamName) throws Exception {
		// 判断值是否正确
		Object objValue = DataTypeUtils.testDouble(strValue);
		if (objValue == null) {
			if (!((DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0))) {
				throw new Exception(String.format("值[%1$s]非浮点值", strValue));
			}

		}
		if (ObjectUtils.isEmpty(strParamName)) {

			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0))

			{
				return String.format("%1$s = %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				return String.format("%1$s <> %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				return String.format("%1$s > %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				return String.format("%1$s >= %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				return String.format("%1$s < %2$s", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				return String.format("%1$s <= %2$s", strFieldName, strValue);
			}

			if ((DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.NOTIN, true) == 0)) {
				if (ObjectUtils.isEmpty(strValue)) {
					if (DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0)
						return "1<>1";
					else
						return "1=1";
				}

				strValue = strValue.replace(",", ";");
				String[] items = strValue.split("[;]");
				String strSQL = "";
				if (DataTypeUtils.compare(strCondition, Conditions.IN, true) == 0) {
					strSQL = String.format("%1$s IN (", strFieldName);
				} else {
					strSQL = String.format("%1$s NOT IN (", strFieldName);
				}
				for (int i = 0; i < items.length; i++) {
					Object objItem = DataTypeUtils.testDouble(items[i]);
					if (objItem == null) {
						throw new Exception(String.format("值[%1$s]非浮点值", items[i]));
					}

					if (i != 0)
						strSQL += ",";
					strSQL += String.format("%1$s", items[i]);
				}
				strSQL += ")";
				return strSQL;
			}

			return "";
		} else {
			CallParam callParam = new CallParam();
			callParam.setParamName(strParamName);
			callParam.setValue(objValue);

			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0))

			{
				callParams.add(callParam);
				return String.format("%1$s = ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <> ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s > ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s >=?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s < ?", strFieldName);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <= ?", strFieldName);
			}
			return "";
		}
	}

	public String getDateTimeConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue) throws Exception {
		return getDateTimeConditionSQL(strFieldName, nDataType, strCondition, strValue, "");
	}

	protected String getDateTimeConditionSQL(String strFieldName, int nDataType, String strCondition, String strValue, String strParamName) throws Exception {
		// 判断值是否正确
		Object objValue = null;
		if (!ObjectUtils.isEmpty(strValue)) {
			// 判断值是否正确
			objValue = DataTypeUtils.testDateTime(strValue);
			if (objValue == null) {
				log.error(String.format("值[%1$s]非日期时间性", strValue));
				return "";
			}

			java.sql.Timestamp ts = (java.sql.Timestamp) objValue;
			strValue = String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", ts);

			if ((DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0)) {

				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date(ts.getTime()));

				if (calendar.get(Calendar.HOUR_OF_DAY) == 0 && calendar.get(Calendar.MINUTE) == 0 && calendar.get(Calendar.SECOND) == 0) {
					strValue = String.format("%1$tY-%1$tm-%1$td 23:59:59", ts);
					objValue = DataTypeUtils.testDateTime(strValue);
				}
			}
		}

		if (ObjectUtils.isEmpty(strParamName)) {

			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0)) {
				return String.format("%1$s = '%2$s'", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				return String.format("%1$s <> '%2$s'", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				return String.format("%1$s > '%2$s'", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				return String.format("%1$s >= '%2$s'", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				return String.format("%1$s < '%2$s'", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				return String.format("%1$s <= '%2$s'", strFieldName, strValue);
			}
			return "";
		} else {
			CallParam callParam = new CallParam();
			callParam.setParamName(strParamName);
			callParam.setValue(objValue);

			if ((DataTypeUtils.compare(strCondition, Conditions.EQ, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.ABSEQ, true) == 0)) {
				callParams.add(callParam);
				return String.format("%1$s = ?", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.NOTEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <> ?", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s > ?", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.GTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s >= ?", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LT, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s < ?", strFieldName, strValue);
			}

			if (DataTypeUtils.compare(strCondition, Conditions.LTANDEQ, true) == 0) {
				callParams.add(callParam);
				return String.format("%1$s <= ?", strFieldName, strValue);
			}
			return "";
		}
	}

	// /**
	// * @return the strDAQueryModelHelperId
	// */
	// public String getDAQueryModelHelperId()
	// {
	// return strDAQueryModelHelperId;
	// }
	//
	// /**
	// * @param strDAQueryModelHelperId
	// * the strDAQueryModelHelperId to set
	// */
	// public void setDAQueryModelHelperId(String strDAQueryModelHelperId)
	// {
	// this.strDAQueryModelHelperId = strDAQueryModelHelperId;
	// }

	// public String getConditionSQL(IPSDEField iPSDEField, SearchItemConfig
	// searchItemConfig, String strValue)
	// {
	// return getConditionSQL(null, iPSDEField, searchItemConfig, strValue);
	// }

	// /**
	// * @param field
	// * @param searchItemConfig
	// * @param strValue
	// * @return
	// */
	// public String getConditionSQL(IDAQueryModelUserContext iQMUserContext,
	// IPSDEField iPSDEField, SearchItemConfig searchItemConfig, String
	// strValue)
	// {
	// String strDEFName = iPSDEField.getName();
	//
	// if (!fieldExpMap.containsKey(strDEFName))
	// {
	// log.warn(String.format("无法获取属性[%1$s]对应的表达式",strDEFName));
	// return "";
	// }
	//
	// if (!fieldDataTypeMap.containsKey(strDEFName))
	// {
	// log.warn(String.format("无法获取属性[%1$s]对应的数据类型",strDEFName));
	// return "";
	// }
	// if (ObjectUtils.isEmpty(searchItemConfig.getFunc()))
	// {
	// if(iPSDEField.getEncryptStorage() == DEField.ENCRYPTSTORAGE_HASH)
	// {
	// if(!ObjectUtils.isEmpty(strValue))
	// strValue = EncryptHelper.encode2(strValue);
	// }
	//
	// IDEFQueryHelper iDEFQueryHelper = iPSDEField.GetQueryHelper();
	// if (iDEFQueryHelper != null)
	// {
	// String strSQL = iDEFQueryHelper.getConditionSQL(iQMUserContext, this,
	// fieldExpMap.get(strDEFName), searchItemConfig.getAction(), strValue, "");
	// return strSQL;
	// }
	// return getConditionSQL(fieldExpMap.get(strDEFName),
	// fieldDataTypeMap.get(strDEFName), searchItemConfig.getAction(), strValue,
	// "");
	// }
	// else
	// {
	// IDAValueFunc iDAValueFunc =
	// this.iDAGlobalHelper.getDAConfigMgr().getValueFuncMgr().FindFunc(searchItemConfig.getFunc(),this.GetDBType(),iPSDEField.getStdDataType());
	// if (iDAValueFunc == null)
	// {
	// log.error(String.format("无法找到的值处理函数[%1$s]",
	// searchItemConfig.getFunc()));
	// return "";
	// }
	//
	// String strFuncFormat = String.format(iDAValueFunc.GetFuncFormat(),
	// fieldExpMap.get(strDEFName));
	// return getConditionSQL(strFuncFormat, iDAValueFunc.getDataType(),
	// searchItemConfig.getAction(), strValue, "");
	// }
	// }

	// public String getConditionSQL(IPSDEField iPSDEField, String strFunc,
	// String strAction, String strValue)
	// {
	// return getConditionSQL(null, iPSDEField, strFunc, strAction, strValue);
	// }

	// /**
	// * 获取指定属性的条件语句
	// *
	// * @param iPSDEField
	// * 属性辅助对象
	// * @param strFunc
	// * 值函数处理
	// * @param strAction
	// * 值操作（条件）
	// * @param strValue
	// * 目标值
	// * @return
	// */
	// public String getConditionSQL(IDAQueryModelUserContext iQMUserContext,
	// IPSDEField iPSDEField, String strFunc, String strAction, String strValue)
	// {
	// String strDEFName = iPSDEField.getName();
	//
	// if (!fieldExpMap.containsKey(strDEFName))
	// return "";
	//
	// if (!fieldDataTypeMap.containsKey(strDEFName))
	// return "";
	// if (ObjectUtils.isEmpty(strFunc))
	// {
	// if(iPSDEField.getEncryptStorage() == DEField.ENCRYPTSTORAGE_HASH)
	// {
	// if(!ObjectUtils.isEmpty(strValue))
	// strValue = EncryptHelper.encode2(strValue);
	// }
	//
	// IDEFQueryHelper iDEFQueryHelper = iPSDEField.GetQueryHelper();
	// if (iDEFQueryHelper != null)
	// {
	// String strSQL = iDEFQueryHelper.getConditionSQL(iQMUserContext, this,
	// fieldExpMap.get(strDEFName), strAction, strValue, "");
	// return strSQL;
	// }
	//
	// return getConditionSQL(fieldExpMap.get(strDEFName),
	// fieldDataTypeMap.get(strDEFName), strAction, strValue, "");
	// }
	// else
	// return "";
	// }

	public String getCountSQL(String strSQL) {
		return "";
	}

	/**
	 * 获取分页的SQL语句
	 *
	 * @param strSQL
	 * @param nStartPos
	 * @param nPageSize
	 * @param strMajor
	 * @param strMajorDirection
	 * @param strMinor
	 * @param strMinorDirection
	 * @return
	 */
	public String getPagingSQL(String strSQL, int nStartPos, int nPageSize, String strMajor, String strMajorDirection, String strMinor, String strMinorDirection) {
		return "";
	}

	/**
	 * 获取分页的SQL语句
	 *
	 * @param strSQL
	 * @param nStartPos
	 * @param nPageSize
	 * @param strMajor
	 * @param strMajorDirection
	 * @param strMinor
	 * @param strMinorDirection
	 * @return
	 */
	public String getPagingSQL(String strSQL, int nStartPos, int nPageSize, String strGroup, String strGroupDir, String strMajor, String strMajorDirection, String strMinor, String strMinorDirection) {
		if (ObjectUtils.isEmpty(strGroup)) {
			return getPagingSQL(strSQL, nStartPos, nPageSize, strMajor, strMajorDirection, strMinor, strMinorDirection);
		} else
			return getPagingSQL(strSQL, nStartPos, nPageSize, strGroup, strGroupDir, strMajor, strMajorDirection);
	}

	/**
	 * 获取排序语句
	 *
	 * @param strSQL
	 * @param nStartPos
	 * @param nPageSize
	 * @param strMajor
	 * @param strMajorDirection
	 * @param strMinor
	 * @param strMinorDirection
	 * @return
	 */
	public String getSortSQL(String strSQL, String strMajor, String strMajorDirection, String strMinor, String strMinorDirection) {
		return "";
	}

	public String getSortSQL(boolean bSubQuery, String strSQL, String strMajor, String strMajorDirection, String strMinor, String strMinorDirection) {
		if (bSubQuery) {
			StringBuilder script = new StringBuilder();
			if (!ObjectUtils.isEmpty(strMajor)) {
				String strFieldName = fieldExpMap.get(strMajor.toUpperCase());
				if (!ObjectUtils.isEmpty(strFieldName)) {
					script.append(String.format("%1$s ORDER BY %2$s %3$s", strSQL, strFieldName, strMajorDirection));

					if (!ObjectUtils.isEmpty(strMinor)) {
						strFieldName = fieldExpMap.get(strMinor.toUpperCase());
						if (!ObjectUtils.isEmpty(strFieldName)) {
							script.append(String.format(",%1$s %2$s", strFieldName, strMinorDirection));
						}
					}
				}
				return script.toString();
			} else
				return strSQL;
		} else
			return getSortSQL(strSQL, strMajor, strMajorDirection, strMinor, strMinorDirection);
	}

	// /**
	// * 获取排序脚本
	// *
	// * @param strSQL
	// * @param strMajor
	// * @param strMajorDirection
	// * @param strMinor
	// * @param strMinorDirection
	// * @return
	// */
	// public String GetOrderSQL(String strSQL, String strMajor, String
	// strMajorDirection, String strMinor, String strMinorDirection)
	// {
	// return "";
	// }

	/**
	 * 获取表别名序号
	 *
	 * @return
	 */
	final private int getAliasIndex() {
		nAliasIndex += 10;
		return nAliasIndex;
	}

	final private int getCurAliasIndex() {
		return nAliasIndex;
	}

	protected int getAliasIndex2() {
		nAliasIndex += 10;
		return nAliasIndex;
	}

	/**
	 * 获取主实体辅助对象
	 *
	 * @return
	 */
	public IPSDataEntity getMajorPSDataEntity() {
		return this.majorPSDataEntity;
	}



//	/**
//	 * 获取分组语句
//	 * 
//	 * @param strSQL
//	 * @param queryGroupModelConfig
//	 * @return
//	 */
//	public String getGroupSQL(String strSQL, QueryGroupModelConfig queryGroupModelConfig, ArrayList<CallParam> list, ISRFDAWebContext webContext, ISRFDAGlobalHelper iDAGlobalHelper, String strCurPersonId, BaseDataEntity baseDataEntity) throws Exception {
//		if (ObjectUtils.isEmpty(strSQL)) {
//			strSQL = this.getQueryModelScript(null);
//		}
//
//		if (ObjectUtils.isEmpty(strSQL)) {
//			log.error(String.format("主查询语句无效"));
//			return "";
//		}
//
//		StringBuilder sqlGroup = new StringBuilder();
//
//		IPSDataEntity majorDEHelper = getMajorPSDataEntity();
//
//		sqlGroup.append("SELECT ");
//
//		boolean bFirst = true;
//
//		int nAliasIndex = 0;
//
//		TreeMap<Integer, String> orderMap = new TreeMap<Integer, String>();
//		ArrayList<String> groupFields = new ArrayList<String>();
//
//		ArrayList<QueryGroupItemConfig> recalcItems = new ArrayList<QueryGroupItemConfig>();
//
//		for (QueryGroupItemConfig queryGroupItemConfig : queryGroupModelConfig) {
//			if (queryGroupItemConfig.isReCalc()) {
//				recalcItems.add(queryGroupItemConfig);
//				continue;
//			}
//
//			nAliasIndex++;
//
//			String strFormular = queryGroupItemConfig.getFormular();
//			String strDEFields = queryGroupItemConfig.getDEFields();
//
//			if (ObjectUtils.isEmpty(strFormular) && ObjectUtils.isEmpty(strDEFields)) {
//				continue;
//			}
//			String strFieldCode = "";
//			String strAlias = queryGroupItemConfig.getAlias();
//
//			if (!ObjectUtils.isEmpty(strDEFields)) {
//				String[] fields = strDEFields.split("[,]");
//
//				String[] fieldCodes = new String[fields.length];
//
//				if (ObjectUtils.isEmpty(strFormular)) {
//					strFormular = "%1$s";
//					// 取第一个字段
//					String strDEField = fields[0];
//					IPSDEField defHelper = majorDEHelper.getPSDEField(strDEField);
//					if (defHelper == null) {
//						if (ObjectUtils.isEmpty(strAlias))
//							strAlias = fields[0];
//						fieldCodes[0] = strDEField;
//					} else {
//						if (ObjectUtils.isEmpty(strAlias))
//							strAlias = fields[0];
//
//						String strRealCode = getDEFieldStatisticsNullConvertCode(defHelper);
//						fieldCodes[0] = strRealCode;
//					}
//				} else {
//
//					for (int i = 0; i < fields.length; i++) {
//						String strDEField = fields[i];
//						IPSDEField defHelper = majorDEHelper.getPSDEField(strDEField);
//						if (defHelper == null) {
//							fieldCodes[i] = strDEField;
//						} else {
//							String strRealCode = getDEFieldStatisticsNullConvertCode(defHelper);
//							fieldCodes[i] = strRealCode;
//						}
//					}
//				}
//
//				strFieldCode = String.format(strFormular, fieldCodes);
//			} else {
//				strFieldCode = strFormular;
//			}
//
//			if (bFirst) {
//				bFirst = false;
//			} else
//				sqlGroup.append(",");
//
//			if (ObjectUtils.isEmpty(strAlias)) {
//				strAlias = String.format("A%1$s", nAliasIndex);
//				queryGroupItemConfig.setAlias(strAlias);
//			}
//
//			sqlGroup.append("%1$s as %2$s", strFieldCode, strAlias);
//
//			if (queryGroupItemConfig.getIsGroup())
//				groupFields.add(strFieldCode);
//
//			if (!ObjectUtils.isEmpty(queryGroupItemConfig.getOrderDirection())) {
//				orderMap.put(queryGroupItemConfig.getOrder(), String.format("%1$s %2$s", strAlias, queryGroupItemConfig.getOrderDirection()));
//			}
//
//			// 增加变量
//			String strParams = queryGroupItemConfig.getUserTag();
//			if (!ObjectUtils.isEmpty(strParams)) {
//				String[] params = strParams.split("[;]");
//				for (int i = 0; i < params.length; i++) {
//					CallParam cp = new CallParam();
//					cp.setParamName(params[i]);
//					CallResult callResult = MacroHelper.GetValue(cp.getParamName(), webContext, iDAGlobalHelper, strCurPersonId, baseDataEntity);
//					if (callResult.getRetCode() == Errors.OK) {
//						Object objValue = callResult.getUserObject();
//						if (objValue == null || DataTypeUtils.compare(objValue.toString(), cp.getParamName(), true) != 0) {
//							cp.setValue(objValue);
//						}
//					}
//					list.add(cp);
//				}
//			}
//
//		}
//		sqlGroup.append(" FROM (%1$s) m1 ", strSQL);
//
//		if (groupFields.size() == 0) {
//			log.error(String.format("没有指定任何分组属性"));
//			return "";
//		}
//
//		bFirst = true;
//		// 执行分组
//		for (String strFieldCode : groupFields) {
//			if (bFirst) {
//				sqlGroup.append(" GROUP BY ");
//				bFirst = false;
//			} else {
//				sqlGroup.append(" , ");
//			}
//			sqlGroup.append(strFieldCode);
//		}
//
//		String strGroupSql = sqlGroup.toString();
//		if (recalcItems.size() > 0) {
//			sqlGroup.Reset();
//			sqlGroup.append("SELECT m3.*");
//			for (QueryGroupItemConfig queryGroupItemConfig : recalcItems) {
//				nAliasIndex++;
//
//				String strFormular = queryGroupItemConfig.getFormular();
//				String strDEFields = queryGroupItemConfig.getDEFields();
//
//				if (ObjectUtils.isEmpty(strFormular) && ObjectUtils.isEmpty(strDEFields)) {
//					continue;
//				}
//				String strFieldCode = "";
//				String strAlias = queryGroupItemConfig.getAlias();
//
//				strFieldCode = strFormular;
//				sqlGroup.append(",");
//
//				if (ObjectUtils.isEmpty(strAlias)) {
//					strAlias = String.format("A%1$s", nAliasIndex);
//					queryGroupItemConfig.setAlias(strAlias);
//				}
//
//				sqlGroup.append("%1$s as %2$s", strFieldCode, strAlias);
//
//				if (!ObjectUtils.isEmpty(queryGroupItemConfig.getOrderDirection())) {
//					orderMap.put(queryGroupItemConfig.getOrder(), String.format("%1$s %2$s", strAlias, queryGroupItemConfig.getOrderDirection()));
//				}
//			}
//
//			sqlGroup.append(" FROM (%1$s) m3", strGroupSql);
//			strGroupSql = sqlGroup.toString();
//		}
//
//		if (!ObjectUtils.isEmpty(queryGroupModelConfig.getGroupCond())) {
//			sqlGroup.Reset();
//			sqlGroup.append("SELECT m4.*");
//			sqlGroup.append(" FROM (%1$s) m4 where %2$s", strGroupSql, queryGroupModelConfig.getGroupCond());
//			strGroupSql = sqlGroup.toString();
//		}
//
//		if (orderMap.size() > 0) {
//			StringBuilder sqlGroupEx = new StringBuilder();
//			sqlGroupEx.append("SELECT * FROM (%1$s) m2 ", strGroupSql);
//
//			bFirst = true;
//			for (int nValue : orderMap.keySet()) {
//				if (bFirst) {
//					sqlGroupEx.append(" ORDER BY ");
//					bFirst = false;
//				} else
//					sqlGroupEx.append(" , ");
//
//				sqlGroupEx.append(orderMap.get(nValue));
//			}
//			strGroupSql = sqlGroupEx.toString();
//		}
//
//		if (queryGroupModelConfig.getTopCount() == 0)
//			return strGroupSql;
//
//		return getFetchTopRowSQL(strGroupSql, queryGroupModelConfig.getTopCount());
//	}

	public String getFetchTopRowSQL(String strSQL, int nTopCount) {
		return strSQL;
	}

//	protected String getDEFieldStatisticsNullConvertCode(IPSDEField defHelper) throws Exception {
//		String strStaNullConv = defHelper.getPSDTColumn(this.getDBType()).getStatisticsNullConvert();
//		if (!ObjectUtils.isEmpty(strStaNullConv)) {
//			return String.format("(CASE WHEN %1$s IS NULL THEN %2$s ELSE %1$s END)", defHelper.getPSDTColumn(this.getDBType()).getColumnName(), strStaNullConv);
//		} else
//			return defHelper.getName();
//	}

	// public DEDQAlias findPSQMAlias(String strAlias) {
	// return qmAliasMap.get(strAlias.toUpperCase());
	// }

	public void registerCallParam(String strParamName, Object objValue) {
		CallParam callParam = new CallParam();
		callParam.setParamName(strParamName);
		callParam.setValue(objValue);
		this.callParams.add(callParam);
	}

	/**
	 * 注册查询模型定义代码
	 *
	 * @param strDeclareName
	 * @param qmDeclare
	 */
	public void registerQMDeclare(String strDeclareName, DEDQDeclare qmDeclare) {
		strDeclareName = strDeclareName.toUpperCase();
		qmDeclareMap.put(strDeclareName, qmDeclare);
	}

	/**
	 * 判断是否注册了查询模型定义
	 *
	 * @param strDeclareName
	 * @return
	 */
	public boolean isContainsQMDeclare(String strDeclareName) {
		strDeclareName = strDeclareName.toUpperCase();
		return qmDeclareMap.containsKey(strDeclareName);
	}

	/**
	 * 获取查询模型定义代码
	 *
	 * @return
	 */
	public String getQMDeclareScript() {
		String strQMDeclareScript = "";
		for (String strName : qmDeclareMap.keySet()) {
			DEDQDeclare qmDeclare = qmDeclareMap.get(strName);
			strQMDeclareScript += qmDeclare.getDeclareCode();
			strQMDeclareScript += "\n";
		}
		return strQMDeclareScript;
	}

	public static void appendConditionSQL(StringBuilder script, List<String> userConditions) {
		if (userConditions.size() != 0) {
			script.append(" WHERE ");

			boolean bFirst = true;
			for (String strCondition : userConditions) {
				if (bFirst)
					bFirst = false;
				else
					script.append(" AND ");
				script.append(String.format("(%1$s)", strCondition));
			}
		}
	}

	public void setFieldQueryCaseSensitive(String strField, String strValue) {
		strField = strField.toUpperCase();
		if (ObjectUtils.isEmpty(strValue)) {
			this.fieldCaseSensitiveMap.remove(strField);
		} else {
			int nValue = 0;
			String[] values = strValue.split("[;]");
			for (int i = 0; i < values.length; i++) {
				if (DataTypeUtils.compare(values[i], Conditions.LIKE, true) == 0) {
					nValue |= QUERYCASESENSITIVE_LIKE;
					continue;
				}

				if (DataTypeUtils.compare(values[i], Conditions.EQ, true) == 0) {
					nValue |= QUERYCASESENSITIVE_EQ;
					continue;
				}

				if (DataTypeUtils.compare(values[i], "LIKESPLIT", true) == 0) {
					nValue |= QUERYOPTION_LIKESPLIT;
					continue;
				}
			}
			this.fieldCaseSensitiveMap.put(strField, nValue);
		}
	}

	public boolean isFieldQueryCaseSensitive(String strField, String strCondition) {
		strField = strField.toUpperCase();
		if (!this.fieldCaseSensitiveMap.containsKey(strField))
			return false;

		int nValue = fieldCaseSensitiveMap.get(strField);
		if ((DataTypeUtils.compare(strCondition, Conditions.LIKE, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.LEFTLIKE, true) == 0) || (DataTypeUtils.compare(strCondition, Conditions.RIGHTLIKE, true) == 0)) {
			return (nValue & QUERYCASESENSITIVE_LIKE) != 0;
		} else {
			return (nValue & QUERYCASESENSITIVE_EQ) != 0;
		}
	}

	/**
	 * 判断查询选项
	 *
	 * @param strField
	 * @param nOption
	 * @return
	 */
	public boolean testQueryOption(String strField, int nOption) {
		strField = strField.toUpperCase();
		if (!this.fieldCaseSensitiveMap.containsKey(strField))
			return false;

		int nValue = fieldCaseSensitiveMap.get(strField);
		return (nValue & nOption) > 0;

	}

	/**
	 * 设置属性
	 *
	 * @param strKey
	 * @param objValue
	 */
	public void setAttribute(String strKey, Object objValue) {
		strKey = strKey.toUpperCase();
		if (objValue == null) {
			attributeMap.remove(strKey);
		} else {
			attributeMap.put(strKey, objValue);
		}
	}

	/**
	 * 获取属性
	 *
	 * @param strKey
	 * @param objValue
	 */
	public Object getAttribute(String strKey, Object objDefaultValue) {
		strKey = strKey.toUpperCase();
		Object objValue = attributeMap.get(strKey);
		if (objValue == null) {
			return objDefaultValue;
		} else {
			return objValue;
		}
	}

	protected IDataEntityRuntime getDataEntityRuntime(String strPSDEId) throws Exception {
		return this.getSystemRuntime().getDataEntityRuntime(strPSDEId);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SA.SRFDA.PS.Core.DataEntity.DS.IPSDEDQEngine#getDEDataQueryCodeExps()
	 */
	//@Override
	public List<DEDataQueryCodeExp> getDEDataQueryCodeExps() {
		if (deDataQueryCodeExpImplList == null || deDataQueryCodeExpImplList.size() == 0)
			return null;
		return Collections.unmodifiableList(deDataQueryCodeExpImplList);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * SA.SRFDA.PS.Core.DataEntity.DS.IPSDEDQEngine#getDEDataQueryCodeConds()
	 */
	//@Override
	public List<DEDataQueryCodeCond> getDEDataQueryCodeConds() {
		if (deDataQueryCodeCondImplList == null || deDataQueryCodeCondImplList.size() == 0)
			return null;
		return Collections.unmodifiableList(deDataQueryCodeCondImplList);
	}

	//@Override
	public List<String> getDEDQAliasNames() {
		if (this.qmAliasMap.size() == 0) {
			return null;
		}
		return Collections.unmodifiableList(new ArrayList<String>(qmAliasMap.keySet()));
	}

	//@Override
	public DEDQAlias getDEDQAlias(String strName, boolean bTryMode) throws Exception {
		DEDQAlias psDEDQAlias = this.qmAliasMap.get(strName.toLowerCase());
		if (psDEDQAlias != null) {
			return psDEDQAlias;
		}

		psDEDQAlias = this.qmAliasMap.get(strName.toUpperCase());
		if (psDEDQAlias != null) {
			return psDEDQAlias;
		}

		if (bTryMode) {
			return null;
		}

		throw new Exception(String.format("无法获取指定别名[%1$s]", strName));
	}

	//@Override
	public boolean isEnablePQL() {
		return this.bEnablePQL;
	}

	protected boolean isQueryColumn(IPSDEField iPSDEField, int nViewLevel) {

		if (iPSDEField.isDynaStorageDEField() || iPSDEField.isUIAssistDEField())
			return false;

		if (nViewLevel == -1)
			return iPSDEField.isQueryColumn();

		if (iPSDEField.isKeyDEField())
			return true;

		if (DataTypeUtils.compare(iPSDEField.getPredefinedType(), PredefinedFieldType.LOGICVALID.value, true) == 0)
			return true;

		return iPSDEField.getViewLevel() >= nViewLevel;
	}

	/**
	 * 准备实际属性
	 *
	 * @throws Exception
	 */
	protected synchronized IPSDEField getRealPSDEField(IPSLinkDEField iPSDEField, boolean bFirstPhisical) throws Exception {
		if (!bFirstPhisical) {
			return iPSDEField.getRealPSDEField();
		} else {
			IPSDEField realPSDEField2 = null;
			// 判断是否递归
			boolean bClose = false;
			ActionSession actionSession = null;
			try {
				String strPSDEFieldId = KeyValueUtils.genUniqueId(this.toString()) + "|getRealPSDEField|" + PSModelUtils.calcFullUniqueTag2(iPSDEField, true);
				actionSession = ActionSessionManager.getCurrentSession();
				if (actionSession == null) {
					bClose = true;
					actionSession = ActionSessionManager.openSession("PSLinkDEFieldImpl");
					actionSession.registerRecursion("PSDEFIELD", strPSDEFieldId);
				} else {
					if (!actionSession.registerRecursion("PSDEFIELD", strPSDEFieldId)) {
						throw new Exception(String.format("属性[%1$s]存在递归关系", iPSDEField.getName()));
					}
				}
				// if(this.getRelatedPSDEField().isLinkDEField() )
				if (iPSDEField.getRelatedPSDEField().isLinkDEField() && !iPSDEField.getRelatedPSDEField().isPhisicalDEField()) // 修复实际属性模式
				{
					IPSLinkDEField iLinkDEFHelper = null;
					if (iPSDEField.getRelatedPSDEField() instanceof IPSLinkDEField)
						iLinkDEFHelper = (IPSLinkDEField) iPSDEField.getRelatedPSDEField();
					if (iLinkDEFHelper == null) {
						throw new Exception(String.format("属性[%1$s]辅助对象没有实现接口[IPSLinkDEField]", iPSDEField.getRelatedPSDEField().getName()));
					}
					realPSDEField2 = iLinkDEFHelper.getRealPSDEField();
					if (realPSDEField2 == null) {
						log.error(String.format("属性[%1$s]实际关系属性无效", iPSDEField.getRelatedPSDEField().getName()));
					}
				} else
					realPSDEField2 = iPSDEField.getRelatedPSDEField();
				actionSession.unregisterRecursion("PSDEFIELD", strPSDEFieldId);
				if (bClose) {
					ActionSessionManager.closeSession(true);
				}
			} catch (Exception ex) {
				if (bClose) {
					ActionSessionManager.closeSession(false);
				}
				throw ex;
			}

			return realPSDEField2;
		}

	}

	protected boolean isSameTable(IPSDERInherit iPSDERInherit) throws Exception {
		IDataEntityRuntime majorDataEntityRuntime = this.getDataEntityRuntime(iPSDERInherit.getMajorPSDataEntityMust().getId());
		IDataEntityRuntime minorDataEntityRuntime = this.getDataEntityRuntime(iPSDERInherit.getMinorPSDataEntityMust().getId());
		return DataTypeUtils.compare(majorDataEntityRuntime.getTableName(), minorDataEntityRuntime.getTableName(), true) == 0;
	}

	public IPSDEDataQueryCode generatePSDEDataQueryCode(IPSDEDataQuery iPSDEDataQuery, Map<String, Object> params) throws Throwable {
		return this.onGeneratePSDEDataQueryCode(iPSDEDataQuery, params);
	}

	protected IPSDEDataQueryCode onGeneratePSDEDataQueryCode(IPSDEDataQuery iPSDEDataQuery, Map<String, Object> params) throws Throwable {

		this.compile(iPSDEDataQuery.getPSDEDQMainMust());


		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSDEDataQueryCodeImpl.ATTR_GETID, this.getDBType());
		objectNode.put(PSDEDataQueryCodeImpl.ATTR_GETDBTYPE, this.getDBType());
		objectNode.put(PSDEDataQueryCodeImpl.ATTR_GETQUERYCODE, this.getQueryScript());

		List<DEDataQueryCodeExp> deDataQueryCodeExpList = this.getDEDataQueryCodeExps();
		if(!ObjectUtils.isEmpty(deDataQueryCodeExpList)) {
			ArrayNode expArrayNode = objectNode.putArray(PSDEDataQueryCodeImpl.ATTR_GETPSDEDATAQUERYCODEEXPS);

			for(DEDataQueryCodeExp entry : deDataQueryCodeExpList) {
				ObjectNode expObjectNode = expArrayNode.addObject();
				expObjectNode.put(PSDEDataQueryCodeExpImp.ATTR_GETNAME, entry.getName());
				expObjectNode.put(PSDEDataQueryCodeExpImp.ATTR_GETEXPRESSION, entry.getExpression());
				//expObjectNode.put(PSDEDataQueryCodeExpImp.attr_get, entry.getExpression());
			}

			java.util.List<String> aliasNames = getDEDQAliasNames();
			if(!ObjectUtils.isEmpty(aliasNames)) {
				for(String strAliasName : aliasNames) {
					if(DataTypeUtils.compare(strAliasName, "MAIN", true) == 0) {
						continue;
					}

					DEDQAlias psDEDQAlias = getDEDQAlias(strAliasName, true);
					if(psDEDQAlias != null) {
						String strExpName = String.format("ALIAS.%1$s", strAliasName.toUpperCase());
						ObjectNode expObjectNode = expArrayNode.addObject();
						expObjectNode.put(PSDEDataQueryCodeExpImp.ATTR_GETNAME, strExpName);
						expObjectNode.put(PSDEDataQueryCodeExpImp.ATTR_GETEXPRESSION, String.format("t%1$s", psDEDQAlias.getAliasIndex()+1));
					}
				}
			}
		}



		List<DEDataQueryCodeCond> deDataQueryCodeCondList = this.getDEDataQueryCodeConds();
		if(!ObjectUtils.isEmpty(deDataQueryCodeCondList)) {
			ArrayNode condArrayNode = objectNode.putArray(PSDEDataQueryCodeImpl.ATTR_GETPSDEDATAQUERYCODECONDS);


			for(DEDataQueryCodeCond deDataQueryCodeCond : deDataQueryCodeCondList) {
				ObjectNode condObjectNode = condArrayNode.addObject();
				condObjectNode.put(PSDEDataQueryCodeCondImp.ATTR_GETCONDTYPE , "CUSTOM");
				condObjectNode.put(PSDEDataQueryCodeCondImp.ATTR_GETCUSTOMCOND, deDataQueryCodeCond.getCustomCond());
			}


		}

		return this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)iPSDEDataQuery, IPSDEDataQueryCode.class, objectNode);
	}
}
