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
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchCustomCond;

public abstract class DEDQSQLCustomCondParserBase implements IDEDQSQLCustomCondParser {

	private static final Log log = LogFactory.getLog(DEDQSQLCustomCondParserBase.class);

	private final static Pattern DynaCondRegex = Pattern.compile("\\#(\\{.*?\\})");

	protected Pattern getDynaCondPattern() {
		return DEDQSQLCustomCondParserBase.DynaCondRegex;
	}

	protected String getRealSQLCode(String strSQL) {
		Matcher matcher = getDynaCondPattern().matcher(strSQL);

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
	public String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext) throws Throwable {
		return this.parse(iSearchCustomCond, iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, null);
	}
	
	
	
	@Override
	public String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params) throws Throwable {
		return this.parse(iSearchCustomCond, iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, params, null);
	}



	@Override
	public String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params, Set<String> relatedColumnList) throws Throwable {
		Assert.notNull(iSearchCustomCond, "传入自定义条件对象无效");
		Assert.hasLength(iSearchCustomCond.getCustomCond(), "传入自定义条件对象条件无效");
		Assert.notNull(iDBDialect, "传入数据库设配器对象无效");
		try {
//			if(params == null && iSearchContext != null) {
//				params = iSearchContext.any();
//			}
			return this.onParse(iSearchCustomCond, iDBDialect, iDataEntityRuntime, iDEDataQueryCodeRuntime, iSearchContext, params, relatedColumnList);
		}
		catch (Throwable ex) {
			//throw new RuntimeException(arg0);
			throw ex;
		}
	}

	protected abstract String onParse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params, Set<String> relatedColumnList) throws Throwable;
}
