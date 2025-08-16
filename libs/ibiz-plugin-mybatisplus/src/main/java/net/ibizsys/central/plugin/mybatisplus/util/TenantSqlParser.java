package net.ibizsys.central.plugin.mybatisplus.util;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.core.parser.SqlInfo;
import com.baomidou.mybatisplus.core.toolkit.ExceptionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringPool;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.sf.jsqlparser.expression.CaseExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.expression.NotExpression;
import net.sf.jsqlparser.expression.Parenthesis;
import net.sf.jsqlparser.expression.WhenClause;
import net.sf.jsqlparser.expression.operators.arithmetic.Addition;
import net.sf.jsqlparser.expression.operators.arithmetic.Division;
import net.sf.jsqlparser.expression.operators.arithmetic.Multiplication;
import net.sf.jsqlparser.expression.operators.arithmetic.Subtraction;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.Between;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExistsExpression;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.GreaterThan;
import net.sf.jsqlparser.expression.operators.relational.GreaterThanEquals;
import net.sf.jsqlparser.expression.operators.relational.InExpression;
import net.sf.jsqlparser.expression.operators.relational.IsBooleanExpression;
import net.sf.jsqlparser.expression.operators.relational.IsNullExpression;
import net.sf.jsqlparser.expression.operators.relational.ItemsList;
import net.sf.jsqlparser.expression.operators.relational.LikeExpression;
import net.sf.jsqlparser.expression.operators.relational.MinorThan;
import net.sf.jsqlparser.expression.operators.relational.MinorThanEquals;
import net.sf.jsqlparser.expression.operators.relational.MultiExpressionList;
import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.replace.Replace;
import net.sf.jsqlparser.statement.select.FromItem;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SubSelect;
import net.sf.jsqlparser.statement.update.Update;

public class TenantSqlParser extends com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser {

	private Log log = LogFactory.getLog(TenantSqlParser.class);

	/**
	 * 执行 SQL 解析
	 *
	 * @param statement
	 *            JsqlParser Statement
	 * @return
	 */
	@Override
	public SqlInfo processParser(Statement statement) {
		if (statement instanceof Insert) {
			this.processInsert((Insert) statement);
		} else if (statement instanceof Select) {
			this.processSelectBody(((Select) statement).getSelectBody());
		} else if (statement instanceof Update) {
			this.processUpdate((Update) statement);
		} else if (statement instanceof Delete) {
			this.processDelete((Delete) statement);
		} else if (statement instanceof Replace) {
			this.processReplace((Replace) statement);
		}
		logger.debug("parser sql: " + statement.toString());
		String strSql = statement.toString();
		if (StringUtils.startsWithIgnoreCase(strSql, "BEGIN") && StringUtils.endsWithIgnoreCase(strSql, "END")) {
			strSql = strSql + ";";
		}
		return SqlInfo.newInstance().setSql(strSql);
	}

	/**
	 * replace 语句处理
	 */
	public void processReplace(Replace replace) {
		if (this.getTenantHandler().doTableFilter(replace.getTable().getName())) {
			// 过滤退出执行
			return;
		}
		replace.getColumns().add(new Column(this.getTenantHandler().getTenantIdColumn()));
		if (replace.getItemsList() != null) {
			// fixed github pull/295
			ItemsList itemsList = replace.getItemsList();
			if (itemsList instanceof MultiExpressionList) {
				((MultiExpressionList) itemsList).getExprList().forEach(el -> el.getExpressions().add(this.getTenantHandler().getTenantId(false)));
			} else {
				((ExpressionList) replace.getItemsList()).getExpressions().add(this.getTenantHandler().getTenantId(false));
			}
		} else {
			throw ExceptionUtils.mpe("Failed to process multiple-table update, please exclude the tableName or statementId");
		}
	}

	/**
	 * 处理 PlainSelect
	 *
	 * @param plainSelect
	 *            ignore
	 * @param addColumn
	 *            是否添加租户列,insert into select语句中需要
	 */
	@Override
	protected void processPlainSelect(PlainSelect plainSelect, boolean addColumn) {
		// 处理selectItem表达式
		processSelectItem(plainSelect);
		FromItem fromItem = plainSelect.getFromItem();
		if (fromItem instanceof Table) {
			Table fromTable = (Table) fromItem;
			if (!this.getTenantHandler().doTableFilter(fromTable.getName())) {
				plainSelect.setWhere(builderExpression(plainSelect.getWhere(), fromTable));
				if (addColumn) {
					if (fromItem.getAlias() != null) {
						plainSelect.getSelectItems().add(new SelectExpressionItem(new Column(fromItem.getAlias().getName() + StringPool.DOT + this.getTenantHandler().getTenantIdColumn())));
					} else {
						plainSelect.getSelectItems().add(new SelectExpressionItem(new Column(this.getTenantHandler().getTenantIdColumn())));
					}
				}
			}
		} else {
			processFromItem(fromItem);
		}
		List<Join> joins = plainSelect.getJoins();
		if (joins != null && joins.size() > 0) {
			joins.forEach(j -> {
				processJoin(j);
				processFromItem(j.getRightItem());
			});
		}
		// 处理where表达式
		processExcepression(plainSelect.getWhere());
	}

