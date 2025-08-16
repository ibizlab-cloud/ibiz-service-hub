package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFINPUTTIPSET 过滤器对象
 */
public class PSDEFInputTipSetFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFInputTipSetFilter(){
    
    }      

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter contentpsdefid__eq(String value){
        this.setFieldCond("contentpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter contentpsdefname__eq(String value){
        this.setFieldCond("contentpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter contentpsdefname__like(String value){
        this.setFieldCond("contentpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[关闭标志值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter ecpsdefid__eq(String value){
        this.setFieldCond("ecpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关闭标志值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter ecpsdefname__eq(String value){
        this.setFieldCond("ecpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[关闭标志值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter ecpsdefname__like(String value){
        this.setFieldCond("ecpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[链接值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter linkpsdefid__eq(String value){
        this.setFieldCond("linkpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter linkpsdefname__eq(String value){
        this.setFieldCond("linkpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[链接值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter linkpsdefname__like(String value){
        this.setFieldCond("linkpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdedatasetid__eq(String value){
        this.setFieldCond("psdedatasetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdedatasetname__eq(String value){
        this.setFieldCond("psdedatasetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[数据集合]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdedatasetname__like(String value){
        this.setFieldCond("psdedatasetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[集合名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdefinputtipsetname__like(String value){
        this.setFieldCond("psdefinputtipsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[业务标识值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter uniquetagpsdefid__eq(String value){
        this.setFieldCond("uniquetagpsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务标识值属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter uniquetagpsdefname__eq(String value){
        this.setFieldCond("uniquetagpsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[业务标识值属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter uniquetagpsdefname__like(String value){
        this.setFieldCond("uniquetagpsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipSetFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
