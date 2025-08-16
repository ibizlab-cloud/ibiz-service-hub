package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEAGDETAIL 过滤器对象
 */
public class PSDEAGDetailFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEAGDetailFilter(){
    
    }      

    /**
     * 设置属性[成员类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter detailtype__eq(String value){
        this.setFieldCond("detailtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactiongroupid__eq(String value){
        this.setFieldCond("psdeactiongroupid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为组]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactiongroupname__eq(String value){
        this.setFieldCond("psdeactiongroupname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为组]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactiongroupname__like(String value){
        this.setFieldCond("psdeactiongroupname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[组成员名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdeagdetailname__like(String value){
        this.setFieldCond("psdeagdetailname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEAGDetailFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
