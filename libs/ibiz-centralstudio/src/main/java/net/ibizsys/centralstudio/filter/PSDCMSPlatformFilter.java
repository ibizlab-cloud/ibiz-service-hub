package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCMSPLATFORM 过滤器对象
 */
public class PSDCMSPlatformFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCMSPlatformFilter(){
    
    }      

    /**
     * 设置属性[中心微服务平台标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdcmsplatformid__eq(String value){
        this.setFieldCond("psdcmsplatformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdcmsplatformname__like(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[微服务框架]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter mstype__eq(String value){
        this.setFieldCond("mstype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上传文件模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter uploadfilemode__eq(String value){
        this.setFieldCond("uploadfilemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter resstate__eq(Integer value){
        this.setFieldCond("resstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter respos__eq(Integer value){
        this.setFieldCond("respos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心集群标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdcclusterid__eq(String value){
        this.setFieldCond("psdcclusterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行集群]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdcclustername__eq(String value){
        this.setFieldCond("psdcclustername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[运行集群]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFilter psdcclustername__like(String value){
        this.setFieldCond("psdcclustername", Conditions.LIKE, value);
        return this;
    }

}