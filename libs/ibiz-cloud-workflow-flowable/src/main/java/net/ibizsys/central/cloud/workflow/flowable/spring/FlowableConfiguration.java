package net.ibizsys.central.cloud.workflow.flowable.spring;

import org.flowable.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * 保留未来Boot模式使用
 * @author lionlau
 *
 */
//@EnableConfigurationProperties(FlowableModelerAppProperties.class)
//@ComponentScan(
//		basePackages = {"org.flowable.ui.modeler.repository",
//				"org.flowable.ui.modeler.service",
//				"org.flowable.ui.common.service",
//				"org.flowable.ui.common.repository",
//				"org.flowable.ui.common.tenant" },
//		excludeFilters = { @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = RemoteIdmService.class), }
//)
//@Configuration
//public class FlowableConfiguration extends FlowableModelerAppProperties{
//
//	public FlowableConfiguration() {
//		this.setRestEnabled(false);
//	}
@Configuration
public class FlowableConfiguration implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        FlowableConfiguration.applicationContext = applicationContext;
    }

    public static SpringProcessEngineConfiguration initEngineConfig(){
        SpringProcessEngineConfiguration engineConfig = new SpringProcessEngineConfiguration();
        PlatformTransactionManager platformTransactionManager =(PlatformTransactionManager)applicationContext.getBean("transactionManager");
        engineConfig.setTransactionManager(platformTransactionManager);
        return engineConfig;
    }
//	@Autowired
//	private SpringProcessEngineConfiguration configuration;
//
//	@Autowired
//	private WFStepListener wfStepListener;
//
//	/**
//	 * 注册监听器
//	 * @param contextRefreshedEvent
//	 */
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//		FlowableEventDispatcher dispatcher = configuration.getEventDispatcher();
//		dispatcher.addEventListener(wfStepListener);
//	}
//	

//	   
//	   
//	   @Bean
//	public TenantInfoHolder setupTenantInfoHolder() {
//		  return new TenantInfoHolder() {
//
//			@Override
//			public Collection<String> getAllTenants() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void setCurrentTenantId(String tenantid) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public String getCurrentTenantId() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void clearCurrentTenantId() {
//				// TODO Auto-generated method stub
//				
//			}
//			  
//		  };
//	}
//	
//	@Bean
//    public MultiSchemaMultiTenantProcessEngineConfiguration processEngineConfiguration(
//            TenantInfoHolder holder) throws Exception {
//    	MultiSchemaMultiTenantProcessEngineConfiguration engineConfig = new MultiSchemaMultiTenantProcessEngineConfiguration(holder);
//    	engineConfig.setAsyncExecutorActivate(true);
//    	engineConfig.setAsyncExecutor(new ExecutorPerTenantAsyncExecutor(holder));
//    	engineConfig.setDatabaseType(MultiSchemaMultiTenantProcessEngineConfiguration.DATABASE_TYPE_POSTGRES);
//    	engineConfig.setDatabaseSchemaUpdate(MultiSchemaMultiTenantProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
//    	
//    	return engineConfig;
//    }

}
