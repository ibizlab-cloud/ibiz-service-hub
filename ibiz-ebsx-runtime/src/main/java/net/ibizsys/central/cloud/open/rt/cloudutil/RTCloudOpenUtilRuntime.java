package net.ibizsys.central.cloud.open.rt.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.ebsx.cloudutil.EBSXCloudOpenUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import org.apache.commons.collections4.CollectionUtils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 开放平台同步到 SYS_PERSON
 *
 * @author xignzi
 * @date 2024/1/30
 */
public class RTCloudOpenUtilRuntime extends EBSXCloudOpenUtilRuntime {

    private String PREFIX_UAA = "UAA_";

    private String SELECT_DEFAULT_ORG_ID_SQL = "SELECT ID FROM SYS_ORGANIZATION WHERE PARENT_ID IS NULL ORDER BY CREATE_TIME,SORT";

    private String SELECT_ALL_SYS_PERSON_SQL = "SELECT ID FROM SYS_PERSON";

    private String INSERT_SQL = "INSERT INTO SYS_PERSON(ID, DISPLAY_NAME, ENABLED, CREATOR, CREATE_TIME, UPDATER, UPDATE_TIME, DC,UID, USER_PASSWORD, ORGANIZATION_ID, EMPLOYEE_NUMBER, EMPLOYEE_TYPE, MOBILE) \n" +
            " VALUES(?, ?, 1, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?)";


    @Override
    protected void onSyncOrganizationUnits(String strOpenAccessId) throws Throwable {
        super.onSyncOrganizationUnits(strOpenAccessId);


        IUserContext iUserContext = UserContext.getCurrent();
        IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);
        //UAA_开始的OpenAccess 需要同步employee
        if (!(iOpenAccessAgent.getAgentData().getId().startsWith(PREFIX_UAA))) {
            return;
        }
        Collection<OpenUser> openUsers = iOpenAccessAgent.selectOpenUsers(new SearchContextDTO());
//        SearchContextDTO searchContextDTO = new SearchContextDTO();
//        searchContextDTO.limit(999999);
//        List<OpenUserDTO> openUsers = EBSXSystemRuntime.getInstance().getOpenUserService().selectDefault(searchContextDTO);

        List<EmployeeDTO> select = EBSXSystemRuntime.getInstance().getEmployeeService().executeSelectSQL(SELECT_ALL_SYS_PERSON_SQL, null);
        List<String> exists = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(select)) {
            for (EmployeeDTO employeeDTO : select) {
                exists.add(String.valueOf(employeeDTO.get("ID")));
            }
        }
        List<List> inserts = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(openUsers)) {
            String strDefaultOrgId = getDefaultOrgId();
            for (OpenUser openUser : openUsers) {
                if (exists.contains(openUser.getUserId()))
                    continue;
                List data = new ArrayList();
                data.add(openUser.getUserId());
                data.add(openUser.getOpenUserName());
                data.add(iUserContext.getUserid());
                data.add(new Timestamp(System.currentTimeMillis()));
                data.add(iUserContext.getUserid());
                data.add(new Timestamp(System.currentTimeMillis()));
                data.add(iUserContext.getTenant());
                data.add(openUser.getMobile());
                data.add("123456");
                data.add(strDefaultOrgId);
                data.add(openUser.getOpenUserCode());
                data.add("dingtalk");
                data.add(openUser.getMobile());
                inserts.add(data);
            }
        }

        if (CollectionUtils.isNotEmpty(inserts)) {
            for (List insert : inserts) {
                EBSXSystemRuntime.getInstance().getOpenUserService().executeSQL(INSERT_SQL, insert);
            }
        }
    }

    /**
     * 获取默认组织id
     *
     * @return
     * @throws Throwable
     */
    private String getDefaultOrgId() throws Throwable {
        List<OrganizationDTO> orgs = EBSXSystemRuntime.getInstance().getOrganizationService().executeSelectSQL(SELECT_DEFAULT_ORG_ID_SQL, null);
        if (CollectionUtils.isEmpty(orgs)) {
            throw new SystemRuntimeException(this.getSystemRuntime(), "无法获取默认组织ID");
        }
        return orgs.get(0).get("ID").toString();
    }

}
