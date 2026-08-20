package net.ibizsys.central.plugin.test.testing.addin;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import groovy.lang.GroovyClassLoader;

public class DefaultTestTool extends TestToolBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(DefaultTestTool.class);
	
	@Override
	protected Object onRun(String strPath, Map<String, Object> params) throws Throwable {
		File file = this.getContext().getProjectFile(strPath, false);
		try( GroovyClassLoader classLoader = new GroovyClassLoader(this.getSystemRuntime().getGroovyClassLoader())) {
			
			Class<?> specClass = classLoader.parseClass(file);

	        // 2. 创建 JUnit Launcher 并执行
	        Launcher launcher = LauncherFactory.create();
	        SummaryGeneratingListener listener = new SummaryGeneratingListener();

	        // 2. 构建 LauncherDiscoveryRequest
	        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
	                .request() // 创建一个构建器实例
	                .selectors(DiscoverySelectors.selectClass(specClass)) // 指定要发现的测试类
	                .build(); // 构建出最终的请求对象
	        
	        launcher.execute(
	        		request,
	                listener
	        );

	        // 3. 获取并输出测试结果
	        
	        TestExecutionSummary summary = listener.getSummary();
	        Map<String, Object> ret = new LinkedHashMap<String, Object>();


	        ret.put("name", specClass.getCanonicalName());
	        ret.put("tests_found_count", summary.getTestsFoundCount());
	        ret.put("tests_succeeded_count", summary.getTestsSucceededCount());
	        ret.put("tests_failed_count", summary.getTestsFailedCount());
	        ret.put("tests_skipped_count", summary.getTestsSkippedCount());
	        
	        List<Object> failureList = new ArrayList<Object>();
	        ret.put("failures", failureList);
	        
	        // 打印失败详情
	        summary.getFailures().forEach(failure -> {
//	        	log.debug("失败测试: " + failure.getTestIdentifier().getDisplayName());
//	        	log.debug("原因: " + failure.getException().getMessage());
//	            failure.getException().printStackTrace();
//	            
	            Map<String, Object> item = new LinkedHashMap<String, Object>();
	            item.put("display_name", failure.getTestIdentifier().getDisplayName());
	            item.put("message", failure.getException().getMessage());
	            //item.put("stack_trace",  failure.getException().printStackTrace());
	            failureList.add(item);
	        });

	        // 4. 清理
	        classLoader.clearCache();
	        
	       
	        
	        return Arrays.asList(ret);
		}
		
	}

}
