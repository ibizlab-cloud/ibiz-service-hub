package net.ibizsys.central.cloud.core.eai;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.domain.DataSyncOut;

public abstract class SysEAIAgentRuntimeBase extends net.ibizsys.central.eai.SysEAIAgentRuntimeBase implements ISysEAIAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysEAIAgentRuntimeBase.class);
	
	@Override
	protected void onFillSendData(ObjectNode packageNode, String strSendData, DataSyncOut[] dataSyncOuts) throws Throwable {
		super.onFillSendData(packageNode, strSendData, dataSyncOuts);
		
		//额外添加上下文用户信息
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext == null) {
			return;
		}
		
		ObjectNode empNode = packageNode.putObject("emp");
		
		if(StringUtils.hasLength(iEmployeeContext.getTenant())) {
			empNode.put(PARAM_EMP_TENANT, iEmployeeContext.getTenant());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getSystemid())) {
			empNode.put(PARAM_EMP_SYSTEMID, iEmployeeContext.getSystemid());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getDcsystemid())) {
			empNode.put(PARAM_EMP_DCSYSTEMID, iEmployeeContext.getDcsystemid());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getOrgid())) {
			empNode.put(PARAM_EMP_ORGID, iEmployeeContext.getOrgid());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getOrgcode())) {
			empNode.put(PARAM_EMP_ORGCODE, iEmployeeContext.getOrgcode());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getOrgname())) {
			empNode.put(PARAM_EMP_ORGNAME, iEmployeeContext.getOrgname());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getDeptid())) {
			empNode.put(PARAM_EMP_DEPTID, iEmployeeContext.getDeptid());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getDeptcode())) {
			empNode.put(PARAM_EMP_DEPTCODE, iEmployeeContext.getDeptcode());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getDeptname())) {
			empNode.put(PARAM_EMP_DEPTNAME, iEmployeeContext.getDeptname());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getUserid())) {
			empNode.put(PARAM_EMP_USERID, iEmployeeContext.getUserid());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getUsername())) {
			empNode.put(PARAM_EMP_USERNAME, iEmployeeContext.getUsername());
		}
		
		if(StringUtils.hasLength(iEmployeeContext.getUsercode())) {
			empNode.put(PARAM_EMP_USERCODE, iEmployeeContext.getUsercode());
		}
	}
	
	
	@Override
	protected void onRecv(String strTopic, String strData, Map<String, Object> map) throws Throwable {
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		
		if(!this.isRawDataMode()) {
			//构造身份
			if(map == null) {
				map = this.getRecvDataMap(strData);
			}
			
			Object emp = map.get(PACKAGE_EMP);
			if(emp instanceof Map) {
				Map<String, Object> empMap = (Map<String, Object>)emp;
				
				Employee employee = new Employee(); 
				String strSystemId = DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_SYSTEMID), null);
				employee.setSrfdcid(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_TENANT), null));
				employee.setDCSystemId(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_DCSYSTEMID), null));
				employee.setUserId(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_USERID), null));
				employee.setPersonName(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_USERNAME), null));
				employee.setUserCode(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_USERCODE), null));
				
				employee.setOrgId(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_ORGID), null));
				employee.setOrgName(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_ORGNAME), null));
				employee.setOrgCode(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_ORGCODE), null));
				
				employee.setMDeptId(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_DEPTID), null));
				employee.setMDeptName(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_DEPTNAME), null));
				employee.setMDeptCode(DataTypeUtils.getStringValue(empMap.get(PARAM_EMP_DEPTCODE), null));
				
				EmployeeContext.setCurrent(new EmployeeContext(employee, null, strSystemId));
			}
		}
		try {
			super.onRecv(strTopic, strData, map);
		}
		finally {
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
}
