package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDQCODE 过滤器对象
 */
public class PSDEDQCodeFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSDEDQCodeFilter(){
    
    }      

    /**
     * 设置属性[数据库类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter dbtype__eq(String value){
        this.setFieldCond("dbtype", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter psdedqcodename__eq(String value){
        this.setFieldCond("psdedqcodename", EQ, value);
        return this;
    }

    /**
     * 设置属性[查询代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter psdedqcodename__like(String value){
        this.setFieldCond("psdedqcodename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDQCodeFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", LIKE, value);
        return this;
    }

}
