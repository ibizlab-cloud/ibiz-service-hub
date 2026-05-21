package net.ibizsys.central.cloud.oss.core.addin;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class PandocOSSTextProviderBase extends AIDigestOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(PandocOSSTextProviderBase.class);

	public static final int COMMAND_TIMEOUT = 180000;
	private Map<String, Object> pandocParams = new ConcurrentHashMap<String, Object>();
	private String strPandocPath = null;

	public static class ExecuteResult {
		public final int exitValue;
		public final String standardOutput;
		public final String errorOutput;

		public ExecuteResult(int exitValue, String standardOutput, String errorOutput) {
			this.exitValue = exitValue;
			this.standardOutput = standardOutput;
			this.errorOutput = errorOutput;
		}
	}

	@Override
	protected void onInit() throws Exception {
		this.getContext().getSettings("pandoc", this.pandocParams);
		this.strPandocPath = DataTypeUtils.asString(this.pandocParams.get("path"));
		super.onInit();
	}

	protected String getPandocCommandPath() {
		return strPandocPath;
	}

	
	@Override
	protected void onReloadSetting() throws Throwable {
		this.pandocParams.clear();
		this.getContext().getSettings("pandoc", this.pandocParams);
		this.strPandocPath = DataTypeUtils.asString(this.pandocParams.get("path"));
		super.onReloadSetting();
	}
	
	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		String strPath = this.getPandocCommandPath();
		if (StringUtils.hasLength(strPath)) {
			File command = new File(strPath);
			File workingDirectory = command.getParentFile();

			//String strCommand = String.format("%1$s %2$s -o %3$s", command.getName(), file.getCanonicalPath(), textFile.getCanonicalPath());
			String[] commandArray = {
					command.getName(),
					file.getCanonicalPath(),
					"-o", textFile.getCanonicalPath()
			};

			ExecuteResult result = executeCommandArray(commandArray, workingDirectory, COMMAND_TIMEOUT);
			if (result.exitValue == 0) {
				return FileUtils.readFileToString(textFile, "utf-8");
			}
		}
		return super.doGetText(cat, fileId, file, type, params, textFile);
	}

	public static ExecuteResult executeCommandWithStreams(String command, File workingDirectory, long timeoutMs) throws ExecuteException, IOException {
		CommandLine cmdLine = CommandLine.parse(command);
		DefaultExecutor executor = new DefaultExecutor();

		// 1. 创建并设置流处理器
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
		PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);
		executor.setStreamHandler(streamHandler);

		// 2. 设置超时看门狗
		ExecuteWatchdog watchdog = new ExecuteWatchdog(timeoutMs);
		executor.setWatchdog(watchdog);

		// 3. 设置工作目录（可选）
		if (workingDirectory != null) {
			executor.setWorkingDirectory(workingDirectory);
		}

		// 4. 执行命令并获取结果
		int exitValue;
		try {
			exitValue = executor.execute(cmdLine);
		} catch (Throwable e) {
			// 判断是否因超时终止
			if (watchdog.killedProcess()) {
				log.error("命令执行超时并被终止。");
			}
			// 将捕获的错误流信息封装到异常中，或直接抛出
			String errorOutput = errorStream.toString("utf-8"); // 注意编码
			if (e instanceof ExecuteException) {
				throw new ExecuteException(errorOutput, ((ExecuteException) e).getExitValue(), e);
			}
			throw e;
		}

		// 5. 获取输出
		String errorOutput = errorStream.toString("utf-8");
		if(exitValue != 0) {
			throw new ExecuteException(errorOutput, exitValue);
		}
		
		String standardOutput = outputStream.toString("utf-8");
		return new ExecuteResult(exitValue, standardOutput, errorOutput);
	}


	public static ExecuteResult executeCommandArray(String[] commandArray, File workingDirectory, long timeoutMs) throws ExecuteException, IOException {


		// 记录原始命令用于日志
		String originalCommand = String.join(" ", commandArray);

		CommandLine cmdLine = new CommandLine(commandArray[0]);
		for (int i = 1; i < commandArray.length; i++) {
			// 添加每个参数，Apache Commons Exec会自动处理
			cmdLine.addArgument(commandArray[i], false);
		}

		DefaultExecutor executor = new DefaultExecutor();

		// 1. 创建并设置流处理器
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
		PumpStreamHandler streamHandler = new PumpStreamHandler(outputStream, errorStream);
		executor.setStreamHandler(streamHandler);

		// 2. 设置超时看门狗
		ExecuteWatchdog watchdog = new ExecuteWatchdog(timeoutMs);
		executor.setWatchdog(watchdog);

		// 3. 设置工作目录（可选）
		if (workingDirectory != null) {
			executor.setWorkingDirectory(workingDirectory);
		}

		// 4. 执行命令并获取结果
		int exitValue;
		try {
			exitValue = executor.execute(cmdLine);
		} catch (Throwable e) {
			// 判断是否因超时终止
			if (watchdog.killedProcess()) {
				log.error(String.format("命令执行超时并被终止。%s",originalCommand));
			}
			// 将捕获的错误流信息封装到异常中，或直接抛出
			String errorOutput = errorStream.toString("utf-8"); // 注意编码
			if (e instanceof ExecuteException) {
				throw new ExecuteException(errorOutput, ((ExecuteException) e).getExitValue(), e);
			}
			throw e;
		}

		// 5. 获取输出
		String errorOutput = errorStream.toString("utf-8");
		if(exitValue != 0) {
			throw new ExecuteException(errorOutput, exitValue);
		}

		String standardOutput = outputStream.toString("utf-8");
		return new ExecuteResult(exitValue, standardOutput, errorOutput);
	}

	@Override
	public boolean isEnabled() {
		return StringUtils.hasLength(this.getPandocCommandPath());
	}
}
