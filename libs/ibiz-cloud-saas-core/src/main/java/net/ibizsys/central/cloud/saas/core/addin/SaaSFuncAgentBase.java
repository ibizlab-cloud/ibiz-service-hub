package net.ibizsys.central.cloud.saas.core.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.SaaSFunc;
import net.ibizsys.central.cloud.saas.core.cloudutil.ICloudSaaSUtilRuntimeContext;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.model.PSModelEnums.ServiceAPILevel;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;

public abstract class SaaSFuncAgentBase extends CloudSaaSUtilRTAddinBase implements ISaaSFuncAgent {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SaaSFuncAgentBase.class);
	
	public final static String PARAM_CONSOLE = "console";
	
	/**
	 * 作业参数：通用参数
	 */
	public final static String PARAM_METHOD_PARAM = "param";
	
	private String strSaaSFuncId = null;
	private String strFuncType = null;
	private int nFuncLevel = ServiceAPILevel.USER.value;
	private boolean bStarted = false;
	
	@Override
	public void init(ICloudSaaSUtilRuntimeContext ctx, SaaSFunc saaSFunc) throws Exception {
		this.setSaaSFuncId(saaSFunc.getId());
		this.setFuncType(saaSFunc.getFuncType());
		this.setFuncLevel(DataTypeUtils.asInteger(saaSFunc.getFuncLevel(), ServiceAPILevel.USER.value));
		super.init(ctx, saaSFunc);
	}
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}
	
	@Override
	public void start() throws Exception {
		if(this.bStarted) {
			log.warn("SaaS功能代理已经启动");
			return;
		}
		this.onStart();
		this.bStarted = true;
	}
	
	protected void onStart() throws Exception{
		
	}
	
	@Override
	public void stop() throws Exception{
		if(!this.bStarted) {
			return;
		}
		this.bStarted = false;
		this.onStop();
	}
	
	protected void onStop() throws Exception{
		
	}
	
	@Override
	public SaaSFunc getAgentData() {
		return (SaaSFunc)getAddinData();
	}
	

	@Override
	public String getFuncType() {
		return this.strFuncType;
	}
	
	protected void setFuncType(String strFuncType) {
		this.strFuncType = strFuncType;
	}
	
	@Override
	public int getFuncLevel() {
		return this.nFuncLevel;
	}
	
	protected void setFuncLevel(int nFuncLevel) {
		this.nFuncLevel = nFuncLevel;
	}
	
	
	protected String getSaaSFuncId() {
		return this.strSaaSFuncId;
	}
	
	protected void setSaaSFuncId(String strSaaSFuncId) {
		this.strSaaSFuncId = strSaaSFuncId;
	}
	
	
	@Override
	public Object invoke(String method, Map<String, Object> params) throws Throwable {
		this.testAccessUser(method, params);
		return this.onInvoke(method, params);
	}
	
	protected Object onInvoke(String method, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}
	
	/**
	 * 判断访问用户
	 * 
	 * @throws Throwable
	 */
	protected void testAccessUser(String method, Map<String, Object> params) throws Throwable {

		if (this.getFuncLevel() == SysServiceAPILevels.CORE) {
			if ((DataTypeUtils.getIntegerValue(AuthenticationUser.getCurrentMust().getSuperuser(), 0) == 1) || (DataTypeUtils.getIntegerValue(AuthenticationUser.getCurrentMust().getApiuser(), 0) == 1)) {
				return;
			}
			throw new ErrorException(String.format("仅允许核心用户访问"), Errors.ACCESSDENY);
		}

		if (this.getFuncLevel() == SysServiceAPILevels.CLOUDADMIN) {
			if (AuthenticationUser.getCurrentMust().getSuperuser() != 1) {
				throw new ErrorException(String.format("仅允许平台管理员访问"), Errors.ACCESSDENY);
			}
			return;
		}

		if (this.getFuncLevel() == SysServiceAPILevels.DCADMIN) {
			if (!EmployeeContext.getCurrentMust().isSuperuser()) {
				throw new ErrorException(String.format("仅允许机构管理员访问"), Errors.ACCESSDENY);
			}
			return;
		}
		
		if (this.getFuncLevel() == SysServiceAPILevels.ANONYMOUSUSER) {
			IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
			if (iEmployeeContext != null && !iEmployeeContext.isAnonymoususer()) {
				throw new ErrorException(String.format("仅允许匿名用户访问"), Errors.ACCESSDENY);
			}
			return;
		}
	}
	
}
