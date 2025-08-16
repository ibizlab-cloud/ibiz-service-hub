package net.ibizsys.central.plugin.calcite.dataentity.ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.calcite.sql.SqlAsOperator;
import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlIdentifier;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.util.SqlShuttle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.DEDQSQLCustomCondParserBase;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.central.plugin.calcite.util.CommonSqlDialect;
import net.ibizsys.central.plugin.calcite.util.SQLParserUtils;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.PSModelEnums.DEFType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.JsonUtils;

public class CalciteDEDQSQLCustomCondParser extends DEDQSQLCustomCondParserBase {

	private static final Log log = LogFactory.getLog(CalciteDEDQSQLCustomCondParser.class);

	private final static Pattern Regex = Pattern.compile("\\$(\\{.*?\\})");

	private String strColumnNameField = "name";

	private String strValueItemField = "value";

	private String strFieldNameField = "field";


	private static Random random = new Random();

	// private String strColumnCaptionField = "caption";

	protected Pattern getPattern() {
		return CalciteDEDQSQLCustomCondParser.Regex;
	}

	protected String getColumnNameField() {
		return strColumnNameField;
	}

	protected String getValueItemField() {
		return strValueItemField;
	}

	protected String getFieldNameField() {
		return strFieldNameField;
	}


	@Override
	protected String onParse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params, Set<String> relatedColumnList) throws Throwable {

		String strRandomText = String.format("a%06d", random.nextInt(999999));

		// 进行内容分析
		String strAlias;
		StringBuilder aliasSb = new StringBuilder();


		if(iDEDataQueryCodeRuntime != null) {
			try {
				String sql = iDEDataQueryCodeRuntime.getPSDEDataQueryCode().getQueryCode();
				sql = getRealSQLCode(sql);
				SqlParser parser = SqlParser.create(sql, SQLParserUtils.getConfig(iDBDialect.getDBType()));
				SqlNode sqlNode = parser.parseQuery();

				// 解析 SQL，获取解析结果
				SqlSelect sqlSelect = (SqlSelect) sqlNode;

				SqlNode sqlFromNode = sqlSelect.getFrom();
				if(sqlFromNode instanceof SqlBasicCall) {
					SqlBasicCall sqlBasicCall = (SqlBasicCall)sqlFromNode;
					if(sqlBasicCall.getOperator() instanceof SqlAsOperator) {
						aliasSb.append(sqlBasicCall.getOperandList().get(1).toString());
					}
				}
				//
//				SqlNode replacedNode = sqlSelect.getSelectList().get(0).accept(new SqlShuttle() {
//					@Override
//					public SqlNode visit(SqlCall sqlCall) {
//						if (sqlCall instanceof SqlBasicCall) {
//							SqlBasicCall sqlBasicCall = (SqlBasicCall) sqlCall;
//							SqlCall sqlCall2 = net.ibizsys.central.plugin.calcite.util.FunctionParser.parseSQL(sqlBasicCall);
//							return super.visit(sqlCall2);
//						}
//						return super.visit(sqlCall);
//					}
//				});
				//
//				return replacedNode.toSqlString(Db2SqlDialect.DEFAULT).getSql();

			} catch (Throwable ex) {
				throw new Exception(String.format("解析查询代码发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentIdPSDEField = null;
		IPSDEField namePSDEField = null;

		if(iDEDataQueryCodeRuntime!=null) {
			if(iDataEntityRuntime.isEnableDynaStorage() && iDataEntityRuntime.getDEDynaStorageUtilRuntime() != null) {
				iDEDynaStorageUtilRuntime = iDataEntityRuntime.getDEDynaStorageUtilRuntime();
				parentTypePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTTYPE.value, false);
				parentIdPSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(PredefinedFieldType.PARENTID.value, false);
				namePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(IDEDynaStorageUtilRuntime.PREDEFINEDFIELD_NAME, false);
			}
		}

		IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime2 = iDEDynaStorageUtilRuntime;

		strAlias = aliasSb.toString();

		String text = iSearchCustomCond.getCustomCond();

		// 创建 Matcher 对象，并匹配文本
		Matcher matcher = getPattern().matcher(text);

		// 查找匹配的结果
		Map<String, String> replaceContentMap = new LinkedHashMap<>();
		while (matcher.find()) {
			// 提取 JSON 内容
			String json = matcher.group(1);
			try {
				Map<String, Object> map = JsonUtils.asMap(json);
				Object columnName = map.get(this.getColumnNameField());
				if (columnName != null) {
					// 替换新内容
					boolean bAppendRandom = true;
					String strExpression = null;
					String strColumnName = columnName.toString();
					if(iDEDataQueryCodeRuntime!=null) {
						IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(strColumnName, true);
						if (iPSDEDataQueryCodeExp == null) {
							IPSDEField iPSDEField = iDEDataQueryCodeRuntime.getDataEntityRuntime().getPSDEField(true, strColumnName, false);
							if (iPSDEField == null) {
								throw new Exception(String.format("实体[%1$s]无法获取指定属性[%2$s]", iDEDataQueryCodeRuntime.getDataEntityRuntime().getName(), strColumnName));
							}

							// 需要进一步判断属性类型
							if(iPSDEField.getDEFType() == DEFType.DYNASTORAGE.value && iDEDynaStorageUtilRuntime2!=null) {
								IPSDEField storagePSDEField = iDEDynaStorageUtilRuntime.getStoragePSDEField(iPSDEField);
								String strKeyCode = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(iDataEntityRuntime.getKeyPSDEField().getName(), false).getExpression();
								strExpression = String.format("(SELECT %2$s.%9$s FROM %1$s %2$s WHERE (%3$s= %2$s.%4$s AND %2$s.%5$s = '%6$s' AND %2$s.%7$s = '%8$s'))",
										iDEDynaStorageUtilRuntime.getStorageDataEntityRuntime().getTableName(), "x", strKeyCode, parentIdPSDEField.getName(), parentTypePSDEField.getName(), iDataEntityRuntime.getName()
										, namePSDEField.getName(), iPSDEField.getName(), storagePSDEField.getName());
								bAppendRandom = false;
							}
							// 进一步解析代码代码
							if(!StringUtils.hasLength(strExpression)) {
								strExpression = String.format("%1$s.%2$s", strAlias, strColumnName);
							}

						} else {
							strExpression = iPSDEDataQueryCodeExp.getExpression();
							IPSDEField iPSDEField = iDEDataQueryCodeRuntime.getDataEntityRuntime().getPSDEField(true, strColumnName, true);
							if(iPSDEField != null && iPSDEField.getDEFType() == DEFType.FORMULA.value) {
								bAppendRandom = false;
							}
						}
					}
					else {
						strExpression = strColumnName;
					}

					if(bAppendRandom) {
						strExpression = String.format("%1$s%2$s", strRandomText, strExpression);
					}


					replaceContentMap.put(String.format("$%1$s", json), strExpression);
				}
				else {
					Object value = map.get(this.getValueItemField());
					if(!ObjectUtils.isEmpty(value)) {
						//判断类型
						int nStdDataType = DataTypes.UNKNOWN;
						Object field = map.get(this.getFieldNameField());
						if(!ObjectUtils.isEmpty(field)) {
							String strDETag = PSModelUtils.getParentId(field.toString());
							IDataEntityRuntime relatedDataEntityRuntime = iDataEntityRuntime.getSystemRuntime().getDataEntityRuntime(strDETag, true);
							if(relatedDataEntityRuntime!=null) {
								IPSDEField iPSDEField = relatedDataEntityRuntime.getPSDEField(true, PSModelUtils.getSimpleId(field.toString()), true);
								if(iPSDEField != null) {
									nStdDataType = iPSDEField.getStdDataType();
								}
							}
						}

						if(DataTypeUtils.isNumberDataType(nStdDataType)) {
							replaceContentMap.put(String.format("$%1$s", json), String.format("%1$s", value.toString()));
						}
						else {
							replaceContentMap.put(String.format("$%1$s", json), String.format("'%1$s'", value.toString().replace("'", "''")));
						}


					}
				}

			} catch (Throwable ex) {
				log.error(String.format("PQL自定义条件解析Json发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		if (replaceContentMap.size() > 0) {
			// 形成新内容
			for (java.util.Map.Entry<String, String> entry : replaceContentMap.entrySet()) {
				text = text.replace(entry.getKey(), entry.getValue());
			}
		}

		// 替换函数等
		String query = "SELECT 1 FROM t1 where " + text;
		try {

			// 解析 SQL，获取解析结果
			query = getRealSQLCode(query);
			SqlParser parser = SqlParser.create(query, SQLParserUtils.getConfig(iDBDialect.getDBType()));
			SqlNode sqlNode = parser.parseQuery();
			SqlSelect sqlSelect = (SqlSelect) sqlNode;

			SqlNode sqlWhereNode = sqlSelect.getWhere();

			List<SqlIdentifier> columnList = new ArrayList<SqlIdentifier>();

			SqlNode replacedNode = sqlWhereNode.accept(new SqlShuttle() {
				@Override
				public SqlNode visit(SqlCall sqlCall) {
					if (sqlCall instanceof SqlBasicCall) {
						SqlBasicCall sqlBasicCall = (SqlBasicCall) sqlCall;
						SqlNode sqlCall2 = net.ibizsys.central.plugin.calcite.util.FunctionParser.parseSQL(iDBDialect.getDBType(), sqlBasicCall, params);
						if(sqlCall2 instanceof  SqlCall) {
							return super.visit((SqlCall)sqlCall2);
						}
						return sqlCall2;
					}
					return super.visit(sqlCall);
				}

				@Override
				public @Nullable SqlNode visit(SqlIdentifier id) {
					if(id.names.size() !=2) {
						if(id.names.get(0).indexOf(strRandomText) == 0) {
							return super.visit(id.setName(0, id.names.get(0).substring(strRandomText.length())));
						}
						else {
							if(iDEDataQueryCodeRuntime != null) {
								IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(id.names.get(0).toString(), true);
								if(iPSDEDataQueryCodeExp!=null) {
									return super.visit(id.setName(0, iPSDEDataQueryCodeExp.getExpression()));
								}
//								else {
//									columnList.add(id);
//								}
							}
						}
					}
					else
					if(id.names.get(0).indexOf(strRandomText) == 0) {
						return super.visit(id.setName(0, id.names.get(0).substring(strRandomText.length())));
					}
					else {
						if(iDEDataQueryCodeRuntime != null) {
							IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp = iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(id.names.get(0).toString(), true);
							if(iPSDEDataQueryCodeExp!=null) {
								return super.visit(id.setName(0, iPSDEDataQueryCodeExp.getExpression()));
							}
//								else {
//									columnList.add(id);
//								}
						}
					}
					return super.visit(id);
				}
			});

			if(columnList.size()>0) {
				throw new Exception(String.format("不能直接使用列[%1$s]", columnList.get(0).toString()));
			}

//			if(iDBDialect.getDBType().equalsIgnoreCase("MYSQL")
//					|| iDBDialect.getDBType().equalsIgnoreCase(DBType.MYSQL5.value)) {
//				return replacedNode.toSqlString(MysqlSqlDialect.DEFAULT).getSql();
//			}

			// 去除连续括号
			replacedNode = replacedNode.accept(new SqlShuttle() {
				@Override
				public @Nullable SqlNode visit(SqlNodeList nodeList) {
					// 判断成员是否也是数组
					if (nodeList.size() == 1 && nodeList.get(0) instanceof SqlNodeList) {
						return super.visit((SqlNodeList) nodeList.get(0));
					}
					return super.visit(nodeList);
				}
			});

			return replacedNode.toSqlString(CommonSqlDialect.DEFAULT,true).getSql();

		} catch (Throwable ex) {
			throw new Exception(String.format("解析自定义条件发生异常，%1$s", ex.getMessage()), ex);
		}

	}

}
