package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTDITEM 过滤器对象
 */
public class PSSysTDItemFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysTDItemFilter(){
    
    }      

    /**
     * 设置属性[引用代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pscodelistid__eq(String value){
        this.setFieldCond("pscodelistid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用代码表]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pscodelistname__eq(String value){
        this.setFieldCond("pscodelistname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用代码表]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pscodelistname__like(String value){
        this.setFieldCond("pscodelistname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter psdefid__eq(String value){
        this.setFieldCond("psdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter psdefname__eq(String value){
        this.setFieldCond("psdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[实体属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter psdefname__like(String value){
        this.setFieldCond("psdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssyssamplevalueid__eq(String value){
        this.setFieldCond("pssyssamplevalueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssyssamplevaluename__eq(String value){
        this.setFieldCond("pssyssamplevaluename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssyssamplevaluename__like(String value){
        this.setFieldCond("pssyssamplevaluename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[数据项标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssystditemname__like(String value){
        this.setFieldCond("pssystditemname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssystestdataid__eq(String value){
        this.setFieldCond("pssystestdataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssystestdataname__eq(String value){
        this.setFieldCond("pssystestdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter pssystestdataname__like(String value){
        this.setFieldCond("pssystestdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpsdeid__eq(String value){
        this.setFieldCond("refpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpsdename__eq(String value){
        this.setFieldCond("refpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpsdename__like(String value){
        this.setFieldCond("refpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[引用测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpssystestdataid__eq(String value){
        this.setFieldCond("refpssystestdataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpssystestdataname__eq(String value){
        this.setFieldCond("refpssystestdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[引用测试数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter refpssystestdataname__like(String value){
        this.setFieldCond("refpssystestdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[值类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTDItemFilter valuetype__eq(String value){
        this.setFieldCond("valuetype", Conditions.EQ, value);
        return this;
    }

}
