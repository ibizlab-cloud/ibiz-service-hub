package net.ibizsys.central.cloud.core.util.freemarker;

import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import net.ibizsys.codegen.core.util.CodeNameUtils;

public class CodeNameUtilsMethod implements TemplateMethodModelEx {

	private final static CodeNameUtilsMethod lowerUnderscoreMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_LOWER_UNDERSCORE);
	private final static CodeNameUtilsMethod upperUnderscoreMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_UPPER_UNDERSCORE);
	private final static CodeNameUtilsMethod lowerCamelMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_LOWER_CAMEL);
	private final static CodeNameUtilsMethod upperCamelMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_UPPER_CAMEL);
	private final static CodeNameUtilsMethod lowerMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_LOWER);
	private final static CodeNameUtilsMethod upperMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_UPPER);
	private final static CodeNameUtilsMethod lowerHyphenMethod = new CodeNameUtilsMethod(CodeNameUtilsMethod.CODENAMEMODE_LOWER_HYPHEN);
	
	final String strMode;
	public CodeNameUtilsMethod(String strMode) {
		this.strMode = strMode; 
	}
	
	/**
     *  小写（下划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_UNDERSCORE = "LOWER_UNDERSCORE";
    /**
     *  大写（下划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER_UNDERSCORE = "UPPER_UNDERSCORE";
    /**
     *  驼峰（首字母小写），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_CAMEL = "LOWER_CAMEL";
    /**
     *  驼峰（首字母大写），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER_CAMEL = "UPPER_CAMEL";
    /**
     *  小写（直接，不做转化），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER = "LOWER";
    /**
     *  大写（直接，不做转化），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_UPPER = "UPPER";
    /**
     *  小写（中划线分隔），注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CODENAMEMODE_LOWER_HYPHEN = "LOWER_HYPHEN";
    
	
    public static CodeNameUtilsMethod getLowerUnderscoreMethod() {
    	return CodeNameUtilsMethod.lowerUnderscoreMethod;
    }
    
    public static CodeNameUtilsMethod getUpperUnderscoreMethod() {
    	return CodeNameUtilsMethod.upperUnderscoreMethod;
    }
    
    public static CodeNameUtilsMethod getLowerCamelMethod() {
    	return CodeNameUtilsMethod.lowerCamelMethod;
    }
    
    public static CodeNameUtilsMethod getUpperCamelMethod() {
    	return CodeNameUtilsMethod.upperCamelMethod;
    }
    
    public static CodeNameUtilsMethod getLowerMethod() {
    	return CodeNameUtilsMethod.lowerMethod;
    }
    
    public static CodeNameUtilsMethod getUpperMethod() {
    	return CodeNameUtilsMethod.upperMethod;
    }
    
    public static CodeNameUtilsMethod getLowerHyphenMethod() {
    	return CodeNameUtilsMethod.lowerHyphenMethod;
    }
    
    public static void registerSharedVariables(Configuration config) {
    	config.setSharedVariable("srf_lower_underscore", getLowerUnderscoreMethod());
    	config.setSharedVariable("srf_upper_underscore", getUpperUnderscoreMethod());
    	config.setSharedVariable("srf_lower_camel", getLowerCamelMethod());
    	config.setSharedVariable("srf_upper_camel", getUpperCamelMethod());
    	config.setSharedVariable("srf_lower_hyphen", getLowerHyphenMethod());
    }
	
	
	
	
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        // 1. 检查参数
        if (arguments.isEmpty()) {
            throw new TemplateModelException("Error: Missing argument");
        }

        // 2. 获取并处理第一个参数（期望是字符串）
        String input = arguments.get(0).toString();
        return CodeNameUtils.to(this.strMode, input);
    }
}
