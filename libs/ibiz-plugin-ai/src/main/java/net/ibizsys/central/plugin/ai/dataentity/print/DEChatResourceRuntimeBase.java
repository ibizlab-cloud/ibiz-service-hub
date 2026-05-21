package net.ibizsys.central.plugin.ai.dataentity.print;

import java.io.File;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.dataentity.print.DEPrintRuntimeBase;
import net.ibizsys.central.cloud.core.dataentity.print.IDEChatResourceRuntime;
import net.ibizsys.central.plugin.ai.util.template.AIChatUtilsFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.SysServiceAPIFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.SystemRTFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.TemplateEntity;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.PSModelEnums.PrintType;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.print.PSDEPrintImpl;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.MarkdownUtils;


public abstract class DEChatResourceRuntimeBase extends DEPrintRuntimeBase implements IDEChatResourceRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEChatResourceRuntimeBase.class);
	

	protected final static String TEMPLID = "templ_printmodel"; 

	/**
	 * 模板上下文参数：当前数据
	 */
	public final static String TEMPLATE_PARAM_DATA = "data";
	
	/**
	 * 模板上下文参数：当前数据对象
	 */
	public final static String TEMPLATE_PARAM_ENTITY = "entity";

	
	/**
	 * 模板上下文参数：系统运行时对象
	 */
	public final static String TEMPLATE_PARAM_SYS = "sys";
	
	/**
	 * 模板上下文参数：辅助工具
	 */
	public final static String TEMPLATE_PARAM_UTILS = "utils";
	
	
	/**
	 * 模板上下文参数：API 接口对象
	 */
	public final static String TEMPLATE_PARAM_API = "api";
	
	/**
	 * 模板上下文参数：实体运行时对象
	 */
	public final static String TEMPLATE_PARAM_DE = "de";
	
	/**
	 * 模板上下文参数：请求数据
	 */
	public final static String TEMPLATE_PARAM_REQUEST = "request";
	
	
	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();
	private SystemRTFreeMarkerObject systemRTFreeMarkerObject = null;
	private SysServiceAPIFreeMarkerObject sysServiceAPIFreeMarkerObject = null;
	
	
	
	@Override
	protected void onInit() throws Exception {
		this.systemRTFreeMarkerObject = new SystemRTFreeMarkerObject(this.getSystemRuntime());
		this.sysServiceAPIFreeMarkerObject = new SysServiceAPIFreeMarkerObject(this.getSystemRuntime(), null);
		super.onInit();
		
		String strPrintModel = this.getPSDEPrint().getReportModel();
		if (!StringUtils.hasLength(strPrintModel)) {
			if (!StringUtils.hasLength(this.getReportFilePath())) {
				throw new Exception("未定义报表文件路径");
			}
			strPrintModel = FileUtils.readFileToString(new File(this.getReportFilePath()), "utf-8");
		}

		stringTemplateLoader.putTemplate(TEMPLID, strPrintModel);
		config.setTemplateLoader(stringTemplateLoader);
	}
	
	@Override
	protected String onGetDefaultContentType() {
		return ReportContentType.MARKDOWN.value;
	}
	
	@Override
	protected void onFillRealPrintObjectNode(ObjectNode printObjectNode, IEntityDTO printEntityDTO) {
		super.onFillRealPrintObjectNode(printObjectNode, printEntityDTO);
		//强行设置打印类型
		printObjectNode.put(PSDEPrintImpl.ATTR_GETREPORTTYPE, PrintType.CHATRESOURCE.value);
	}
	
	@Override
	protected void onOutput(OutputStream outputStream, IEntityBase[] list, String strType) throws Throwable {
		List<TemplateEntity> templateEntityList = new ArrayList<TemplateEntity>();
		for(IEntityBase iEntityBase : list) {
			IScriptEntity iScriptEntity = this.getSystemRuntime().createScriptEntity((IEntity)iEntityBase);
			TemplateEntity templateEntity = this.createTemplateEntity(iScriptEntity);
			templateEntityList.add(templateEntity);
		}
		String strContent = this.getContent(templateEntityList, TEMPLID, null);
		
		if(ReportContentType.HTML.value.equalsIgnoreCase(strType)) {
			//转为HTML
			strContent = MarkdownUtils.toHtml(strContent);
		}
		
		outputStream.write(strContent.getBytes("utf-8"));
	}
	
	protected TemplateEntity createTemplateEntity(IScriptEntity iScriptEntity) {
		return new TemplateEntity(iScriptEntity);
	}
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable {

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if (params != null) {
			engineParams.putAll(params);
		}
		engineParams.put(TEMPLATE_PARAM_DATA, data);

		// engineParams.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
		if (this.getDataEntityRuntime() != null) {
			// engineParams.put(TEMPLATE_PARAM_DE, this.getDataEntityRuntime());
		} else {
			engineParams.put(TEMPLATE_PARAM_DE, null);
		}

		engineParams.put(TEMPLATE_PARAM_REQUEST, ChatCompletionRequestHolder.peek());
		engineParams.put(TEMPLATE_PARAM_UTILS, AIChatUtilsFreeMarkerObject.getInstance());
		engineParams.put(TEMPLATE_PARAM_SYS, this.systemRTFreeMarkerObject);
		engineParams.put(TEMPLATE_PARAM_API, this.sysServiceAPIFreeMarkerObject);
		
		try {
			freemarker.template.Template template = config.getTemplate(strTemplateId);
			StringWriter sw = new StringWriter();
			template.process(engineParams, sw);
			String strContent = sw.toString();
			return strContent;
		} catch (Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
			return ex.getMessage();
		}

	}
}
