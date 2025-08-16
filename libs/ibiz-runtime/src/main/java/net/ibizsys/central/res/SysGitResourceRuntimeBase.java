package net.ibizsys.central.res;

import java.io.File;
import java.util.HashMap;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.StringUtils;

public abstract class SysGitResourceRuntimeBase extends SysSCMResourceRuntimeBase implements ISysGitResourceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysGitResourceRuntimeBase.class);
	
	private String strProject = null;
	private String strBranch = null;
	
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		
	}
	
	@Override
	protected void setResourceUri(String strResourceUri) {
		if(StringUtils.hasLength(strResourceUri)) {
			String[] items = strResourceUri.split("[/]");
			String strProject = items[items.length-1];
			String strBranch = null;
			String[] items2 = strProject.split("[@]");
			if(items2.length == 2) {
				strProject = strProject.substring(0, strProject.length() - items2[1].length() - 1);
				strResourceUri = strResourceUri.substring(0, strResourceUri.length() - items2[1].length() - 1);
				strBranch = items2[1];
			}
			else {
				strBranch = "master";
			}
			
			if(strProject.indexOf(".git") == strProject.length() -4 ) {
				strProject = strProject.substring(0, strProject.length() -4);
			}
			
			super.setResourceUri(strResourceUri);
			this.setProject(strProject);
			this.setBranch(strBranch);
		}
		else {
			super.setResourceUri(null);
			this.setProject(null);
			this.setBranch(null);	
		}
	}
	
	@Override
	protected void prepareDefaultFile() throws Exception {
		if(!StringUtils.hasLength(this.getResourceUri())) {
			throw new Exception(String.format("未指定Git仓库地址"));
		}
		
		if(!StringUtils.hasLength(this.getPSSysResource().getResTag())) {
			throw new Exception(String.format("未指定资源标记"));
		}
		
		
		Expression exp = DefaultParser.parseExpression(this.getResourceUri(), DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(new HashMap<String, Object>());
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		String strRealResourceUri = (String) exp.getValue(context);

		if(!this.getResourceUri().equals(strRealResourceUri)) {
			return;
		}
		
		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s%2$s%6$s"
				, this.getSystemRuntime().getFileFolder() 
				, File.separator 
				, "resources"
				, this.getPSSysResource().getResTag()
				, this.getProject() 
				, this.getBranch());
		
		this.setDefaultFile(new File(strFilePath));
		this.setDefaultFileMode(true);

		this.checkout(null);
	}
	
	public String getProject() {
		return this.strProject;
	}
	
	protected void setProject(String strProject) {
		this.strProject = strProject;
	}
	
	public String getBranch() {
		return this.strBranch;
	}
	
	protected void setBranch(String strBranch) {
		this.strBranch = strBranch;
	}
	
	
	
	protected String getProject(Object target) {
		String strProject = this.getProject();
		if(target == null 
				|| this.isDefaultFileMode()
				|| !StringUtils.hasLength(strProject) ) {
			return strProject;
		}
		
		Expression exp = DefaultParser.parseExpression(strProject, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(target);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
	
	protected String getBranch(Object target) {
		String strBranch = this.getBranch();
		if(target == null 
				|| this.isDefaultFileMode()
				|| !StringUtils.hasLength(strBranch) ) {
			return strBranch;
		}
		
		Expression exp = DefaultParser.parseExpression(strBranch, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(target);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
	
	protected String getClientId(Object target) {
		String strClientId = this.getClientId();
		if(target == null 
				|| this.isDefaultFileMode()
				|| !StringUtils.hasLength(strClientId) ) {
			return strClientId;
		}
		
		Expression exp = DefaultParser.parseExpression(strClientId, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(target);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
	
	
	protected String getClientSecret(Object target) {
		String strClientSecret = this.getClientSecret();
		if(target == null 
				|| this.isDefaultFileMode()
				|| !StringUtils.hasLength(strClientSecret) ) {
			return strClientSecret;
		}
		
		Expression exp = DefaultParser.parseExpression(strClientSecret, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(target);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
	
	@Override
	protected File onGetFile(Object target) throws Throwable {
		
		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s%2$s%6$s"
				, this.getSystemRuntime().getFileFolder() 
				, File.separator 
				, "resources"
				, this.getPSSysResource().getResTag()
				, this.getProject(target) 
				, this.getBranch(target));
		
		return new File(strFilePath);
	}
	
}
