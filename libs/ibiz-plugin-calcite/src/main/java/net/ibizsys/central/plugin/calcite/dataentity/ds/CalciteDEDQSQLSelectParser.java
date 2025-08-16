package net.ibizsys.central.plugin.calcite.dataentity.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.calcite.sql.SqlAsOperator;
import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlIdentifier;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParser;
import org.springframework.util.StringUtils;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.ds.DEDQSQLSelectParserBase;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.plugin.calcite.util.CommonSqlDialect;
import net.ibizsys.central.plugin.calcite.util.SQLParserUtils;

public class CalciteDEDQSQLSelectParser extends DEDQSQLSelectParserBase {


	
	@Override
	protected String onReselect(String strSQL, Set<String> columnList, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime) throws Throwable {

		// 创建 Matcher 对象，并匹配文本
		strSQL = getRealSQLCode(strSQL);
				
		try {
			SqlParser parser = SqlParser.create(strSQL, SQLParserUtils.getConfig(iDBDialect.getDBType()));
			SqlNode sqlNode = parser.parseQuery();
			// 解析 SQL，获取解析结果

			Map<String, String> columnMap = new HashMap<String, String>();
			for (String strColumn : columnList) {
				columnMap.put(strColumn.toUpperCase(), "");
			}

			List<SqlNode> selectSqlNodeList = new ArrayList<SqlNode>();

			SqlSelect sqlSelect = (SqlSelect) sqlNode;
			SqlNodeList sqlNodeList = sqlSelect.getSelectList();
			for (SqlNode selectNode : sqlNodeList) {
				String strName = null;

				if (selectNode instanceof SqlIdentifier) {
					SqlIdentifier sqlIdentifier = (SqlIdentifier) selectNode;
					if(sqlIdentifier.names.size() ==1) {
						strName = sqlIdentifier.names.get(0);
					}
					else {
						strName = sqlIdentifier.names.get(1);
					}
				}
				else
				if (selectNode instanceof SqlBasicCall) {
					SqlBasicCall sqlBasicCall = (SqlBasicCall) selectNode;
					if (sqlBasicCall.getOperator() instanceof SqlAsOperator) {
						strName = sqlBasicCall.getOperandList().get(1).toString();
					}
				}
				

				if (!StringUtils.hasLength(strName)) {
					strName = selectNode.toString();
				}

				if (columnMap.containsKey(strName.toUpperCase())) {
					selectSqlNodeList.add(selectNode);
				}
			}

			sqlNodeList.clear();
			sqlNodeList.addAll(selectSqlNodeList);

			return sqlSelect.toSqlString(CommonSqlDialect.DEFAULT).getSql();
		} catch (Throwable ex) {
			throw new Exception(String.format("重新构建查询语句发生异常，%1$s", ex.getMessage()), ex);
		}
	}

}
