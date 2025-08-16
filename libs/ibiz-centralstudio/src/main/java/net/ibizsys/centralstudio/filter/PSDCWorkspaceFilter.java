package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDCWORKSPACE 过滤器对象
 */
public class PSDCWorkspaceFilter extends net.ibizsys.centralstudio.util.CentralSearchContextDTOBase {

    public PSDCWorkspaceFilter(){
    
    }      

    /**
     * 设置属性[生产线名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdcworkspacename__like(String value){
        this.setFieldCond("psdcworkspacename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[中心生产线标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdcworkspaceid__eq(String value){
        this.setFieldCond("psdcworkspaceid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[资源状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter resstate__eq(Integer value){
        this.setFieldCond("resstate", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnsysname__eq(String value){
        this.setFieldCond("psdevslnsysname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[开发系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnsysname__like(String value){
        this.setFieldCond("psdevslnsysname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevcentername__eq(String value){
        this.setFieldCond("psdevcentername", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevcentername__like(String value){
        this.setFieldCond("psdevcentername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用中心]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevcenterid__eq(String value){
        this.setFieldCond("psdevcenterid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前开发系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnsysid__eq(String value){
        this.setFieldCond("psdevslnsysid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分配开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnname__eq(String value){
        this.setFieldCond("psdevslnname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[分配开发方案]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnname__like(String value){
        this.setFieldCond("psdevslnname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[分配开发方案]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter psdevslnid__eq(String value){
        this.setFieldCond("psdevslnid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[生产线分配状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDCWorkspaceFilter assignstatus__eq(String value){
        this.setFieldCond("assignstatus", Conditions.EQ, value);
        return this;
    }

}