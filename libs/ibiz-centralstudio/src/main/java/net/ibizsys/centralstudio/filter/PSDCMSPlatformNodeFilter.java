package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCMSPLATFORMNODE 过滤器对象
 */
public class PSDCMSPlatformNodeFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCMSPlatformNodeFilter(){
    
    }      

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcmsplatformnodename__like(String value){
        this.setFieldCond("psdcmsplatformnodename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心微服务平台节点标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcmsplatformnodeid__eq(String value){
        this.setFieldCond("psdcmsplatformnodeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Cloud平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcmsplatformname__eq(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[Cloud平台]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcmsplatformname__like(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[Cloud平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcmsplatformid__eq(String value){
        this.setFieldCond("psdcmsplatformid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[上传文件模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter uploadfilemode__eq(String value){
        this.setFieldCond("uploadfilemode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心镜像仓库项标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcregistryitemid__eq(String value){
        this.setFieldCond("psdcregistryitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[挂载镜像]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcregistryitemname__eq(String value){
        this.setFieldCond("psdcregistryitemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[挂载镜像]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter psdcregistryitemname__like(String value){
        this.setFieldCond("psdcregistryitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[镜像项类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter dcregistryitemtag__eq(String value){
        this.setFieldCond("dcregistryitemtag", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用次数]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformNodeFilter refcount__eq(String value){
        this.setFieldCond("refcount", Conditions.EQ, value);
        return this;
    }

}