	/**
	 * exception 表达式处理
	 */
	protected void processExcepression(Expression exception) {
		if (exception == null) {
			return;
		} else if (exception instanceof AndExpression) {
			processExcepression(((AndExpression) exception).getLeftExpression());
			processExcepression(((AndExpression) exception).getRightExpression());
		} else if (exception instanceof OrExpression) {
			processExcepression(((OrExpression) exception).getLeftExpression());
			processExcepression(((OrExpression) exception).getRightExpression());
		} else if (exception instanceof Parenthesis) {
			processExcepression(((Parenthesis) exception).getExpression());
		} else if (exception instanceof NotExpression) {
			processExcepression(((NotExpression) exception).getExpression());
		} else if (exception instanceof InExpression) {
			processExcepression(((InExpression) exception).getLeftExpression());
			if (((InExpression) exception).getRightItemsList() instanceof SubSelect) {
				this.processSelectBody(((SubSelect) ((InExpression) exception).getRightItemsList()).getSelectBody());
			}
		} else if (exception instanceof EqualsTo) {
			processExcepression(((EqualsTo) exception).getLeftExpression());
			processExcepression(((EqualsTo) exception).getRightExpression());
		} else if (exception instanceof ExistsExpression) {
			processExcepression(((ExistsExpression) exception).getRightExpression());
		} else if (exception instanceof GreaterThan) {
			processExcepression(((GreaterThan) exception).getLeftExpression());
			processExcepression(((GreaterThan) exception).getRightExpression());
		} else if (exception instanceof GreaterThanEquals) {
			processExcepression(((GreaterThanEquals) exception).getLeftExpression());
			processExcepression(((GreaterThanEquals) exception).getRightExpression());
		} else if (exception instanceof MinorThan) {
			processExcepression(((MinorThan) exception).getLeftExpression());
			processExcepression(((MinorThan) exception).getRightExpression());
		} else if (exception instanceof MinorThanEquals) {
			processExcepression(((MinorThanEquals) exception).getLeftExpression());
			processExcepression(((MinorThanEquals) exception).getRightExpression());
		} else if (exception instanceof NotEqualsTo) {
			processExcepression(((NotEqualsTo) exception).getLeftExpression());
			processExcepression(((NotEqualsTo) exception).getRightExpression());
		} else if (exception instanceof IsBooleanExpression) {
			processExcepression(((IsBooleanExpression) exception).getLeftExpression());
		} else if (exception instanceof IsNullExpression) {
			processExcepression(((IsNullExpression) exception).getLeftExpression());
		} else if (exception instanceof LikeExpression) {
			processExcepression(((LikeExpression) exception).getLeftExpression());
			processExcepression(((LikeExpression) exception).getRightExpression());
		} else if (exception instanceof Between) {
			processExcepression(((Between) exception).getLeftExpression());
			processExcepression(((Between) exception).getBetweenExpressionStart());
			processExcepression(((Between) exception).getBetweenExpressionEnd());
		} else if (exception instanceof Function) {
			if (null != ((Function) exception).getParameters()) {
				for (Expression e : ((Function) exception).getParameters().getExpressions()) {
					processExcepression(e);
				}
			}
		} else if (exception instanceof CaseExpression) {
			CaseExpression caseExpression = (CaseExpression) exception;
			processExcepression(caseExpression.getElseExpression());
			processExcepression(caseExpression.getSwitchExpression());
			for (WhenClause whenClause : caseExpression.getWhenClauses()) {
				processExcepression(whenClause.getWhenExpression());
				processExcepression(whenClause.getThenExpression());
			}
		} else if (exception instanceof Subtraction) {
			processExcepression(((Subtraction) exception).getLeftExpression());
			processExcepression(((Subtraction) exception).getRightExpression());
		} else if (exception instanceof Multiplication) {
			processExcepression(((Multiplication) exception).getLeftExpression());
			processExcepression(((Multiplication) exception).getRightExpression());
		} else if (exception instanceof Addition) {
			processExcepression(((Addition) exception).getLeftExpression());
			processExcepression(((Addition) exception).getRightExpression());
		} else if (exception instanceof Division) {
			processExcepression(((Division) exception).getLeftExpression());
			processExcepression(((Division) exception).getRightExpression());
		} else if (exception instanceof SubSelect) {
			this.processSelectBody(((SubSelect) exception).getSelectBody());
		}
	}

	/**
	 * select 中包含 select、function 添加租户id
	 */
	protected void processSelectItem(PlainSelect plainSelect) {
		List<SelectItem> selectItems = plainSelect.getSelectItems();
		for (SelectItem selectItem : selectItems) {
			if (selectItem instanceof SelectExpressionItem) {
				Expression selectExcepression = ((SelectExpressionItem) selectItem).getExpression();
				processExcepression(selectExcepression);
			}
		}
	}

	@Override
	public SqlInfo parser(MetaObject metaObject, String sql) {

		ISysDBSchemeRuntime iSysDBSchemeRuntime = DBSchemeContextHolder.peek();
		if (iSysDBSchemeRuntime != null && !iSysDBSchemeRuntime.getSystemRuntime().isEnableTenantMode()) {
			return null;
		}
		// try {
		// return super.parser(metaObject, sql);
		// }
		// catch (Throwable ex) {
		// log.error(String.format("解析SQL发生异常，%1$s", ex.getMessage()), ex);
		// return null;
		// }
		return super.parser(metaObject, sql);
	}
}
