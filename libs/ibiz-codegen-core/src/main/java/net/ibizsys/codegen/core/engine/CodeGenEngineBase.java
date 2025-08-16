package net.ibizsys.codegen.core.engine;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSObject;
import net.ibizsys.model.IPSSystem;

public abstract class CodeGenEngineBase implements ICodeGenEngine{

	private static final Log log = LogFactory.getLog(CodeGenEngineBase.class);
	
	private String strTemplatePath = null;
	private boolean bTemplateFromResource = false;
	private Map<String, String> templateAliasMap = new HashMap<String, String>();
	private Map<String, Object> params = new HashMap<String, Object>();
	
	private ICodeGenEngineContext iCodeGenEngineContext = new ICodeGenEngineContext() {

		@Override
		public String output(IPSObject iPSObject, String strTemplateId) throws Exception {
			return output(iPSObject, strTemplateId, null, null);
		}

		@Override
		public String output(IPSObject iPSObject, String strTemplateId, String strIndent) throws Exception {
			return this.output(iPSObject, strTemplateId, null, strIndent);
		}
		
		
		@Override
		public String output(IPSObject iPSObject, String strTemplateId, Map<String, Object> params) throws Exception {
			return this.output(iPSObject, strTemplateId, params, null);
		}

		@Override
		public String output(IPSObject iPSObject, String strTemplateId, Map<String, Object> params, String strIndent) throws Exception {
			String strContent = getContent(iPSObject, strTemplateId, params);
			if(!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
				return strContent;
			}
			
			StringBuilder stringBuilder = new StringBuilder();
			String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
			for(int i =0;i<lines.length;i++) {
				if(i != 0) {
					stringBuilder.append("\n");
				}
				stringBuilder.append(strIndent);
				if(StringUtils.hasLength(lines[i])) {
					stringBuilder.append(lines[i]);
				}
			}
			return stringBuilder.toString();
		}

		@Override
		public boolean contains(String strTemplateId) {
			try {
				return StringUtils.hasLength(getTemplateContent(strTemplateId, true));
			}
			catch (Exception ex) {
				return false;
			}
			
		}
	};
	
	@Override
	public void init(String strTemplatePath, boolean bFromResource, Map<String, Object> params) throws Exception {
		this.setTemplatePath(strTemplatePath);
		this.setTemplateFromResource(bFromResource);
		if(params != null) {
			this.params.putAll(params);
		}
		this.onInit();
	}
	
	protected void onInit() throws Exception{
		
	}
	
	@Override
	public String getTemplatePath() {
		return this.strTemplatePath;
	}
	
	
	protected void setTemplatePath(String strTemplatePath) {
		this.strTemplatePath = strTemplatePath;
	}
	
	
	public boolean isTemplateFromResource() {
		return this.bTemplateFromResource;
	}
	
	protected void setTemplateFromResource(boolean bTemplateFromResource) {
		this.bTemplateFromResource = bTemplateFromResource;
	}
	
	protected Map<String, Object> getParams() {
		return this.params;
	}
	
	protected ICodeGenEngineContext getContext() {
		return this.iCodeGenEngineContext;
	}
	
	protected void registerTemplateAlias(String strAlias, String strTemplateId) {
		this.templateAliasMap.put(strAlias, strTemplateId);
	}
	
	protected boolean unregisterTemplateAlias(String strAlias, String strTemplateId) {
		return this.templateAliasMap.remove(strAlias, strTemplateId);
	}
	
	protected String getRealTemplateId(String strTemplateId) {
		String strRealTemplateId = this.templateAliasMap.get(strTemplateId);
		if(StringUtils.hasLength(strRealTemplateId)) {
			return strRealTemplateId;
		}
		return strTemplateId;
	}
	
	
	
