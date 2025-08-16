package net.ibizsys.central.cloud.conf.core.cloudutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudConfUtilRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.CodeItem;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.runtime.util.IAction;

public abstract class CloudConfUtilRuntimeBase extends CloudUtilRuntimeBase implements ICloudConfUtilRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudConfUtilRuntimeBase.class);
	
	
	
	@Override
	public String getLogicName() {
		return String.format("Cloud体系Conf功能组件[%1$s]", this.getName());
	}
	
	@Override
	public Config getConfig(String strConfigType, String strTargetType, boolean bTryMode) {
		return this.getConfig(strConfigType, strTargetType, bTryMode, false);
	}
	
	@Override
	public Config getConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal) {
		return this.executeAction("获取配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetConfig(strConfigType, strTargetType, bTryMode, bTryGlobal);
			}
		}, null, Config.class);
	}
	
	
	
	protected Config onGetConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal) throws Throwable{
		return this.getCloudSaaSUtilRuntime().getConfig(strConfigType, strTargetType, bTryMode, bTryGlobal);
	}
	
	@Override
	public Config saveConfig(String strConfigType, String strTargetType, Object objConfig) {
		return this.saveConfig(strConfigType, strTargetType, objConfig, false);
	}
	
	@Override
	public Config saveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal) {

		return this.executeAction("保存配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onSaveConfig(strConfigType, strTargetType, objConfig, bAsGlobal);
			}
		}, null, Config.class);
	}
	

	
	protected Config onSaveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal) throws Throwable{
		return this.getCloudSaaSUtilRuntime().saveConfig(strConfigType, strTargetType, objConfig, bAsGlobal);
	}
	
	@Override
	public void removeConfig(String strConfigType, String strTargetType) {
		this.executeAction("移除配置", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onRemoveConfig(strConfigType, strTargetType);
				return null;
			}
		}, null, Object.class);
		
	}
	
	protected void onRemoveConfig(String strConfigType, String strTargetType) throws Throwable{
		this.getCloudSaaSUtilRuntime().removeConfig(strConfigType, strTargetType);
	}
	
	@Override
	public CodeList getCodeList(String strCodeListTag, boolean bTryMode) {
		return this.executeAction("获取代码表", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetCodeList(strCodeListTag, bTryMode);
			}
		}, null, CodeList.class);
	}
	
	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode) throws Throwable{
		if(CODELIST_SYSOPERATOR.equalsIgnoreCase(strCodeListTag)) {
			//系统操作者
			Collection<Employee> employees = this.getCloudSaaSUtilRuntime().getEmployeesByOrg(EmployeeContext.getCurrentMust().getOrgid());
			CodeList codeList = new CodeList();
			codeList.setCode(strCodeListTag);
			if(!ObjectUtils.isEmpty(employees)) {
				int nMaxSize = 1000;
				List<CodeItem> codeItems = new ArrayList<CodeItem>();
				for(Employee employee : employees) {
					CodeItem codeItem = new CodeItem();
					codeItem.setValue(employee.getUserId());
					codeItem.setText(employee.getPersonName());
					codeItem.setIconClass(employee.getAvatar());
					codeItems.add(codeItem);
					
					nMaxSize --;
					if(nMaxSize == 0) {
						break;
					}
				}
				codeList.setItems(codeItems);
			}
			
			return codeList;
		}
		
		return this.getCloudSaaSUtilRuntime().getCodeList(strCodeListTag, bTryMode);
	}

	@Override
	public CodeList getCodeList(String strCodeListTag, boolean bTryMode,Integer maxSize) {
		return this.executeAction("获取代码表", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetCodeList(strCodeListTag, bTryMode,maxSize);
			}
		}, null, CodeList.class);
	}

	protected CodeList onGetCodeList(String strCodeListTag, boolean bTryMode, Integer maxSize) throws Throwable{
		if(CODELIST_SYSOPERATOR.equalsIgnoreCase(strCodeListTag)) {
			//系统操作者
			Collection<Employee> employees = this.getCloudSaaSUtilRuntime().getEmployeesByOrg(EmployeeContext.getCurrentMust().getOrgid());
			CodeList codeList = new CodeList();
			codeList.setCode(strCodeListTag);
			if(!ObjectUtils.isEmpty(employees)) {
				int nMaxSize = maxSize;
				List<CodeItem> codeItems = new ArrayList<CodeItem>();
				for(Employee employee : employees) {
					CodeItem codeItem = new CodeItem();
					codeItem.setValue(employee.getUserId());
					codeItem.setText(employee.getPersonName());
					codeItem.setIconUrl(employee.getUserIcon());
					codeItems.add(codeItem);

					nMaxSize --;
					if(nMaxSize == 0) {
						break;
					}
				}
				codeList.setItems(codeItems);
			}

			return codeList;
		}

		return this.getCloudSaaSUtilRuntime().getCodeList(strCodeListTag, bTryMode, maxSize);
	}
}
