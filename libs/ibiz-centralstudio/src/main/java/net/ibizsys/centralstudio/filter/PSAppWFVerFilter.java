package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPWFVER 过滤器对象
 */
public class PSAppWFVerFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppWFVerFilter(){
    
    }      

    /**
     * 设置属性[应用工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfid__eq(String value){
        this.setFieldCond("psappwfid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfname__eq(String value){
        this.setFieldCond("psappwfname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfname__like(String value){
        this.setFieldCond("psappwfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[版本名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfvername__like(String value){
        this.setFieldCond("psappwfvername", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
