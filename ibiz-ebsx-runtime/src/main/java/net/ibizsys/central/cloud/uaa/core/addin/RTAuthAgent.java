package net.ibizsys.central.cloud.uaa.core.addin;

import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.core.security.RTAuthenticationUser;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthGrantedRole;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthGrantedSystem;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthInfo;
import net.ibizsys.central.cloud.uaa.core.addin.dto.AuthLoginResponse;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.LogLevels;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 远端Http认证服务
 *
 * @author lionlau
 */
public class RTAuthAgent extends AuthAgentBase implements IHttpAuthAgent {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTAuthAgent.class);

    public static String RT_SERVICE = "lb://uaa-api";
    public static String RT_LOGIN_PATH = "/auths/login";
    private String RT_LOGIN_FORWARD_HEARDER = "captcha-state|state,captcha-code|code,state|state";
    public static String RT_OAUTH_TOKEN_PATH = "/oauth/token";
    public static String RT_OAUTH_USERINFO_PATH = "/auths/loginbycode";
    public static String RT_CHANGE_PWD_PATH = "/auths/change_pwd";
    public static String RT_REFRESH_TOKEN_PATH = "auths/%s/refresh_token";
    public static String RT_AUTHORIZE_PATH = "/open_accesses/{openaccessid}/getauthorizationuri";
    public static String RT_USERINFO_PATH = "/auths/%s/loaduserandtokenbyusername";
    public static String RT_ORGINFO_PATH = "/auths/%s/%s/orginfo";

    public static String RT_LOGOUT_PATH = "/auths/%s/logout";

    public static String RT_CACHE_EVICT_PATH = "/auths/cache_evict";

    private IWebClient iWebClient = null;

    @Override
    protected void onInit() throws Exception {
        super.onInit();
        if (!StringUtils.hasLength(this.getServiceUrl())) {
            throw new Exception("未定义RT认证服务路径");
        } else {
            if (getWebClient(true) == null) {
                this.prepareWebClient();
                if (this.getWebClient(true) == null) {
                    throw new Exception(String.format("Web客户端对象对象无效"));
                }
            }
        }
    }

    @Override
    protected void onPrepareDefaultSetting() throws Exception {
        super.onPrepareDefaultSetting();
        if (this.getConfigEntity(true) != null) {
            this.setServiceUrl(this.getConfigEntity().getString("serviceurl", RT_SERVICE));
            this.setAccessTokenUrl(this.getConfigEntity().getString("accesstokenurl", RT_LOGIN_PATH));
            RT_LOGIN_FORWARD_HEARDER = this.getConfigEntity().getString("forwardheader", RT_LOGIN_FORWARD_HEARDER);
        } else {
            this.setServiceUrl(RT_SERVICE);
            this.setAccessTokenUrl(RT_LOGIN_PATH);
        }

    }

    @Override
    protected boolean isPrepareSysCloudClientUtilRuntime() {
        return true;
    }

    @Override
    protected AuthenticationUser onGetUserByName(String srfsystem, String srforgid, String username, boolean bTryMode) throws Throwable {
        String strUserName = null;
        try {
            IWebClientRep<AuthLoginResponse> rep = null;
            if (username.startsWith("oauth__")) {
                return null;
            } else {


                rep = getWebClient(false).post(String.format(RT_USERINFO_PATH,username), null, null, null, null, null, AuthLoginResponse.class, null);
            }
            if (rep.getBody() != null) {
                AuthLoginResponse authLoginResponse = rep.getBody();
                RTAuthenticationUser authenticationUser = new RTAuthenticationUser();
                authenticationUser.setUserid(authLoginResponse.getUser().getId());
                authenticationUser.setUsername(authLoginResponse.getUser().getUsername());
                authenticationUser.setDc(authLoginResponse.getUser().getDc());
                authenticationUser.setLoginname(username);
                authenticationUser.setPersonname(authLoginResponse.getUser().getDisplayName());
                authenticationUser.setEmail(authLoginResponse.getUser().getMail());
                authenticationUser.setEmployeeNumber(authLoginResponse.getUser().getEmployeeNumber());
                authenticationUser.setEmployeeType(authLoginResponse.getUser().getEmployeeType());
                authenticationUser.setTitle(authLoginResponse.getUser().getTitle());
                authenticationUser.setTelephoneNumber(authLoginResponse.getUser().getTelephoneNumber());
                authenticationUser.setIdentificationNumber(authLoginResponse.getUser().getIdentificationNumber());
                authenticationUser.setPostalAddress(authLoginResponse.getUser().getPostalAddress());
                authenticationUser.setMobile(authLoginResponse.getUser().getMobile());
                authenticationUser.setToken(authLoginResponse.getToken());
                authenticationUser.setRefreshtoken(authLoginResponse.getRefreshToken());
                authenticationUser.setExpirein(authLoginResponse.getExpiresIn());
                authenticationUser.setPassword(null);
                authenticationUser.setMemberOf(authLoginResponse.getUser().getMemberOf());
                authenticationUser.setGrants(authLoginResponse.getUser().getGrants());
                authenticationUser.setRefreshtoken(authLoginResponse.getRefreshToken());
                if (authLoginResponse.getUser().getGrants() != null) {
                    for (AuthGrantedSystem authGrantedSystem : authLoginResponse.getUser().getGrants()) {
                        if (authGrantedSystem.getRoles() != null)
                            for (AuthGrantedRole authGrantedRole : authGrantedSystem.getRoles()) {
                                if ("ROLE_APIUSERS".equals(authGrantedRole.getRoleId())) {
                                    authenticationUser.setApiuser(1);
                                }
                                if ("ROLE_SUPERADMIN".equals(authGrantedRole.getRoleId())) {
                                    authenticationUser.setSuperuser(1);
                                }
                            }
                    }
                }

                return authenticationUser;
            }
        } catch (Throwable ex) {
            log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
        }

        return this.getAuthenticationUser(strUserName, bTryMode);
    }

    @Override
    public AuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) {
        try {
            AuthenticationUser authenticationUser = this.onGetUserByLogin(srfsystem, srforgid, username, password, bTryMode);
            return authenticationUser;
        }
        catch(Throwable ex) {
            log.error(String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
            this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
            if(ex instanceof ISystemRuntimeException) {
                throw (RuntimeException)ex;
            }
            if(ex instanceof PasswordPolicyException) {
                throw (PasswordPolicyException)ex;
            }
            throw new SystemRuntimeException(this.getSystemRuntime(), this.getCloudAuthUtilRuntime(), String.format("认证代理[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
        }
    }

    @Override
    protected AuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password, boolean bTryMode) throws Throwable {

        String strUserName = null;
        try {
            IWebClientRep<AuthLoginResponse> rep = null;
            if (username.startsWith("oauth__")) {
                username = username.substring(7);
                Map queries = new HashMap();
                queries.put("grant_type", "client_credentials");
                queries.put("client_id", username);
                queries.put("client_secret", password);
                rep = getWebClient(false).post(RT_OAUTH_TOKEN_PATH, null, null, queries, null, null, AuthLoginResponse.class, null);
            } else {
                Map<String, Object> params = new LinkedHashMap<>();
                params.put("loginname", username);
                params.put("password", password);
                String apiuser = this.getSystemRuntime().getSystemRuntimeSetting().getParam(ISysCloudClientUtilRuntime.CLOUDCLIENTUTIL_CONFIGFOLDER + ".clientid", null);
                //api用户登录重新获取
                if (StringUtils.hasLength(apiuser) && apiuser.equals(username)) {
                    params.put("focus_refresh_token", true);
                }

                //补充header参数转发给uaa
                if (RequestContextHolder.getRequestAttributes() != null) {
                    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                    if (request != null) {
                        Enumeration<String> headerNames = request.getHeaderNames();
                        List<String> forwardHeaders = Arrays.asList(RT_LOGIN_FORWARD_HEARDER.split(","));
                        while (headerNames.hasMoreElements()) {
                            String name = headerNames.nextElement();
                            for (String forwardHeader : forwardHeaders) {
                                String[] forwardParams = forwardHeader.split("\\|");
                                if(forwardParams[0].equalsIgnoreCase(name)){
                                    params.put(forwardParams[forwardParams.length-1], request.getHeader(name));
                                }
                            }
                        }
                    }
                }

                rep = getWebClient(false).post(this.getAccessTokenUrl(), null, null, null, params, null, AuthLoginResponse.class, null);
            }
            if (rep.getBody() != null) {
                AuthLoginResponse authLoginResponse = rep.getBody();
                RTAuthenticationUser authenticationUser = genRTUser(username,authLoginResponse);
                //补充认证日志
                if(true) {
                    User user = new User();
                    user.setUserId(authenticationUser.getUserid());
                    user.setUserName(authenticationUser.getUsername());
                    user.setPersonName(authenticationUser.getPersonname());
                    user.setApiUser(authenticationUser.getApiuser());

                    this.getCloudSaaSUtilRuntime().logAuthInfo(user, this.getName());
                }
                return authenticationUser;
            }
        } catch (Throwable ex) {
            log.error(String.format("认证发生异常， %1$s", ex.getMessage()), ex);
            throw new PasswordPolicyException(ex.getMessage());
        }

        return this.getAuthenticationUser(strUserName, bTryMode);
    }

    public static RTAuthenticationUser genRTUser(String username, AuthLoginResponse authLoginResponse)  {
        RTAuthenticationUser authenticationUser = new RTAuthenticationUser();
        authenticationUser.setUserid(authLoginResponse.getUser().getId());
        authenticationUser.setUsername(authLoginResponse.getUser().getUsername());
        authenticationUser.setDc(authLoginResponse.getUser().getDc());
        authenticationUser.setLoginname(username);
        authenticationUser.setPersonname(authLoginResponse.getUser().getDisplayName());
        authenticationUser.setEmail(authLoginResponse.getUser().getMail());
        authenticationUser.setEmployeeNumber(authLoginResponse.getUser().getEmployeeNumber());
        authenticationUser.setEmployeeType(authLoginResponse.getUser().getEmployeeType());
        authenticationUser.setTitle(authLoginResponse.getUser().getTitle());
        authenticationUser.setTelephoneNumber(authLoginResponse.getUser().getTelephoneNumber());
        authenticationUser.setIdentificationNumber(authLoginResponse.getUser().getIdentificationNumber());
        authenticationUser.setPostalAddress(authLoginResponse.getUser().getPostalAddress());
        authenticationUser.setMobile(authLoginResponse.getUser().getMobile());
        authenticationUser.setToken(authLoginResponse.getToken());
        authenticationUser.setRefreshtoken(authLoginResponse.getRefreshToken());
        authenticationUser.setExpirein(authLoginResponse.getExpiresIn());
        authenticationUser.setPassword(null);
        authenticationUser.setMemberOf(authLoginResponse.getUser().getMemberOf());
        authenticationUser.setGrants(authLoginResponse.getUser().getGrants());
        authenticationUser.setRefreshtoken(authLoginResponse.getRefreshToken());
        if (authLoginResponse.getUser().getGrants() != null) {
            for (AuthGrantedSystem authGrantedSystem : authLoginResponse.getUser().getGrants()) {
                if (authGrantedSystem.getRoles() != null)
                    for (AuthGrantedRole authGrantedRole : authGrantedSystem.getRoles()) {
                        if ("ROLE_APIUSERS".equals(authGrantedRole.getRoleId())) {
                            authenticationUser.setApiuser(1);
                        }
                        if ("ROLE_SUPERADMIN".equals(authGrantedRole.getRoleId())) {
                            authenticationUser.setSuperuser(1);
                        }
                    }
            }
        }
        return authenticationUser;
    }

    @Override
    protected boolean onChangePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword, boolean bTryMode) throws Throwable {
        //修改密码
        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("password", oldpassword);
        params.put("new_password", newpassword);

        Map header = new HashMap();
        header.put("Authorization", "Bearer " + iAuthenticationUser.getToken());

        //补充header参数转发给uaa
        if (RequestContextHolder.getRequestAttributes() != null) {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            if (request != null) {
                Enumeration<String> headerNames = request.getHeaderNames();
                List<String> forwardHeaders = Arrays.asList(RT_LOGIN_FORWARD_HEARDER.split(","));
                while (headerNames.hasMoreElements()) {
                    String name = headerNames.nextElement();
                    for (String forwardHeader : forwardHeaders) {
                        String[] forwardParams = forwardHeader.split("\\|");
                        if(forwardParams[0].equalsIgnoreCase(name)){
                            params.put(forwardParams[forwardParams.length-1], request.getHeader(name));
                        }
                    }
                }
            }
        }

        try {
            getWebClient(false).post(RT_CHANGE_PWD_PATH, null, header, null, params, null, String.class, null);
        }
        catch (Throwable ex) {
            throw new PasswordPolicyException(ex.getMessage());
        }

        return true;
    }

    protected IWebClient getWebClient() {
        return this.getWebClient(false);
    }

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
        String strServiceUrl = this.getServiceUrl();
        IWebClient iWebClient = this.getSystemRuntime().createWebClient(strServiceUrl);
        iWebClient.init(this.getSystemRuntime(), strServiceUrl, null);
        this.setWebClient(iWebClient);
    }

    @Override
    public String getName() {
        return "RT-UAA";
    }
}
