package net.ibizsys.central.cloud.core.spring.rt.util;

import java.util.ArrayDeque;
import java.util.Deque;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;

@Component
public class TransactionalUtil implements ITransactionalUtil, ApplicationContextAware {

	@Autowired
	PlatformTransactionManager platformTransactionManager;

	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_MANDATORY = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_MANDATORY);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_NESTED = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_NESTED);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_NEVER = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_NEVER);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_NOT_SUPPORTED = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_REQUIRED = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_REQUIRED_NEW = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
	private final static DefaultTransactionDefinition TRANSACTIONDEFINITION_SUPPORTS = new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_SUPPORTS);

	private static final ThreadLocal<Deque<TransactionContext>> transactionStack = new ThreadLocal<>();

	private static class TransactionContext {
	    final TransactionStatus status;
	    final PlatformTransactionManager manager;
	    TransactionContext(TransactionStatus status, PlatformTransactionManager manager) {
	        this.status = status;
	        this.manager = manager;
	    }
	}

	@PostConstruct
	public void postConstruct() {
		ActionSessionManager.setTransactionalUtil(this);
	}

	private ApplicationContext applicationContext = null;

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	protected ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	protected PlatformTransactionManager getRealPlatformTransactionManager() {
		return this.platformTransactionManager;
	}

	
	@Override
	public Object mandatory(IAction iAction, Object[] args) throws Throwable {
		return this.mandatory(iAction, args, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object nested(IAction iAction, Object[] args) throws Throwable {
		return this.nested(iAction, args, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object never(IAction iAction, Object[] args) throws Throwable {
		return this.execute(iAction, args, ITransactionalUtil.PROPAGATION_NEVER, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object not_supported(IAction iAction, Object[] args) throws Throwable {
		return this.not_supported(iAction, args, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object required(IAction iAction, Object[] args) throws Throwable {
		return this.required(iAction, args, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object required_new(IAction iAction, Object[] args) throws Throwable {
		return this.required_new(iAction, args, ITransactionalUtil.ISOLATION_DEFAULT);
	}

	@Override
	public Object supports(IAction iAction, Object[] args) throws Throwable {
		return this.execute(iAction, args, ITransactionalUtil.PROPAGATION_SUPPORTS, ITransactionalUtil.ISOLATION_DEFAULT);
	}
	
	

	@Override
	public Object mandatory(IAction iAction, Object[] args, int isolation) throws Throwable {
		return execute(iAction, args, ITransactionalUtil.PROPAGATION_MANDATORY, isolation);
	}

	

	@Override
	public Object nested(IAction iAction, Object[] args, int isolation) throws Throwable {
		return execute(iAction, args, ITransactionalUtil.PROPAGATION_NESTED, isolation);
	}

	@Override
	public Object not_supported(IAction iAction, Object[] args, int isolation) throws Throwable {
		return execute(iAction, args, ITransactionalUtil.PROPAGATION_NOT_SUPPORTED, isolation);
	}

	@Override
	public Object required(IAction iAction, Object[] args, int isolation) throws Throwable {
		return execute(iAction, args, ITransactionalUtil.PROPAGATION_REQUIRED, isolation);
	}

	@Override
	public Object required_new(IAction iAction, Object[] args, int isolation) throws Throwable {
		return execute(iAction, args, ITransactionalUtil.PROPAGATION_REQUIRES_NEW, isolation);
	}



	@Override
	public Object execute(IAction iAction, Object[] args, int propagation, int isolation) throws Throwable {
	    // 检查是否存在手动事务
	    Deque<TransactionContext> stack = transactionStack.get();
	    if (stack != null && !stack.isEmpty()) {
	        // 存在手动事务，忽略自动事务管理，直接执行
	        return iAction.execute(args);
	    }
	    // 原有自动事务逻辑（无手动事务时）
	    TransactionStatus transactionStatus = null;
	    PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
	    try {
	        TransactionDefinition transactionDefinition = this.getTransactionDefinition(propagation, isolation);
	        transactionStatus = platformTransactionManager.getTransaction(transactionDefinition);
	        Object obj = iAction.execute(args);
	        platformTransactionManager.commit(transactionStatus);
	        return obj;
	    } catch (Throwable e) {
	        if (transactionStatus != null)
	            platformTransactionManager.rollback(transactionStatus);
	        throw e;
	    }
	}
	
	

	protected TransactionDefinition getTransactionDefinition(int propagation, int isolation) throws Exception {
		if(isolation == ITransactionalUtil.ISOLATION_DEFAULT) {
			switch(propagation) {
			case ITransactionalUtil.PROPAGATION_MANDATORY:
				return TRANSACTIONDEFINITION_MANDATORY;
			case ITransactionalUtil.PROPAGATION_NESTED:
				return TRANSACTIONDEFINITION_NESTED;
			case ITransactionalUtil.PROPAGATION_NEVER:
				return TRANSACTIONDEFINITION_NEVER;
			case ITransactionalUtil.PROPAGATION_NOT_SUPPORTED:
				return TRANSACTIONDEFINITION_NOT_SUPPORTED;
			case ITransactionalUtil.PROPAGATION_REQUIRED:
				return TRANSACTIONDEFINITION_REQUIRED;
			case ITransactionalUtil.PROPAGATION_REQUIRES_NEW:
				return TRANSACTIONDEFINITION_REQUIRED_NEW;
			case ITransactionalUtil.PROPAGATION_SUPPORTS:
				return TRANSACTIONDEFINITION_SUPPORTS;
			default:
				throw new Exception(String.format("无法识别的事务类型[%1$s]", propagation));
			}
		}
		else {
			DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition(propagation);
			transactionDefinition.setIsolationLevel(isolation);
			return transactionDefinition;
		}
	}
	
	@Override
	public void begin(int propagation) throws Throwable {
		this.begin(propagation, ITransactionalUtil.ISOLATION_DEFAULT);
	}
	
	@Override
	public void begin(int propagation, int isolation) throws Throwable {
	    Deque<TransactionContext> stack = transactionStack.get();
	    if (stack == null) {
	        stack = new ArrayDeque<>();
	        transactionStack.set(stack);
	    }
	    // 嵌套检查：只允许 NESTED 或 REQUIRES_NEW
	    if (!stack.isEmpty()) {
	        if (propagation != PROPAGATION_NESTED && propagation != PROPAGATION_REQUIRES_NEW) {
	            throw new IllegalStateException(
	                "当前线程已有事务，嵌套事务只允许使用 PROPAGATION_NESTED 或 PROPAGATION_REQUIRES_NEW");
	        }
	    }
	    PlatformTransactionManager tm = getRealPlatformTransactionManager();
	    TransactionDefinition def = getTransactionDefinition(propagation, isolation);
	    TransactionStatus status = tm.getTransaction(def);
	    stack.push(new TransactionContext(status, tm));
	}

	@Override
	public void commit() throws Throwable {
	    Deque<TransactionContext> stack = transactionStack.get();
	    if (stack == null || stack.isEmpty()) {
	        throw new IllegalStateException("没有正在进行的事务");
	    }
	    TransactionContext ctx = stack.pop();
	    try {
	        ctx.manager.commit(ctx.status);
	    } finally {
	        if (stack.isEmpty()) {
	            transactionStack.remove();
	        }
	    }
	}

	@Override
	public void rollback() throws Throwable {
	    Deque<TransactionContext> stack = transactionStack.get();
	    if (stack == null || stack.isEmpty()) {
	        throw new IllegalStateException("没有正在进行的事务");
	    }
	    TransactionContext ctx = stack.pop();
	    try {
	        ctx.manager.rollback(ctx.status);
	    } finally {
	        if (stack.isEmpty()) {
	            transactionStack.remove();
	        }
	    }
	}
}