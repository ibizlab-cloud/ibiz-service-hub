package net.ibizsys.central.cloud.oss.core.addin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class LibreOfficeOSSTextProviderBase extends PandocOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(LibreOfficeOSSTextProviderBase.class);

	protected static final Map<String, String> libreOfficeSupportedFormats = new HashMap<>();
	
	static {
		List<String[]> list = Arrays.asList(new String[][]{
	        // --- ODF 原生格式 ---
	        {"odt", "ODF 文本文档"}, {"ott", "ODF 文本文档模板"}, 
	        {"ods", "ODF 电子表格"}, {"ots", "ODF 电子表格模板"}, 
	        {"odp", "ODF 演示文稿"}, {"otp", "ODF 演示文稿模板"}, 
	        {"odg", "ODF 绘图"}, {"otg", "ODF 绘图模板"}, 
	        {"odf", "ODF 公式"}, {"odb", "ODF 数据库"}, 
	        {"fodt", "扁平化 XML 文本"}, {"fods", "扁平化 XML 电子表格"}, 
	        {"fodp", "扁平化 XML 演示文稿"}, {"fodg", "扁平化 XML 绘图"}, 
	        {"sxw", "OpenOffice.org 1.0 文本"}, {"stw", "OpenOffice.org 1.0 文本模板"}, 
	        {"sxc", "OpenOffice.org 1.0 电子表格"}, {"stc", "OpenOffice.org 1.0 电子表格模板"}, 
	        {"sxi", "OpenOffice.org 1.0 演示文稿"}, {"sti", "OpenOffice.org 1.0 演示文稿模板"}, 
	        {"sxd", "OpenOffice.org 1.0 绘图"}, {"std", "OpenOffice.org 1.0 绘图模板"}, 
	        {"sxm", "OpenOffice.org 1.0 公式"}, 
	        
	        // --- Microsoft Office (Word / Works / Write) ---
	        {"docx", "Microsoft Word 2007-365"}, {"docm", "Microsoft Word 2007-365 宏启用"}, 
	        {"dotx", "Microsoft Word 2007-365 模板"}, {"dotm", "Microsoft Word 2007-365 宏启用模板"}, 
	        {"doc", "Microsoft Word 97-2003"}, {"dot", "Microsoft Word 97-2003 模板"}, 
	        {"rtf", "富文本格式 (RTF)"}, {"txt", "纯文本 (TXT)"}, 
	        {"wps", "Microsoft Works 文字处理"}, {"wri", "Windows Write"}, 
	        {"mcw", "MacWrite"}, {"mw", "MacWrite II"}, 
	        {"sdw", "StarWriter 5.0"}, {"vor", "StarOffice 模板 (通用)"}, 
	        {"sgl", "StarWriter 全局文档"}, {"sxg", "StarWriter 5.0 主控文档"}, 
	        {"odm", "ODF 主控文档"}, {"oth", "ODF HTML 文档模板"}, 
	
	        // --- Microsoft Office (Excel / Quattro Pro / Calc) ---
	        {"xlsx", "Microsoft Excel 2007-365"}, {"xlsm", "Microsoft Excel 2007-365 宏启用"}, 
	        {"xltx", "Microsoft Excel 2007-365 模板"}, {"xltm", "Microsoft Excel 2007-365 宏启用模板"}, 
	        {"xlsb", "Microsoft Excel 二进制工作簿"}, {"xls", "Microsoft Excel 97-2003"}, 
	        {"xlt", "Microsoft Excel 97-2003 模板"}, {"xlw", "Microsoft Excel 97-2003 工作区"}, 
	        {"xlc", "Microsoft Excel 97-2003 图表"}, {"xlm", "Microsoft Excel 97-2003 宏"}, 
	        {"csv", "逗号分隔值 (CSV)"}, {"tsv", "制表符分隔值 (TSV)"}, 
	        {"dif", "数据交换格式 (DIF)"}, {"slk", "符号链接格式 (SYLK)"}, 
	        {"dbf", "dBASE 数据库"}, {"wk1", "Lotus 1-2-3 (WK1)"}, 
	        {"wks", "Microsoft Works 电子表格"}, {"123", "Lotus 1-2-3"}, 
	        {"wb1", "Quattro Pro (WB1/WB2)"}, {"wb2", "Quattro Pro (WB2)"}, 
	        {"pxl", "Pocket Excel"}, {"numbers", "Apple Numbers (需 macOS)"}, 
	        
	        // --- Microsoft Office (PowerPoint / Impress) ---
	        {"pptx", "Microsoft PowerPoint 2007-365"}, {"pptm", "Microsoft PowerPoint 2007-365 宏启用"}, 
	        {"ppsx", "Microsoft PowerPoint 2007-365 幻灯片放映"}, {"ppsm", "Microsoft PowerPoint 2007-365 宏启用放映"}, 
	        {"potx", "Microsoft PowerPoint 2007-365 模板"}, {"potm", "Microsoft PowerPoint 2007-365 宏启用模板"}, 
	        {"ppt", "Microsoft PowerPoint 97-2003"}, {"pps", "Microsoft PowerPoint 97-2003 幻灯片放映"}, 
	        {"pot", "Microsoft PowerPoint 97-2003 模板"}, {"sdd", "StarDraw/Impress 5.0"}, 
	        {"sdp", "StarDraw/Impress 5.0"}, 
	
	        // --- 绘图与矢量图 (Draw / Visio / CorelDRAW) ---
	        {"vsd", "Microsoft Visio 绘图"}, {"vst", "Microsoft Visio 模板"}, 
	        {"vsdx", "Microsoft Visio 2013 绘图"}, {"vssx", "Microsoft Visio 2013 模具"}, 
	        {"cdr", "CorelDRAW"}, {"cmx", "Corel Metafile Exchange"}, 
	        {"cgm", "计算机图形元文件 (CGM)"}, {"emf", "增强型 Windows 元文件"}, 
	        {"wmf", "Windows 元文件"}, {"svg", "可缩放矢量图形 (SVG)"}, 
	        {"svm", "StarView 元文件"}, {"eps", "封装式 PostScript"}, 
	        {"pct", "Macintosh PICT"}, {"met", "OS/2 元文件"}, 
	        
	        // --- 位图与光栅图像 ---
	        {"bmp", "Windows 位图"}, {"gif", "图形交换格式 (GIF)"}, 
	        {"jpg", "联合图像专家组 (JPEG)"}, {"jpeg", "联合图像专家组 (JPEG)"}, 
	        {"png", "便携式网络图形 (PNG)"}, {"tiff", "标记图像文件格式 (TIFF)"}, 
	        {"tif", "标记图像文件格式 (TIFF)"}, {"pcx", "PC Paintbrush"}, 
	        {"ras", "Sun 光栅图像"}, {"xpm", "X PixMap"}, {"pbm", "便携式位图"}, 
	        {"pgm", "便携式灰度图"}, {"ppm", "便携式像素图"}, {"psd", "Adobe Photoshop"}, 
	        
	        // --- 出版、电子书与其他文档 ---
	        {"pdf", "便携式文档格式 (PDF - 仅导入)"}, {"epub", "电子出版物 (EPUB)"}, 
	        {"fb2", "FictionBook 2"}, {"pdb", "Palm Database (AportisDoc/Mobipocket)"}, 
	        {"hwp", "Hancom Hangul WP 97"}, {"lwp", "Lotus Word Pro"}, 
	        {"psw", "Pocket Word"}, {"html", "HTML 文档"}, 
	        {"htm", "HTML 文档"}, {"xml", "XML 文档"}, 
	        {"p65", "PageMaker 6.5"}, {"pub", "Microsoft Publisher"}, 
	        
	        // --- 旧版 StarOffice / Lotus ---
	        {"sda", "StarDraw 5.0"}, {"vor", "StarOffice 4.0/5.0 模板"}, 
	        {"wk3", "Lotus 1-2-3 (WK3)"}, {"wk4", "Lotus 1-2-3 (WK4)"}, 
	        {"wq1", "Quattro Pro (WQ1)"}, {"wq2", "Quattro Pro (WQ2)"}, 
	        
	        // --- 其他杂项 ---
	        {"mml", "MathML 2.0"}, {"sgv", "StarDraw 3.0"}, 
	        {"ltx", "LaTeX 2e"}, {"tex", "LaTeX 2e"}, 
	        {"bib", "BibTeX 参考文献"}, {"wdb", "Microsoft Works 数据库"}
	    });
		
		for(String[] value : list) {
			libreOfficeSupportedFormats.put(value[0], value[1]);
		}
	}
	
	private Map<String, Object> libreOfficeParams = new ConcurrentHashMap<String, Object>();
	private String strLibreOfficePath = null;
	
	
	@Override
	protected void onInit() throws Exception {
		this.getContext().getSettings("libreoffice", this.libreOfficeParams);
		this.strLibreOfficePath = DataTypeUtils.asString(this.libreOfficeParams.get("path"));
		super.onInit();
	}

	protected String getLibreOfficeCommandPath() {
		return strLibreOfficePath;
	}
	
	@Override
	protected void onReloadSetting() throws Throwable {
		this.libreOfficeParams.clear();
		this.getContext().getSettings("libreoffice", this.libreOfficeParams);
		this.strLibreOfficePath = DataTypeUtils.asString(this.libreOfficeParams.get("path"));
		super.onReloadSetting();
	}
	
	@Override
	public boolean isEnabled() {
		return StringUtils.hasLength(getLibreOfficeCommandPath()) || super.isEnabled();
	}
	
	
	protected boolean testLibreOfficeSupportedFormat(String ext) {
		if(StringUtils.hasLength(ext)) {
			return libreOfficeSupportedFormats.containsKey(ext.toLowerCase());
		}
		return false;
	}
	
}
