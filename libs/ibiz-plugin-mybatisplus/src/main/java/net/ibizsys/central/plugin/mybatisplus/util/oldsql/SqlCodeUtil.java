package net.ibizsys.central.plugin.mybatisplus.util.oldsql;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * SQL 代码辅助对象
 * 
 * @author Administrator
 *
 */
public class SqlCodeUtil {
	
	private static final Log log = LogFactory.getLog(SqlCodeUtil.class);

	private static DataContextMethod dataContextMethod = new DataContextMethod();
	private static SessionContextMethod sessionContextMethod = new SessionContextMethod();
	private static SystemContextMethod systemContextMethod = new SystemContextMethod();
	private static WebContextMethod webContextMethod = new WebContextMethod();

	private static Map<String, Object> params = new HashMap<String, Object>();
	static {
		params.put("srfdatacontext", dataContextMethod);
		params.put("srfsessioncontext", sessionContextMethod);
		params.put("srfsessionvalue", sessionContextMethod);
		params.put("srfsystemcontext", systemContextMethod);
		params.put("srfwebcontext", webContextMethod);
	}
	
	private static Configuration config = new Configuration();
		
	public static String parse(String strCode) throws Exception{
		
		strCode = strCode.replace("#{ew.paramNameValuePairs.", "__SRF__EW_PARAMNAMEVALUEPAIRS__");
		strCode = strCode.replace("#{ctx.", "__SRF__CTX__");

		
		SimpleTemplateLoader deTemplateLoader = new SimpleTemplateLoader(strCode);
		config.setTemplateLoader(deTemplateLoader);
			
		try {
			Template template = config.getTemplate("");
			StringWriter sw = new StringWriter();
			template.process(params, sw);
			strCode =  sw.toString();
			
			strCode = strCode.replace("__SRF__CTX__", "#{ctx.");
			return strCode.replace("__SRF__EW_PARAMNAMEVALUEPAIRS__", "#{ew.paramNameValuePairs.");
		} catch (IOException e) {
			throw new Exception(e);
		} catch (TemplateException e) {
			throw new Exception(e);
		}
	}
	
}
