package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSSYSTCASSERT 过滤器对象
 */
public class PSSysTCAssertFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSSysTCAssertFilter(){
    
    }      

    /**
     * 设置属性[预期类型]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter asserttype__eq(String value){
        this.setFieldCond("asserttype", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据主键属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstkeypsdefid__eq(String value){
        this.setFieldCond("dstkeypsdefid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据主键属性]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstkeypsdefname__eq(String value){
        this.setFieldCond("dstkeypsdefname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据主键属性]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstkeypsdefname__like(String value){
        this.setFieldCond("dstkeypsdefname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[目标数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstpsdeid__eq(String value){
        this.setFieldCond("dstpsdeid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据实体]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstpsdename__eq(String value){
        this.setFieldCond("dstpsdename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[目标数据实体]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter dstpsdename__like(String value){
        this.setFieldCond("dstpsdename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[断言标识]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystcassertname__like(String value){
        this.setFieldCond("pssystcassertname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例输入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystcinputid__eq(String value){
        this.setFieldCond("pssystcinputid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试用例输入]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystcinputname__eq(String value){
        this.setFieldCond("pssystcinputname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[测试用例输入]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystcinputname__like(String value){
        this.setFieldCond("pssystcinputname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestcaseid__eq(String value){
        this.setFieldCond("pssystestcaseid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestcasename__eq(String value){
        this.setFieldCond("pssystestcasename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[系统测试用例]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestcasename__like(String value){
        this.setFieldCond("pssystestcasename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[预期结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestdataid__eq(String value){
        this.setFieldCond("pssystestdataid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预期结果对象]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestdataname__eq(String value){
        this.setFieldCond("pssystestdataname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[预期结果对象]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter pssystestdataname__like(String value){
        this.setFieldCond("pssystestdataname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSSysTCAssertFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
