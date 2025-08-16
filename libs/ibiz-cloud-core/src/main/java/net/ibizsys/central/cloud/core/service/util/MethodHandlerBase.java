package net.ibizsys.central.cloud.core.service.util;

import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.cloud.core.util.error.InternalServerErrorException;
import net.ibizsys.central.util.IPage;
import net.ibizsys.central.util.IWebResponse;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.ActionSessionManager;

public abstract class MethodHandlerBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MethodHandlerBase.class);
	
	public static ObjectMapper MAPPER = new ObjectMapper();
	static {
		MAPPER.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}
	
	private static boolean bEnableCompress = true;
	
	/**
	 * 设置是否支持压缩
	 * @param bEnableCompress
	 */
	public static void setEnableCompress(boolean bEnableCompress) {
		MethodHandlerBase.bEnableCompress = bEnableCompress;
	}
	
	/**
	 * 获取是否支持压缩
	 * @return
	 */
	public static boolean isEnableCompress() {
		return MethodHandlerBase.bEnableCompress;
	}
	
	private static int nCompressMinSize = 2048;
	
	/**
	 * 设置启用压缩的最小长度
	 * @param bEnableCompress
	 */
	public static void setCompressMinSize(int nCompressMinSize) {
		MethodHandlerBase.nCompressMinSize = nCompressMinSize;
	}
	
	/**
	 * 获取启用压缩的最小长度
	 * @return
	 */
	public static int getCompressMinSize() {
		return MethodHandlerBase.nCompressMinSize;
	}

	private static Method fetchMethod = null;
	public static Method getFetchMethod() {
		if(MethodHandlerBase.fetchMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("fetch")) {
					MethodHandlerBase.fetchMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.fetchMethod;
	}
	
	private static Method pfetchMethod = null;
	public static Method getPFetchMethod() {
		if(MethodHandlerBase.pfetchMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("pfetch")) {
					MethodHandlerBase.pfetchMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.pfetchMethod;
	}
	
	private static Method fetch0Method = null;
	public static Method getFetch0Method() {
		if(MethodHandlerBase.fetch0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("fetch0")) {
					MethodHandlerBase.fetch0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.fetch0Method;
	}
	
	private static Method pfetch0Method = null;
	public static Method getPFetch0Method() {
		if(MethodHandlerBase.pfetch0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("pfetch0")) {
					MethodHandlerBase.pfetch0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.pfetch0Method;
	}
	
	private static Method getMethod = null;
	public static Method getGetMethod() {
		if(MethodHandlerBase.getMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("get")) {
					MethodHandlerBase.getMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.getMethod;
	}
	
	
	private static Method pgetMethod = null;
	public static Method getPGetMethod() {
		if(MethodHandlerBase.pgetMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("pget")) {
					MethodHandlerBase.pgetMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.pgetMethod;
	}
	
	
	
	private static Method get0Method = null;
	public static Method getGet0Method() {
		if(MethodHandlerBase.get0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("get0")) {
					MethodHandlerBase.get0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.get0Method;
	}
	
	private static Method pget0Method = null;
	public static Method getPGet0Method() {
		if(MethodHandlerBase.pget0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("pget0")) {
					MethodHandlerBase.pget0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.pget0Method;
	}
	
	
	private static Method postMethod = null;
	public static Method getPostMethod() {
		if(MethodHandlerBase.postMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("post")) {
					MethodHandlerBase.postMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.postMethod;
	}
	
	private static Method ppostMethod = null;
	public static Method getPPostMethod() {
		if(MethodHandlerBase.ppostMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("ppost")) {
					MethodHandlerBase.ppostMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.ppostMethod;
	}
	
	
	
	private static Method post0Method = null;
	public static Method getPost0Method() {
		if(MethodHandlerBase.post0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("post0")) {
					MethodHandlerBase.post0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.post0Method;
	}
	

	
	private static Method ppost0Method = null;
	public static Method getPPost0Method() {
		if(MethodHandlerBase.ppost0Method == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("ppost0")) {
					MethodHandlerBase.ppost0Method = method;
					break;
				}
			}
		}
		return MethodHandlerBase.ppost0Method;
	}
	
	
	private static Method downloadxMethod = null;
	public static Method getDownloadXMethod() {
		if(MethodHandlerBase.downloadxMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("downloadx")) {
					MethodHandlerBase.downloadxMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.downloadxMethod;
	}
	
	
	private static Method uploadxMethod = null;
	public static Method getUploadXMethod() {
		if(MethodHandlerBase.uploadxMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("uploadx")) {
					MethodHandlerBase.uploadxMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.uploadxMethod;
	}
	
	private static Method processMethod = null;
	public static Method getProcessMethod() {
		if(MethodHandlerBase.processMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("process")) {
					MethodHandlerBase.processMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.processMethod;
	}
	
	private static Method executeMethod = null;
	public static Method getExecuteMethod() {
		if(MethodHandlerBase.executeMethod == null) {
			for(Method method : MethodHandlerBase.class.getMethods()) {
				if(method.getName().equals("execute")) {
					MethodHandlerBase.executeMethod = method;
					break;
				}
			}
		}
		return MethodHandlerBase.executeMethod;
	}
	
	
	private Object owner = null;
	
	public MethodHandlerBase() {
		
	}
	
	public MethodHandlerBase(Object owner) {
		this.owner = owner;
	}
	
	protected Object getOwner() {
		return this.owner;
	}

	protected Object onExecute(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable{
		return onExecute(pkey, requestData, key, httpServletRequest, httpServletRespons);
	}
	
	
	protected Object onExecute(String pkey, Object requestData, String key, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable{
		return onExecute(pkey, requestData, key);
	}
	
	
	
	protected Object onExecute(String pkey, Object requestData, String key) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	protected void onDownloadX(String pkey, Object requestData, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable{
		throw new Exception("没有实现");
	}
	
	protected Object onUploadX(String pkey, MultipartFile multipartFile, String key, String param, String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletRespons) throws Throwable{
		throw new Exception("没有实现");
	}
	
	
	public void fetch(@RequestBody Object requestData, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onExecute(null, requestData, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void pfetch(@PathVariable(name = "pkey") String pkey, @RequestBody Object requestData, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			Object objRet = onExecute(pkey, requestData, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void fetch0(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			//从请求中构建参数对象
			String strQueryString = httpServletRequest.getQueryString();
			Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
			
			Object objRet = onExecute(null, map, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void pfetch0(@PathVariable(name = "pkey") String pkey, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			//从请求中构建参数对象
			String strQueryString = httpServletRequest.getQueryString();
			Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
			
			Object objRet = onExecute(pkey, map, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	
	public void get(@PathVariable(name = "key") String key, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			Object objRet = onExecute(null, null, key, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	
	public void pget(@PathVariable(name = "pkey") String pkey, @PathVariable(name = "key") String key, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			Object objRet = onExecute(pkey, null, key, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	
	public void get0(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable{
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			//从请求中构建参数对象
			String strQueryString = httpServletRequest.getQueryString();
			Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
			
			Object objRet = onExecute(null, map, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void pget0(@PathVariable(name = "pkey") String pkey, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable{
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			//从请求中构建参数对象
			String strQueryString = httpServletRequest.getQueryString();
			Map<String, Object> map = RestUtils.queryString2Map(strQueryString);
			
			Object objRet = onExecute(pkey, map, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void post(@RequestBody Object requestData, @PathVariable(name = "key") String key, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			Object objRet = onExecute(null, requestData, key, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void ppost(@PathVariable(name = "pkey") String pkey, @RequestBody Object requestData, @PathVariable(name = "key") String key, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onExecute(pkey, requestData, key, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	
	public void post0(@RequestBody Object requestData, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onExecute(null, requestData, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void ppost0(@PathVariable(name = "pkey") String pkey, @RequestBody Object requestData, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onExecute(pkey, requestData, null, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	
	
	
	public void downloadx(@PathVariable(name = "pkey", required=false) String pkey, @RequestBody(required=false) Object requestData, @PathVariable(name = "key", required=false) String key, @PathVariable(name = "param", required=false) String param, @PathVariable(name = "param2", required=false) String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable{
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			onDownloadX(pkey, requestData, key, param, param2, httpServletRequest, httpServletResponse);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public void uploadx(@PathVariable(name = "pkey", required=false) String pkey, @RequestParam(name = "file", required = true) MultipartFile multipartFile, @PathVariable(name = "key", required=false) String key, @PathVariable(name = "param", required=false) String param, @PathVariable(name = "param2", required=false) String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable{
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return;
			}
		
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onUploadX(pkey, multipartFile, key, param, param2, httpServletRequest, httpServletResponse);
			sendBack(httpServletRequest, httpServletResponse, objRet);
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
	}
	
	public Object execute(@PathVariable(name = "pkey", required=false) String pkey, @RequestBody(required=false) Object requestData, @PathVariable(name = "key", required=false) String key, @PathVariable(name = "param", required=false) String param, @PathVariable(name = "param2", required=false) String param2, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Throwable{
		try {
			if(!doFilter(httpServletRequest, httpServletResponse)) {
				return null;
			}
			
			ActionSessionManager.setActionInfoBuilder(new StringBuilder());
			ActionSessionManager.setResponseHeaders(null);
			
			Object objRet = onExecute(pkey, requestData, key, param, param2, httpServletRequest, httpServletResponse);
			if(objRet  == ISysServiceAPIRuntime.RET_IGNOREPOSTPROCESS) {
				return null;
			}
			
			if(objRet instanceof SseEmitter) {
				return objRet;
			}
			
			sendBack(httpServletRequest, httpServletResponse, objRet);
			
		}
		catch(Throwable ex) {
			log.error(String.format("请求[%1$s]发生异常，%2$s",httpServletRequest.getRequestURI(), ex.getMessage()), ex);
			//throw new InternalServerErrorException(ex.getMessage());
			dealException(httpServletRequest, httpServletResponse, ex);
		}
		finally {
			ActionSessionManager.setActionInfoBuilder(null);
			ActionSessionManager.setResponseHeaders(null);
		}
		
		return null;
	}
	

	protected void sendBack(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception{
		
		String strMessage = ActionSessionManager.getActionInfo();
		if(StringUtils.hasLength(strMessage)) {
			httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_MESSAGE, URLEncoder.encode(strMessage, "UTF-8"));
		}
		
		MultiValueMap<String, String> responseHeaders = ActionSessionManager.getResponseHeaders();
		if(!ObjectUtils.isEmpty(responseHeaders)) {
			for(java.util.Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
				if(ObjectUtils.isEmpty(entry.getValue())) {
					continue;
				}
				for(String value : entry.getValue()) {
					httpServletResponse.addHeader(entry.getKey(),  value);
				}
			}
		}
		
		
		String strContentType = null;
		
//		if(this.getOwner() instanceof net.ibizsys.central.service.ISysServiceAPIRuntime) {
//			ISystemRuntime iSystemRuntime = ((net.ibizsys.central.service.ISysServiceAPIRuntime)this.getOwner()).getSystemRuntime();
//			if(iSystemRuntime instanceof IServiceSystemRuntime) {
//				String strExtensionSessionId = ((IServiceSystemRuntime)iSystemRuntime).getExtensionSessionId();
//				if(StringUtils.hasLength(strExtensionSessionId)) {
//					httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_DYNAMODELTAG, URLEncoder.encode(strExtensionSessionId, "UTF-8"));
//				}
//			}
//		}
		
		if(object instanceof IWebResponse) {
			IWebResponse iWebResponse = (IWebResponse)object;
			strContentType = iWebResponse.getContentType();
			httpServletResponse.setStatus(iWebResponse.getStatusCode());
			MultiValueMap<String, String> headers = iWebResponse.getHeaders();
			if(!ObjectUtils.isEmpty(headers)) {
				for(java.util.Map.Entry<String, List<String>> entry : headers.entrySet()) {
					if(!ObjectUtils.isEmpty(entry.getValue())) {
						continue;
					}
					for(String value : entry.getValue()) {
						httpServletResponse.addHeader(entry.getKey(),  value);
					}
				}
			}
			object = iWebResponse.getBody();
		}
		
		if(object instanceof Page) {
			Page page = (Page)object;
			if(page.getPageable()!=null && page.getPageable()!=Pageable.unpaged()) {
				httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_PAGE, String.valueOf(page.getPageable().getPageNumber()));
				httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_PERPAGE, String.valueOf(page.getPageable().getPageSize()));
				httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_TOTAL, String.valueOf(page.getTotalElements()));
				httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_TOTALPAGES, String.valueOf(page.getTotalPages()));
				if(object instanceof IPage) {
					IPage pagex = (IPage)object;
					if(pagex.getTotalX()>=0) {
						httpServletResponse.setHeader(ISysServiceAPIRuntime.HEADER_TOTALX, String.valueOf(pagex.getTotalX()));
					}
				}
			}
			object = page.getContent();
		}
		
		if(object != null) {
			if(StringUtils.hasLength(strContentType)) {
				httpServletResponse.setContentType(strContentType);
			}
			else {
				httpServletResponse.setContentType("application/json;charset=UTF-8");
			}
			String strBody = MAPPER.writeValueAsString(object);
			
			if(isEnableCompress() && strBody.length() >= getCompressMinSize()) {
				String strAcceptEncoding = httpServletRequest.getHeader(HttpHeaders.ACCEPT_ENCODING);
				boolean bGZip = false;
		    	if(StringUtils.hasLength(strAcceptEncoding)) {
		    		bGZip = strAcceptEncoding.indexOf("gzip")!=-1;
		    	}
		    	if(bGZip) {
		    		httpServletResponse.setHeader(HttpHeaders.CONTENT_ENCODING, "gzip");
		    		try(GZIPOutputStream os = new GZIPOutputStream(httpServletResponse.getOutputStream())){
		    			os.write(strBody.getBytes("UTF-8"));
		    			os.finish();
		    		}
		    		return;
		    	}
			}
			 
			httpServletResponse.getWriter().write(strBody);
		}
	}
	
	public void process(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		onProcess(httpServletRequest, httpServletResponse);
	}
	
	protected void onProcess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		throw new RuntimeException("没有实现");
	}
	

	protected boolean doFilter(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception{
		
		Object pattern = httpServletRequest.getAttribute(ISysUAAUtilRuntime.ATTRIBUTE_IGNOREAUTHPATTERN);
		if(pattern != null) {
			return true;
		}
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext == null) {
			if(AuthenticationUser.getCurrent()!=null) {
				log.debug(String.format("请求[%1$s]返回[403]",httpServletRequest.getRequestURI()));
				httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
				return false;
			}
			log.debug(String.format("请求[%1$s]返回[401]",httpServletRequest.getRequestURI()));
			httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
			return false;
		}
		return true;
	}
	
	protected void dealException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Throwable ex) {
		
		IResponseExceptionHandler iResponseExceptionHandler = getResponseExceptionHandler();
		if(iResponseExceptionHandler != null) {
			ResponseEntity<?> rep = iResponseExceptionHandler.getResponseEntity(ex);
			if(rep != null) {
				log.error(ex);
				try {
					//httpServletResponse.sendError(rep.getStatusCodeValue());
					httpServletResponse.setStatus(rep.getStatusCodeValue());
					httpServletResponse.setContentType("application/json;charset=UTF-8");
					httpServletResponse.getWriter().write(MAPPER.writeValueAsString(rep.getBody()));
					return;
				}
				catch(Exception e) {
					log.error(e);
				}
			}
		}
		//RuntimeObjectFactory.getInstance().getObject(cls);
		
		throw new InternalServerErrorException(ex.getMessage());
	}
	
	protected IResponseExceptionHandler getResponseExceptionHandler() {
		return RuntimeObjectFactory.getInstance().getObject(IResponseExceptionHandler.class);
	}
}
