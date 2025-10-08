package net.ibizsys.central.cloud.saas.ebsx.spring.core.ou.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 部门[SysDepartmentDTO]
 *
 * @author generator
 */

@ApiModel("部门DTO")
public class SysDepartmentDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @JsonProperty("id")
    @ApiModelProperty(value = "标识", position = 0)
    private String id;

    /**
     * 部门名称
     */
    @JsonProperty("department_name")
    @ApiModelProperty(value = "部门名称", position = 1)
    private String departmentName;

    /**
     * 创建人
     */
    @JsonProperty("creator")
    @ApiModelProperty(value = "创建人", position = 2)
    private String creator;

    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间", position = 3)
    private Date createTime;

    /**
     * 最后更新人
     */
    @JsonProperty("updater")
    @ApiModelProperty(value = "最后更新人", position = 4)
    private String updater;

    /**
     * 最后更新时间
     */
    @JsonProperty("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @ApiModelProperty(value = "最后更新时间", position = 5)
    private Date updateTime;

    /**
     * DC
     */
    @JsonProperty("dc")
    @ApiModelProperty(value = "DC", position = 6)
    private String dc;

    /**
     * 组织机构标识
     */
    @JsonProperty("organization_id")
    @ApiModelProperty(value = "组织机构标识", position = 7)
    private String organizationId;

    /**
     * 组织机构名称
     */
    @JsonProperty("organization_name")
    @ApiModelProperty(value = "组织机构名称", position = 8)
    private String organizationName;

    /**
     * 机构编号
     */
    @JsonProperty("organization_number")
    @ApiModelProperty(value = "机构编号", position = 9)
    private String organizationNumber;

    /**
     * 上级部门标识
     */
    @JsonProperty("parent_id")
    @ApiModelProperty(value = "上级部门标识", position = 10)
    private String parentId;

    /**
     * 上级部门名称
     */
    @JsonProperty("parent_name")
    @ApiModelProperty(value = "上级部门名称", position = 11)
    private String parentName;

    /**
     * 部门编号
     */
    @JsonProperty("department_number")
    @ApiModelProperty(value = "部门编号", position = 12)
    private String departmentNumber;

    /**
     * 备注
     */
    @JsonProperty("description")
    @ApiModelProperty(value = "备注", position = 13)
    private String description;

    /**
     * 简称
     */
    @JsonProperty("short_name")
    @ApiModelProperty(value = "简称", position = 14)
    private String shortName;

    /**
     * 排序
     */
    @JsonProperty("sort")
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "排序", position = 15)
    private Long sort;

    /**
     * 业务类别
     */
    @JsonProperty("business_category")
    @ApiModelProperty(value = "业务类别", position = 16)
    private List<String> businessCategory;

    /**
     * 上级标识
     */
    @JsonProperty("parent_unit_id")
    @ApiModelProperty(value = "上级标识", position = 17)
    private String parentUnitId;

    /**
     * 上级名称
     */
    @JsonProperty("parent_unit_name")
    @ApiModelProperty(value = "上级名称", position = 18)
    private String parentUnitName;

    /**
     * DN
     */
    @JsonProperty("dn")
    @ApiModelProperty(value = "DN", position = 19)
    private String dn;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public List<String> getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(List<String> businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getParentUnitId() {
        return parentUnitId;
    }

    public void setParentUnitId(String parentUnitId) {
        this.parentUnitId = parentUnitId;
    }

    public String getParentUnitName() {
        return parentUnitName;
    }

    public void setParentUnitName(String parentUnitName) {
        this.parentUnitName = parentUnitName;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public static SysDepartmentDTO from(DepartmentDTO dto) {
        SysDepartmentDTO inst = new SysDepartmentDTO();
        inst.setId(dto.getDeptId());
        inst.setDepartmentName(dto.getDeptName());
        inst.setDepartmentNumber(dto.getDeptCode());
        inst.setOrganizationId(dto.getOrgId());
        inst.setOrganizationName(dto.getOrgName());
        inst.setOrganizationNumber(dto.getOrgCode());
        inst.setParentId(dto.getParentDeptId());
        inst.setParentName(dto.getParentDeptName());
        inst.setShortName(dto.getShortName());
        if(dto.getShowOrder() != null)
            inst.setSort(dto.getShowOrder().longValue());
        inst.setCreateTime(dto.getCreateDate());
        inst.setUpdateTime(dto.getUpdateDate());
        return inst;
    }

    /*
     SELECT t1.BUSINESS_CATEGORY    as BCODE,
             t1.CREATE_TIME          as CREATEDATE,
             t1.DEPARTMENT_NUMBER    as DDDEPTID,
             t1.DEPARTMENT_NUMBER    as DEPTCODE,
             t1.DEPARTMENT_NAME      as DEPTFULLNAME,
             t1.ID                   as DEPTID,
             null                    as DEPTLEADER,
             null                    as DEPTLEADERID,
             1                       as DEPTLEVEL,
             t1.DEPARTMENT_NAME      as DEPTNAME,
             t1.DC                   as DOMAINS,
             t1.ENABLED              as ENABLE,
             t1.ENABLED              as ISVALID,
             null                    as LEADERID,
             null                    as LEADERNAME,
             t11.ORGANIZATION_NUMBER as ORGCODE,
             t1.ORGANIZATION_ID      as ORGID,
             t11.ORGANIZATION_NAME   as ORGNAME,
             t1.PARENT_ID            as PDEPTID,
             t21.DEPARTMENT_NAME     AS PDEPTNAME,
             null                     as RESERVER,
             null                     as RESERVER10,
             null                     as RESERVER11,
             null                     as RESERVER12,
             null                     as RESERVER13,
             null                     as RESERVER14,
             null                     as RESERVER15,
             null                     as RESERVER16,
             null                     as RESERVER17,
             null                     as RESERVER18,
             null                     as RESERVER19,
             null                     as RESERVER2,
             null                     as RESERVER20,
             null                     as RESERVER3,
             null                     as RESERVER4,
             null                     as RESERVER5,
             null                     as RESERVER6,
             null                     as RESERVER7,
             null                     as RESERVER8,
             null                     as RESERVER9,
             t1.SHORT_NAME           as SHORTNAME,
             t1.SORT                 as SHOWORDER,
             t1.UPDATE_TIME          as UPDATEDATE,
             t1.DEPARTMENT_NUMBER    as WXWORKDEPTID
      FROM sys_department t1
               LEFT JOIN sys_organization t11 ON t1.ORGANIZATION_ID = t11.ID
               LEFT JOIN sys_department t21 ON t1.PARENT_ID = t21.ID) t1
     */
}
