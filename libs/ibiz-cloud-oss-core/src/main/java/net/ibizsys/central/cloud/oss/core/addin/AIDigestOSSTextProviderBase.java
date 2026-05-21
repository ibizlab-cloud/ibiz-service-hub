package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * AI 摘要OSS文本提供器对象基类
 * @author lionlau
 *
 */
public abstract class AIDigestOSSTextProviderBase extends OSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AIDigestOSSTextProviderBase.class);
	
	private Map<String, Object> aiDigestParams = new ConcurrentHashMap<String, Object>();
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		this.getContext().getSettings("aidigest", this.aiDigestParams);
		super.onInit();
	}
	
	@Override
	protected void onReloadSetting() throws Throwable {
		this.aiDigestParams.clear();
		this.getContext().getSettings("aidigest", this.aiDigestParams);
		super.onReloadSetting();
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if(this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}
	
	
	@Override
	public String getText(String cat, String fileId, File file, String type, Map<String, Object> params) throws Throwable{
		String text = super.getText(cat, fileId, file, type, params);
		String aidigest = params!=null?(String)params.get(PARAM_AIDIGEST):null;
		if(ObjectUtils.isEmpty(aidigest) || aidigest.equalsIgnoreCase("false")) {
			//未指定摘要模式
			return text;
		}
		
		if(aidigest.equalsIgnoreCase("true")) {
			aidigest = "default";
		}
		
		return onGetAIDigestText(cat, fileId, file, type, text, aidigest, params);
	}
	
	
	protected String onGetAIDigestText(String cat, String fileId, File file, String type, String text, String aidigest, Map<String, Object> params) throws Throwable {
		boolean rebuild = false;
		if(params != null) {
			rebuild = DataTypeUtils.asBoolean(params.get(PARAM_REBUILD), rebuild);
		}
		
		//判断文本文件是否已经存在
		File folder = this.getTextFolder(file,  type);
		File textFile = new File(folder.getAbsolutePath() + File.separator + file.getName() + "." + aidigest + "." + type);
		if(rebuild && textFile.exists()) {
			textFile.delete();
		}
		if(!textFile.exists()) {
			Object ret = this.doGetAIDigestText(cat, fileId, file, type, text, aidigest, params, textFile);
			if(ret instanceof String) {
				String strText = (String)ret;
				FileUtils.writeStringToFile(textFile, strText, "utf-8");
				return strText;
			}
		}
		
		return FileUtils.readFileToString(textFile, "utf-8");
	}
	
	
	protected Object doGetAIDigestText(String cat, String fileId, File file, String type, String text, String aidigest, Map<String, Object> params, File textFile) throws Throwable {
		throw new Exception("没有实现");
	}
	
}
