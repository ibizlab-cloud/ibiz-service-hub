package net.ibizsys.central.cloud.open.rt.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.open.core.addin.IOpenAccessAgent;
import net.ibizsys.central.cloud.open.ebsx.cloudutil.EBSXCloudOpenUtilRuntime;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.EmployeeDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto.OrganizationDTO;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.msg.MsgTypes;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.domain.MsgSendQueue;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 开放平台同步到 SYS_PERSON
 *
 * @author xignzi
 * @date 2024/1/30
 */
public class RTCloudOpenUtilRuntime extends EBSXCloudOpenUtilRuntime {
    private static final Log log = LogFactory.getLog(RTCloudOpenUtilRuntime.class);


    private String PREFIX_UAA = "UAA_";

    private String SELECT_DEFAULT_ORG_ID_SQL = "SELECT ID FROM SYS_ORGANIZATION WHERE PARENT_ID IS NULL ORDER BY CREATE_TIME,SORT";

    private String SELECT_ALL_SYS_PERSON_SQL = "SELECT ID FROM SYS_PERSON";

    private String INSERT_SQL = "INSERT INTO SYS_PERSON(ID, DISPLAY_NAME, ENABLED, CREATOR, CREATE_TIME, UPDATER, UPDATE_TIME, DC,UID, USER_PASSWORD, ORGANIZATION_ID, EMPLOYEE_NUMBER, EMPLOYEE_TYPE, MOBILE) \n" +
            " VALUES(?, ?, 1, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?)";

    @Override
    protected void onSendMessages(String strOpenAccessId, MsgSendQueue[] msgSendQueues) throws Throwable {
        IOpenAccessAgent iOpenAccessAgent = this.getOpenAccessAgent(strOpenAccessId);

        if(msgSendQueues.length==1) {
            MsgSendQueue msgSendQueue = msgSendQueues[0];
            int nMsgType = 0;
            try {
                nMsgType = DataTypeUtils.getIntegerValue(msgSendQueue.getMsgType(), 0);
            } catch (Exception ex) {
                throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("消息[%1$s]未标记类型", msgSendQueue.getMsgSendQueueId()));
            }
            if(((MsgTypes.DD & nMsgType) == 0 && StaticDict.OpenAccessType.DINGTALK.getValue().equalsIgnoreCase(iOpenAccessAgent.getOpenType()))
                || ((MsgTypes.WXWORK & nMsgType) == 0 && StaticDict.OpenAccessType.WXWORK.getValue().equalsIgnoreCase(iOpenAccessAgent.getOpenType())))
            {
                log.error(String.format("开放应用[%1$s]发送消息发生异常，%2$s Agent 不适配发送 %3$s 类型的消息", getName(), iOpenAccessAgent.getOpenType(), nMsgType));
                throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("开放应用[%1$s]发送消息发生异常，%2$s Agent 不适配发送 %3$s 类型的消息", getName(), iOpenAccessAgent.getOpenType(), nMsgType));
            }

        }

        iOpenAccessAgent.sendMessages(msgSendQueues);
    }


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
