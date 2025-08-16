package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBTABLE 过滤器对象
 */
public class PSDEDBTableFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDBTableFilter(){
    
    }      

    /**
     * 设置属性[列继承模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter colinheritmode__eq(Integer value){
        this.setFieldCond("colinheritmode", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdedbtablename__eq(String value){
        this.setFieldCond("psdedbtablename", EQ, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdetablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter psdedbtablename__like(String value){
        this.setFieldCond("psdedbtablename", LIKE, value);
        //属性名称与代码标识不一致，设置属性名称
        this.setFieldCond("psdetablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtableid__eq(String value){
        this.setFieldCond("pssysdbtableid", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtablename__eq(String value){
        this.setFieldCond("pssysdbtablename", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter pssysdbtablename__like(String value){
        this.setFieldCond("pssysdbtablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[表类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter tabletype__eq(String value){
        this.setFieldCond("tabletype", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBTableFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
