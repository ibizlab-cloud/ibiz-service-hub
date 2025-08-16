package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@JsonIgnoreProperties(value = "handler")
@ApiModel(value = "AUTH_MEMBER", description = "隶属信息")
public class AuthMember implements Serializable
{

    /**
     * 用户组标识
     */
    @Id
    @JsonProperty("organizational_role_id")
    @ApiModelProperty(value = "organizational_role_id", notes = "用户组标识")
    private String organizationalRoleId;

    /**
     * 用户组名称
     */
    @JsonProperty("organizational_role_name")
    @ApiModelProperty(value = "organizational_role_name", notes = "用户组名称")
    private String organizationalRoleName;

    /**
     * 部门标识
     */
    @JsonProperty("department_id")
    @ApiModelProperty(value = "department_id", notes = "部门标识")
    private String departmentId;

    /**
     * 部门编号
     */
    @JsonProperty("department_number")
    @ApiModelProperty(value = "department_number", notes = "部门编号")
    private String departmentNumber;

    /**
     * 部门名称
     */
    @JsonProperty("department_name")
    @ApiModelProperty(value = "department_name", notes = "部门名称")
    private String departmentName;

    /**
     * 组织机构标识
     */
    @JsonProperty("organization_id")
    @ApiModelProperty(value = "organization_id", notes = "组织机构标识")
    private String organizationId;

    /**
     * 机构编号
     */
    @JsonProperty("organization_number")
    @ApiModelProperty(value = "organization_number", notes = "机构编号")
    private String organizationNumber;

    /**
     * 组织机构名称
     */
    @JsonProperty("organization_name")
    @ApiModelProperty(value = "organization_name", notes = "组织机构名称")
    private String organizationName;

    /**
     * DC
     */
    @JsonProperty("dc")
    @ApiModelProperty(value = "dc", notes = "DC")
    private String dc;

    public String getOrganizationalRoleId() {
        return organizationalRoleId;
    }

    public void setOrganizationalRoleId(String organizationalRoleId) {
        this.organizationalRoleId = organizationalRoleId;
    }

    public String getOrganizationalRoleName() {
        return organizationalRoleName;
    }

    public void setOrganizationalRoleName(String organizationalRoleName) {
        this.organizationalRoleName = organizationalRoleName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
}