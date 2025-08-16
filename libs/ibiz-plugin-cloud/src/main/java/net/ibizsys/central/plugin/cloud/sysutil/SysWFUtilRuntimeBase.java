package net.ibizsys.central.plugin.cloud.sysutil;

import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudWFClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.CloudSysUtilRuntimeBase;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysWFUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFEditableFields;
import net.ibizsys.central.cloud.core.util.domain.WFInstance;
import net.ibizsys.central.cloud.core.util.domain.WFTaskWay;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统工作流组件运行时对象实现基类
 *
 * @author lionlau
 *
 */
public abstract class SysWFUtilRuntimeBase extends CloudSysUtilRuntimeBase implements ISysWFUtilRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SysWFUtilRuntimeBase.class);

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected void prepareDefaultSetting() throws Exception {

	}


	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

	protected ICloudWFClient getCloudWFClient() {
		return this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_WF, ICloudWFClient.class);
	}


	@Override
	protected void onInstall() throws Exception {
		super.onInstall();

	}


	@Override
	public Collection<WFDefinition> createWFDefinitions(List bpmnfiles) {
		return this.executeAction("建立流程定义", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCreateWFDefinitions(bpmnfiles);
			}
		}, null, new TypeReference<Collection<WFDefinition>>(){});
	}

	protected Collection<WFDefinition> onCreateWFDefinitions(List bpmnfiles) throws Throwable{
		return getCloudWFClient().createWFDefinitions(bpmnfiles);
	}


	@Override
	public Collection<WFDefinition> getWFDefinitions(String strDataEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WFDefinition getWFDefinition(String strDataEntity, String strWFDefinitionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WFInstance registerWFInstance(String strDataEntity, Object businessKey, WFInstance instance) {
		return this.executeAction("注册流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRegisterWFInstance(strDataEntity, businessKey, instance);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onRegisterWFInstance(String strDataEntity, Object businessKey, WFInstance instance) throws Throwable{
		return this.getCloudWFClient().registerWFInstance(getSystemTag(), strDataEntity, businessKey, instance);
	}

	@Override
	public void unregisterWFInstance(String strDataEntity, Object businessKey) {
		this.executeAction("注销流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onUnregisterWFInstance(strDataEntity, businessKey);
				return null;
			}
		});
	}

	protected void onUnregisterWFInstance(String strDataEntity, Object businessKey) throws Throwable{
		this.getCloudWFClient().unregisterWFInstance(getSystemTag(), strDataEntity, businessKey);
	}

	@Override
	public WFInstance getWFInstanceByBusinessKey(String strDataEntity, Object businessKey) {
		return this.executeAction("获取流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceByBusinessKey(strDataEntity, businessKey);
			}
		},null, WFInstance.class);
	}

	protected WFInstance onGetWFInstanceByBusinessKey(String strDataEntity, Object businessKey) throws Throwable{
		return this.getCloudWFClient().getWFInstanceByBusinessKey(getSystemTag(), strDataEntity, businessKey);
	}

	@Override
	public int getWFInstanceAccessMode(String strDataEntity, Object businessKey) {
		return this.executeAction("获取流程实例访问模式", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceAccessMode(strDataEntity, businessKey);
			}
		}, null, Integer.class);
	}

	protected int onGetWFInstanceAccessMode(String strDataEntity, Object businessKey) throws Throwable{
		return this.getCloudWFClient().getWFInstanceAccessMode(getSystemTag(), strDataEntity, businessKey);
	}

	@Override
	public WFEditableFields getWFInstanceEditableFields(String strDataEntity, Object businessKey) {
		return this.executeAction("获取流程实例可编辑属性", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetWFInstanceEditableFields(strDataEntity, businessKey);
			}
		}, null, WFEditableFields.class);
	}

	protected WFEditableFields onGetWFInstanceEditableFields(String strDataEntity, Object businessKey) throws Throwable{
		return this.getCloudWFClient().getWFInstanceEditableFields(getSystemTag(), strDataEntity, businessKey);
	}


	@Override
	public WFInstance startWFInstance(String strDataEntity, Object businessKey, WFInstance instance) {
		return this.executeAction("启动流程实例", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onStartWFInstance(strDataEntity, businessKey, instance);
			}
		}, null, WFInstance.class);
	}

	protected WFInstance onStartWFInstance(String strDataEntity, Object businessKey, WFInstance instance) throws Throwable{
		return this.getCloudWFClient().startWFInstance(getSystemTag(), getAppTag(), strDataEntity, businessKey, instance);
	}
	

	@Override
	public WFInstance submitWFTaskWay(String strDataEntity, Object businessKey, String wfAction, WFTaskWay wfTaskWay) {
		return this.executeAction("提交流程操作", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSubmitWFTaskWay(strDataEntity, businessKey, wfAction, wfTaskWay);
			}
		}, null, WFInstance.class);
	}
	
	protected WFInstance onSubmitWFTaskWay(String strDataEntity, Object businessKey, String wfAction, WFTaskWay wfTaskWay) throws Throwable{
		return this.getCloudWFClient().submitWFTaskWay(getSystemTag(), getAppTag(), strDataEntity, businessKey, wfAction, wfTaskWay);
	}

	protected String getSystemTag() {
		return EmployeeContext.getCurrentMust().getSystemid();
	}

	protected String getAppTag() {
		return "web";
	}


	@Override
	public String getLogicName() {
		return String.format("系统流程功能组件[%1$s]", this.getName());
	}

}
