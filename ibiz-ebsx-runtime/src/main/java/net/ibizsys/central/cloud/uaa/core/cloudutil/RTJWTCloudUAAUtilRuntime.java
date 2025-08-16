package net.ibizsys.central.cloud.uaa.core.cloudutil;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.security.*;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.RTJWTSysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.*;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionActionDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.PermissionDTO;
import net.ibizsys.central.cloud.uaa.core.addin.RTAuthAgent;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthGrantedRole;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthGrantedSystem;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthLoginResponse;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthMember;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.CacheableActionBuilder;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import net.ibizsys.central.cloud.uaa.core.addin.dto.OpenAccess;
import javax.servlet.http.HttpServletRequest;

import java.io.UnsupportedEncodingException;
import java.lang.System;
import java.net.URLEncoder;
import java.util.*;
import java.util.Collection;
import java.util.stream.Collectors;

public class RTJWTCloudUAAUtilRuntime extends CloudUAAUtilRuntimeBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTJWTCloudUAAUtilRuntime.class);

    /**
     * 获取当前用户权限查询
     */
    private static final String QUERY_PERMISSION = "SELECT t4.DCSYSTEMID, t1.BSCOPE, t1.DCSYSTEMID, t1.DEPTBC, t1.DEPTDR, t1.DYNAINSTID, t1.ISALLDATA, t1.ENABLEDEPTBC, t1.ENABLEDEPTDR, t1.ENABLEORGDR, t1.ENTITYID, t11.ENTITYNAME, t1.ORGDR, t1.PERMISSIONTAG, t1.PERMISSIONTYPE, t1.PSSYSTEMID, t1.PSYS_PERMISSIONID, t1.SYSTEMFLAG, t1.SYS_PERMISSIONID, t1.SYS_PERMISSIONNAME \n" +
            "FROM IBZPERMISSION t1 \n" +
            "LEFT JOIN IBZENTITY t11 ON t1.ENTITYID = t11.ENTITYID \n" +
            "LEFT JOIN IBZROLE_PERMISSION T2 ON t2.SYS_PERMISSIONID = t1.SYS_PERMISSIONID \n" +
            "LEFT JOIN IBZROLE T4 ON T4.SYS_ROLEID = T2.SYS_ROLEID \n" +
            "WHERE T2.ISVALID = 1 \n" +
            "AND (T4.DCSYSTEMID IS NULL OR T4.DCSYSTEMID = ?) \n" +
            "AND (T2.SYS_ROLEID in (?) or exists(select 1 from SYS_ROLE_MEMBER T3 where T2.SYS_ROLEID=T3.ROLE_ID and T3.MEMBER_TYPE='inetOrgPerson' and T3.MEMBER_UID = ?))";

    /**
     * 获取当前用户权限操作标识
     */
    private static final String QUERY_PERMISSIONACTION = "SELECT t1.BSCOPE, t1.OPPRIV, t1.SYSTEMFLAG, t1.SYS_PERMISSIONID, t11.SYS_PERMISSIONNAME, t1.SYS_PERMISSION_ACTIONID, t1.SYS_PERMISSION_ACTIONNAME \n" +
            "FROM IBZPERMISSIONACTION t1 \n" +
            "LEFT JOIN IBZPERMISSION t11 ON t1.SYS_PERMISSIONID = t11.SYS_PERMISSIONID \n" +
            "LEFT JOIN IBZROLE_PERMISSION T2 ON T1.SYS_PERMISSIONID = T2.SYS_PERMISSIONID \n" +
            "LEFT JOIN IBZROLE T5 ON T5.SYS_ROLEID = T2.SYS_ROLEID \n" +
            "WHERE T2.ISVALID = 1 \n" +
            "AND  (T5.DCSYSTEMID IS NULL OR T5.DCSYSTEMID = ?) \n" +
            "AND (T2.SYS_ROLEID in (?) or exists(select 1 from SYS_ROLE_MEMBER T3 where T2.SYS_ROLEID=T3.ROLE_ID and T3.MEMBER_TYPE='inetOrgPerson' and T3.MEMBER_UID = ?))";

    @Override
    protected String onGenerateToken(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) throws Throwable {
        //直接使用 token
        String token = iAuthenticationUser.getToken();
        if(ObjectUtils.isEmpty(token)) {
            try {
                if (!iAuthenticationUser.getUsername().startsWith("oauth__")) {
                    IWebClientRep<AuthLoginResponse> rep = getWebClient(false).post(String.format(RTAuthAgent.RT_USERINFO_PATH,iAuthenticationUser.getUsername()), null, null, null, Collections.emptyMap(), null, AuthLoginResponse.class, null);
                    if (rep !=null && rep.getBody() != null) {
                        AuthLoginResponse authLoginResponse = rep.getBody();
                        token = authLoginResponse.getToken();
                        if (iAuthenticationUser instanceof AuthenticationUser) {
                            AuthenticationUser authUser = (AuthenticationUser) iAuthenticationUser;
                            authUser.setToken(token);
                            authUser.setRefreshtoken(authLoginResponse.getRefreshToken());
                            authUser.setExpirein(authLoginResponse.getExpiresIn());
                        }
                    }
                }
            } catch (Throwable ex) {
                log.error(String.format("重新补充token发生异常， %1$s", ex.getMessage()), ex);
            }
        }
        return token;
    }

    @Override
    protected AuthenticationInfo onGenerateToken2(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) throws Throwable {
        AuthenticationInfo authenticationInfo = super.onGenerateToken2(iAuthenticationUser, nTokenExpiration);
        authenticationInfo.setRefresh_token(iAuthenticationUser.getRefreshtoken());
        authenticationInfo.setExpirein(3 * 60);
        return authenticationInfo;
    }

    @Override
    protected String onRefreshToken(String strToken, long nTokenExpiration) throws Throwable {
        return super.onRefreshToken(strToken, nTokenExpiration);
    }

    @Override
    protected void onReloadSetting(boolean bFirst) throws Throwable {
        super.onReloadSetting(bFirst);
        prepareWebClient();
    }

    @Override
    public int getExpireInFromToken(String token) {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            return Long.valueOf((claimsSet.getExpirationTime().getTime() - System.currentTimeMillis()) / 1000).intValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Date onGetExpirationDateFromToken(String token) throws Throwable {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            return claimsSet.getExpirationTime();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取org相关信息
     *
     * @param iAuthenticationUser
     * @param strDCSystemId
     * @return
     * @throws Throwable
     */
    @Override
    protected Collection<OrgSystem> onGetOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId) throws Throwable {
        List<OrgSystem> orgSystems = new ArrayList<>();
        if (iAuthenticationUser != null) {
            RTAuthenticationUser rtAuthenticationUser = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), RTAuthenticationUser.class);
            if (CollectionUtils.isNotEmpty(rtAuthenticationUser.getMemberOf())) {
                for (AuthMember authMember : rtAuthenticationUser.getMemberOf()) {
                    if (orgSystems.stream().filter(orgSystem -> orgSystem.getOrgId().equals(authMember.getOrganizationId())).findAny().isPresent())
                        continue;
                    OrgSystem orgSystem = new OrgSystem();
                    orgSystem.setOrgId(authMember.getOrganizationId());
                    orgSystem.setOrgName(authMember.getOrganizationName());
                    orgSystem.setSystemId(strDCSystemId);
                    orgSystem.setDCSystemId(strDCSystemId);
                    orgSystems.add(orgSystem);
                }
            }
        }
        return orgSystems;
    }


    @Override
    public AppData getAppData(IAuthenticationUser iAuthenticationUser2, String strSystemId, String strOrgId) {

        IAuthenticationUser iAuthenticationUser = (iAuthenticationUser2 != null) ? iAuthenticationUser2 : AuthenticationUser.getCurrentMust();
        //if(iAuthenticationUser.getSuperuser() != EntityBase.BOOLEAN_TRUE && iAuthenticationUser.getApiuser() == EntityBase.BOOLEAN_TRUE) {
        if(iAuthenticationUser.getApiuser() == EntityBase.BOOLEAN_TRUE) {
            log.error(String.format("API用户[%1$s]禁止访问业务系统", iAuthenticationUser.getUsername()));
            return null;
        }


        AppData appData = executeAction("准备应用环境", new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {

                return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
                        .tags(CloudCacheTagUtils.getUserAppDataTag(strSystemId, strOrgId))
                        .expire(iAuthenticationUser.getExpirein())
                        .action(new IAction() {
                            @Override
                            public Object execute(Object[] args) throws Throwable {
                                return getAppDataReal(iAuthenticationUser, strSystemId, strOrgId);
                            }

                        }).build().get(AppData.class);
            }
        }, null, AppData.class);



        // 计算缓存标记，放在缓存外部支持刷新生效
        if (appData != null && StringUtils.hasLength(strSystemId) && !ICloudSaaSUtilRuntime.SYSTEMID_PORTAL.equalsIgnoreCase(strSystemId)) {

            try {

                Employee employee = this.executeAction("获取RT人员", new IAction() {
                    public Object execute(Object[] args) throws Throwable {
                        return (new CacheableActionBuilder(RTJWTCloudUAAUtilRuntime.this.getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))).tags(new Object[]{CloudCacheTagUtils.getUserEmployeeTag(strSystemId, strOrgId)}).expire(iAuthenticationUser.getExpirein()).action(new IAction() {
                            public Object execute(Object[] args) throws Throwable {
                                return RTJWTCloudUAAUtilRuntime.this.getEmployee(iAuthenticationUser, strSystemId, strOrgId);
                            }
                        }).build().get(Employee.class);
                    }
                }, (Object[]) null, Employee.class);

                EmployeeContext employeeContext = new EmployeeContext(employee, null, strSystemId);
                UserContext.setCurrent(employeeContext);

                MetaDynaModel metaDynaModel = this.getCloudSaaSUtilRuntime().getMetaDynaModel(strSystemId, strOrgId);
                if (StringUtils.hasLength(metaDynaModel.getModelFile())) {
                    appData.set("dynamodeltag", KeyValueUtils.genUniqueId(metaDynaModel.getModelFile()));
                }
            } catch (Throwable ex) {
                log.error(String.format("计算系统[%1$s]动态模型发生异常，%2$s", strSystemId, ex.getMessage()), ex);
            }
        }


        if(iAuthenticationUser.getExpirein() > 0) {
            appData.set("expirein", iAuthenticationUser.getExpirein());
        }

        return appData;
    }


    @Override
    protected AppData onGetAppData(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {

        AppData appData = new AppData();
        Entity context = new Entity();
        Employee employee = this.executeAction("获取RT人员", new IAction() {
            public Object execute(Object[] args) throws Throwable {
                return (new CacheableActionBuilder(RTJWTCloudUAAUtilRuntime.this.getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))).tags(new Object[]{CloudCacheTagUtils.getUserEmployeeTag(strSystemId, strOrgId)}).expire(iAuthenticationUser.getExpirein()).action(new IAction() {
                    public Object execute(Object[] args) throws Throwable {
                        return RTJWTCloudUAAUtilRuntime.this.getEmployee(iAuthenticationUser, strSystemId, strOrgId);
                    }
                }).build().get(Employee.class);
            }
        }, (Object[]) null, Employee.class);

        EmployeeContext employeeContext = new EmployeeContext(employee, null, strSystemId);
        UserContext.setCurrent(employeeContext);

        context.set("srfdcid", employee.getSrfdcid());
        context.set("srfsystemid", strSystemId);
        context.set("srfdcsystemid", employee.getDCSystemId());
        if (StringUtils.hasLength(employee.getOrgId())) {
            context.set("srforgid", employee.getOrgId());
            context.set("srforgname", employee.getOrgName());
            context.set("srforgcode", employee.getOrgCode());
        }

        context.set("srfuserid", employee.getUserId());
        context.set("srfusername", employee.getPersonName());
        context.set("srfpersonid", employee.getUserId());
        context.set("srfloginname", employee.getLoginName());
        context.set("srfpersonname", employee.getPersonName());
        context.set("srfusercode", employee.getUserCode());
        context.set("srforgsectorid", employee.getMDeptId());
        context.set("srforgsectorname", employee.getMDeptName());
        context.set("srforgsectorcode", employee.getMDeptCode());
        context.set("srfteamid",employee.getPostId());
        context.set("organizational_role_name",employee.getPostName());

        context.set("organization_id",employee.getOrgId());
        context.set("organization_number",employee.getOrgCode());
        context.set("organization_name",employee.getOrgName());
        context.set("department_id",employee.getMDeptId());
        context.set("department_number",employee.getMDeptCode());
        context.set("department_name",employee.getMDeptName());
        context.set("organizational_role_id",employee.getPostId());
        context.set("organizational_role_name",employee.getPostName());

        context.set("srfuaausername",employee.getUAAUserName());
        context.set("display_name",employee.getPersonName());
        context.set("dc",employee.getSrfdcid());

        context.set("employee_number",employee.getUserCode());
        context.set("employee_type",employee.getPostCode());
        context.set("mail",employee.getEmail());
        context.set("mobile",employee.getPhone());
        context.set("identification_number",employee.getCertCode());
        context.set("postal_address",employee.getAddr());

        Set<String> appMenu = new HashSet<>();
        Set<String> uniRes = new HashSet<>();

        appData.set("unires", uniRes);
        appData.set("appmenu", appMenu);

        // 放入过期时间
        if (StringUtils.hasLength(iAuthenticationUser.getToken())) {
            Date date = this.getExpirationDateFromToken(iAuthenticationUser.getToken());
            // yyyy-MM-dd HH:mm:ss
            appData.set("expireddate", DateUtils.toDateTimeString(date));
        }

        if (StringUtils.hasLength(employee.getMqttTopic())) {
            appData.set("mqtttopic", employee.getMqttTopic());
        }
        appData.setContext(context);

        return appData;
    }

    /**
     * 开放平台授权码登录
     * @param strDCSystemId
     * @param strOpenType
     * @param strOpenCode
     * @param strOpenAccessId
     * @return
     * @throws Throwable
     */
    protected AuthenticationUser onGetdUserByOpenAuthCode(String strDCSystemId, String strOpenType, String strOpenCode, String strOpenAccessId) throws Throwable {
        if (ObjectUtils.isEmpty(strOpenAccessId)) {
            AuthenticationUser user = super.onGetdUserByOpenAuthCode(strDCSystemId,strOpenType,strOpenCode,strOpenAccessId);
            try {
                IWebClientRep<AuthLoginResponse> rep = null;
                if (user == null || user.getUsername().startsWith("oauth__")) {
                    return null;
                } else {
                    rep = getWebClient(false).post(String.format(RTAuthAgent.RT_USERINFO_PATH,user.getUsername()), null, null, null, Collections.emptyMap(), null, AuthLoginResponse.class, null);

                    if (rep != null && rep.getBody() != null) {
                        AuthLoginResponse authLoginResponse = rep.getBody();
                        RTAuthenticationUser authenticationUser = RTAuthAgent.genRTUser(user.getUsername(),authLoginResponse);

                        if(authenticationUser != null && authenticationUser.getUserid()!=null) {
                            User logUser = new User();
                            logUser.setUserId(authenticationUser.getUserid());
                            logUser.setUserName(authenticationUser.getUsername());
                            logUser.setPersonName(authenticationUser.getPersonname());
                            logUser.setApiUser(authenticationUser.getApiuser());

                            this.getCloudSaaSUtilRuntime().logAuthInfo(logUser, "RT-OPEN-AUTH");
                        }

                        return authenticationUser;
                    }
                }
            } catch (Throwable ex) {
                log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
            }
            return user;
        }
        else
        {
            Map params = new LinkedHashMap();
            params.put("id",strOpenAccessId);
            params.put("code",strOpenCode);
            IWebClientRep<AuthLoginResponse> rep = getWebClient(false).post(RTAuthAgent.RT_OAUTH_USERINFO_PATH, null, null, null, params , null, AuthLoginResponse.class, null);
            if (rep != null && rep.getBody() != null) {
                AuthLoginResponse authLoginResponse = rep.getBody();
                RTAuthenticationUser authenticationUser = RTAuthAgent.genRTUser(authLoginResponse.getUser().getUsername(),authLoginResponse);
                return authenticationUser;
            }
            throw new RuntimeException("授权认证发生异常，RT未正确返回");
        }
    }


    /**
     * 获取开放平台授权地址
     * @param strDCSystemId
     * @param strOpenType
     * @param strOpenAccessId
     * @return
     * @throws Throwable
     */
    @Override
    protected ObjectNode onGetOpenAccessInfo(String strDCSystemId, String strOpenType, String strOpenAccessId) throws Throwable {
        Map uriParams = new LinkedHashMap<>();
        uriParams.put("openaccessid",strOpenAccessId);
        Map<String,String> redirect = new HashMap<>();
        if(RequestContextHolder.getRequestAttributes() != null && RequestContextHolder.getRequestAttributes() instanceof ServletRequestAttributes){
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String redirectUri = request.getParameter("redirect_uri");
            try {
                if(!ObjectUtils.isEmpty(redirectUri)) {
                    if(redirectUri.startsWith("http://") || redirectUri.startsWith("https://"))
                        redirectUri = URLEncoder.encode(redirectUri, "UTF-8");
                    redirect.put("redirect_uri", redirectUri);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        IWebClientRep<OpenAccess> rep = getWebClient(false).get(RTAuthAgent.RT_AUTHORIZE_PATH, uriParams,null ,redirect,OpenAccess.class,null);
        if (rep!= null && rep.getBody() != null) {
            OpenAccess openAccess = rep.getBody();
            ObjectNode objectNode = JsonUtils.createObjectNode();
            objectNode.put("id", openAccess.getId());
            objectNode.put("appid", openAccess.getAccessKey());
            objectNode.put("corp_id", openAccess.getRegionId());
            objectNode.put("redirect_uri", openAccess.getRedirectUri());
            return objectNode;
        }
        throw new RuntimeException("获取开放平台授权地址发生异常，RT未正确返回");
    }

    @Override
    protected AuthenticationUser onGetUserByOpenQRCode(String strDCSystemId, String strOpenType, String strOpenQRCode, String strOpenAccessId) throws Throwable {
        AuthenticationUser user = super.onGetUserByOpenQRCode(strDCSystemId,strOpenType,strOpenQRCode,strOpenAccessId);
        try {
            IWebClientRep<AuthLoginResponse> rep = null;
            if (user == null || user.getUsername().startsWith("oauth__")) {
                return null;
            } else {
                rep = getWebClient(false).post(String.format(RTAuthAgent.RT_USERINFO_PATH,user.getUsername()), null, null, null, Collections.emptyMap(), null, AuthLoginResponse.class, null);

                if (rep != null && rep.getBody() != null) {
                    AuthLoginResponse authLoginResponse = rep.getBody();
                    RTAuthenticationUser authenticationUser = RTAuthAgent.genRTUser(user.getUsername(),authLoginResponse);

                    //补充认证日志
                    if(authenticationUser != null && authenticationUser.getUserid()!=null) {
                        User logUser = new User();
                        logUser.setUserId(authenticationUser.getUserid());
                        logUser.setUserName(authenticationUser.getUsername());
                        logUser.setPersonName(authenticationUser.getPersonname());
                        logUser.setApiUser(authenticationUser.getApiuser());

                        this.getCloudSaaSUtilRuntime().logAuthInfo(logUser, "RT-QRCODE");
                    }

                    return authenticationUser;
                }
            }
        } catch (Throwable ex) {
            log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
        }
        return user;
    }


    private String strPublicKeyString = null;

    protected String getPublicKeyString() throws Throwable {

        if(StringUtils.hasLength(this.strPublicKeyString)) {
            return this.strPublicKeyString;
        }

        IWebClientRep<String> rep = getWebClient(false).post(RTJWTSysUAAUtilRuntime.RT_PUBLICKEY_PATH, null);
        strPublicKeyString = rep.getBody();
        return strPublicKeyString;
    }

    private String strPublicKeyPem = null;
    public String getPublicKeyPem()  {

        if(StringUtils.hasLength(this.strPublicKeyPem)) {
            return this.strPublicKeyPem;
        }

        IWebClientRep<String> rep = null;
        try {
            rep = getWebClient(false).post(RTJWTSysUAAUtilRuntime.RT_PUBLICKEY_PEM_PATH, null);
            strPublicKeyPem = rep.getBody();
        } catch (Throwable e) {
            strPublicKeyPem = "";
        }

        return strPublicKeyPem;
    }



    /**
     * 根据RT用户信息转换成Employee
     *
     * @param iAuthenticationUser
     * @param strSystemId
     * @param strOrgId
     * @return
     * @throws Throwable
     */
    private Employee getEmployee(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId) throws Throwable {
        if (iAuthenticationUser != null) {
            RTAuthenticationUser rtAuthenticationUser = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), RTAuthenticationUser.class);
            Employee employee = new Employee();
            employee.setUserId(rtAuthenticationUser.getUserid());
            employee.setUAAUserId(rtAuthenticationUser.getUserid());
            employee.setUAAUserName(rtAuthenticationUser.getUsername());
            employee.setLoginName(rtAuthenticationUser.getLoginname());
            employee.setPersonName(rtAuthenticationUser.getPersonname());
            employee.setPhone(rtAuthenticationUser.getMobile());
            employee.setUserCode(rtAuthenticationUser.getEmployeeNumber());
            employee.setAddr(rtAuthenticationUser.getPostalAddress());
            employee.setCertCode(rtAuthenticationUser.getIdentificationNumber());
            employee.setEmail(rtAuthenticationUser.getEmail());
            employee.setPostCode(rtAuthenticationUser.getEmployeeType());

            employee.setSrfdcid(rtAuthenticationUser.getDc());
            employee.setDCSystemId(strSystemId);
            if (rtAuthenticationUser.getMemberOf() != null) {
                for (AuthMember authMember : rtAuthenticationUser.getMemberOf()) {
                    if (authMember.getOrganizationId().equals(strOrgId)) {
                        employee.setOrgId(authMember.getOrganizationId());
                        employee.setOrgName(authMember.getOrganizationName());
                        employee.setOrgCode(authMember.getOrganizationNumber());
                        employee.setMDeptId(authMember.getDepartmentId());
                        employee.setMDeptName(authMember.getDepartmentName());
                        employee.setMDeptCode(authMember.getDepartmentNumber());
                        employee.setPostId(authMember.getOrganizationalRoleId());
                        employee.setPostName(authMember.getOrganizationalRoleName());
                    }
                }
            }
            if (!StringUtils.hasLength(employee.getMqttTopic()) && StringUtils.hasLength(strSystemId)) {
                employee.setMqttTopic(getPortalMqttTopic(employee, strSystemId));
            }

            Collection<IUAAGrantedAuthority> getGrantedAuthorities = this.getGrantedAuthorities(iAuthenticationUser, new EmployeeContext(employee, null, strSystemId));
            for (IUAAGrantedAuthority iUAAGrantedAuthority : getGrantedAuthorities) {
                if (iUAAGrantedAuthority instanceof UAARoleAuthority &&
                        ("ROLE_SUPERADMIN".equals(iUAAGrantedAuthority.getAuthority())
                                || "ROLE_APIUSERS".equals(iUAAGrantedAuthority.getAuthority()))
                ) {
                    employee.setSuperUser(1);
                    break;
                }
            }

            //填充上下级单位、部门信息
            fillEmployee(employee);

            return employee;
        }
        return null;
    }

    protected void fillEmployee(Employee employee) throws Throwable {

        if(!ObjectUtils.isEmpty(employee.getOrgId()) && !ObjectUtils.isEmpty(employee.getMDeptId())){
            IWebClientRep<Map> rep = getWebClient(false).post(String.format(RTAuthAgent.RT_ORGINFO_PATH, employee.getOrgId(),employee.getMDeptId()), null, null, null, Collections.emptyMap(), null, Map.class, null);

            if (rep == null || rep.getBody() == null)
                return;

            Map<String, List<String>> orgInfo = rep.getBody();
            List<String> pOrgIds = orgInfo.getOrDefault("organization_parent_ids", Collections.emptyList());
            List<String> sOrgIds = orgInfo.getOrDefault("organization_sub_ids", Collections.emptyList());
            List<String> pDeptIds = orgInfo.getOrDefault("department_parent_ids", Collections.emptyList());
            List<String> sDeptIds = orgInfo.getOrDefault("department_sub_ids", Collections.emptyList());

            if (!ObjectUtils.isEmpty(pOrgIds))
                employee.setPOrgIds(StringUtils.collectionToDelimitedString(pOrgIds, ","));

            if (!ObjectUtils.isEmpty(sOrgIds))
                employee.setSOrgIds(StringUtils.collectionToDelimitedString(sOrgIds, ","));

            if (!ObjectUtils.isEmpty(pDeptIds))
                employee.setPDeptIds(StringUtils.collectionToDelimitedString(pDeptIds, ","));

            if (!ObjectUtils.isEmpty(sDeptIds))
                employee.setSDeptIds(StringUtils.collectionToDelimitedString(sDeptIds, ","));
        }
    }

    public String getPortalMqttTopic(Employee employee, String strSystemId) {
        return (String) this.executeAction("获取机构用户门户Mqtt标题", new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                return onPortalMqttTopic(employee, strSystemId);
            }

        }, null);
    }

    protected String onPortalMqttTopic(Employee employee, String strSystemId) throws Throwable {
        return String.format("/s%1$s/e%2$s", KeyValueUtils.genUniqueId(employee.getDCSystemId()), KeyValueUtils.genUniqueId());
    }

    /**
     * 权限相关
     *
     * @param iAuthenticationUser
     * @param iEmployeeContext
     * @return
     */
    @Override
    protected Collection<IUAAGrantedAuthority> getGrantedAuthorities(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext) {
        return this.executeAction("获取用户授权集合", new IAction() {
            @Override
            public Object execute(Object[] args) throws Throwable {
                return new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iEmployeeContext.getUaausername(), iAuthenticationUser.getToken()))
                        .tags(CloudCacheTagUtils.getUserAuthoritiesTag(iEmployeeContext.getDcsystemid()))
                        .expire(iAuthenticationUser.getExpirein())
                        .action(new IAction() {
                            @Override
                            public Object execute(Object[] args) throws Throwable {
                                List<IUAAGrantedAuthority> authorities = new ArrayList<>();
                                if (iAuthenticationUser != null) {
                                    RTAuthenticationUser rtAuthenticationUser = getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(iAuthenticationUser.getUsername()), RTAuthenticationUser.class);
                                    List<AuthGrantedSystem> grants = rtAuthenticationUser.getGrants();
                                    Set<String> roles = new HashSet<>();
                                    roles.add("ROLE_USERS");
                                    if (CollectionUtils.isNotEmpty(grants)) {
                                        for (AuthGrantedSystem authGrantedSystem : grants) {
                                            if (CollectionUtils.isNotEmpty(authGrantedSystem.getRoles())) {
                                                for (AuthGrantedRole authGrantedRole : authGrantedSystem.getRoles()) {
                                                    if (StringUtils.hasLength(authGrantedRole.getRoleId()))
                                                        roles.add(authGrantedRole.getRoleId());
                                                    if (StringUtils.hasLength(authGrantedRole.getAuthority())) {
                                                        UAARoleAuthority roleAuthority = new UAARoleAuthority();
                                                        roleAuthority.setAuthority(authGrantedRole.getAuthority());
                                                        roleAuthority.setSystemid(authGrantedSystem.getSystemId());
                                                        authorities.add(roleAuthority);
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    List params = new ArrayList();
                                    params.add(iEmployeeContext.getDcsystemid());
                                    params.add(roles);
                                    params.add(iEmployeeContext.getUserid());
                                    UserContext.setCurrent(iEmployeeContext);
                                    //查询权限
                                    List<PermissionDTO> permissions = EBSXSystemRuntime.getInstance().getPermissionService().executeSelectSQL(QUERY_PERMISSION, params);
                                    if(CollectionUtils.isNotEmpty(permissions)) {
                                        //查询权限操作标识
                                        List<PermissionActionDTO> actions = EBSXSystemRuntime.getInstance().getPermissionActionService().executeSelectSQL(QUERY_PERMISSIONACTION, params);
                                        for (PermissionDTO permission : permissions) {
                                            if (permission.getPermissionType().equals(PermissionType.OPPRIV.toString())) {
                                                UAADEAuthority authority = new UAADEAuthority();
                                                authority.setSystemid(permission.getPSSystemId());
                                                authority.setName(permission.getPermissionName());
                                                authority.setEntity(permission.getEntityName());
                                                authority.setIsAllData(permission.getIsAllData());
                                                authority.setEnableorgdr(permission.getEnableOrgDR());
                                                authority.setEnabledeptdr(permission.getEnableDeptDR());
                                                authority.setEnabledeptbc(permission.getEnableDeptBC());
                                                authority.setOrgdr(permission.getOrgDR());
                                                authority.setDeptdr(permission.getDeptDR());
                                                authority.setDeptbc(permission.getDeptBC());
                                                authority.setBscope(permission.getBScope());
                                                authority.setDeAction(actions.stream().filter(f -> f.getPermissionId().equals(permission.getPermissionId())).map(m -> {
                                                    Map<String, String> action = new HashMap<>();
                                                    if (!ObjectUtils.isEmpty(m.getOPPriv())) {
                                                        action.put(m.getOPPriv(), ObjectUtils.isEmpty(m.getBScope()) ? "" : m.getBScope());
                                                    }
                                                    return action;
                                                }).collect(Collectors.toList()));
                                                authorities.add(authority);
                                            } else if (permission.getPermissionType().equals(PermissionType.APPMENU.toString())) {
                                                //
                                            } else if (permission.getPermissionType().equals(PermissionType.UNIRES.toString())) {
                                                UAAUniResAuthority authority = new UAAUniResAuthority();
                                                authority.setSystemid(permission.getPSSystemId());
                                                authority.setName(permission.getPermissionName());
                                                authority.setAuthority(permission.getPermissionTag());
                                                authorities.add(authority);
                                            }
                                        }
                                    }
                                }

                                return authorities;
                            }

                        }).build().get(new TypeReference<Collection<IUAAGrantedAuthority>>() {
                        });
            }
        }, null, new TypeReference<Collection<IUAAGrantedAuthority>>() {
        });
    }

    /**
     * 注销
     *
     * @param iAuthenticationUser
     */
    @Override
    protected void onResetUser(IAuthenticationUser iAuthenticationUser) {
        try {
            this.executeAction("重置用户状态", new IAction() {
                @Override
                public Object execute(Object[] args) throws Throwable {
                    new CacheableActionBuilder(getSysCacheUtilRuntime(), CloudCacheTagUtils.getAuthenticationUserCat(iAuthenticationUser.getUsername(), iAuthenticationUser.getToken()))
                            .action(new IAction() {
                                @Override
                                public Object execute(Object[] args) throws Throwable {
                                    resetRT(iAuthenticationUser);
                                    return null;
                                }
                            }).build().remove();
                    return null;
                }
            }, null);

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * RT注销相关操作
     *
     * @param iAuthenticationUser
     * @throws Throwable
     */
    public void resetRT(IAuthenticationUser iAuthenticationUser) throws Throwable {
        try {
            Map header = new HashMap();
            header.put("Authorization", "Bearer " + iAuthenticationUser.getToken());
            getWebClient(false).post(String.format(RTAuthAgent.RT_LOGOUT_PATH, iAuthenticationUser.getUsername()), null, header, null);

            Map body = new HashMap();
            header.put("login_name", iAuthenticationUser.getUsername());
            getWebClient(false).post(RTAuthAgent.RT_CACHE_EVICT_PATH, null, body);
        } catch (Exception e) {
            log.warn(String.format("RT注销发生异常：%s", e.getMessage()));
        }
    }


    /**
     * 刷新token
     *
     * @param strToken
     * @param nTokenExpiration
     * @return
     * @throws Throwable
     */
    @Override
    protected AuthenticationInfo onRefreshToken2(String strToken, long nTokenExpiration) throws Throwable {
        IWebClientRep<AuthLoginResponse> rep = getWebClient(false).get(String.format(RTAuthAgent.RT_REFRESH_TOKEN_PATH, strToken), null, null, null, AuthLoginResponse.class, null);
        if (rep!=null && rep.getBody() != null) {
            String strNewToken = rep.getBody().getToken();
            String strRefreshToken = rep.getBody().getRefreshToken();
            Integer expiresIn = rep.getBody().getExpiresIn();
            final ISysCacheUtilRuntime iSysCacheUtilRuntime = this.getSysCacheUtilRuntime(true);
            if (iSysCacheUtilRuntime != null) {
                ISysUAAUtilRuntime iSysUAAUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysUAAUtilRuntime.class, false);
                String username = iSysUAAUtilRuntime.getUsernameFromToken(strNewToken);
                RTAuthenticationUser rtAuthenticationUser = this.getSysCacheUtilRuntime().get(CloudCacheTagUtils.getAuthenticationUserTag(username), RTAuthenticationUser.class);
                if (rtAuthenticationUser != null) {
                    //重置之前token
                    //iSysCacheUtilRuntime.resetAll(CloudCacheTagUtils.getAuthenticationUserCat(username, rtAuthenticationUser.getToken()));
                }
                iSysCacheUtilRuntime.set(CloudCacheTagUtils.getAuthenticationUserCat(username, strNewToken),
                        ISysUAAUtilRuntime.AUTHENTICATIONUSERCAT_UAATOKEN, strNewToken, expiresIn);
                if (rtAuthenticationUser != null) {
                    rtAuthenticationUser.setToken(strNewToken);
                    rtAuthenticationUser.setExpirein(expiresIn);
                    this.getSysCacheUtilRuntime().set(CloudCacheTagUtils.getAuthenticationUserTag(username), rtAuthenticationUser, expiresIn);
                }
            }
            return new AuthenticationInfo(strNewToken, expiresIn, null, strRefreshToken);
        }
        throw new RuntimeException("刷新Token错误，RT未正确返回");
    }



    private IWebClient iWebClient = null;

    protected IWebClient getWebClient(boolean bTryMode) {
        if (this.iWebClient != null || bTryMode) {
            return this.iWebClient;
        }
        throw new SystemRuntimeException(this.getSystemRuntime(), "未指定Web客户端对象");
    }

    protected void setWebClient(IWebClient iWebClient) {
        this.iWebClient = iWebClient;
    }

    protected void prepareWebClient() throws Exception {
        IWebClient iWebClient = this.getSystemRuntime().createWebClient(RTAuthAgent.RT_SERVICE);
        iWebClient.init(this.getSystemRuntime(), RTAuthAgent.RT_SERVICE, null);
        this.setWebClient(iWebClient);
    }
}
