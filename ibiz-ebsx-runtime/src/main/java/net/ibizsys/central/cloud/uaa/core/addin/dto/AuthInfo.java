package net.ibizsys.central.cloud.uaa.core.addin.dto;

import java.util.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 认证信息[AuthInfoDTO]
 *
 * @author generator
 */
@ApiModel("认证信息DTO")
public class AuthInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户标识
     */
    @JsonProperty("id")
    @ApiModelProperty(value = "用户标识", position = 0)
    private String id;

    /**
     * 用户显示名
     */
    @JsonProperty("display_name")
    @ApiModelProperty(value = "用户显示名", position = 1)
    private String displayName;

    /**
     * username/uid
     */
    @JsonProperty("username")
    @ApiModelProperty(value = "username/uid", position = 2)
    private String username;


    /**
     * username/uid
     */
    @JsonProperty("uid")
    @ApiModelProperty(value = "uid", position = 2)
    private String uid;

    /**
     * DC
     */
    @JsonProperty("dc")
    @ApiModelProperty(value = "DC", position = 3)
    private String dc;

    /**
     * 组织机构标识
     */
    @JsonProperty("organization_id")
    @ApiModelProperty(value = "组织机构标识", position = 4)
    private String organizationId;

    /**
     * 主部门标识
     */
    @JsonProperty("mdepartment_id")
    @ApiModelProperty(value = "mdepartment_id", notes = "主部门标识")
    private String mdepartmentId;

    /**
     * 电子邮箱
     */
    @JsonProperty("mail")
    @ApiModelProperty(value = "电子邮箱", position = 5)
    private String mail;

    /**
     * 移动电话
     */
    @JsonProperty("mobile")
    @ApiModelProperty(value = "移动电话", position = 6)
    private String mobile;

    /**
     * 人员编号
     */
    @JsonProperty("employee_number")
    @ApiModelProperty(value = "人员编号", position = 10)
    private String employeeNumber;

    /**
     * 类型
     */
    @JsonProperty("employee_type")
    @ApiModelProperty(value = "类型", position = 11)
    private String employeeType;

    /**
     * 职位
     */
    @JsonProperty("title")
    @ApiModelProperty(value = "职位", position = 12)
    private String title;

    /**
     * 联系电话
     */
    @JsonProperty("telephone_number")
    @ApiModelProperty(value = "联系电话", position = 13)
    private String telephoneNumber;

    /**
     * 证件号
     */
    @JsonProperty("identification_number")
    @ApiModelProperty(value = "证件号", position = 14)
    private String identificationNumber;

    /**
     * 地址
     */
    @JsonProperty("postal_address")
    @ApiModelProperty(value = "地址", position = 15)
    private String postalAddress;

    /**
     * 隶属于
     */
    @JsonProperty("member_of")
    @ApiModelProperty(value = "隶属于", position = 7)
    private List<AuthMember> memberOf;

    private List<AuthGrantedSystem> grants;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
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

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getMdepartmentId() {
        return mdepartmentId;
    }

    public void setMdepartmentId(String mdepartmentId) {
        this.mdepartmentId = mdepartmentId;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<AuthMember> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(List<AuthMember> memberOf) {
        this.memberOf = memberOf;
    }

    public List<AuthGrantedSystem> getGrants() {
        return grants;
    }

    public void setGrants(List<AuthGrantedSystem> grants) {
        this.grants = grants;
    }
}
