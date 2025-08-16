package net.ibizsys.central.plugin.mybatisplus.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.parsing.XPathParser;
import org.apache.ibatis.scripting.xmltags.DynamicContext;
import org.apache.ibatis.scripting.xmltags.DynamicSqlSource;
import org.apache.ibatis.scripting.xmltags.SqlNode;
import org.apache.ibatis.scripting.xmltags.TextSqlNode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.tools.ant.filters.StringInputStream;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;

import net.ibizsys.central.database.DBDialectUtils;
import net.ibizsys.central.database.IDBDataService;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.database.ISysDBSchemeRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.der.IDERAggDataDEFMapRuntime;
import net.ibizsys.central.dataentity.der.IDERAggDataRuntime;
import net.ibizsys.central.dataentity.ds.IDEDQSQLCustomCondParser;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.plugin.mybatisplus.spring.service.MybatisDbDataService;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelEnums.AggMode;
import net.ibizsys.model.PSModelEnums.DEDataSetUnionMode;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEFSearchMode;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupDEField;
import net.ibizsys.model.dataentity.defield.IPSPickupObjectDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERAggData;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeCond;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.defield.DEFPredefinedTypes;
import net.ibizsys.runtime.dataentity.defield.DEFTypes;
import net.ibizsys.runtime.dataentity.der.DERAggDataDEFMapTypes;
import net.ibizsys.runtime.dataentity.ds.DEDataSetGroupModes;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;
import net.ibizsys.runtime.util.ISearchItemsCond;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.SearchCustomCond;
import net.ibizsys.runtime.util.SearchFieldCond;
import net.ibizsys.runtime.util.SearchGroupCond;
import net.ibizsys.runtime.util.SearchPredefinedCond;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectVisitorAdapter;

/**
 * mybatis sql拼接帮助类
 */
public class MybatisSqlUtil {

	private static final Log log = LogFactory.getLog(MybatisSqlUtil.class);

	// static private Pattern bracketPattern = Pattern.compile("\\[(.*?)]");
	//
	// static private Pattern conditionPattern =
	// Pattern.compile("\\'\\|\\'|\\'\\&\\'|\\([^\\)]+\\)");

	final static private Pattern DYNAMIC_TAG_PATTERN = Pattern.compile("<\\s*(if|choose|when|otherwise)\\s*[\\s\\S]*>");
	private static boolean searchIgnoreCase = false;

	public final static String OPERATION_AND = "'&'";
	public final static String OPERATION_OR = "'|'";

	public final static String TERM_OPERATOR_EQ = "'='";
	public final static String TERM_OPERATOR_NE = "'!='";
	public final static String TERM_OPERATOR_GT = "'>'";
	public final static String TERM_OPERATOR_GE = "'>='";
	public final static String TERM_OPERATOR_LT = "'<'";
	public final static String TERM_OPERATOR_LE = "'<='";
	public final static String TERM_OPERATOR_IN = "'in'";
	public final static String TERM_OPERATOR_NOTIN = "'not in'";
	public final static String TERM_OPERATOR_LIKE = "'like'";
	public final static String TERM_OPERATOR_NOTLIKE = "'not like'";

