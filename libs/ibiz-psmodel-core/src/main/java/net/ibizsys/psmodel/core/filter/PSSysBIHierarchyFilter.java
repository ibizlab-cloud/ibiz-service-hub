package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIHIERARCHY 过滤器对象
 */
public class PSSysBIHierarchyFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBIHierarchyFilter(){
    
    }      

    /**
     * 设置属性[体系类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter bihierarchytype__eq(String value){
        this.setFieldCond("bihierarchytype", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[层级代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", EQ, value);
        return this;
    }

    /**
     * 设置属性[层级代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", EQ, value);
        return this;
    }

    /**
     * 设置属性[层级代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionid__eq(String value){
        this.setFieldCond("pssysbidimensionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionname__eq(String value){
        this.setFieldCond("pssysbidimensionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表维度]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbidimensionname__like(String value){
        this.setFieldCond("pssysbidimensionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[维度体系名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbihierarchyname__eq(String value){
        this.setFieldCond("pssysbihierarchyname", EQ, value);
        return this;
    }

    /**
     * 设置属性[维度体系名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter pssysbihierarchyname__like(String value){
        this.setFieldCond("pssysbihierarchyname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIHierarchyFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
