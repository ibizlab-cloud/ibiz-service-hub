package net.ibizsys.runtime.util;

/**
 * 支持事务服务对象接口
 * @author lionlau
 *
 */
public interface ITransactionalUtil {

	/**
	 * 未知事务模式
	 */
	public final int PROPAGATION_UNKNOWN = -1;
	

	/**
	 * 支持当前已经存在的事务，如果还没有事务，就创建一个新事务
	 */
	public final int PROPAGATION_REQUIRED = 0;

	
	/**
	 * 支持当前事务，如果没有事务那么就不在事务中运行
	 */
	public final int PROPAGATION_SUPPORTS = 1;

	
	/**
	 * 支持当前已经存在的事务，如果还没有事务，就抛出一个异常
	 */
	public final int PROPAGATION_MANDATORY = 2;

	
	/**
	 * 挂起当前事务，创建一个新事务，如果还没有事务，就简单地创建一个新事务
	 */
	public final int PROPAGATION_REQUIRES_NEW = 3;

	
	/**
	 * 强制不在事务中运行，如果当前存在一个事务，则挂起该事务
	 */
	public final int PROPAGATION_NOT_SUPPORTED = 4;

	
	/**
	 * 强制要求不在事务中运行，如果当前存在一个事务，则抛出异常
	 */
	public final int PROPAGATION_NEVER = 5;

	
	/**
	 * 在当前事务中创建一个嵌套事务，如果还没有事务，那么就简单地创建一个新事务
	 */
	public final int PROPAGATION_NESTED = 6;
	
	
	/**
	 * Use the default isolation level of the underlying datastore.
	 * All other levels correspond to the JDBC isolation levels.
	 * @see java.sql.Connection
	 */
	public final int ISOLATION_DEFAULT = -1;

	/**
	 * Indicates that dirty reads, non-repeatable reads and phantom reads
	 * can occur.
	 * <p>This level allows a row changed by one transaction to be read by another
	 * transaction before any changes in that row have been committed (a "dirty read").
	 * If any of the changes are rolled back, the second transaction will have
	 * retrieved an invalid row.
	 * @see java.sql.Connection#TRANSACTION_READ_UNCOMMITTED
	 */
	public final int ISOLATION_READ_UNCOMMITTED = 1;  // same as java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;

	/**
	 * Indicates that dirty reads are prevented; non-repeatable reads and
	 * phantom reads can occur.
	 * <p>This level only prohibits a transaction from reading a row
	 * with uncommitted changes in it.
	 * @see java.sql.Connection#TRANSACTION_READ_COMMITTED
	 */
	public final int ISOLATION_READ_COMMITTED = 2;  // same as java.sql.Connection.TRANSACTION_READ_COMMITTED;

	/**
	 * Indicates that dirty reads and non-repeatable reads are prevented;
	 * phantom reads can occur.
	 * <p>This level prohibits a transaction from reading a row with uncommitted changes
	 * in it, and it also prohibits the situation where one transaction reads a row,
	 * a second transaction alters the row, and the first transaction re-reads the row,
	 * getting different values the second time (a "non-repeatable read").
	 * @see java.sql.Connection#TRANSACTION_REPEATABLE_READ
	 */
	public final int ISOLATION_REPEATABLE_READ = 4;  // same as java.sql.Connection.TRANSACTION_REPEATABLE_READ;

	/**
	 * Indicates that dirty reads, non-repeatable reads and phantom reads
	 * are prevented.
	 * <p>This level includes the prohibitions in {@link #ISOLATION_REPEATABLE_READ}
	 * and further prohibits the situation where one transaction reads all rows that
	 * satisfy a {@code WHERE} condition, a second transaction inserts a row
	 * that satisfies that {@code WHERE} condition, and the first transaction
	 * re-reads for the same condition, retrieving the additional "phantom" row
	 * in the second read.
	 * @see java.sql.Connection#TRANSACTION_SERIALIZABLE
	 */
	public final int ISOLATION_SERIALIZABLE = 8;  // same as java.sql.Connection.TRANSACTION_SERIALIZABLE;
	
	
	Object mandatory(IAction iAction, Object[] args) throws Throwable;
	
	
	Object nested(IAction iAction, Object[] args) throws Throwable;
	
	
	Object never(IAction iAction, Object[] args) throws Throwable;
	
	
	Object not_supported(IAction iAction, Object[] args) throws Throwable;
	
	
	Object required(IAction iAction, Object[] args) throws Throwable;
	
	
	Object required_new(IAction iAction, Object[] args) throws Throwable;
	
	
	Object supports(IAction iAction, Object[] args) throws Throwable;
	
	
	Object mandatory(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	Object nested(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	//Object never(IAction iAction, Object[] args) throws Throwable;
	
	
	Object not_supported(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	Object required(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	Object required_new(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	//Object supports(IAction iAction, Object[] args, int isolation) throws Throwable;
	
	
	/**
	 * 执行事务操作
	 * @param iAction
	 * @param args
	 * @param propagation
	 * @param isolation
	 * @return
	 * @throws Throwable
	 */
	Object execute(IAction iAction, Object[] args, int propagation, int isolation) throws Throwable; 
	
	
	/**
	 * 提交当前事务
	 * @throws Throwable
	 */
	@Deprecated
	void commit()throws Throwable;
	
	
	/**
	 * 回滚当前事务
	 * @throws Throwable
	 */
	@Deprecated
	void rollback()throws Throwable;
}
