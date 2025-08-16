package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPWFVER 过滤器对象
 */
public class PSAppWFVerFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppWFVerFilter(){
    
    }      

    /**
     * 设置属性[应用工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfid__eq(String value){
        this.setFieldCond("psappwfid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfname__eq(String value){
        this.setFieldCond("psappwfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfname__like(String value){
        this.setFieldCond("psappwfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[版本名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfvername__eq(String value){
        this.setFieldCond("psappwfvername", EQ, value);
        return this;
    }

    /**
     * 设置属性[版本名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psappwfvername__like(String value){
        this.setFieldCond("psappwfvername", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionid__eq(String value){
        this.setFieldCond("pswfversionid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionname__eq(String value){
        this.setFieldCond("pswfversionname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流版本]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter pswfversionname__like(String value){
        this.setFieldCond("pswfversionname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流标识]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFVerFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
