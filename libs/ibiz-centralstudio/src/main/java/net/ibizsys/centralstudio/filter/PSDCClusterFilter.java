package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCCLUSTER 过滤器对象
 */
public class PSDCClusterFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCClusterFilter(){
    
    }      

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[集群名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter psdcclustername__like(String value){
        this.setFieldCond("psdcclustername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集群类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter clustertype__eq(String value){
        this.setFieldCond("clustertype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter resstate__eq(Integer value){
        this.setFieldCond("resstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心集群标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter psdcclusterid__eq(String value){
        this.setFieldCond("psdcclusterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源来源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCClusterFilter respos__eq(Integer value){
        this.setFieldCond("respos", Conditions.EQ, value);
        return this;
    }

}