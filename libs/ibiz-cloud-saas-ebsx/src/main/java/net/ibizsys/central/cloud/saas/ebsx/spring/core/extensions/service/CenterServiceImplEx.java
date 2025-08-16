package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import javax.annotation.Priority;

import org.springframework.stereotype.Service;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IOrganizationService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.CenterDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenAccessDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.CenterServiceImpl;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict.OpenAccessType;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;

@Priority(100)
@Service
public class CenterServiceImplEx extends CenterServiceImpl { 

	@Override
	protected void onAfterCreate(CenterDTO dto) throws Throwable {
		super.onAfterCreate(dto);
		
		initDefaultOrgAndUser(dto);
	}
	
	protected void initDefaultOrgAndUser(CenterDTO dto) throws Throwable{
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrentMust();
		
		Employee employee = new Employee();
		employee.setUserId(lastEmployeeContext.getUserid());
		employee.setPersonName(lastEmployeeContext.getUsername());
		employee.setSrfdcid(dto.getSysCenterId());

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, null);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {
			onInitDefaultOrgAndUser(dto);

		} catch (Throwable ex) {

			throw ex;

		} finally {

			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected void onInitDefaultOrgAndUser(CenterDTO dto) throws Throwable{
		
		//建立默认组织
		OrganizationDTO organization =	this.getSystemRuntime().getOrganizationService().selectOne(new SearchContextDTO().nvl(IOrganizationService.FIELD_PORGID), true);
		if(organization == null) {
			//建立默认组织
			organization = new OrganizationDTO();
			organization.setOrgName(dto.getCenterName());
			organization.setShowOrder(0);
			this.getSystemRuntime().getOrganizationService().create(organization);
		}
		
		//建立管理员
		String strLoginName = String.format("%1$s_%2$s", dto.getSysCenterId(), "admin").toLowerCase();
		EmployeeDTO employee = this.getSystemRuntime().getEmployeeService().selectOne(new SearchContextDTO().eq(IEmployeeService.FIELD_LOGINNAME, strLoginName), true);
		if(employee == null) {
			employee = new EmployeeDTO();
			employee.setOrgId(organization.getOrgId());
			employee.setPersonName("机构管理员");
			employee.setShowOrder(999999);
			employee.setLoginName(strLoginName);
			employee.setPassword("123456");
			employee.setUserCode("ADMIN");
			employee.setSuperUser(1);
			this.getSystemRuntime().getEmployeeService().create(employee);
		}
	}
	
	@Override
	public void initDefaultOpenAccess(CenterDTO dto) throws Throwable {
		
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrentMust();
		
		Employee employee = new Employee();
		employee.setUserId(lastEmployeeContext.getUserid());
		employee.setPersonName(lastEmployeeContext.getUsername());
		employee.setSrfdcid(dto.getSysCenterId());

		IEmployeeContext iEmployeeContext = new EmployeeContext(employee, null, null);
		EmployeeContext.setCurrent(iEmployeeContext);
		try {
			super.initDefaultOpenAccess(dto);

		} catch (Throwable ex) {

			throw ex;

		} finally {

			EmployeeContext.setCurrent(lastEmployeeContext);
		}
		
	}
	
	@Override
	protected void onInitDefaultOpenAccess(CenterDTO dto) throws Throwable {

		OpenAccessType[] openTypes = new OpenAccessType[] {OpenAccessType.DINGTALK, OpenAccessType.WXWORK};
		for(OpenAccessType openAccessType : openTypes) {
			String strDefaultAccessId = KeyValueUtils.genUniqueId(dto.getSysCenterId(), openAccessType.getValue().toUpperCase());
			OpenAccessDTO openAccess = this.getSystemRuntime().getOpenAccessService().get(strDefaultAccessId, true);
			if(openAccess != null) {
				continue;
			}
			
			openAccess = new OpenAccessDTO();
			openAccess.setOpenType(openAccessType.getValue());
			openAccess.setId(strDefaultAccessId);
			openAccess.setName(String.format("%1$s[默认]", openAccessType.getText()));
			openAccess.setDefaultflag(EntityBase.BOOLEAN_TRUE);
			this.getSystemRuntime().getOpenAccessService().create(openAccess);
		}
		
	}


}

