package net.ibizsys.central.cloud.saas.rt.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.cloudutil.EBSXCloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.service.IEmployeeService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.OpenUserDTO;
import net.ibizsys.central.util.SearchContextDTO;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;


public class RTCloudSaaSUtilRuntime extends EBSXCloudSaaSUtilRuntime {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTCloudSaaSUtilRuntime.class);


    @Override
    protected OpenUser onGetOpenUser(String strOpenType, String strUserId) throws Throwable {
        Employee employee = this.getEmployee(strUserId);
        OpenUserDTO dto = (OpenUserDTO)EBSXSystemRuntime.getInstance().getOpenUserService().selectOne((new SearchContextDTO()).eq("OPEN_TYPE", strOpenType.toLowerCase()).eq("MOBILE", employee.getPhone()), true);
        OpenUser openUser;
        if (dto == null) {
            openUser = new OpenUser();
            openUser.setSysUserId(strUserId);
            openUser.setUserId(employee.getWXWorkUserId());
            openUser.setOpenUserName(employee.getPersonName());
            return openUser;
        } else {
            openUser = new OpenUser();
            dto.copyTo(openUser, true);
            return openUser;
        }
    }
    @Override
    protected User onGetUserByOpenUser(OpenUser openUser) throws Throwable {
        // 从单点登录回来以后用开放平台用户换算真实用户   原来查的emp和user  新的cloudmgr要查sys_person
        IEmployeeService employeeService = EBSXSystemRuntime.getInstance().getEmployeeService();
        EmployeeDTO employeeDTO = null;
        if (StringUtils.hasLength(openUser.getSysUserId())) {
            employeeDTO = (EmployeeDTO)employeeService.get(openUser.getSysUserId(), true);
            if (employeeDTO == null) {
                throw new Exception(String.format("开放用户[%1$s]手机号码[%2$s]绑定机构用户不存在", openUser.getOpenUserName(), openUser.getMobile()));
            }
        } else {

            String strUserCode = "";
            if(StringUtils.hasLength(openUser.getOpenType()) && StringUtils.hasLength(openUser.getUserId())) {
                strUserCode = String.format("%s%s", openUser.getOpenType(), openUser.getUserId());
                SearchContextDTO searchContextDTO = new SearchContextDTO();
                searchContextDTO.eq(IEmployeeService.FIELD_FROMOPENUSERTAG, strUserCode);
                employeeDTO = employeeService.selectOne(searchContextDTO, true);
            }
            if (employeeDTO == null) {
                //获取电话号码获取
                if(!StringUtils.hasLength(openUser.getMobile())) {
                    log.warn(String.format("开放用户[%1$s]未指定手机号码", openUser.getOpenUserName()));
                }
                else {
                    SearchContextDTO searchContextDTO = new SearchContextDTO();
                    searchContextDTO.eq(IEmployeeService.FIELD_PHONE, openUser.getMobile());

                    employeeDTO = employeeService.selectOne(searchContextDTO, true);
                }

            }
            if(employeeDTO == null && StringUtils.hasLength(strUserCode) ) {

                SearchContextDTO searchContextDTO = new SearchContextDTO();
                searchContextDTO.or()
                        .eq(IEmployeeService.FIELD_EMAIL, strUserCode).eq(IEmployeeService.FIELD_USERCODE, strUserCode)
                        .eq(IEmployeeService.FIELD_USERID,strUserCode).eq(IEmployeeService.FIELD_USERNAME,strUserCode)
                        .eq(IEmployeeService.FIELD_FROMOPENUSERTAG, openUser.getUserId())
                        .eq(IEmployeeService.FIELD_EMAIL, openUser.getUserId()).eq(IEmployeeService.FIELD_USERCODE, openUser.getUserId())
                        .eq(IEmployeeService.FIELD_USERID,openUser.getUserId()).eq(IEmployeeService.FIELD_USERNAME,openUser.getUserId());
                employeeDTO = employeeService.selectOne(searchContextDTO, true);

            }

        }
        if(employeeDTO == null) {
            throw new Exception(String.format("开放用户[%1$s]未绑定机构用户", openUser.getOpenUserName()));
        }

        User user = new User();
        user.putAll(employeeDTO.any());
        return user;
    }
}
