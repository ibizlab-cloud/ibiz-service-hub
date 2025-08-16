package net.ibizsys.central.cloud.uaa.core.spring.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationInfo;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IAuthenticationUserRuntime;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.uaa.core.IUAAUtilSystemRuntime;
import net.ibizsys.central.cloud.uaa.core.cloudutil.RTJWTCloudUAAUtilRuntime;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("")
public class UAAOAuthRestController {

    private static final Log log = LogFactory.getLog(UAAOAuthRestController.class);

    @Autowired
    private IServiceHub iServiceHub;

    private ICloudUAAUtilRuntime iCloudUAAUtilRuntime = null;

    private ICloudAuthUtilRuntime iCloudAuthUtilRuntime = null;

    @PostConstruct
    protected void postConstruct() {
        iServiceHub.registerIgnoreAuthPattern("/uaa/publickey,/uaa/publickeypem");
        if (this.iCloudAuthUtilRuntime == null) {
            iServiceHub.requireCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudAuthUtilRuntime.class);
        }
        if (this.iCloudUAAUtilRuntime == null) {
            iServiceHub.requireCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class);
        }
    }

    /**
     * 获取开放平台授权地址
     * @param openAccessId
     * @param redirectUri
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "uaa/open/oauth2-{openaccessid}/authorize")
    public ResponseEntity<String> openAuthAuthorize(@PathVariable(value = "openaccessid") String openAccessId, @RequestParam(value = "redirect_uri" , required = false) String redirectUri) throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String srfdcsystem = request.getHeader("srfdcsystem");
        request.getParameter("");
        if("undefined".equals(srfdcsystem)){
            srfdcsystem = null;
        }
        try {
            ObjectNode openAccessInfo = getCloudUAAUtilRuntime().getOpenAccessInfo(srfdcsystem, null, openAccessId);
            return ResponseEntity.ok().body(openAccessInfo.get("redirect_uri").textValue());
        } catch (Throwable ex) {
            log.error(ex);
            throw new RuntimeException("获取开放平台授权地址出现错误");
        }
    }


    @GetMapping(value = "/uaa/publickeypem")
    public ResponseEntity<String> getPublicKey() {
        String key = "";
        if (this.getCloudUAAUtilRuntime() instanceof RTJWTCloudUAAUtilRuntime)
            key = ((RTJWTCloudUAAUtilRuntime)this.getCloudUAAUtilRuntime()).getPublicKeyPem();
        return ResponseEntity.ok().body(key);
    }


    /**
     * 开放平台登录
     * @param openAccessId
     * @param code
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "uaa/open/oauth2-{openaccessid}/auth/{code}")
    public ResponseEntity<AuthenticationInfo> openAuthCodeLogin(@PathVariable(value = "openaccessid") String openAccessId, @PathVariable(value = "code") String code) throws Exception {

        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String srfdcsystem = request.getHeader("srfdcsystem");
        if("undefined".equals(srfdcsystem)){
            srfdcsystem = null;
        }

        try {
            IAuthenticationUser user = getCloudUAAUtilRuntime().getUserByOpenAuthCode(srfdcsystem, "", code , openAccessId);
            final AuthenticationInfo authenticationInfo = getCloudUAAUtilRuntime().generateToken2(user);
            final String token = authenticationInfo.getToken();
            if (user.getExpirein() <= 0) {
                if (user instanceof IAuthenticationUserRuntime) {
                    ((IAuthenticationUserRuntime) user).setExpirein(getCloudUAAUtilRuntime().getExpireInFromToken(token));
                }
            }
            AppData appdata = null;
            return ResponseEntity.ok().body(new AuthenticationInfo(token, user.getExpirein(), appdata, authenticationInfo.getRefresh_token()));
        } catch (Throwable ex) {
            log.error(ex);
            throw new RuntimeException("用户名或密码错误");
        }
    }


    protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
        if (this.iCloudUAAUtilRuntime == null) {
            try {
                this.iCloudUAAUtilRuntime = iServiceHub.getCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudUAAUtilRuntime.class, false);
            } catch (Throwable ex) {
                log.error(String.format("获取Cloud体系UAA功能模块发生异常，$1%s", ex.getMessage()), ex);
                throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系UAA功能模块"), ex);
            }
        }
        return this.iCloudUAAUtilRuntime;
    }

    protected ICloudAuthUtilRuntime getCloudAuthUtilRuntime() {
        if (this.iCloudAuthUtilRuntime == null) {
            try {
                this.iCloudAuthUtilRuntime = iServiceHub.getCloudUtilRuntime(IUAAUtilSystemRuntime.class, ICloudAuthUtilRuntime.class, false);
            } catch (Throwable ex) {
                log.error(String.format("获取Cloud体系认证功能模块发生异常，$1%s", ex.getMessage()), ex);
                throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud体系认证功能模块"), ex);
            }
        }
        return this.iCloudAuthUtilRuntime;
    }

}
