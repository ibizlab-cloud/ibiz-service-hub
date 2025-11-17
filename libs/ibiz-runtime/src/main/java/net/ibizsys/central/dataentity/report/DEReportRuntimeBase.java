package net.ibizsys.central.dataentity.report;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ISearchContextBase;

public abstract class DEReportRuntimeBase extends net.ibizsys.runtime.dataentity.report.DEReportRuntime implements IDEReportRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEReportRuntimeBase.class);
	
	private String strReportFilePath = null;
	private String strAccessKey = null;
	
	@Override
	protected void onInit() throws Exception {
		
		if(this.getPSDEReport().getPSSysUniRes() != null) {
			this.strAccessKey = this.getPSDEReport().getPSSysUniRes().getResCode();
		}
		
		super.onInit();
		
		//准备本地报表文件
		if(!StringUtils.hasLength(getReportFilePath())) {
			prepareReportFilePath();
		}
	}
	
	
	
	@Override
	public String getAccessKey() {
		return this.strAccessKey;
	}


	@Override
	protected String getReportFilePath() {
		return this.strReportFilePath;
	}
	
	protected void setReportFilePath(String strReportFilePath) {
		this.strReportFilePath = strReportFilePath;
	}
	
	protected void prepareReportFilePath() throws Exception{
		String strReportFilePath = this.getPSDEReport().getReportFile();
		if(!StringUtils.hasLength(strReportFilePath)) {
			return;
		}
		
		//判断文件路径类型
		String strReportFilePath2 = strReportFilePath.toLowerCase();
		if((strReportFilePath2.indexOf("http://") == 0)
				|| (strReportFilePath2.indexOf("https://") == 0)) {
			//进行文件下载
			File tempFile = File.createTempFile("dereport", getDefaultReportFileSuffix());
			try {
				this.getSystemRuntime().getDefaultWebClient().download(strReportFilePath, null, null, null, tempFile, null);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("下载远程报表文件发生异常，%1$s", ex.getMessage()), ex);
			}
			this.setReportFilePath(tempFile.getCanonicalPath());
		}
		else {
			if(!StringUtils.hasLength(this.getSystemRuntime().getReportFolder())) {
				if(StringUtils.hasLength(this.getReportModel())) {
					return;
				}
				throw new Exception(String.format("系统未定义报表存储文件夹"));
			}
			File file = new File(this.getSystemRuntime().getReportFolder() + strReportFilePath);
			if(!file.exists()) {
				if(StringUtils.hasLength(this.getReportModel())) {
					return;
				}
				throw new Exception(String.format("指定报表文件不存在"));
			}
			this.setReportFilePath(file.getCanonicalPath());
		}
	}
	
	
	
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return (IDynaInstDataEntityRuntime)super.getDynaInstDataEntityRuntime();
	}
	
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	
	
	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return (IDynaInstRuntime)super.getDynaInstRuntime();
	}
	
	/**
	 * 获取默认报表文件后缀
	 * @return
	 */
	protected String getDefaultReportFileSuffix() {
		return null;
	}
	
	@Override
	public void output(ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
		try {
			this.onOutput(servletResponse, iSearchContext, strType, bTestPriv);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("输出报表发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	/**
	 * 输出报表
	 * @param servletResponse
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Throwable
	 */
	protected void onOutput(ServletResponse servletResponse, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		this.output(bos, iSearchContext, strType, bTestPriv);
		this.outputContentType(servletResponse, strType, null);
		bos.writeTo(servletResponse.getOutputStream());
	}
	
	/**
	 * 输出内容类型
	 * @param servletResponse
	 * @param strType
	 * @param strFileName
	 * @throws Exception
	 */
	protected void outputContentType(ServletResponse servletResponse, String strType, String strFileName) throws Exception{
		
		if(StringUtils.hasLength(strType)) {
			ReportContentType reportContentType = ReportContentType.from(strType.toUpperCase());
			outputContentType(servletResponse, reportContentType);
			if(!StringUtils.hasLength(strFileName)) {
				switch(reportContentType) {
				case DOCX:
					strFileName = "report.docx";
					break;
				case PDF:
					strFileName = "report.pdf";
					break;
				default:
					break;
				}
			}
		}
		
		if(!StringUtils.hasLength(strFileName)) {
			return;
		}
		
		if(servletResponse instanceof HttpServletResponse) {
			
			String strFileName2 = new String(URLEncoder.encode(strFileName, "utf-8").getBytes("utf-8"), "iso8859-1");
			
			HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
			httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			httpServletResponse.setHeader("Pragma", "no-cache");
			httpServletResponse.setHeader("Expires", "0");
			httpServletResponse.setHeader("charset", "utf-8");
			if(StringUtils.hasLength(strFileName)) {
				httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName2, URLEncoder.encode(strFileName, "utf-8")));
			}
		}
	}
	
    public static void outputContentType(ServletResponse servletResponse, ReportContentType reportContentType) {
		switch(reportContentType) {
		case DOCX:
			servletResponse.setContentType(MIME_DOCX);
			break;
		case PDF:
			servletResponse.setContentType(MediaType.APPLICATION_PDF_VALUE);
			break;
		case HTML:
			servletResponse.setContentType(MediaType.TEXT_HTML_VALUE);
			break;
		case JSON:
			servletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
			break;
		case XML:
			servletResponse.setContentType(MediaType.APPLICATION_XML_VALUE);
			break;
		case TEXT:
			servletResponse.setContentType(MediaType.TEXT_PLAIN_VALUE);
			break;
		default:
			log.warn(String.format("未支持的类型[%1$s]", reportContentType.value));
			break;
		}
	}
    
    @Override
    protected void onOutput(OutputStream outputStream, Object data, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
    	onOutput(outputStream, data, (ISearchContext)iSearchContextBase, strType, bTestPriv);
    }
    
    protected void onOutput(OutputStream outputStream, Object data, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
    	this.onOutput(outputStream, data, iSearchContext, strType);
    }
    
    
    protected void onOutput(OutputStream outputStream, Object data, ISearchContext iSearchContext, String strType) throws Throwable {
    	throw new Exception("没有实现");
    }
}
