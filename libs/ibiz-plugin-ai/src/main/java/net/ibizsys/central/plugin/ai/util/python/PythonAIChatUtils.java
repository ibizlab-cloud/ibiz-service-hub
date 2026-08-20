package net.ibizsys.central.plugin.ai.util.python;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
//import jep.SharedInterpreter;
//import jep.SubInterpreter;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSessionHolder;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;

public class PythonAIChatUtils {

	private final static ThreadLocal<OutputStream> outputStreamThreadLocal = new ThreadLocal<OutputStream>();
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PythonAIChatUtils.class);

	public final static Map<String, String> chunkSearchContextConvertMap = new HashMap<String, String>();

	public static final int COMMAND_TIMEOUT = 7200000;

	static {
		chunkSearchContextConvertMap.put("similarity_threshold", ChunkSearchContext.FIELD_SIMILARITYTHRESHOLD);
		chunkSearchContextConvertMap.put("vector_similarity_weight", ChunkSearchContext.FIELD_VECTORSIMILARITYWEIGHT);
		chunkSearchContextConvertMap.put("text_re_rank", ChunkSearchContext.FIELD_RERANK);
		chunkSearchContextConvertMap.put("text_rerank", ChunkSearchContext.FIELD_RERANK);
		chunkSearchContextConvertMap.put("rerank", ChunkSearchContext.FIELD_RERANK);
		chunkSearchContextConvertMap.put("doc_top_k", ChunkSearchContext.FIELD_DOCTOPK);
		chunkSearchContextConvertMap.put("page_index", ChunkSearchContext.FIELD_PAGEINDEX);
		chunkSearchContextConvertMap.put("graph_rag", ChunkSearchContext.FIELD_GRAPHRAG);
		chunkSearchContextConvertMap.put("raptor", ChunkSearchContext.FIELD_RAPTOR);
		chunkSearchContextConvertMap.put("kb_guidance", ChunkSearchContext.FIELD_KBGUIDANCE);
		chunkSearchContextConvertMap.put("root", ChunkSearchContext.FIELD_ROOT);
		chunkSearchContextConvertMap.put("instruct", ChunkSearchContext.PARAM_INSTRUCT);
		chunkSearchContextConvertMap.put("chunk_view_url", ChunkSearchContext.PARAM_CHUNKVIEWURL);
		chunkSearchContextConvertMap.put("chunk_sn_prefix", ChunkSearchContext.PARAM_CHUNKSNPREFIX);
		chunkSearchContextConvertMap.put("query", ChunkSearchContext.PARAM_QUERY);
		chunkSearchContextConvertMap.put("queries", ChunkSearchContext.PARAM_QUERIES);
		chunkSearchContextConvertMap.put("doc_ids", ChunkSearchContext.FIELD_DOCIDS);
		chunkSearchContextConvertMap.put("doc_names", ChunkSearchContext.FIELD_DOCNAMES);
		chunkSearchContextConvertMap.put("kb_ids", ChunkSearchContext.FIELD_KBIDS);
		chunkSearchContextConvertMap.put("kb_id", "n_kbid_eq");
		chunkSearchContextConvertMap.put("doc_categories", ChunkSearchContext.FIELD_DOCCATEGORIES);
		chunkSearchContextConvertMap.put("languages", ChunkSearchContext.FIELD_LANGUAGES);
		chunkSearchContextConvertMap.put("types", ChunkSearchContext.FIELD_TYPES);
	}

	public static ChunkSearchContext toChunkSearchContext(Map<String, Object> body) throws Exception {
		if (ObjectUtils.isEmpty(body)) {
			return new ChunkSearchContext();
		}

		Map<String, Object> params = new HashMap<String, Object>();

		for (Map.Entry<String, Object> entry : body.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			String realKey = chunkSearchContextConvertMap.get(key);
			if (StringUtils.hasLength(realKey)) {
				params.put(realKey, value);
			} else {
				params.put(key, value);
			}
		}

		Object histories = params.remove(IChunkSearchContext.PARAM_HISTORIES);
		// 存在历史消息
		if (histories instanceof List && !ObjectUtils.isEmpty(histories)) {
			List<?> rawMessages = (List<?>) histories;
			List<Map<String, Object>> messages = new ArrayList<>();

			for (Object msgObj : rawMessages) {
				if (msgObj instanceof Map) {
					ChatMessage msg = AIChatUtils.fromOpenAIChatMessage((Map<String, Object>) msgObj);
					messages.add(msg.any());
				}
			}
			params.put(IChunkSearchContext.PARAM_HISTORIES, messages);
		}

		ChunkSearchContext chunkSearchContext = new ChunkSearchContext(params);
		// if(!ObjectUtils.isEmpty(chunkSearchContext.getKBIds()) ) {
		// chunkSearchContext.set("n_kbid_eq", chunkSearchContext);
		// }
		return chunkSearchContext;

	}

	public static Map<String, Object> fromPage(Page<?> page) {
		Map<String, Object> ret = new LinkedHashMap<String, Object>();
		ret.put("content", page.getContent());
		ret.put("total", page.getTotalElements());
		return ret;
	}

	public final static class AgentUtil {
		public String chat_completion(Map<String, Object> request, boolean appendSystem, boolean appendHistories, Map<String, Object> params) throws Throwable {
			// 翻译请求
			ChatCompletionRequest chatCompletionRequest = AIChatUtils.fromOpenAIChatCompletionRequest(request);
			ChatCompletionResult chatCompletionResult = ChatCompletionSessionHolder.peekMust().getAgentUtil().chatCompletion(chatCompletionRequest, appendSystem, appendHistories, params);
			return JsonUtils.toString(AIChatUtils.toOpenAIChatCompletionResult(chatCompletionResult));
		}

		public String fetch_chunks(Map<String, Object> context) throws Throwable {
			ChunkSearchContext chunkSearchContext = toChunkSearchContext(context);
			Page<Chunk> page = ChatCompletionSessionHolder.peekMust().getAgentUtil().fetchChunks(chunkSearchContext);
			return JsonUtils.toString(fromPage(page));
		}

		public String list_documents_by_chunks(Map<String, Object> context) throws Throwable {
			ChunkSearchContext chunkSearchContext = toChunkSearchContext(context);
			List<Document> list = ChatCompletionSessionHolder.peekMust().getAgentUtil().listDocumentsByChunks(chunkSearchContext);
			return JsonUtils.toString(list);
		}

		public String download_document(Map<String, Object> context, String document_id, String type, Map<String, Object> params) throws Throwable {
			ChunkSearchContext chunkSearchContext = toChunkSearchContext(context);
			File file = ChatCompletionSessionHolder.peekMust().getAgentUtil().downloadDocument(chunkSearchContext, document_id, type, params);
			return file.getCanonicalPath();
		}

		public void output_step(String message, String title, Map<String, Object> params) throws Throwable {
			ChatCompletionSessionHolder.peekMust().getAgentUtil().outputStep(message, title, params);
		}

		public void output_raw(String content, boolean append, Map<String, Object> params) throws Throwable {
			ChatCompletionSessionHolder.peekMust().getAgentUtil().outputRaw(content, append, params);
		}

		public void wait_for_input(String message, String next, Map<String, Object> params) throws Throwable {
			ChatCompletionSessionHolder.peekMust().getAgentUtil().waitForInput(message, next, params);
		}

		public String download_oss_file(String folder, String id, Map<String, Object> params) throws Throwable {
			File file = ChatCompletionSessionHolder.peekMust().getAgentUtil().downloadOSSFile(folder, id, params);
			return file.getCanonicalPath();
		}

	}

	public final static class Session {

		public void set_param(String key, Object value) {
			ChatCompletionSessionHolder.peekMust().setParam(key, value);
		}

		public Object get_param(String key) {
			return ChatCompletionSessionHolder.peekMust().getParam(key);
		}

		public Object reset_param(String key) {
			return ChatCompletionSessionHolder.peekMust().resetParam(key);
		}

		public String get_request() {
			ChatCompletionRequest request = ChatCompletionSessionHolder.peekMust().getRequest();
			return JsonUtils.toString(AIChatUtils.toOpenAIChatCompletionRequest(request));
		}

		public String get_next() {
			return ChatCompletionSessionHolder.peekMust().getNext();
		}

		public String get_request_oss_files() throws Throwable {
			List<String> fileFileList = new ArrayList<String>();
			ChatCompletionRequest request = ChatCompletionSessionHolder.peekMust().getRequest();
			List<File> fileList = ChatCompletionSessionHolder.peekMust().getAgentUtil().downloadRequestOSSFiles(request, new HashMap<String, Object>());
			if (!ObjectUtils.isEmpty(fileList)) {
				for (File file : fileList) {
					fileFileList.add(file.getCanonicalPath());
				}
			}
			return JsonUtils.toString(fileFileList);
		}
	}

	public final static class SystemOut {

		public void append(String msg) {
			OutputStream os = outputStreamThreadLocal.get();
			if (os != null) {
				try {
					os.write(msg.getBytes());
				} catch (IOException e) {

				}
			}
		}

		public void flush() {
			OutputStream os = outputStreamThreadLocal.get();
			if (os != null) {
				try {
					os.flush();
				} catch (IOException e) {

				}
			}
		}

	}

	static {
		try {
			PythonAIChatUtils.init();
		} catch (Throwable ex) {
			log.error(ex);
		}
	}

	public final static Session session = new Session();
	public final static SystemOut system_out = new SystemOut();
	public final static AgentUtil agent = new AgentUtil();

	private static void init() {
		// String code =
		// net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(PythonAIChatUtils.class,
		// "Module.py", false);

		// JepConfig config = new JepConfig();
		// SharedInterpreter.setConfig(config);

		// 第一个解释器：动态创建共享模块
		// try (SharedInterpreter interp1 = new SharedInterpreter()) {
		// // 创建模块
		// interp1.set("srf_session", session);
		// interp1.set("srf_system_out", system_out);
		// interp1.set("srf_agent", agent);
		// interp1.exec(code);
		// }
	}

	// public static void exec(String code, Map<String, Object> inputs,
	// Map<String, Object> outputs) {
	// try (OutputStream os = new ByteArrayOutputStream()) {
	// try {
	// exec(code, inputs, outputs, os);
	// byte[] result = ((ByteArrayOutputStream) os).toByteArray();
	// log.info(new String(result));
	// }
	// catch (Throwable ex) {
	// byte[] result = ((ByteArrayOutputStream) os).toByteArray();
	// log.info(new String(result));
	// throw ex;
	// }
	// } catch (Throwable ex) {
	//
	// ExceptionUtils.rethrowRuntimeException(ex);
	// }
	// }
	//
	// public static void exec(String code, Map<String, Object> inputs,
	// Map<String, Object> outputs, OutputStream outputStream) {
	//
	// OutputStream last = outputStreamThreadLocal.get();
	// try {
	// outputStreamThreadLocal.set(outputStream);
	// try (SharedInterpreter interp1 = new SharedInterpreter()) {
	// if (!ObjectUtils.isEmpty(inputs)) {
	// for (java.util.Map.Entry<String, Object> input : inputs.entrySet()) {
	// interp1.set(input.getKey(), input.getValue());
	// }
	// }
	//
	// interp1.exec(code);
	//
	// if (!ObjectUtils.isEmpty(outputs)) {
	// for (java.util.Map.Entry<String, Object> output : outputs.entrySet()) {
	// outputs.put(output.getKey(), interp1.getValue(output.getKey()));
	// }
	// }
	// }
	// } finally {
	// outputStreamThreadLocal.set(last);
	// }
	// }

	public static ExecuteResult exec(String pythonCommandPath, String scriptFile, String sessionId) {

		// pythonCommandPath = "D:\\Python311\\python.exe";
		// scriptFile = "Q:\\pyworkspace\\test\\test10.py";

		try {
			// String strCommand = String.format("%1$s --headless --invisible
			// --convert-to pdf --outdir \"%2$s\" \"%3$s\"",
			// command.getCanonicalPath(), pdfDir.getCanonicalPath(),
			// file.getCanonicalPath());
			String[] commandArray = { pythonCommandPath, scriptFile, "--session-id", sessionId, "--base-url", String.format("http://127.0.0.1:%1$s/local/ai/sessions", ServiceHub.getInstance().getPort()) };
			ExecuteResult result = executeCommandArray(commandArray, new File(scriptFile).getParentFile().getCanonicalFile(), COMMAND_TIMEOUT);
			if (log.isDebugEnabled()) {
				log.debug(String.format("python[%1$s]执行信息:\n%2$s", scriptFile, result.standardOutput));
			}
			return result;
		} catch (Throwable ex) {
			ExceptionUtils.rethrowRuntimeException(ex);
		} finally {

		}
		return null;
	}

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

	public static ExecuteResult executeCommand(String command, File workingDirectory) throws ExecuteException, IOException {
		return executeCommand(command, workingDirectory, COMMAND_TIMEOUT, null);
	}

	public static ExecuteResult executeCommand(String command, File workingDirectory, Map<String, String> additionalEnv) throws ExecuteException, IOException {
		return executeCommand(command, workingDirectory, COMMAND_TIMEOUT, additionalEnv);
	}

	public static ExecuteResult executeCommand(String command, File workingDirectory, long timeoutMs, Map<String, String> additionalEnv) throws ExecuteException, IOException {
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
		Map<String, String> mergedEnv = null;
		if (additionalEnv != null && !additionalEnv.isEmpty()) {
			// 获取当前系统环境变量
			mergedEnv = new HashMap<>(System.getenv());
			// 覆盖或添加自定义变量
			mergedEnv.putAll(additionalEnv);
		}

		// 4. 执行命令并获取结果
		int exitValue;
		try {
			if(mergedEnv != null) {
				exitValue = executor.execute(cmdLine, mergedEnv);
			}
			else {
				exitValue = executor.execute(cmdLine);
			}
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
		if (exitValue != 0) {
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
				log.error(String.format("命令执行超时并被终止。%s", originalCommand));
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
		if (exitValue != 0) {
			throw new ExecuteException(errorOutput, exitValue);
		}

		String standardOutput = outputStream.toString("utf-8");
		return new ExecuteResult(exitValue, standardOutput, errorOutput);
	}

	/**
	 * 判断路径是否为绝对路径
	 */
	public static boolean isAbsolutePath(String pathStr) {
		Path path = Paths.get(pathStr);
		return path.isAbsolute();
	}

	/**
	 * 将相对路径合成为绝对路径
	 * 
	 * @param basePath
	 *            基准目录 (如果是 null，则使用当前工作目录)
	 * @param relativePath
	 *            相对路径字符串
	 * @return 合成后的绝对路径字符串
	 */
	public static String resolveToAbsolute(String basePath, String relativePath) {
		Path base = (basePath == null || basePath.isEmpty()) ? Paths.get("").toAbsolutePath() : Paths.get(basePath);

		Path result = base.resolve(relativePath).normalize();
		return result.toString();
	}
}
