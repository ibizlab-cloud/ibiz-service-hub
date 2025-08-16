package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSDEFINPUTTIP 过滤器对象
 */
public class PSDEFInputTipFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSDEFInputTipFilter(){
    
    }      

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter contentpslanresid__eq(String value){
        this.setFieldCond("contentpslanresid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter contentpslanresname__eq(String value){
        this.setFieldCond("contentpslanresname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[内容语言资源]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter contentpslanresname__like(String value){
        this.setFieldCond("contentpslanresname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefinputtipname__like(String value){
        this.setFieldCond("psdefinputtipname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefinputtipsetid__eq(String value){
        this.setFieldCond("psdefinputtipsetid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示集]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefinputtipsetname__eq(String value){
        this.setFieldCond("psdefinputtipsetname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[属性输入提示集]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefinputtipsetname__like(String value){
        this.setFieldCond("psdefinputtipsetname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdeid__eq(String value){
        this.setFieldCond("psdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdename__eq(String value){
        this.setFieldCond("psdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psdename__like(String value){
        this.setFieldCond("psdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[提示模式]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter tipmode__eq(String value){
        this.setFieldCond("tipmode", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSDEFInputTipFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
