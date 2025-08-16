package net.ibizsys.central.database;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;

public abstract class DBDialectBase implements IDBDialect {

	private Map<String, IDBFunction> dbFunctionMap = new HashMap<String, IDBFunction>();

	public DBDialectBase() {

		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_AVG, DataTypes.DECIMAL, "AVG(%1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_MAX, DataTypes.UNKNOWN, "MAX(%1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_MIN, DataTypes.UNKNOWN, "MIN(%1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_SUM, DataTypes.DECIMAL, "SUM(%1$s)", 1));
		this.registerDBFunction(new DBFunction(IDBDialect.FUNC_COUNT, DataTypes.BIGINT, "COUNT(1)", 0));

	}

	@Override
	public String getDBObjStandardName(String strOriginName) throws Throwable {
		return strOriginName;
	}

	@Override
	public IDBFunction getDBFunction(String strFuncName) throws Throwable {
		IDBFunction iDBFunction = dbFunctionMap.get(strFuncName);
		if (iDBFunction != null) {
			return iDBFunction;
		}
		throw new Exception(String.format("数据库[%1$s]语法适配器不存在指定函数[%2$s]", this.getDBType(), strFuncName));
	}

	protected void registerDBFunction(IDBFunction iDBFunction) {
		dbFunctionMap.put(iDBFunction.getName(), iDBFunction);
	}

	@Override
	public String getConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (Conditions.TESTNULL.equals(strCondOp)) {
			if (objValueOrParam != null && objValueOrParam.toString().equals("1")) {
				return String.format("%1$s IS NULL", strFieldName);
			} else {
				return String.format("%1$s IS NOT NULL", strFieldName);
			}
		}

		if (Conditions.ISNULL.equals(strCondOp)) {
			return String.format("%1$s IS NULL", strFieldName);
		}

		if (Conditions.ISNOTNULL.equals(strCondOp)) {
			return String.format("%1$s IS NOT NULL", strFieldName);
		}

		if (DataTypeUtils.isStringDataType(nStdDataType)) {
			return getStringConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
		}

		if (DataTypeUtils.isIntDataType(nStdDataType)) {
			return getIntConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
		}
		//
		if (DataTypeUtils.isDoubleDataType(nStdDataType)) {
			return getDoubleConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
		}

		if (DataTypeUtils.isDateTimeDataType(nStdDataType)) {
			return getDateTimeConditionSQL(strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam, iSearchContext);
		}

		throw new Exception(String.format("无法计算查询条件[%1$s][%2$s][%3$s][%4$s][%5$s]", strFieldName, nStdDataType, strCondOp, objValueOrParam, bParam));
	}

	@Override
	public String getFunctionSQL(String strFuncName, String[] args) throws Throwable {
		IDBFunction iDBFunction = getDBFunction(strFuncName);
		return iDBFunction.getFuncSQL(args);
	}

