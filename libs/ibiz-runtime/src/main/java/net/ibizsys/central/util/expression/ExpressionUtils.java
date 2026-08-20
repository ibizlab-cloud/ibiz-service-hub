package net.ibizsys.central.util.expression;

import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.Assert;

public class ExpressionUtils {
	
	protected static final TemplateParserContext DefaultTemplateParserContext = new TemplateParserContext("{", "}");
	protected static final SpelExpressionParser DefaultParser = new SpelExpressionParser();
	protected static final PropertyMapAccessor DefaultPropertyMapAccessor = new PropertyMapAccessor("__UNKNOWN__");
	protected static final String METHOD_DATE_FMT = "date_fmt";
	protected static final DateFormatter DEFAULT_DATE_FORMATTER = new DateFormatter();

	 
	public static String getValue(String strExpression, Object data) {
		Assert.hasLength(strExpression, "传入表达式无效");
		Assert.notNull(data, "传入上下文数据无效");
		
		Expression exp = DefaultParser.parseExpression(strExpression, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(data);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		context.setVariable(METHOD_DATE_FMT, DEFAULT_DATE_FORMATTER); // 使用单例
		return (String) exp.getValue(context);
	}
}
