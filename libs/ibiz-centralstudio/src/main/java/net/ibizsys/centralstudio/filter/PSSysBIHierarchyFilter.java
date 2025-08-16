package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIHIERARCHY 过滤器对象
 */
public class PSSysBIHierarchyFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysBIHierarchyFilter(){
    
    }      

    /**
     * 设置属性[体系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter bihierarchytype__eq(String value){
        this.setFieldCond("bihierarchytype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionid__eq(String value){
        this.setFieldCond("pssysbidimensionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionname__eq(String value){
        this.setFieldCond("pssysbidimensionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionname__like(String value){
        this.setFieldCond("pssysbidimensionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbihierarchyname__like(String value){
        this.setFieldCond("pssysbihierarchyname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
