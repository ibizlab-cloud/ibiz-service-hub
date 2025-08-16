package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDBINDEX 过滤器对象
 */
public class PSDEDBIndexFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDBIndexFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[索引类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter indextype__eq(String value){
        this.setFieldCond("indextype", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库索引标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdedbindexname__eq(String value){
        this.setFieldCond("psdedbindexname", EQ, value);
        return this;
    }

    /**
     * 设置属性[数据库索引标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdedbindexname__like(String value){
        this.setFieldCond("psdedbindexname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdename__eq(String value){
        this.setFieldCond("psdename", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDBIndexFilter psdename__like(String value){
        this.setFieldCond("psdename", LIKE, value);
        return this;
    }

}
