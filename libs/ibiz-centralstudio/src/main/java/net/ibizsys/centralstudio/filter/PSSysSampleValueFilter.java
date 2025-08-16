package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSSAMPLEVALUE 过滤器对象
 */
public class PSSysSampleValueFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysSampleValueFilter(){
    
    }      

    /**
     * 设置属性[代码标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter codename__like(String value){
        this.setFieldCond("codename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmoduleid__eq(String value){
        this.setFieldCond("psmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmodulename__eq(String value){
        this.setFieldCond("psmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter psmodulename__like(String value){
        this.setFieldCond("psmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevalueid__eq(String value){
        this.setFieldCond("pssamplevalueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevaluename__eq(String value){
        this.setFieldCond("pssamplevaluename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[平台预置示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssamplevaluename__like(String value){
        this.setFieldCond("pssamplevaluename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[示例值名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssyssamplevaluename__like(String value){
        this.setFieldCond("pssyssamplevaluename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemid__eq(String value){
        this.setFieldCond("pssystemid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemname__eq(String value){
        this.setFieldCond("pssystemname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter pssystemname__like(String value){
        this.setFieldCond("pssystemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysSampleValueFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
