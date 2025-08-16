package net.ibizsys.central.res;

import java.io.File;
import java.util.HashMap;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ZipUtils;

public class SysZipFileResourceRuntime extends SysFileResourceRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysZipFileResourceRuntime.class);
	

	@Override
	protected void prepareDefaultFile() throws Exception {
	
		String strResourceUri = this.getResourceUri();
		if(!StringUtils.hasLength(strResourceUri)) {
			strResourceUri = this.getContent();
		}
		if(!StringUtils.hasLength(strResourceUri)) {
			throw new Exception("未指定Zip文件路径");
		}
		
		//重新计算路径
		
		Expression exp = DefaultParser.parseExpression(strResourceUri, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(new HashMap<String, Object>());
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		String strRealResourceUri = (String) exp.getValue(context);

		if(!strResourceUri.equals(strRealResourceUri)) {
			return;
		}
		
		
		String[] items = strResourceUri.split("[#]");
		String url = items[0];
		File tempFile = File.createTempFile("resource", ".zip");
		try {
			this.getSystemRuntime().getDefaultWebClient().download(url, tempFile);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
		}
		
		String folderPath = tempFile.getParentFile().getAbsolutePath() + File.separator + KeyValueUtils.genUniqueId();
		File folder = new File(folderPath);
		ZipUtils.unzip(tempFile, folder);
		
		if(items.length == 2 && StringUtils.hasLength(items[1])) {
			folder = new File(folder.getAbsolutePath() + File.separator + items[1]);
		}

		this.setDefaultFile(folder);
		this.setDefaultFileMode(true);
		
		//super.prepareFile();
	}
	
}
