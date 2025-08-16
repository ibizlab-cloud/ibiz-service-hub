package net.ibizsys.central.cloud.core.spring.rt.util;

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

	// private Map<DataSource, PlatformTransactionManager>
	// platformTransactionManagerMap = new ConcurrentHashMap<DataSource,
	// PlatformTransactionManager>();

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
		// ISysDBSchemeRuntime iSysDBSchemeRuntime =
		// SysDBSchemeRuntimeHolder.peek();
		// if (iSysDBSchemeRuntime == null) {
		// return this.platformTransactionManager;
		// }
		// Object dataSourceTag = iSysDBSchemeRuntime.getDataSourceTag();
		// if (!ObjectUtils.isEmpty(dataSourceTag)) {
		// if (this.getApplicationContext() != null) {
		// String strBeanName = "dynadatasource_" + dataSourceTag;
		// if (this.getApplicationContext().containsBean(strBeanName)) {
		// Object objDataSource =
		// this.getApplicationContext().getBean(strBeanName);
		// if (objDataSource instanceof DataSource) {
		// DataSource dataSource = (DataSource)objDataSource;
		// PlatformTransactionManager platformTransactionManager =
		// platformTransactionManagerMap.get(dataSource);
		// if(platformTransactionManager == null) {
		// platformTransactionManager = new JdbcTransactionManager(dataSource);
		// this.platformTransactionManagerMap.put(dataSource,
		// platformTransactionManager);
		// }
		// return platformTransactionManager;
		// }
		// }
		// }
		// }
		return this.platformTransactionManager;
	}

//	@Override
//	public Object mandatory(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_MANDATORY);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object nested(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_NESTED);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object never(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_NEVER);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object not_supported(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_NOT_SUPPORTED);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object required(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_REQUIRED);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object required_new(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_REQUIRED_NEW);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//
//	@Override
//	public Object supports(IAction iAction, Object[] args) throws Throwable {
//		TransactionStatus transactionStatus = null;
//		PlatformTransactionManager platformTransactionManager = this.getRealPlatformTransactionManager();
//		try {
//			transactionStatus = platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_SUPPORTS);
//			Object obj = iAction.execute(args);
//			platformTransactionManager.commit(transactionStatus);
//			return obj;
//		} catch (Throwable e) {
//			if (transactionStatus != null)
//				platformTransactionManager.rollback(transactionStatus);
//			throw e;
//		}
//	}
//	
	
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

//	@Override
//	public Object supports(IAction iAction, Object[] args, int isolation) throws Throwable {
//		return execute(iAction, args, ITransactionalUtil.PROPAGATION_SUPPORTS, isolation);
//	}

	@Override
	public Object execute(IAction iAction, Object[] args, int propagation, int isolation) throws Throwable {
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
	public void commit() throws Throwable {
		// TransactionStatus transactionStatus =
		// platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_REQUIRED);
		// platformTransactionManager.commit(transactionStatus);
	}

	@Override
	public void rollback() throws Throwable {
		// TransactionStatus transactionStatus =
		// platformTransactionManager.getTransaction(TRANSACTIONDEFINITION_REQUIRED);
		// platformTransactionManager.rollback(transactionStatus);
	}
}