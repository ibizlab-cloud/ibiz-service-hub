package net.ibizsys.central.cloud.core.spring.rt;

import java.io.Closeable;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.zaxxer.hikari.HikariDataSource;

import net.ibizsys.central.cloud.core.IServiceHubSetting;
import net.ibizsys.central.cloud.core.ServiceHubBase;
import net.ibizsys.central.cloud.core.database.ISysDBSchemeSyncAdapter;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIDocAdapter;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.EntityUtils;

@Component("ServiceHub")
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "manual", matchIfMissing = true)
public class ServiceHub extends ServiceHubBase implements ApplicationContextAware,
		ApplicationRunner/* , SmartLifecycle */ {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceHub.class);

	@Autowired
	IServiceHubSetting iServiceHubSetting;

	@Autowired
	RequestMappingHandlerMapping requestMappingHandlerMapping;

	@Autowired(required = false)
	ISysServiceAPIDocAdapter sysServiceAPIDocAdapter = null;

	@Autowired(required = false)
	ISysDBSchemeSyncAdapter sysDBSchemeSyncAdapter = null;

	@Autowired
	NacosDiscoveryProperties nacosDiscoveryProperties;

	@Autowired
	ServerProperties serverProperties;

	@Autowired(required = false)
	javax.sql.DataSource dataSource = null;

	private ConfigurableApplicationContext ctx;

	private Object dataSourceLock = new Object();

	protected final static Map<String, String> dbDriverMap = new HashMap<String, String>();
	
	static {
		dbDriverMap.put(DBTypes.MYSQL5, "com.mysql.jdbc.Driver");
		dbDriverMap.put("MYSQL", "com.mysql.jdbc.Driver");
		dbDriverMap.put(DBTypes.ORACLE, "oracle.jdbc.driver.OracleDriver");
		dbDriverMap.put(DBTypes.POSTGRESQL, "org.postgresql.Driver");
		dbDriverMap.put(DBTypes.PPAS, "com.edb.Driver");
		dbDriverMap.put(DBTypes.SQLITE, "org.sqlite.JDBC");
		dbDriverMap.put(DBTypes.SQLSERVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dbDriverMap.put(DBTypes.HANA, "com.sap.db.jdbc.Driver");
		dbDriverMap.put(DBTypes.DM, "dm.jdbc.driver.DmDriver");
		dbDriverMap.put(DBTypes.DB2, "com.ibm.db2.jcc.DB2Driver");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = (ConfigurableApplicationContext) ctx;
	}

	@PostConstruct
	public void postConstruct() {
		this.setServiceHubSetting(iServiceHubSetting);
		this.setDefaultDataSource(dataSource);
		this.setRequestMappingHandlerMapping(requestMappingHandlerMapping);
		this.setSysServiceAPIDocAdapter(sysServiceAPIDocAdapter);
		this.setSysDBSchemeSyncAdapter(sysDBSchemeSyncAdapter);
		onPostConstruct();
	}

	protected javax.sql.DataSource registerDataSource(DataSource ds) throws Exception {
		HikariDataSource dataSource = new HikariDataSource();

		EntityUtils.copyTo(ds, dataSource);

		// 进一步设置参数
		if (!StringUtils.hasLength(dataSource.getPoolName())) {
			dataSource.setPoolName(ds.getDataSourceId());
		}

		if (StringUtils.hasLength(ds.getDriverClassName())) {
			dataSource.setDriverClassName(ds.getDriverClassName());
		} else {
			if (StringUtils.hasLength(ds.getDBType())) {
				String strDriverClassName = dbDriverMap.get(ds.getDBType());
				if(!StringUtils.hasLength(strDriverClassName)) {
					strDriverClassName = DBTypes.getDriverClassName(ds.getDBType());
				}
				if (StringUtils.hasLength(strDriverClassName)) {
					log.debug(String.format("数据源[%1$s]类型[%2$s]匹配驱动[%3$s]", ds.getDataSourceId(), ds.getDBType(), strDriverClassName));
					dataSource.setDriverClassName(strDriverClassName);
				}
			}
		}

		dataSource.setJdbcUrl(ds.getJdbcUrl());
		dataSource.setUsername(ds.getUsername());
		dataSource.setPassword(ds.getPassword());

		String strFullDataSourceId = String.format("dynadatasource_%1$s", ds.getDataSourceId());
		if (ctx.getBeanFactory().containsBean(strFullDataSourceId)) {
			return (javax.sql.DataSource)ctx.getBeanFactory().getBean(strFullDataSourceId);
		}

		Connection connection = dataSource.getConnection();

		try {
			synchronized (dataSourceLock) {
				if (ctx.getBeanFactory().containsBean(strFullDataSourceId)) {
					return (javax.sql.DataSource) ctx.getBeanFactory().getBean(strFullDataSourceId);
				}
				ctx.getBeanFactory().registerSingleton(strFullDataSourceId, dataSource);
				this.setDataSource(ds.getDataSourceId(), dataSource);
			}
			
			return dataSource;
		} finally {
			try {
				connection.close();
			} catch (Exception ex) {
				log.error(ex);
			}
		}
	}

	@Override
	protected void unregisterDataSource(DataSource ds) throws Exception {
		String strFullDataSourceId = String.format("dynadatasource_%1$s", ds.getDataSourceId());
		
		try {
			javax.sql.DataSource dataSource = null;
			synchronized (dataSourceLock) {
				if (ctx.getBeanFactory().containsBean(strFullDataSourceId)) {
					dataSource = (javax.sql.DataSource)ctx.getBeanFactory().getBean(strFullDataSourceId);
//					ctx.getBeanFactory().destroyBean(strFullDataSourceId, dataSource);
					((DefaultListableBeanFactory)this.ctx.getBeanFactory()).destroySingleton(strFullDataSourceId);
				}
			}
			if(dataSource != null && dataSource.isWrapperFor(Closeable.class)) {
				dataSource.unwrap(Closeable.class).close();
			}
		}
		catch (Throwable ex) {
			log.error(ex);
		}
	}

	@Override
	protected boolean containsDataSource(DataSource ds) throws Exception {
		return ctx.getBeanFactory().containsBean("dynadatasource_" + ds.getDataSourceId());
	}

	@Override
	public javax.sql.DataSource getDataSource(DataSource ds, boolean bTryMode) throws Exception {
		String strFullDataSourceId = String.format("dynadatasource_%1$s", ds.getDataSourceId());
		if (ctx.getBeanFactory().containsBean(strFullDataSourceId)) {
			return (javax.sql.DataSource) ctx.getBeanFactory().getBean(strFullDataSourceId);
		}
		if (bTryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定数据源[%1$s]", ds.getDataSourceId()));
	}

	@Override
	public javax.sql.DataSource getDataSource(String strDSTag, boolean bTryMode) {
		String strFullDataSourceId = String.format("dynadatasource_%1$s", strDSTag);
		if (ctx.getBeanFactory().containsBean(strFullDataSourceId)) {
			return (javax.sql.DataSource) ctx.getBeanFactory().getBean(strFullDataSourceId);
		}
		return super.getDataSource(strDSTag, bTryMode);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.install();
	}
}
