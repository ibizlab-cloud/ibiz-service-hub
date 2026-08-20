package net.ibizsys.central.plugin.test.util;

import java.io.File;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import groovy.lang.GroovyClassLoader;

public class TestX {

	 public static void main(String[] args) throws Exception {
	        // 1. 使用 GroovyClassLoader 动态加载测试类
	        GroovyClassLoader classLoader = new GroovyClassLoader(Thread.currentThread().getContextClassLoader());
	        // 假设测试文件路径为 src/test/groovy/MySpec.groovy
	        Class<?> specClass = classLoader.parseClass(new File("H:\\R8\\ibiz-plugin\\ibiz-plugin-test\\src\\main\\groovy\\net\\ibizsys\\central\\plugin\\test\\CalculatorSpec.groovy"));

	        // 2. 创建 JUnit Launcher 并执行
	        Launcher launcher = LauncherFactory.create();
	        SummaryGeneratingListener listener = new SummaryGeneratingListener();

	        // 2. 构建 LauncherDiscoveryRequest
	        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
	                .request() // 创建一个构建器实例[reference:6]
	                .selectors(DiscoverySelectors.selectClass(specClass)) // 指定要发现的测试类[reference:7]
	                .build(); // 构建出最终的请求对象
	        
	        launcher.execute(
	        		request,
	                listener
	        );

	        // 3. 获取并输出测试结果
	        TestExecutionSummary summary = listener.getSummary();
	        System.out.println("总测试数: " + summary.getTestsFoundCount());
	        System.out.println("成功: " + summary.getTestsSucceededCount());
	        System.out.println("失败: " + summary.getTestsFailedCount());
	        System.out.println("跳过: " + summary.getTestsSkippedCount());
	     //   System.out.println("耗时: " + summary.getTotalTimeMillis() + " ms");

	        // 打印失败详情
	        summary.getFailures().forEach(failure -> {
	            System.out.println("失败测试: " + failure.getTestIdentifier().getDisplayName());
	            System.out.println("原因: " + failure.getException().getMessage());
	            failure.getException().printStackTrace();
	        });

	        // 4. 清理
	        classLoader.clearCache();
	    }
}
