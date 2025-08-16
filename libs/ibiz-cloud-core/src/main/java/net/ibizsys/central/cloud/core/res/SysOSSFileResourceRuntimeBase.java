package net.ibizsys.central.cloud.core.res;

import java.io.File;
import java.util.HashMap;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.res.SysFileResourceRuntimeBase;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ZipUtils;

public abstract class SysOSSFileResourceRuntimeBase extends SysFileResourceRuntimeBase implements ISysOSSFileResourceRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysOSSFileResourceRuntimeBase.class);
	private ISysOSSUtilRuntime iSysOSSUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		if(this.getSysOSSUtilRuntime(true) == null) {
			this.prepareSysOSSUtilRuntime();
			this.getSysOSSUtilRuntime(false);
		}
	}
	
	protected ISysOSSUtilRuntime getSysOSSUtilRuntime(boolean bTryMode) throws Exception{
		if(this.iSysOSSUtilRuntime != null || bTryMode) {
			return this.iSysOSSUtilRuntime;
		}
		throw new Exception("未指定系统OSS功能运行时对象");
	}
	
	protected void setSysOSSUtilRuntime(ISysOSSUtilRuntime iSysOSSUtilRuntime) {
		this.iSysOSSUtilRuntime = iSysOSSUtilRuntime;
	}
	
	protected void prepareSysOSSUtilRuntime() throws Exception {
		this.setSysOSSUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false));
	}
	
	@Override
	protected void prepareDefaultFile() throws Exception {
	
		String strResourceUri = this.getResourceUri();
		if(!StringUtils.hasLength(strResourceUri)) {
			strResourceUri = this.getContent();
		}
		if(!StringUtils.hasLength(strResourceUri)) {
			throw new Exception("未指定CloudOSS资源标识");
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
		String[] ids = items[0].split("[/]");
		net.ibizsys.runtime.util.domain.File ossFile = this.getSysOSSUtilRuntime(false).getOSSFile(ids[0], ids.length==2?ids[1]:null, true);
		if (ossFile == null) {
			throw new Exception(String.format("指定OSS文件[%1$s]不存在", items[0]));
		}
		
		File file = new File(ossFile.getLocalPath());

		if(items.length == 2 && StringUtils.hasLength(items[1])) {
			File tempFile = File.createTempFile("resource", ".zip");
			String folderPath = tempFile.getParentFile().getAbsolutePath() + File.separator + KeyValueUtils.genUniqueId();
			File folder = new File(folderPath);
			ZipUtils.unzip(file, folder);
			
			if(items.length == 2 && StringUtils.hasLength(items[1])) {
				folder = new File(folder.getAbsolutePath() + File.separator + items[1]);
			}
			
			this.setDefaultFile(folder);
		}
		else {
			this.setDefaultFile(file);
		}
		
		this.setDefaultFileMode(true);
		
		//super.prepareFile();
	}
}