	/**
	 * 获取字符串条件SQL 语句
	 * 
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param strValue
	 * @param bParam
	 * @param sqlParamList
	 * @return
	 * @throws Exception
	 */
	protected String getStringConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (!bParam) {
			if ((Conditions.IN.equals(strCondOp)) || (Conditions.NOTIN.equals(strCondOp))) {
				if (ObjectUtils.isEmpty(objValueOrParam)) {
					if (Conditions.IN.equals(strCondOp))
						return "1<>1";
					else
						return "1=1";
				}

				String[] items = null;
				if (objValueOrParam instanceof List) {
					List list = (List) objValueOrParam;
					items = new String[list.size()];
					for (int i = 0; i < list.size(); i++) {
						items[i] = DataTypeUtils.getStringValue(list.get(i), "").replace("'", "''");
					}
				} else {
					String strValue = DataTypeUtils.getStringValue(objValueOrParam, "");
					strValue = strValue.replace("'", "''");
					items = strValue.split("[,|;]");
				}

				String strSQL = "";
				if (Conditions.IN.equals(strCondOp)) {
					strSQL = String.format("%1$s IN (", strFieldName);
				} else {
					strSQL = String.format("%1$s NOT IN (", strFieldName);
				}
				for (int i = 0; i < items.length; i++) {
					if (i != 0)
						strSQL += ",";
					strSQL += String.format("'%1$s'", items[i]);
				}
				strSQL += ")";
				return strSQL;
			}

			String strValue = DataTypeUtils.getStringValue(objValueOrParam, "");
			strValue = strValue.replace("'", "''");

			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = '%2$s'", strFieldName, strValue);
			}
			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> '%2$s'", strFieldName, strValue);
			}
			if (Conditions.LIKE.equals(strCondOp)) {
				strValue = "%" + strValue + "%";
				return String.format("UPPER(%1$s) LIKE '%2$s'", strFieldName, strValue.toUpperCase());
			}
			if (Conditions.LEFTLIKE.equals(strCondOp)) {
				strValue = strValue + "%";
				return String.format("UPPER(%1$s) LIKE '%2$s'", strFieldName, strValue.toUpperCase());
			}
			if (Conditions.RIGHTLIKE.equals(strCondOp)) {
				strValue = "%" + strValue;
				return String.format("UPPER(%1$s) LIKE '%2$s'", strFieldName, strValue.toUpperCase());
			}
			if (Conditions.USERLIKE.equals(strCondOp)) {
				return String.format("UPPER(%1$s) LIKE '%2$s'", strFieldName, strValue.toUpperCase());
			}

		} else {
			// if (Conditions.IN.equals(strCondOp)) {
			// String strCondition = "";
			// for(String value : strValue.split("[,|;]")){
			// if(!StringUtils.isEmpty(strCondition))
			// strCondition += " or ";
			// SqlParam sqlParam2 = new SqlParam();
			// sqlParam2.setValue("%" + value + "%");
			// sqlParam2.setDataType(nStdDataType);
			// sqlParamList.add(sqlParam2);
			// strCondition += String.format("%1$s LIKE %2$s", strFieldName,
			// objValueOrParam);
			// }
			// if(StringUtils.isEmpty(strCondition))
			// strCondition = "0=0";
			// return String.format("(%1$s)", strCondition);
			// }
			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LIKE.equals(strCondOp)) {
				return String.format("%1$s LIKE '%%'||%2$s||'%%'", strFieldName, objValueOrParam);
			}

			if (Conditions.LEFTLIKE.equals(strCondOp)) {
				return String.format("%1$s LIKE %2$s ||'%%'", strFieldName, objValueOrParam);
			}

			if (Conditions.RIGHTLIKE.equals(strCondOp)) {
				return String.format("%1$s LIKE '%%'||%2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.USERLIKE.equals(strCondOp)) {
				return String.format("%1$s LIKE '%%'||%2$s||'%%'", strFieldName, objValueOrParam);
			}
		}

		throw new Exception(String.format("无法识别的条件[%1$s][%2$s][%3$s][%4$s]", strFieldName, strCondOp, objValueOrParam, bParam));
	}

	/**
	 * 获取INT条件SQL 语句
	 * 
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param objValueOrParam
	 * @param bParam
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	protected String getIntConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (!bParam) {
			// 判断值是否正确
			if (!(Conditions.IN.equals(strCondOp) || Conditions.NOTIN.equals(strCondOp))) {

				BigInteger objValue = DataTypeUtils.getBigIntegerValue(objValueOrParam, null);

				if (objValue == null) {
					throw new Exception(String.format("值[%1$s]非整数值", objValueOrParam));
				}

				if (Conditions.BITAND.equals(strCondOp)) {
					if (objValue.longValue() == 0) {
						return String.format("(%1$s = 0 || %1$s IS NULL) ", strFieldName);
					}
					return String.format("(%1$s & %2$s)>0", strFieldName, objValue.longValue());
				}

				if (Conditions.EQ.equals(strCondOp)) {
					return String.format("%1$s = %2$s", strFieldName, objValue.longValue());
				}

				if (Conditions.NOTEQ.equals(strCondOp)) {
					return String.format("%1$s <> %2$s", strFieldName, objValue.longValue());
				}

				if (Conditions.GT.equals(strCondOp)) {
					return String.format("%1$s > %2$s", strFieldName, objValue.longValue());
				}

				if (Conditions.GTANDEQ.equals(strCondOp)) {
					return String.format("%1$s >= %2$s", strFieldName, objValue.longValue());
				}

				if (Conditions.LT.equals(strCondOp)) {
					return String.format("%1$s < %2$s", strFieldName, objValue.longValue());
				}

				if (Conditions.LTANDEQ.equals(strCondOp)) {
					return String.format("%1$s <= %2$s", strFieldName, objValue.longValue());
				}
			}

			if ((Conditions.IN.equals(strCondOp)) || (Conditions.NOTIN.equals(strCondOp))) {

				String[] items = null;
				if (objValueOrParam instanceof List) {
					List list = (List) objValueOrParam;
					items = new String[list.size()];
					for (int i = 0; i < list.size(); i++) {
						items[i] = DataTypeUtils.getStringValue(list.get(i), "");
					}
				} else {
					String strValue = DataTypeUtils.getStringValue(objValueOrParam, "");
					items = strValue.split("[,|;]");
				}

				String strSQL = "";
				if (Conditions.IN.equals(strCondOp)) {
					strSQL = String.format("%1$s IN (", strFieldName);
				} else {
					strSQL = String.format("%1$s NOT IN (", strFieldName);
				}
				for (int i = 0; i < items.length; i++) {
					if (i != 0)
						strSQL += ",";
					strSQL += String.format("%1$s", items[i]);
				}
				strSQL += ")";
				return strSQL;
			}
		} else {
			if (Conditions.BITAND.equals(strCondOp)) {
				return String.format("(%1$s & %2$s) > 0", strFieldName, objValueOrParam);
			}

			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GT.equals(strCondOp)) {
				return String.format("%1$s > %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GTANDEQ.equals(strCondOp)) {
				return String.format("%1$s >= %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LT.equals(strCondOp)) {
				return String.format("%1$s < %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LTANDEQ.equals(strCondOp)) {
				return String.format("%1$s <= %2$s", strFieldName, objValueOrParam);
			}

			// if ((Conditions.IN.equals(strCondOp)) ||
			// (Conditions.NOTIN.equals(strCondOp))) {
			// if (StringUtils.isEmpty(strValue)) {
			// if (Conditions.IN.equals(strCondOp, Conditions.IN, true) == 0)
			// return "1<>1";
			// else
			// return "1=1";
			// }
			//
			// String[] items = strValue.split("[,|;]");
			// String strSQL = "";
			// if (Conditions.IN.equals(strCondOp, Conditions.IN, true) == 0) {
			// strSQL = String.format("%1$s IN (", strFieldName);
			// } else {
			// strSQL = String.format("%1$s NOT IN (", strFieldName);
			// }
			// for (int i = 0; i < items.length; i++) {
			// if (i != 0)
			// strSQL += ",";
			// strSQL += String.format("%1$s", "?");
			//
			// SqlParam sqlParam2 = new SqlParam();
			// sqlParam2.setValue(items[i]);
			// sqlParam2.setDataType(nStdDataType);
			// sqlParamList.add(sqlParam);
			// }
			// strSQL += ")";
			// return strSQL;
			// }
		}

		throw new Exception(String.format("无法识别的条件[%1$s][%2$s][%3$s][%4$s]", strFieldName, strCondOp, objValueOrParam, bParam));

	}

	/**
	 * 获取DOUBLE条件SQL 语句
	 * 
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param strValue
	 * @param bParam
	 * @param sqlParamList
	 * @return
	 * @throws Exception
	 */
	protected String getDoubleConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (!bParam) {
			if (!(Conditions.IN.equals(strCondOp) || Conditions.NOTIN.equals(strCondOp))) {

				BigDecimal objValue = DataTypeUtils.getBigDecimalValue(objValueOrParam, null);

				if (objValue == null) {
					throw new Exception(String.format("值[%1$s]非浮点值", objValueOrParam));
				}

				if (Conditions.EQ.equals(strCondOp)) {
					return String.format("%1$s = %2$s", strFieldName, objValue.doubleValue());
				}

				if (Conditions.NOTEQ.equals(strCondOp)) {
					return String.format("%1$s <> %2$s", strFieldName, objValue.doubleValue());
				}

				if (Conditions.GT.equals(strCondOp)) {
					return String.format("%1$s > %2$s", strFieldName, objValue.doubleValue());
				}

				if (Conditions.GTANDEQ.equals(strCondOp)) {
					return String.format("%1$s >= %2$s", strFieldName, objValue.doubleValue());
				}

				if (Conditions.LT.equals(strCondOp)) {
					return String.format("%1$s < %2$s", strFieldName, objValue.doubleValue());
				}

				if (Conditions.LTANDEQ.equals(strCondOp)) {
					return String.format("%1$s <= %2$s", strFieldName, objValue.doubleValue());
				}
			}
			if ((Conditions.IN.equals(strCondOp)) || (Conditions.NOTIN.equals(strCondOp))) {

				if (ObjectUtils.isEmpty(objValueOrParam)) {
					if (Conditions.IN.equals(strCondOp))
						return "1<>1";
					else
						return "1=1";
				}

				String[] items = null;
				if (objValueOrParam instanceof List) {
					List list = (List) objValueOrParam;
					items = new String[list.size()];
					for (int i = 0; i < list.size(); i++) {
						items[i] = DataTypeUtils.getStringValue(list.get(i), "");
					}
				} else {
					String strValue = DataTypeUtils.getStringValue(objValueOrParam, "");
					items = strValue.split("[,|;]");
				}

				String strSQL = "";
				if (Conditions.IN.equals(strCondOp)) {
					strSQL = String.format("%1$s IN (", strFieldName);
				} else {
					strSQL = String.format("%1$s NOT IN (", strFieldName);
				}
				for (int i = 0; i < items.length; i++) {
					if (i != 0)
						strSQL += ",";
					strSQL += String.format("%1$s", items[i]);
				}
				strSQL += ")";
				return strSQL;
			}
		} else {

			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GT.equals(strCondOp)) {
				return String.format("%1$s > %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GTANDEQ.equals(strCondOp)) {
				return String.format("%1$s >=%2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LT.equals(strCondOp)) {
				return String.format("%1$s < %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LTANDEQ.equals(strCondOp)) {
				return String.format("%1$s <= %2$s", strFieldName, objValueOrParam);
			}
		}

		throw new Exception(String.format("无法识别的条件[%1$s][%2$s][%3$s][%4$s]", strFieldName, strCondOp, objValueOrParam, bParam));
	}

	/**
	 * 获取DATETIME条件SQL 语句
	 * 
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param objValueOrParam
	 * @param bParam
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	protected String getDateTimeConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable {
		if (!bParam) {
			// 判断值是否正确
			String strValue = null;
			if (objValueOrParam instanceof String) {
				strValue = (String) objValueOrParam;
			} else {
				long nValue = DataTypeUtils.getDateTimeValue(objValueOrParam);
				if (nValue == -1) {
					throw new Exception(String.format("值[%1$s]非日期时间性", objValueOrParam));
				}

				java.sql.Timestamp ts = new Timestamp(nValue);
				strValue = String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", ts);

				if ((Conditions.LT.equals(strCondOp) || Conditions.LTANDEQ.equals(strCondOp))) {

					Calendar calendar = Calendar.getInstance();
					calendar.setTime(new Date(ts.getTime()));

					if (calendar.get(Calendar.HOUR_OF_DAY) == 0 && calendar.get(Calendar.MINUTE) == 0 && calendar.get(Calendar.SECOND) == 0) {
						strValue = String.format("%1$tY-%1$tm-%1$td 23:59:59", ts);
					}
				}
			}

			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = '%2$s'", strFieldName, strValue);
			}

			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> '%2$s'", strFieldName, strValue);
			}

			if (Conditions.GT.equals(strCondOp)) {
				return String.format("%1$s > '%2$s'", strFieldName, strValue);
			}

			if (Conditions.GTANDEQ.equals(strCondOp)) {
				return String.format("%1$s >= '%2$s'", strFieldName, strValue);
			}

			if (Conditions.LT.equals(strCondOp)) {
				return String.format("%1$s < '%2$s'", strFieldName, strValue);
			}

			if (Conditions.LTANDEQ.equals(strCondOp)) {
				return String.format("%1$s <= '%2$s'", strFieldName, strValue);
			}
		} else {

			if (Conditions.EQ.equals(strCondOp)) {
				return String.format("%1$s = %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.NOTEQ.equals(strCondOp)) {
				return String.format("%1$s <> %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GT.equals(strCondOp)) {
				return String.format("%1$s > %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.GTANDEQ.equals(strCondOp)) {
				return String.format("%1$s >= %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LT.equals(strCondOp)) {
				return String.format("%1$s < %2$s", strFieldName, objValueOrParam);
			}

			if (Conditions.LTANDEQ.equals(strCondOp)) {
				return String.format("%1$s <= %2$s", strFieldName, objValueOrParam);
			}

		}

		throw new Exception(String.format("无法识别的条件[%1$s][%2$s][%3$s][%4$s]", strFieldName, strCondOp, objValueOrParam, bParam));
	}

	@Override
	public String getLastInsertIdSQL(String strAlias) throws Throwable {
		return null;
	}

	@Override
	public String getJsonExtractSQL(String strFieldName, String strJsonPath) throws Throwable {
		return null;
	}

	@Override
	public String getDBType() {
		return null;
	}

	@Override
	public String getCreateTableSQL(String strTableName, Collection<IPSDEField> psDEFieldList) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表名称");
		Assert.notEmpty(psDEFieldList, "未传入实体属性集合");
		String strSQL = this.onGetCreateTableSQL(strTableName, psDEFieldList);
		if(ObjectUtils.isEmpty(strSQL)) {
			throw new Exception(String.format("无法获取建立数据表[%1$s]SQL语句", strTableName));
		}
		return strSQL;
	}
	
	protected String onGetCreateTableSQL(String strTableName, Collection<IPSDEField> psDEFieldList) throws Throwable {
		return null;
	}
	
	@Override
	public String getCreateColumnSQL(String strTableName, IPSDEField iPSDEField) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表名称");
		Assert.notNull(iPSDEField, "未传入实体属性对象");
		String strSQL = this.onGetCreateColumnSQL(strTableName, iPSDEField);
		if(ObjectUtils.isEmpty(strSQL)) {
			throw new Exception(String.format("无法获取建立数据列[%1$s]SQL语句", strTableName));
		}
		return strSQL;
	}
	
	protected String onGetCreateColumnSQL(String strTableName, IPSDEField iPSDEField) throws Throwable {
		return null;
	}
	

	public String getDataType(IPSDEField iPSDEField, boolean bAppendNullFlag, boolean bAllowNull, boolean bAppendDefault, String strDefault) throws Throwable {
		Assert.notNull(iPSDEField, "未传入实体属性对象");
		String strDataType = this.onGetDataType(iPSDEField, bAppendNullFlag, bAllowNull, bAppendDefault, strDefault);
		if(ObjectUtils.isEmpty(strDataType)) {
			throw new Exception(String.format("无法获取属性[%1$s][%2$s]数据库数据类型", iPSDEField.getName(), iPSDEField.getStdDataType()));
		}
		return strDataType;
	}

	protected String onGetDataType(IPSDEField iPSDEField, boolean bAppendNullFlag, boolean bAllowNull, boolean bAppendDefault, String strDefault) throws Throwable {
		return null;
	}

	@Override
	public String getInsertTableSQL(String strTableName, Collection<String> columnList) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表名称");
		Assert.notEmpty(columnList, "未传入插入列集合");
		String strSQL = this.onGetInsertTableSQL(strTableName, columnList);
		if(ObjectUtils.isEmpty(strSQL)) {
			throw new Exception(String.format("无法获取插入数据表[%1$s]SQL语句", strTableName));
		}
		return strSQL;
	}
	
	protected String onGetInsertTableSQL(String strTableName, Collection<String> columnList) throws Throwable {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("INSERT INTO %1$s (\r\n", this.getDBObjStandardName(strTableName)));
		boolean bFirst = true;
		for (String strColumn : columnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(",");
			}
			sb.append(String.format("%1$s", this.getDBObjStandardName(strColumn)));
		}

		sb.append(String.format(") VALUES (\r\n"));

		bFirst = true;
		for (String strColumn : columnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(",");
			}
			sb.append(String.format("?"));
		}
		sb.append(")");
		return sb.toString();	
	}

	@Override
	public String getUpdateTableSQL(String strTableName, Collection<String> updateColumnList, Collection<String> whereColumnList) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表名称");
		Assert.notEmpty(updateColumnList, "未传入更新列集合");
		Assert.notEmpty(whereColumnList, "未传入条件列集合");
		String strSQL = this.onGetUpdateTableSQL(strTableName, updateColumnList, whereColumnList);
		if(ObjectUtils.isEmpty(strSQL)) {
			throw new Exception(String.format("无法获取更新数据表[%1$s]SQL语句", strTableName));
		}
		return strSQL;
	}
	
	protected String onGetUpdateTableSQL(String strTableName, Collection<String> updateColumnList, Collection<String> whereColumnList) throws Throwable {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("UPDATE %1$s SET \r\n", this.getDBObjStandardName(strTableName)));
		boolean bFirst = true;
		for (String strColumn : updateColumnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(",");
			}
			sb.append(String.format("%1$s = ?", this.getDBObjStandardName(strColumn)));
		}
		sb.append(String.format(" WHERE \r\n"));

		bFirst = true;
		for (String strColumn : whereColumnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(" AND ");
			}
			sb.append(String.format("%1$s = ?", this.getDBObjStandardName(strColumn)));
		}

		return sb.toString();
	}

	@Override
	public String getDeleteTableSQL(String strTableName, Collection<String> whereColumnList) throws Throwable {
		Assert.hasLength(strTableName, "未传入数据表名称");
		Assert.notEmpty(whereColumnList, "未传入条件列集合");
		String strSQL = this.onGetDeleteTableSQL(strTableName, whereColumnList);
		if(ObjectUtils.isEmpty(strSQL)) {
			throw new Exception(String.format("无法获取删除数据表[%1$s]SQL语句", strTableName));
		}
		return strSQL;
	}
	
	protected String onGetDeleteTableSQL(String strTableName, Collection<String> whereColumnList) throws Throwable {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("DELETE FROM %1$s\r\n", this.getDBObjStandardName(strTableName)));
		boolean bFirst = true;
		sb.append(String.format(" WHERE \r\n"));

		bFirst = true;
		for (String strColumn : whereColumnList) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append(" AND ");
			}
			sb.append(String.format("%1$s = ?", this.getDBObjStandardName(strColumn)));
		}

		return sb.toString();
	}
	
	
	
//	@Override
//	public String getSelectTableSQL(String strTableName, Collection<String> selectColumnList, Collection<String> whereColumnList) throws Throwable {
//		Assert.hasLength(strTableName, "未传入数据表名称");
//		Assert.notEmpty(selectColumnList, "未传入选择列集合");
//		Assert.notEmpty(whereColumnList, "未传入条件列集合");
//		String strSQL = this.onGetUpdateTableSQL(strTableName, selectColumnList, whereColumnList);
//		if(ObjectUtils.isEmpty(strSQL)) {
//			throw new Exception(String.format("无法获取更新数据表[%1$s]SQL语句", strTableName));
//		}
//		return strSQL;
//	}
//	
//	protected String onGetSelectTableSQL(String strTableName, Collection<String> selectColumnList, Collection<String> whereColumnList) throws Throwable {
//		StringBuilder sb = new StringBuilder();
//		sb.append(String.format("SELECT\r\n"));
//		boolean bFirst = true;
//		for (String strColumn : selectColumnList) {
//			if (bFirst) {
//				bFirst = false;
//			} else {
//				sb.append(",");
//			}
//			sb.append(String.format("%1$s", this.getDBObjStandardName(strColumn)));
//		}
//		sb.append(String.format(" FROM %1$s WHERE \r\n", this.getDBObjStandardName(strTableName)));
//
//		bFirst = true;
//		for (String strColumn : whereColumnList) {
//			if (bFirst) {
//				bFirst = false;
//			} else {
//				sb.append(" AND ");
//			}
//			sb.append(String.format("%1$s = ?", this.getDBObjStandardName(strColumn)));
//		}
//
//		return sb.toString();
//	}
	
}
