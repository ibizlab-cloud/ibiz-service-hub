package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAPDS 过滤器对象
 */
public class PSDEMapDSFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMapDSFilter(){
    
    }      

    /**
     * 设置属性[目标源数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter dstpsdedatasetid__eq(String value){
        this.setFieldCond("dstpsdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter dstpsdedatasetname__eq(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter dstpsdedatasetname__like(String value){
        this.setFieldCond("dstpsdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射数据集合名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdemapdsname__like(String value){
        this.setFieldCond("psdemapdsname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdemapid__eq(String value){
        this.setFieldCond("psdemapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDSFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
