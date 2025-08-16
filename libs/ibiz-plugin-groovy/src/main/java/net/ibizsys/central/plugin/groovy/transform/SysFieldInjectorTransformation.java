package net.ibizsys.central.plugin.groovy.transform;

//SysFieldInjectorTransformation.java
import org.codehaus.groovy.ast.*;
import org.codehaus.groovy.ast.expr.*;
import org.codehaus.groovy.transform.*;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.syntax.SyntaxException;
import org.codehaus.groovy.control.CompilePhase;

import java.lang.reflect.Modifier;
import java.util.List;

@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
public class SysFieldInjectorTransformation implements ASTTransformation {

	@Override
	public void visit(ASTNode[] nodes, SourceUnit source) {
		//AnnotationNode annotation = (AnnotationNode) nodes[0];
		//AnnotatedNode target = (AnnotatedNode) nodes[1];

//		 AnnotatedNode targetClass = (AnnotatedNode) nodes[1];
//	     AnnotationNode logAnnotation = (AnnotationNode) nodes[0];
	        
		if (nodes.length >= 2 && nodes[1] instanceof ClassNode) {
			handleClass((ClassNode) nodes[1], source);
		}
	}

	private void handleClass(ClassNode classNode, SourceUnit source) {
		MethodNode targetMethod = findInheritedMethod(classNode, "getSystemRuntime");
		if (targetMethod == null) {
			source.addError(new SyntaxException("基类中未找到 getSystemRuntime 方法", classNode.getLineNumber(), classNode.getColumnNumber()));
			return;
		}

		injectSysField(classNode, targetMethod.getReturnType(), source);
	}

	private MethodNode findInheritedMethod(ClassNode classNode, String methodName) {
		ClassNode current = classNode;
		while (!current.equals(ClassHelper.OBJECT_TYPE)) {
			MethodNode method = current.getDeclaredMethod(methodName, Parameter.EMPTY_ARRAY);
			if (method != null) {
				return method;
			}
			current = current.getSuperClass();
		}
		return null;
	}

	private void injectSysField(ClassNode classNode, ClassNode returnType, SourceUnit source) {
		final String fieldName = "sys";

		// 检查字段是否已存在
		List<FieldNode> fields = classNode.getFields();
		for (FieldNode field : fields) {
			if (fieldName.equals(field.getName())) {
				return;
			}
		}

		// 构建方法调用表达式: this.getSystemRuntime()
		Expression initExpression = new MethodCallExpression(new VariableExpression("this"), "getSystemRuntime", ArgumentListExpression.EMPTY_ARGUMENTS);

		// 创建字段节点
		FieldNode field = new FieldNode(fieldName, Modifier.PUBLIC | Modifier.FINAL, returnType, classNode, initExpression);

		classNode.addField(field);
	}
}
