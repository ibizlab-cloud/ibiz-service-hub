package net.ibizsys.central.res;

import java.io.File;

import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.expression.PropertyMapAccessor;
import net.ibizsys.runtime.util.IAction;

public abstract class SysFileResourceRuntimeBase extends SysResourceRuntimeBase implements ISysFileResourceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysFileResourceRuntimeBase.class);

	protected static TemplateParserContext DefaultTemplateParserContext = new TemplateParserContext("{", "}");
	protected static SpelExpressionParser DefaultParser = new SpelExpressionParser();
	protected static PropertyMapAccessor DefaultPropertyMapAccessor = new PropertyMapAccessor("__UNKNOWN__");

	private File defaultFile = null;
	private boolean bDefaultFileMode = false;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (this.getDefaultFile(true) == null) {
			this.prepareDefaultFile();
		}
	}

	/**
	 * 准备文件对象
	 * 
	 * @throws Exception
	 */
	protected void prepareDefaultFile() throws Exception {

	}

	protected File getDefaultFile(boolean bTryMode) throws Exception {
		if (this.defaultFile != null || bTryMode) {
			return this.defaultFile;
		}
		throw new Exception("未指定默认文件");
	}

	protected void setDefaultFile(File defaultFile) {
		this.defaultFile = defaultFile;
	}

	@Override
	public File getFile(Object target) {
		return (File) this.executeAction("获取文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				if (isDefaultFileMode()) {
					return getDefaultFile(false);
				}
				return onGetFile(target);
			}
		}, null);
	}

	protected File onGetFile(Object target) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public boolean hasFile(Object target) {
		if(target == null && !isDefaultFileMode()) {
			return false;
		}
		return true;
	}

	public boolean isDefaultFileMode() {
		return this.bDefaultFileMode;
	}

	protected void setDefaultFileMode(boolean bDefaultFileMode) {
		this.bDefaultFileMode = bDefaultFileMode;
	}

	protected String getResourceUri(Object target) {
		String strResourceUri = this.getResourceUri();
		if(target == null 
				|| this.isDefaultFileMode()
				|| !StringUtils.hasLength(strResourceUri) ) {
			return strResourceUri;
		}
		
		Expression exp = DefaultParser.parseExpression(strResourceUri, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(target);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
}
