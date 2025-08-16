package net.ibizsys.central.cloud.uaa.core.security;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = false)
public class AuthorizationLogin
{

    private String domain;

    private String loginname;

    private String password;

    private String mode;
    
    private Boolean rememberme;
    
    public String getUsername() {
        if(!StringUtils.isEmpty(domain))
            return loginname+"|"+domain;
        return loginname;
    }
    

    public String getDomain() {
		return domain;
	}




	public void setDomain(String domain) {
		this.domain = domain;
	}




	public String getLoginname() {
		return loginname;
	}




	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}
	

	public Boolean getRememberme() {
		return rememberme;
	}


	public void setRememberme(Boolean rememberme) {
		this.rememberme = rememberme;
	}



	@Override
    public String toString()
    {
        return "AuthorizationLogin{" +
                "domain='" + domain + '\'' +
                ", loginname='" + loginname + '\'' +
                ", password='××××××'}";
    }
}
