package net.ibizsys.central.bi;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.bi.util.BISearchContext;
import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.bi.util.IBISearchDimension;
import net.ibizsys.central.bi.util.IBISearchMeasure;
import net.ibizsys.central.bi.util.IBISearchPeriod;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.DEDQSQLCustomCondParserBase;
import net.ibizsys.central.dataentity.ds.IDEDQSQLCustomCondParser;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelEnums.BIDimensionType;
import net.ibizsys.model.bi.IPSSysBICubeDimension;
import net.ibizsys.model.bi.IPSSysBICubeMeasure;
import net.ibizsys.model.bi.IPSSysBIHierarchy;
import net.ibizsys.model.bi.IPSSysBILevel;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.SearchCustomCond;

public class SysBIDrillDetailDEDQSQLCustomCondParser extends DEDQSQLCustomCondParserBase {

	private static final Log log = LogFactory.getLog(SysBIDrillDetailDEDQSQLCustomCondParser.class);

	@Override
	protected String onParse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params, Set<String> columnList) throws Throwable {

		if (iDEDataQueryCodeRuntime == null) {
			throw new Exception("未传入实体查询代码运行时对象");
		}

		if (iSearchContext == null) {
			throw new Exception("未传入搜索上下文对象");
		}

		BISearchContext iBISearchContext = new BISearchContext(iSearchContext);

		String strBICubeMeasureTag = null;
		String strConditions  = null;
		int nPos = iSearchCustomCond.getCustomCond().indexOf("$");
		if (nPos == -1) {
			strBICubeMeasureTag = iSearchCustomCond.getCustomCond();
		}
		else {
			strBICubeMeasureTag = iSearchCustomCond.getCustomCond().substring(0, nPos);
			strConditions = iSearchCustomCond.getCustomCond().substring(nPos + 1);
		}

		Map<String, String> conditions = queryString2Map(strConditions, true);

		String[] items= strBICubeMeasureTag.split("[.]");
		if(items.length < 2) {
			throw new Exception(String.format("指定智能立方体标识无效[%1$s]", strBICubeMeasureTag));
		}
		
		ISysBISchemeRuntime iSysBISchemeRuntime = iDEDataQueryCodeRuntime.getDataEntityRuntime().getSystemRuntime().getSysBISchemeRuntime(items[0], false);
		ISysBICubeRuntime iSysBICubeRuntime = iSysBISchemeRuntime.getSysBICubeRuntime(items[1], false);
		
		//ISysBICubeCalculatedDimensionParser iSysBICubeCalculatedDimensionParser = iDEDataQueryCodeRuntime.getDataEntityRuntime().getSystemRuntime().getRuntimeObject(ISysBICubeCalculatedDimensionParser.class, "SQL");
		IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser = iDEDataQueryCodeRuntime.getDataEntityRuntime().getSystemRuntime().getRuntimeObject(IDEDQSQLCustomCondParser.class, "PQL");
		
		//放入条件
		List<String> list = new ArrayList<String>();
		
		if(items.length >= 3) {
			IPSSysBICubeMeasure iPSSysBICubeMeasure = iSysBICubeRuntime.getPSSysBICubeMeasure(items[2], false);
			IBISearchMeasure iBISearchMeasure = BISearchContext.getBISearchMeasure(iBISearchContext, items[2], true);
			if(StringUtils.hasLength(iPSSysBICubeMeasure.getDrillDetailCustomCond())) {
				String strCustomCond = iDEDQSQLCustomCondParser.parse(SearchCustomCond.of(iPSSysBICubeMeasure.getDrillDetailCustomCond()), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchMeasure!=null?iBISearchMeasure.getParam():null);
				list.add(strCustomCond);
			}
		}
		
		if(!ObjectUtils.isEmpty(iBISearchContext.getBISearchDimensions())) {
			for(IBISearchDimension iBISearchDimension : iBISearchContext.getBISearchDimensions()) {
				IPSSysBICubeDimension iPSSysBICubeDimension = iSysBICubeRuntime.getPSSysBICubeDimension(iBISearchDimension.getName(), false);
				String strValue = conditions.get(iBISearchDimension.getName().toLowerCase());
				String strCustomCond = getDimensionCustomCond(iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iDEDQSQLCustomCondParser, iSysBICubeRuntime, iBISearchContext, iBISearchDimension, iPSSysBICubeDimension, strValue, conditions);
				list.add(strCustomCond);
			}
		}
		
		if(ObjectUtils.isEmpty(list)) {
			return SearchCustomCond.TRUE;
		}
		
		return StringUtils.collectionToDelimitedString(list, " AND ");
	}
	
	protected String getDimensionCustomCond(IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, IDEDQSQLCustomCondParser iDEDQSQLCustomCondParser, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, IBISearchDimension iBISearchDimension, IPSSysBICubeDimension iPSSysBICubeDimension, String strValue, Map<String, String> conditions) throws Throwable {
		IPSDEField iPSDEField = iPSSysBICubeDimension.getPSDEField();

		if(iPSSysBICubeDimension.getPSSysBIDimension() == null) {
			//常规维度
			if(BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				if(iPSDEField == null) {
					throw new Exception(String.format("维度[%1$s]未指定属性", iPSSysBICubeDimension.getName()));
				}
				
				if(iBISearchDimension.getPeriod() != null) {
					IBISearchPeriod iBISearchPeriod = iBISearchDimension.getPeriod();
					String strUnit = iBISearchPeriod.getUnit();
					String strType = iBISearchPeriod.getType();
					
					if(!IBISearchPeriod.TYPE_STATIC.equals(strType)
							&& !IBISearchPeriod.TYPE_DYNAMIC.equals(strType)){
						throw new Exception(String.format("周期类型[%1$s]不支持", strType));
					}
					
					//Set<String> columnList = new LinkedHashSet<String>();
					if(IBISearchPeriod.UNIT_DAY.equals(strUnit)) {
						return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( String.format("DATEFORMAT(%1$s, '%%Y%%m%%d')", iPSDEField.getName())), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
					}
					else
						if(IBISearchPeriod.UNIT_WEEK.equals(strUnit)) {
							return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( String.format("YEARWEEKCHAR(%1$s)", iPSDEField.getName())), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
						}
						else
							if(IBISearchPeriod.UNIT_MONTH.equals(strUnit)) {
								return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( String.format("DATEFORMAT(%1$s, '%%Y%%m')", iPSDEField.getName())), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
						}
							else
								if(IBISearchPeriod.UNIT_QUARTER.equals(strUnit)) {
									return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( String.format("YEARQUARTERCHAR(%1$s)", iPSDEField.getName())), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
								}
								else
									if(IBISearchPeriod.UNIT_YEAR.equals(strUnit)) {
										return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( String.format("DATEFORMAT(%1$s, '%%Y')", iPSDEField.getName())), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
									}
									else
										throw new Exception(String.format("无法识别的单位[%1$s]", strUnit));
				}
				
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp =iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(iPSDEField.getName(), true);
				if(iPSDEDataQueryCodeExp != null) {
					if(StringUtils.hasLength(strValue)) {
						return iDBDialect.getConditionSQL(iPSDEDataQueryCodeExp.getExpression(), iPSDEField.getStdDataType(), Conditions.EQ, strValue, false, null);
					}
					else {
						return iDBDialect.getConditionSQL(iPSDEDataQueryCodeExp.getExpression(), iPSDEField.getStdDataType(), Conditions.ISNULL, null, false, null);
					}
				}
				else {
					if(StringUtils.hasLength(strValue)) {
						return iDBDialect.getConditionSQL(iPSDEField.getName(), iPSDEField.getStdDataType(), Conditions.EQ, strValue, false, null);
					}
					else {
						return iDBDialect.getConditionSQL(iPSDEField.getName(), iPSDEField.getStdDataType(), Conditions.ISNULL, null, false, null);
					}
				}
				
			}
			else
				if(BIDimensionType.CALCULATED.value.equals(iPSSysBICubeDimension.getDimensionType())) {
					return String.format("%1$s = '%2$s'", iDEDQSQLCustomCondParser.parse(SearchCustomCond.of( iPSSysBICubeDimension.getDimensionFormula()), iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iBISearchContext.getSearchContext(), iBISearchDimension.getParam()), strValue);
				}
				else
					throw new Exception(String.format("未支持的维度类型[%1$s]", iPSSysBICubeDimension.getDimensionType()));
		}
		else {
			//引用维度
			String strHierarchy = iBISearchDimension.getHierarchy();
			IPSSysBIHierarchy iPSSysBIHierarchy = null;
			List<IPSSysBIHierarchy> list = iPSSysBICubeDimension.getPSSysBIDimension().getAllPSSysBIHierarchies();
			if(!ObjectUtils.isEmpty(list)) {
				for(IPSSysBIHierarchy item : list) {
					if(StringUtils.hasLength(strHierarchy)) {
						if(strHierarchy.equalsIgnoreCase(item.getCodeName())) {
							iPSSysBIHierarchy = item;
							break;
						}
					}
					else {
						iPSSysBIHierarchy = item;
						break;
					}
				}
			}
			
			if(iPSSysBIHierarchy == null) {
				throw new Exception(String.format("无法获取指定维度层次体系[%1$s]", strHierarchy));
			}
			
			Set<IPSSysBILevel> selectedPSSysBILevelList = new LinkedHashSet<IPSSysBILevel>();
			//默认放入唯一值
			List<IPSSysBILevel> psSysBILevelList = iPSSysBIHierarchy.getAllPSSysBILevels();
			if(!ObjectUtils.isEmpty(psSysBILevelList)) {
				for(IPSSysBILevel item : psSysBILevelList) {
					if(item.isUniqueMembers()) {
						selectedPSSysBILevelList.add(item);
					}
					else {
						if(!ObjectUtils.isEmpty(iBISearchDimension.getLevels())) {
							for(String strLevel : iBISearchDimension.getLevels()) {
								if(strLevel.equalsIgnoreCase(item.getCodeName())){
									selectedPSSysBILevelList.add(item);
									break;
								}
							}
						}
					}
				}
			}

			String strKeyCode = "";
			//常规维度
			if(BIDimensionType.COMMON.value.equals(iPSSysBICubeDimension.getDimensionType())) {
				IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(iPSSysBICubeDimension.getPSDEFieldMust().getName(), false);
				strKeyCode = iPSDEDataQueryCodeExp.getExpression();
			}
			else
//				if(BIDimensionType.CALCULATED.value.equals(iPSSysBICubeDimension.getDimensionType())) {
//					String strFormula = this.dimensionFormulaMap.get(iPSSysBICubeDimension.getCodeName());
//					Set<String> columnList = this.dimensionFormulaFieldListMap.get(iPSSysBICubeDimension.getCodeName());
//					if(!StringUtils.hasLength(strFormula)) {
//						columnList = new LinkedHashSet<String>();
//						strFormula = this.getSysBICubeCalculatedDimensionParser(false).parse(iPSSysBICubeDimension, this, iBISearchContext, columnList);
//						this.dimensionFormulaMap.put(iPSSysBICubeDimension.getCodeName(), strFormula);
//						this.dimensionFormulaFieldListMap.put(iPSSysBICubeDimension.getCodeName(), columnList);
//					}
//					strKeyCode = strFormula;
//				}
//				else
					throw new Exception(String.format("未支持的维度类型[%1$s]", iPSSysBICubeDimension.getDimensionType()));
//			
			IDataEntityRuntime biHierarchyDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(iPSSysBIHierarchy.getPSDataEntityMust().getId());
			
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("SELECT 1 FROM %1$s %2$s WHERE (%3$s= %2$s.%4$s)", 
					iDBDialect.getDBObjStandardName(biHierarchyDataEntityRuntime.getTableName())
					,iDBDialect.getDBObjStandardName(iPSSysBICubeDimension.getCodeName().toLowerCase()), strKeyCode, iDBDialect.getDBObjStandardName(biHierarchyDataEntityRuntime.getKeyPSDEField().getName())));
			//构建连接代码
			for(IPSSysBILevel item : selectedPSSysBILevelList) {
				if(item.getValuePSDEField() == null) {
					continue;
				}
				sb.append(" AND ");
				
				String strFullCodeName = String.format("%1$s__%2$s", iPSSysBICubeDimension.getCodeName(), item.getCodeName());
				
				String strLevelValue = conditions.get(strFullCodeName.toLowerCase());
				String strExpression = String.format("%1$s.%2$s", iDBDialect.getDBObjStandardName(iPSSysBICubeDimension.getCodeName().toLowerCase()), iDBDialect.getDBObjStandardName(item.getValuePSDEField().getName()));
				
				if(StringUtils.hasLength(strLevelValue)) {
					sb.append(iDBDialect.getConditionSQL(strExpression, item.getValuePSDEField().getStdDataType(), Conditions.EQ, strLevelValue, false, null));
				}
				else {
					sb.append(iDBDialect.getConditionSQL(strExpression, item.getValuePSDEField().getStdDataType(), Conditions.ISNULL, null, false, null));
				}
			}
			return String.format("EXISTS(%1$s)", sb.toString());
		}
	}

	/**
	 * 将查询串转为为Map对象
	 * 
	 * @param queryString
	 * @param bDecode
	 * @return
	 */
	public static Map<String, String> queryString2Map(String queryString, boolean bDecode) {
		Map<String, String> map = new LinkedHashMap<>();
		if (!StringUtils.hasLength(queryString)) {
			return map;
		}

		String[] params = queryString.split("&");
		for (String paramPair : params) {
			String[] keyAndValue = paramPair.split("=");
			if (keyAndValue.length == 2) {
				String strKey;
				String strValue;

				if (bDecode) {
					try {
						strKey = java.net.URLDecoder.decode(keyAndValue[0], "UTF-8");
					} catch (UnsupportedEncodingException ex) {
						strKey = keyAndValue[0];
						log.error(ex);
					}
					try {
						strValue = java.net.URLDecoder.decode(keyAndValue[1], "UTF-8");
					} catch (UnsupportedEncodingException ex) {
						strValue = keyAndValue[1];
						log.error(ex);
					}
				} else {
					strKey = keyAndValue[0];
					strValue = keyAndValue[1];
				}

				map.put(strKey.toLowerCase(), strValue);
			}
		}
		return map;
	}

}
