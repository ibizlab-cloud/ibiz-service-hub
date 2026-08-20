package net.ibizsys.central.cloud.core.util.freemarker;

import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.ibizsys.codegen.core.util.JavaTypeUtils;

public class LanguageUtilsMethod implements TemplateMethodModelEx {

	private final static LanguageUtilsMethod javaTypeMethod = new LanguageUtilsMethod(LanguageUtilsMethod.LANGUAGE_JAVA);
	
	final String strLanguage;
	public LanguageUtilsMethod(String strLanguage) {
		this.strLanguage = strLanguage; 
	}
	
	public final static String LANGUAGE_JAVA = "JAVA";
   
    
	
    public static LanguageUtilsMethod getJavaTypeMethod() {
    	return LanguageUtilsMethod.javaTypeMethod;
    }
    
    
    public static void registerSharedVariables(Configuration config) {
    	config.setSharedVariable("srf_java_type", getJavaTypeMethod());
    }
	
	
	
	
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        // 1. 检查参数
        if (arguments.isEmpty()) {
            throw new TemplateModelException("Error: Missing argument");
        }

        // 2. 获取并处理第一个参数（期望是字符串）
        int nDataType = Integer.parseInt(String.valueOf(arguments.get(0)));
		boolean bFull = true;
		if(arguments.size() >1) {
			bFull = arguments.get(1).toString().equals("true");
		}
		
		if(LanguageUtilsMethod.LANGUAGE_JAVA.equals(this.strLanguage)) {
			return JavaTypeUtils.getJavaType(nDataType, bFull);
		}
		
        throw new TemplateModelException("未识别的开发语言");
    }

}
