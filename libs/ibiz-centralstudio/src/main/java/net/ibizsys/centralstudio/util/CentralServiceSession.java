package net.ibizsys.centralstudio.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;


public class CentralServiceSession {

	private static final Log log = LogFactory.getLog(CentralServiceSession.class);
	 
	/**
	 * 接口参数：服务接口地址
	 */
	public final static String PARAM_URL = "url";
	
	/**
	 * 接口参数：访问凭证
	 */
	public final static String PARAM_BEARER = "bearer";
	
	/**
	 * 接口参数：鉴权地址
	 */
	public final static String PARAM_ACCESSTOKENURL = "accesstokenurl";
	
	
	/**
	 * 接口参数：用户名
	 */
	public final static String PARAM_USERNAME = "username";
	
	/**
	 * 接口参数：密码
	 */
	public final static String PARAM_PASSWORD = "password";
	
	
	/**
	 * 接口参数：系统标识
	 */
	public final static String PARAM_SYSTEMID = "systemid";
	
	
	/**
	 * 接口参数：机构标识
	 */
	public final static String PARAM_ORGID = "orgid";
	
	
	
	private static ThreadLocal<CentralServiceSession> current = new ThreadLocal<CentralServiceSession>();
	
	//private static ThreadLocal<List<PSModelServiceSession>>  stack = new ThreadLocal<List<PSModelServiceSession>>();
	
//	/**
//	 * 操作参数
//	 */
	private Map<String, Object> attributeMap = new HashMap<String, Object>();
	
	
	private Map<String, Object> contextMap = new HashMap<String, Object>();
	
	
	private String strServiceUrl = null;
	
	private String strAccessTokenUrl = null;
	
	
	private String strBearer = null;
	
	private String strUserName = null;
	
	private String strPassword = null;
	
	private String strSystemId = null;
	
	private String strOrgId = null;
	
	
	/**
	 * 获取当前服务会话
	 * @return
	 * @throws Exception
	 */
	public static CentralServiceSession getCurrent() throws Exception{
		return getCurrent(false);
	}
	
	/**
	 * 设置当前模型服务会话
	 * @param csServiceSession
	 */
	public static void setCurrent(CentralServiceSession csServiceSession) {
		current.set(csServiceSession);
	}
	
	public static CentralServiceSession getCurrent(boolean bTry) throws Exception{
		
		CentralServiceSession csServiceSession = current.get();
		if(csServiceSession == null && !bTry) {
			throw new Exception("当前未打开CentralStudio服务会话");
		}
		return csServiceSession;
	}
	
	public static CentralServiceSession open() throws Exception{
		return open(true);
	}
	
	public static CentralServiceSession open(boolean bMustCreate) throws Exception{
		CentralServiceSession csServiceSession = current.get();
		if(csServiceSession != null && bMustCreate) {
			throw new Exception("当前已打开CentralStudio服务会话");
		}
//		stack.set(null);
		csServiceSession = new CentralServiceSession();
		current.set(csServiceSession);
		
		return csServiceSession;
	}
	
	public static CentralServiceSession open(Map<String, Object> params) throws Exception{
		
		CentralServiceSession csServiceSession = open(true);
		
		String strUrl = DataTypeUtils.getStringValue(params.get(PARAM_URL), null);
		String strBearer = DataTypeUtils.getStringValue(params.get(PARAM_BEARER), null);
		
		String strSystemId = DataTypeUtils.getStringValue(params.get(PARAM_SYSTEMID), null);
		String strOrgId = DataTypeUtils.getStringValue(params.get(PARAM_ORGID), null);
		
		
		String strAccessTokenUrl = DataTypeUtils.getStringValue(params.get(PARAM_ACCESSTOKENURL), null);
		String strUserName = DataTypeUtils.getStringValue(params.get(PARAM_USERNAME), null);
		String strPassword = DataTypeUtils.getStringValue(params.get(PARAM_PASSWORD), null);
		
	
		csServiceSession.setServiceUrl(strUrl);
		csServiceSession.setBearer(strBearer);
		csServiceSession.setSystemId(strSystemId);
		csServiceSession.setOrgId(strOrgId);
		
		if(!StringUtils.hasLength(strBearer)) {
			csServiceSession.setAccessTokenUrl(strAccessTokenUrl);
			csServiceSession.setUserName(strUserName);
			csServiceSession.setPassword(strPassword);
		}
		
		
		return csServiceSession;
	}
	
	/**
	 * 结束会话
	 * @param bCommit
	 */
	public static void close(boolean bCommit){
		CentralServiceSession csServiceSession = current.get();
		if(csServiceSession == null ) {
//			stack.set(null);
			return;
		}
		if(bCommit) {
			csServiceSession.commit();
			
		}
		else {
			csServiceSession.rollback();
			
		}
		current.set(null);
//		stack.set(null);
	}
	
	
	
	
	/**
	 * 提交操作
	 * @throws Exception
	 */
	public void commit(){
		
	}
	
	/**
	 * 回滚操作
	 * @throws Exception
	 */
	public void rollback(){
		
	}
	
	
	public CentralServiceSession setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
		return this;
	}
	
	public CentralServiceSession setAccessTokenUrl(String strAccessTokenUrl) {
		this.strAccessTokenUrl = strAccessTokenUrl;
		return this;
	}
	
	
	public CentralServiceSession setBearer(String strBearer) {
		this.strBearer = strBearer;
		return this;
	}
	
	
	public String getServiceUrl() {
		return this.strServiceUrl;
	}
	
	public String getAccessTokenUrl() {
		return this.strAccessTokenUrl;
	}
	

	public String getBearer() {
		return this.strBearer;
	}
	

	public String getUserName() {
		return this.strUserName;
	}
	
	public CentralServiceSession setUserName(String strUserName) {
		this.strUserName = strUserName;
		return this;
	}
	
	public String getPassword() {
		return this.strPassword;
	}
	
	public CentralServiceSession setPassword(String strPassword) {
		this.strPassword = strPassword;
		return this;
	}
	
	
	public String getSystemId() {
		return this.strSystemId;
	}
	
	public CentralServiceSession setSystemId(String strSystemId) {
		this.strSystemId = strSystemId;
		return this;
	}
	
	public String getOrgId() {
		return this.strOrgId;
	}
	
	public CentralServiceSession setOrgId(String strOrgId) {
		this.strOrgId = strOrgId;
		return this;
	}
	
	
	
	public Object getAttribute(String strName) {
		return this.attributeMap.get(strName);
	}
	
	public CentralServiceSession setAttribute(String strName, Object objValue) {
		this.attributeMap.put(strName, objValue);
		return this;
	}
	
	public Object getContext(String strName) {
		return this.contextMap.get(strName.toLowerCase());
	}
	
	public CentralServiceSession setContext(String strName, Object objValue) {
		if(!ObjectUtils.isEmpty(objValue)) {
			this.contextMap.put(strName.toLowerCase(), objValue);
		}
		else {
			this.contextMap.remove(strName.toLowerCase());
		}
		
		return this;
	}
	
	public boolean containsContext(String strName) {
		Object objValue = this.getContext(strName);
		return !ObjectUtils.isEmpty(objValue);
	}
	
	
	public Map<String, Object> getContextMap() {
		return this.contextMap;
	}
}
