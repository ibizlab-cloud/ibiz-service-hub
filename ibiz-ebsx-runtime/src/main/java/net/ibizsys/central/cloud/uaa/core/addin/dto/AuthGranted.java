/**
 * Generate code from /{{projectName}}-core/src/main/java/{{packageName}}/core/{{modules}}/domain/{{entities@NONE}}.java.hbs
 */
package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.annotation.*;
import java.io.Serializable;
import io.swagger.annotations.*;

/**
 * 授权对象实体类[AuthGranted]
 *
 * @author generator
 */
@JsonIgnoreProperties(value = "handler")
@ApiModel(value = "AUTH_GRANTED", description = "授权对象")
public class AuthGranted implements Serializable
{

    /**
     * 资源符
     */
    @Id
    @JsonProperty("authority")
    @ApiModelProperty(value = "authority", notes = "资源符")
    private String authority;

    /**
     * 权限类型
     */
    @JsonProperty("permission_type")
    @ApiModelProperty(value = "permission_type", notes = "权限类型")
    private String permissionType;

    /**
     * 显示名
     */
    @JsonProperty("display_name")
    @ApiModelProperty(value = "display_name", notes = "显示名")
    private String displayName;


    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}