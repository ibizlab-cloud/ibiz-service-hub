package net.ibizsys.centralstudio.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;


/**
 * 平台模型服务会话对象
 * @author lionlau
 *
 */
public class PSModelServiceSession {

	private static final Log log = LogFactory.getLog(PSModelServiceSession.class);
	 
	/**
	 * 接口参数：服务接口地址
	 */
	public final static String PARAM_URL = "url";
	
	/**
	 * 接口参数：访问凭证
	 */
	public final static String PARAM_BEARER = "bearer";
	
	/**
	 * 接口参数：开发系统标识
	 */
	public final static String PARAM_PSDEVSLNSYSID = "psdevslnsysid";
	
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
	 * 接口参数：是否使用导入模式调用
	 */
	public final static String PARAM_IMPORTMODE = "importmode";
	
	

	
	private static ThreadLocal<PSModelServiceSession> current = new ThreadLocal<PSModelServiceSession>();
	
	//private static ThreadLocal<List<PSModelServiceSession>>  stack = new ThreadLocal<List<PSModelServiceSession>>();
	
//	/**
//	 * 操作参数
//	 */
	private Map<String, Object> attributeMap = new HashMap<String, Object>();
	
	private String strServiceUrl = null;
	
	private String strAccessTokenUrl = null;
	
	private String strPSDevSlnSysId = null;
	
	private String strBearer = null;
	
	private boolean bImportMode = true;
	
	private String strUserName = null;
	
	private String strPassword = null;
	
	
	/**
	 * 获取当前服务会话
	 * @return
	 * @throws Exception
	 */
	public static PSModelServiceSession getCurrent() throws Exception{
		return getCurrent(false);
	}
	
	/**
	 * 设置当前模型服务会话
	 * @param psModelServiceSession
	 */
	public static void setCurrent(PSModelServiceSession psModelServiceSession) {
		current.set(psModelServiceSession);
	}
	
	public static PSModelServiceSession getCurrent(boolean bTry) throws Exception{
		
		PSModelServiceSession psModelServiceSession = current.get();
		if(psModelServiceSession == null && !bTry) {
			throw new Exception("当前未打开模型服务会话");
		}
		return psModelServiceSession;
	}
	
	public static PSModelServiceSession open() throws Exception{
		return open(true);
	}
	
	public static PSModelServiceSession open(boolean bMustCreate) throws Exception{
		PSModelServiceSession psModelServiceSession = current.get();
		if(psModelServiceSession != null && bMustCreate) {
			throw new Exception("当前已打开模型服务会话");
		}
//		stack.set(null);
		psModelServiceSession = new PSModelServiceSession();
		current.set(psModelServiceSession);
		
		return psModelServiceSession;
	}
	
	public static PSModelServiceSession open(Map<String, Object> params) throws Exception{
		
		PSModelServiceSession psModelServiceSession = open(true);
		
		String strUrl = DataTypeUtils.getStringValue(params.get(PARAM_URL), null);
		String strBearer = DataTypeUtils.getStringValue(params.get(PARAM_BEARER), null);
		String strPSDevSlnSysId = DataTypeUtils.getStringValue(params.get(PARAM_PSDEVSLNSYSID), null);
		
		String strAccessTokenUrl = DataTypeUtils.getStringValue(params.get(PARAM_ACCESSTOKENURL), null);
		String strUserName = DataTypeUtils.getStringValue(params.get(PARAM_USERNAME), null);
		String strPassword = DataTypeUtils.getStringValue(params.get(PARAM_PASSWORD), null);
		boolean bImportMode = DataTypeUtils.getBooleanValue(params.get(PARAM_IMPORTMODE), false);
		
		psModelServiceSession.setServiceUrl(strUrl);
		psModelServiceSession.setBearer(strBearer);
		psModelServiceSession.setPSDevSlnSysId(strPSDevSlnSysId);
		psModelServiceSession.setImportMode(bImportMode);
		
		if(!StringUtils.hasLength(strBearer)) {
			psModelServiceSession.setAccessTokenUrl(strAccessTokenUrl);
			psModelServiceSession.setUserName(strUserName);
			psModelServiceSession.setPassword(strPassword);
		}
		
		
		return psModelServiceSession;
	}
	
	/**
	 * 结束会话
	 * @param bCommit
	 */
	public static void close(boolean bCommit){
		PSModelServiceSession psModelServiceSession = current.get();
		if(psModelServiceSession == null ) {
//			stack.set(null);
			return;
		}
		if(bCommit) {
			psModelServiceSession.commit();
			
		}
		else {
			psModelServiceSession.rollback();
			
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
	
	
	public PSModelServiceSession setServiceUrl(String strServiceUrl) {
		this.strServiceUrl = strServiceUrl;
		return this;
	}
	
	public PSModelServiceSession setAccessTokenUrl(String strAccessTokenUrl) {
		this.strAccessTokenUrl = strAccessTokenUrl;
		return this;
	}
	
	
	public PSModelServiceSession setPSDevSlnSysId(String strPSDevSlnSysId) {
		this.strPSDevSlnSysId = strPSDevSlnSysId;
		return this;
	}
	
	public PSModelServiceSession setBearer(String strBearer) {
		this.strBearer = strBearer;
		return this;
	}
	
	
	public String getServiceUrl() {
		return this.strServiceUrl;
	}
	
	public String getAccessTokenUrl() {
		return this.strAccessTokenUrl;
	}
	
	
	public String getPSDevSlnSysId() {
		return this.strPSDevSlnSysId;
	}
	
	public String getBearer() {
		return this.strBearer;
	}
	
	
	public PSModelServiceSession setImportMode(boolean bImportMode) {
		this.bImportMode = bImportMode;
		return this;
	}
	
	public boolean isImportMode() {
		return this.bImportMode;
	}
	
	public String getUserName() {
		return this.strUserName;
	}
	
	public PSModelServiceSession setUserName(String strUserName) {
		this.strUserName = strUserName;
		return this;
	}
	
	public String getPassword() {
		return this.strPassword;
	}
	
	public PSModelServiceSession setPassword(String strPassword) {
		this.strPassword = strPassword;
		return this;
	}
	
	
	public Object getAttribute(String strName) {
		return this.attributeMap.get(strName);
	}
	
	public PSModelServiceSession setAttribute(String strName, Object objValue) {
		this.attributeMap.put(strName, objValue);
		return this;
	}
}
