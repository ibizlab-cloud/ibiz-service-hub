package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDESAMPLEDATA 过滤器对象
 */
public class PSDESampleDataFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDESampleDataFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter datatype__eq(String value){
        this.setFieldCond("datatype", EQ, value);
        return this;
    }

    /**
     * 设置属性[逻辑模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter logicmode__eq(String value){
        this.setFieldCond("logicmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstateid__eq(String value){
        this.setFieldCond("psdemainstateid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstatename__eq(String value){
        this.setFieldCond("psdemainstatename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体主状态]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdemainstatename__like(String value){
        this.setFieldCond("psdemainstatename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[示例数据名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdesampledataname__eq(String value){
        this.setFieldCond("psdesampledataname", EQ, value);
        return this;
    }

    /**
     * 设置属性[示例数据名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter psdesampledataname__like(String value){
        this.setFieldCond("psdesampledataname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemid__eq(String value){
        this.setFieldCond("pssysreqitemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemname__eq(String value){
        this.setFieldCond("pssysreqitemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统需求项]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter pssysreqitemname__like(String value){
        this.setFieldCond("pssysreqitemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[使用方式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usage__eq(String value){
        this.setFieldCond("usage", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDESampleDataFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
