package net.ibizsys.central.util.expression;

import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.util.Assert;

public class ExpressionUtils {
	
	protected static TemplateParserContext DefaultTemplateParserContext = new TemplateParserContext("{", "}");
	protected static SpelExpressionParser DefaultParser = new SpelExpressionParser();
	protected static PropertyMapAccessor DefaultPropertyMapAccessor = new PropertyMapAccessor("__UNKNOWN__");
	
	public static String getValue(String strExpression, Object data) {
		Assert.hasLength(strExpression, "传入表达式无效");
		Assert.notNull(data, "传入上下文数据无效");
		
		Expression exp = DefaultParser.parseExpression(strExpression, DefaultTemplateParserContext);
		StandardEvaluationContext context = new StandardEvaluationContext(data);
		context.addPropertyAccessor(DefaultPropertyMapAccessor);
		
		return (String) exp.getValue(context);
	}
}