	/**
	 * 获取模板内容
	 * @param strTemplateId
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected String getTemplateContent(String strTemplateId, boolean bTryMode) throws Exception{
		String strRealTemplateId = this.getRealTemplateId(strTemplateId);
		if(!StringUtils.hasLength(strRealTemplateId)) {
			throw new Exception(String.format("传入模板标识[%1$s]无效", strTemplateId));
		}
		
		if(this.isTemplateFromResource()) {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId.replace("\\", "/");
			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
			if(is != null) {
				return IOUtils.toString(is, "UTF-8");
			}
			
			if(bTryMode) {
				return null;
			}
		}
		else {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId;
			File file = new File(strFullModelPath);
			if(file.exists()) {
				return FileUtils.readFileToString(file, "UTF-8");
			}
			
			if(bTryMode) {
				return null;
			}
		}
		
		
		throw new Exception(String.format("指定模板[%1$s]不存在", strTemplateId));
		
	}


	
	@Override
	public void output(IPSSystem iPSSystem, String strOutputPath, Object[] filters, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception {
		this.onOutput(iPSSystem, strOutputPath, filters, fileMap, bIgnoreException);
	}

	protected void onOutput(IPSSystem iPSSystem, String strOutputPath, Object[] filters, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception {
		throw new Exception("没有实现");
	}
	
//	protected boolean output(IPSModelObject iPSObject, String strTemplateId, String strDestFilePath) throws Exception{
//		return this.output(iPSObject, strTemplateId, strDestFilePath, null, false);
//	}
	
	protected boolean output(IPSModelObject iPSObject, String strTemplateId, String strDestFilePath, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception{
		
		String strContent = null;
		try {
			strContent = this.getContent(iPSObject, strTemplateId);
		}
		catch (Exception ex) {
			if(!bIgnoreException) {
				throw ex;
			}
			strContent = ex.getMessage();
		}
		
		File file = new File(strDestFilePath);
		
		if(StringUtils.hasLength(strContent) && file.exists()) {
			String strLastContent = FileUtils.readFileToString(file, "UTF-8");
			if(strContent.equals(strLastContent)) {
				if(fileMap !=null) {
					fileMap.put(strDestFilePath, iPSObject);
				}
				return false;
			}
		}
		
		FileUtils.writeStringToFile(file, strContent, "UTF-8", false);
		log.debug(String.format("写入[%1$s]模板[%2$s]", strDestFilePath, strTemplateId));
		
		if(fileMap !=null) {
			fileMap.put(strDestFilePath, iPSObject);
		}
		
		return true;
	}
	
	
	protected boolean outputRaw(IPSModelObject iPSObject, String strContent, String strDestFilePath, Map<String, IPSModelObject> fileMap) throws Exception{
		
		File file = new File(strDestFilePath);
		
		if(StringUtils.hasLength(strContent) && file.exists()) {
			String strLastContent = FileUtils.readFileToString(file, "UTF-8");
			if(strContent.equals(strLastContent)) {
				if(fileMap !=null) {
					fileMap.put(strDestFilePath, iPSObject);
				}
				return false;
			}
		}
		
		FileUtils.writeStringToFile(file, strContent, "UTF-8", false);
		
		if(fileMap !=null) {
			fileMap.put(strDestFilePath, iPSObject);
		}
		
		return true;
	}

	
	
	@Override
	public String getContent(IPSObject iPSObject, String strTemplateId) throws Exception{
		return getContent(iPSObject, strTemplateId, null);
	}
	
	@Override
	public String getContent(IPSObject iPSObject, String strTemplateId, Map<String, Object> params) throws Exception{
		throw new Exception("没有实现");
	}
	
	protected boolean testOutput(IPSModelObject iPSModelObject, Object[] filters) throws Exception{
		if(filters == null || filters.length == 0) {
			return true;
		}
		
		for(Object filter : filters) {
			if(filter instanceof Pattern) {
				if(((Pattern)filter).matcher(iPSModelObject.getId()).matches()) {
					return true;
				}
				continue;
			}
			if(filter instanceof String) {
				if(((String)filter).equalsIgnoreCase(iPSModelObject.getId())) {
					return true;
				}
				continue;
			}
			
			throw new Exception(String.format("未支持的过滤项[%1$s]", filter));
		}
		
		return false;
	}
	
	
}
