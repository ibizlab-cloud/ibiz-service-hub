package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFDTCOL 过滤器对象
 */
public class PSDEFDTColFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEFDTColFilter(){
    
    }      

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter dbtype__eq(String value){
        this.setFieldCond("dbtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[空值排序]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter nullvalorder__eq(String value){
        this.setFieldCond("nullvalorder", EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdefdtcolname__eq(String value){
        this.setFieldCond("psdefdtcolname", EQ, value);
        return this;
    }

    /**
     * 设置属性[列名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdefdtcolname__like(String value){
        this.setFieldCond("psdefdtcolname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdefname__like(String value){
        this.setFieldCond("psdefname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据表名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter tablename__like(String value){
        this.setFieldCond("tablename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFDTColFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
