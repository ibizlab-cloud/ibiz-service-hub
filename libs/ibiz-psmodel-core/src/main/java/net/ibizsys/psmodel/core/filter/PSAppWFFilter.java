package net.ibizsys.psmodel.core.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPWF 过滤器对象
 */
public class PSAppWFFilter extends net.ibizsys.psmodel.core.util.PSModelFilterBase {

    public PSAppWFFilter(){
    
    }      

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmoduleid__eq(String value){
        this.setFieldCond("psappmoduleid", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用工作流名称]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappwfname__eq(String value){
        this.setFieldCond("psappwfname", EQ, value);
        return this;
    }

    /**
     * 设置属性[应用工作流名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappwfname__like(String value){
        this.setFieldCond("psappwfname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usercat__eq(String value){
        this.setFieldCond("usercat", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usertag__eq(String value){
        this.setFieldCond("usertag", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记2]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usertag2__eq(String value){
        this.setFieldCond("usertag2", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记3]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usertag3__eq(String value){
        this.setFieldCond("usertag3", EQ, value);
        return this;
    }

    /**
     * 设置属性[用户标记4]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usertag4__eq(String value){
        this.setFieldCond("usertag4", EQ, value);
        return this;
    }

}
