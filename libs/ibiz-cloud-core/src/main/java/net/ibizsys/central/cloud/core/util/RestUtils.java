package net.ibizsys.central.cloud.core.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

public class RestUtils {

	private static final Log log = LogFactory.getLog(RestUtils.class);
	
	public final static String HEADER_X_PAGE = "x-page";
	
	public final static String HEADER_PER_PAGE = "x-per-page";
	
	public final static String HEADER_X_TOTAL = "x-total";
	
	
	/**
	 * 返回分页查询对象
	 * @param page
	 * @param cls
	 * @return
	 */
	public static <T> ResponseEntity<Collection<T>> sendBackPage(Page<T> page, Class<T> cls){
        return ResponseEntity.status(HttpStatus.OK)
            .header("x-page", String.valueOf(page.getPageable().getPageNumber()))
            .header("x-per-page", String.valueOf(page.getPageable().getPageSize()))
            .header("x-total", String.valueOf(page.getTotalElements()))
            .body(page.getContent());
	}
	
	
	/**
	 * 返回分页查询对象
	 * @param page
	 * @return
	 */
	public static ResponseEntity<Collection<?>> sendBackPage(Page<?> page){
        return ResponseEntity.status(HttpStatus.OK)
            .header("x-page", String.valueOf(page.getPageable().getPageNumber()))
            .header("x-per-page", String.valueOf(page.getPageable().getPageSize()))
            .header("x-total", String.valueOf(page.getTotalElements()))
            .body(page.getContent());
	}
	
	/**
	 * 将查询串转为为Map对象
	 * @param queryString
	 * @return
	 */
	public static Map<String, Object> queryString2Map(String queryString) {
		return queryString2Map(queryString, true);
	}
	
	/**
	 * 将查询串转为为Map对象
	 * @param queryString
	 * @param bDecode
	 * @return
	 */
	public static Map<String, Object> queryString2Map(String queryString, boolean bDecode) {
		Map<String, Object> map = new LinkedHashMap<>();
		if (!StringUtils.hasLength(queryString)) {
			return map;
		}

		String[] params = queryString.split("&");
		for (String paramPair : params) {
			String[] keyAndValue = paramPair.split("=");
			if (keyAndValue.length == 2) {
				String strKey;
				String strValue;
				
				if(bDecode) {
					try {
						strKey = java.net.URLDecoder.decode(keyAndValue[0], "UTF-8");
					} catch (UnsupportedEncodingException ex) {
						strKey = keyAndValue[0];
						log.error(ex);
					}
					try {
						strValue = java.net.URLDecoder.decode(keyAndValue[1], "UTF-8");
					} catch (UnsupportedEncodingException ex) {
						strValue = keyAndValue[1];
						log.error(ex);
					}
				}
				else {
					strKey = keyAndValue[0];
					strValue = keyAndValue[1];
				}
				
				map.put(strKey, strValue);
			}
		}
		return map;
	}
	
	
	/**
	 * 将请求头转为为Map对象，键值使用小写
	 * @param httpServletRequest
	 * @return
	 */
	public static Map<String, String> header2Map(HttpServletRequest httpServletRequest) {
		return header2Map(httpServletRequest, true);
	}
	
	/**
	 * 将请求头转为为Map对象，键值使用小写
	 * @param httpServletRequest
	 * @param bDecode
	 * @return
	 */
	public static Map<String, String> header2Map(HttpServletRequest httpServletRequest, boolean bDecode) {
		Map<String, String> map = new LinkedHashMap<>();
		
		java.util.Enumeration<String> en = httpServletRequest.getHeaderNames();
		while(en.hasMoreElements()) {
			String strKey = en.nextElement();
			String strValue = httpServletRequest.getHeader(strKey);
			
			if(bDecode) {
				try {
					strValue = java.net.URLDecoder.decode(strValue, "UTF-8");
				} catch (UnsupportedEncodingException ex) {
					log.error(ex);
				}
			}
			//小写转化
			map.put(strKey.toLowerCase(), strValue);
		}
		
		return map;
	}
	
	public static void downloadFile(HttpServletResponse response, File file) throws Exception{
		downloadFile(response, file, false);
	}
	
	public static void downloadFile(HttpServletResponse response, File file, boolean enableCache) throws Exception{
		try(InputStream inputStream = new FileInputStream(file)){
			downloadFile(response, file.getName(), inputStream, enableCache);
		}
	}
	

	public static void downloadFile(HttpServletResponse response, String fileName, InputStream inputStream, boolean enableCache) throws Exception{
		response.setHeader("Content-Disposition", "attachment;filename="+getDownloadFileName(fileName));
		if(!enableCache) {
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "0");
		}
		sendResponse(response, inputStream);
	}
	
	public static String getDownloadFileName(String fileName){
		try {
			return new String(fileName.getBytes("utf-8"),"iso8859-1");//防止中文乱码
		}
		catch (UnsupportedEncodingException ex) {
			log.error(ex);
		}
		return fileName;
	}
	
	
	
	public static void sendResponse(HttpServletResponse response, InputStream inputStream){
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(inputStream);
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		}
		catch (Exception e) {
			log.error(e);
		}
		finally {
			if (bis != null) {
				try {
					bis.close();
				}
				catch (IOException e) {
					log.error(e);
				}
			}
			if (bos != null) {
				try {
					bos.close();
				}
				catch (IOException e) {
					log.error(e);
				}
			}
		}
	}
}
