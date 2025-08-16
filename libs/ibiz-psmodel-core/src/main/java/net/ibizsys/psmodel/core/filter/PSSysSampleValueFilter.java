package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSAMPLEVALUE 过滤器对象
 */
public class PSSysSampleValueFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSSysSampleValueFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter codename__eq(String value){
        this.setFieldCond("codename", EQ, value);
        return this;
    }

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter codename__like(String value){
        this.setFieldCond("codename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevalueid__eq(String value){
        this.setFieldCond("pssamplevalueid", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevaluename__eq(String value){
        this.setFieldCond("pssamplevaluename", EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevaluename__like(String value){
        this.setFieldCond("pssamplevaluename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[示例值名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssyssamplevaluename__eq(String value){
        this.setFieldCond("pssyssamplevaluename", EQ, value);
        return this;
    }

    /**
     * 设置属性[示例值名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssyssamplevaluename__like(String value){
        this.setFieldCond("pssyssamplevaluename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标识4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
