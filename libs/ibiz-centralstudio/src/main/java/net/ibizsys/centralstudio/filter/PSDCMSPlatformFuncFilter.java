package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCMSPLATFORMFUNC 过滤器对象
 */
public class PSDCMSPlatformFuncFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCMSPlatformFuncFilter(){
    
    }      

    /**
     * 设置属性[中心微服务平台功能标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter psdcmsplatformfuncid__eq(String value){
        this.setFieldCond("psdcmsplatformfuncid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[功能名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter psdcmsplatformfuncname__like(String value){
        this.setFieldCond("psdcmsplatformfuncname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[微服务功能类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter msfunctype__eq(String value){
        this.setFieldCond("msfunctype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心微服务平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter psdcmsplatformname__eq(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[中心微服务平台]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter psdcmsplatformname__like(String value){
        this.setFieldCond("psdcmsplatformname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心微服务平台]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCMSPlatformFuncFilter psdcmsplatformid__eq(String value){
        this.setFieldCond("psdcmsplatformid", Conditions.EQ, value);
        return this;
    }

}