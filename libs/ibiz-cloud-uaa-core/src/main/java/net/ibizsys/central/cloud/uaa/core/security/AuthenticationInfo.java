package net.ibizsys.central.cloud.uaa.core.security;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.central.cloud.core.util.domain.AppData;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class AuthenticationInfo implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String token;
    private AppData appdata;
    private int expirein = 0;
    private String refresh_token;
    
    public AuthenticationInfo() {

    }
    
//    public AuthenticationInfo(String token, AppData appdata) {
//    	this.token = token;
//    	this.appdata = appdata;
//    }

    public AuthenticationInfo(String token, int expirein, AppData appdata, String refresh_token) {
		this.token = token;
		this.appdata = appdata;
		this.expirein = expirein;
		this.refresh_token = refresh_token;
	}

    
    
    public AuthenticationInfo(String token, int expirein, AppData appdata) {
    	this.token = token;
    	this.appdata = appdata;
    	this.expirein = expirein;
    }
    
	public String getToken() {
		return token;
	}
	

	public void setToken(String token) {
		this.token = token;
	}

	public AppData getAppdata() {
		return appdata;
	}

	public void setAppdata(AppData appdata) {
		this.appdata = appdata;
	}
    
	public int getExpirein() {
		return this.expirein;
	}
	
	
	public void setExpirein(int nExpirein) {
		this.expirein = nExpirein;
	}

	protected String getRefresh_token() {
		return refresh_token;
	}

	protected void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	
	
    
}
