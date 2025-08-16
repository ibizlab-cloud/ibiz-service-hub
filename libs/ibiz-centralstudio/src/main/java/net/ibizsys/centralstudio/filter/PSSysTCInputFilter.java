package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTCINPUT 过滤器对象
 */
public class PSSysTCInputFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysTCInputFilter(){
    
    }      

    /**
     * 设置属性[当前属性示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter defpssyssamplevalueid__eq(String value){
        this.setFieldCond("defpssyssamplevalueid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前属性示例值]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter defpssyssamplevaluename__eq(String value){
        this.setFieldCond("defpssyssamplevaluename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[当前属性示例值]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter defpssyssamplevaluename__like(String value){
        this.setFieldCond("defpssyssamplevaluename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[输入类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter inputtype__eq(String value){
        this.setFieldCond("inputtype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter psdeactionid__eq(String value){
        this.setFieldCond("psdeactionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入实体行为]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter psdeactionname__eq(String value){
        this.setFieldCond("psdeactionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[输入实体行为]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter psdeactionname__like(String value){
        this.setFieldCond("psdeactionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用例输入标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystcinputname__like(String value){
        this.setFieldCond("pssystcinputname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestcaseid__eq(String value){
        this.setFieldCond("pssystestcaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestcasename__eq(String value){
        this.setFieldCond("pssystestcasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestcasename__like(String value){
        this.setFieldCond("pssystestcasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestdataid__eq(String value){
        this.setFieldCond("pssystestdataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestdataname__eq(String value){
        this.setFieldCond("pssystestdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试数据]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter pssystestdataname__like(String value){
        this.setFieldCond("pssystestdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCInputFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
