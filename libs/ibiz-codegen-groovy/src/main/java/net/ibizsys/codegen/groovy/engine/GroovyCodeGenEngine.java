package net.ibizsys.codegen.groovy.engine;

import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import groovy.lang.GroovyClassLoader;
import net.ibizsys.codegen.core.engine.ICodeGenEngine;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSSystem;

public class GroovyCodeGenEngine extends GroovyCodeGenEngineBase{

	private static final Log log = LogFactory.getLog(GroovyCodeGenEngine.class);
	private static Random random = new Random();
	
	private static GroovyClassLoader groovyClassLoader = new GroovyClassLoader(GroovyCodeGenEngine.class.getClassLoader());
	
	
	public final static String ENGINEFILE = "engine.groovy";
	
	private ICodeGenEngine realCodeGenEngine = null;
	
	@Override
	protected void onInit() throws Exception {
		
		String strEngineContent = this.getTemplateContent(ENGINEFILE, true);
		if(StringUtils.hasLength(strEngineContent)) {
			prepareRealCodeGenEngine(strEngineContent);
		}
		
		super.onInit();
	}
	
	protected void prepareRealCodeGenEngine(String strEngineContent) throws Exception{
		
		//判断代码中是否有包信息
		if(strEngineContent.indexOf("package ") == -1) {
			String strAutoPackage = String.format("package net.ibizsys.codegen.groovy.engine.a%1$s\r\n", random.nextInt(99999999));
			strEngineContent = strAutoPackage + strEngineContent;
		}
		
		Class engineObjectClass = groovyClassLoader.parseClass(strEngineContent);
		Object engineObject = engineObjectClass.newInstance();
		if(!(engineObject instanceof ICodeGenEngine)) {
			throw new Exception("对象类型不正确");
		}
		
		ICodeGenEngine realCodeGenEngine = (ICodeGenEngine)engineObject;
		realCodeGenEngine.init(this.getTemplatePath(),  this.isTemplateFromResource(), this.getParams());
		this.setRealCodeGenEngine(realCodeGenEngine);
	}
	
	protected void setRealCodeGenEngine(ICodeGenEngine realCodeGenEngine) {
		this.realCodeGenEngine = realCodeGenEngine;
	}
	
	protected ICodeGenEngine getRealCodeGenEngine() {
		return this.realCodeGenEngine;
	}
	
	
	@Override
	protected void onOutput(IPSSystem iPSSystem, String strOutputPath, Object[] filters, Map<String, IPSModelObject> fileMap, boolean bIgnoreException) throws Exception {
		if(this.getRealCodeGenEngine() != null) {
			this.getRealCodeGenEngine().output(iPSSystem, strOutputPath, filters, fileMap, bIgnoreException);
			return;
		}
		
		super.onOutput(iPSSystem, strOutputPath, filters, fileMap, bIgnoreException);
	}
}
