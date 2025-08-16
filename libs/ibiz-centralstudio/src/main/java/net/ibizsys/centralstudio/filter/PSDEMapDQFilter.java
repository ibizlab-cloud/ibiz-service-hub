package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEMAPDQ 过滤器对象
 */
public class PSDEMapDQFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEMapDQFilter(){
    
    }      

    /**
     * 设置属性[目标数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter dstpsdedataqueryid__eq(String value){
        this.setFieldCond("dstpsdedataqueryid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter dstpsdedataqueryname__eq(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter dstpsdedataqueryname__like(String value){
        this.setFieldCond("dstpsdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[源数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdedataqueryid__eq(String value){
        this.setFieldCond("psdedataqueryid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据查询]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdedataqueryname__eq(String value){
        this.setFieldCond("psdedataqueryname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[源数据查询]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdedataqueryname__like(String value){
        this.setFieldCond("psdedataqueryname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射查询名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdemapdqname__like(String value){
        this.setFieldCond("psdemapdqname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdemapid__eq(String value){
        this.setFieldCond("psdemapid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdemapname__eq(String value){
        this.setFieldCond("psdemapname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体映射]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter psdemapname__like(String value){
        this.setFieldCond("psdemapname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEMapDQFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
