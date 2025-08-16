package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCREGISTRYREPO 过滤器对象
 */
public class PSDCRegistryRepoFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCRegistryRepoFilter(){
    
    }      

    /**
     * 设置属性[中心镜像仓库标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter psdcregistryrepoid__eq(String value){
        this.setFieldCond("psdcregistryrepoid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[镜像仓库名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter psdcregistryreponame__like(String value){
        this.setFieldCond("psdcregistryreponame", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[镜像服务器类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter registrytype__eq(String value){
        this.setFieldCond("registrytype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter respos__eq(Integer value){
        this.setFieldCond("respos", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCRegistryRepoFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

}