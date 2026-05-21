package net.ibizsys.central.cloud.core.dataentity.print;

import java.io.File;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.cloud.core.util.freemarker.ITemplateEntity;
import net.ibizsys.central.cloud.core.util.freemarker.TemplateEntity;
import net.ibizsys.central.util.freemarker.SystemRTFreeMarkerObject;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * FreeMarker实体打印运行时对象
 * 
 * @author lionlau
 *
 */
public class FreeMarkerDEPrintRuntime extends DEPrintRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(FreeMarkerDEPrintRuntime.class);

	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();
	private SystemRTFreeMarkerObject systemRTFreeMarkerObject = null;
	
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
	
	@Override
	protected void onInit() throws Exception {
		this.systemRTFreeMarkerObject = new SystemRTFreeMarkerObject(this.getSystemRuntime().getSystemRTScriptContext());
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
	protected IEntityBase[] onBeforeOutput(IEntityBase[] list, String strType) throws Throwable {
		return super.onBeforeOutput(list, strType);
	}

	@Override
	protected void onOutput(OutputStream outputStream, IEntityBase[] list, String strType) throws Throwable {
		List<ITemplateEntity> templateEntityList = new ArrayList<ITemplateEntity>();
		for(IEntityBase iEntityBase : list) {
			IScriptEntity iScriptEntity = this.getSystemRuntime().createScriptEntity((IEntity)iEntityBase);
			ITemplateEntity iTemplateEntity = this.createTemplateEntity(iScriptEntity);
			templateEntityList.add(iTemplateEntity);
		}
		String strContent = this.getContent(templateEntityList, TEMPLID, null);
		
		outputStream.write(strContent.getBytes("utf-8"));
	}
	
	protected ITemplateEntity createTemplateEntity(IScriptEntity iScriptEntity) {
		return new TemplateEntity(iScriptEntity);
	}
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable {

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if (params != null) {
			engineParams.putAll(params);
		}
		engineParams.put(TEMPLATE_PARAM_DATA, data);
		engineParams.put(TEMPLATE_PARAM_SYS, this.systemRTFreeMarkerObject);
		
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

	@Override
	protected String getDefaultContentType() {
		return ReportContentType.MARKDOWN.value;
	}
}
