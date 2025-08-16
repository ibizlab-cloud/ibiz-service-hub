/**
 * Generate code from /{{projectName}}-core/src/main/java/{{packageName}}/{{apis}}/dto/{{apiDtos@DEFAULT}}.java.hbs
 */
package net.ibizsys.central.cloud.uaa.core.addin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 开放接入[OpenAccessDTO]
 *
 * @author generator
 */

@ApiModel("开放接入DTO")
@JsonIgnoreProperties(value = "handler")
public class OpenAccess implements Serializable {


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
    @JsonProperty("name")
    @ApiModelProperty(value = "名称", position = 1)
    private String name;

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
     * 类型
     */
    @JsonProperty("open_type")
    @ApiModelProperty(value = "类型", position = 7)
    private String openType;

    /**
     * 授权类型
     */
    @JsonProperty("grant_types")
    @ApiModelProperty(value = "授权类型", position = 8)
    private String grantTypes;

    /**
     * AccessKey(AppId)
     */
    @JsonProperty("access_key")
    @ApiModelProperty(value = "AccessKey(AppId)", position = 9)
    private String accessKey;

    /**
     * SecretKey(AppSecret)
     */
    @JsonProperty("secret_key")
    @ApiModelProperty(value = "SecretKey(AppSecret)", position = 10)
    private String secretKey;

    /**
     * RegionId
     */
    @JsonProperty("region_id")
    @ApiModelProperty(value = "RegionId", position = 11)
    private String regionId;

    /**
     * 管理账号token
     */
    @JsonProperty("access_token")
    @ApiModelProperty(value = "管理账号token", position = 12)
    private String accessToken;

    /**
     * 管理账号token过期时间
     */
    @JsonProperty("expires_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    @ApiModelProperty(value = "管理账号token过期时间", position = 13)
    private Date expiresTime;

    /**
     * 是否禁用
     */
    @JsonProperty("disabled")
    @ApiModelProperty(value = "是否禁用", position = 14)
    private Integer disabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Date expiresTime) {
        this.expiresTime = expiresTime;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 重定向地址
     */
    @JsonProperty("redirect_uri")
    @ApiModelProperty(value = "重定向地址", position = 15)
    private String redirectUri;

    /**
     * 描述
     */
    @JsonProperty("description")
    @ApiModelProperty(value = "描述", position = 16)
    private String description;

}
