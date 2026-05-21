package net.ibizsys.central.cloud.core.cloudutil.client;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.util.ISearchContext;

public interface ICloudOSSClient {

	
	/**
	 *下载文本 参数：文本类型
	 */
	public final static String DOWNLOAD_TEXT_PARAM__TYPE = "type";
	
	/**
	 * 下载文本参数：重新构建
	 */
	public final static String DOWNLOAD_TEXT_PARAM__REBUILD = "rebuild";
	
	
	/**
	 * 下载文本参数：提示词
	 */
	public final static String DOWNLOAD_TEXT_PARAM__PROMPT = "prompt";
	
	/**
	 * 下载文本参数：完整
	 */
	public final static String DOWNLOAD_TEXT_PARAM__FULL = "full";
	
	
	/**
	 * 下载文本参数：AI摘要模式
	 */
	public final static String DOWNLOAD_TEXT_PARAM__AIDIGEST = "aidigest";
	
	
	/**
	 * 下载文本参数：指定处理引擎
	 */
	public final static String DOWNLOAD_TEXT_PARAM__ENGINE = "engine";
	
	/**
	 * 下载文本参数：VL提示词
	 */
	public final static String DOWNLOAD_TEXT_PARAM_PROMPT = "prompt";
	
	
	/**
	 * 文本类型：md
	 */
	public final static String DOWNLOAD_TEXT_TYPE__MD  = "md";
	
	/**
	 * 文本类型：html
	 */
	public final static String DOWNLOAD_TEXT_TYPE__HTML  = "html";
	
	/**
	 * 文本类型：plain
	 */
	public final static String DOWNLOAD_TEXT_TYPE__PLAIN  = "plain";
	
	/**
	 * 文本类型：pageindex 页面索引
	 */
	public final static String DOWNLOAD_TEXT_TYPE__PAGEINDEX  = "pageindex";
	
	/**
	 * 文本类型：JSON数据文件
	 */
	public final static String DOWNLOAD_TEXT_TYPE__JSON  = "json";
	
	
	/**
	 * 下载文本引擎：OCR
	 */
	public final static String DOWNLOAD_TEXT_ENGINE__OCR = "OCR";
	
	/**
	 * 下载文本引擎：大模型vl
	 */
	public final static String DOWNLOAD_TEXT_ENGINE__VL = "VL";
	
	/**
	 * 下载文本引擎：PPT
	 */
	public final static String DOWNLOAD_TEXT_ENGINE__PPT = "PPT";
	
	/**
	 * 下载文本引擎：手册
	 */
	public final static String DOWNLOAD_TEXT_ENGINE__MANUAL = "MANUAL";
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/oss/object/{db}/{table}")
	String createObject(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody Map params);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/oss/object/{db}/{table}/{key}")
	Integer updateObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key, @RequestBody Map params);

	@RequestMapping(method = RequestMethod.DELETE, value = "/oss/object/{db}/{table}/{key}")
	Integer deleteObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.GET, value = "/oss/object/{db}/{table}/{key}")
	Map getObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/oss/object/{db}/{table}/fetch")
	Page<Map> fetchObjects(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody ISearchContext iSearchContext);
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/createdownloadticket/{cat}/{id}")
	DownloadTicket createDownloadTicket(@PathVariable("cat") String cat, @PathVariable("id") String id);
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/createdownloadticket/{id}")
	DownloadTicket createDownloadTicket(@PathVariable("id") String id);
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/downloadtxt/{cat}/{id}")
	String downloadText(@PathVariable("cat") String cat, @PathVariable("id") String id);
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/downloadtxt/{id}")
	String downloadText(@PathVariable("id") String id);
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/downloadtxt/{cat}/{id}")
	String downloadText(@PathVariable("cat") String cat, @PathVariable("id") String id, @RequestParam Map<String, Object> params);
	
	@RequestMapping(method = RequestMethod.GET, value = "/ibizutil/downloadtxt/{id}")
	String downloadText(@PathVariable("id") String id, @RequestParam Map<String, Object> params);
}
