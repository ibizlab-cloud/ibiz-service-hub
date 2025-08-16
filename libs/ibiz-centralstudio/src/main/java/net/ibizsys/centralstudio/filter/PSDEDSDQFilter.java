package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEDSDQ 过滤器对象
 */
public class PSDEDSDQFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEDSDQFilter(){
    
    }      

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedqid__eq(String value){
        this.setFieldCond("psdedqid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedqname__eq(String value){
        this.setFieldCond("psdedqname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedqname__like(String value){
        this.setFieldCond("psdedqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[查询名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEDSDQFilter psdedsdqname__like(String value){
        this.setFieldCond("psdedsdqname", Conditions.LIKE, value);
        return this;
    }

}
