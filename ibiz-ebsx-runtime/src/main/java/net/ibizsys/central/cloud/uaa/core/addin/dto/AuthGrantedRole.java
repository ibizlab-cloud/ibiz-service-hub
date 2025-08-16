/**
 * Generate code from /{{projectName}}-core/src/main/java/{{packageName}}/core/{{modules}}/domain/{{entities@NONE}}.java.hbs
 */
package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.annotation.*;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.*;

/**
 * 授权角色实体类[AuthGrantedRole]
 *
 * @author generator
 */
@JsonIgnoreProperties(value = "handler")
@ApiModel(value = "AUTH_GRANTED_ROLE", description = "授权角色")
public class AuthGrantedRole implements Serializable
{

    /**
     * 角色标识
     */
    @Id
    @JsonProperty("role_id")
    @ApiModelProperty(value = "role_id", notes = "角色标识")
    private String roleId;

    /**
     * 角色名
     */
    @JsonProperty("display_name")
    @ApiModelProperty(value = "display_name", notes = "角色名")
    private String displayName;

    /**
     * 角色代码标记
     */
    @JsonProperty("authority")
    @ApiModelProperty(value = "authority", notes = "角色代码标记")
    private String authority;

    /**
     * 授权清单
     */
    @JsonProperty("authorities")
    @ApiModelProperty(value = "authorities", notes = "授权清单")
    private List<AuthGranted> authorities;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public List<AuthGranted> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthGranted> authorities) {
        this.authorities = authorities;
    }
}