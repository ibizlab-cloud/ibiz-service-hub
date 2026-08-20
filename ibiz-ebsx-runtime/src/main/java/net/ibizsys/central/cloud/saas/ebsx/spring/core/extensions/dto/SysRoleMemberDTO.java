package net.ibizsys.central.cloud.saas.ebsx.spring.core.extensions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 系统角色成员[SysRoleMemberDTO]
 *
 * @author generator
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("系统角色成员DTO")
public class SysRoleMemberDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @JsonProperty("id")

    @ApiModelProperty(value = "标识", position = 0)
    private String id;

    /**
     * 创建人
     */
    @JsonProperty("creator")
    @ApiModelProperty(value = "创建人", position = 1)
    private String creator;

    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间", position = 2)
    private Date createTime;

    /**
     * 最后更新人
     */
    @JsonProperty("updater")
    @ApiModelProperty(value = "最后更新人", position = 3)
    private String updater;

    /**
     * 最后更新时间
     */
    @JsonProperty("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @ApiModelProperty(value = "最后更新时间", position = 4)
    private Date updateTime;

    /**
     * DC
     */
    @JsonProperty("dc")
    @ApiModelProperty(value = "DC", position = 5)
    private String dc;

    /**
     * 系统角色标识
     */
    @JsonProperty("role_id")
    @ApiModelProperty(value = "系统角色标识", position = 6)
    private String roleId;

    /**
     * 成员类型
     */
    @JsonProperty("member_type")
    @ApiModelProperty(value = "成员类型", position = 7)
    private String memberType;

    /**
     * 用户组/人员标识
     */
    @JsonProperty("member_uid")
    @ApiModelProperty(value = "用户组/人员标识", position = 8)
    private String memberUid;

    /**
     * 成员名称
     */
    @JsonProperty("member_name")
    @ApiModelProperty(value = "成员名称", position = 9)
    private String memberName;

    /**
     * 成员DN
     */
    @JsonProperty("member_dn")
    @ApiModelProperty(value = "成员DN", position = 10)
    private String memberDn;

    /**
     * 成员分组标识
     */
    @JsonProperty("member_group_id")
    @ApiModelProperty(value = "成员分组标识", position = 11)
    private String memberGroupId;

    /**
     * 成员分组名称
     */
    @JsonProperty("member_group_name")
    @ApiModelProperty(value = "成员分组名称", position = 12)
    private String memberGroupName;

    /**
     * 部门标识
     */
    @JsonProperty("department_id")
    @ApiModelProperty(value = "部门标识", position = 13)
    private String departmentId;

    /**
     * 组织机构标识
     */
    @JsonProperty("organization_id")
    @ApiModelProperty(value = "组织机构标识", position = 14)
    private String organizationId;

    /**
     * Mail
     */
    @JsonProperty("mail")
    @ApiModelProperty(value = "Mail", position = 15)
    private String mail;

    /**
     * 系统角色名称
     */
    @JsonProperty("role_name")
    @ApiModelProperty(value = "系统角色名称", position = 16)
    private String roleName;

    /**
     * 角色标记
     */
    @JsonProperty("role_authority")
    @ApiModelProperty(value = "角色标记", position = 17)
    private String roleAuthority;

    /**
     * 系统标识
     */
    @JsonProperty("deploy_system_id")
    @ApiModelProperty(value = "系统标识", position = 18)
    private String deploySystemId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberUid() {
        return memberUid;
    }

    public void setMemberUid(String memberUid) {
        this.memberUid = memberUid;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberDn() {
        return memberDn;
    }

    public void setMemberDn(String memberDn) {
        this.memberDn = memberDn;
    }

    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleAuthority() {
        return roleAuthority;
    }

    public void setRoleAuthority(String roleAuthority) {
        this.roleAuthority = roleAuthority;
    }

    public String getDeploySystemId() {
        return deploySystemId;
    }

    public void setDeploySystemId(String deploySystemId) {
        this.deploySystemId = deploySystemId;
    }
}
