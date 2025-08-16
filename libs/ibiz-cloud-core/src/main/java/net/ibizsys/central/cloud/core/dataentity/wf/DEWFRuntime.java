package net.ibizsys.central.cloud.core.dataentity.wf;


import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.ServiceType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.IEntityBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 实体工作流运行时对象
 * @author lionlau
 *
 */
public class DEWFRuntime extends net.ibizsys.central.dataentity.wf.DEWFRuntime implements IDEWFRuntime {

	private static final Log log = LogFactory.getLog(DEWFRuntime.class);

	private ISysWFUtilRuntime iSysWFUtilRuntime = null;

	private String strCloudServiceId = null;

	private boolean bCalcCloudServiceId = false;

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;


	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (this.getSysCloudClientUtilRuntime(true) == null) {
			prepareSysCloudClientUtilRuntime(false);
		}
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		return this.getSysCloudClientUtilRuntime(false);
	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime(boolean bTryMode) {
		if (this.iSysCloudClientUtilRuntime != null || bTryMode) {
			return this.iSysCloudClientUtilRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, "未指定系统云体系客户端组件");
	}

	protected void setSysCloudClientUtilRuntime(ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime) {
		this.iSysCloudClientUtilRuntime = iSysCloudClientUtilRuntime;
	}

	protected void prepareSysCloudClientUtilRuntime(boolean bTryMode) throws Exception {
		this.setSysCloudClientUtilRuntime(this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, bTryMode));
	}
	/**
	 * 获取Cloud服务标识，此调用不在 onInit中进行，实体模型可能未加载
	 * @return
	 */
	protected String getCloudServiceId() {
		if(this.bCalcCloudServiceId) {
			return this.strCloudServiceId;
		}

		if(this.getDataEntityRuntime().getSubSysServiceAPIRuntime() != null) {
			if(ServiceType.IBIZCLOUD.value.equals(this.getDataEntityRuntime().getSubSysServiceAPIRuntime().getServiceType())) {
				this.strCloudServiceId = this.getDataEntityRuntime().getSubSysServiceAPIRuntime().getServiceParam();
			}
		}

		this.bCalcCloudServiceId = true;
		return this.strCloudServiceId;
	}

	/**
	 * 获取系统工作流功能对象
	 * @return
	 */
	protected ISysWFUtilRuntime getSysWFUtilRuntime() {
		if(this.iSysWFUtilRuntime == null) {
			this.iSysWFUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysWFUtilRuntime.class, false);
		}
		return this.iSysWFUtilRuntime;
	}





	@Override
	public void start(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		Object objKey = null;
		WFInstance wfInstance = new WFInstance();
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
			if(this.getDataEntityRuntime().getMajorPSDEField()!=null) {
				wfInstance.setName(String.format("%1$s",this.getDataEntityRuntime().getFieldValue((IEntityBase)arg0, this.getDataEntityRuntime().getMajorPSDEField())));
			}
		}
		else {
			objKey = arg0;
		}
		Boolean bsrfWFExtension = false;
		String srfWFTag = "";
		if(arg0 instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)arg0;
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			iEntityDTO.copyTo(data, true);
			wfInstance.setActiveData(data);
			bsrfWFExtension = iEntityDTO.getBoolean("srfwfextension",false);
			srfWFTag = (String) iEntityDTO.get("srfwftag");
		}
		String strWorkflowCodeName = this.getPSDEWF().getPSWorkflowMust().getCodeName();
		if(bsrfWFExtension && StringUtils.hasLength(srfWFTag)){
			strWorkflowCodeName = srfWFTag;
		}
		String strDEName = this.getDataEntityRuntime().getName();
		wfInstance.setProcessDefinitionKey(strWorkflowCodeName);
		log.debug(String.format("启动实体[%1$s]工作流[%2$s]",strDEName,strWorkflowCodeName));
		this.getSysWFUtilRuntime().startWFInstance(strDEName, objKey, wfInstance);
	}

	@Override
	public Object submit(Object arg0, String wfAction, Map<String, Object> params, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		Object objKey = null;
		WFTaskWay wfTaskWay = new WFTaskWay();
		Boolean  bsrfWFExtension = false;
		String srfWFTag = "";
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
			bsrfWFExtension = (Boolean)this.getDataEntityRuntime().getFieldValue((IEntityBase)arg0,"srfwfextension");
			srfWFTag = (String) this.getDataEntityRuntime().getFieldValue((IEntityBase)arg0,"srfwftag");
		}
		else {
			objKey = arg0;
		}


		String strWorkflowCodeName = this.getPSDEWF().getPSWorkflowMust().getCodeName();
		if(bsrfWFExtension && StringUtils.hasLength(srfWFTag)){
			strWorkflowCodeName = srfWFTag;
		}
		String strDEName = this.getDataEntityRuntime().getName();

		if(!ObjectUtils.isEmpty(params)) {
			EntityUtils.copyTo(params, wfTaskWay);
		}


		log.debug(String.format("提交实体[%1$s]工作流[%2$s]操作[%3$s]", strDEName, strWorkflowCodeName, wfAction));
		return this.getSysWFUtilRuntime().submitWFTaskWay(strDEName, objKey, wfAction, wfTaskWay);
	}

	@Override
	public void register(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		Object objKey = null;
		WFInstance wfInstance = new WFInstance();
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
			if(this.getDataEntityRuntime().getMajorPSDEField()!=null) {
				wfInstance.setName(String.format("%1$s",this.getDataEntityRuntime().getFieldValue((IEntityBase)arg0, this.getDataEntityRuntime().getMajorPSDEField())));
			}
		}
		else {
			objKey = arg0;
		}

		Boolean bsrfWFExtension = false;
		String srfWFTag = "";
		if(arg0 instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)arg0;
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			iEntityDTO.copyTo(data, true);
			wfInstance.setActiveData(data);
			bsrfWFExtension = iEntityDTO.getBoolean("srfwfextension",false);
			srfWFTag = (String) iEntityDTO.get("srfwftag");
			//注册工作流补充流程代码标识,目前注册仅识别默认流程实体
			String strWorkflowCodeName = this.getPSDEWF().getPSWorkflowMust().getCodeName();
			if(bsrfWFExtension && StringUtils.hasLength(srfWFTag)){
				strWorkflowCodeName = srfWFTag;
			}
			wfInstance.setProcessDefinitionKey(strWorkflowCodeName);
			wfInstance.setProcessDefinitionName(this.getPSDEWF().getPSWorkflowMust().getName());
		}
		this.getSysWFUtilRuntime().registerWFInstance(this.getDataEntityRuntime().getName(), objKey, wfInstance);

	}


	@Override
	public void unregister(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		Object objKey = null;
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
		}
		else {
			objKey = arg0;
		}
		this.getSysWFUtilRuntime().unregisterWFInstance(this.getDataEntityRuntime().getName(), objKey);
	}

	@Override
	public void fillWFTag(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object objRet) throws Throwable {
		Object objKey = null;
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
		}
		else {
			objKey = arg0;
		}
		try {
			WFInstance wfInstance = this.getSysWFUtilRuntime().getWFInstanceByBusinessKey(this.getDataEntityRuntime().getName(), objKey);
			if(wfInstance != null){
				String strProcessDefinitionKey = (String)wfInstance.get(WFInstance.FIELD_PROCESSDEFINITIONKEY.toLowerCase());
				String[] wfParams = strProcessDefinitionKey.split("-");
				String srfWFTag = "";
				if(wfParams.length > 1){
					String strWFVersion = wfParams[wfParams.length-1];
					srfWFTag = strWFVersion.substring(0, strWFVersion.lastIndexOf("v"));
				}else {
					//适配草稿态下流程实例标识为流程名称
					srfWFTag = strProcessDefinitionKey;
				}
				if(objRet instanceof IEntity) {
					((IEntity) objRet).set("srfwftag", srfWFTag);
					((IEntity) objRet).set("processdefinitionkey", strProcessDefinitionKey);
					((IEntity) objRet).set("taskdefinitionkey",(String)wfInstance.get(WFInstance.FIELD_CURSTEPID.toLowerCase()));
				}
			}
		}catch (Exception e){
			log.debug(String.format("实体[%1$s]数据[%2$s]填充工作流标记异常", this.getDataEntityRuntime().getName(), objKey));
		}
	}

	@Override
	public int getAccessMode(Object arg0, Object actionData) throws Throwable {
		Object objKey = null;
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
		}
		else {
			objKey = arg0;
		}
		return this.getSysWFUtilRuntime().getWFInstanceAccessMode(this.getDataEntityRuntime().getName(), objKey);
	}

	@Override
	public WFEditableFields getEditableFields(Object arg0, Object actionData) throws Throwable {
		Object objKey = null;
		if(arg0 instanceof IEntityBase) {
			objKey = this.getDataEntityRuntime().getKeyFieldValue((IEntityBase)arg0);
		}
		else {
			objKey = arg0;
		}
		return this.getSysWFUtilRuntime().getWFInstanceEditableFields(this.getDataEntityRuntime().getName(), objKey);
	}


	@Override
	public void init(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		String strServiceId = this.getCloudServiceId();
		if(StringUtils.hasLength(strServiceId)) {
			this.executeWFCallback(strServiceId, DEActions.WFINIT, arg0);
			return;
		}
		super.init(arg0, iPSDEAction, actionData);
	}

	@Override
	public void update(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		String strServiceId = this.getCloudServiceId();
		if(StringUtils.hasLength(strServiceId)) {
			this.executeWFCallback(strServiceId, DEActions.WFUPDATE, arg0);
			return;
		}
		super.update(arg0, iPSDEAction, actionData);
	}

	@Override
	public void rollback(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		String strServiceId = this.getCloudServiceId();
		if(StringUtils.hasLength(strServiceId)) {
			this.executeWFCallback(strServiceId, DEActions.WFROLLBACK, arg0);
			return;
		}
		super.rollback(arg0, iPSDEAction, actionData);
	}


	@Override
	public void error(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		String strServiceId = this.getCloudServiceId();
		if(StringUtils.hasLength(strServiceId)) {
			this.executeWFCallback(strServiceId, DEActions.WFERROR, arg0);
			return;
		}
		super.error(arg0, iPSDEAction, actionData);
	}


	@Override
	public void finish(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		String strServiceId = this.getCloudServiceId();
		if(StringUtils.hasLength(strServiceId)) {
			this.executeWFCallback(strServiceId, DEActions.WFFINISH, arg0);
			return;
		}
		super.finish(arg0, iPSDEAction, actionData);
	}


	protected void executeWFCallback(String strSystemTag, String strAction, Object objData) throws Throwable{
		this.executeWFCallback(strSystemTag, this.getDataEntityRuntime().getName(), ICloudWFUtilRuntime.CALLBACKTYPE_WFACTION, strAction, objData, String.class, null);
	}

	protected <T> IWebClientRep<T> executeWFCallback(String strSystemTag, String strDataEntity, String strType, String strAction, Object objData, Class<T> cls, String strAppTag) throws Throwable{

		IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();

		Map<String, String> uriParams = new HashMap<String, String>();
		Map<String, String> headers = new HashMap<String, String>();

		uriParams.put("systemid", employeeContext.getSystemid());
		uriParams.put("dcsystemid", employeeContext.getDcsystemid());
		uriParams.put("orgid", employeeContext.getOrgid());
		uriParams.put("system", strSystemTag);
		uriParams.put("app", strAppTag);
		uriParams.put("entity", strDataEntity);
		uriParams.put("action", strAction);
		uriParams.put("type", strType);

//		headers.put("srfdcid", employeeContext.getTenant());
//		headers.put("srfsystemid", employeeContext.getSystemid());
//		headers.put("srfdcsystemid", employeeContext.getDcsystemid());
//		headers.put("srforgid", employeeContext.getOrgid());
//		headers.put("srfuserid", employeeContext.getUserid());
//		if(StringUtils.hasLength(employeeContext.getOrgcode())) {
//			headers.put("srforgcode", employeeContext.getOrgcode());
//		}
//		if(StringUtils.hasLength(employeeContext.getDeptid())) {
//			headers.put("srfdeptid", employeeContext.getDeptid());
//		}
//		if(StringUtils.hasLength(employeeContext.getDeptcode())) {
//			headers.put("srfdeptcode", employeeContext.getDeptcode());
//		}
//		if(StringUtils.hasLength(employeeContext.getPorg())) {
//			headers.put("srfporgids", employeeContext.getPorg());
//		}
//		if(StringUtils.hasLength(employeeContext.getSorg())) {
//			headers.put("srfsorgids", employeeContext.getSorg());
//		}
//		if(StringUtils.hasLength(employeeContext.getPdept())) {
//			headers.put("srfpdeptids", employeeContext.getPdept());
//		}
//		if(StringUtils.hasLength(employeeContext.getSdept())) {
//			headers.put("srfsdeptids", employeeContext.getSdept());
//		}
//
//		if(EmployeeContext.getCurrent() != null) {
//			headers.put("srfusername", URLEncoder.encode(EmployeeContext.getCurrent().getUsername(), "UTF-8"));
//
//		}


		String strServiceId =  strSystemTag.toLowerCase();
		String strUrl = String.format("lb://servicehub-%1$s/wfcallback/%2$s/{entity}/{type}/{action}/xxcc", strServiceId, strServiceId);

		return this.getWebClient(String.format("lb://servicehub-%1$s", strServiceId)).post(strUrl, uriParams, headers, null, objData, null, cls, null);
	}




	protected IWebClient getWebClient(String strServiceType) {
		return this.getSysCloudClientUtilRuntime().getServiceClient(strServiceType);
	}

}
