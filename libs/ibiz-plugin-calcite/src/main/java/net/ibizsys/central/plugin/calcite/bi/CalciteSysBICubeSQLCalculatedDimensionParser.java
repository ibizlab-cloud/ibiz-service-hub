package net.ibizsys.central.plugin.calcite.bi;

import java.util.Map;
import java.util.Set;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlIdentifier;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.sql.util.SqlShuttle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.checkerframework.checker.nullness.qual.Nullable;

import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.central.bi.SysBICubeCalculatedDimensionParserBase;
import net.ibizsys.central.bi.util.BISearchContext;
import net.ibizsys.central.bi.util.IBISearchContext;
import net.ibizsys.central.bi.util.IBISearchDimension;
import net.ibizsys.central.plugin.calcite.util.SQLParserUtils;
import net.ibizsys.model.bi.IPSSysBICubeDimension;

public class CalciteSysBICubeSQLCalculatedDimensionParser extends SysBICubeCalculatedDimensionParserBase {

	private static final Log log = LogFactory.getLog(CalciteSysBICubeSQLCalculatedDimensionParser.class);

	@Override
	protected String onParse(IPSSysBICubeDimension iPSSysBICubeDimension, String strDimensionFormula, ISysBICubeRuntime iSysBICubeRuntime, IBISearchContext iBISearchContext, Set<String> columnList) throws Throwable {

		String strDBType = iSysBICubeRuntime.getDataEntityRuntime().getSysDBSchemeRuntimeMust().getDBType();

		String text = strDimensionFormula;

		// // 创建 Matcher 对象，并匹配文本
		// Matcher matcher = getPattern().matcher(text);
		//
		// // 查找匹配的结果
		// Map<String, String> replaceContentMap = new LinkedHashMap<>();
		// while (matcher.find()) {
		// // 提取 JSON 内容
		// String json = matcher.group(1);
		// try {
		// Map<String, Object> map = JsonUtils.asMap(json);
		// Object columnName = map.get(this.getColumnNameField());
		// if (columnName != null) {
		// // 替换新内容
		// String strExpression = null;
		// String strColumnName = columnName.toString();
		// IPSDEDataQueryCodeExp iPSDEDataQueryCodeExp =
		// iDEDataQueryCodeRuntime.getPSDEDataQueryCodeExp(strColumnName, true);
		// if (iPSDEDataQueryCodeExp == null) {
		// IPSDEField iPSDEField =
		// iDEDataQueryCodeRuntime.getDataEntityRuntime().getPSDEField(strColumnName,
		// false);
		// if (iPSDEField == null) {
		// throw new Exception(String.format("实体[%1$s]无法获取指定属性[%2$s]",
		// iDEDataQueryCodeRuntime.getDataEntityRuntime().getName(),
		// strColumnName));
		// }
		//
		// // 需要进一步判断属性类型
		//
		// // 进一步解析代码代码
		// strExpression = String.format("%1$s.%2$s", strAlias,
		// iDEDataQueryCodeRuntime.getDBDialect().getDBObjStandardName(strColumnName));
		// } else {
		// strExpression = iPSDEDataQueryCodeExp.getExpression();
		// }
		//
		// strExpression = String.format("%1$s%2$s", strRandomText,
		// strExpression);
		//
		// replaceContentMap.put(String.format("$%1$s", json), strExpression);
		// }
		// } catch (Throwable ex) {
		// log.error(String.format("PQL自定义条件解析Json发生异常，%1$s", ex.getMessage()),
		// ex);
		// }
		// }
		//
		// if (replaceContentMap.size() > 0) {
		// // 形成新内容
		// for (java.util.Map.Entry<String, String> entry :
		// replaceContentMap.entrySet()) {
		// text = text.replace(entry.getKey(), entry.getValue());
		// }
		// }

		Map<String, Object> param = null;
		if (iBISearchContext != null) {
			IBISearchDimension iBISearchDimension = BISearchContext.getBISearchDimension(iBISearchContext, iPSSysBICubeDimension.getCodeName(), true);
			if (iBISearchDimension != null) {
				param = iBISearchDimension.getParam();
			}
		}

		Map<String, Object> param2 = param;
		// 替换函数等
		try {

			String sql = "SELECT " + text + " FROM t1";
			SqlParser parser = SqlParser.create(sql, SQLParserUtils.getConfig(strDBType));
			SqlNode sqlNode = parser.parseQuery();

			// 解析 SQL，获取解析结果
			// SqlNode sqlNode = planner.parse(sql);
			SqlSelect sqlSelect = (SqlSelect) sqlNode;

			SqlNode replacedNode = sqlSelect.getSelectList().get(0).accept(new SqlShuttle() {
				@Override
				public SqlNode visit(SqlCall sqlCall) {
					if (sqlCall instanceof SqlBasicCall) {
						SqlBasicCall sqlBasicCall = (SqlBasicCall) sqlCall;
						SqlNode sqlCall2 = net.ibizsys.central.plugin.calcite.util.FunctionParser.parseSQL(strDBType, sqlBasicCall, param2);
						if (sqlCall2 instanceof SqlCall) {
							return super.visit((SqlCall) sqlCall2);
						}
						return sqlCall2;

					}
					return super.visit(sqlCall);
				}

				@Override
				public @Nullable SqlNode visit(SqlIdentifier id) {
					if (id.names.size() == 1) {
						if (columnList != null) {
							columnList.add(id.getSimple());
						}
						return super.visit(id.add(0, "dataresult", SqlParserPos.ZERO));
					}
					return super.visit(id);
				}
			});

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

			return replacedNode.toSqlString(Db2SqlDialect.DEFAULT).getSql();

		} catch (Throwable ex) {
			throw new Exception(String.format("解析智能立方体计算维度发生异常，%1$s", ex.getMessage()), ex);
		}
	}

}