	/**
	 * 分组数据集的sql
	 *
	 * @param service
	 *            数据服务
	 * @param iDataEntityRuntime
	 *            数据查询实体运行时
	 * @param iPSDEDataSet
	 *            需要组合的数据集
	 * @param iSearchContext
	 *            搜索上下文
	 * @return
	 */
	public static GroupQuery getGroupQuery(MybatisDbDataService service, ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, String strDBType, ISearchContext iSearchContext) throws Throwable {
		//分组
		String strGroupCond = null;
		Map<String, String> groupCondMap = null;
		// 钻取
		String strDrillDownCond = null;
		Map<String, String> drillDownCondMap = null;
		String strDrillDownField = null;
		boolean bDrillDownMetric = false;
		boolean bDrillDownMode = false;
		if (iSearchContext != null) {
			strDrillDownCond = iSearchContext.getDrillDownCond();
			strGroupCond = iSearchContext.getGroupCond();
		}

		if (StringUtils.hasLength(strGroupCond)) {
			String[] items = strGroupCond.toLowerCase().split("[,]");
			groupCondMap = new HashMap<>();
			for (String item : items) {
				groupCondMap.put(item, "");
			}
		}

		IDBDialect iDBDialect = iSysDBSchemeRuntimeContext!=null?iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getSystemRuntime().getDBDialect(strDBType):DBDialectUtils.getInstance().get(strDBType);
		GroupQuery groupQuery = new GroupQuery();
		List<IPSDEDataQuery> minorDEDataQueryList = null;
		IDataEntityRuntime minorDataEntityRuntime = null;
		
		// 准备数据源查询
		if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMS
				|| iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMSEX) {
			minorDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
			minorDataEntityRuntime = iDataEntityRuntime;
		} else if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.DERAGGDATA) {
			minorDEDataQueryList = iPSDEDataSet.getPSDERAggDataMust().getSourcePSDEDataSetMust().getPSDEDataQueries();
			minorDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDEDataSet.getPSDERAggDataMust().getMinorPSDataEntityMust().getName());
		}

		List<String> minorDataSqls = new ArrayList<>();
		for (IPSDEDataQuery iPSDEDataQuery : minorDEDataQueryList) {
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = minorDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), false);
			StringBuilder sb = new StringBuilder();
			IPSDEDataQueryCode curDBPSDEDataQueryCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCode();
			sb.append(curDBPSDEDataQueryCode.getQueryCode());
			// 查询模型 自身条件
			if (curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds() != null) {
				boolean bOutputWhere = false;
				boolean bCondFirst = true;
				for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
					String strCondition = queryCodeCond.getCustomCond();
					if (!StringUtils.hasLength(strCondition)) {
						continue;
					}
					
					if(StringUtils.hasLength(queryCodeCond.getCustomType())) {
						IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
						if(iDEDQSQLCustomCondParser == null) {
							throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
						}
						
						try {
							strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
						}
						catch (Throwable ex) {
							throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
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
			minorDataSqls.add(sb.toString());
		}
		String strDataSql = String.join(" UNION ", minorDataSqls);
		groupQuery.setDatasql(strDataSql);

		if (StringUtils.hasLength(strDrillDownCond)) {
			String[] items = strDrillDownCond.split("[$]");
			if (items.length == 2) {
				strDrillDownField = items[0];
				strDrillDownCond = items[1];
			} else {
				strDrillDownCond = items[0];
			}
			if (StringUtils.hasLength(strDrillDownCond)) {
				items = strDrillDownCond.split("[,]");
				drillDownCondMap = new HashMap<>();
				for (String item : items) {
					String[] groupconds = item.split("[|]");
					if (groupconds.length == 2) {
						drillDownCondMap.put(groupconds[0], groupconds[1]);
					}
				}
				if (drillDownCondMap.size() == 0) {
					drillDownCondMap = null;
				} else {
					bDrillDownMode = true;
				}
			}
			if (StringUtils.hasLength(strDrillDownField)) {
				bDrillDownMetric = true;
			}
		}

		// 分组
		Map<String, IPSDEDataSetGroupParam> psDEDataSetGroupParamMap = null;
		if (iPSDEDataSet != null && iPSDEDataSet.getPSDEDataSetGroupParams() != null && iPSDEDataSet.getPSDEDataSetGroupParams().size() > 0) {
			psDEDataSetGroupParamMap = new HashMap<String, IPSDEDataSetGroupParam>();
			for (IPSDEDataSetGroupParam item : iPSDEDataSet.getPSDEDataSetGroupParams()) {
				if(item.isEnableGroup() && groupCondMap!=null) {
					if(!groupCondMap.containsKey(item.getName().toLowerCase())) {
						continue;
					}
				}
				psDEDataSetGroupParamMap.put(item.getName().toLowerCase(), item);
			}
		}

		if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMS) {
			if(ObjectUtils.isEmpty(psDEDataSetGroupParamMap)) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("数据集合[%s]未指定分组参数", iPSDEDataSet.getName()));
			}
			for (Map.Entry<String, IPSDEDataSetGroupParam> entry : psDEDataSetGroupParamMap.entrySet()) {
				IPSDEDataSetGroupParam imp = entry.getValue();
				if (imp.getPSDEField() != null) {
					String strQueryFieldName = null;
					if ((imp.getPSDEField().getDEFType() == DEFTypes.PHISICAL || imp.getPSDEField().getDEFType() == DEFTypes.FORMULA || imp.getPSDEField().getDEFType() == DEFTypes.LINK)) {
						strQueryFieldName = imp.getPSDEField().getName();
					} else {
						// 其他属性类型 自定义查询供数
						if (iPSDEDataSet.getPSDEDataQueries().stream().anyMatch(query -> query.isCustomCode())) {
							strQueryFieldName = imp.getPSDEField().getName();
						} else {
							strQueryFieldName = String.format("NULL AS %1$s", imp.getPSDEField().getName());
						}
					}
					if (!ObjectUtils.isEmpty(strQueryFieldName) && !groupQuery.getDatafield().contains(strQueryFieldName)) {
						groupQuery.getDatafield().add(strQueryFieldName);
					}
				}
				String strAlias = StringUtils.hasLength(imp.getAlias())?imp.getAlias():imp.getName();
				if (imp.isEnableGroup()) {
					if (StringUtils.hasLength(imp.getGroupCode())) {
						if(groupQuery.getDatafield().contains(strAlias)){
							groupQuery.getDatafield().remove(strAlias);
						}
						groupQuery.getDatafield().add(String.format("%1$s AS %2$s", imp.getGroupCode(), strAlias));
					}
					groupQuery.getResultfield().add(strAlias);
					groupQuery.getGroup().add(strAlias);
				} else {
					if (StringUtils.hasLength(imp.getGroupCode())) {
						groupQuery.getResultfield().add(String.format("%1$s AS %2$s", imp.getGroupCode(), strAlias));
					} else {
						groupQuery.getResultfield().add(strAlias);
					}
				}
			}

			List<ISearchCond> conds = iSearchContext.getSearchCondsIf();
			if (CollectionUtils.isNotEmpty(conds)) {
				StringBuffer strCond = new StringBuffer();
				for (int i = 0; i < conds.size(); i++) {
					if (i > 0)
						strCond.append(" AND ");
					genGroupCondition(strCond, iDataEntityRuntime, strDBType, iSearchContext, conds.get(i));
				}
				if (!StringUtils.isEmpty(strCond.toString()))
					groupQuery.dataConditions.add(strCond.toString());
			}
			return groupQuery;
		}

		if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.GROUPPARAMSEX) {
			if(ObjectUtils.isEmpty(psDEDataSetGroupParamMap)) {
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("数据集合[%s]未指定分组参数", iPSDEDataSet.getName()));
			}
			for (Map.Entry<String, IPSDEDataSetGroupParam> entry : psDEDataSetGroupParamMap.entrySet()) {
				IPSDEDataSetGroupParam imp = entry.getValue();
				
				if(StringUtils.hasLength(imp.getGroupJoinCode())) {
					if(!"NONE".equalsIgnoreCase(imp.getGroupJoinCode())) {
						groupQuery.getDataJoins().add(imp.getGroupJoinCode());
					}
					
					groupQuery.getJoinFields().add(imp.getGroupCode());
					
					if(imp.isEnableGroup()) {
						//进一步计算
						String[] fields = imp.getGroupCode().split("[,]");
						for(String strField : fields) {
							
							int nPos = strField.toUpperCase().indexOf(" AS ");
							if(nPos == -1) {
								String[] items = strField.split("[.]");
								if(items.length == 2) {
									groupQuery.getResultfield().add(items[1]);
									groupQuery.getGroup().add(items[1]);
									groupQuery.getDatafield().add(items[1]);
								}
								else {
									groupQuery.getResultfield().add(items[0]);
									groupQuery.getGroup().add(items[0]);
									groupQuery.getDatafield().add(items[0]);
								}
							}
							else {
								String item = strField.substring(nPos  + 4).trim();
								groupQuery.getResultfield().add(item);
								groupQuery.getGroup().add(item);
								groupQuery.getDatafield().add(item);
							}
						}
					}
				}
				else {
					String strAlias = StringUtils.hasLength(imp.getAlias())?imp.getAlias():imp.getName();
					
					if (StringUtils.hasLength(imp.getGroupCode())) {
						if(imp.isEnableGroup()) {
							if(groupQuery.getDatafield().contains(strAlias)){
								groupQuery.getDatafield().remove(strAlias);
							}
							groupQuery.getDatafield().add(String.format("%1$s AS %2$s", imp.getGroupCode(), strAlias));
						}
						else {
							if(StringUtils.hasLength(imp.getSelectCode())) {
								String[] fields = imp.getSelectCode().split("[,]");
								for(String strField: fields ) {
									strField = strField.trim();
									if(!StringUtils.hasLength(strField)) {
										continue;
									}
									boolean bAdd = true;
									for(String strItem : groupQuery.getDatafield()) {
										if(strField.equalsIgnoreCase(strItem)) {
											bAdd = false;
											break;
										}
									}
									if(bAdd) {
										groupQuery.getDatafield().add(strField);
									}
								}
							}
							
//							if(groupQuery.getResultfield().contains(strAlias)){
//								groupQuery.getResultfield().remove(strAlias);
//							}
//							groupQuery.getResultfield().add(String.format("%1$s AS %2$s", imp.getGroupCode(), strAlias));
						}
					}
					else {
						if (imp.getPSDEField() != null) {
							String strQueryFieldName = null;
							if ((imp.getPSDEField().getDEFType() == DEFTypes.PHISICAL || imp.getPSDEField().getDEFType() == DEFTypes.FORMULA || imp.getPSDEField().getDEFType() == DEFTypes.LINK || imp.getPSDEField().getDEFType() == DEFTypes.DYNASTORAGE)) {
								strQueryFieldName = imp.getPSDEField().getName();
							} else {
								// 其他属性类型 自定义查询供数
								if (iPSDEDataSet.getPSDEDataQueries().stream().anyMatch(query -> query.isCustomCode())) {
									strQueryFieldName = imp.getPSDEField().getName();
								} else {
									strQueryFieldName = String.format("NULL");
								}
							}
							if (!ObjectUtils.isEmpty(strQueryFieldName) && !groupQuery.getDatafield().contains(strAlias)) {
								groupQuery.getDatafield().add(String.format("%1$s AS %2$s", strQueryFieldName, strAlias));
							}
						}
						else {
							if (!groupQuery.getDatafield().contains(strAlias)) {
								groupQuery.getDatafield().add(String.format("%1$s AS %2$s", "NULL", strAlias));
							}
						}
					}
					
					if (imp.isEnableGroup()) {
						groupQuery.getResultfield().add(strAlias);
						groupQuery.getGroup().add(strAlias);
					} else {
						if(AggMode.COUNT.value.equals(imp.getAggMode())){
							groupQuery.getResultfield().add(String.format("COUNT(1) AS %1$s", strAlias));
						}
						else
							if(AggMode.AVG.value.equals(imp.getAggMode())
									||AggMode.MAX.value.equals(imp.getAggMode())
									||AggMode.MIN.value.equals(imp.getAggMode())
									||AggMode.SUM.value.equals(imp.getAggMode())
									){
								groupQuery.getResultfield().add(String.format("%2$s(%1$s) AS %1$s", strAlias, imp.getAggMode()));
							}
							else {
								if(StringUtils.hasLength(imp.getGroupCode())) {
									groupQuery.getResultfield().add(String.format("%1$s AS %2$s", imp.getGroupCode(), strAlias));
								}
								else {
									groupQuery.getResultfield().add(strAlias);
								}
							}
								
					}
				}
			}

			List<ISearchCond> conds = iSearchContext.getSearchCondsIf();
			if (CollectionUtils.isNotEmpty(conds)) {
				StringBuffer strCond = new StringBuffer();
				for (int i = 0; i < conds.size(); i++) {
					if (i > 0)
						strCond.append(" AND ");
					genGroupCondition(strCond, iDataEntityRuntime, strDBType, iSearchContext, conds.get(i));
				}
				if (!StringUtils.isEmpty(strCond.toString()))
					groupQuery.dataConditions.add(strCond.toString());
			}
			return groupQuery;
		}
		
		if (iPSDEDataSet.getGroupMode() == DEDataSetGroupModes.DERAGGDATA) {
			IPSDERAggData iPSDERAggData = iPSDEDataSet.getPSDERAggData();
			if (iPSDERAggData == null)
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("数据集合[%s]未指定分组聚合数据关系", iPSDEDataSet.getName()));
			IDataEntityRuntime iMinorDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERAggData.getMinorPSDataEntity().getName());
			IDERAggDataRuntime iDERAggRuntime = (IDERAggDataRuntime) iMinorDataEntityRuntime.getDERRuntime(iPSDERAggData, false);
			List<IDERAggDataDEFMapRuntime> iPSDERAggDataDEFieldMapRuntimes = iDERAggRuntime.getDERAggDataDEFMapRuntimes();
			if (iPSDERAggDataDEFieldMapRuntimes == null || iPSDERAggDataDEFieldMapRuntimes.size() == 0)
				throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("聚合数据关系[%s]未定义任何聚合属性", iPSDEDataSet.getPSDERAggData().getName()));
			// 分组、聚合属性
			Map<String, String> biAggDataDEFMapRuntimeMap = new TreeMap<>();
			for (IDERAggDataDEFMapRuntime item : iPSDERAggDataDEFieldMapRuntimes) {
				String strMapType = item.getMapType();
				String strMajorFieldName = item.getPSDERAggDataDEFieldMap().getMajorPSDEFieldMust().getLowerCaseName();
				if (psDEDataSetGroupParamMap != null && !psDEDataSetGroupParamMap.containsKey(strMajorFieldName)) {
					continue;
				}
				String strMinorFieldName = null;
				if (item.getPSDERAggDataDEFieldMap().getMinorPSDEField() != null) {
					strMinorFieldName = item.getPSDERAggDataDEFieldMap().getMinorPSDEField().getLowerCaseName();
					if (DEFPredefinedTypes.TIMESTAMP.equals(item.getPSDERAggDataDEFieldMap().getMinorPSDEField().getPredefinedType())) {
						strMinorFieldName = "__time";
					}
				}
				if (isDimension(item)) {
					String strFuncCode = null;
					if (!strMapType.equals(DERAggDataDEFMapTypes.GROUPBY)) {
						strFuncCode = iDBDialect.getDBFunction(strMapType.replace(DERAggDataDEFMapTypes.GROUPBY + "_", "")).getFuncSQL(new String[] { strMinorFieldName });
					}

					if (StringUtils.hasLength(strFuncCode)) {
						biAggDataDEFMapRuntimeMap.put(strMajorFieldName, strFuncCode);
					} else {
						if (StringUtils.hasLength(strMinorFieldName)) {
							biAggDataDEFMapRuntimeMap.put(strMajorFieldName, strMinorFieldName);
						}
					}
					continue;
				} else {
					if (StringUtils.hasLength(item.getFormulaFormat(strDBType))) {
						biAggDataDEFMapRuntimeMap.put(strMajorFieldName, item.getFormulaFormat(strDBType));
					} else {
						if (StringUtils.hasLength(strMinorFieldName)) {
							biAggDataDEFMapRuntimeMap.put(strMajorFieldName, strMinorFieldName);
						}

					}
					continue;
				}
			}

			// 源数据字段 分组类型转换
			if (!bDrillDownMode) {
				for (Map.Entry<String, String> entry : biAggDataDEFMapRuntimeMap.entrySet()) {
					if (StringUtils.hasLength(entry.getValue())) {
						groupQuery.getDatafield().add(String.format("%1$s AS %2$s", entry.getValue(), entry.getKey()));
					} else {
						groupQuery.getDatafield().add(String.format("%1$s", entry.getKey()));
					}
				}
			}

			// 外部传入条件 穿透进 源数据 条件进行过滤
			List<ISearchCond> dataSearchConds = new ArrayList<>();
			if (iSearchContext.getSearchConds() != null) {
				for (ISearchCond item : iSearchContext.getSearchConds()) {
					ISearchCond condition = getQueryCondition(iDBDialect, strDBType, item, true, iSearchContext, biAggDataDEFMapRuntimeMap, iPSDERAggDataDEFieldMapRuntimes);
					if (condition != null) {
						if (condition instanceof ISearchGroupCond) {
							ISearchGroupCond searchGroupCond = (ISearchGroupCond) condition;
							if (searchGroupCond.getSearchCondsIf().size() > 0)
								dataSearchConds.add(condition);
						} else {
							dataSearchConds.add(condition);
						}
					}
				}
			}
			for (ISearchCond cond : dataSearchConds) {
				if (cond instanceof ISearchFieldCond) {
					SearchFieldCond searchFieldCond = (SearchFieldCond) cond;
					String condition = iDBDialect.getConditionSQL(searchFieldCond.getFieldName(), iMinorDataEntityRuntime.getPSDEField(searchFieldCond.getFieldName()).getStdDataType(), searchFieldCond.getCondOp(), String.format("#{ctx.datacontext.%s}", searchFieldCond.getValue()), true, iSearchContext);
					groupQuery.dataConditions.add(condition);
				}
			}

			// 分组后 字段
			for (IDERAggDataDEFMapRuntime item : iPSDERAggDataDEFieldMapRuntimes) {
				String strMajorFieldName = item.getPSDERAggDataDEFieldMap().getMajorPSDEField().getLowerCaseName();
				if (psDEDataSetGroupParamMap != null && !psDEDataSetGroupParamMap.containsKey(strMajorFieldName)) {
					continue;
				}
				String strMapType = item.getMapType();
				if (isDimension(item)) {
					groupQuery.getResultfield().add(strMajorFieldName);
					continue;
				} else {
					String strFuncCode = iDBDialect.getDBFunction(strMapType.replace(DERAggDataDEFMapTypes.GROUPBY + "_", "")).getFuncSQL(new String[] { strMajorFieldName });
					if (StringUtils.hasLength(strFuncCode) && !bDrillDownMode) {
						groupQuery.getResultfield().add(String.format("%1$s AS %2$s", strFuncCode, strMajorFieldName));
					} else {
						groupQuery.getResultfield().add(strMajorFieldName);
					}
					continue;
				}
			}

			if (!bDrillDownMode) {
				// 输出分组
				for (IDERAggDataDEFMapRuntime item : iPSDERAggDataDEFieldMapRuntimes) {
					String strMajorFieldName = item.getPSDERAggDataDEFieldMap().getMajorPSDEField().getLowerCaseName();
					if (psDEDataSetGroupParamMap != null && !psDEDataSetGroupParamMap.containsKey(strMajorFieldName)) {
						continue;
					}
					if (isDimension(item)) {
						groupQuery.getGroup().add(strMajorFieldName);
					}
				}
			}

			// 分组后 过滤 条件
			List<ISearchCond> resultSearchConds = new ArrayList<>();
			// 自身过滤条件
			List<IPSDEDataQuery> majorDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
			for (IPSDEDataQuery iPSDEDataQuery : majorDEDataQueryList) {
				IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, iSysDBSchemeRuntimeContext.getSysDBSchemeRuntime().getDBType(), false);
				IPSDEDataQueryCode curDBPSDEDataQueryCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCode();
				// 查询模型 自身条件
				if (curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds() != null) {
					for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
						String strCondition = queryCodeCond.getCustomCond();
						if (!StringUtils.hasLength(strCondition)) {
							continue;
						}
						
						if(StringUtils.hasLength(queryCodeCond.getCustomType())) {
							IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
							if(iDEDQSQLCustomCondParser == null) {
								throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
							}
							
							try {
								strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
							}
							catch (Throwable ex) {
								throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
							}
						}
						
						groupQuery.resultConditions.add(strCondition);
					}
				}
			}
			// 外部过滤条件
			if (iSearchContext.getSearchConds() != null) {
				for (ISearchCond item : iSearchContext.getSearchConds()) {
					ISearchCond condition = getQueryCondition(iDBDialect, strDBType, item, false, iSearchContext, biAggDataDEFMapRuntimeMap, iPSDERAggDataDEFieldMapRuntimes);
					if (condition != null) {
						if (condition instanceof ISearchGroupCond) {
							ISearchGroupCond searchGroupCond = (ISearchGroupCond) condition;
							if (searchGroupCond.getSearchCondsIf().size() > 0)
								resultSearchConds.add(condition);
						} else {
							resultSearchConds.add(condition);
						}
					}
				}
			}
			for (ISearchCond cond : resultSearchConds) {
				if (cond instanceof ISearchFieldCond) {
					SearchFieldCond searchFieldCond = (SearchFieldCond) cond;
					String condition = iDBDialect.getConditionSQL(searchFieldCond.getFieldName(), iDataEntityRuntime.getPSDEField(searchFieldCond.getFieldName()).getStdDataType(), searchFieldCond.getCondOp(), String.format("#{ctx.datacontext.%s}", searchFieldCond.getValue()), true, iSearchContext);
					groupQuery.resultConditions.add(condition);
				}
			}
		}

		return groupQuery;
	}

	public static boolean isDimension(IDERAggDataDEFMapRuntime iPSDERAggDataDEFieldMap) {
		return iPSDERAggDataDEFieldMap.getMapType().indexOf(DERAggDataDEFMapTypes.GROUPBY) != -1 || iPSDERAggDataDEFieldMap.getMapType().indexOf(DERAggDataDEFMapTypes.USER) != -1;
	}

	private static ISearchCond getQueryCondition(IDBDialect iDBDialect, String strDBType, ISearchCond iSearchCond, boolean bSourceMode, ISearchContext iSearchContext, Map<String, String> biAggDataDEFMapRuntimeMap, List<IDERAggDataDEFMapRuntime> iPSDERAggDataDEFieldMapRuntimes) throws Throwable {
		if (iSearchCond instanceof ISearchGroupCond) {
			ISearchGroupCond searchGroupCond = (ISearchGroupCond) iSearchCond;
			ISearchGroupCond newSearchGroupCond = new SearchGroupCond();
			for (ISearchCond childSearchCond : searchGroupCond.getSearchConds()) {
				ISearchCond cond = getQueryCondition(iDBDialect, strDBType, childSearchCond, bSourceMode, iSearchContext, biAggDataDEFMapRuntimeMap, iPSDERAggDataDEFieldMapRuntimes);
				if (cond != null)
					newSearchGroupCond.getSearchCondsIf().add(cond);
			}
			return newSearchGroupCond;
		} else if (iSearchCond instanceof ISearchFieldCond) {
			if (bSourceMode) {
				ISearchFieldCond searchFieldCond = (ISearchFieldCond) iSearchCond;
				String strMajorFieldName = searchFieldCond.getFieldName();
				for (IDERAggDataDEFMapRuntime item : iPSDERAggDataDEFieldMapRuntimes) {
					if (strMajorFieldName.equals(item.getPSDERAggDataDEFieldMap().getMajorPSDEField().getName()) && isDimension(item) && item.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY)) {
						String minorFieldName = null;
						if (item.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY)) {
							minorFieldName = item.getPSDERAggDataDEFieldMap().getMinorPSDEField().getName();
						} else {
							minorFieldName = iDBDialect.getDBFunction(item.getMapType().replace(DERAggDataDEFMapTypes.GROUPBY + "_", "")).getFuncSQL(new String[] { item.getPSDERAggDataDEFieldMap().getMinorPSDEField().getName() });
						}
						SearchFieldCond minorSearchFiledCond = new SearchFieldCond();
						minorSearchFiledCond.setFieldName(minorFieldName);
						minorSearchFiledCond.setCondOp(searchFieldCond.getCondOp());
						minorSearchFiledCond.setValue(searchFieldCond.getValue());
						minorSearchFiledCond.setParamMode(true);
						return minorSearchFiledCond;
					}
				}
				return null;
			} else {
				ISearchFieldCond searchFieldCond = (ISearchFieldCond) iSearchCond;
				String strMajorFieldName = searchFieldCond.getFieldName();
				for (IDERAggDataDEFMapRuntime item : iPSDERAggDataDEFieldMapRuntimes) {
					if (strMajorFieldName.equals(item.getPSDERAggDataDEFieldMap().getMajorPSDEField().getName()) && (!isDimension(item) || (!item.getMapType().equals(DERAggDataDEFMapTypes.GROUPBY)))) {
						SearchFieldCond minorSearchFiledCond = new SearchFieldCond();
						minorSearchFiledCond.setFieldName(strMajorFieldName);
						minorSearchFiledCond.setCondOp(searchFieldCond.getCondOp());
						minorSearchFiledCond.setValue(searchFieldCond.getValue());
						minorSearchFiledCond.setParamMode(true);
						return minorSearchFiledCond;

					}
				}
				return null;
			}
		}
		return null;
	}

	/**
	 * 组合数据集的sql
	 *
	 * @param service
	 *            数据服务
	 * @param iDataEntityRuntime
	 *            数据查询实体运行时
	 * @param iPSDEDataSet
	 *            需要组合的数据集
	 * @param iSearchContext
	 *            搜索上下文
	 * @return
	 */
	public static String composeDataSet(IDBDataService service, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, String strDBType, ISearchContext iSearchContext, QueryWrapper<Object> query) throws Throwable {
		// 所有数据集合
		List<IPSDEDataQuery> psDEDataQueryList = iPSDEDataSet.getPSDEDataQueries();
		if (psDEDataQueryList == null || psDEDataQueryList.size() == 0) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("实体数据集未包含任何查询"));
		}
		// calcSearchCond(iDataEntityRuntime, null, iSearchContext, query);
		List<String> sqlList = new ArrayList<>();
		// 遍历所有查询
		for (IPSDEDataQuery iPSDEDataQuery : psDEDataQueryList) {
			IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, strDBType, false);
			String str = composeDataQuery(service, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query);
			sqlList.add(str);
		}
		
		if(DEDataSetUnionMode.UNIONALL.value.equalsIgnoreCase(iPSDEDataSet.getUnionMode())) {
			return String.join(" UNION ALL", sqlList);
		}
		else {
			return String.join(" UNION ", sqlList);
		}
		
	}

	/**
	 * 组合查询sql
	 *
	 * @param service
	 *            数据服务
	 * @param iDataEntityRuntime
	 *            数据查询实体运行时
	 * @param iSearchContext
	 *            搜索上下文
	 * @return
	 * @throws Throwable
	 */
	public static String composeDataQuery(IDBDataService service, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query) throws Throwable {
		if (query.isEmptyOfWhere()) {
			calcSearchCond(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query);
		}
		StringBuilder sb = new StringBuilder();
		IPSDEDataQueryCode curDBPSDEDataQueryCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCode();
		sb.append(curDBPSDEDataQueryCode.getQueryCode());
		// 是否已经输出 where条件
		boolean bOutputWhere = false;
		// 是否为第一个条件
		boolean bCondFirst = true;
		// 获取所有查询条件
		List<IPSDEDataQueryCodeCond> psDEDataQueryCodeCondList = curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds();
		if (psDEDataQueryCodeCondList != null) {
			for (IPSDEDataQueryCodeCond iPSDEDataQueryCodeCond : psDEDataQueryCodeCondList) {
				// 条件sql
				String strCondition = iPSDEDataQueryCodeCond.getCustomCond();
				if (!StringUtils.hasLength(strCondition)) {
					continue;
				}
				if(StringUtils.hasLength(iPSDEDataQueryCodeCond.getCustomType())) {
					IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, iPSDEDataQueryCodeCond.getCustomType());
					if(iDEDQSQLCustomCondParser == null) {
						throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", iPSDEDataQueryCodeCond.getCustomType()));
					}
					
					try {
						strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
					}
					catch (Throwable ex) {
						throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", iPSDEDataQueryCodeCond.getCustomCond(), ex.getMessage()), ex);
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
		if (query != null) {
			// 额外用户条件
			String condSql = query.getSqlSegment();
			if (condSql != null && !ObjectUtils.isEmpty(condSql)) {
				if (!bOutputWhere) {
					sb.append(" WHERE ");
					bOutputWhere = true;
				}
				if (bCondFirst) {
					bCondFirst = false;
				} else {
					sb.append(" AND ");
				}
				sb.append(condSql);
			}
		}
		return sb.toString();
	}

	/**
	 * 生成分页信息
	 *
	 * @param iSearchContext
	 * @return
	 */
	public static Page<?> composePage(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, String strDBType, ISearchContext iSearchContext) throws Throwable {

		List<IPSDEDataQuery> list = iPSDEDataSet.getPSDEDataQueries();
		if (list != null && list.size() == 1) {
			return composePage(iDataEntityRuntime, list.get(0), strDBType, iSearchContext);
		}

		Pageable pageable = iSearchContext.getPageable();
		// 计算分页
		Page<?> page = new Page<Object>();
		// 是否计算count
		page.setSearchCount(iSearchContext.isCount());
		if (pageable != null && Pageable.unpaged() != pageable) {
			page.setSize(pageable.getPageSize());
			page.setCurrent(pageable.getPageNumber() + 1);
			page.offset(pageable.getOffset());
		}

		Sort sort = iSearchContext.getPageSort();
		if (sort != null && Sort.unsorted() != sort) {
			
			IDBDialect iDBDialect = iDataEntityRuntime!=null?iDataEntityRuntime.getSystemRuntime().getDBDialect(strDBType):DBDialectUtils.getInstance().get(strDBType);
			
			List<Sort.Order> items = sort.toList();
			for (Sort.Order order : items) {

				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(order.getProperty(), true);
				if (iPSDEField != null) {
					if (order.getDirection().isAscending()) {
						page.addOrder(OrderItem.asc(iDBDialect.getDBObjStandardName(iPSDEField.getName())));
					} else {
						page.addOrder(OrderItem.desc(iDBDialect.getDBObjStandardName(iPSDEField.getName())));
					}
				} else {
					if (order.getDirection().isAscending()) {
						page.addOrder(OrderItem.asc(order.getProperty()));
					} else {
						page.addOrder(OrderItem.desc(order.getProperty()));
					}
				}
			}
		}
		return page;
	}

	/**
	 * 生成分页信息
	 *
	 * @param iSearchContext
	 * @return
	 */
	public static Page<?> composePage(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, String strDBType, ISearchContext iSearchContext) throws Throwable {
		Pageable pageable = iSearchContext.getPageable();
		// 计算分页
		Page<?> page = new Page<Object>();
		// 是否计算count
		page.setSearchCount(iSearchContext.isCount());
		if (pageable != null && Pageable.unpaged() != pageable) {
			page.setSize(pageable.getPageSize());
			page.setCurrent(pageable.getPageNumber() + 1);
			page.offset(pageable.getOffset());
		}
		IDBDialect iDBDialect = iDataEntityRuntime!=null?iDataEntityRuntime.getSystemRuntime().getDBDialect(strDBType):DBDialectUtils.getInstance().get(strDBType);
		Sort sort = iSearchContext.getPageSort();
		if (sort != null && Sort.unsorted() != sort) {
			List<Sort.Order> items = sort.toList();
			for (Sort.Order order : items) {
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = null;
				IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime = iDataEntityRuntime.getDEDataQueryCodeRuntime(iPSDEDataQuery, strDBType, true);
				if (iDEDataQueryCodeRuntime != null) {
					iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(order.getProperty(), true);
				}
				if (iPSDEDataQueryCodeExp != null) {
					if (order.getDirection().isAscending()) {
						page.addOrder(OrderItem.asc(iPSDEDataQueryCodeExp.getExpression()));
					} else {
						page.addOrder(OrderItem.desc(iPSDEDataQueryCodeExp.getExpression()));
					}
				} else {
					IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(order.getProperty(), true);
					if (iPSDEField != null) {
						if (order.getDirection().isAscending()) {
							page.addOrder(OrderItem.asc(iDBDialect.getDBObjStandardName(iPSDEField.getName())));
						} else {
							page.addOrder(OrderItem.desc(iDBDialect.getDBObjStandardName(iPSDEField.getName())));
						}
					} else {
						if (order.getDirection().isAscending()) {
							page.addOrder(OrderItem.asc(order.getProperty()));
						} else {
							page.addOrder(OrderItem.desc(order.getProperty()));
						}
					}
				}
			}
		}
		return page;
	}

	/**
	 * 计算自定义上下文查询条件
	 *
	 * @return
	 */
	protected static String calcSearchCond(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query) {
		List<ISearchCond> items = iSearchContext.getSearchConds();
		if (items != null) {
			// 附加 PREDEFINED 转换条件
			List<ISearchCond> predefinedConds = items.stream().filter(searchCond -> searchCond instanceof SearchPredefinedCond).collect(Collectors.toList());
			predefinedConds.stream().forEach(searchCond -> {
				if (searchCond instanceof SearchPredefinedCond) {
					ISearchCond predefinedCond = parsePredefinedCond(iDataEntityRuntime, ((SearchPredefinedCond) searchCond).getPredefinedCond());
					if (predefinedCond != null)
						items.add(predefinedCond);
				}
			});
			calcSearchCondRootItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.AND, items);

		}
		return query.getSqlSegment();
	}

	/**
	 * 直出SQL语句
	 *
	 * @param iDataEntityRuntime
	 * @param iDEDataQueryCodeRuntime
	 * @param iSearchContext
	 * @param query
	 * @param params
	 * @return
	 */
	public static String calcSqlSearchCond(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, List params) {
		String strSql = MybatisSqlUtil.calcSearchCond(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query);
		Pattern bracketPattern = Pattern.compile("(\\#\\{.*?\\})");
		Matcher matcher = bracketPattern.matcher(strSql);
		while (matcher.find()) {
			String key = matcher.group();
			strSql = strSql.replace(key, "?");
			key = key.substring(key.indexOf(".MPGENVAL")).replace(".", "").replace("}", "");
			if (query.getParamNameValuePairs() != null && query.getParamNameValuePairs().containsKey(key)) {
				params.add(query.getParamNameValuePairs().get(key));
			} else {
				params.add(null);
			}
		}
		return strSql;
	}

	/**
	 * 计算查询过滤条件 根的SearchConds为AND条件
	 *
	 * @param query
	 * @param items
	 */
	protected static void calcSearchCondRootItems(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, String groupMode, List<ISearchCond> items) {
		//int i = 0;
		for (ISearchCond iSearchCond : items) {
			switch (iSearchCond.getCondType()) {
				case ISearchCond.CONDTYPE_GROUP:
					searchCondGroup(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.AND, (ISearchGroupCond) iSearchCond);
					break;
				case ISearchCond.CONDTYPE_DEFIELD:
					searchDEField(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, (ISearchFieldCond) iSearchCond);
					break;
				case ISearchCond.CONDTYPE_CUSTOM:
					ISearchCustomCond iSearchCustomCond = (ISearchCustomCond)iSearchCond;
					if(StringUtils.hasLength(iSearchCustomCond.getCustomType())) {
						//获取自定义解析器
						IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, iSearchCustomCond.getCustomType());
						if(iDEDQSQLCustomCondParser == null) {
							throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", iSearchCustomCond.getCustomType()));
						}
						
						String strRealCustomCond = null;
						try {
							strRealCustomCond = iDEDQSQLCustomCondParser.parse(iSearchCustomCond, iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
						}
						catch (Throwable ex) {
							throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", iSearchCustomCond.getCustomCond(), ex.getMessage()), ex);
						}
						
						query.apply(strRealCustomCond);
					}
					else {
						query.apply(((ISearchCustomCond) iSearchCond).getCustomCond());
					}
					
					break;
				case ISearchCond.CONDTYPE_PREDEFINED:
					// ((ISearchPredefinedCond) iSearchCond).getPredefinedType();
					// query.apply(((ISearchPredefinedCond)
					// iSearchCond).getPredefinedCond());
					// String strPredefinedCond = ((ISearchPredefinedCond)
					// iSearchCond).getPredefinedCond();
					// Matcher matcher = bracketPattern.matcher(strPredefinedCond);
					// if (matcher.find()) {
					// strPredefinedCond = matcher.group().substring(1,
					// matcher.group().length() - 1);
					// } else {
					// throw new RuntimeException(String.format("scope解析错误:%s",
					// strPredefinedCond));
					// }
					//
					// //提取
					// Stack<String> conditions = new Stack<>();
					// matcher = conditionPattern.matcher(strPredefinedCond);
					// while (matcher.find()) {
					// conditions.push(matcher.group());
					// }
					break;
			}
			//i++;
		}
	}

	/**
	 * 检查过滤条件
	 *
	 * @param query
	 * @param items
	 */
	protected static boolean checkSearchCondItems(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, String groupMode, List<ISearchCond> items, boolean bTryMode) {
		boolean bValidflag = false;
		for (ISearchCond iSearchCond : items) {
			switch (iSearchCond.getCondType()) {
				case ISearchCond.CONDTYPE_GROUP:
					bValidflag = bValidflag||checkCondGroup(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, (ISearchGroupCond) iSearchCond);
					break;
				case ISearchCond.CONDTYPE_CUSTOM:
					bValidflag = bValidflag||true;
					break;
				case ISearchCond.CONDTYPE_PREDEFINED:
					bValidflag = bValidflag||true;
					break;
				case ISearchCond.CONDTYPE_ITEMS:
					bValidflag = bValidflag||true;
					break;
				case ISearchCond.CONDTYPE_DEFIELD:
					bValidflag = bValidflag||checkDEField(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, (ISearchFieldCond) iSearchCond);
					break;
				default:
					if (!bTryMode) {
						throw new RuntimeException(String.format("未支持的条件类型[%1$s]", iSearchCond.getCondType()));
					}else {
						return false;
					}
			}
		}
		return bValidflag;
	}

	/**
	 * 计算过滤条件
	 *
	 * @param query
	 * @param items
	 */
	protected static void calcSearchCondItems(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, String groupMode, List<ISearchCond> items) {
		int i = 0;
		for (ISearchCond iSearchCond : items) {
			if (i > 0) {
				if (groupMode.equals(Conditions.OR)) {
					query.or();
				}
			}
			switch (iSearchCond.getCondType()) {
				case ISearchCond.CONDTYPE_GROUP:
					searchCondGroup(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, groupMode, (ISearchGroupCond) iSearchCond);
					break;
				case ISearchCond.CONDTYPE_DEFIELD:
					searchDEField(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, (ISearchFieldCond) iSearchCond);
					break;
				case ISearchCond.CONDTYPE_CUSTOM:
					ISearchCustomCond iSearchCustomCond = (ISearchCustomCond)iSearchCond;
					if(StringUtils.hasLength(iSearchCustomCond.getCustomType())) {
						//获取自定义解析器
						IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, iSearchCustomCond.getCustomType());
						if(iDEDQSQLCustomCondParser == null) {
							throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", iSearchCustomCond.getCustomType()));
						}
						
						String strRealCustomCond = null;
						try {
							strRealCustomCond = iDEDQSQLCustomCondParser.parse(iSearchCustomCond, iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
						}
						catch (Throwable ex) {
							throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", iSearchCustomCond.getCustomCond(), ex.getMessage()), ex);
						}
						
						query.apply(strRealCustomCond);
					}
					else {
						query.apply(((ISearchCustomCond) iSearchCond).getCustomCond());
					}
					break;
				case ISearchCond.CONDTYPE_PREDEFINED:
					// ((ISearchPredefinedCond) iSearchCond).getPredefinedType();
					// query.apply(((ISearchPredefinedCond)
					// iSearchCond).getPredefinedCond());
					// String strPredefinedCond = ((ISearchPredefinedCond)
					// iSearchCond).getPredefinedCond();
					// Matcher matcher = bracketPattern.matcher(strPredefinedCond);
					// if (matcher.find()) {
					// strPredefinedCond = matcher.group().substring(1,
					// matcher.group().length() - 1);
					// } else {
					// throw new RuntimeException(String.format("scope解析错误:%s",
					// strPredefinedCond));
					// }
					//
					// //提取
					// Stack<String> conditions = new Stack<>();
					// matcher = conditionPattern.matcher(strPredefinedCond);
					// while (matcher.find()) {
					// conditions.push(matcher.group());
					// }
					break;
				case ISearchCond.CONDTYPE_ITEMS:
					searchItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, (ISearchItemsCond) iSearchCond);
					break;
				default:
					throw new RuntimeException(String.format("未支持的条件类型[%1$s]", iSearchCond.getCondType()));
			}
			i++;
		}
	}

	public static ISearchCond parsePredefinedCond(net.ibizsys.runtime.dataentity.IDataEntityRuntime dataEntityRuntime, String strPredefinedCond) {
		ISearchCond searchCond = null;
		Stack<Object> conditions_in = new Stack<>();
		Pattern bracketPattern = Pattern.compile("\\[(.*?)]");
		Matcher matcher = bracketPattern.matcher(strPredefinedCond);
		if (matcher.find()) {
			strPredefinedCond = matcher.group().substring(1, matcher.group().length() - 1);
		} else {
			throw new RuntimeException(String.format("scope解析错误:%s", strPredefinedCond));
		}

		// 提取
		Stack<String> conditions = new Stack<>();
		Pattern conditionPattern = Pattern.compile("\\'\\|\\'|\\'\\&\\'|\\([^\\)]+\\)");
		matcher = conditionPattern.matcher(strPredefinedCond);
		while (matcher.find()) {
			conditions.push(matcher.group());
		}

		if (conditions.size() >= 3) {
			searchCond = convertPredefinedCond(dataEntityRuntime, conditions, conditions_in);
		}

		if (conditions.size() == 1) {
			searchCond = parseTerm(dataEntityRuntime, conditions.pop());
		}
		return searchCond;
	}

	/**
	 * @param operations
	 * @param conditions
	 * @return
	 */
	private static ISearchCond convertPredefinedCond(net.ibizsys.runtime.dataentity.IDataEntityRuntime dataEntityRuntime, Stack<String> operations, Stack<Object> conditions) {
		while (operations.size() > 0) {
			String operation = operations.pop();
			if (operation.equals(OPERATION_AND) || operation.equals(OPERATION_OR)) {
				ISearchCond terms = parseTerms(dataEntityRuntime, operation, conditions.pop(), conditions.pop());
				conditions.add(0, terms);
				if (operations.size() == 0)
					return terms;
			} else {
				conditions.push(operation);
			}
		}
		return null;
	}

	private static ISearchCond parseTerms(net.ibizsys.runtime.dataentity.IDataEntityRuntime dataEntityRuntime, String operation, Object condition, Object condition2) {
		SearchGroupCond groupCond = new SearchGroupCond();
		if (operation.equals(OPERATION_OR))
			groupCond.setCondOp(Conditions.OR);
		if (operation.equals(OPERATION_AND))
			groupCond.setCondOp(Conditions.AND);
		List<ISearchCond> childSearchConds = new ArrayList<>();
		if (condition instanceof String) {
			childSearchConds.add(parseTerm(dataEntityRuntime, condition.toString()));
		} else if (condition instanceof ISearchCond) {
			childSearchConds.add((ISearchCond) condition);
		}
		if (condition2 instanceof String) {
			childSearchConds.add(parseTerm(dataEntityRuntime, condition2.toString()));
		} else if (condition2 instanceof ISearchCond) {
			childSearchConds.add((ISearchCond) condition2);
		}
		groupCond.setSearchConds(childSearchConds);
		return groupCond;
	}

	/**
	 * 条件转换
	 *
	 * @param condition
	 */
	private static ISearchCond parseTerm(net.ibizsys.runtime.dataentity.IDataEntityRuntime iDataEntityRuntime, String condition) {
		Pattern p1 = Pattern.compile("\'(.*?)\'");
		Matcher m = p1.matcher(condition);
		List<String> argList = new ArrayList<>();
		while (m.find()) {
			argList.add(m.group());
		}
		if (argList.size() == 1) {
			argList.add(0, condition.split(",")[0].replace("(", ""));
		}
		if (argList.size() == 2) {
			argList.add(condition.split(",")[2].replace(")", ""));
		}
		String[] args = argList.toArray(new String[argList.size()]);
		if (args.length != 3)
			throw new RuntimeException(String.format("字段条件解析错误:%s", args.toString()));
		String strFieldQueryExp = args[0].replace("'", "").trim();
		// if
		// (!ObjectUtils.isEmpty(iDataEntityRuntime.getFieldQueryExp(strFieldQueryExp)))
		// strFieldQueryExp =
		// iDataEntityRuntime.getFieldQueryExp(strFieldQueryExp);
		Object fieldValue = args[2].replace("'", "").trim();
		SearchFieldCond searchFieldCond = new SearchFieldCond();
		searchFieldCond.setFieldName(strFieldQueryExp);
		searchFieldCond.setValue(fieldValue);
		if (String.valueOf(fieldValue).startsWith("#{")) {
			searchFieldCond.setParamMode(true);
		}
		if (args[1].trim().equals(TERM_OPERATOR_EQ)) {
			if ("false".equalsIgnoreCase(args[2].trim().replace("'", ""))) {
				searchFieldCond.setCondOp(Conditions.ISNULL);
			} else if ("true".equalsIgnoreCase(args[2].trim().replace("'", ""))) {
				searchFieldCond.setCondOp(Conditions.ISNOTNULL);
			} else {
				searchFieldCond.setCondOp(Conditions.EQ);
			}
		} else if (args[1].trim().equals(TERM_OPERATOR_NE)) {
			if ("false".equalsIgnoreCase(args[2].trim().replace("'", ""))) {
				searchFieldCond.setCondOp(Conditions.ISNOTNULL);
			}
			if ("true".equalsIgnoreCase(args[2].trim().replace("'", ""))) {
				searchFieldCond.setCondOp(Conditions.ISNULL);
			} else {
				searchFieldCond.setCondOp(Conditions.NOTEQ);
			}
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_GT)) {
			searchFieldCond.setCondOp(Conditions.GT);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_GE)) {
			searchFieldCond.setCondOp(Conditions.GTANDEQ);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_LT)) {
			searchFieldCond.setCondOp(Conditions.LT);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_LE)) {
			searchFieldCond.setCondOp(Conditions.LTANDEQ);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_IN)) {
			searchFieldCond.setCondOp(Conditions.IN);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_NOTIN)) {
			searchFieldCond.setCondOp(Conditions.NOTIN);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_LIKE)) {
			searchFieldCond.setCondOp(Conditions.LIKE);
		} else if (args[1].trim().equalsIgnoreCase(TERM_OPERATOR_NOTLIKE)) {
			// searchFieldCond.setCondOp(Conditions.L);
		}

		return searchFieldCond;
	}

	/**
	 * 检查分组支持
	 *
	 * @param query
	 * @param cond
	 */
	protected static boolean checkCondGroup(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, ISearchGroupCond cond) {
		List<ISearchCond> items = cond.getSearchConds();
		if (!ObjectUtils.isEmpty(items)) {
			return checkSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.AND, items,true);
		}
		return true;
	}

	/**
	 * 查询分组支持
	 *
	 * @param query
	 * @param cond
	 */
	protected static void searchCondGroup(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, String groupMode, ISearchGroupCond cond) {
		List<ISearchCond> items = cond.getSearchConds();
		if (!ObjectUtils.isEmpty(items)) {
			switch (cond.getCondOp()) {
				case Conditions.AND:
					if (!checkSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.AND, items, true)) {
						calcSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.AND, items);
						return;
					}
					break;
				case Conditions.OR:
					if (!checkSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.OR, items, true)) {
						calcSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, query, Conditions.OR, items);
						return;
					}
					break;
			}
			Consumer customer = new Consumer<QueryWrapper<Object>>() {
				@Override
				public void accept(QueryWrapper<Object> objectQueryWrapper) {
					switch (cond.getCondOp()) {
						case Conditions.AND:
							objectQueryWrapper.and(new Consumer<QueryWrapper<Object>>() {
								@Override
								public void accept(QueryWrapper<Object> subQuery) {
									calcSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, subQuery, Conditions.AND, items);
								}
							});
							break;
						case Conditions.OR:
							objectQueryWrapper.or(new Consumer<QueryWrapper<Object>>() {
								@Override
								public void accept(QueryWrapper<Object> subQuery) {
									calcSearchCondItems(iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, subQuery, Conditions.OR, items);
								}
							});
							break;
					}
				}
			};

			if (Conditions.AND.equals(groupMode)) {
				query.and(customer);
			} else if (Conditions.OR.equals(groupMode)) {
				query.or(customer);
			}
		}
	}

	/**
	 * 检查查询条件项
	 *
	 * @param query
	 * @param cond
	 */
	protected static boolean checkDEField(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, ISearchFieldCond cond) {
		String column = cond.getFieldName();
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(column, true);
		if (iPSDEField == null){
			if (ObjectUtils.isEmpty(cond.getValue())) {
				log.warn(String.format("指定属性[%1$s]不存在，忽略条件[%1$s %2$s]", column, cond.getCondOp()));
			} else {
				log.warn(String.format("指定属性[%1$s]不存在，忽略条件[%1$s %2$s %3$s]", column, cond.getCondOp(), cond.getValue()));
			}
			return false;
		}

		boolean bExistsCond = Conditions.EXISTS.equals(cond.getCondOp()) || Conditions.NOTEXISTS.equals(cond.getCondOp());

		int nDEFType = iPSDEField.getDEFType();
		if (nDEFType != DEFTypes.PHISICAL && nDEFType != DEFTypes.FORMULA && nDEFType != DEFTypes.LINK) {
			if (!bExistsCond) {
				return false;
			}
		}

		IPSDEFSearchMode existPSDEFSearchMode = null;
		if (bExistsCond) {
			if(StringUtils.hasLength(cond.getSource())) {
				existPSDEFSearchMode = iDataEntityRuntime.getPSDEFSearchMode(cond.getSource(), true);
			}
			else {
				List<IPSDEFSearchMode> psDEFSearchModes = iPSDEField.getAllPSDEFSearchModes();
				if (!ObjectUtils.isEmpty(psDEFSearchModes)) {
					for (IPSDEFSearchMode iPSDEFSearchMode : psDEFSearchModes) {
						if(iPSDEFSearchMode.getDstPSDEFSearchMode() != null) {
							continue;
						}
						if (cond.getCondOp().equals(iPSDEFSearchMode.getValueOP())) {
							existPSDEFSearchMode = iPSDEFSearchMode;
							break;
						}
					}
				}
			}
			
			if (existPSDEFSearchMode == null) {
				log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]不存在", column, cond.getCondOp()));
				return false;
			} else {
				IPSDERBase existPSDEFDER = existPSDEFSearchMode.getPSDER();
				if (existPSDEFDER == null) {
					if(DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType())){
						existPSDEFDER = ((IPSPickupObjectDEField) iPSDEField).getPSDER();
					}
					else
						if(DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())){
							existPSDEFDER = ((IPSPickupDEField) iPSDEField).getPSDER();
						}
					if(existPSDEFDER == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接关系", column, cond.getCondOp()));
						return false;
					}
				}
				if (existPSDEFDER instanceof IPSDER1N) {
					if (((IPSDER1N) existPSDEFDER).getPSPickupDEField() == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接属性", column, cond.getCondOp()));
						return false;
					}
				} else if (existPSDEFDER instanceof IPSDERCustom) {
					if (((IPSDERCustom) existPSDEFDER).getPickupPSDEField() == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接属性", column, cond.getCondOp()));
						return false;
					}
				}
				if (existPSDEFSearchMode.getDstPSDEField() == null) {
					log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定条件属性", column, cond.getCondOp()));
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 添加查询条件项
	 *
	 * @param query
	 * @param cond
	 */
	protected static void searchDEField(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, ISearchFieldCond cond) {
		String column = cond.getFieldName();
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(column, true);
		if (iPSDEField == null) {
			if (ObjectUtils.isEmpty(cond.getValue())) {
				log.warn(String.format("指定属性[%1$s]不存在，忽略条件[%1$s %2$s]", column, cond.getCondOp()));
			} else {
				log.warn(String.format("指定属性[%1$s]不存在，忽略条件[%1$s %2$s %3$s]", column, cond.getCondOp(), cond.getValue()));
			}

			return;
		}

		boolean bExistsCond = Conditions.EXISTS.equals(cond.getCondOp()) || Conditions.NOTEXISTS.equals(cond.getCondOp());

		int nDEFType = iPSDEField.getDEFType();
		if (nDEFType != DEFTypes.PHISICAL && nDEFType != DEFTypes.FORMULA && nDEFType != DEFTypes.LINK) {
			if (!bExistsCond) {
				return;
			}
		}

		IPSDEFSearchMode existPSDEFSearchMode = null;
		if (!bExistsCond) {
			if (iDEDataQueryCodeRuntime != null) {
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(column, true);
				if (iPSDEDataQueryCodeExp != null) {
					column = iPSDEDataQueryCodeExp.getExpression();
				} else {
					if (!ObjectUtils.isEmpty(iDataEntityRuntime.getFieldQueryExp(column))) {
						column = iDataEntityRuntime.getFieldQueryExp(column);
					}
				}
			} else {
				if (!ObjectUtils.isEmpty(iDataEntityRuntime.getFieldQueryExp(column))) {
					column = iDataEntityRuntime.getFieldQueryExp(column);
				}
			}
		} else {
			if(StringUtils.hasLength(cond.getSource())) {
				existPSDEFSearchMode = iDataEntityRuntime.getPSDEFSearchMode(cond.getSource(), true);
			}
			else {
				List<IPSDEFSearchMode> psDEFSearchModes = iPSDEField.getAllPSDEFSearchModes();
				if (!ObjectUtils.isEmpty(psDEFSearchModes)) {
					for (IPSDEFSearchMode iPSDEFSearchMode : psDEFSearchModes) {
						if(iPSDEFSearchMode.getDstPSDEFSearchMode()!=null) {
							continue;
						}
						if (cond.getCondOp().equals(iPSDEFSearchMode.getValueOP())) {
							existPSDEFSearchMode = iPSDEFSearchMode;
							break;
						}
					}
				}
			}
			
			if (existPSDEFSearchMode == null) {
				log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]不存在", column, cond.getCondOp()));
				return;
			} else {
				IPSDERBase existPSDEFDER = existPSDEFSearchMode.getPSDER();
				if (existPSDEFDER == null) {
					if(DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType())){
						existPSDEFDER = ((IPSPickupObjectDEField) iPSDEField).getPSDER();
					}
					else
						if(DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())){
							existPSDEFDER = ((IPSPickupDEField) iPSDEField).getPSDER();
						}
					if(existPSDEFDER == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接关系", column, cond.getCondOp()));
						return;
					}
				}
				if (existPSDEFDER instanceof IPSDER1N) {
					if (((IPSDER1N) existPSDEFDER).getPSPickupDEField() == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接属性", column, cond.getCondOp()));
						return;
					}
				} else if (existPSDEFDER instanceof IPSDERCustom) {
					if (((IPSDERCustom) existPSDEFDER).getPickupPSDEField() == null) {
						log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定连接属性", column, cond.getCondOp()));
						return;
					}
				}
				if (existPSDEFSearchMode.getDstPSDEField() == null) {
					log.warn(String.format("指定属性[%1$s]搜索模式[%2$s]未指定条件属性", column, cond.getCondOp()));
					return;
				}
			}
		}

		Object val = cond.getValue();
		if (cond.isParamMode()) {
			if (String.valueOf(val).startsWith("#{ctx.session") || String.valueOf(val).startsWith("#{srf.session")) {
				val = String.valueOf(val).replace("#", "").replace("{", "").replace("}", "");
				val = UserContext.getCurrent().getSessionParam(String.valueOf(val).split("\\.")[2].trim());
			} else {
				// 查询条件 数据类型,IN|NOTIN类型不参与类型转化防止出现错误
				if (iPSDEField != null && !Conditions.IN.equals(cond.getCondOp()) && !Conditions.NOTIN.equals(cond.getCondOp())) {
					try {
						val = iDataEntityRuntime.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), String.valueOf(iSearchContext.get((String) val)));
					} catch (Exception e) {
						val = iSearchContext.get((String) val);
					}
				} else {
					val = iSearchContext.get((String) val);
				}
			}
		}
		switch (cond.getCondOp()) {
			// 等于
			case Conditions.EQ:
				query.eq(column, val);
				break;
			// 不等于
			case Conditions.NOTEQ:
				query.ne(column, val);
				break;
			// 大于
			case Conditions.GT:
				query.gt(column, val);
				break;
			// 大于等于
			case Conditions.GTANDEQ:
				query.ge(column, val);
				break;
			// 小于
			case Conditions.LT:
				query.lt(column, val);
				break;
			// 小于等于
			case Conditions.LTANDEQ:
				query.le(column, val);
				break;
			// 为空
			case Conditions.ISNULL:
				query.isNull(column);
				break;
			// 不为空
			case Conditions.ISNOTNULL:
				query.isNotNull(column);
				break;
			// 文本包含
			case Conditions.LIKE:
			case Conditions.USERLIKE:
				if (isSearchIgnoreCase()) {
					column = String.format("UPPER(%s)", column);
					if (val != null)
						val = String.valueOf(val).toUpperCase();
				}
				query.like(column, val);
				break;
			// 值在范围中
			case Conditions.IN:
				if (cond.isParamMode()) {
					query.in(column, formatINorNotInParam(cond, val));
				} else {
					query.inSql(column, formatStringCondParamValue(cond,val));
				}
				break;
			// 值不在范围中
			case Conditions.NOTIN:
				if (cond.isParamMode()) {
					query.notIn(column, formatINorNotInParam(cond, val));
				} else {
					query.notInSql(column, formatStringCondParamValue(cond,val));
				}
				break;
			// 文本左包含
			case Conditions.LEFTLIKE:
				if (isSearchIgnoreCase()) {
					column = String.format("UPPER(%s)", column);
					if (val != null)
						val = String.valueOf(val).toUpperCase();
				}
				query.likeRight(column, val);
				break;
			// 文本右包含
			case Conditions.RIGHTLIKE:
				if (isSearchIgnoreCase()) {
					column = String.format("UPPER(%s)", column);
					if (val != null)
						val = String.valueOf(val).toUpperCase();
				}
				query.likeLeft(column, val);
				break;
			case Conditions.EXISTS:
			case Conditions.NOTEXISTS:
				// query.ex
				// query.ex
				String strKeyExpCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(iDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();
				String strSql = "";
				if(DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType()) || DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())){
					IDataEntityRuntime itemDataEntityRuntime = null;
					IPSDEDataSet itemPSDEDataSet = null;
					IPSDEField joinPSDEField = null;
					IPSDERBase iPSDERBase = null;
					IPSDERCustom iPSDERCustom = null;
					if(DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType())) {
						IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEField;
						iPSDERBase = iPSPickupObjectDEField.getPSDER();
					}
					else if(DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())) {
						IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSDEField;
						iPSDERBase = iPSPickupDEField.getPSDER();
					}
					
					if (iPSDERBase == null) {
						throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", cond.getName(), cond.getFieldName()));
					}
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
						itemPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
					}else if (iPSDERBase instanceof IPSDERCustom) {
						iPSDERCustom = (IPSDERCustom) iPSDERBase;
						itemPSDEDataSet = iPSDERCustom.getRefPSDEDataSet();
						joinPSDEField = iPSDERCustom.getPickupPSDEField();
					}
					itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
					if (itemPSDEDataSet == null) {
						itemPSDEDataSet = itemDataEntityRuntime.getDefaultPSDEDataSet();
					}

					List<IPSDEDataQuery> psDEDataQueryList = itemPSDEDataSet.getPSDEDataQueries();
					if (ObjectUtils.isEmpty(psDEDataQueryList)) {
						throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系数据集未包含查询", cond.getName(), cond.getFieldName()));
					}

					IDEDataQueryCodeRuntime itemDEDataQueryCodeRuntime = itemDataEntityRuntime.getDEDataQueryCodeRuntime(psDEDataQueryList.get(0), iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getDBType(), false);
					String strSubQueryIdExp = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(itemDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();

					StringBuilder sb = new StringBuilder();
					IPSDEDataQueryCode curDBPSDEDataQueryCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCode();
					// 重新编译SQL
					String strQueryCode = null;
					try {
						Select select = (Select) CCJSqlParserUtil.parse(curDBPSDEDataQueryCode.getQueryCode());
						select.getSelectBody().accept(new SelectVisitorAdapter() {
							@Override
							public void visit(PlainSelect plainSelect) {
								plainSelect.getSelectItems().clear();
								try {
									plainSelect.getSelectItems().add(new SelectExpressionItem(CCJSqlParserUtil.parseExpression(strSubQueryIdExp)));
								} catch (JSQLParserException ex) {
									log.error(ex);
								}
							}
						});

						strQueryCode = select.toString();
					} catch (JSQLParserException ex) {
						log.error(ex);
						strQueryCode = curDBPSDEDataQueryCode.getQueryCode();
					}

					sb.append(strQueryCode);
					// 查询模型 自身条件
					boolean bOutputWhere = false;
					boolean bCondFirst = true;
					if (curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds() != null) {
						for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
							String strCondition = queryCodeCond.getCustomCond();
							if (!StringUtils.hasLength(strCondition)) {
								continue;
							}
							
							if(StringUtils.hasLength(queryCodeCond.getCustomType())) {
								IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
								if(iDEDQSQLCustomCondParser == null) {
									throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
								}
								
								try {
									strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext,iSearchContext!=null?iSearchContext.any():null);
								}
								catch (Throwable ex) {
									throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
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

					QueryWrapper<Object> subQuery = new QueryWrapper<Object>();

					// 判断进一步附加子类型条件
					if (iPSDERCustom != null) {
						IPSDEField parentTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, itemDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
						IPSDEField parentSubTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
						String strParentType = null;
						String strParentSubType = null;
						if(parentTypePSDEField != null) {
							strParentType =iPSDERCustom.getParentType();
							if(!StringUtils.hasLength(strParentType)) {
								//strParentType = iDataEntityRuntime.getName();
								strParentType = iDataEntityRuntime.getDERParentType();
							}
						}
						if (parentSubTypePSDEField != null) {
							strParentSubType = iPSDERCustom.getParentSubType();
							if (!StringUtils.hasLength(strParentSubType)) {
								strParentSubType = iPSDERBase.getMinorCodeName();
							}
						}
						if (parentTypePSDEField != null) {
							String strParentTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentTypePSDEField.getName(), false).getExpression();
							subQuery.eq(strParentTypeCode, strParentType);
						}
						if (parentSubTypePSDEField != null) {
							String strParentSubTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentSubTypePSDEField.getName(), false).getExpression();
							if (StringUtils.hasLength(strParentSubType)) {
								try {
									subQuery.eq(strParentSubTypeCode, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
								} catch (Exception ex) {
									log.error(ex);
									subQuery.eq(strParentSubTypeCode, strParentSubType);
								}
							} else {
								subQuery.isNull(strParentSubTypeCode);
							}
						}
					}
					List<ISearchCond> items = new ArrayList<>();
					SearchFieldCond majorSearchFiledCond = new SearchFieldCond();
					majorSearchFiledCond.setFieldName(existPSDEFSearchMode.getDstPSDEFieldMust().getName());
					majorSearchFiledCond.setCondOp(existPSDEFSearchMode.getDstPSDEFSearchModeMust().getValueOP());
					majorSearchFiledCond.setValue(val);
					majorSearchFiledCond.setParamMode(false);
					items.add(majorSearchFiledCond);
					calcSearchCondItems(itemDataEntityRuntime, itemDEDataQueryCodeRuntime, iSearchContext, subQuery, Conditions.AND, items);

					String strCondition = subQuery.getSqlSegment();
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
						sb.append(String.format("(%1$s)", strCondition));
					}

					strKeyExpCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(joinPSDEField.getName(), false).getExpression();
					try {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(itemDataEntityRuntime.getKeyPSDEField().getName()), strKeyExpCode);
					} catch (Throwable ex) {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s ", sb.toString(), itemDataEntityRuntime.getKeyPSDEField().getName(), strKeyExpCode);
					}

					// 替换变量
					if (!ObjectUtils.isEmpty(subQuery.getParamNameValuePairs())) {
						String strParamName = "q" + KeyValueUtils.genUniqueId();
						strSql = strSql.replace("ew.paramNameValuePairs.MPGENVAL", "ew.paramNameValuePairs." + strParamName);
						for (java.util.Map.Entry<String, Object> entry : subQuery.getParamNameValuePairs().entrySet()) {
							String strNewKey = entry.getKey().replace("MPGENVAL", strParamName);
							query.getParamNameValuePairs().put(strNewKey, entry.getValue());
						}
					}
				}else {
					IPSDataEntity minorPSDataEntity = existPSDEFSearchMode.getPSDERMust().getMinorPSDataEntityMust();
					IPSDEField pickupPSDEField = null;
					if (existPSDEFSearchMode.getPSDERMust() instanceof IPSDER1N) {
						pickupPSDEField = ((IPSDER1N) existPSDEFSearchMode.getPSDERMust()).getPSPickupDEFieldMust();
					} else if (existPSDEFSearchMode.getPSDERMust() instanceof IPSDERCustom) {
						pickupPSDEField = ((IPSDERCustom) existPSDEFSearchMode.getPSDERMust()).getPickupPSDEFieldMust();
					}
					IDBDialect iDBDialect = iDEDataQueryCodeRuntime.getDBDialect();
					IDataEntityRuntime minorDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getId(), false);
					try {
						strSql = String.format("SELECT 1 FROM %1$s WHERE %2$s = %1$s.%3$s", iDBDialect.getDBObjStandardName(minorDataEntityRuntime.getTableName()), strKeyExpCode, iDBDialect.getDBObjStandardName(pickupPSDEField.getName()));
					} catch (Throwable ex) {
						throw new RuntimeException(String.format("拼合从数据[%1$s]存在条件发生异常，%2$s", minorDataEntityRuntime.getName(), ex.getMessage()), ex);
					}

					List list = null;
					if (cond.isParamMode()) {
						val = formatINorNotInParam(cond, val);
					}
					if (val instanceof String && !StringUtils.isEmpty(val)) {
						list = Arrays.asList(((String) val).split("[,|;|\\|]"));
					} else if (val instanceof List) {
						list = (List) val;
					}
					
					if(existPSDEFSearchMode.getDstPSDEFSearchMode() == null) {
						
						strSql += String.format(" AND %1$s.%2$s ", minorDataEntityRuntime.getTableName(), existPSDEFSearchMode.getDstPSDEFieldMust().getName());
						
						boolean bVarchar = DataTypeUtils.isStringDataType(existPSDEFSearchMode.getDstPSDEFieldMust().getStdDataType());
						if (ObjectUtils.isEmpty(list)) {
							strSql += " IS NOT NULL";
						} else {
							strSql += " IN (";
							boolean bFirst = true;
							
							for (Object item : list) {
								if (bFirst) {
									bFirst = false;
								} else {
									strSql += ",";
								}
								if (item == null) {
									strSql += "NULL";
								} else {
									if (bVarchar) {
										strSql += String.format("'%1$s'", item.toString().replace("'", "''"));
									} else {
										strSql += item.toString();
									}
								}
							}
							strSql += ")";
						}
					}
					else {
					
						Object realValue = null;
						switch(existPSDEFSearchMode.getDstPSDEFSearchMode().getValueOP()) {
						case Conditions.IN:
						case Conditions.NOTIN:
							realValue = list;
							break;
						default:
							if(!ObjectUtils.isEmpty(list)) {
								realValue = list.get(0);
							}
							break;
						}
						
						try {
							String strCondition = iDEDataQueryCodeRuntime.getDBDialect().getConditionSQL(
									String.format("%1$s.%2$s", minorDataEntityRuntime.getTableName(), existPSDEFSearchMode.getDstPSDEFieldMust().getName())	
									, existPSDEFSearchMode.getDstPSDEFieldMust().getStdDataType(), existPSDEFSearchMode.getDstPSDEFSearchMode().getValueOP(), realValue, false, null);
							strSql += String.format(" AND %1$s", strCondition);
						}
						catch (Throwable ex) {
							throw new RuntimeException(String.format("获取子项条件[%1$s]发生异常，%2$s", cond.getName(), ex.getMessage()), ex);
						}
						
					}
				}
				if (Conditions.EXISTS.equals(cond.getCondOp())) {
					query.exists(true, strSql);
				} else {
					query.notExists(true, strSql);
				}
				break;
			default:
				throw new RuntimeException(String.format("未支持的条件操作[%1$s]", cond.getCondOp()));
		}
	}

	/**
	 * 子项条件支持
	 *
	 * @param query
	 * @param cond
	 */
	protected static void searchItems(IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, QueryWrapper<Object> query, ISearchItemsCond cond) {

		// 尝试获取子项属性
		if (!StringUtils.hasLength(cond.getFieldName())) {
			throw new RuntimeException(String.format("子项条件[%1$s]未指定属性名称", cond.getName()));
		}

		// 尝试获取属性
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(cond.getFieldName(), true);
		if (iPSDEField == null) {
			// 后续考虑支持嵌套属性集合
			throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]不存在", cond.getName(), cond.getFieldName()));
		}

		IDataEntityRuntime itemDataEntityRuntime = null;
		IPSDEDataSet itemPSDEDataSet = null;
		IPSDEField joinPSDEField = null;
		IPSDERBase iPSDERBase = null;
		IPSDERCustom iPSDERCustom = null;
		boolean bMinorMode = false;
		// 更加属性类型进行操作
		if (DEFDataType.ONE2MANYDATA.value.equals(iPSDEField.getDataType()) || DEFDataType.ONE2MANYDATA_MAP.value.equals(iPSDEField.getDataType())) {
			IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField) iPSDEField;
			iPSDERBase = iPSOne2ManyDataDEField.getPSDER();
			if (iPSDERBase == null) {
				throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", cond.getName(), cond.getFieldName()));
			}

			itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
			bMinorMode = true;
			// 获取连接数据集
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				itemPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
				joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
			} else if (iPSDERBase instanceof IPSDERCustom) {
				iPSDERCustom = (IPSDERCustom) iPSDERBase;
				itemPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
				joinPSDEField = iPSDERCustom.getPickupPSDEField();
			}
		} else if (DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType())) {
			IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEField;
			iPSDERBase = iPSPickupObjectDEField.getPSDER();
			if (iPSDERBase == null) {
				throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", cond.getName(), cond.getFieldName()));
			}

			itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
			bMinorMode = false;
			// 获取连接数据集
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
				itemPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
			}else if (iPSDERBase instanceof IPSDERCustom) {
				iPSDERCustom = (IPSDERCustom) iPSDERBase;
				itemPSDEDataSet = iPSDERCustom.getRefPSDEDataSet();
				joinPSDEField = iPSDERCustom.getPickupPSDEField();
			}
		} else if (DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())) {
			IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSDEField;
			iPSDERBase = iPSPickupDEField.getPSDER();
			if (iPSDERBase == null) {
				throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", cond.getName(), cond.getFieldName()));
			}

			itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
			bMinorMode = false;
			// 获取连接数据集
			if (iPSDERBase instanceof IPSDER1N) {
				IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
				joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
				itemPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
			}else if (iPSDERBase instanceof IPSDERCustom) {
				iPSDERCustom = (IPSDERCustom) iPSDERBase;
				itemPSDEDataSet = iPSDERCustom.getRefPSDEDataSet();
				joinPSDEField = iPSDERCustom.getPickupPSDEField();
			}
		}
			
		

		if (joinPSDEField == null) {
			throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]无法获取连接属性", cond.getName(), cond.getFieldName()));
		}

		if (itemPSDEDataSet == null) {
			itemPSDEDataSet = itemDataEntityRuntime.getDefaultPSDEDataSet();
		}

		List<IPSDEDataQuery> psDEDataQueryList = itemPSDEDataSet.getPSDEDataQueries();
		if (ObjectUtils.isEmpty(psDEDataQueryList)) {
			throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系数据集未包含查询", cond.getName(), cond.getFieldName()));
		}

		IDEDataQueryCodeRuntime itemDEDataQueryCodeRuntime = itemDataEntityRuntime.getDEDataQueryCodeRuntime(psDEDataQueryList.get(0), iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getDBType(), false);
		// 判断操作
		switch (cond.getCondOp()) {
			// // 等于
			// case Conditions.EQ:
			// query.eq(column, val);
			// break;
			// // 不等于
			// case Conditions.NOTEQ:
			// query.ne(column, val);
			// break;
			// // 大于
			// case Conditions.GT:
			// query.gt(column, val);
			// break;
			// // 大于等于
			// case Conditions.GTANDEQ:
			// query.ge(column, val);
			// break;
			// // 小于
			// case Conditions.LT:
			// query.lt(column, val);
			// break;
			// // 小于等于
			// case Conditions.LTANDEQ:
			// query.le(column, val);
			// break;
			// // 为空
			// case Conditions.ISNULL:
			// query.isNull(column);
			// break;
			// // 不为空
			// case Conditions.ISNOTNULL:
			// query.isNotNull(column);
			// break;
			// // 文本包含
			// case Conditions.LIKE:
			// case Conditions.USERLIKE:
			// if (isSearchIgnoreCase()) {
			// column = String.format("UPPER(%s)", column);
			// if (val != null)
			// val = String.valueOf(val).toUpperCase();
			// }
			// query.like(column, val);
			// break;
			// // 值在范围中
			// case Conditions.IN:
			// if (cond.isParamMode()) {
			// query.in(column, formatINorNotInParam(cond, val));
			// } else {
			// query.inSql(column, String.valueOf(val));
			// }
			// break;
			// // 值不在范围中
			// case Conditions.NOTIN:
			// if (cond.isParamMode()) {
			// query.notIn(column, formatINorNotInParam(cond, val));
			// } else {
			// query.notInSql(column, String.valueOf(val));
			// }
			// break;
			// // 文本左包含
			// case Conditions.LEFTLIKE:
			// if (isSearchIgnoreCase()) {
			// column = String.format("UPPER(%s)", column);
			// if (val != null)
			// val = String.valueOf(val).toUpperCase();
			// }
			// query.likeRight(column, val);
			// break;
			// // 文本右包含
			// case Conditions.RIGHTLIKE:
			// if (isSearchIgnoreCase()) {
			// column = String.format("UPPER(%s)", column);
			// if (val != null)
			// val = String.valueOf(val).toUpperCase();
			// }
			// query.likeLeft(column, val);
			// break;
			case Conditions.EXISTS:
			case Conditions.NOTEXISTS:
				String strSubQueryIdExp = bMinorMode ? itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(joinPSDEField.getName(), false).getExpression() : itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(itemDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();

				StringBuilder sb = new StringBuilder();
				IPSDEDataQueryCode curDBPSDEDataQueryCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCode();
				// 重新编译SQL
				String strQueryCode = null;
				try {
					Select select = (Select) CCJSqlParserUtil.parse(curDBPSDEDataQueryCode.getQueryCode());
					select.getSelectBody().accept(new SelectVisitorAdapter() {
						@Override
						public void visit(PlainSelect plainSelect) {
							plainSelect.getSelectItems().clear();
							try {
								plainSelect.getSelectItems().add(new SelectExpressionItem(CCJSqlParserUtil.parseExpression(strSubQueryIdExp)));
							} catch (JSQLParserException ex) {
								log.error(ex);
							}
						}
					});

					strQueryCode = select.toString();
				} catch (JSQLParserException ex) {
					log.error(ex);
					strQueryCode = curDBPSDEDataQueryCode.getQueryCode();
				}

				sb.append(strQueryCode);
				// 查询模型 自身条件
				boolean bOutputWhere = false;
				boolean bCondFirst = true;
				if (curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds() != null) {
					for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
						String strCondition = queryCodeCond.getCustomCond();
						if (!StringUtils.hasLength(strCondition)) {
							continue;
						}
						
						if(StringUtils.hasLength(queryCodeCond.getCustomType())) {
							IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
							if(iDEDQSQLCustomCondParser == null) {
								throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
							}
							
							try {
								strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), iDEDataQueryCodeRuntime.getDBDialect(), iDEDataQueryCodeRuntime.getDataEntityRuntime(), iDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
							}
							catch (Throwable ex) {
								throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
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

				QueryWrapper<Object> subQuery = new QueryWrapper<Object>();

				// 判断进一步附加子类型条件
				if (bMinorMode && iPSDERCustom != null) {
					IPSDEField parentTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, itemDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
					IPSDEField parentSubTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
					String strParentType = null;
					String strParentSubType = null;
					if(parentTypePSDEField != null) {
						strParentType = iPSDERCustom.getParentType();
						if(!StringUtils.hasLength(strParentType)) {
							//strParentType = iDataEntityRuntime.getName();
							strParentType = iDataEntityRuntime.getDERParentType();
						}
					}
					if (parentSubTypePSDEField != null) {
						strParentSubType = iPSDERCustom.getParentSubType();
						if (!StringUtils.hasLength(strParentSubType)) {
							strParentSubType = iPSDERBase.getMinorCodeName();
						}
					}
					if (parentTypePSDEField != null) {
						String strParentTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentTypePSDEField.getName(), false).getExpression();
						subQuery.eq(strParentTypeCode, strParentType);
					}
					if (parentSubTypePSDEField != null) {
						String strParentSubTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentSubTypePSDEField.getName(), false).getExpression();
						if (StringUtils.hasLength(strParentSubType)) {
							try {
								subQuery.eq(strParentSubTypeCode, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
							} catch (Exception ex) {
								log.error(ex);
								subQuery.eq(strParentSubTypeCode, strParentSubType);
							}
						} else {
							subQuery.isNull(strParentSubTypeCode);
						}
					}
				}

				List<ISearchCond> items = cond.getSearchConds();
				if (!ObjectUtils.isEmpty(items)) {
					calcSearchCondItems(itemDataEntityRuntime, itemDEDataQueryCodeRuntime, iSearchContext, subQuery, Conditions.AND, items);
				}

				String strCondition = subQuery.getSqlSegment();
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
					sb.append(String.format("(%1$s)", strCondition));
				}

				//

				String strSql;
				if (bMinorMode) {

					String strKeyExpCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(iDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();
					try {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(joinPSDEField.getName()), strKeyExpCode);
					} catch (Throwable ex) {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), joinPSDEField.getName(), strKeyExpCode);
					}
				} else {

					String strKeyExpCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(joinPSDEField.getName(), false).getExpression();

					try {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(itemDataEntityRuntime.getKeyPSDEField().getName()), strKeyExpCode);
					} catch (Throwable ex) {
						strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDataEntityRuntime.getKeyPSDEField().getName(), strKeyExpCode);
					}
				}

				// 替换变量
				if (!ObjectUtils.isEmpty(subQuery.getParamNameValuePairs())) {
					String strParamName = "q" + KeyValueUtils.genUniqueId();
					strSql = strSql.replace("ew.paramNameValuePairs.MPGENVAL", "ew.paramNameValuePairs." + strParamName);
					for (java.util.Map.Entry<String, Object> entry : subQuery.getParamNameValuePairs().entrySet()) {
						String strNewKey = entry.getKey().replace("MPGENVAL", strParamName);
						query.getParamNameValuePairs().put(strNewKey, entry.getValue());
					}
				}

				if (Conditions.EXISTS.equalsIgnoreCase(cond.getCondOp())) {
					query.exists(strSql);
				} else {
					query.notExists(strSql);
				}

				break;
			default:
				throw new RuntimeException(String.format("子项条件[%1$s]条件操作[%2$s]未支持", cond.getName(), cond.getFieldName()));
		}

		return;
	}

	/**
	 * 格式化 in or notIn 的参数处理
	 *
	 * @param val
	 * @return
	 */
	protected static Collection formatINorNotInParam(ISearchFieldCond cond, Object val) {
		if (val instanceof Collection && CollectionUtils.isNotEmpty((Collection) val)) {
			return (Collection) val;
		}
		if (val instanceof String && !StringUtils.isEmpty(val)) {
			String[] list = ((String) val).split("[,|;|\\|]");
			return Arrays.asList(list);
		}
		List empty = new ArrayList();
		empty.add(null);
		return empty;
	}

	public static void genGroupCondition(StringBuffer strCond, IDataEntityRuntime iDataEntityRuntime, String strDBType, ISearchContext iSearchContext, ISearchCond cond) throws Throwable {
		if (cond instanceof ISearchFieldCond) {
			SearchFieldCond searchFieldCond = (SearchFieldCond) cond;
			String condition = iDataEntityRuntime.getSystemRuntime().getDBDialect(strDBType).getConditionSQL(searchFieldCond.getFieldName(), iDataEntityRuntime.getPSDEField(searchFieldCond.getFieldName()).getStdDataType(), searchFieldCond.getCondOp(), searchFieldCond.isParamMode() ? iSearchContext.get(String.valueOf(searchFieldCond.getValue())) : searchFieldCond.getValue(), false, iSearchContext);
			strCond.append(condition);
		} else if (cond instanceof ISearchGroupCond) {
			ISearchGroupCond searchGroupCond = (ISearchGroupCond) cond;
			List<ISearchCond> childConds = searchGroupCond.getSearchCondsIf();
			if (CollectionUtils.isNotEmpty(childConds)) {
				strCond.append("(");
				for (int i = 0; i < childConds.size(); i++) {
					if (i > 0)
						strCond.append(" " + searchGroupCond.getCondOp() + " ");
					genGroupCondition(strCond, iDataEntityRuntime, strDBType, iSearchContext, childConds.get(i));
				}
				strCond.append(")");
			}
		} else if (cond instanceof ISearchCustomCond) {
			ISearchCustomCond iSearchCustomCond = (ISearchCustomCond) cond;
			
			if(StringUtils.hasLength(iSearchCustomCond.getCustomType())) {
				//获取自定义解析器
				IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, iSearchCustomCond.getCustomType());
				if(iDEDQSQLCustomCondParser == null) {
					throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", iSearchCustomCond.getCustomType()));
				}
				
				String strRealCustomCond = null;
				try {
					IDBDialect iDBDialect =	iDataEntityRuntime.getSystemRuntime().getDBDialect(strDBType);
					strRealCustomCond = iDEDQSQLCustomCondParser.parse(iSearchCustomCond, iDBDialect, iDataEntityRuntime, null, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
				}
				catch (Throwable ex) {
					throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", iSearchCustomCond.getCustomCond(), ex.getMessage()), ex);
				}
				
				strCond.append(strRealCustomCond);
			}
			else {
				strCond.append(iSearchCustomCond.getCustomCond());
			}
		}
		else 
			if (cond instanceof ISearchItemsCond) {
				ISearchItemsCond iSearchItemsCond = (ISearchItemsCond) cond;
				// 尝试获取子项属性
				if (!StringUtils.hasLength(iSearchItemsCond.getFieldName())) {
					throw new RuntimeException(String.format("子项条件[%1$s]未指定属性名称", iSearchItemsCond.getName()));
				}

				// 尝试获取属性
				IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(iSearchItemsCond.getFieldName(), true);
				if (iPSDEField == null) {
					// 后续考虑支持嵌套属性集合
					throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]不存在", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
				}

				IDataEntityRuntime itemDataEntityRuntime = null;
				IPSDEDataSet itemPSDEDataSet = null;
				IPSDEField joinPSDEField = null;
				IPSDERBase iPSDERBase = null;
				IPSDERCustom iPSDERCustom = null;
				boolean bMinorMode = false;
				// 更加属性类型进行操作
				if (DEFDataType.ONE2MANYDATA.value.equals(iPSDEField.getDataType()) || DEFDataType.ONE2MANYDATA_MAP.value.equals(iPSDEField.getDataType())) {
					IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField) iPSDEField;
					iPSDERBase = iPSOne2ManyDataDEField.getPSDER();
					if (iPSDERBase == null) {
						throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
					}

					itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
					bMinorMode = true;
					// 获取连接数据集
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						itemPSDEDataSet = iPSDER1N.getNestedPSDEDataSet();
						joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
					} else if (iPSDERBase instanceof IPSDERCustom) {
						iPSDERCustom = (IPSDERCustom) iPSDERBase;
						itemPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
						joinPSDEField = iPSDERCustom.getPickupPSDEField();
					}
				} else if (DEFDataType.PICKUPOBJECT.value.equals(iPSDEField.getDataType())) {
					IPSPickupObjectDEField iPSPickupObjectDEField = (IPSPickupObjectDEField) iPSDEField;
					iPSDERBase = iPSPickupObjectDEField.getPSDER();
					if (iPSDERBase == null) {
						throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
					}

					itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
					bMinorMode = false;
					// 获取连接数据集
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
						itemPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
					}else if (iPSDERBase instanceof IPSDERCustom) {
						iPSDERCustom = (IPSDERCustom) iPSDERBase;
						itemPSDEDataSet = iPSDERCustom.getRefPSDEDataSet();
						joinPSDEField = iPSDERCustom.getPickupPSDEField();
					}
				} else if (DEFDataType.PICKUP.value.equals(iPSDEField.getDataType())) {
					IPSPickupDEField iPSPickupDEField = (IPSPickupDEField) iPSDEField;
					iPSDERBase = iPSPickupDEField.getPSDER();
					if (iPSDERBase == null) {
						throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系不存在", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
					}

					itemDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId());
					bMinorMode = false;
					// 获取连接数据集
					if (iPSDERBase instanceof IPSDER1N) {
						IPSDER1N iPSDER1N = (IPSDER1N) iPSDERBase;
						joinPSDEField = iPSDER1N.getPSPickupDEFieldMust();
						itemPSDEDataSet = iPSDER1N.getRefPSDEDataSet();
					}else if (iPSDERBase instanceof IPSDERCustom) {
						iPSDERCustom = (IPSDERCustom) iPSDERBase;
						itemPSDEDataSet = iPSDERCustom.getRefPSDEDataSet();
						joinPSDEField = iPSDERCustom.getPickupPSDEField();
					}
				}
					
				

				if (joinPSDEField == null) {
					throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]无法获取连接属性", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
				}

				if (itemPSDEDataSet == null) {
					itemPSDEDataSet = itemDataEntityRuntime.getDefaultPSDEDataSet();
				}

				List<IPSDEDataQuery> psDEDataQueryList = itemPSDEDataSet.getPSDEDataQueries();
				if (ObjectUtils.isEmpty(psDEDataQueryList)) {
					throw new RuntimeException(String.format("子项条件[%1$s]指定属性[%2$s]关系数据集未包含查询", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
				}

				IDEDataQueryCodeRuntime itemDEDataQueryCodeRuntime = itemDataEntityRuntime.getDEDataQueryCodeRuntime(psDEDataQueryList.get(0), strDBType, false);
				// 判断操作
				switch (iSearchItemsCond.getCondOp()) {
					
					case Conditions.EXISTS:
					case Conditions.NOTEXISTS:
						String strSubQueryIdExp = bMinorMode ? itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(joinPSDEField.getName(), false).getExpression() : itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(itemDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();

						StringBuilder sb = new StringBuilder();
						IPSDEDataQueryCode curDBPSDEDataQueryCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCode();
						// 重新编译SQL
						String strQueryCode = null;
						try {
							Select select = (Select) CCJSqlParserUtil.parse(curDBPSDEDataQueryCode.getQueryCode());
							select.getSelectBody().accept(new SelectVisitorAdapter() {
								@Override
								public void visit(PlainSelect plainSelect) {
									plainSelect.getSelectItems().clear();
									try {
										plainSelect.getSelectItems().add(new SelectExpressionItem(CCJSqlParserUtil.parseExpression(strSubQueryIdExp)));
									} catch (JSQLParserException ex) {
										log.error(ex);
									}
								}
							});

							strQueryCode = select.toString();
						} catch (JSQLParserException ex) {
							log.error(ex);
							strQueryCode = curDBPSDEDataQueryCode.getQueryCode();
						}

						sb.append(strQueryCode);
						
						IDBDialect iDBDialect =	iDataEntityRuntime.getSystemRuntime().getDBDialect(strDBType);
						
						// 查询模型 自身条件
						boolean bOutputWhere = false;
						boolean bCondFirst = true;
						if (curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds() != null) {
							for (IPSDEDataQueryCodeCond queryCodeCond : curDBPSDEDataQueryCode.getPSDEDataQueryCodeConds()) {
								String strCondition = queryCodeCond.getCustomCond();
								if (!StringUtils.hasLength(strCondition)) {
									continue;
								}
								
								if(StringUtils.hasLength(queryCodeCond.getCustomType())) {
									IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDataEntityRuntime.getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, queryCodeCond.getCustomType());
									if(iDEDQSQLCustomCondParser == null) {
										throw new RuntimeException(String.format("无法获取指定[%1$s]自定义SQL条件解析器", queryCodeCond.getCustomType()));
									}
									
									try {
										strCondition = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(strCondition), itemDEDataQueryCodeRuntime.getDBDialect(), itemDEDataQueryCodeRuntime.getDataEntityRuntime(), itemDEDataQueryCodeRuntime, iSearchContext, iSearchContext!=null?iSearchContext.any():null);
									}
									catch (Throwable ex) {
										throw new RuntimeException(String.format("解析自定义条件[%1$s]发生异常，%2$s", queryCodeCond.getCustomCond(), ex.getMessage()), ex);
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

						QueryWrapper<Object> subQuery = new QueryWrapper<Object>();

						// 判断进一步附加子类型条件
						if (bMinorMode && iPSDERCustom != null) {
							IPSDEField parentTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE.value, itemDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
							IPSDEField parentSubTypePSDEField = itemDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE.value, true);
							String strParentType = null;
							String strParentSubType = null;
							if(parentTypePSDEField != null) {
								strParentType = iPSDERCustom.getParentType();
								if(!StringUtils.hasLength(strParentType)) {
									//strParentType = iDataEntityRuntime.getName();
									strParentType = iDataEntityRuntime.getDERParentType();
								}
							}
							if (parentSubTypePSDEField != null) {
								strParentSubType = iPSDERCustom.getParentSubType();
								if (!StringUtils.hasLength(strParentSubType)) {
									strParentSubType = iPSDERBase.getMinorCodeName();
								}
							}
							if (parentTypePSDEField != null) {
								String strParentTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentTypePSDEField.getName(), false).getExpression();
								subQuery.eq(strParentTypeCode, strParentType);
							}
							if (parentSubTypePSDEField != null) {
								String strParentSubTypeCode = itemDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(parentSubTypePSDEField.getName(), false).getExpression();
								if (StringUtils.hasLength(strParentSubType)) {
									try {
										subQuery.eq(strParentSubTypeCode, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
									} catch (Exception ex) {
										log.error(ex);
										subQuery.eq(strParentSubTypeCode, strParentSubType);
									}
								} else {
									subQuery.isNull(strParentSubTypeCode);
								}
							}
						}

						List<ISearchCond> items = iSearchItemsCond.getSearchConds();
						if (!ObjectUtils.isEmpty(items)) {
							calcSearchCondItems(itemDataEntityRuntime, itemDEDataQueryCodeRuntime, iSearchContext, subQuery, Conditions.AND, items);
						}

						String strCondition = subQuery.getSqlSegment();
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
							sb.append(String.format("(%1$s)", strCondition));
						}

						//

						String strSql;
						if (bMinorMode) {

							String strKeyExpCode = iDBDialect.getDBObjStandardName(iDataEntityRuntime.getKeyPSDEField().getName());
							try {
								strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(joinPSDEField.getName()), strKeyExpCode);
							} catch (Throwable ex) {
								strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), joinPSDEField.getName(), strKeyExpCode);
							}
						} else {

							String strKeyExpCode = iDBDialect.getDBObjStandardName(joinPSDEField.getName());

							try {
								strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(itemDataEntityRuntime.getKeyPSDEField().getName()), strKeyExpCode);
							} catch (Throwable ex) {
								strSql = String.format("select 1 from (%1$s) s where s.%2$s = %3$s", sb.toString(), itemDataEntityRuntime.getKeyPSDEField().getName(), strKeyExpCode);
							}
						}

						// 替换变量
						if (!ObjectUtils.isEmpty(subQuery.getParamNameValuePairs())) {
							String strParamName = "q" + KeyValueUtils.genUniqueId();
							strSql = strSql.replace("ew.paramNameValuePairs.MPGENVAL", "ew.paramNameValuePairs." + strParamName);
							for (java.util.Map.Entry<String, Object> entry : subQuery.getParamNameValuePairs().entrySet()) {
								String strNewKey = entry.getKey().replace("MPGENVAL", strParamName);
								//query.getParamNameValuePairs().put(strNewKey, entry.getValue());
								String strValueExpression = null;
								if(entry.getValue() instanceof String) {
									strValueExpression = String.format("'%1$s'", entry.getValue().toString().replace("'", "''"));
								}
								else {
									strValueExpression = entry.getValue().toString();
								}
								strSql = strSql.replace(String.format("#{ew.paramNameValuePairs.%1$s}", strNewKey), strValueExpression);
							}
						}

						if (Conditions.EXISTS.equalsIgnoreCase(iSearchItemsCond.getCondOp())) {
							//query.exists(strSql);
							strCond.append(String.format("EXISTS(%1$s)", strSql));
						} else {
							//query.notExists(strSql);
							strCond.append(String.format("NOT EXISTS(%1$s)", strSql));
						}

						break;
					default:
						throw new RuntimeException(String.format("子项条件[%1$s]条件操作[%2$s]未支持", iSearchItemsCond.getName(), iSearchItemsCond.getFieldName()));
				}

			}
	}

	public static boolean isSearchIgnoreCase() {
		return searchIgnoreCase;
	}

	public static void setSearchIgnoreCase(boolean searchIgnoreCase) {
		MybatisSqlUtil.searchIgnoreCase = searchIgnoreCase;
	}

	/**
	 * 执行sql转化, 支持mybatis mapper.xml语法
	 *
	 * @param sql
	 * @param parameter
	 * @param sqlSession
	 * @return
	 * @throws Exception
	 */
	public static String convertSQL(String sql, Map<String, Object> parameter, SqlSession sqlSession) throws Exception {
		String sqlstr;
		MappedStatement mappedStatement;
		parameter.put("ctx", parameter);
		try {
			if (hasDynamicTag(sql)) {
				sql = convertDynamicSQL(sql);
			} else {
				sql = StringEscapeUtils.escapeXml11(sql);
			}
			String sqlmd5 = DigestUtils.md5DigestAsHex(sql.getBytes());
			Configuration configuration = sqlSession.getConfiguration();
			String mappedStatementName = String.format("DynamicSqlConvert.%1$s", sqlmd5);
			StringInputStream inputStream = new StringInputStream("<?xml version=\"1.0\" encoding=\"UTF-8\" ?> <!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\" > <mapper> <select id=\"" + sqlmd5 + "\" resultType=\"java.util.Map\">" + sql + "</select> </mapper>");
			XPathParser parser = new XPathParser(inputStream, true, configuration.getVariables(), new XMLMapperEntityResolver());
			XNode node = parser.evalNode("/mapper").evalNodes("select").get(0);
			if (configuration.getMappedStatementNames().contains(mappedStatementName)) {
				// 取消全局注册的sql异常校验避免出现错误导致全部无法查询
				mappedStatement = configuration.getMappedStatement(mappedStatementName, false);
			} else {
				MapperBuilderAssistant mapperBuilderAssistant = new MapperBuilderAssistant(configuration, inputStream.toString());
				mapperBuilderAssistant.setCurrentNamespace("DynamicSqlConvert");
				XMLStatementBuilder xmlStatementBuilder = new XMLStatementBuilder(configuration, mapperBuilderAssistant, node, null);
				xmlStatementBuilder.parseStatementNode();
				mappedStatement = configuration.getMappedStatement(mappedStatementName, false);
			}
			SqlSource sqlSource = mappedStatement.getSqlSource();
			boolean dynamic = MybatisSqlUtil.isDynamicSql(node);
			if (dynamic == true) {
				Field rootSqlNode = DynamicSqlSource.class.getDeclaredField("rootSqlNode");
				rootSqlNode.setAccessible(true);
				SqlNode sqlNode = (SqlNode) rootSqlNode.get(sqlSource);
				DynamicContext context = new DynamicContext(configuration, parameter);
				sqlNode.apply(context);
				sqlstr = context.getSql();
			} else {
				sqlstr = sql;
			}
			sqlstr = StringEscapeUtils.unescapeXml(sqlstr);
		} catch (Exception e) {
			log.error(String.format("sql转化错误，%1$s", e.getMessage()), e);
			throw new Exception("sql转化错误");
		}
		return sqlstr;
	}

	/**
	 * 判断是否为动态sql
	 *
	 * @param node
	 * @return
	 */
	public static boolean isDynamicSql(XNode node) {
		boolean isDynamic = false;
		NodeList children = node.getNode().getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			XNode child = node.newXNode(children.item(i));
			if (child.getNode().getNodeType() == Node.CDATA_SECTION_NODE || child.getNode().getNodeType() == Node.TEXT_NODE) {
				String data = child.getStringBody("");
				TextSqlNode textSqlNode = new TextSqlNode(data);
				if (textSqlNode.isDynamic()) {
					isDynamic = true;
				}
			} else if (child.getNode().getNodeType() == Node.ELEMENT_NODE) {
				isDynamic = true;
			}
		}
		return isDynamic;
	}

	/**
	 * 判断是否含动态标签
	 *
	 * @param text
	 * @return
	 */
	public static boolean hasDynamicTag(String text) {
		return DYNAMIC_TAG_PATTERN.matcher(text).find();
	}

	public static String convertDynamicSQL(String sql) {
		String[] keys = { "___SRF001___", "___SRF002___", "___SRF003___", "___SRF004___", "___SRF005___", "___SRF006___" };
		String[] values = { "<choose>", "<otherwise>", "</choose>", "</when>", "</otherwise>", "</if>" };
		Pattern mybatiswhenpattern = Pattern.compile("(<when.*?>)");
		Pattern mybatisifpattern = Pattern.compile("(<if.*?>)");
		sql = org.apache.commons.lang3.StringUtils.replaceEach(sql, values, keys);
		Matcher matcher = mybatiswhenpattern.matcher(sql);
		Matcher matcher2 = mybatisifpattern.matcher(sql);
		LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
		while (matcher.find()) {
			String match = matcher.group(1);
			int hash = match.hashCode();
			hashMap.put("___SRF" + hash + "___", match);
		}
		while (matcher2.find()) {
			String match = matcher2.group(1);
			int hash = match.hashCode();
			hashMap.put("___SRF" + hash + "___", match);
		}
		String[] StrMatchkeys = hashMap.keySet().toArray(new String[0]);
		String[] StrMatchValues = hashMap.values().toArray(new String[0]);
		sql = org.apache.commons.lang3.StringUtils.replaceEach(sql, StrMatchValues, StrMatchkeys);
		sql = StringEscapeUtils.escapeXml11(sql);
		sql = org.apache.commons.lang3.StringUtils.replaceEach(sql, StrMatchkeys, StrMatchValues);
		sql = org.apache.commons.lang3.StringUtils.replaceEach(sql, keys, values);
		return sql;
	}

	/**
	 * 转换文本条件参数
	 *
	 * @param cond
	 * @param val
	 * @return
	 */
	public static String formatStringCondParamValue(ISearchFieldCond cond ,Object val) {
		String convertedVal = "";
		switch (cond.getCondOp()) {
			case Conditions.IN:
			case Conditions.NOTIN:
				String[] items = null;
				String ignorePattern = "^'[^']*'$";
				Pattern compiledPattern = Pattern.compile(ignorePattern);
				if(val instanceof List) {
					List list = (List) val;
					items = new String[list.size()];
					for(int i=0; i<list.size(); i++) {
						items[i] = DataTypeUtils.getStringValue(list.get(i), "").replace("'", "''");;
					}
				} else {
					String strValue = DataTypeUtils.getStringValue(val, "");
					items = strValue.split("[,|;]");
				}
				for (int i = 0; i < items.length; i++) {
					if (i != 0) convertedVal += ",";
					Matcher matcher = compiledPattern.matcher(items[i]);
					if (matcher.matches()) {
						convertedVal +=  items[i];
					}else {
						convertedVal += String.format("'%1$s'", items[i].replace("'", "''"));
					}
				}
		}
		return convertedVal;
	}
}
