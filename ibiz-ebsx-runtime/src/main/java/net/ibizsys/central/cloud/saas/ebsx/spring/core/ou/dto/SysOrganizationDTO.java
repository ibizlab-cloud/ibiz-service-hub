/**
 * Generate code from /{{projectName}}-core/src/main/java/{{packageName}}/{{apis}}/dto/{{apiDtos@DEFAULT}}.java.hbs
 */
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
 * 组织机构[SysOrganizationDTO]
 *
 * @author generator
 */
@ApiModel("组织机构DTO")
public class SysOrganizationDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @JsonProperty("id")
    @ApiModelProperty(value = "标识", position = 0)
    private String id;

    /**
     * 名称
     */
    @JsonProperty("organization_name")
    @ApiModelProperty(value = "名称", position = 1)
    private String organizationName;

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
     * 上级组织机构标识
     */
    @JsonProperty("parent_id")
    @ApiModelProperty(value = "上级组织机构标识", position = 7)
    private String parentId;

    /**
     * 上级名称
     */
    @JsonProperty("parent_name")
    @ApiModelProperty(value = "上级名称", position = 8)
    private String parentName;

    /**
     * 机构编号
     */
    @JsonProperty("organization_number")
    @ApiModelProperty(value = "机构编号", position = 9)
    private String organizationNumber;

    /**
     * 描述
     */
    @JsonProperty("description")
    @ApiModelProperty(value = "描述", position = 10)
    private String description;

    /**
     * 简称
     */
    @JsonProperty("short_name")
    @ApiModelProperty(value = "简称", position = 11)
    private String shortName;

    /**
     * 排序
     */
    @JsonProperty("sort")
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "排序", position = 12)
    private Long sort;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
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

    public static SysOrganizationDTO from(OrganizationDTO dto) {
        SysOrganizationDTO inst = new SysOrganizationDTO();
        inst.setId(dto.getOrgId());
        inst.setOrganizationNumber(dto.getOrgCode());
        inst.setOrganizationName(dto.getOrgName());
        inst.setParentId(dto.getParentOrgId());
        inst.setParentName(dto.getParentOrgName());
        inst.setShortName(dto.getShortName());
        if(dto.getShowOrder() != null)
            inst.setSort(dto.getShowOrder().longValue());
        inst.setCreateTime(dto.getCreateDate());
        inst.setUpdateTime(dto.getUpdateDate());
        return inst;
    }


    /*
        SELECT
            t1.CREATE_TIME as CREATEDATE,
            t1.DC as DOMAINS,
            t1.ENABLED as ENABLE,
            t1.ENABLED as ISVALID,
            t1.ORGANIZATION_NUMBER as ORGCODE,
            t1.ID as ORGID,
            1 as ORGLEVEL,
            t1.ORGANIZATION_NAME as ORGNAME,
            t1.PARENT_ID as PORGID,
            t11.ORGANIZATION_NAME AS PORGNAME,
            0 as SAASMODE,
            t1.ORGANIZATION_NAME as SHORTNAME,
            t1.SORT as SHOWORDER,
            t1.UPDATE_TIME as UPDATEDATE,
            null as RESERVER,
            null as RESERVER10,
            null as RESERVER11,
            null as RESERVER12,
            null as RESERVER13,
            null as RESERVER14,
            null as RESERVER15,
            null as RESERVER16,
            null as RESERVER17,
            null as RESERVER18,
            null as RESERVER19,
            null as RESERVER2,
            null as RESERVER20,
            null as RESERVER3,
            null as RESERVER4,
            null as RESERVER5,
            null as RESERVER6,
            null as RESERVER7,
            null as RESERVER8,
            null as RESERVER9
        FROM sys_organization t1
                 LEFT JOIN sys_organization t11 ON t1.PARENT_ID = t11.ID
     */
}
