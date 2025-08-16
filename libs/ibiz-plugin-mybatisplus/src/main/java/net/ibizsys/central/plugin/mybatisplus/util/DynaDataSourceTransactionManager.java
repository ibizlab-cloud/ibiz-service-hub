package net.ibizsys.central.plugin.mybatisplus.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

@SuppressWarnings("serial")
public class DynaDataSourceTransactionManager extends JdbcTransactionManager {

	
//	public DynaDataSourceTransactionManager() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public DynaDataSourceTransactionManager(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition) {
		// TODO Auto-generated method stub
		super.doBegin(transaction, definition);
	}

	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return super.getDataSource();
	}

	@Override
	protected DataSource obtainDataSource() {
		// TODO Auto-generated method stub
		return super.obtainDataSource();
	}

	@Override
	protected Object doGetTransaction() {
		// TODO Auto-generated method stub
		return super.doGetTransaction();
	}

	@Override
	protected boolean isExistingTransaction(Object transaction) {
		// TODO Auto-generated method stub
		return super.isExistingTransaction(transaction);
	}

	@Override
	protected Object doSuspend(Object transaction) {
		// TODO Auto-generated method stub
		return super.doSuspend(transaction);
	}

	@Override
	protected void doResume(Object transaction, Object suspendedResources) {
		// TODO Auto-generated method stub
		super.doResume(transaction, suspendedResources);
	}

	@Override
	protected void doCommit(DefaultTransactionStatus status) {
		// TODO Auto-generated method stub
		super.doCommit(status);
	}

	@Override
	protected void doRollback(DefaultTransactionStatus status) {
		// TODO Auto-generated method stub
		super.doRollback(status);
	}

	@Override
	protected void doSetRollbackOnly(DefaultTransactionStatus status) {
		// TODO Auto-generated method stub
		super.doSetRollbackOnly(status);
	}

	@Override
	protected void doCleanupAfterCompletion(Object transaction) {
		// TODO Auto-generated method stub
		super.doCleanupAfterCompletion(transaction);
	}

	@Override
	protected void prepareTransactionalConnection(Connection con, TransactionDefinition definition) throws SQLException {
		// TODO Auto-generated method stub
		super.prepareTransactionalConnection(con, definition);
	}
	
	
	
}
