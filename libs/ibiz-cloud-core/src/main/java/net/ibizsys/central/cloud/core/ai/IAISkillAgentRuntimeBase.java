package net.ibizsys.central.cloud.core.ai;

import java.util.Map;

public interface IAISkillAgentRuntimeBase {

	public final static String COMMAND_EXECUTE_BASH = "execute_bash";
	public final static String COMMAND_READ_FILE = "read_file";
	public final static String COMMAND_WRITE_FILE = "write_file";
	public final static String COMMAND_DELETE_FILE = "delete_file";
	public final static String COMMAND_EXECUTE_CLOUD = "execute_cloud";
	
	public final static String COMMAND_FETCH_KBS = "fetch_kbs";
	
	public final static String COMMAND_FETCH_KB_CHUNKS = "fetch_kb_chunks";
	
	
	/**
	 * 调用子代理
	 */
	public final static String COMMAND_EXECUTE_CHAT = "execute_chat";
	/**
	 * 上传文件
	 */
	public final static String COMMAND_UPLOAD_FILE = "upload_file";
	/**
	 * 下载文件
	 */
	public final static String COMMAND_DOWNLOAD_FILE = "download_file";
	/**
	 * 对文件应用补丁
	 */
	public final static String COMMAND_APPLY_PATCH = "apply_patch";
	
	/**
	 * 输出步骤
	 */
	public final static String COMMAND_OUTPUT_STEP = "output_step";
	
	/**
	 * 列出文件
	 */
	public final static String COMMAND_LIST_FILE = "list_file";
	

	public final static String COMMAND_PARAM_SKILL_ID = "skill_id";
	
	/**
	 * 系统参数，通知来自模板调用
	 */
	public final static String COMMAND_PARAM_FROM_TEMPLATE = "from_template";
	public final static String COMMAND_PARAM_EXECUTE_BASH_COMMAND = "command";
	public final static String COMMAND_PARAM_EXECUTE_BASH_PROFILE = "profile";
	public final static String COMMAND_PARAM_EXECUTE_BASH_ENV = "env";
	public final static String COMMAND_PARAM_WORKSPACE = "workspace";
	
	public final static String COMMAND_PARAM_X_FILE_PATH = "file_path";
	public final static String COMMAND_PARAM_WRITE_FILE_CONTENT = "content";
	public final static String COMMAND_PARAM_WRITE_FILE_APPEND = "append";
	public final static String COMMAND_PARAM_UPLOAD_FILE_FOLDER = "folder";
	public final static String COMMAND_PARAM_DOWNLOAD_FILE_URL = "url";
	
	
	
	public final static String COMMAND_PARAM_EXECUTE_CLOUD_URL = "url";
	public final static String COMMAND_PARAM_EXECUTE_CLOUD_METHOD = "method";
	public final static String COMMAND_PARAM_EXECUTE_CLOUD_BODY = "body";
	
	public final static String COMMAND_PARAM_EXECUTE_CHAT_REQUEST = "request";
	public final static String COMMAND_PARAM_EXECUTE_CHAT_DATA = "data";
	public final static String COMMAND_PARAM_EXECUTE_CHAT_KB_QUERY = "kb_query";

	public final static String COMMAND_PARAM_FETCH_KBS_QUERIES = "queries";
	public final static String COMMAND_PARAM_FETCH_KBS_SIZE = "size";
	
	
	public final static String COMMAND_PARAM_FETCH_KB_CHUNKS_KB_TAG = "kb_tag";
	public final static String COMMAND_PARAM_FETCH_KB_CHUNKS_SIMILARITY = "similarity";
	public final static String COMMAND_PARAM_FETCH_KB_CHUNKS_RERANK = "rerank";
	public final static String COMMAND_PARAM_FETCH_KB_CHUNKS_RAPTOR = "raptor";
	public final static String COMMAND_PARAM_FETCH_KB_CHUNKS_DOCTOPK = "doctopk";
	
	public final static String COMMAND_PARAM_APPLY_PATCH_NEW_FILE_PATH = "new_file_path";
	public final static String COMMAND_PARAM_APPLY_PATCH_UNIFIED_DIFF = "unified_diff";
	
	
	/**
	 * 内容
	 */
	public final static String COMMAND_PARAM_OUTPUT_STEP_CONTENT = "content";
	
	/**
	 * 思维内容
	 */
	public final static String COMMAND_PARAM_OUTPUT_STEP_REASONING_CONTENT = "reasoning_content";
	
	/**
	 * 来源通道
	 */
	public final static String COMMAND_PARAM_OUTPUT_STEP_SOURCE_CHANNEL = "source_channel";
	
	
	
	
	/**
	 * 工具调用
	 * @param command
	 * @param args
	 * @param request
	 * @param response
	 * @return
	 * @throws Throwable
	 */
	Object toolCall(String command, Map<String, Object> args) throws Throwable;
}
