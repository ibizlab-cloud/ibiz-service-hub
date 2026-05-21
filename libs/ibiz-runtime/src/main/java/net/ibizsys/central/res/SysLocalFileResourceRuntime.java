package net.ibizsys.central.res;

import java.io.File;
import java.util.HashMap;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.StringUtils;

public class SysLocalFileResourceRuntime extends SysFileResourceRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysLocalFileResourceRuntime.class);
	

	@Override
	protected void prepareDefaultFile() throws Exception {
	
		String strResourceUri = this.getResourceUri();
		if(!StringUtils.hasLength(strResourceUri)) {
			strResourceUri = this.getContent();
		}
		if(!StringUtils.hasLength(strResourceUri)) {
			throw new Exception("未指定本地文件路径");
		}
		
		//重新计算路径
		
		Expression exp = DefaultParser.parseExpression(strResourceUri, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(new HashMap<String, Object>());
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		String strRealResourceUri = (String) exp.getValue(context);

		if(!strResourceUri.equals(strRealResourceUri)) {
			return;
		}

		this.setDefaultFile(new File(strResourceUri));
		this.setDefaultFileMode(true);
		
		//super.prepareFile();
	}
	
}
