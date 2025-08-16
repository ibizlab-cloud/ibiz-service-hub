package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCREGISTRYITEM 过滤器对象
 */
public class PSDCRegistryItemFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCRegistryItemFilter(){
    
    }      

    /**
     * 设置属性[镜像名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdcregistryitemname__like(String value){
        this.setFieldCond("psdcregistryitemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心镜像仓库项标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdcregistryitemid__eq(String value){
        this.setFieldCond("psdcregistryitemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[镜像仓库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdcregistryreponame__eq(String value){
        this.setFieldCond("psdcregistryreponame", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[镜像仓库]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdcregistryreponame__like(String value){
        this.setFieldCond("psdcregistryreponame", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[镜像仓库]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdcregistryrepoid__eq(String value){
        this.setFieldCond("psdcregistryrepoid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[连接串]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter connstr__like(String value){
        this.setFieldCond("connstr", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[开发方案微服务部署标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnmsdeployid__eq(String value){
        this.setFieldCond("psdevslnmsdeployid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnmsdeployname__eq(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[部署名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryItemFilter psdevslnmsdeployname__like(String value){
        this.setFieldCond("psdevslnmsdeployname", Conditions.LIKE, value);
        return this;
    }

}