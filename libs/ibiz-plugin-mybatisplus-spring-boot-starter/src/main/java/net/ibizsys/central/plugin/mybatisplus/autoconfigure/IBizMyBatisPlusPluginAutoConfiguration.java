package net.ibizsys.central.plugin.mybatisplus.autoconfigure;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceAutoConfiguration;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.core.parser.ISqlParserFilter;
import com.baomidou.mybatisplus.core.parser.SqlParserHelper;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;

import net.ibizsys.central.plugin.mybatisplus.util.DynaDataSource;
import net.ibizsys.central.plugin.mybatisplus.util.MapKeyUpperWrapperFactory;
import net.ibizsys.central.plugin.mybatisplus.util.MybatisSqlUtil;
import net.ibizsys.central.plugin.mybatisplus.util.TenantHandler;
import net.ibizsys.central.plugin.mybatisplus.util.TenantSqlParser;

@Configuration
@AutoConfigureBefore(DynamicDataSourceAutoConfiguration.class)
@ComponentScan(value = "net.ibizsys.central.plugin.mybatisplus.spring")
@MapperScan(value = "net.ibizsys.central.plugin.mybatisplus.spring")
public class IBizMyBatisPlusPluginAutoConfiguration implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    @Bean
    public ConfigurationCustomizer mybatisConfigurationCustomizer(){
        return configuration -> configuration.setObjectWrapperFactory(new MapKeyUpperWrapperFactory());
    }

    /**
     * mybatis适配多数据库
     *
     * @return
     */
    @Bean
    public DatabaseIdProvider getDatabaseIdProvider() {
        DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
        Properties p = new Properties();
        p.setProperty("Oracle", "oracle");
        p.setProperty("MySQL", "mysql");
        p.setProperty("PostgreSQL", "postgresql");
        p.setProperty("DM", "oracle");// 达梦数据库使用oracle模式
        p.setProperty("H2", "mysql");// 根据当前运行的数据库设置h2对应的databaseid
        databaseIdProvider.setProperties(p);
        return databaseIdProvider;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "ibiz.tenant", havingValue = "true", matchIfMissing = false)
    public TenantHandler tenantHandler() {
        TenantHandler tenantHandler = new TenantHandler();
        return tenantHandler;
    }

    @Value("${ibiz.db.search.ignorecase:false}")
    private boolean searchIgnoreCase;

    /**
     * mybatis-plus分页
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public PaginationInterceptor paginationInterceptor(@Autowired(required = false) TenantHandler tenantHandler) {
        MybatisSqlUtil.setSearchIgnoreCase(searchIgnoreCase);
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        paginationInterceptor.setLimit(-1);

        if (tenantHandler != null) {
            // 创建SQL解析器集合
            List<ISqlParser> sqlParserList = new ArrayList<>();
            // 创建租户SQL解析器
            TenantSqlParser tenantSqlParser = new TenantSqlParser();
            // 设置租户处理器
            tenantSqlParser.setTenantHandler(tenantHandler);
            sqlParserList.add(tenantSqlParser);
            paginationInterceptor.setSqlParserList(sqlParserList);

            // 设置租户忽略
            paginationInterceptor.setSqlParserFilter(ignoreParserFilter());
        }

        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }

    @Bean
    @ConditionalOnMissingBean
    public ISqlParserFilter ignoreParserFilter() {
        return metaObject -> {
            // 此处就过滤
            MappedStatement ms = SqlParserHelper.getMappedStatement(metaObject);

            return false;
        };
    }

    @Autowired
    private DynamicDataSourceProperties properties;

    @Bean
    public DataSource dataSource(DynamicDataSourceProvider dynamicDataSourceProvider) {
        DynaDataSource dataSource = new DynaDataSource();
        dataSource.setPrimary(properties.getPrimary());
        dataSource.setStrategy(properties.getStrategy());
        dataSource.setProvider(dynamicDataSourceProvider);
        dataSource.setP6spy(properties.getP6spy());
        dataSource.setStrict(properties.getStrict());
        dataSource.setSeata(properties.getSeata());
        dataSource.setApplicationContext(applicationContext);
        return dataSource;
    }
    
//    @Bean
//	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
//		if(dataSource instanceof IDynaDataSource) {
//			return new DynaDataSourceTransactionManager(dataSource);
//		}
//		return new JdbcTransactionManager(dataSource);
//	}
    
//	/**
//	 * 多数据源事务相关
//	 * @return
//	 */
//	@Bean("transactionManager")
//	public JtaTransactionManager jtaTransactionManager() throws SystemException {
//		JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
//		jtaTransactionManager.setTransactionManager(userTransactionManager());
//		jtaTransactionManager.setUserTransaction(userTransactionImp());
//		jtaTransactionManager.setAllowCustomIsolationLevels(true);
//		return jtaTransactionManager;
//	}

//	private UserTransactionManager userTransactionManager() {
//		UserTransactionManager userTransactionManager = new UserTransactionManager();
//		userTransactionManager.setForceShutdown(true);
//		return userTransactionManager;
//	}
//
//	private UserTransactionImp userTransactionImp() throws SystemException {
//		UserTransactionImp userTransactionImp = new UserTransactionImp();
//		userTransactionImp.setTransactionTimeout(5000);
//		return userTransactionImp;
//	}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
