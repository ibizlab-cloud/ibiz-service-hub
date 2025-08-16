package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSBIAGGTABLE 过滤器对象
 */
public class PSSysBIAggTableFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysBIAggTableFilter(){
    
    }      

    /**
     * 设置属性[代码名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdedataqueryid__eq(String value){
        this.setFieldCond("psdedataqueryid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdedataqueryname__eq(String value){
        this.setFieldCond("psdedataqueryname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdedataqueryname__like(String value){
        this.setFieldCond("psdedataqueryname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[宽表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[宽表实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[宽表实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[聚合数据名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbiaggtablename__eq(String value){
        this.setFieldCond("pssysbiaggtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[聚合数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbiaggtablename__like(String value){
        this.setFieldCond("pssysbiaggtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubeid__eq(String value){
        this.setFieldCond("pssysbicubeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubename__eq(String value){
        this.setFieldCond("pssysbicubename", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表立方体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbicubename__like(String value){
        this.setFieldCond("pssysbicubename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemeid__eq(String value){
        this.setFieldCond("pssysbischemeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemename__eq(String value){
        this.setFieldCond("pssysbischemename", EQ, value);
        return this;
    }

    /**
     * 设置属性[智能报表体系]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter pssysbischemename__like(String value){
        this.setFieldCond("pssysbischemename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysBIAggTableFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
