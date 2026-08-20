package net.ibizsys.central.plugin.groovy.sysutil;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.ErrorCollector;
import org.codehaus.groovy.control.MultipleCompilationErrorsException;
import org.codehaus.groovy.control.customizers.ImportCustomizer;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import groovy.lang.GroovyClassLoader;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.sysutil.SysHotCodeUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.annotation.DEActionRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DEDataExportRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DEDataImportRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DEDataSetRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DELogicRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DataEntityRTAddin;
import net.ibizsys.central.cloud.core.util.annotation.SystemRTAddin;
import net.ibizsys.central.cloud.core.util.domain.CompileResult;
import net.ibizsys.central.cloud.core.util.domain.RunTestResult;
import net.ibizsys.central.plugin.groovy.dataentity.action.DEActionPluginRuntimeProxy;
import net.ibizsys.central.plugin.groovy.dataentity.ds.DEDataSetPluginRuntimeProxy;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;

public abstract class GroovySysHotCodeUtilRuntimeBase extends SysHotCodeUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GroovySysHotCodeUtilRuntimeBase.class);
	private GroovyClassLoader classLoader = null;
	public final static String SOURCE_FOLDER = "src/main/groovy";
	public final static String SOURCE_TEST_FOLDER = "src/test/groovy";

	private static class HotCodeItem {
		public String name;
		public String code;
		public Object object;
		public Runnable unregisterCall;
	}

	private Map<String, HotCodeItem> hotCodeItemMap = new ConcurrentHashMap<String, HotCodeItem>();

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected void onInstall() throws Exception {
		super.onInstall();
	}

	@Override
	protected void prepareConfig() throws Exception {
		super.prepareConfig();
		getGroovyClassLoader();
	}

	protected GroovyClassLoader getGroovyClassLoader() {
		if (this.classLoader == null) {
			ImportCustomizer importCustomizer = new ImportCustomizer();
			// 添加普通导入
			importCustomizer.addImports("net.ibizsys.central.plugin.groovy.dataentity.GroovyDataEntityRTAddinBase", "net.ibizsys.central.cloud.core.util.annotation.DataEntityRTAddin", "net.ibizsys.central.util.IEntityDTO", "net.ibizsys.central.util.ISearchContextDTO", "net.ibizsys.central.util.IPage", "net.ibizsys.central.util.annotation.DEAction", "net.ibizsys.central.util.annotation.DEDataSet", "net.ibizsys.central.util.annotation.DEActionLogic", "net.ibizsys.central.util.annotation.DEDataSetLogic");
			CompilerConfiguration config = new CompilerConfiguration();
			config.addCompilationCustomizers(importCustomizer);
			this.classLoader = new GroovyClassLoader(this.getSystemRuntime().getGroovyClassLoader(), config);
			ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(true);
			if (iSysFileResourceRuntime != null) {
				File file = new File(iSysFileResourceRuntime.getFile(null), SOURCE_FOLDER);
				if (file.exists()) {
					try {
						this.classLoader.addClasspath(file.getCanonicalPath());
					} catch (Throwable ex) {
						log.error(ex);
					}
				}
			}
		}
		return this.classLoader;
	}

	@Override
	protected void onReload() throws Throwable {

		super.onReload();

		ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(true);
		if (iSysFileResourceRuntime == null) {
			return;
		}

		iSysFileResourceRuntime.reload();

		Map<String, HotCodeItem> lastHotCodeItemMap = new LinkedHashMap<String, GroovySysHotCodeUtilRuntimeBase.HotCodeItem>(this.hotCodeItemMap);

		File file = new File(iSysFileResourceRuntime.getFile(null), SOURCE_FOLDER);
		if (file.exists()) {
			// this.reloadHotCodeItem(new File(file,
			// "demo/dataexport/SimpleDEDataExportRuntime.groovy"),
			// "demo.dataexport", lastHotCodeItemMap, true);
			File[] items = file.listFiles();
			if (items != null) {
				for (File item : items) {
					reloadHotCodeItem(item, "", lastHotCodeItemMap, true);
				}
			}
		}

		// 卸载
		for (HotCodeItem hotCodeItem : lastHotCodeItemMap.values()) {
			if (hotCodeItem.unregisterCall != null) {
				try {
					hotCodeItem.unregisterCall.run();
				} catch (Throwable ex) {
					log.error(String.format("卸载[%1$s]发生异常，%2$s", hotCodeItem.name, ex.getMessage()), ex);
				}
			}
		}
	}

	protected void reloadHotCodeItem(File file, String packageName, Map<String, HotCodeItem> lastHotCodeItemMap, boolean tryMode) throws Exception {
		if (file.isDirectory()) {
			File[] items = file.listFiles();
			if (items != null) {
				String packageName2 = StringUtils.hasLength(packageName) ? (packageName + "." + file.getName()) : file.getName();
				for (File item : items) {
					reloadHotCodeItem(item, packageName2, lastHotCodeItemMap, tryMode);
				}
			}
		} else {
			// 判断文件后缀
			String strExtension = FilenameUtils.getExtension(file.getName());
			if (!"groovy".equals(strExtension)) {
				return;
			}

			//
			String strClassName = FilenameUtils.getBaseName(file.getName());
			String strFullClassName = StringUtils.hasLength(packageName) ? (packageName + "." + strClassName) : strClassName;
			String strCode = FileUtils.readFileToString(file, "UTF-8");
			if (strCode == null) {
				strCode = "";
			}

			HotCodeItem hotCodeItem = lastHotCodeItemMap.remove(strFullClassName);
			if (hotCodeItem != null) {
				if (strCode.equals(hotCodeItem.code)) {
					// 代码一致，忽略
					return;
				}
			}

			if (!StringUtils.hasLength(strCode)) {
				// 没有长度，忽略
				return;
			}

			Class<?> cls = null;
			
			try {
				cls = Class.forName(strFullClassName);
				log.info(String.format("热代码插件[%1$s]已经存在，忽略动态编译", strFullClassName));
			} catch (Exception e) {
				try {
					cls = this.getGroovyClassLoader().parseClass(file);
				} catch (Throwable ex) {
					if (tryMode) {
						log.error(String.format("编译[%1$s]发生异常，%2$s", strFullClassName, ex.getMessage()), ex);
					} else {
						throw new Exception(String.format("编译[%1$s]发生异常，%2$s", strFullClassName, ex.getMessage()), ex);
					}
				}
			}
			

			if (cls == null) {
				return;
			}

			// 执行卸载动作
			if (hotCodeItem != null && hotCodeItem.unregisterCall != null) {
				try {
					hotCodeItem.unregisterCall.run();
				} catch (Throwable ex) {
					log.error(String.format("卸载[%1$s]发生异常，%2$s", strFullClassName, ex.getMessage()), ex);
				}
			}

			try {
				hotCodeItem = this.installHotCodeItem(cls);
				hotCodeItem.code = strCode;
				hotCodeItem.name = strFullClassName;
				// 覆盖
				this.hotCodeItemMap.put(strFullClassName, hotCodeItem);
			} catch (Throwable ex) {
				if (tryMode) {
					log.error(String.format("安装[%1$s]发生异常，%2$s", strFullClassName, ex.getMessage()), ex);
				} else {
					throw new Exception(String.format("安装[%1$s]发生异常，%2$s", strFullClassName, ex.getMessage()), ex);
				}
			}
		}
	}

	protected HotCodeItem installHotCodeItem(Class<?> cls) throws Exception {

		SystemRTAddin systemRTAddin = cls.getAnnotation(SystemRTAddin.class);
		if (systemRTAddin != null) {
			return this.registerSystemRTAddin(cls, systemRTAddin);
		}
		
		DataEntityRTAddin dataEntityRTAddin = cls.getAnnotation(DataEntityRTAddin.class);
		if (dataEntityRTAddin != null) {
			return this.registerDataEntityRTAddin(cls, dataEntityRTAddin);
		}

		DEDataExportRuntime deDataExportRuntime = cls.getAnnotation(DEDataExportRuntime.class);
		if (deDataExportRuntime != null) {
			return this.registerDEDataExportRuntime(cls, deDataExportRuntime);
		}

		DEDataImportRuntime deDataImportRuntime = cls.getAnnotation(DEDataImportRuntime.class);
		if (deDataImportRuntime != null) {
			return this.registerDEDataImportRuntime(cls, deDataImportRuntime);
		}
		
		DEActionRuntime deActionRuntime = cls.getAnnotation(DEActionRuntime.class);
		if (deActionRuntime != null) {
			return this.registerDEActionRuntime(cls, deActionRuntime);
		}
		
		DELogicRuntime deLogicRuntime = cls.getAnnotation(DELogicRuntime.class);
		if (deLogicRuntime != null) {
			return this.registerDELogicRuntime(cls, deLogicRuntime);
		}

		DEDataSetRuntime deDataSetRuntime = cls.getAnnotation(DEDataSetRuntime.class);
		if (deDataSetRuntime != null) {
			return this.registerDEDataSetRuntime(cls, deDataSetRuntime);
		}
		
		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		return hotCodeItem;
	}
	
	protected HotCodeItem registerSystemRTAddin(Class<?> cls, SystemRTAddin dataEntityRTAddin) throws Exception {
	
		IServiceSystemRuntime iSystemRuntime = this.getSystemRuntime();
		
		try {
			iSystemRuntime.registerSystemRTAddin(cls);
		} catch (Throwable ex) {
			throw new Exception(String.format("注册系统运行时插件发生异常，%1$s", ex.getMessage()), ex);
		}

		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iSystemRuntime.unregisterSystemRTAddin(cls);
			}
		};
		return hotCodeItem;
	}
	

	protected HotCodeItem registerDataEntityRTAddin(Class<?> cls, DataEntityRTAddin dataEntityRTAddin) throws Exception {
		String strDataEntityTag = dataEntityRTAddin.value();
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("未指定实体标识");
		}

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}

		try {
			iDataEntityRuntime.registerDataEntityRTAddin(cls);
		} catch (Throwable ex) {
			throw new Exception(String.format("注册实体[%1$s]运行时插件发生异常，%2$s", strDataEntityTag, ex.getMessage()), ex);
		}

		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDataEntityRTAddin(cls);
			}
		};
		return hotCodeItem;
	}

	protected HotCodeItem registerDEDataExportRuntime(Class<?> cls, DEDataExportRuntime deDataExportRuntime) throws Exception {
		String strDEDataExportTag = deDataExportRuntime.value();
		if (ObjectUtils.isEmpty(strDEDataExportTag)) {
			throw new Exception("未指定实体数据导出标识");
		}

		String strDataEntityTag = PSModelUtils.getParentId(strDEDataExportTag);
		String strTag = PSModelUtils.getSimpleId(strDEDataExportTag);

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}

		try {
			iDataEntityRuntime.registerDEDataExportRuntime(strTag, cls);
		} catch (Throwable ex) {
			throw new Exception(String.format("注册实体数据导出[%1$s]运行时插件发生异常，%2$s", strDEDataExportTag, ex.getMessage()), ex);
		}

		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDEDataExportRuntime(strTag, cls);
			}
		};
		return hotCodeItem;
	}

	protected HotCodeItem registerDEDataImportRuntime(Class<?> cls, DEDataImportRuntime deDataImportRuntime) throws Exception {
		String strDEDataImportTag = deDataImportRuntime.value();
		if (ObjectUtils.isEmpty(strDEDataImportTag)) {
			throw new Exception("未指定实体数据导入标识");
		}

		String strDataEntityTag = PSModelUtils.getParentId(strDEDataImportTag);
		String strTag = PSModelUtils.getSimpleId(strDEDataImportTag);

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}

		try {
			iDataEntityRuntime.registerDEDataImportRuntime(strTag, cls);
		} catch (Throwable ex) {
			throw new Exception(String.format("注册实体数据导入[%1$s]运行时插件发生异常，%2$s", strDEDataImportTag, ex.getMessage()), ex);
		}

		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDEDataImportRuntime(strTag, cls);
			}
		};
		return hotCodeItem;
	}

	protected HotCodeItem registerDELogicRuntime(Class<?> cls, DELogicRuntime deLogicRuntime) throws Exception {
		String strDELogicTag = deLogicRuntime.value();
		if (ObjectUtils.isEmpty(strDELogicTag)) {
			throw new Exception("未指定实体处理逻辑标识");
		}

		String strDataEntityTag = PSModelUtils.getParentId(strDELogicTag);
		String strTag = PSModelUtils.getSimpleId(strDELogicTag);

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}

		try {
			iDataEntityRuntime.registerDELogicRuntime(strTag, cls);
		} catch (Throwable ex) {
			throw new Exception(String.format("注册实体处理逻辑[%1$s]运行时插件发生异常，%2$s", strDELogicTag, ex.getMessage()), ex);
		}

		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDELogicRuntime(strTag, cls);
			}
		};
		return hotCodeItem;
	}
	
	protected HotCodeItem registerDEActionRuntime(Class<?> cls, DEActionRuntime deActionRuntime) throws Exception {
		String strDEActionTag = deActionRuntime.value();
		if (ObjectUtils.isEmpty(strDEActionTag)) {
			throw new Exception("未指定实体行为标识");
		}

		String strDataEntityTag = PSModelUtils.getParentId(strDEActionTag);
		String strTag = PSModelUtils.getSimpleId(strDEActionTag);

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}
		
		IDEActionRuntime iDEActionRuntime = null;
		try {
			Object addin = cls.newInstance();
			if(!(addin instanceof IDEActionRuntime)){
				throw new Exception(String.format("插件[%1$s]类型不正确", cls.getName()));
			}
			iDEActionRuntime = (IDEActionRuntime)addin;
		}
		catch (Throwable ex) {
			throw new Exception(String.format("建立实体行为运行时插件发生异常，%1$s", ex.getMessage()), ex);
		}
		
		DEActionPluginRuntimeProxy deActionPluginRuntimeProxy = null;
		try {
			this.getSystemRuntime().autowareObject(iDEActionRuntime);
			deActionPluginRuntimeProxy = new DEActionPluginRuntimeProxy(iDEActionRuntime);
			iDataEntityRuntime.registerDEActionPluginRuntime(strTag, deActionPluginRuntimeProxy);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("注册实体行为[%1$s]运行时插件发生异常，%2$s", strDEActionTag, ex.getMessage()), ex);
		}
		
		DEActionPluginRuntimeProxy deActionPluginRuntimeProxy2 = deActionPluginRuntimeProxy;
		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDEActionPluginRuntime(strTag, deActionPluginRuntimeProxy2);
			}
		};
		return hotCodeItem;
	}
	
	protected HotCodeItem registerDEDataSetRuntime(Class<?> cls, DEDataSetRuntime deDataSetRuntime) throws Exception {
		String strDEDataSetTag = deDataSetRuntime.value();
		if (ObjectUtils.isEmpty(strDEDataSetTag)) {
			throw new Exception("未指定实体数据集标识");
		}

		String strDataEntityTag = PSModelUtils.getParentId(strDEDataSetTag);
		String strTag = PSModelUtils.getSimpleId(strDEDataSetTag);

		IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime) this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if (ObjectUtils.isEmpty(strDataEntityTag)) {
			throw new Exception("指定实体标识无效");
		}
		
		IDEDataSetRuntime iDEDataSetRuntime = null;
		try {
			Object addin = cls.newInstance();
			if(!(addin instanceof IDEDataSetRuntime)){
				throw new Exception(String.format("插件[%1$s]类型不正确", cls.getName()));
			}
			iDEDataSetRuntime = (IDEDataSetRuntime)addin;
		}
		catch (Throwable ex) {
			throw new Exception(String.format("建立实体数据集运行时插件发生异常，%1$s", ex.getMessage()), ex);
		}
		
		DEDataSetPluginRuntimeProxy deDataSetPluginRuntimeProxy = null;
		try {
			this.getSystemRuntime().autowareObject(iDEDataSetRuntime);
			deDataSetPluginRuntimeProxy = new DEDataSetPluginRuntimeProxy(iDEDataSetRuntime);
			iDataEntityRuntime.registerDEDataSetPluginRuntime(strTag, deDataSetPluginRuntimeProxy);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("注册实体数据集[%1$s]运行时插件发生异常，%2$s", strDEDataSetTag, ex.getMessage()), ex);
		}
		
		DEDataSetPluginRuntimeProxy deDataSetPluginRuntimeProxy2 = deDataSetPluginRuntimeProxy;
		HotCodeItem hotCodeItem = new HotCodeItem();
		hotCodeItem.object = cls;
		hotCodeItem.unregisterCall = new Runnable() {
			@Override
			public void run() {
				iDataEntityRuntime.unregisterDEDataSetPluginRuntime(strTag, deDataSetPluginRuntimeProxy2);
			}
		};
		return hotCodeItem;
	}
	
	@Override
	protected CompileResult onCompile(String strPath, Map<String, Object> params) throws Throwable {
		ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(false);
		iSysFileResourceRuntime.reload();
		File file = new File(iSysFileResourceRuntime.getFile(null), strPath);
		if (!file.exists() || !file.isFile()) {
			throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
		}

		// 判断文件后缀
		String strExtension = FilenameUtils.getExtension(file.getName());
		if (!"groovy".equals(strExtension)) {
			throw new Exception(String.format("指定文件后缀必须为groovy", strPath));
		}

		CompileResult compileResult = new CompileResult();
		compileResult.setSuccess(false);

		Class<?> cls = null;
		try {
			// String strCode = FileUtils.readFileToString(file, "UTF-8");
			cls = this.getGroovyClassLoader().parseClass(file);
			compileResult.setCompiledClassName(cls.getCanonicalName());
			compileResult.setSuccess(true);
		} catch (Throwable ex) {
			compileResult.setErrorMessage(ex.getMessage());
			if (ex instanceof MultipleCompilationErrorsException) {
				MultipleCompilationErrorsException compilationFailedException = (MultipleCompilationErrorsException) ex;
				ErrorCollector ec = compilationFailedException.getErrorCollector();
				List<String> list = new ArrayList<String>();
				for (int i = 0; i < ec.getErrorCount(); i++) {
					StringWriter stringWriter = new StringWriter();
					try (PrintWriter printWriter = new PrintWriter(stringWriter, true)) {
						ec.getError(i).write(printWriter);
					}
					list.add(stringWriter.toString());
				}
				compileResult.setErrors(list);
			}
			return compileResult;
		}

		// 1. 获取类的全限定名（通过 Class 对象获取，更可靠）
		String fullClassName = cls.getName();

		// 2. 读取文件源码（用于后续保存 code 字段，也便于调试）
		String strCode = FileUtils.readFileToString(file, "UTF-8");

		// 3. 从 map 中移除旧插件（如果存在）
		HotCodeItem oldItem = this.hotCodeItemMap.remove(fullClassName);
		if (oldItem != null && oldItem.unregisterCall != null) {
			try {
				oldItem.unregisterCall.run(); // 执行旧插件的卸载回调
			} catch (Throwable ex) {
				log.error(String.format("卸载旧插件[%s]失败: %s", fullClassName, ex.getMessage()), ex);
			}
		}

		// 4. 安装新插件
		try {
			HotCodeItem newItem = this.installHotCodeItem(cls);
			newItem.code = strCode;
			newItem.name = fullClassName;
			// 放入 map（覆盖）
			this.hotCodeItemMap.put(fullClassName, newItem);
		} catch (Throwable ex) {
			throw new Exception(String.format("安装新插件[%s]失败: %s", fullClassName, ex.getMessage()), ex);
		}

		return compileResult;
	}

	@Override
	protected RunTestResult onRunTest(String strPath, Map<String, Object> params) throws Throwable {
		ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(false);
		iSysFileResourceRuntime.reload();
		File file = new File(iSysFileResourceRuntime.getFile(null), strPath);
		if (!file.exists() || !file.isFile()) {
			throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
		}

		try (GroovyClassLoader classLoader = new GroovyClassLoader(this.getGroovyClassLoader())) {

			Class<?> specClass = classLoader.parseClass(file);

			// 2. 创建 JUnit Launcher 并执行
			Launcher launcher = LauncherFactory.create();
			SummaryGeneratingListener listener = new SummaryGeneratingListener();

			// 2. 构建 LauncherDiscoveryRequest
			LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request() // 创建一个构建器实例
					.selectors(DiscoverySelectors.selectClass(specClass)) // 指定要发现的测试类
					.build(); // 构建出最终的请求对象

			launcher.execute(request, listener);

			// 3. 获取并输出测试结果

			TestExecutionSummary summary = listener.getSummary();

			RunTestResult runTestResult = new RunTestResult();

			runTestResult.setName(specClass.getCanonicalName());
			runTestResult.setTestsFoundCount((int) summary.getTestsFoundCount());
			runTestResult.setTestsSucceededCount((int) summary.getTestsSucceededCount());
			runTestResult.setTestsFailedCount((int) summary.getTestsFailedCount());
			runTestResult.setTestsSkippedCount((int) summary.getTestsSkippedCount());

			List<Map<String, Object>> failureList = new ArrayList<Map<String, Object>>();
			runTestResult.setFailures(failureList);

			// 打印失败详情
			summary.getFailures().forEach(failure -> {
				// log.debug("失败测试: " +
				// failure.getTestIdentifier().getDisplayName());
				// log.debug("原因: " + failure.getException().getMessage());
				// failure.getException().printStackTrace();
				//
				Map<String, Object> item = new LinkedHashMap<String, Object>();
				item.put("display_name", failure.getTestIdentifier().getDisplayName());
				item.put("message", failure.getException().getMessage());
				// item.put("stack_trace",
				// failure.getException().printStackTrace());
				failureList.add(item);
			});

			// 4. 清理
			classLoader.clearCache();

			return runTestResult;
		}
	}

	@Override
	protected void onUninstall() throws Throwable {

		// 卸载
		for (HotCodeItem hotCodeItem : hotCodeItemMap.values()) {
			if (hotCodeItem.unregisterCall != null) {
				try {
					hotCodeItem.unregisterCall.run();
				} catch (Throwable ex) {
					log.error(String.format("卸载[%1$s]发生异常，%2$s", hotCodeItem.name, ex.getMessage()), ex);
				}
			}
		}
		hotCodeItemMap.clear();

		super.onUninstall();

		if (this.classLoader != null) {
			try {
				this.classLoader.close();
			} catch (Exception ex) {
				log.error(ex);
			} finally {
				this.classLoader = null;
			}
		}
	}
}
