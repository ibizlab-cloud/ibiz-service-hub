package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.service;

import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.dto.SysRoleMemberDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.UserRoleDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.impl.UserRoleServiceImpl;
import net.ibizsys.central.cloud.uaa.core.addin.RTAuthAgent;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Priority;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Priority(100)
@Service
public class UserRoleServiceImplEx extends UserRoleServiceImpl {

    @Autowired(
            required = false
    )
    ISystemGateway systemGateway;


    private IWebClient iWebClient = null;
    protected IWebClient getWebClient() throws Exception {
        if (this.iWebClient == null  ) {
            iWebClient = this.getSystemRuntime().createWebClient(RTAuthAgent.RT_SERVICE);
            iWebClient.init(this.getSystemRuntime(), RTAuthAgent.RT_SERVICE, null);
        }
        return this.iWebClient;
    }



    @Override
    public void create(UserRoleDTO dto) throws Throwable {


        Map header = new HashMap();
        header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());



        Map<String,Object> roleMember = new HashMap<>();
        roleMember.put("member_uid",dto.getUserId());
        roleMember.put("role_id",dto.getRoleId());
        roleMember.put("member_type","inetOrgPerson");
        roleMember.put("member_name",dto.getPersonName());
        roleMember.put("member_dn",dto.getPersonName());
        roleMember.put("organization_id",dto.getOrgId());

        IWebClientRep<SysRoleMemberDTO> rep = getWebClient().post("/sys_role_members", null, header, null, roleMember, null, SysRoleMemberDTO.class, null);
        if (rep != null && rep.getBody() != null) {
            SysRoleMemberDTO ret = rep.getBody();
            if (!ObjectUtils.isEmpty(ret.getId())) {
                dto.setUserRoleId(ret.getId());
                get(dto,true);
            }
        }

    }



    @Override
    public void remove(List<String> keys) throws Throwable {
        Map header = new HashMap();
        header.put("Authorization", "Bearer " + AuthenticationUser.getCurrentMust().getToken());
        keys.forEach(key -> {
            try {
                getWebClient().delete(String.format("/sys_role_members/%1$s",key), null, header);
            } catch (Exception e) {
                throw new RuntimeException(e);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }

        });

    }

}

