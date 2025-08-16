package net.ibizsys.centralstudio.filter;

import java.sql.Timestamp;
import net.ibizsys.centralstudio.util.Conditions;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 模型 PSAPPLAN 过滤器对象
 */
public class PSAppLanFilter extends net.ibizsys.centralstudio.util.PSModelSearchContextDTO {

    public PSAppLanFilter(){
    
    }      

    /**
     * 设置属性[应用多语言名称]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter psapplanname__like(String value){
        this.setFieldCond("psapplanname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguageid__eq(String value){
        this.setFieldCond("pslanguageid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguagename__eq(String value){
        this.setFieldCond("pslanguagename", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[语言]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pslanguagename__like(String value){
        this.setFieldCond("pslanguagename", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[系统应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappid__eq(String value){
        this.setFieldCond("pssysappid", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappname__eq(String value){
        this.setFieldCond("pssysappname", Conditions.EQ, value);
        return this;
    }

    /**
     * 设置属性[前端应用]过滤操作[LIKE]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter pssysappname__like(String value){
        this.setFieldCond("pssysappname", Conditions.LIKE, value);
        return this;
    }

    /**
     * 设置属性[用户分类]过滤操作[EQ]
     * @param value
     * @return
     */
    @JsonIgnore
    public PSAppLanFilter usercat__eq(String value){
        this.setFieldCond("usercat", Conditions.EQ, value);
        return this;
    }

}
