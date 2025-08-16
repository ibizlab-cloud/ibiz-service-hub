package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 认证接口[AuthLoginResponseDTO]
 *
 * @author generator
 */
@ApiModel("认证接口DTO")
public class AuthLoginResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * token类型
     */
    @JsonProperty("token_type")
    @ApiModelProperty(value = "token类型", position = 0)
    private String tokenType;

    /**
     * access_token
     */
    @JsonProperty("access_token")
    @ApiModelProperty(value = "access_token", position = 1)
    private String accessToken;

    /**
     * token
     */
    @JsonProperty("token")
    @ApiModelProperty(value = "token", position = 2)
    private String token;

    /**
     * 用户信息
     */
    @JsonProperty("user")
    @ApiModelProperty(value = "用户信息", position = 3)
    private AuthInfo user;

    /**
     * 范围
     */
    @JsonProperty("scope")
    @ApiModelProperty(value = "范围", position = 4)
    private String scope;

    /**
     * token_id
     */
    @JsonProperty("token_id")
    @ApiModelProperty(value = "token_id", position = 5)
    private String tokenId;

    /**
     * 过期时间
     */
    @JsonProperty("expiration")
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "过期时间", position = 6)
    private Long expiration;

    /**
     * 过期剩余秒数
     */
    @JsonProperty("expires_in")
    @ApiModelProperty(value = "过期剩余秒数", position = 7)
    private Integer expiresIn;

    /**
     * refresh_token
     */
    @JsonProperty("refresh_token")
    @ApiModelProperty(value = "refresh_token", position = 8)
    private String refreshToken;


    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthInfo getUser() {
        return user;
    }

    public void setUser(AuthInfo user) {
        this.user = user;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
