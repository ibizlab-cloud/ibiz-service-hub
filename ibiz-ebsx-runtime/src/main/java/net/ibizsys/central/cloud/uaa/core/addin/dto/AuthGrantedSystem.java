/**
 * Generate code from /{{projectName}}-core/src/main/java/{{packageName}}/core/{{modules}}/domain/{{entities@NONE}}.java.hbs
 */
package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

/**
 * 授权系统实体类[AuthGrantedSystem]
 *
 * @author generator
 */
@JsonIgnoreProperties(value = "handler")
@ApiModel(value = "AUTH_GRANTED_SYSTEM", description = "授权系统")
public class AuthGrantedSystem implements Serializable {

    /**
     * 系统标识
     */
    @Id
    @JsonProperty("deploy_system_id")
    @ApiModelProperty(value = "deploy_system_id", notes = "系统标识")
    private String deploySystemId;

    /**
     * 系统名称
     */
    @JsonProperty("display_name")
    @ApiModelProperty(value = "display_name", notes = "系统名称")
    private String displayName;

    /**
     * 系统名
     */
    @JsonProperty("system_id")
    @ApiModelProperty(value = "system_id", notes = "系统名")
    private String systemId;

    /**
     * 角色
     */
    @JsonProperty("roles")
    private List<AuthGrantedRole> roles;

    public String getDeploySystemId() {
        return deploySystemId;
    }

    public void setDeploySystemId(String deploySystemId) {
        this.deploySystemId = deploySystemId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public List<AuthGrantedRole> getRoles() {
        return roles;
    }

    public void setRoles(List<AuthGrantedRole> roles) {
        this.roles = roles;
    }
}