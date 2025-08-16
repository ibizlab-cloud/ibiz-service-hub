package net.ibizsys.central.plugin.mybatisplus.util;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ClientInfoStatus;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import javax.sql.DataSource;

import org.apache.commons.logging.LogFactory;

public class DynaDataSourceConnection implements java.sql.Connection {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DynaDataSourceConnection.class);
	
	private DynaDataSource dynaDataSource = null;
	
	private Map<DataSource, java.sql.Connection> connectonMap = new HashMap<DataSource, java.sql.Connection>();
	
	public DynaDataSourceConnection(DynaDataSource dynaDataSource) {
		this.dynaDataSource = dynaDataSource;
	}
	
	protected java.sql.Connection getRealConnection() throws java.sql.SQLException{
		DataSource dataSource = this.dynaDataSource.determineDataSource();
		synchronized (this.connectonMap) {
			java.sql.Connection connection = this.connectonMap.get(dataSource);
			if(connection == null) {
				connection = dataSource.getConnection();
				this.connectonMap.put(dataSource, connection);
			}
			return connection;
		}
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.getRealConnection().isWrapperFor(iface);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return this.getRealConnection().unwrap(iface);
	}

	@Override
	public void abort(Executor executor) throws SQLException {
		this.getRealConnection().abort(executor);
	}

	@Override
	public void clearWarnings() throws SQLException {
		this.getRealConnection().clearWarnings();
	}

	@Override
	public void close() throws SQLException {
		synchronized (this.connectonMap) {
			for(java.sql.Connection connection : this.connectonMap.values()) {
				try {
					connection.close();
				}
				catch (SQLException ex) {
					log.error(ex);
				}
			}
			this.connectonMap.clear();
		}
	}

	@Override
	public void commit() throws SQLException {
		this.getRealConnection().commit();
//		synchronized (this.connectonMap) {
//			for(java.sql.Connection connection : this.connectonMap.values()) {
//				try {
//					connection.commit();
//				}
//				catch (SQLException ex) {
//					log.error(ex);
//				}
//			}
//		}
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		return this.getRealConnection().createArrayOf(typeName, elements);
	}

	@Override
	public Blob createBlob() throws SQLException {
		return this.getRealConnection().createBlob();
	}

	@Override
	public Clob createClob() throws SQLException {
		return this.getRealConnection().createClob();
	}

	@Override
	public NClob createNClob() throws SQLException {
		return this.getRealConnection().createNClob();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		return this.getRealConnection().createSQLXML();
	}

	@Override
	public Statement createStatement() throws SQLException {
		return this.getRealConnection().createStatement();
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		return this.getRealConnection().createStatement(resultSetType, resultSetConcurrency);
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		return this.getRealConnection().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		return this.getRealConnection().createStruct(typeName, attributes);
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return this.getRealConnection().getAutoCommit();
	}

	@Override
	public String getCatalog() throws SQLException {
		return this.getRealConnection().getCatalog();
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		return this.getRealConnection().getClientInfo();
	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		return this.getRealConnection().getClientInfo(name);
	}

	@Override
	public int getHoldability() throws SQLException {
		return this.getRealConnection().getHoldability();
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return this.getRealConnection().getMetaData();
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		return this.getRealConnection().getNetworkTimeout();
	}

	@Override
	public String getSchema() throws SQLException {
		return this.getRealConnection().getSchema();
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return this.getRealConnection().getTransactionIsolation();
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return this.getRealConnection().getTypeMap();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return this.getRealConnection().getWarnings();
	}

	@Override
	public boolean isClosed() throws SQLException {
		return this.getRealConnection().isClosed();
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return this.getRealConnection().isReadOnly();
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		return this.getRealConnection().isValid(timeout);
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		return this.getRealConnection().nativeSQL(sql);
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		return this.getRealConnection().prepareCall(sql);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return this.getRealConnection().prepareCall(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		return this.getRealConnection().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return this.getRealConnection().prepareStatement(sql);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		return this.getRealConnection().prepareStatement(sql, autoGeneratedKeys);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		return this.getRealConnection().prepareStatement(sql, columnIndexes);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		return this.getRealConnection().prepareStatement(sql, columnNames);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		return this.getRealConnection().prepareStatement(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		return this.getRealConnection().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		this.getRealConnection().releaseSavepoint(savepoint);
	}

	@Override
	public void rollback() throws SQLException {
		this.getRealConnection().rollback();
//		synchronized (this.connectonMap) {
//			for(java.sql.Connection connection : this.connectonMap.values()) {
//				try {
//					connection.rollback();
//				}
//				catch (SQLException ex) {
//					log.error(ex);
//				}
//			}
//		}
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
		this.getRealConnection().rollback(savepoint);
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		this.getRealConnection().setAutoCommit(autoCommit);
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
		this.getRealConnection().setCatalog(catalog);
	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		try{
			this.getRealConnection().setClientInfo(properties);
		}
		catch (Exception ex) {
			if(ex instanceof SQLClientInfoException) {
				throw (SQLClientInfoException)ex;
			}
			throw new SQLClientInfoException(new HashMap<String, ClientInfoStatus>(), ex);
		}
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		try{
			this.getRealConnection().setClientInfo(name, value);
		}
		catch (Exception ex) {
			if(ex instanceof SQLClientInfoException) {
				throw (SQLClientInfoException)ex;
			}
			throw new SQLClientInfoException(new HashMap<String, ClientInfoStatus>(), ex);
		}
	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
		this.getRealConnection().setHoldability(holdability);
	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		this.getRealConnection().setNetworkTimeout(executor, milliseconds);
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		this.getRealConnection().setReadOnly(readOnly);
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return this.getRealConnection().setSavepoint();
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		return this.getRealConnection().setSavepoint(name);
	}

	@Override
	public void setSchema(String schema) throws SQLException {
		this.getRealConnection().setSchema(schema);
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		this.getRealConnection().setTransactionIsolation(level);
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		this.getRealConnection().setTypeMap(map);
	}
	
}
