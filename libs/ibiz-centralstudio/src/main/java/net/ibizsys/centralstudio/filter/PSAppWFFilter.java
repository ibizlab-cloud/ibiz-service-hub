package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPWF 过滤器对象
 */
public class PSAppWFFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppWFFilter(){
    
    }      

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmoduleid__eq(String value){
        this.setFieldCond("psappmoduleid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmodulename__eq(String value){
        this.setFieldCond("psappmodulename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[应用模块]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappmodulename__like(String value){
        this.setFieldCond("psappmodulename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[应用工作流名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psappwfname__like(String value){
        this.setFieldCond("psappwfname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowid__eq(String value){
        this.setFieldCond("psworkflowid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowname__eq(String value){
        this.setFieldCond("psworkflowname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[工作流]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter psworkflowname__like(String value){
        this.setFieldCond("psworkflowname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppWFFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
