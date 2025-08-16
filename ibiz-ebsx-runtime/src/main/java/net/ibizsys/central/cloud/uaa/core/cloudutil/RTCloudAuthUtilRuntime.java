package net.ibizsys.central.cloud.uaa.core.cloudutil;


import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.PasswordPolicyException;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.uaa.core.addin.IAuthAgent;
import net.ibizsys.central.cloud.uaa.core.addin.IAuthProvider;
import net.ibizsys.central.cloud.uaa.core.addin.ICloudAuthUtilRTAddin;
import net.ibizsys.central.cloud.uaa.core.addin.RTAuthProvider;
import net.ibizsys.runtime.ISystemRuntimeException;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.LogCats;
import net.ibizsys.runtime.util.LogLevels;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RTCloudAuthUtilRuntime extends DefaultCloudAuthUtilRuntime implements ICloudAuthUtilRuntime {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTCloudAuthUtilRuntime.class);

    static {
        RuntimeObjectFactory.getInstance().registerObjectIf(ICloudAuthUtilRTAddin.class, "AUTHPROVIDER:RT", RTAuthProvider.class.getCanonicalName());
    }


    @Override
    protected void onReloadConfig(String strConfig) throws Throwable {
        Map<String, String> config = null;
        if (StringUtils.hasLength(strConfig)) {
            Yaml yaml = new Yaml();
            config = yaml.loadAs(strConfig, Map.class);
        } else {
            config = new LinkedHashMap<String, String>();
        }

        Object objPasswordPolicy = config.get("password-policy");
        if (objPasswordPolicy instanceof Map) {
            Map passwordPolicyMap = (Map) objPasswordPolicy;
            String strPasswordPolicy = (String) passwordPolicyMap.get("regex");
            String strPasswordPolicyInfo = (String) passwordPolicyMap.get("info");
            if (StringUtils.hasLength(strPasswordPolicy)) {
                Pattern p = Pattern.compile(strPasswordPolicy);
                this.setPasswordPolicy(p);
                this.setPasswordPolicyInfo(strPasswordPolicyInfo);
            }
        } else {
            this.setPasswordPolicy(null);
            this.setPasswordPolicyInfo(null);
        }

        List<String> agentList = new ArrayList<String>();
        Object objAgents = config.get("agents");
        if (objAgents instanceof List) {
            List list = (List) objAgents;
            for (Object objItem : list) {
                if (ObjectUtils.isEmpty(objItem)) {
                    continue;
                }
                agentList.add(objItem.toString());
            }
        }

        if (ObjectUtils.isEmpty(agentList)) {
            agentList.add("RT");
        }

        List<IAuthAgent> authAgentList = new ArrayList<IAuthAgent>();
        for (String strAgent : agentList) {
            String[] items = strAgent.split("[:]");
            String strAgentType = items[0];
            String strAgentId = items[0];

            if (items.length > 1) {
                strAgentType = items[1];
            }

            //获取插件
            IAuthProvider iAuthProvider = this.getAddinRepo().getAddin(IAuthProvider.class, "AUTHPROVIDER:" + strAgentType.toUpperCase(), true);
            if (iAuthProvider == null) {
                log.warn(String.format("无法获取认证方式[%1$s]提供者", strAgentType.toUpperCase()));
                continue;
            }

            //读取配置
            String strAgentConfigId = String.format("%1$s-agent-%2$s", this.getCloudConfigId(), strAgentId).toLowerCase();
            String strAgentConfig = ServiceHub.getInstance().getConfig(strAgentConfigId);
            IAuthAgent iAuthAgent = iAuthProvider.createAuthAgent(strAgentConfig);
            iAuthAgent.init(this.getModelRuntimeContext(), strAgentId, strAgentConfig);
            authAgentList.add(iAuthAgent);

            this.getSystemRuntime().log(LogLevels.DEBUG, this.getLogCat(), String.format("认证代理[%1$s][%2$s]加载完成", strAgentId, strAgentType), null);
        }

        if (CollectionUtils.isEmpty(authAgentList)) {
            throw new Exception(String.format("无法获取认证方式提供者"));
        }
        this.setAuthAgentList(authAgentList);
    }


    @Override
    public IAuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username, String password) {

        this.testPasswordPolicy(password);



        try {
            IAuthenticationUser authenticationUser = this.onGetUserByLogin(srfsystem, srforgid, username, password);

            this.getSystemRuntime().logAudit(LogLevels.INFO, LogCats.AUDIT_LOGIN, String.format("用户[%1$s]登录", username), authenticationUser.getUserid(), "", "");

            return authenticationUser;
        }
        catch(Throwable ex) {

            this.getSystemRuntime().logAudit(LogLevels.ERROR, LogCats.AUDIT_LOGINFAILED, String.format("用户[%1$s]登录失败", username), "", "", "");

            log.error(String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), ex);
            this.getSystemRuntime().log(LogLevels.ERROR, this.getLogCat(), String.format("系统认证功能组件[%1$s]认证用户发生异常，%2$s", this.getName(), ex.getMessage()), null);
            if(ex instanceof ISystemRuntimeException) {
                throw (RuntimeException)ex;
            }
            if(ex instanceof PasswordPolicyException) {
                throw (RuntimeException)ex;
            }
            throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("认证用户发生异常，%1$s", ex.getMessage()), ex);
        }


    }

    @Override
    protected IAuthenticationUser onGetUserByLogin(String srfsystem, String srforgid, String username, String password) throws Throwable {

        if (!StringUtils.hasLength(username))
            throw new UsernameNotFoundException("用户名为空");

        List<IAuthAgent> authAgentList = this.getAuthAgentList();
        if (authAgentList != null) {
            for (IAuthAgent iAuthAgent : authAgentList) {
                try {
                    IAuthenticationUser authenticationUser = iAuthAgent.getUserByLogin(srfsystem, srforgid, username, password, true);
                    if (authenticationUser != null) {
                        return authenticationUser;
                    }
                } catch (Exception e) {
                    log.warn(String.format("认证方式[%1$s]提供者 认证用户[%2$s]失败：%3$s", iAuthAgent.getName(), username, e.getMessage()));
                    throw e;
                }
            }
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

}
