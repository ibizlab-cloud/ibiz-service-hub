package net.ibizsys.central.dataentity.ds;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;

public abstract class DEDQSQLSelectParserBase implements IDEDQSQLSelectParser {

	private static final Log log = LogFactory.getLog(DEDQSQLCustomCondParserBase.class);
	private final static Pattern Regex = Pattern.compile("#(\\{.*?\\})");
	
	protected Pattern getPattern() {
		return DEDQSQLSelectParserBase.Regex;
	}

	protected String getRealSQLCode(String strSQL) {
		Matcher matcher = getPattern().matcher(strSQL);
		
		// 查找匹配的结果
		Map<String, String> replaceContentMap = new LinkedHashMap<>();
		while (matcher.find()) {
			// 提取 JSON 内容
			String json = matcher.group(1);
			replaceContentMap.put(String.format("#%1$s", json), "REPLACE_FUNC");
			
		}

		if (replaceContentMap.size() > 0) {
			// 形成新内容
			for (java.util.Map.Entry<String, String> entry : replaceContentMap.entrySet()) {
				strSQL = strSQL.replace(entry.getKey(), entry.getValue());
			}
		}
		
		return strSQL;
	}
	
	@Override
	public String reselect(String strSQL, Set<String> columnList, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime) throws Throwable {
		Assert.hasLength(strSQL, "传入分析SQL无效");
		Assert.notEmpty(columnList, "传入重新选择列列表无效");
		Assert.notNull(iDBDialect, "传入数据库设配器对象无效");
		try {
			return this.onReselect(strSQL, columnList, iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime);
		}
		catch (Throwable ex) {
			//throw new RuntimeException(arg0);
			throw ex;
		}
	}
	
	protected abstract String onReselect(String strSQL, Set<String> columnList, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime) throws Throwable;
	
}
